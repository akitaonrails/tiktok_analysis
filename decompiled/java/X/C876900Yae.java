package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomService;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushExperienceOptimize;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushReverseExp;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.tako.ITakoLaunchService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876900Yae {
    public static boolean LIZIZ;
    public static final C876900Yae LIZ = new C876900Yae();
    public static int LIZJ = 2;
    public static final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
    public static final List<InterfaceC876750YaP> LJ = new ArrayList();
    public static final Map<String, Integer> LJFF = new LinkedHashMap();
    public static final C01GW LJI = C452501pT.LIZIZ(new C876910Yaf());
    public static final List<Integer> LJII = C1697810uHb.LJIIJJI(10, 9, 11, 12, 13, 14, 15);

    public static int LIZ() {
        if (!LIZIZ) {
            LIZJ = LIZLLL(new LinkedHashMap());
        }
        return LIZJ;
    }

    public static Activity LIZIZ() {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) {
            return null;
        }
        return C1388190mED.LIZ(activityLIZIZ);
    }

    public static List LIZJ(Map map) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (C19212010Ec.LIZJ.LIZJ() == C05RV.PERSONAL_INBOX) {
            z = true;
        } else {
            z = false;
        }
        if (InnerPushReverseExp.LIZ() && C13LQ.LJIILJJIL(21, (int[]) InnerPushReverseExp.LIZJ.getValue()) && z) {
            if (map != null) {
                map.put("avoid_reason", "reverse_exp");
            }
            arrayList.add("reverse_exp");
        }
        if (!C19328310jZ.LIZIZ.LJFF()) {
            if (map != null) {
                map.put("avoid_reason", "setting_off");
            }
            arrayList.add("setting_off");
        }
        if (((IIMChatRoomService) LJI.getValue()).LJ(LIZIZ())) {
            if (map != null) {
                map.put("avoid_reason", "im_page");
            }
            arrayList.add("im_page");
        }
        if (((LinkedHashMap) LJFF).containsValue(2)) {
            if (map != null) {
                map.put("avoid_reason", "blocking_map");
            }
            arrayList.add("blocking_map");
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009b A[PHI: r1
      0x009b: PHI (r1v19 X.0Yag) = (r1v12 X.0Yag), (r1v14 X.0Yag), (r1v20 X.0Yag) binds: [B:22:0x0040, B:15:0x002e, B:8:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZLLL(java.util.Map r6) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C876900Yae.LIZLLL(java.util.Map):int");
    }

    public static boolean LJ(boolean z) {
        if (z) {
            if (LIZ() != 2) {
                return false;
            }
            return true;
        }
        if (LIZ() != 2 && (!C13LQ.LJIILJJIL(21, (int[]) InnerPushExperienceOptimize.LJI.getValue()) || !C19212010Ec.LIZJ.LJJIJIIJI())) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(C879180YeK c879180YeK) {
        C869590Y9l c869590Y9l;
        if (c879180YeK != null && (c869590Y9l = c879180YeK.LIZLLL) != null && C876780YaS.LIZ(c869590Y9l)) {
            if (LIZ() == 0) {
                return true;
            }
            return false;
        }
        if (LIZ() == 0) {
            if (!C13LQ.LJIILJJIL(21, (int[]) InnerPushExperienceOptimize.LJI.getValue()) || !C19212010Ec.LIZJ.LJJIJIIJI()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final synchronized void LJII(int i, String str) {
        if (i == 0) {
            LJFF.remove(str);
        } else {
            LJFF.put(str, Integer.valueOf(i));
        }
        int iLIZLLL = LIZLLL(new LinkedHashMap());
        if (LIZ() != iLIZLLL) {
            LIZ();
            LIZJ = iLIZLLL;
            Iterator it2 = ((ArrayList) LJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC876750YaP) it2.next()).LIZ(iLIZLLL);
            }
        }
    }

    public final void LJI(int i, String str, String str2) {
        ITakoLaunchService iTakoLaunchService;
        if (((Boolean) C276340AsK.LIZ.getValue()).booleanValue() && Intrinsics.LJFF(str2, "activity_resume")) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            sAFHelper.getClass();
            if (SAFHelper.LJJJJZ(abstractC1387200mCcLJ) || ((iTakoLaunchService = (ITakoLaunchService) C876930Yah.LIZ.getValue()) != null && iTakoLaunchService.LJ(C1906580ziK.LJ()))) {
                C23250099c.LIZLLL(LIZLLL, null, null, new C313860CSa(i, str, str2, null), 3);
                return;
            }
        }
        LJII(i, str);
    }
}
