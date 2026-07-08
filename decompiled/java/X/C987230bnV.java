package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987230bnV implements InterfaceC1143790fs1 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1143790fs1
    public final void onFinish(boolean z) {
        switch (this.$t) {
            case 0:
                onFinish$0(this, z);
                break;
            case 1:
                onFinish$1(this, z);
                break;
            case 2:
                onFinish$2(this, z);
                break;
        }
    }

    public C987230bnV(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFinish$0(C987230bnV c987230bnV, boolean z) {
        if (z) {
            ((C421620Gg4) c987230bnV.l0).playAnimation();
        }
    }

    public static final void onFinish$1(C987230bnV c987230bnV, boolean z) {
        if (!z) {
            C978500bZQ.LIZIZ("match_in_progress");
            ((C978020bYe) c987230bnV.l0).LJIILIIL();
        }
        C970290bMB c970290bMB = C970290bMB.LIZ;
        C970290bMB.LJJIJ(EnumC970300bMC.START_ANIMATION, z);
    }

    public static final void onFinish$2(C987230bnV c987230bnV, boolean z) {
        if (!z) {
            C20441214yg.LIZIZ("LetsDanceBackgroundEffectManager", "loadLetsDanceAnimationRes, load repeat lottie fail");
            ((Function1) c987230bnV.l0).invoke(Boolean.FALSE);
        }
    }
}
