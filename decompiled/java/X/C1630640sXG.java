package X;

import Y.AObjectS246S0100000_25;
import Y.AObjectS306S0200000_25;
import Y.AObserverS227S0100000_25;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.nows.experiment.AIGCPhotoGenerationOptimization;
import com.ss.android.ugc.aweme.opensdk.contants.OPSDK$GreenScreenKitConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.ab.ChangeImagePickerUIExperiment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0sXG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630640sXG extends AbstractC2255721DQs<InterfaceC1630680sXK> implements InterfaceC1630680sXK, InterfaceC379610EuV {
    public static final C1630660sXI LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final int LL;
    public final C19A3 LLILLJJLI;
    public final C1DRG LLILLL;
    public boolean LLILZIL;
    public InterfaceC1635700sfQ LLJILJIL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 605));
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC577400Mkk.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1650930t3z.class, null);
    public Observer<Boolean> LLJILJILJ = new AObserverS227S0100000_25(this, 59);
    public final MediatorLiveData<Boolean> LLJILLL = new MediatorLiveData<>();
    public final Observer<Boolean> LLJJ = new AObserverS227S0100000_25(this, 60);

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0sXI] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1630640sXG.class, "recordApiComponent", "getRecordApiComponent()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1630640sXG.class, "stickerComponent", "getStickerComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(C1630640sXG.class, "slideComponent", "getSlideComponent()Lcom/ss/android/ugc/slideslip/SlideSlipEffectApiComponent;", 0), new C2217381BqS(C1630640sXG.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0), new C2217381BqS(C1630640sXG.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1630640sXG.class, "svcApi", "getSvcApi()Lcom/ss/android/ugc/gamora/recorder/voicechange/slideslip/SVCBottomAndPanelApiComponent;", 0)};
        LLJJI = new Object() { // from class: X.0sXI
        };
        LLJJIJI = 8;
    }

    public C1630640sXG W1() {
        return this;
    }

    private final void G2() {
        q qVarYq;
        InterfaceC1623190sLF interfaceC1623190sLFU;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        View viewFindViewById;
        if (this.LLILZIL || (qVarYq = yq()) == null || (interfaceC1623190sLFU = qVarYq.U()) == null) {
            return;
        }
        this.LLILZIL = true;
        interfaceC1623190sLFU.prepare();
        C1630650sXH c1630650sXHO2 = o2();
        c1630650sXHO2.LLJILJIL = interfaceC1623190sLFU;
        ViewGroup viewGroupRN = interfaceC1623190sLFU.RN();
        if (viewGroupRN != null && (frameLayout = (FrameLayout) viewGroupRN.findViewById(R.id.w4i)) != null && (viewFindViewById = frameLayout.findViewById(R.id.w4h)) != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
            LinearLayout linearLayout = c1630650sXHO2.LLJIJIL;
            if (linearLayout != null) {
                linearLayout.addView(viewFindViewById, new ViewGroup.LayoutParams(-1, -2));
            }
            c1630650sXHO2.LLJILJILJ = viewFindViewById.findViewById(R.id.mfo);
            if (ChangeImagePickerUIExperiment.isEnabled()) {
                viewFindViewById.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, 0);
            }
            View view = c1630650sXHO2.LLJILJILJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        }
        View viewFG = interfaceC1623190sLFU.FG();
        if (viewFG != null) {
            ViewParent parent = viewFG.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJJI(viewGroup);
            }
            LinearLayout linearLayout2 = c1630650sXHO2.LLJIJIL;
            if (linearLayout2 != null) {
                linearLayout2.addView(viewFG, new ViewGroup.LayoutParams(-2, -2));
            }
        }
    }

    private final void H2() {
        q qVarYq;
        LiveEvent<Unit> liveEventNP;
        if (!AIGCPhotoGenerationOptimization.INSTANCE.isEnabled() || (qVarYq = yq()) == null || (liveEventNP = qVarYq.nP()) == null) {
            return;
        }
        liveEventNP.LIZ(this, new AObjectS246S0100000_25(this, 554));
    }

    private final InterfaceC577400Mkk Z1() {
        return (InterfaceC577400Mkk) this.LLIZLLLIL.getValue(this, LLJJIII[2]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJI.getValue(this, LLJJIII[4]);
    }

    private final InterfaceC1650930t3z w2() {
        return (InterfaceC1650930t3z) this.LLJIJIL.getValue(this, LLJJIII[5]);
    }

    public final InterfaceC1648570t0B X1() {
        return (InterfaceC1648570t0B) this.LLILZLL.getValue(this, LLJJIII[0]);
    }

    public final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLJ.getValue(this, LLJJIII[3]);
    }

    public final C1630650sXH o2() {
        return (C1630650sXH) this.LLILZ.getValue();
    }

    public final q yq() {
        return (q) this.LLIZ.getValue(this, LLJJIII[1]);
    }

    private final void B3() {
        LiveEvent<Unit> liveEventNa1;
        q qVarYq = yq();
        if (qVarYq == null || (liveEventNa1 = qVarYq.Na1()) == null) {
            return;
        }
        liveEventNa1.LIZ(this, new AObjectS246S0100000_25(this, 562));
    }

    private final void E3() {
        LiveEvent<Boolean> liveEventDN1;
        q qVarYq = yq();
        if (qVarYq == null || (liveEventDN1 = qVarYq.dN1()) == null) {
            return;
        }
        liveEventDN1.LIZ(this, new AObjectS246S0100000_25(this, 563));
    }

    private final void T2() {
        ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1635700sfQ.class, new AwS604S0100000_25(this, 376));
    }

    private final void W2() {
        q qVarYq = yq();
        if (qVarYq != null) {
            qVarYq.Iq0().LIZ(this, new AObjectS306S0200000_25((Object) qVarYq, (Object) this, (InterfaceC1648570t0B) 19));
        }
    }

    private final void c3() {
        LiveEvent<C1644050sst> liveEventXM2;
        C385670FAf<Boolean> c385670FAfIsRecording;
        InterfaceC1648570t0B interfaceC1648570t0BX1 = X1();
        if (interfaceC1648570t0BX1 != null && (c385670FAfIsRecording = interfaceC1648570t0BX1.isRecording()) != null) {
            c385670FAfIsRecording.LIZ(this, new AObjectS246S0100000_25(this, 556));
        }
        InterfaceC1648570t0B interfaceC1648570t0BX12 = X1();
        if (interfaceC1648570t0BX12 == null || (liveEventXM2 = interfaceC1648570t0BX12.xM2()) == null) {
            return;
        }
        liveEventXM2.LJII(this, Lifecycle.State.CREATED, new AObjectS246S0100000_25(this, 557));
    }

    private final void i3() {
        LiveEvent<Boolean> liveEventIr1;
        InterfaceC1650930t3z interfaceC1650930t3zW2 = w2();
        if (interfaceC1650930t3zW2 == null || (liveEventIr1 = interfaceC1650930t3zW2.Ir1()) == null) {
            return;
        }
        liveEventIr1.LIZ(this, new AObjectS246S0100000_25(this, 558));
    }

    private final void m3() {
        LiveEvent<Unit> liveEventVb1;
        q qVarYq = yq();
        if (qVarYq == null || (liveEventVb1 = qVarYq.vb1()) == null) {
            return;
        }
        liveEventVb1.LIZ(this, new AObjectS246S0100000_25(this, 559));
    }

    private final void q3() {
        C385670FAf<Boolean> c385670FAfA3;
        InterfaceC577400Mkk interfaceC577400MkkZ1 = Z1();
        if (interfaceC577400MkkZ1 == null || (c385670FAfA3 = interfaceC577400MkkZ1.A3()) == null) {
            return;
        }
        c385670FAfA3.LIZ(this, new AObjectS246S0100000_25(this, 560));
    }

    private final void v3() {
        LiveEvent<AbstractC1627380sS0> liveEventMa2;
        q qVarYq = yq();
        if (qVarYq == null || (liveEventMa2 = qVarYq.Ma2()) == null) {
            return;
        }
        liveEventMa2.LIZ(this, new AObjectS246S0100000_25(this, 561));
    }

    public final void H3() {
        OPSDK$GreenScreenKitConfig oPSDK$GreenScreenKitConfig;
        LiveEvent<Boolean> liveEventIr1;
        Boolean boolLJI;
        CreativeModel creativeModel;
        RecordEffectModel recordEffectModel;
        C385670FAf<Boolean> c385670FAfFS;
        Boolean boolLIZJ;
        LiveEvent<AbstractC1627380sS0> liveEventMa2;
        AbstractC1627380sS0 abstractC1627380sS0LJI;
        LiveEvent<Boolean> liveEventDN1;
        Boolean boolLJI2;
        C385670FAf<Boolean> c385670FAfA3;
        Boolean boolLIZJ2;
        C385670FAf<Boolean> c385670FAfIsRecording;
        Boolean boolLIZJ3;
        InterfaceC1648570t0B interfaceC1648570t0BX1 = X1();
        boolean zBooleanValue = (interfaceC1648570t0BX1 == null || (c385670FAfIsRecording = interfaceC1648570t0BX1.isRecording()) == null || (boolLIZJ3 = c385670FAfIsRecording.LIZJ()) == null) ? false : boolLIZJ3.booleanValue();
        InterfaceC577400Mkk interfaceC577400MkkZ1 = Z1();
        boolean zBooleanValue2 = (interfaceC577400MkkZ1 == null || (c385670FAfA3 = interfaceC577400MkkZ1.A3()) == null || (boolLIZJ2 = c385670FAfA3.LIZJ()) == null) ? false : boolLIZJ2.booleanValue();
        q qVarYq = yq();
        boolean zBooleanValue3 = (qVarYq == null || (liveEventDN1 = qVarYq.dN1()) == null || (boolLJI2 = liveEventDN1.LJI()) == null) ? false : boolLJI2.booleanValue();
        q qVarYq2 = yq();
        Effect effectLIZ = (qVarYq2 == null || (liveEventMa2 = qVarYq2.Ma2()) == null || (abstractC1627380sS0LJI = liveEventMa2.LJI()) == null) ? null : abstractC1627380sS0LJI.LIZ();
        boolean z = effectLIZ != null && C1449600npG.LIZIZ(effectLIZ);
        InterfaceC1635700sfQ interfaceC1635700sfQ = this.LLJILJIL;
        boolean zBooleanValue4 = (interfaceC1635700sfQ == null || (c385670FAfFS = interfaceC1635700sfQ.FS()) == null || (boolLIZJ = c385670FAfFS.LIZJ()) == null) ? false : boolLIZJ.booleanValue();
        ShortVideoContext shortVideoContext = getShortVideoContext();
        boolean z2 = (shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null || (recordEffectModel = creativeModel.recordEffectModel) == null) ? false : recordEffectModel.isStoryRecording;
        InterfaceC1650930t3z interfaceC1650930t3zW2 = w2();
        boolean zBooleanValue5 = (interfaceC1650930t3zW2 == null || (liveEventIr1 = interfaceC1650930t3zW2.Ir1()) == null || (boolLJI = liveEventIr1.LJI()) == null) ? false : boolLJI.booleanValue();
        ShortVideoContext shortVideoContext2 = getShortVideoContext();
        boolean z3 = (shortVideoContext2 == null || (oPSDK$GreenScreenKitConfig = shortVideoContext2.greenScreenKitConfig) == null) ? false : oPSDK$GreenScreenKitConfig.hideImagePicker;
        ShortVideoContext shortVideoContext3 = getShortVideoContext();
        boolean z4 = shortVideoContext3 != null && shortVideoContext3.shootMode == 26;
        if (zBooleanValue || zBooleanValue4 || zBooleanValue5 || z2 || z3 || z4 || !(z || zBooleanValue3 || zBooleanValue2)) {
            LinearLayout linearLayout = o2().LLJIJIL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
                return;
            }
            return;
        }
        G2();
        LinearLayout linearLayout2 = o2().LLJIJIL;
        if (linearLayout2 != null) {
            C786410Ut5.LJZL(0, linearLayout2);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLILLJJLI.add(this.LL, o2(), "RecordStickerBarScene");
        c3();
        v3();
        q3();
        E3();
        B3();
        T2();
        W2();
        i3();
        if (AIGCPhotoGenerationOptimization.INSTANCE.isEnabled()) {
            H2();
        }
        m3();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public C1630640sXG(int i, C19A3 c19a3, C1DRG c1drg) {
        this.LL = i;
        this.LLILLJJLI = c19a3;
        this.LLILLL = c1drg;
    }
}
