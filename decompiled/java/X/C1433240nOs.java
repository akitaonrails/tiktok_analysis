package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0nOs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433240nOs implements InterfaceC1433250nOt {
    public static final C1433240nOs LIZ = new C1433240nOs();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(490));
    public static final Map<String, List<C1433500nPI>> LIZJ = new LinkedHashMap();
    public static final Set<String> LIZLLL = new LinkedHashSet();
    public static final Map<String, String> LJ = new LinkedHashMap();
    public static final Map<String, Function1<InterfaceC1364105Vn<? super Unit>, Object>> LJFF = new LinkedHashMap();
    public static final Map<String, C09AE> LJI = new LinkedHashMap();
    public static final Set<String> LJII = new LinkedHashSet();

    public static C1434650nR9 LIZIZ(AbstractC1433460nPE abstractC1433460nPE) {
        if (abstractC1433460nPE instanceof C1433450nPD) {
            C1433270nOv c1433270nOv = ((C1433450nPD) abstractC1433460nPE).LIZ;
            return new C1434650nR9(c1433270nOv.LIZLLL, c1433270nOv.LIZJ, c1433270nOv.LJFF, c1433270nOv.LIZIZ);
        }
        if (abstractC1433460nPE instanceof C1433410nP9) {
            return ((C1433410nP9) abstractC1433460nPE).LIZ;
        }
        return new C1434650nR9(new Throwable("cancel"));
    }

    public static boolean LIZJ(String str) {
        List list;
        if (str == null || (list = (List) ((LinkedHashMap) LIZJ).get(str)) == null || list.isEmpty()) {
            return true;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (!(((C1433500nPI) it2.next()).LLILZIL.LIZLLL instanceof C1433210nOp)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC1433250nOt
    public final C1433500nPI LIZ(String str) {
        List list;
        Object obj = ((LinkedHashMap) LJ).get(str);
        Object obj2 = null;
        if (obj == null || (list = (List) ((LinkedHashMap) LIZJ).get(obj)) == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (!(((C1433500nPI) next).LLILZIL.LIZLLL instanceof C1433210nOp)) {
                obj2 = next;
                break;
            }
        }
        return (C1433500nPI) obj2;
    }

    public static void LIZLLL(PublishModel publishModel, boolean z) {
        StoryGroupPublishModel storyGroupPublishModel;
        Activity activityLJFF;
        C19EG c19eg;
        BaseShortVideoContext baseShortVideoContext;
        if (!C297680Ble.LIZ()) {
            return;
        }
        String draftPrimaryKey = null;
        if (publishModel != null && (storyGroupPublishModel = publishModel.storyGroupPublishModel) != null) {
            C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSubTaskFinish: isFailed=");
            sbLIZ.append(z);
            sbLIZ.append(", index=");
            sbLIZ.append(storyGroupPublishModel.scheduleIndex);
            sbLIZ.append(", count=");
            sbLIZ.append(storyGroupPublishModel.scheduleCount);
            C201955140j.LIZLLL(c830690WiJ, "StoryPhotoModePublisher", C2188811AlT.LIZIZ(sbLIZ));
            if (!LIZJ(storyGroupPublishModel.groupId)) {
                return;
            }
            if (ActivityStack.getTopActivity() != null) {
                activityLJFF = ActivityStack.getTopActivity();
            } else {
                activityLJFF = C2214201BlK.LJFF();
            }
            if (activityLJFF != null && (activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null && !c19eg.isFinishing()) {
                List list = (List) ((LinkedHashMap) LIZJ).get(storyGroupPublishModel.groupId);
                if (list == null) {
                    C1AF0.LIZJ("notify_story_group_failed_no_task_found");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    AbstractC1433190nOn abstractC1433190nOn = ((C1433500nPI) obj).LLILZIL.LIZLLL;
                    if (abstractC1433190nOn instanceof C1433210nOp) {
                        AbstractC1433460nPE abstractC1433460nPE = ((C1433210nOp) abstractC1433190nOn).LIZ;
                        if (!(abstractC1433460nPE instanceof C492390JSr) && !(abstractC1433460nPE instanceof C1433420nPA)) {
                            arrayList.add(obj);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    C201955140j.LIZLLL(C830690WiJ.LIZIZ, "StoryPhotoModePublisher", "onSubTaskFinish: all task success");
                    return;
                }
                C830690WiJ c830690WiJ2 = C830690WiJ.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onSubTaskFinish: show failed window, count: ");
                sbLIZ2.append(arrayList.size());
                C201955140j.LIZLLL(c830690WiJ2, "StoryPhotoModePublisher", C2188811AlT.LIZIZ(sbLIZ2));
                C1434650nR9 c1434650nR9LIZIZ = LIZIZ(((C1433210nOp) ((C1433500nPI) C13LP.LJJJJZI(arrayList)).LLILZIL.LIZLLL).LIZ);
                storyGroupPublishModel.failedCount = arrayList.size();
                IAVPublishService iAVPublishServicePublishService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
                PublishFailureReason publishFailureReason = new PublishFailureReason(c1434650nR9LIZIZ, c1434650nR9LIZIZ.retrieveServerErrorInfo().getFirst().booleanValue(), "story group publish failed", iAVPublishServicePublishService.getErrorMsg(c19eg, c1434650nR9LIZIZ, c19eg.getString(R.string.rn4)));
                if (publishModel != null && (baseShortVideoContext = publishModel.editModel) != null) {
                    draftPrimaryKey = baseShortVideoContext.getDraftPrimaryKey();
                }
                iAVPublishServicePublishService.showUploadRecoverIfNeed(publishFailureReason, c19eg, publishModel, draftPrimaryKey, true, false);
                return;
            }
            C1AF0.LIZJ("notify_story_group_failed_activity_is_null");
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
