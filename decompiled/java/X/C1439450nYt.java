package X;

import com.ss.android.ugc.aweme.publish.publishcheck.CheckManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439450nYt extends AbstractC2255721DQs<InterfaceC1460690o79> implements InterfaceC1460690o79, InterfaceC379610EuV {
    public static final C1439540nZ2 LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public final InterfaceC1460690o79 LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1444410ngt.class, null);
    public boolean LLIZ;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0nZ2] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1439450nYt.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1439450nYt.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0), new C2217381BqS(C1439450nYt.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C1439450nYt.class, "privacySettingApi", "getPrivacySettingApi()Lcom/ss/android/ugc/aweme/shortvideo/privacy/PrivacySettingApi;", 0)};
        LLIZLLLIL = new Object() { // from class: X.0nZ2
        };
        LLJI = 8;
    }

    private final void G2() {
        C857230Xk1 c857230Xk1LIZIZ = CheckManager.LIZIZ(this, "quick publish checker");
        c857230Xk1LIZIZ.LIZ(new C856180XiK(o2().requireActivity()));
        c857230Xk1LIZIZ.LIZ(new C857290Xk7(getActivity(), X1()));
        InterfaceC1444410ngt interfaceC1444410ngtZ1 = Z1();
        c857230Xk1LIZIZ.LIZ(interfaceC1444410ngtZ1 != null ? interfaceC1444410ngtZ1.ZJ(new AwS566S0100000_22(this, 604), false, true) : null);
        c857230Xk1LIZIZ.LIZ(new C1437590nVt(X1()));
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 605);
        if (c857230Xk1LIZIZ.LJIIJJI == EnumC864300XvQ.NEW) {
            c857230Xk1LIZIZ.LJIILIIL = awS566S0100000_22;
        }
        c857230Xk1LIZIZ.LJFF();
    }

    private final InterfaceC1444410ngt Z1() {
        return (InterfaceC1444410ngt) this.LLILZLL.getValue(this, LLJ[3]);
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLILLL.getValue(this, LLJ[0]);
    }

    public final VideoPublishEditModel X1() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJ[2]);
    }

    public final AbstractC214814194y o2() {
        return (AbstractC214814194y) this.LLILZ.getValue(this, LLJ[1]);
    }

    public final void w2() {
        C557270LtN.LIZ(C0CHQ.LIZ().getPublishService().LJJJLL(), getActivity(), X1(), 0, false, false, null, o2().mArguments, null, 188);
        C1438840nXu c1438840nXu = C1438840nXu.LIZ;
        C1438990nY9 c1438990nY9 = new C1438990nY9(getActivity(), X1(), new AwS566S0100000_22(this, 602), new AwS566S0100000_22(this, 603));
        c1438840nXu.getClass();
        C1438840nXu.LIZ(c1438990nY9);
    }

    @Override // X.InterfaceC1460690o79
    public void RI2() {
        G2();
    }

    public InterfaceC1460690o79 W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1439450nYt(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
