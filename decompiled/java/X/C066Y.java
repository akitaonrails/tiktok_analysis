package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.066Y, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C066Y {
    public static final C066Y LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final Map<String, Set<String>> LIZLLL;
    public static final C054G LJ;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C066Y.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C066Y c066y = new C066Y();
        LIZIZ = c066y;
        LIZLLL = new LinkedHashMap();
        C1598406Nq c1598406Nq = c066y.LIZ;
        if (c1598406Nq == null) {
            synchronized (c066y) {
                c1598406Nq = c066y.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c066y.LIZ = c1598406Nq;
                }
            }
        }
        LJ = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
    }

    public static void LIZJ(C066Y c066y, String str, boolean z) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c066y.getClass();
        C23250099c.LIZLLL(LJ, null, null, new C1514205wK(z, interfaceC1493505szLIZIZ, str, null), 3);
    }

    public static void LIZIZ(Map map, String str, Set set, StreakData streakData, StreakPetData streakPetData) {
        boolean z;
        boolean z2;
        int i;
        Object obj;
        String str2;
        if (streakData == null) {
            C1575806Ey.LIZJ.getClass();
            streakData = C1575806Ey.LJIIIIZZ(str);
        }
        if (streakPetData == null) {
            C06C6.LIZIZ.getClass();
            streakPetData = C06C6.LIZIZ(str);
        }
        boolean zLIZLLL = C1567806Bw.LIZLLL(streakData);
        boolean z3 = false;
        if (streakPetData != null && streakPetData.status == C06G0.StreakPetStatus_Active.getValue()) {
            z = true;
        } else {
            z = false;
        }
        if (streakData != null && C1567806Bw.LJFF(streakData)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!set.contains("pet_type")) {
            if (z2) {
                str2 = "normal";
            } else {
                str2 = "egg";
            }
            map.put("pet_type", str2);
        }
        String str3 = "1";
        if (!set.contains("is_streak_pet_available")) {
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_streak_pet_available", obj);
        }
        EnumC1579606Gk enumC1579606GkLJIIIIZZ = null;
        if (streakPetData != null) {
            Integer numValueOf = Integer.valueOf(C1571306Df.LIZ(streakPetData));
            numValueOf.intValue();
            if (!set.contains("streak_pet_level")) {
                numValueOf.intValue();
                if (z) {
                    numValueOf.intValue();
                    if (z2) {
                        map.put("streak_pet_level", String.valueOf(numValueOf.intValue()));
                    }
                }
            }
        }
        if (zLIZLLL && streakData != null) {
            i = streakData.streak;
        } else {
            i = 0;
        }
        if (!set.contains("streak_cnt") && z2) {
            map.put("streak_cnt", String.valueOf(i));
        }
        if (i >= 3) {
            if (streakData != null) {
                enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakData, false);
            }
            if (enumC1579606GkLJIIIIZZ == EnumC1579606Gk.SECONDARY_ACTIVE) {
                z3 = true;
            }
            if (!set.contains("is_grey")) {
                if (!z3) {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_grey", str3);
            }
        }
    }

    public static void LIZ(C066Y c066y, Map map, String str, Set set, StreakData streakData, int i) {
        if ((i & 4) != 0) {
            streakData = null;
        }
        c066y.getClass();
        LIZIZ(C19719512Dh.LIZJ(map), str, set, streakData, null);
    }
}
