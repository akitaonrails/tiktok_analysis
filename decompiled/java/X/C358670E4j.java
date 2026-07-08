package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioVoiceBeautifyFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.AudioAlgorithmModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358670E4j extends AbstractC2255721DQs<C0E53> implements C0E53, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C0E53 LLILZ = this;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C358670E4j.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C358670E4j.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLILZLL = 8;
    }

    private final InterfaceC1455860nzM X1() {
        return (InterfaceC1455860nzM) this.LLILLJJLI.getValue(this, LLILZIL[0]);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLILZIL[1]);
    }

    private final boolean Z1() {
        if (!Intrinsics.LJFF(C1428470nHB.LJIILIIL(getEditModel()), "shoot") || !Intrinsics.LJFF(C1428470nHB.LJIILL(getEditModel()), "video") || getEditModel().isStitchMode() || getEditModel().isDuet()) {
            return false;
        }
        AudioAlgorithmModel audioAlgorithmModel = getEditModel().creativeModel.audioAlgorithmModel;
        return audioAlgorithmModel.isMicOn && audioAlgorithmModel.isMicEnabled && C286430BKn.LIZ();
    }

    private final void o2() {
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        InterfaceC1452170ntP value = X1().g().getValue();
        NLEModel nLEModelLIZ = value != null ? C352130DrH.LIZ(value) : null;
        boolean zZ1 = Z1();
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initVoiceBeautyFilter, shouldAddFilter: ");
        sbLIZ.append(zZ1);
        C201955140j.LJIILJJIL(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
        if (zZ1) {
            String strNLEFilterName_getAUDIO_VOICE_BEAUTIFY_FILTER = NLEEditorJniJNI.NLEFilterName_getAUDIO_VOICE_BEAUTIFY_FILTER();
            if (strNLEFilterName_getAUDIO_VOICE_BEAUTIFY_FILTER == null || strNLEFilterName_getAUDIO_VOICE_BEAUTIFY_FILTER.length() == 0) {
                C201955140j.LJII(c1662160tM6, "initVoiceBeautyFilter, voiceBeautyFilterName is empty");
                return;
            }
            if (nLEModelLIZ == null || (mainTrack = nLEModelLIZ.getMainTrack()) == null || (slots = mainTrack.getSlots()) == null) {
                return;
            }
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                R30(it2.next(), strNLEFilterName_getAUDIO_VOICE_BEAUTIFY_FILTER);
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        o2();
    }

    public C0E53 W1() {
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

    public C358670E4j(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C0E53
    public void R30(NLETrackSlot nLETrackSlot, String str) {
        if (C286430BKn.LIZ() && nLETrackSlot != null && nLETrackSlot.getFilterByName(str) == null && nLETrackSlot != null) {
            NLEFilter nLEFilter = new NLEFilter();
            NLESegmentAudioVoiceBeautifyFilter nLESegmentAudioVoiceBeautifyFilter = new NLESegmentAudioVoiceBeautifyFilter();
            nLESegmentAudioVoiceBeautifyFilter.setFilterName(str);
            nLEFilter.setSegment(nLESegmentAudioVoiceBeautifyFilter);
            nLETrackSlot.addFilter(nLEFilter);
        }
    }

    @Override // X.C0E53
    public void Tq0(NLETrackSlot nLETrackSlot, String str) {
        if (C286430BKn.LIZ() && nLETrackSlot != null) {
            nLETrackSlot.removeFilterByName(str);
        }
    }
}
