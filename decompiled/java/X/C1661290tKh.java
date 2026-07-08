package X;

import Y.AObjectS246S0100000_25;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.spi.INetworkLevelService;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0tKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661290tKh extends AbstractC2255721DQs<InterfaceC577340Mke> implements InterfaceC577340Mke, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C1DRG LL;
    public final h0<Boolean> LLILLJJLI = new h0<>(Boolean.FALSE);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C0MGL.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 313));
    public boolean LLIZ;
    public boolean LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1661290tKh.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1661290tKh.class, "recordController", "getRecordController()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1661290tKh.class, "exitApi", "getExitApi()Lcom/ss/android/ugc/gamora/recorder/exit/ExitApiComponent;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public InterfaceC577340Mke W1() {
        return this;
    }

    private final C0MGL Z1() {
        return (C0MGL) this.LLILZIL.getValue(this, LLJ[2]);
    }

    @Override // X.InterfaceC577340Mke
    public void VD2() {
        C1661180tKW.LIZ.getClass();
        if (C1661180tKW.LIZJ.LIZJ() instanceof C1655250tAx) {
            if (!C298090BmJ.LIZ()) {
                w2("cancel music and download");
                C1661180tKW.LIZ();
            } else {
                w2("cancel music but continue download");
                this.LLILLJJLI.LJII(Boolean.TRUE);
                C1661180tKW.LJ("release listener");
                C1661180tKW.LIZLLL = null;
            }
        }
    }

    public final CreativeLoadingDialog X1() {
        return (CreativeLoadingDialog) this.LLILZLL.getValue();
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLILLL.getValue(this, LLJ[0]);
    }

    public final InterfaceC1648570t0B o2() {
        return (InterfaceC1648570t0B) this.LLILZ.getValue(this, LLJ[1]);
    }

    @Override // X.InterfaceC577340Mke
    public C385670FAf<Boolean> uU() {
        h0<Boolean> h0Var = this.LLILLJJLI;
        h0Var.getClass();
        return h0Var;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C1661180tKW.LIZ.getClass();
        C1661180tKW.LJ = false;
        o2().cJ0().LIZ(this, new AObjectS246S0100000_25(this, 408));
        o2().sb0().LIZ(this, new AObjectS246S0100000_25(this, 409));
        if (C298090BmJ.LIZ()) {
            Z1().sI2().LIZ(this, new AObjectS246S0100000_25(this, 410));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        C1411240mpO nqeNetworkLevel;
        super.onResume();
        if (this.LLIZ) {
            w2("has shown, not block");
            return;
        }
        this.LLIZ = true;
        C1661180tKW.LIZ.getClass();
        h0<AbstractC1652550t6b> h0Var = C1661180tKW.LIZJ;
        if (!(h0Var.LIZJ() instanceof C1655250tAx)) {
            w2("music not loading, not block");
            return;
        }
        INetworkLevelService iNetworkLevelService = (INetworkLevelService) PluggableExtentionKt.pluggableSpi$default(INetworkLevelService.class, false, false, false, 14, null);
        EnumC1661320tKk enumC1661320tKk = (iNetworkLevelService == null || (nqeNetworkLevel = iNetworkLevelService.getNqeNetworkLevel()) == null) ? null : nqeNetworkLevel.LIZ;
        if (!C13LP.LJJJJ(enumC1661320tKk, C13LQ.LJLIIL(new EnumC1661320tKk[]{EnumC1661320tKk.FAKE, EnumC1661320tKk.OFFLINE})) && (!C13LP.LJJJJ(enumC1661320tKk, C13LQ.LJLIIL(new EnumC1661320tKk[]{EnumC1661320tKk.UNDEFINED, EnumC1661320tKk.UNKNOWN})) || (C0XF5.LIZIZ() && C036E.LIZ.LIZJ == C0O0L.AVAILABLE))) {
            CreativeLoadingDialog creativeLoadingDialogX1 = X1();
            if (creativeLoadingDialogX1 != null) {
                creativeLoadingDialogX1.show();
            }
            h0Var.LIZ(this, new AObjectS246S0100000_25(this, 411));
            return;
        }
        w2("net not available, not block");
        C1389890mGx c1389890mGx = new C1389890mGx(getActivity());
        c1389890mGx.LJIIIZ(2131837962);
        c1389890mGx.LJIIJJI();
        VD2();
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        if (!C298090BmJ.LIZ() || !this.LLIZLLLIL) {
            C1661180tKW.LIZ.getClass();
            C1661180tKW.LIZ();
        } else {
            C1661180tKW.LIZ.getClass();
            C1661180tKW.LJ("release listener");
            C1661180tKW.LIZLLL = null;
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1661290tKh(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void w2(String str) {
        C201955140j.LIZLLL(C201962140q.LIZIZ, "waitMusicLoading", str);
    }
}
