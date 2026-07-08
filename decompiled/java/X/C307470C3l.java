package X;

import com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.AICreateImageModel;
import com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.AICreateModelConfig;
import com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.AICreateVideoModel;
import com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.VideoGenTaskConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0C3l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307470C3l {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(boolean z) {
        List<AICreateImageModel> listLIZIZ = C307440C3i.LIZIZ(z);
        if (listLIZIZ.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        for (AICreateImageModel aICreateImageModel : listLIZIZ) {
            arrayList.add(new C380190EvR(aICreateImageModel.modelDisplayName, aICreateImageModel.modelDisplayRemark, aICreateImageModel.modelQuotaReqKey, aICreateImageModel.modelIconUrl, -1, 0, false, aICreateImageModel.modelByOwn, null, aICreateImageModel.genTasksConfig, null, C13BV.INSTANCE));
        }
        return arrayList;
    }

    public static C380190EvR LIZIZ(AICreateVideoModel aICreateVideoModel) {
        return new C380190EvR(aICreateVideoModel.modelDisplayName, aICreateVideoModel.modelDisplayRemark, aICreateVideoModel.modelQuotaReqKey, aICreateVideoModel.modelIconUrl, -1, 0, true, aICreateVideoModel.modelByOwn, Boolean.valueOf(aICreateVideoModel.haveAudio), null, aICreateVideoModel.genTasksConfig, aICreateVideoModel.modelTags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public static List LIZJ(boolean z) {
        ?? arrayList;
        List<AICreateVideoModel> list;
        AICreateVideoModel aICreateVideoModelLIZ;
        AICreateVideoModel next;
        AICreateVideoModel next2;
        AICreateVideoModel aICreateVideoModelLIZ2;
        VideoGenTaskConfig videoGenTaskConfigLIZ;
        VideoGenTaskConfig videoGenTaskConfigLIZ2;
        AICreateModelConfig aICreateModelConfigLIZ = C307440C3i.LIZ(z);
        if (aICreateModelConfigLIZ != null && (list = aICreateModelConfigLIZ.videoModelList) != null) {
            Iterator<AICreateVideoModel> it2 = list.iterator();
            while (true) {
                aICreateVideoModelLIZ = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (!next.modelByOwn) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AICreateVideoModel aICreateVideoModel = next;
            Iterator<AICreateVideoModel> it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (next2.modelByOwn) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            AICreateVideoModel aICreateVideoModel2 = next2;
            ArrayList arrayList2 = new ArrayList();
            if (aICreateVideoModel2 != null) {
                List<VideoGenTaskConfig> list2 = aICreateVideoModel2.genTasksConfig;
                if (list2 != null) {
                    for (VideoGenTaskConfig videoGenTaskConfig : list2) {
                        if (Intrinsics.LJFF(videoGenTaskConfig.taskType, "text2video")) {
                            videoGenTaskConfigLIZ2 = VideoGenTaskConfig.LIZ(videoGenTaskConfig, C2536909wt.LIZ());
                        } else if (Intrinsics.LJFF(videoGenTaskConfig.taskType, "image2video")) {
                            videoGenTaskConfigLIZ2 = VideoGenTaskConfig.LIZ(videoGenTaskConfig, (String) C274150Aon.LIZ.getValue());
                        } else {
                            videoGenTaskConfigLIZ2 = VideoGenTaskConfig.LIZ(videoGenTaskConfig, (String) C2536809ws.LIZ.getValue());
                        }
                        arrayList2.add(videoGenTaskConfigLIZ2);
                    }
                }
                aICreateVideoModelLIZ2 = AICreateVideoModel.LIZ(aICreateVideoModel2, arrayList2, C2536909wt.LIZ());
            } else {
                aICreateVideoModelLIZ2 = null;
            }
            if (C307450C3j.LIZ()) {
                ArrayList arrayList3 = new ArrayList();
                if (aICreateVideoModel != null) {
                    List<VideoGenTaskConfig> list3 = aICreateVideoModel.genTasksConfig;
                    if (list3 != null) {
                        for (VideoGenTaskConfig videoGenTaskConfig2 : list3) {
                            if (Intrinsics.LJFF(videoGenTaskConfig2.taskType, "text2video")) {
                                videoGenTaskConfigLIZ = VideoGenTaskConfig.LIZ(videoGenTaskConfig2, (String) C2553109zV.LIZ.getValue());
                            } else if (Intrinsics.LJFF(videoGenTaskConfig2.taskType, "image2video")) {
                                videoGenTaskConfigLIZ = VideoGenTaskConfig.LIZ(videoGenTaskConfig2, (String) C2553309zX.LIZ.getValue());
                            } else {
                                videoGenTaskConfigLIZ = VideoGenTaskConfig.LIZ(videoGenTaskConfig2, (String) C2553209zW.LIZ.getValue());
                            }
                            arrayList3.add(videoGenTaskConfigLIZ);
                        }
                    }
                    aICreateVideoModelLIZ = AICreateVideoModel.LIZ(aICreateVideoModel, arrayList3, (String) C2553109zV.LIZ.getValue());
                }
            }
            arrayList = new ArrayList();
            if (aICreateVideoModelLIZ2 != null) {
                arrayList.add(aICreateVideoModelLIZ2);
            }
            if (aICreateVideoModelLIZ != null) {
                arrayList.add(aICreateVideoModelLIZ);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (arrayList.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(LIZIZ((AICreateVideoModel) it4.next()));
        }
        return arrayList4;
    }
}
