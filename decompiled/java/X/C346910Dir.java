package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioFadeFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Dir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346910Dir {
    public static final boolean LIZ(NLEModel nLEModel) {
        NLESegmentAudioFadeFilter nLESegmentAudioFadeFilterDynamicCast;
        boolean z;
        String strNLEFilterName_getAUDIO_FADE_FILTER = NLEEditorJniJNI.NLEFilterName_getAUDIO_FADE_FILTER();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (C351220Dpo.LLLFF(nLETrack2) || C351220Dpo.LLILL(nLETrack2) || C351220Dpo.LLLILZLLLI(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                NLEFilter filterByName = ((NLETrackSlot) it3.next()).getFilterByName(strNLEFilterName_getAUDIO_FADE_FILTER);
                if (filterByName != null && (nLESegmentAudioFadeFilterDynamicCast = NLESegmentAudioFadeFilter.dynamicCast((NLENode) filterByName.getSegment())) != null) {
                    if (nLESegmentAudioFadeFilterDynamicCast.getFadeInLength() <= 0 && nLESegmentAudioFadeFilterDynamicCast.getFadeOutLength() <= 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    if (boolValueOf != null && boolValueOf.booleanValue()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        if (((Boolean) C273980AoW.LIZ.getValue()).booleanValue()) {
            return true;
        }
        if (videoPublishEditModel != null && videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return ((Boolean) C273990AoX.LIZ.getValue()).booleanValue();
        }
        if (nLEModel != null && C351220Dpo.LLIIIZ(nLEModel)) {
            return true;
        }
        return false;
    }
}
