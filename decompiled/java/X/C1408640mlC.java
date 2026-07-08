package X;

import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0mlC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408640mlC extends AbstractC2255721DQs<InterfaceC1408660mlE> implements InterfaceC379610EuV, InterfaceC1408660mlE {
    public static final C1408650mlD LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC1408660mlE LLILZ = this;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 356));
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0mlD] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1408640mlC.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZ = new Object() { // from class: X.0mlD
        };
        LLJ = 8;
    }

    private final C1408680mlG X1() {
        return (C1408680mlG) this.LLILZIL.getValue();
    }

    private final void Z1() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getEditModel().getCreationId());
        c0lab.LIZ(1, "resharing_story_style");
        C20684815ws.LJIILLIIL("resharing_story_style_change_hint_show", c0lab.LIZ);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZLL.getValue(this, LLIZLLLIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (o2(getEditModel())) {
            this.LLILLJJLI.add(this.LLILLL, X1(), "AddToStoryHintScene");
            C1408680mlG c1408680mlGX1 = X1();
            TuxTextView tuxTextView = c1408680mlGX1.LLJIJIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                HandlerHook.viewRemoveCallbacks(tuxTextView, c1408680mlGX1.LLJILJIL);
                HandlerHook.viewPostDelay(tuxTextView, c1408680mlGX1.LLJILJIL, 1500L);
            }
            Z1();
        }
    }

    public InterfaceC1408660mlE W1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    private final boolean o2(VideoPublishEditModel videoPublishEditModel) {
        CanvasVideoData canvasVideoData;
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        Integer numValueOf;
        CanvasVideoData canvasVideoData2 = videoPublishEditModel.getCanvasVideoData();
        if (canvasVideoData2 != null && C1444940nhk.LJFF(canvasVideoData2) && (canvasVideoData = videoPublishEditModel.getCanvasVideoData()) != null && (canvasExtra = canvasVideoData.extra) != null && (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) != null && (numValueOf = Integer.valueOf(forwardCanvasExtra.canvasStyle)) != null && (numValueOf.intValue() == 1 || numValueOf.intValue() == 2 || numValueOf.intValue() == 3)) {
            return true;
        }
        return false;
    }

    public C1408640mlC(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
    }
}
