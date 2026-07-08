package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.story.celebration.CelebrationRenderedVideo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0MLE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MLE {
    public static final C0MLE LIZ = new C0MLE();
    public static final C1770006wU LIZIZ = new C1770006wU(CoroutineExceptionHandler.LJJLIL, 7);

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel, C0MHP c0mhp) {
        List<EditVideoSegment> listZU1;
        String strLIZJ;
        if (c0mhp != null) {
            listZU1 = c0mhp.ZU1();
            if (listZU1 != null) {
                videoPublishEditModel.setPreviewInfo(new C538310L9h(videoPublishEditModel.getVideoCanvasWidth(), videoPublishEditModel.getVideoCanvasHeight(), 28).LIZ(listZU1));
            }
        } else {
            listZU1 = null;
        }
        NLEModel nleModel = videoPublishEditModel.getNleModel();
        if (nleModel != null && (strLIZJ = C375260EnU.LIZJ(nleModel)) != null) {
            videoPublishEditModel.setNleData(strLIZJ);
            CelebrationData celebrationData = videoPublishEditModel.creativeModel.celebrationData;
            if (celebrationData != null) {
                celebrationData.setNleData(strLIZJ);
            }
        }
        if (listZU1 != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listZU1, 10));
            Iterator<EditVideoSegment> it2 = listZU1.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getVideoPath());
            }
            CelebrationData celebrationData2 = videoPublishEditModel.creativeModel.celebrationData;
            if (celebrationData2 != null) {
                celebrationData2.setVideoPath(arrayList);
            }
        }
        videoPublishEditModel.setVideoEditorType(14);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Intent r31, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r32, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r33, X.C0MHP r34) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MLE.LIZ(android.content.Intent, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0MHP):void");
    }

    public static void LIZIZ(C0MLE c0mle, VideoPublishEditModel videoPublishEditModel, int i, String str, int i2, boolean z, String str2, String str3, CelebrationRenderedVideo celebrationRenderedVideo, int i3) {
        int i4;
        int size;
        Integer numValueOf;
        List<Long> list;
        CelebrationRenderedVideo celebrationRenderedVideo2 = celebrationRenderedVideo;
        String str4 = str3;
        String str5 = str2;
        boolean z2 = z;
        int i5 = i2;
        if ((i3 & 8) != 0) {
            i5 = 1;
        }
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        Boolean bool = null;
        if ((i3 & 32) != 0) {
            str5 = null;
        }
        if ((i3 & 64) != 0) {
            str4 = null;
        }
        if ((i3 & 128) != 0) {
            celebrationRenderedVideo2 = null;
        }
        c0mle.getClass();
        if (i != 0) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            boolean zLIZJ = false;
            CelebrationData celebrationData = new CelebrationData(null, null, null, 0, 0, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, 134217727, null);
            celebrationData.setCelebrationType(Integer.valueOf(i));
            celebrationData.setUniqueId(str);
            CopyOnWriteArrayList<ForwardMedia> copyOnWriteArrayListLIZIZ = C0MLC.LIZ.LIZJ(i).LIZIZ();
            if ((copyOnWriteArrayListLIZIZ instanceof Collection) && copyOnWriteArrayListLIZIZ.isEmpty()) {
                i4 = 0;
            } else {
                Iterator<ForwardMedia> it2 = copyOnWriteArrayListLIZIZ.iterator();
                i4 = 0;
                while (it2.hasNext()) {
                    if (it2.next().isStory() && (i4 = i4 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            celebrationData.setStoryCnt(i4);
            celebrationData.setPostCnt(copyOnWriteArrayListLIZIZ.size() - celebrationData.getStoryCnt());
            InterfaceC567940MPg interfaceC567940MPg = C0MLA.LIZ;
            if (interfaceC567940MPg != null) {
                zLIZJ = interfaceC567940MPg.LIZJ(i, Integer.valueOf(copyOnWriteArrayListLIZIZ.size()));
            }
            celebrationData.setHasPoster(zLIZJ);
            if (celebrationData.getHasPoster()) {
                size = 1;
            } else {
                size = copyOnWriteArrayListLIZIZ.size();
            }
            celebrationData.setContentCnt(size);
            celebrationData.setPreviewType(i5);
            celebrationData.setOutPush(z2);
            celebrationData.setEntranceType(str5);
            celebrationData.setSearchExtra(str4);
            celebrationData.setCelebrationShootWay(videoPublishEditModel.mShootWay);
            if (celebrationRenderedVideo2 != null && (list = celebrationRenderedVideo2.originalItemIds) != null) {
                numValueOf = Integer.valueOf(list.size());
            } else {
                numValueOf = null;
            }
            celebrationData.setRenderCardMaterialSize(numValueOf);
            if (Intrinsics.LJFF(str5, "create_tab")) {
                bool = Boolean.TRUE;
            }
            celebrationData.setMobPreReplayStatus(bool);
            OnThisDayData onThisDayData = videoPublishEditModel.creativeModel.onThisDayData;
            onThisDayData.setCelebrationType(i);
            onThisDayData.setPostCnt(celebrationData.getPostCnt());
            onThisDayData.setStoryCnt(celebrationData.getStoryCnt());
            videoPublishEditModel.creativeModel.commonMobModel.searchExtra = str4;
            creativeModel.celebrationData = celebrationData;
        }
    }
}
