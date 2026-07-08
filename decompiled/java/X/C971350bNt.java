package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.newcopy.NLETextRichContent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0bNt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C971350bNt {
    public static C953770avX LIZ() {
        C953770avX c953770avX = new C953770avX();
        c953770avX.LIZLLL = C20428214wa.LIZIZ().LIZ;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C971360bNu((String) null, C953770avX.LJIILL, (String) null, 13));
        c953770avX.LJI = arrayList;
        c953770avX.LIZIZ = C1017903yT.LIZ();
        return c953770avX;
    }

    public static C971360bNu LIZIZ(NLETrackSlot nLETrackSlot) {
        String second;
        int iIntValue;
        int iIntValue2;
        NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentTextStickerDynamicCast != null) {
            C385090F7z c385090F7z = NLETextRichContent.Companion;
            String richContent = nLESegmentTextStickerDynamicCast.getRichContent();
            c385090F7z.getClass();
            NLETextRichContent nLETextRichContentLIZ = C385090F7z.LIZ(richContent);
            C385080F7y c385080F7y = nLETextRichContentLIZ.richTextData;
            String str = c385080F7y.textStr;
            Pair<String, String> pair = c385080F7y.font;
            if (pair == null || (second = pair.getSecond()) == null) {
                second = "";
            }
            int i = C953770avX.LJIILL;
            List<Float> list = nLETextRichContentLIZ.richTextData.textColor;
            MultiCanvasUtils.LIZ.getClass();
            Integer numLJIJJ = MultiCanvasUtils.LJIJJ(list);
            if (numLJIJJ != null) {
                iIntValue = numLJIJJ.intValue();
            } else {
                iIntValue = C953770avX.LJIILL;
            }
            C971360bNu c971360bNu = new C971360bNu(str, iIntValue, second, nLETrackSlot.getUUID());
            List<Float> list2 = nLETextRichContentLIZ.richTextData.textColor;
            if (list2 != null) {
                Integer numLJIJJ2 = MultiCanvasUtils.LJIJJ(list2);
                if (numLJIJJ2 != null) {
                    iIntValue2 = numLJIJJ2.intValue();
                } else {
                    iIntValue2 = C953770avX.LJIILL;
                }
                c971360bNu.LIZIZ = iIntValue2;
            }
            return c971360bNu;
        }
        return new C971360bNu((String) null, 0, (String) null, 15);
    }
}
