package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12gf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19819912gf {
    public final String LIZ;
    public final Uri LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final InterfaceC19882712qn<Context, Boolean> LJIIIIZZ;

    public final C19819912gf LIZJ() {
        return new C19819912gf(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, true, this.LJII, this.LJIIIIZZ);
    }

    public final C19819912gf LJ() {
        if (!this.LIZJ.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        InterfaceC19882712qn<Context, Boolean> interfaceC19882712qn = this.LJIIIIZZ;
        if (interfaceC19882712qn == null) {
            return new C19819912gf(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, true, this.LJFF, this.LJI, this.LJII, interfaceC19882712qn);
        }
        throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }

    public C19819912gf(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12ge] */
    public final C19819812ge LIZ(long j, final String str) {
        final Long lValueOf = Long.valueOf(j);
        return new AbstractC19833712it<Long>(this, str, lValueOf) { // from class: X.12ge
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC19833712it
            public final Long LIZJ(Object obj) {
                if (!(obj instanceof Long)) {
                    if (obj instanceof String) {
                        try {
                            return Long.valueOf(CastLongProtector.parseLong((String) obj));
                        } catch (NumberFormatException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    return null;
                }
                return obj;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12gg] */
    public final C19820012gg LIZIZ(final String str, boolean z) {
        final Boolean boolValueOf = Boolean.valueOf(z);
        return new AbstractC19833712it<Boolean>(this, str, boolValueOf) { // from class: X.12gg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC19833712it
            public final /* synthetic */ Boolean LIZJ(Object obj) {
                if (obj instanceof Boolean) {
                    return obj;
                }
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (C19823412hE.LIZJ.matcher(str2).matches()) {
                        return Boolean.TRUE;
                    }
                    if (C19823412hE.LIZLLL.matcher(str2).matches()) {
                        return Boolean.FALSE;
                    }
                    return null;
                }
                return null;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12hQ] */
    public final C19824612hQ LIZLLL(final String str, final String str2) {
        return new AbstractC19833712it<String>(this, str, str2) { // from class: X.12hQ
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC19833712it
            public final /* synthetic */ String LIZJ(Object obj) {
                if (obj instanceof String) {
                    return obj;
                }
                return null;
            }
        };
    }

    public C19819912gf(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC19882712qn<Context, Boolean> interfaceC19882712qn) {
        this.LIZ = str;
        this.LIZIZ = uri;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = z4;
        this.LJIIIIZZ = interfaceC19882712qn;
    }
}
