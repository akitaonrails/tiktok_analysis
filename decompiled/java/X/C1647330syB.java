package X;

import Y.AObjectS246S0100000_25;

/* JADX INFO: renamed from: X.0syB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647330syB extends AbstractC2255721DQs<C05YF> implements C05YF, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final C05YF LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C1453870nw9.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), C21378018lO.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), C564100MAm.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1647330syB.class, "screenStateDispatch", "getScreenStateDispatch()Lcom/ss/android/ugc/aweme/shortvideo/util/performance/ScreenStateDispatch;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1647330syB.class, "taskScheduler", "getTaskScheduler()Lcom/ss/android/ugc/aweme/creative/taskscheduler/scheduler/TaskScheduler;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1647330syB.class, "preloadTaskManager", "getPreloadTaskManager()Lcom/ss/android/ugc/aweme/shortvideo/ui/LightRecordPreloadTaskManager;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLIZ = 8;
    }

    private final C1453870nw9<EnumC1641390sob> X1() {
        return (C1453870nw9) this.LLILLL.getValue(this, LLILZLL[0]);
    }

    public final C564100MAm W1() {
        return (C564100MAm) this.LLILZIL.getValue(this, LLILZLL[2]);
    }

    public final C21378018lO Z1() {
        return (C21378018lO) this.LLILZ.getValue(this, LLILZLL[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        X1().LIZLLL(EnumC1641390sob.ACTIVITY_ENTER_ANIMATION_END).LIZ(this, new AObjectS246S0100000_25(this, 194));
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1647330syB(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
