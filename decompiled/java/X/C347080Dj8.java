package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTemplate;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Dj8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347080Dj8 {
    public static final List<NLETrackSlot> LIZIZ(NLETrackSlot nLETrackSlot) {
        NLESegmentTemplate nLESegmentTemplateDynamicCast = NLESegmentTemplate.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentTemplateDynamicCast == null) {
            return null;
        }
        VecNLETrackSlotSPtr childElementLists = nLESegmentTemplateDynamicCast.getChildElementLists();
        ArrayList arrayList = new ArrayList();
        for (NLETrackSlot nLETrackSlot2 : childElementLists) {
            if (NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot2.getMainSegment()) != null) {
                arrayList.add(nLETrackSlot2);
            }
        }
        return arrayList;
    }

    public static final NLESegmentTextSticker LIZJ(NLETrackSlot nLETrackSlot) {
        NLETrackSlot next;
        NLESegmentTemplate nLESegmentTemplateDynamicCast = NLESegmentTemplate.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentTemplateDynamicCast == null) {
            return null;
        }
        Iterator<NLETrackSlot> it2 = nLESegmentTemplateDynamicCast.getChildElementLists().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (NLESegmentTextSticker.dynamicCast((NLENode) next.getMainSegment()) != null) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrackSlot nLETrackSlot2 = next;
        if (nLETrackSlot2 == null) {
            return null;
        }
        return NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot2.getMainSegment());
    }

    public static final List<NLESegmentTextSticker> LIZLLL(NLETrackSlot nLETrackSlot) {
        NLESegmentTemplate nLESegmentTemplateDynamicCast = NLESegmentTemplate.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentTemplateDynamicCast == null) {
            return null;
        }
        VecNLETrackSlotSPtr childElementLists = nLESegmentTemplateDynamicCast.getChildElementLists();
        ArrayList arrayList = new ArrayList();
        for (NLETrackSlot nLETrackSlot2 : childElementLists) {
            if (NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot2.getMainSegment()) != null) {
                arrayList.add(nLETrackSlot2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) ((NLETrackSlot) it2.next()).getMainSegment());
            if (nLESegmentTextStickerDynamicCast != null) {
                arrayList2.add(nLESegmentTextStickerDynamicCast);
            }
        }
        return arrayList2;
    }

    public static final NLESegmentTextSticker LIZ(int i, NLETrackSlot nLETrackSlot) {
        NLETrackSlot nLETrackSlot2;
        NLESegmentTextSticker nLESegmentTextStickerDynamicCast;
        List<NLETrackSlot> listLIZIZ = LIZIZ(nLETrackSlot);
        if (listLIZIZ == null || ((ArrayList) listLIZIZ).size() <= 1 || 1 == 0 || (nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(i, listLIZIZ)) == null || (nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot2.getMainSegment())) == null) {
            return LIZJ(nLETrackSlot);
        }
        return nLESegmentTextStickerDynamicCast;
    }
}
