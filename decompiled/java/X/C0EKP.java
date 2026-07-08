package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.info.ImageStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.info.InfoStickerModel;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0EKP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EKP {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getEnable() && C351220Dpo.LLJLILLLLZIIL(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        int size = 0;
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
            ArrayList arrayList2 = new ArrayList();
            for (NLETrackSlot nLETrackSlot : slots) {
                Integer numLJJJLZIJ = C351220Dpo.LJJJLZIJ(nLETrackSlot, "StickerSourceType", null);
                int value = C0EKQ.EDITOR_PRO.getValue();
                if (numLJJJLZIJ != null && numLJJJLZIJ.intValue() == value) {
                    arrayList2.add(nLETrackSlot);
                }
            }
            size += arrayList2.size();
        }
        return size;
    }

    public static InfoStickerModel LIZ(NLETrackSlot nLETrackSlot, C0E48 c0e48) {
        PairIntInt pairIntInt;
        int value;
        float fFloatValue;
        INLEMediaSession iNLEMediaSessionF1;
        INLEMediaRuntime mediaRuntimeApi;
        if (c0e48 == null || (iNLEMediaSessionF1 = c0e48.f1()) == null || (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) == null || (pairIntInt = mediaRuntimeApi.getInitSize()) == null) {
            pairIntInt = new PairIntInt(0, 0);
        }
        String uuid = nLETrackSlot.getUUID();
        String strLJLJJL = C351220Dpo.LJLJJL(nLETrackSlot);
        String str = "";
        if (strLJLJJL == null) {
            strLJLJJL = "";
        }
        String strLJLJJI = C351220Dpo.LJLJJI(nLETrackSlot);
        if (strLJLJJI == null) {
            strLJLJJI = "";
        }
        String strLJLJL = C351220Dpo.LJLJL(nLETrackSlot, "previewIconPath", "");
        if (strLJLJL != null) {
            str = strLJLJL;
        }
        C0EKQ c0ekq = C0EKQ.EDIT;
        Integer numLJJJLZIJ = C351220Dpo.LJJJLZIJ(nLETrackSlot, "StickerSourceType", Integer.valueOf(c0ekq.getValue()));
        if (numLJJJLZIJ != null) {
            value = numLJJJLZIJ.intValue();
        } else {
            value = c0ekq.getValue();
        }
        boolean zLLJJJIL = C351220Dpo.LLJJJIL(nLETrackSlot);
        boolean zLLLIIIL = C351220Dpo.LLLIIIL(nLETrackSlot);
        ImageStickerModel imageStickerModel = new ImageStickerModel(nLETrackSlot.getRelativeWidth(), nLETrackSlot.getRelativeHeight(), false, null);
        EnumC1466150oFx enumC1466150oFx = EnumC1466150oFx.INFO;
        float f = 2;
        float transformX = (nLETrackSlot.getTransformX() * pairIntInt.getFirst()) / f;
        float second = ((-nLETrackSlot.getTransformY()) * pairIntInt.getSecond()) / f;
        float f2 = (-nLETrackSlot.getRotation()) % 360;
        float scale = nLETrackSlot.getScale();
        Float fLJIILIIL = C351220Dpo.LJIILIIL(nLETrackSlot);
        if (fLJIILIIL != null) {
            fFloatValue = fLJIILIIL.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        return new InfoStickerModel(new BaseStickerModel(0, nLETrackSlot.getLayer(), enumC1466150oFx, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, transformX, second, scale, f2, C351220Dpo.LLLLLLL(nLETrackSlot.getStartTime()), C351220Dpo.LLLLLLL(nLETrackSlot.getEndTime()), false, 0.0f, 0.0f, true, fFloatValue, null, null, null, false, 941621241, 15, null), uuid, strLJLJJL, str, strLJLJJI, "", 0, 0, null, null, imageStickerModel, zLLJJJIL, true, true, true, zLLLIIIL, value, EnumC356160Dxm.NORMAL.toString(), false);
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        if (videoPublishEditModel != null && videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return ((Boolean) C284670BDt.LIZ.getValue()).booleanValue();
        }
        if (((Boolean) C288170BRf.LIZ.getValue()).booleanValue()) {
            return true;
        }
        if (nLEModel != null && LIZJ(nLEModel) > 0) {
            return true;
        }
        return false;
    }
}
