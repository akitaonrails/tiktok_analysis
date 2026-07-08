package X;

import Y.AObjectS246S0100000_25;
import Y.AfS194S0100000_25;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import mn3.e0;

/* JADX INFO: renamed from: X.0t8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653790t8b extends AbstractC2255721DQs<InterfaceC1650150t2j> implements InterfaceC379610EuV, InterfaceC1650150t2j {
    public static final C1654000t8w LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1653800t8c.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1653810t8d.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1653820t8e.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final C1653210t7f LLIZ = new C1653210t7f(0);
    public final Keva LLIZLLLIL = Keva.getRepo("repo_story_show_guide_hint");
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(204));

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0t8w] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1653790t8b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1653790t8b.class, "shootModeSwitchApiComponent", "getShootModeSwitchApiComponent()Lcom/ss/android/ugc/aweme/social/creation/record/bottom/ShootModeSwitchApiComponent;", 0), new C2217381BqS(C1653790t8b.class, "shootTopTabApiComponent", "getShootTopTabApiComponent()Lcom/ss/android/ugc/aweme/social/creation/record/bottom/ShootTopTabApiComponent;", 0), new C2217381BqS(C1653790t8b.class, "shootBottomTabApiComponent", "getShootBottomTabApiComponent()Lcom/ss/android/ugc/aweme/social/creation/record/bottom/ShootBottomTabApiComponent;", 0), new C2217381BqS(C1653790t8b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0)};
        LLJI = new Object() { // from class: X.0t8w
        };
        LLJILJIL = 8;
    }

    public InterfaceC1650150t2j X1() {
        return this;
    }

    public final void onStartRecord() {
        hr2(false, false);
        wu0(false);
        ShortVideoContext shortVideoContext = getShortVideoContext();
        int i = shortVideoContext.shootedShootMode;
        int i2 = shortVideoContext.shootMode;
        if (i != i2) {
            shortVideoContext.shootedShootMode = i2;
            C1439190nYT.LJIIIZ(i2);
        }
    }

    private final void H2() {
        if (getDiContainer().LIZJ(InterfaceC1648570t0B.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1648570t0B.class, new AwS604S0100000_25(this, 268));
        }
    }

    private final e0 getCameraApiComponent() {
        return (e0) this.LLILZLL.getValue(this, LLJIJIL[4]);
    }

    private final InterfaceC1653800t8c w2() {
        return (InterfaceC1653800t8c) this.LLILLL.getValue(this, LLJIJIL[1]);
    }

    public final InterfaceC1653810t8d G2() {
        return (InterfaceC1653810t8d) this.LLILZ.getValue(this, LLJIJIL[2]);
    }

    public final C1654270t9N Z1() {
        return (C1654270t9N) this.LLJ.getValue();
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLJJLI.getValue(this, LLJIJIL[0]);
    }

    public final InterfaceC1653820t8e o2() {
        return (InterfaceC1653820t8e) this.LLILZIL.getValue(this, LLJIJIL[3]);
    }

    private final void T2() {
        InterfaceC1653810t8d interfaceC1653810t8dG2;
        EnumC1653870t8j enumC1653870t8jLLLLLJIL = w2().LLLLLJIL();
        InterfaceC1653810t8d interfaceC1653810t8dG22 = G2();
        if (interfaceC1653810t8dG22 != null && interfaceC1653810t8dG22.qc2(enumC1653870t8jLLLLLJIL) && (interfaceC1653810t8dG2 = G2()) != null) {
            interfaceC1653810t8dG2.mG1(enumC1653870t8jLLLLLJIL, 0);
        }
        EnumC1653890t8l enumC1653890t8lTP0 = w2().TP0();
        if (o2().um1(enumC1653890t8lTP0)) {
            o2().pX0(enumC1653890t8lTP0, 0);
        }
    }

    private final void W1() {
        if (((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI() && getDiContainer().LIZJ(InterfaceC1648510t05.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1648510t05.class, new AwS604S0100000_25(this, 266));
        }
    }

    private final void Xi() {
        w2().kO1().LIZ(this, new AObjectS246S0100000_25(this, 232));
        w2().OH().LJJLJLI(new AfS194S0100000_25(this, 39));
        if (getDiContainer().LIZJ(InterfaceC1648570t0B.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1648570t0B.class, new AwS604S0100000_25(this, 267));
        }
        getCameraApiComponent().Dm2().LIZ(this, new AObjectS246S0100000_25(this, 238));
        w2().sY0().LJJLJLI(new AfS194S0100000_25(this, 40));
    }

    @Override // X.InterfaceC1650150t2j
    public EnumC1653870t8j LLLLLJIL() {
        EnumC1653870t8j enumC1653870t8jLLLLLJIL;
        InterfaceC1653810t8d interfaceC1653810t8dG2 = G2();
        return (interfaceC1653810t8dG2 == null || (enumC1653870t8jLLLLLJIL = interfaceC1653810t8dG2.LLLLLJIL()) == null) ? EnumC1653870t8j.STORY : enumC1653870t8jLLLLLJIL;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        T2();
        Xi();
        W1();
        H2();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1653790t8b(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1650150t2j
    public void updateDotVisibility(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1650150t2j
    public void wu0(boolean z) {
        InterfaceC1653810t8d interfaceC1653810t8dG2 = G2();
        if (interfaceC1653810t8dG2 != null) {
            interfaceC1653810t8dG2.Vv0(z);
        }
    }

    @Override // X.InterfaceC1650150t2j
    public void hr2(boolean z, boolean z2) {
        o2().aV1(z, z2);
    }
}
