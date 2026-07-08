package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StreakStoryFeature;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelData;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelResConfig;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakMilestoneConf;
import com.ss.android.ugc.aweme.im.streak.api.StreakResDebugInfo;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetResourceInfo;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakFeedbackUploadInfo;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakFeedbackUserUploadInfo;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakPetFeedbackUserUploadInfo;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakResourceFeedbackUploadInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Fc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1576206Fc {
    public static final C01GW<C1576206Fc> LJI = C452501pT.LIZIZ(new C06GJ());
    public final InterfaceC461710I8r LIZ;
    public final int LIZIZ;
    public final Object LIZJ;
    public final LinkedList<C06GI> LIZLLL;
    public final LinkedList<C1572606Ds> LJ;
    public final ConcurrentHashMap<String, Function0<Pair<String, String>>> LJFF;

    public C1576206Fc() {
        this(0);
    }

    public final void LIZ() {
        synchronized (this.LIZJ) {
            try {
                this.LIZLLL.clear();
                this.LJ.clear();
                this.LJFF.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1576206Fc(int i) {
        InterfaceC461710I8r interfaceC461710I8rLIZ = C0I0B.LJFF.LIZ();
        int iIntValue = ((Number) C06GK.LIZ.getValue()).intValue();
        Object obj = new Object();
        this.LIZ = interfaceC461710I8rLIZ;
        this.LIZIZ = iIntValue;
        this.LIZJ = obj;
        this.LIZLLL = new LinkedList<>();
        this.LJ = new LinkedList<>();
        this.LJFF = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.im.streak.impl.utils.StreakFeedbackUserUploadInfo LIZJ(X.C06GI r48) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1576206Fc.LIZJ(X.06GI):com.ss.android.ugc.aweme.im.streak.impl.utils.StreakFeedbackUserUploadInfo");
    }

    public final String LIZLLL(List<StreakFeedbackUserUploadInfo> list) {
        String str;
        StreakResDebugInfo streakResDebugInfoLIZ;
        Boolean first;
        Boolean boolValueOf;
        List listLJLJJLL;
        StreakPetFeedbackUserUploadInfo streakPetFeedbackUserUploadInfo;
        boolean z;
        List<StreakLevelData> levelDataList;
        StreakLevelData streakLevelData;
        StreakLevelResConfig streakLevelResConfig;
        Pair<Boolean, Boolean> pairLIZ;
        C06GV c06gv;
        C06GZ c06gz;
        StreakResDebugInfo streakResDebugInfoLIZ2;
        String id = Calendar.getInstance().getTimeZone().getID();
        C1578606Ga c1578606Ga = C06GU.LIZIZ;
        if (c1578606Ga != null && (c06gv = c1578606Ga.LIZ) != null && (c06gz = c06gv.LIZ) != null && (streakResDebugInfoLIZ2 = c06gz.LIZ()) != null) {
            str = streakResDebugInfoLIZ2.providerName;
        } else {
            str = null;
        }
        StreakResDebugInfo[] streakResDebugInfoArr = new StreakResDebugInfo[2];
        streakResDebugInfoArr[0] = C06GU.LIZLLL.LIZ.LIZ();
        C06GZ c06gz2 = C06GU.LIZLLL.LIZIZ;
        if (c06gz2 != null) {
            streakResDebugInfoLIZ = c06gz2.LIZ();
        } else {
            streakResDebugInfoLIZ = null;
        }
        streakResDebugInfoArr[1] = streakResDebugInfoLIZ;
        Pair pair = new Pair(str, C13LQ.LJIJI(streakResDebugInfoArr));
        String str2 = (String) pair.getFirst();
        List list2 = (List) pair.getSecond();
        Gson gson = C09EF.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        StreakStoryFeature streakStoryFeatureLIZ = StreakStoryFeature.LIZ.LIZ();
        if (streakStoryFeatureLIZ != null && (pairLIZ = streakStoryFeatureLIZ.LIZ()) != null) {
            first = pairLIZ.getFirst();
        } else {
            first = null;
        }
        StreakMilestoneConf streakMilestoneConfLIZIZ = C1664306fR.LIZ.LIZIZ();
        if (streakMilestoneConfLIZIZ != null && (levelDataList = streakMilestoneConfLIZIZ.getLevelDataList()) != null && (streakLevelData = (StreakLevelData) C13LP.LJJJLL(levelDataList)) != null && (streakLevelResConfig = streakLevelData.normalResource) != null) {
            boolValueOf = Boolean.valueOf(streakLevelResConfig.isAnimationUnlockKeepLastFrame);
        } else {
            boolValueOf = null;
        }
        StreakResourceFeedbackUploadInfo streakResourceFeedbackUploadInfo = new StreakResourceFeedbackUploadInfo(str2, list2, first, boolValueOf);
        synchronized (this.LIZJ) {
            try {
                LinkedList<C1572606Ds> linkedList = this.LJ;
                ArrayList arrayList = new ArrayList();
                for (C1572606Ds c1572606Ds : linkedList) {
                    if (!this.LIZ.LIZJ(c1572606Ds.LIZJ)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(c1572606Ds);
                    }
                }
                listLJLJJLL = C13LP.LJLJJLL(arrayList);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listLJLJJLL.iterator();
        while (it2.hasNext()) {
            StreakPetData streakPetData = ((C1572606Ds) it2.next()).LIZIZ;
            if (streakPetData != null) {
                C1582706Hp.LJII.getClass();
                streakPetFeedbackUserUploadInfo = new StreakPetFeedbackUserUploadInfo(streakPetData.conversationId, streakPetData.status, streakPetData.inviterUid, streakPetData.experiencePoints, streakPetData.expForLevel, streakPetData.name, streakPetData.isHidden, streakPetData.streakPetAnimState, C1582706Hp.LJIIIZ.LIZIZ(streakPetData.conversationId, "key_streak_pet_exp_value"), streakPetData.createTime, streakPetData.hatchingTimestampInSeconds, streakPetData.subStatus, streakPetData.isEggHidden);
            } else {
                streakPetFeedbackUserUploadInfo = null;
            }
            if (streakPetFeedbackUserUploadInfo != null) {
                arrayList2.add(streakPetFeedbackUserUploadInfo);
            }
        }
        boolean zLIZ = C15546066u.LIZ();
        C06I0.LIZIZ.getClass();
        StreakPetResourceInfo streakPetResourceInfo = new StreakPetResourceInfo(C13LP.LJLIL(C06I0.LJIIIZ.values(), C13LP.LJLIL(C06I0.LJIIIIZZ.values(), C06I0.LJI.values())));
        Keva keva = (Keva) C2252271DDl.LIZIZ.getValue().LIZ.getValue();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        return GsonProtectorUtils.toJson(gson, new StreakFeedbackUploadInfo(jCurrentTimeMillis, id, list, streakResourceFeedbackUploadInfo, zLIZ, arrayList2, streakPetResourceInfo, keva.getLong(curUserId, 0L)));
    }

    public final void LIZIZ(StreakPetData streakPetData, String str) {
        synchronized (this.LIZJ) {
            try {
                Iterator<C1572606Ds> it2 = this.LJ.iterator();
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        C1572606Ds next = it2.next();
                        if (Intrinsics.LJFF(next.LIZ, str) && C1572306Dp.LIZ(next.LIZJ)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                StreakPetData streakPetDataLIZ = null;
                if (i != -1) {
                    C1572606Ds c1572606DsRemove = this.LJ.remove(i);
                    LinkedList<C1572606Ds> linkedList = this.LJ;
                    if (streakPetData != null) {
                        streakPetDataLIZ = StreakPetData.LIZ(streakPetData, false, null, false, null, null, 524287);
                    }
                    c1572606DsRemove.LIZIZ = streakPetDataLIZ;
                    linkedList.offer(c1572606DsRemove);
                } else {
                    if (this.LJ.size() >= this.LIZIZ) {
                        this.LJ.poll();
                    }
                    LinkedList<C1572606Ds> linkedList2 = this.LJ;
                    if (streakPetData != null) {
                        streakPetDataLIZ = StreakPetData.LIZ(streakPetData, false, null, false, null, null, 524287);
                    }
                    String curUserId = this.LIZ.getCurUserId();
                    if (curUserId == null) {
                        curUserId = "";
                    }
                    linkedList2.offer(new C1572606Ds(str, streakPetDataLIZ, curUserId));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
