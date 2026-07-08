package X;

import android.os.Bundle;
import com.bytedance.tux.system.TuxImmersionBar;

/* JADX INFO: renamed from: X.0Kjh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525790Kjh extends AbstractC2255721DQs<C05YF> implements InterfaceC379610EuV, C05YF {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), Bundle.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final C05YF LLILZ = this;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C525790Kjh.class, "arguments", "getArguments()Landroid/os/Bundle;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C525790Kjh.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    private final Bundle W1() {
        return (Bundle) this.LLILLJJLI.getValue(this, LLILZIL[0]);
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLILLL.getValue(this, LLILZIL[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        if (W1().getBoolean("creative_saa_window_translucent")) {
            boolean zLIZIZ = C960203pA.LIZIZ(getActivity());
            TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ(getActivity());
            tuxImmersionBarLJ.LIZ(false);
            tuxImmersionBarLJ.LIZIZ.LJIIL();
            tuxImmersionBarLJ.LIZIZ.LJIIJ(false);
            tuxImmersionBarLJ.LIZIZ.LJII(!zLIZIZ);
            tuxImmersionBarLJ.LIZJ(false, false);
            tuxImmersionBarLJ.LIZLLL();
        }
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C525790Kjh(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
