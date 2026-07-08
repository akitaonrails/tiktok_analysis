package X;

import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadEntry;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08Wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2131808Wu extends AbstractC2132008Ww {
    public final C2131708Wt LIZ;
    public final String LIZIZ;
    public final ECPreloadEntry LIZJ;
    public final InterfaceC2132308Wz LIZLLL;
    public final String LJ;
    public String LJI;
    public final int LJIIJJI;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1664));
    public long LJII = -1;
    public long LJIIIIZZ = -1;
    public long LJIIIZ = -1;
    public long LJIIJ = -1;

    @Override // X.AbstractC2132008Ww
    public final void LIZ() {
        for (InterfaceC420801kM interfaceC420801kM : (List) this.LJFF.getValue()) {
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        r1 = 30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.08Wv] */
    @Override // X.AbstractC2132008Ww
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2131808Wu.LIZIZ():void");
    }

    @Override // X.AbstractC2132008Ww
    public final C2130508Wh LJIIIIZZ() {
        String str = this.LIZIZ;
        ECPreloadEntry eCPreloadEntry = this.LIZJ;
        return new C2130508Wh(str, eCPreloadEntry.pageName, eCPreloadEntry.entryId, eCPreloadEntry.type, this.LIZ.LIZ);
    }

    @Override // X.AbstractC2132008Ww
    public final long LIZJ() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC2132008Ww
    public final String LIZLLL() {
        return this.LJ;
    }

    @Override // X.AbstractC2132008Ww
    public final long LJ() {
        return this.LJIIJ;
    }

    @Override // X.AbstractC2132008Ww
    public final ECPreloadEntry LJFF() {
        return this.LIZJ;
    }

    @Override // X.AbstractC2132008Ww
    public final long LJI() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC2132008Ww
    public final int LJII() {
        return this.LJIIJJI;
    }

    @Override // X.AbstractC2132008Ww
    public final String LJIIIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC2132008Ww
    public final long LJIIJ() {
        return this.LJII;
    }

    @Override // X.AbstractC2132008Ww
    public final void LJIIJJI(long j) {
        this.LJIIIZ = j;
    }

    @Override // X.AbstractC2132008Ww
    public final void LJIIL(long j) {
        this.LJIIJ = j;
    }

    public C2131808Wu(C2131708Wt c2131708Wt, String str, ECPreloadEntry eCPreloadEntry, C2130908Wl c2130908Wl, String str2) {
        this.LIZ = c2131708Wt;
        this.LIZIZ = str;
        this.LIZJ = eCPreloadEntry;
        this.LIZLLL = c2130908Wl;
        this.LJ = str2;
        this.LJIIJJI = c2131708Wt.LIZ.size();
    }
}
