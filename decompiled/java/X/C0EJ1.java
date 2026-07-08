package X;

import Y.AComparatorS24S0000000_5;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EJ1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EJ1 {
    public static final TextStickerData LIZ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = (TextStickerData) C0CHQ.LIZ().getGson().LJII(str, TextStickerData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        TextStickerData textStickerData = (TextStickerData) c098200Yq;
        if (textStickerData == null) {
            return new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1, -1, -1, 4095, null);
        }
        return textStickerData;
    }

    public static final String LIZIZ(TextStickerData textStickerData) {
        return GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), textStickerData);
    }

    public static final String LIZJ(NLEModel nLEModel) {
        NLETrack trackBySlot;
        ArrayList arrayList = new ArrayList();
        AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(433);
        AFwS234S0000000_5 aFwS234S0000000_52 = AFwS234S0000000_5.get$arr$(434);
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            if (nLETrack.getEnable() && (C351220Dpo.LLLLJ(nLETrack) || ((Boolean) aFwS234S0000000_5.invoke(nLETrack)).booleanValue())) {
                arrayList.add(nLETrack);
            }
        }
        for (NLETrack nLETrack2 : nLEModel.getTracks()) {
            if (nLETrack2.getEnable() && ((Boolean) aFwS234S0000000_52.invoke(nLETrack2)).booleanValue()) {
                arrayList.add(nLETrack2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj != null) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        int i = 0;
        for (Object obj2 : arrayList3) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList4.add(new Pair(Integer.valueOf(i), obj2));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) ((Pair) it3.next()).getSecond();
            nLETrackSlot.getEnable();
            C351220Dpo.LLJJIJIL(nLETrackSlot);
            NLETrack trackBySlot2 = nLEModel.getTrackBySlot(nLETrackSlot);
            if (trackBySlot2 != null && (C351220Dpo.LLILLL(trackBySlot2) || C351220Dpo.LLJILLL(trackBySlot2))) {
                C366800EZq.LIZJ(nLETrackSlot);
            }
            C351220Dpo.LJLLLL(nLETrackSlot.getMainSegment());
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) ((Pair) obj3).getSecond();
            NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot2.getMainSegment());
            if (nLESegmentAudioDynamicCast != null || (nLESegmentAudioDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment())) != null) {
                nLESegmentAudioDynamicCast.getVolume();
            }
            if (nLETrackSlot2.getEnable() && !C351220Dpo.LLJJIJIL(nLETrackSlot2) && ((trackBySlot = nLEModel.getTrackBySlot(nLETrackSlot2)) == null || ((!C351220Dpo.LLILLL(trackBySlot) && !C351220Dpo.LLJILLL(trackBySlot)) || C366800EZq.LIZJ(nLETrackSlot2)))) {
                arrayList5.add(obj3);
            }
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LJLLLL(new AComparatorS24S0000000_5(65), arrayList5), ",", null, null, 0, null, new AwS584S0100000_5(nLEModel, 910), 30);
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "EPCaptionMD5", strLJJLIIIJ);
        String strLIZ = C2084808Es.LIZ(strLJJLIIIJ);
        if (!(!a0.LJJJIL(strLJJLIIIJ)) || strLIZ == null) {
            return "none";
        }
        return strLIZ;
    }

    public static final String LJ(NLEModel nLEModel) {
        NLETrack nLETrackLIZ = C349560Dn8.LIZ(nLEModel);
        if (nLETrackLIZ != null && nLETrackLIZ.hasExtra("ep_caption_language")) {
            return nLETrackLIZ.getExtra("ep_caption_language");
        }
        return nLEModel.getExtra("ep_caption_language");
    }

    public static final boolean LJFF(String str) {
        return Intrinsics.LJFF(str, "auto_language");
    }

    public static final boolean LJI(String str) {
        if (!Intrinsics.LJFF(str, "American English") && !Intrinsics.LJFF(str, "British English")) {
            return false;
        }
        return true;
    }

    public static final String LIZLLL(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        CreativeModel creativeModel;
        InlineCaptionModel inlineCaptionModel;
        InlineCaptionModel inlineCaptionModel2;
        if (nLEModel != null && nLEModel.hasExtra("recognized_caption_language")) {
            return nLEModel.getExtra("recognized_caption_language");
        }
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (inlineCaptionModel = creativeModel.inlineCaptionModel) == null || inlineCaptionModel.recognizedLanguage == null || (inlineCaptionModel2 = videoPublishEditModel.creativeModel.inlineCaptionModel) == null) {
            return null;
        }
        return inlineCaptionModel2.recognizedLanguage;
    }
}
