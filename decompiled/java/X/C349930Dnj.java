package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Dnj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349930Dnj {
    public static final NLETrack LIZLLL(NLEModel nLEModel) {
        List<NLETrack> listLJFF = LJFF(nLEModel);
        if (((ArrayList) listLJFF).isEmpty()) {
            return null;
        }
        return (NLETrack) ListProtector.get(listLJFF, 0);
    }

    public static final List<NLETrack> LJFF(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (C351220Dpo.LLILLL(nLETrack2) || C351220Dpo.LLJILLL(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static final boolean LJI(NLEModel nLEModel) {
        NLETrack nLETrackLIZLLL = LIZLLL(nLEModel);
        if (nLETrackLIZLLL == null || nLETrackLIZLLL.getSlots() == null || nLETrackLIZLLL.getSlots().size() <= 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(NLEModel nLEModel) {
        String extra;
        Boolean boolLJLI;
        NLETrack nLETrackLIZLLL = LIZLLL(nLEModel);
        if (nLETrackLIZLLL == null || !nLETrackLIZLLL.hasExtra("is_ep_multi_music") || (extra = nLETrackLIZLLL.getExtra("is_ep_multi_music")) == null || (boolLJLI = a0.LJLI(extra)) == null || !boolLJLI.booleanValue() || !LJI(nLEModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (pUgcTemplateData = creativeModel.pugcTemplateData) != null && pUgcTemplateData.isFromCreateTemplate) {
            return ((Boolean) C264440AXy.LIZ.getValue()).booleanValue();
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "add_multi_music_entrance_need_60s", true, false) && !z && !C1458070o2v.LJFF()) {
            if (videoPublishEditModel != null && videoPublishEditModel.getEditorProModel().getShowMultiMusicEntrance() && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_enable_multi_music", true, false)) {
                return true;
            }
            return false;
        }
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_enable_multi_music", true, false);
    }

    public static final List<NLETrackSlot> LJ(NLEModel nLEModel, String str) {
        Iterable slots;
        if (str != null && str.length() != 0) {
            List<NLETrack> listLJFF = LJFF(nLEModel);
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : (ArrayList) listLJFF) {
                if (nLETrack == null || (slots = nLETrack.getSlots()) == null) {
                    slots = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(slots, arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                NLENode nLENode = (NLENode) obj;
                if (Intrinsics.LJFF(nLENode.getExtra("ep_audio_music_id"), str) || Intrinsics.LJFF(nLENode.getExtra("d_bgmId"), str)) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3, com.bytedance.ies.nle.editor_jni.NLEModel r4, boolean r5) {
        /*
            r2 = 1
            if (r3 == 0) goto La
            boolean r0 = X.C1416310mxZ.LJJJJZI(r3)
            if (r0 != r2) goto La
            return r2
        La:
            boolean r1 = LIZIZ(r3, r5)
            if (r1 != 0) goto L30
            if (r3 == 0) goto L2d
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.creativeModel
            if (r0 == 0) goto L2d
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            if (r0 == 0) goto L2d
            java.util.List r0 = X.C1429680nJ8.LIZIZ(r0)
        L1e:
            int r0 = r0.size()
            if (r0 <= r2) goto L30
        L24:
            if (r4 == 0) goto L2c
            if (r2 != 0) goto L2c
            boolean r2 = LJII(r4)
        L2c:
            return r2
        L2d:
            X.13BV r0 = X.C13BV.INSTANCE
            goto L1e
        L30:
            r2 = r1
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C349930Dnj.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.ies.nle.editor_jni.NLEModel, boolean):boolean");
    }
}
