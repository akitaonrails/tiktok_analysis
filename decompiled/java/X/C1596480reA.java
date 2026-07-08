package X;

import com.ss.android.ugc.aweme.bean.MixRankSkylightItem;
import com.ss.android.ugc.aweme.bean.MixRankSkylightItemBizData;
import com.ss.android.ugc.aweme.bean.MixRankSkylightPageControl;
import com.ss.android.ugc.aweme.bean.MixRankSkylightResponse;
import com.ss.android.ugc.aweme.bean.MixRankSkylightSceneResponse;
import com.ss.android.ugc.aweme.bean.MixRankSkylightStory;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0reA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596480reA {
    public static final List<String> LIZ(MixRankSkylightResponse mixRankSkylightResponse, long j) {
        Long l;
        String string;
        List<MixRankSkylightItem> listLIZIZ = LIZIZ(mixRankSkylightResponse, j);
        ArrayList arrayList = null;
        if (listLIZIZ != null) {
            arrayList = new ArrayList();
            for (MixRankSkylightItem mixRankSkylightItem : listLIZIZ) {
                Integer num = mixRankSkylightItem.bizGroup;
                if (num != null && num.intValue() == 2 && (l = mixRankSkylightItem.userId) != null && (string = l.toString()) != null) {
                    arrayList.add(string);
                }
            }
        }
        return arrayList;
    }

    public static final List<MixRankSkylightItem> LIZIZ(MixRankSkylightResponse mixRankSkylightResponse, long j) {
        ArrayList arrayList;
        MixRankSkylightSceneResponse next;
        List<String> list;
        Iterator<MixRankSkylightSceneResponse> it2 = mixRankSkylightResponse.getSceneResponses().iterator();
        while (true) {
            arrayList = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.scene == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        MixRankSkylightSceneResponse mixRankSkylightSceneResponse = next;
        if (mixRankSkylightSceneResponse == null) {
            return null;
        }
        MixRankSkylightPageControl mixRankSkylightPageControl = mixRankSkylightSceneResponse.pageControl;
        if (mixRankSkylightPageControl != null && (list = mixRankSkylightPageControl.sceneEntityIds) != null) {
            arrayList = new ArrayList();
            for (String str : list) {
                Iterator<MixRankSkylightItem> it3 = mixRankSkylightResponse.getSkylightItems().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        MixRankSkylightItem next2 = it3.next();
                        if (Intrinsics.LJFF(next2.entityId, str)) {
                            if (next2 != null) {
                                arrayList.add(next2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final List<Aweme> LIZJ(MixRankSkylightResponse mixRankSkylightResponse, long j) {
        MixRankSkylightItemBizData mixRankSkylightItemBizData;
        MixRankSkylightStory mixRankSkylightStory;
        Aweme aweme;
        List<MixRankSkylightItem> listLIZIZ = LIZIZ(mixRankSkylightResponse, j);
        ArrayList arrayList = null;
        if (listLIZIZ != null) {
            arrayList = new ArrayList();
            for (MixRankSkylightItem mixRankSkylightItem : listLIZIZ) {
                Integer num = mixRankSkylightItem.bizGroup;
                if (num != null && num.intValue() == 1 && (mixRankSkylightItemBizData = mixRankSkylightItem.bizData) != null && (mixRankSkylightStory = mixRankSkylightItemBizData.skylightStory) != null && (aweme = mixRankSkylightStory.aweme) != null) {
                    arrayList.add(aweme);
                }
            }
        }
        return arrayList;
    }

    public static final boolean LIZLLL(MixRankSkylightResponse mixRankSkylightResponse, long j) {
        MixRankSkylightSceneResponse next;
        MixRankSkylightPageControl mixRankSkylightPageControl;
        Iterator<MixRankSkylightSceneResponse> it2 = mixRankSkylightResponse.getSceneResponses().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.scene == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        MixRankSkylightSceneResponse mixRankSkylightSceneResponse = next;
        if (mixRankSkylightSceneResponse != null && (mixRankSkylightPageControl = mixRankSkylightSceneResponse.pageControl) != null && mixRankSkylightPageControl.isDemotion()) {
            return true;
        }
        return false;
    }
}
