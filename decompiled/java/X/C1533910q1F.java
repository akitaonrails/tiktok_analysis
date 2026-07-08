package X;

import android.os.SystemClock;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;

/* JADX INFO: renamed from: X.0q1F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533910q1F {
    public final RequestParams LIZ;
    public final String LIZIZ;
    public final Forest LIZJ;
    public InterfaceC1534830q2j LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C1533900q1E LJI;
    public final boolean LJII;
    public volatile EnumC1534440q26 LJIIIIZZ;
    public C1533970q1L LJIIIZ;

    public final void LIZ() {
        EnumC1534440q26 enumC1534440q26 = this.LJIIIIZZ;
        EnumC1534440q26 enumC1534440q262 = EnumC1534440q26.CANCELED;
        if (enumC1534440q26 == enumC1534440q262) {
            return;
        }
        C1533970q1L c1533970q1L = this.LJIIIZ;
        if (c1533970q1L != null) {
            if (c1533970q1L.LIZ()) {
                this.LJIIIIZZ = enumC1534440q262;
            }
        } else if (this.LJIIIIZZ.ordinal() <= EnumC1534440q26.PROCESSING.ordinal()) {
            this.LJIIIIZZ = enumC1534440q262;
            InterfaceC1534830q2j interfaceC1534830q2j = this.LIZLLL;
            if (interfaceC1534830q2j != null) {
                interfaceC1534830q2j.cancel();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1533790q13 LIZIZ() {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1533910q1F.LIZIZ():X.0q13");
    }

    public final void LIZJ() {
        if (this.LJIIIIZZ == EnumC1534440q26.FETCHING) {
            this.LJIIIIZZ = EnumC1534440q26.PROCESSING;
            SystemClock.elapsedRealtime();
        }
    }

    public C1533910q1F(RequestParams requestParams, String str, Forest forest, InterfaceC1534830q2j interfaceC1534830q2j, EnumC1534440q26 enumC1534440q26, boolean z, boolean z2, C1533900q1E c1533900q1E, boolean z3, int i) {
        interfaceC1534830q2j = (i & 8) != 0 ? null : interfaceC1534830q2j;
        enumC1534440q26 = (i & 16) != 0 ? EnumC1534440q26.PENDING : enumC1534440q26;
        z = (i & 32) != 0 ? false : z;
        z2 = (i & 64) != 0 ? false : z2;
        c1533900q1E = (i & 128) != 0 ? null : c1533900q1E;
        z3 = (i & 256) != 0 ? false : z3;
        this.LIZ = requestParams;
        this.LIZIZ = str;
        this.LIZJ = forest;
        this.LIZLLL = interfaceC1534830q2j;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = c1533900q1E;
        this.LJII = z3;
        this.LJIIIIZZ = enumC1534440q26;
    }
}
