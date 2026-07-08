package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventStickerData;
import com.ss.android.ugc.aweme.social.sticker.model.base.RelationshipCelebrationInfo;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zaf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902390Zaf {
    public static final C902390Zaf LIZ = new C902390Zaf();
    public static final Map<String, List<RelationshipCelebrationInfo>> LIZIZ = Collections.synchronizedMap(new LinkedHashMap());
    public static final Map<String, Map<String, StorySocialEventStickerData>> LIZJ = Collections.synchronizedMap(new LinkedHashMap());
    public static final Map<String, Boolean> LIZLLL = Collections.synchronizedMap(new LinkedHashMap());
    public static final Map<String, String> LJ = Collections.synchronizedMap(new LinkedHashMap());
    public static final Map<String, Function0<Unit>> LJFF = Collections.synchronizedMap(new LinkedHashMap());
    public static final StoryFriendAnniversaryService LJI = (StoryFriendAnniversaryService) PluggableExtentionKt.pluggableSpi$default(StoryFriendAnniversaryService.class, false, false, false, 14, null);
    public static final Keva LJII = Keva.getRepo("relation_celebration");
    public static final List<InterfaceC420801kM> LJIIIIZZ = new ArrayList();

    public static long LIZIZ(RelationshipCelebrationTarget relationshipCelebrationTarget) {
        String curUserId;
        List<RelationshipCelebrationInfo> list;
        if (relationshipCelebrationTarget == null || (curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) == null || (list = LIZIZ.get(curUserId)) == null) {
            return 0L;
        }
        for (RelationshipCelebrationInfo relationshipCelebrationInfo : list) {
            List<RelationshipCelebrationTarget> list2 = relationshipCelebrationInfo.celebratingTargets;
            if (list2 != null) {
                Iterator<RelationshipCelebrationTarget> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(relationshipCelebrationTarget, it2.next())) {
                        Long l = relationshipCelebrationInfo.celebrationStartTime;
                        if (l == null) {
                            return 0L;
                        }
                        return l.longValue();
                    }
                }
            }
        }
        return 0L;
    }

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fake_msg_uuid");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static StorySocialEventStickerData LIZLLL(String str) {
        StorySocialEventStickerData storySocialEventStickerData;
        StorySocialEventStickerData storySocialEventStickerData2;
        Long l;
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCelebrationMaterialByUid 1 ");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        C2188811AlT.LIZIZ(sbLIZ);
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList();
        List<RelationshipCelebrationInfo> list = LIZIZ.get(curUserId);
        if (list != null) {
            for (RelationshipCelebrationInfo relationshipCelebrationInfo : list) {
                List<RelationshipCelebrationTarget> list2 = relationshipCelebrationInfo.celebratingTargets;
                if (list2 != null) {
                    Iterator<RelationshipCelebrationTarget> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().celebratingUserId, str) && (l = relationshipCelebrationInfo.celebrationStartTime) != null && (string = l.toString()) != null) {
                            arrayList.add(string);
                        }
                    }
                }
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getCelebrationMaterialByUid 2  ");
        sbLIZ2.append(arrayList.size());
        C2188811AlT.LIZIZ(sbLIZ2);
        if (arrayList.isEmpty()) {
            return null;
        }
        for (String str2 : arrayList) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getCelebrationMaterialByUid 3 ");
            Map<String, Map<String, StorySocialEventStickerData>> map = LIZJ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(curUserId);
            sbLIZ4.append(str2);
            Map<String, StorySocialEventStickerData> map2 = map.get(C2188811AlT.LIZIZ(sbLIZ4));
            if (map2 != null) {
                storySocialEventStickerData = map2.get(str);
            } else {
                storySocialEventStickerData = null;
            }
            sbLIZ3.append(storySocialEventStickerData);
            C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(curUserId);
            sbLIZ5.append(str2);
            Map<String, StorySocialEventStickerData> map3 = map.get(C2188811AlT.LIZIZ(sbLIZ5));
            if (map3 != null && (storySocialEventStickerData2 = map3.get(str)) != null) {
                return storySocialEventStickerData2;
            }
        }
        return null;
    }

    public static boolean LIZ(String str, String str2, RelationshipCelebrationTarget relationshipCelebrationTarget) {
        if (((Boolean) C0AWV.LIZ.getValue()).booleanValue()) {
            return false;
        }
        String strLJ = LJ(str, str2, relationshipCelebrationTarget);
        if (Intrinsics.LJFF(LIZLLL.get(strLJ), Boolean.TRUE)) {
            return true;
        }
        return LJII.getBoolean(strLJ, false);
    }

    public static String LJ(String str, String str2, RelationshipCelebrationTarget relationshipCelebrationTarget) {
        List<RelationshipCelebrationInfo> list = LIZIZ.get(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String strValueOf = null;
        if (list != null) {
            for (RelationshipCelebrationInfo relationshipCelebrationInfo : list) {
                List<RelationshipCelebrationTarget> list2 = relationshipCelebrationInfo.celebratingTargets;
                if (list2 != null) {
                    for (RelationshipCelebrationTarget relationshipCelebrationTarget2 : list2) {
                        if (Intrinsics.LJFF(relationshipCelebrationTarget.celebratingContent, relationshipCelebrationTarget2.celebratingContent) && Intrinsics.LJFF(relationshipCelebrationTarget.celebratingUserId, relationshipCelebrationTarget2.celebratingUserId)) {
                            strValueOf = String.valueOf(relationshipCelebrationInfo.celebrationStartTime);
                        }
                    }
                }
            }
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(curUserId);
        sbLIZ.append(str);
        sbLIZ.append(str2);
        sbLIZ.append(strValueOf);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJFF(String str, String str2, RelationshipCelebrationTarget relationshipCelebrationTarget) {
        String strLJ = LJ(str, str2, relationshipCelebrationTarget);
        LJII.storeBoolean(strLJ, true);
        LIZLLL.put(strLJ, Boolean.TRUE);
    }
}
