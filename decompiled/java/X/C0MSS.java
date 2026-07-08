package X;

import Y.AObjectS241S0100000_8;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0MSS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MSS extends AbstractC2255721DQs<C0MSU> implements InterfaceC379610EuV, C0MSU {
    public static final C0MST LLILZIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final C0MSU LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0MST] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MSS.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0MSS.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0)};
        LLILZIL = new Object() { // from class: X.0MST
        };
        LLIZ = 8;
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZ.getValue(this, LLILZLL[1]);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLILZLL[0]);
    }

    public final void X1() {
        NLEModel nLEModelLLZ;
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        boolean z = false;
        if (((Number) C0B0X.LIZ.getValue()).intValue() == 0 || !C1444940nhk.LJIIZILJ(getEditModel().getCanvasVideoData()) || C287150BNh.LIZ() || (nLEModelLLZ = JY0().LLZ()) == null) {
            return;
        }
        long jIntValue = ((long) ((Number) C0B0Y.LIZ.getValue()).intValue()) * 1000;
        int i = C346800Dig.LIZIZ;
        long j = jIntValue * 1000;
        VecNLETrackSPtr tracks = nLEModelLLZ.getTracks();
        if (tracks != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                for (NLETrackSlot nLETrackSlot : it2.next().getSlots()) {
                    if (nLETrackSlot.getEndTime() > j) {
                        nLETrackSlot.setEndTime(j);
                        nLETrackSlot.setMeasuredEndTime(j);
                        Iterator<NLEVideoAnimation> it3 = nLETrackSlot.getVideoAnims().iterator();
                        while (it3.hasNext()) {
                            it3.next().setEndTime(j);
                        }
                        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                        if (nLESegmentAudioDynamicCast != null) {
                            nLESegmentAudioDynamicCast.setTimeClipEnd(j);
                        }
                        z = true;
                    }
                }
            }
        }
        CanvasVideoData canvasVideoData = getEditModel().getCanvasVideoData();
        if (canvasVideoData == null || (canvasExtra = canvasVideoData.extra) == null || (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) == null) {
            return;
        }
        forwardCanvasExtra.setClipped(z);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        JY0().Md2().LIZ(this, new AObjectS241S0100000_8(this, 27));
    }

    public C0MSU W1() {
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

    public C0MSS(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
