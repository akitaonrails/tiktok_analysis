package X;

import Y.AObjectS247S0100000_29;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import kotlin.Pair;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11b4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19530411b4 extends AbstractC2255721DQs<InterfaceC1460540o6u> implements InterfaceC1460540o6u, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public Pair<Integer, Integer> LLILZ;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1460540o6u LLILZIL = this;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19530411b4.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19530411b4.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLIZ = 8;
    }

    private final VideoPublishEditModel X1() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLILLL.getValue(this, LLILZLL[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Pair<Integer, Integer>> liveEventFW1;
        C0ETY c0ety;
        Class<InterfaceC1417050myl> cls;
        AwS608S0100000_29 awS608S0100000_29;
        super.onCreate();
        C1DRG diContainer = getDiContainer();
        VideoPublishEditModel videoPublishEditModelX1 = X1();
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableMergeEPLazy) {
            c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
            cls = InterfaceC1417050myl.class;
            awS608S0100000_29 = new AwS608S0100000_29(this, 144);
        } else {
            if (!C365940EWi.LIZLLL(videoPublishEditModelX1)) {
                InterfaceC1417050myl interfaceC1417050myl = (InterfaceC1417050myl) ((C05YF) diContainer.LJIIL(null, InterfaceC1417050myl.class));
                if (interfaceC1417050myl == null || (liveEventFW1 = interfaceC1417050myl.FW1()) == null) {
                    return;
                }
                liveEventFW1.LJII(this, Lifecycle.State.CREATED, new AObjectS247S0100000_29(this, 46));
                return;
            }
            c0ety = (C0ETY) diContainer.LJII(C0ETY.class, null);
            cls = InterfaceC1417050myl.class;
            awS608S0100000_29 = new AwS608S0100000_29(this, 145);
        }
        c0ety.Sd(cls, awS608S0100000_29);
    }

    public InterfaceC1460540o6u W1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C19530411b4(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1460540o6u
    public void RP0(Pair<Integer, Integer> pair) {
        this.LLILZ = pair;
    }
}
