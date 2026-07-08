package X;

import Y.AObjectS246S0100000_25;
import Y.ARunnableS94S0200000_25;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0tAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1655260tAy extends AbstractC2255721DQs<C05YF> implements C05YF, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final int LLJILLL;
    public final C1DRG LL;
    public int LLJI;
    public boolean LLJIJIL;
    public final C05YF LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), C21378018lO.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), C564140MAq.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C1453870nw9.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final SafeHandler LLJ = new SafeHandler(this);
    public final C1655270tAz LLJILJIL = new InterfaceC2253001DGg() { // from class: X.0tAz
        @Override // X.InterfaceC2253001DGg
        public final void LIZ(C2253021DGi c2253021DGi) {
            boolean z;
            if (c2253021DGi.LIZIZ.LIZ == 2) {
                z = true;
            } else {
                z = false;
            }
            C1655260tAy c1655260tAy = this.LIZ;
            if (z != c1655260tAy.LLJIJIL) {
                c1655260tAy.LLJIJIL = z;
                c1655260tAy.T2(z);
            }
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1655260tAy.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1655260tAy.class, "taskScheduler", "getTaskScheduler()Lcom/ss/android/ugc/aweme/creative/taskscheduler/scheduler/TaskScheduler;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1655260tAy.class, "preloadTaskManager", "getPreloadTaskManager()Lcom/ss/android/ugc/aweme/shortvideo/ui/RecordPreloadTaskManager;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1655260tAy.class, "recordStateDispatch", "getRecordStateDispatch()Lcom/ss/android/ugc/aweme/shortvideo/util/performance/ScreenStateDispatch;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1655260tAy.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1655260tAy.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJILLL = 8;
    }

    private final C1453870nw9<EnumC1641390sob> Z1() {
        return (C1453870nw9) this.LLILZLL.getValue(this, LLJILJILJ[3]);
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILLL.getValue(this, LLJILJILJ[0]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLIZLLLIL.getValue(this, LLJILJILJ[5]);
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLIZ.getValue(this, LLJILJILJ[4]);
    }

    public final boolean W1() {
        return ((Boolean) C268040Aew.LIZ.getValue()).booleanValue();
    }

    public final C564140MAq X1() {
        return (C564140MAq) this.LLILZIL.getValue(this, LLJILJILJ[2]);
    }

    public final C21378018lO o2() {
        return (C21378018lO) this.LLILZ.getValue(this, LLJILJILJ[1]);
    }

    private final void G2() {
        C2253081DGo c2253081DGoIU1 = getCameraApiComponent().IU1();
        ((ArrayList) c2253081DGoIU1.LIZ).add(this.LLJILJIL);
    }

    public final void H2() {
        C385670FAf<InterfaceC1628590sTx> c385670FAfNL1;
        C385670FAf<Boolean> c385670FAfIsRecording;
        InterfaceC1648570t0B recordControlApi = getRecordControlApi();
        if (recordControlApi != null && (c385670FAfIsRecording = recordControlApi.isRecording()) != null) {
            c385670FAfIsRecording.LIZ(this, new AObjectS246S0100000_25(this, 188));
        }
        InterfaceC1647420syK recordAdapterApi = getRecordAdapterApi();
        if (recordAdapterApi != null && (c385670FAfNL1 = recordAdapterApi.NL1()) != null) {
            c385670FAfNL1.LIZ(this, new AObjectS246S0100000_25(this, 189));
        }
        G2();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getCameraApiComponent().A31().LIZ(this, new AObjectS246S0100000_25(this, 191));
        Z1().LIZLLL(EnumC1641390sob.ACTIVITY_ENTER_ANIMATION_END).LIZ(this, new AObjectS246S0100000_25(this, 190));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C2253081DGo c2253081DGoIU1 = getCameraApiComponent().IU1();
        ((ArrayList) c2253081DGoIU1.LIZ).remove(this.LLJILJIL);
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0tAz] */
    public C1655260tAy(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void T2(boolean z) {
        C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pausePreloadTask pause: ");
        sbLIZ.append(z);
        sbLIZ.append(", pausingSubPageCount ");
        sbLIZ.append(this.LLJI);
        C201955140j.LIZJ(c20102213l6, C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            int i = this.LLJI;
            this.LLJI = i + 1;
            if (i == 0) {
                C201955140j.LIZJ(c20102213l6, "pausePreloadTask  taskScheduler?.pause()");
                C21378018lO c21378018lOO2 = o2();
                if (c21378018lOO2 != null) {
                    c21378018lOO2.pause();
                    return;
                }
                return;
            }
            return;
        }
        int i2 = this.LLJI;
        if (i2 <= 0) {
            return;
        }
        int i3 = i2 - 1;
        this.LLJI = i3;
        if (i3 != 0) {
            return;
        }
        C201955140j.LIZJ(c20102213l6, "pausePreloadTask  taskScheduler?.resume()");
        C21378018lO c21378018lOO22 = o2();
        if (c21378018lOO22 == null) {
            return;
        }
        c21378018lOO22.resume();
    }

    public final void w2(C523470Kfx c523470Kfx) {
        long j = C1647240sy2.LIZ().preloadTaskDelayStartMs;
        if (j <= 0) {
            C21378018lO c21378018lOO2 = o2();
            if (c21378018lOO2 != null) {
                c21378018lOO2.bN1(c523470Kfx);
                return;
            }
            return;
        }
        this.LLJ.postDelayed(new ARunnableS94S0200000_25(this, c523470Kfx, 10), j);
    }
}
