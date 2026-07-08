package X;

import com.ss.android.ugc.aweme.editpost.ClientText;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1630, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1630 extends AnonymousClass1635<C207111162r, C0S5R> implements InterfaceC585880MyQ {
    public final boolean LJIIJ;
    public final AnonymousClass1630 LJIIJJI;

    @Override // X.AnonymousClass1637
    public final C164G LIZJ() {
        return new C0S5R(null, null, false, null);
    }

    @Override // X.AnonymousClass1637
    public final boolean LIZLLL() {
        return this.LJIIJ;
    }

    @Override // X.AnonymousClass1635
    public final InterfaceC585880MyQ LJI() {
        return this.LJIIJJI;
    }

    public AnonymousClass1630(C207111162r c207111162r) {
        super(c207111162r, new C1055510dZd());
        this.LJIIJ = true;
        this.LJIIJJI = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC585880MyQ
    public final void LIZ(String str) {
        Aweme aweme = (Aweme) this.LIZLLL;
        String aid = null;
        if (aweme != null) {
            aid = aweme.getAid();
        }
        if (!Intrinsics.LJFF(str, aid)) {
            return;
        }
        LJ(this.LJFF, EnumC715680S5m.NOT_OVERWRITTEN);
    }

    @Override // X.AnonymousClass1635
    public final void LJIIIIZZ(String str) {
        super.LJIIIIZZ(str);
        if (!C161T.LIZ().LIZ() && ((C0S5R) this.LJI.getValue()).LIZJ) {
            LJ(this.LJFF, EnumC715680S5m.NOT_OVERWRITTEN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AnonymousClass1637
    public final C164G LIZIZ(C0S5Q c0s5q, C0S5Q c0s5q2, Aweme aweme, EnumC715680S5m enumC715680S5m) {
        Aweme aweme2;
        C0S5P c0s5p = (C0S5P) c0s5q;
        C0S5P c0s5p2 = (C0S5P) c0s5q2;
        Aweme aweme3 = aweme;
        C0SKK c0skk = null;
        if (aweme3 != null) {
            int i = C0SBH.LIZ[c0s5p.LIZ.ordinal()];
            boolean z = true;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        AnonymousClass1641 anonymousClass1641 = new AnonymousClass1641(true, aweme3.getAid());
                        C207111162r.LJIIL(aweme3, anonymousClass1641);
                        boolean z2 = anonymousClass1641.LJ;
                        ClientText clientText = anonymousClass1641.LIZJ;
                        String str = anonymousClass1641.LIZLLL;
                        C0S5R c0s5r = new C0S5R(clientText, str, z2, anonymousClass1641.LIZIZ);
                        if (str != null || clientText != null) {
                            return c0s5r;
                        }
                    } else {
                        throw new C1954807lC();
                    }
                }
            } else {
                if (c0s5p2 != null) {
                    c0skk = c0s5p2.LIZ;
                }
                if (!C0SKF.LIZLLL(this.LJ) || c0skk == C0SKK.TRANSLATED || ((aweme2 = (Aweme) this.LIZLLL) != null && AwemeExtKt.isPhotoMode(aweme2))) {
                    z = false;
                }
                AnonymousClass1641 anonymousClass16412 = new AnonymousClass1641(z, aweme3.getAid());
                C207111162r.LJIIL(aweme3, anonymousClass16412);
                return new C0S5R(anonymousClass16412.LIZJ, anonymousClass16412.LIZLLL, anonymousClass16412.LJ, anonymousClass16412.LIZIZ);
            }
        }
        return null;
    }
}
