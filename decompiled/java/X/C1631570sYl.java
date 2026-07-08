package X;

import Y.AObjectS246S0100000_25;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631570sYl extends C1663100tNc {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public static final int LLLFF;
    public final InterfaceC1731706qJ LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1631570sYl.class, "shootModeSwitchApiComponent", "getShootModeSwitchApiComponent()Lcom/ss/android/ugc/aweme/social/creation/record/bottom/ShootModeSwitchApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1631570sYl.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1631570sYl.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLLFF = 8;
    }

    private final InterfaceC1653800t8c e4() {
        return (InterfaceC1653800t8c) this.LLJZ.getValue(this, LLLF[0]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJZIJLIL.getValue(this, LLLF[1]);
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLL.getValue(this, LLLF[2]);
    }

    @Override // X.C1663100tNc, com.bytedance.creativex.recorder.beauty.q, X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC1647420syK recordAdapterApi;
        InterfaceC1653800t8c interfaceC1653800t8cE4;
        C385670FAf<C1647390syH> bottomTabIndexChangeEvent;
        super.onCreate();
        if (this.LLJJIJI.LJJ && (interfaceC1653800t8cE4 = e4()) != null && (bottomTabIndexChangeEvent = interfaceC1653800t8cE4.getBottomTabIndexChangeEvent()) != null) {
            bottomTabIndexChangeEvent.LIZ(this, new AObjectS246S0100000_25(this, 259));
        }
        if (!this.LLJJIJI.LJIILLIIL || (recordAdapterApi = getRecordAdapterApi()) == null) {
            return;
        }
        recordAdapterApi.oe2(this);
    }

    public C1631570sYl(C1DRG c1drg, Function0<? extends InterfaceC1635390sev> function0, Function1<? super Boolean, String> function1, Function1<? super C12IL, Unit> function12) {
        super(c1drg, function0, function1, function12);
        this.LLJZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1653800t8c.class, null);
        this.LLJZIJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.LLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    }
}
