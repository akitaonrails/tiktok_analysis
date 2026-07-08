package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: renamed from: X.11tz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19647711tz {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final UrlModel LJI;
    public final String LJII;
    public final float LJIIIIZZ;
    public final String LJIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C19647711tz() {
        this(null, 0 == true ? 1 : 0, 0.0f, 0 == true ? 1 : 0, 1023);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C19647711tz(UrlModel urlModel, String str, float f, String str2, int i) {
        float f2;
        float f3 = f;
        String str3 = str;
        UrlModel urlModel2 = urlModel;
        if ((i & 16) != 0) {
            f2 = 0.5f;
        } else {
            f2 = 0.0f;
        }
        this(false, false, false, false, f2, (i & 32) != 0 ? 0.3f : 0.0f, (i & 64) != 0 ? null : urlModel2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? 15.0f : f3, (i & 512) == 0 ? str2 : "");
    }

    public static C19647711tz LIZ(C19647711tz c19647711tz, boolean z, boolean z2, boolean z3, boolean z4, float f, int i) {
        float f2;
        UrlModel urlModel;
        String str;
        boolean z5 = z4;
        float f3 = f;
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z;
        if ((i & 1) != 0) {
            z8 = c19647711tz.LIZ;
        }
        if ((i & 2) != 0) {
            z7 = c19647711tz.LIZIZ;
        }
        if ((i & 4) != 0) {
            z6 = c19647711tz.LIZJ;
        }
        if ((i & 8) != 0) {
            z5 = c19647711tz.LIZLLL;
        }
        float f4 = 0.0f;
        if ((i & 16) != 0) {
            f2 = c19647711tz.LJ;
        } else {
            f2 = 0.0f;
        }
        if ((i & 32) != 0) {
            f3 = c19647711tz.LJFF;
        }
        String str2 = null;
        if ((i & 64) != 0) {
            urlModel = c19647711tz.LJI;
        } else {
            urlModel = null;
        }
        if ((i & 128) != 0) {
            str = c19647711tz.LJII;
        } else {
            str = null;
        }
        if ((i & 256) != 0) {
            f4 = c19647711tz.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            str2 = c19647711tz.LJIIIZ;
        }
        c19647711tz.getClass();
        return new C19647711tz(z8, z7, z6, z5, f2, f3, urlModel, str, f4, str2);
    }

    public C19647711tz(boolean z, boolean z2, boolean z3, boolean z4, float f, float f2, UrlModel urlModel, String str, float f3, String str2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = f;
        this.LJFF = f2;
        this.LJI = urlModel;
        this.LJII = str;
        this.LJIIIIZZ = f3;
        this.LJIIIZ = str2;
    }
}
