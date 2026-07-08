package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0LAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538610LAl {
    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLILZ(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        Iterator it3 = arrayList2.iterator();
        float fMax = -1.0f;
        while (it3.hasNext()) {
            NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(((NLETrackSlot) it3.next()).getMainSegment());
            if (nLESegmentAudioDynamicCast != null) {
                fMax = Math.max(nLESegmentAudioDynamicCast.getVolume(), fMax);
            }
        }
        if (fMax >= 0.0f && (creativeModel = videoPublishEditModel.creativeModel) != null && (musicBuzModel = creativeModel.musicBuzModel) != null) {
            musicBuzModel.musicVolume = fMax;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0280  */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r27, java.lang.String r28, com.ss.android.ugc.aweme.aigc.asynctask.models.MusicInfo r29, java.util.List<com.ss.android.ugc.aweme.aigc.asynctask.models.AutoPickTaskResponse> r30, java.lang.String r31, java.lang.String r32, X.InterfaceC1364105Vn<? super kotlin.Unit> r33) {
        /*
            Method dump skipped, instruction units count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C538610LAl.LIZ(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.aigc.asynctask.models.MusicInfo, java.util.List, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
