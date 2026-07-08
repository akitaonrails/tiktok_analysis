package X;

import Y.AObjectS185S0300000_25;
import Y.AObjectS246S0100000_25;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.svc.SVCTask;
import com.ss.android.vesdk.VEAudioCapture;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tK8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660940tK8 extends AbstractC2255721DQs<InterfaceC1410040mnS> implements InterfaceC1410040mnS, InterfaceC379610EuV {
    public static final C1660980tKC LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final int LLJILLL;
    public final C1DRG LL;
    public final InterfaceC1410040mnS LLILLJJLI = this;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(328));
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650930t3z.class, null);
    public C11NJ LLIZLLLIL = new C11NJ();
    public final List<SVCTask> LLJ;
    public SVCTask LLJI;
    public final C2218171Brj LLJIJIL;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0tKC] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1660940tK8.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1660940tK8.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C1660940tK8.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C2217381BqS(C1660940tK8.class, "svcBottomAndPanelApiComponent", "getSvcBottomAndPanelApiComponent()Lcom/ss/android/ugc/gamora/recorder/voicechange/slideslip/SVCBottomAndPanelApiComponent;", 0)};
        LLJILJIL = new Object() { // from class: X.0tKC
        };
        LLJILLL = 8;
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZLL.getValue(this, LLJILJILJ[2]);
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILZIL.getValue(this, LLJILJILJ[1]);
    }

    public final InterfaceC1650930t3z Cp() {
        return (InterfaceC1650930t3z) this.LLIZ.getValue(this, LLJILJILJ[3]);
    }

    public final C560530Lyd<Boolean> Z1() {
        return (C560530Lyd) this.LLILLL.getValue();
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZ.getValue(this, LLJILJILJ[0]);
    }

    @Override // X.InterfaceC1410040mnS
    public LiveEvent<Boolean> Go() {
        return Z1();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C1DRG diContainer = getDiContainer();
        if (C343070Dcf.LIZ()) {
            ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(InterfaceC1650930t3z.class, new AwS604S0100000_25(this, 410));
        } else {
            C05YF c05yf = (C05YF) diContainer.LJIIL(null, InterfaceC1650930t3z.class);
            if (c05yf != null) {
                ((InterfaceC1650930t3z) c05yf).Go().LIZ(this, new AObjectS246S0100000_25(this, 645));
            }
        }
        VEAudioCapture vEAudioCaptureLJ = getCameraApiComponent().St2().oh().getAudioController().LJ();
        C259800zU c259800zU = new C259800zU();
        getRecordControlApi().yM2().LIZ(this, new InterfaceC1441305kZ() { // from class: X.0tKB
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (obj != null) {
                    C1663800tOk.LIZIZ(obj);
                }
            }
        });
        this.LLIZLLLIL.LIZ(getRecordControlApi().uM2().LJJLJLI(new C09JN() { // from class: X.0tK9
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("RecordSVCLogicComponent@35bb.onCreate$3");
                C1C7U.LIZIZ("RecordSVCLogicComponent@35bb.onCreate$3");
            }
        }));
        getRecordControlApi().Ia0().LIZ(this, new InterfaceC1441305kZ() { // from class: X.0tKA
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C1663800tOk.LIZ();
            }
        });
        getRecordControlApi().tQ0().LIZ(this, new AObjectS246S0100000_25(this, 646));
        getRecordControlApi().me2().LIZ(this, new AObjectS246S0100000_25(this, 647));
        getRecordControlApi().cJ0().LIZ(this, new AObjectS185S0300000_25(this, (C1660940tK8) vEAudioCaptureLJ, (VEAudioCapture) c259800zU, (C259800zU<SVCTask>) 16));
        getRecordControlApi().pU1().LIZ(this, new AObjectS185S0300000_25(this, (C1660940tK8) vEAudioCaptureLJ, (VEAudioCapture) c259800zU, (C259800zU<SVCTask>) 17));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLIZLLLIL.dispose();
        C1663800tOk.LIZ();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (getShortVideoContext().cameraComponentModel.isRetakeMode && getRecordControlApi().ec().LIZJ().booleanValue()) {
            Cp().Xw0();
        }
    }

    public InterfaceC1410040mnS X1() {
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

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
    }

    public C1660940tK8(C1DRG c1drg) {
        this.LL = c1drg;
        ArrayList arrayList = new ArrayList();
        this.LLJ = arrayList;
        this.LLJI = W1(arrayList);
        this.LLJIJIL = new C2218171Brj(this);
    }

    public final SVCTask W1(List<SVCTask> list) {
        SVCTask sVCTask = new SVCTask(getDiContainer());
        this.LLJI = sVCTask;
        list.add(sVCTask);
        sVCTask.LLJJI.LLJJ = true;
        return sVCTask;
    }
}
