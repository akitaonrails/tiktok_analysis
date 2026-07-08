package X;

import android.app.Activity;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CUA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CUA {
    public static boolean LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static C0CTO LJIIIIZZ;
    public static C0CTN LJIIIZ;
    public static boolean LJIIJ;
    public static final C0CUA LIZ = new C0CUA();
    public static final Set<C0CTS> LJFF = new LinkedHashSet();
    public static final C01GW LJI = C452501pT.LIZ(EnumC452301pR.NONE, new C0CU9());
    public static final C054G LJII = C2296808zG.LIZ(new C2232408os(C823050WQl.LIZLLL()).plus(C2296908zH.LIZ()));

    public static JSONObject LIZIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_nuj", LJIIJ ? 1 : 0);
        if (LJIIJ) {
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, LIZIZ ? 1 : 0);
            jSONObject.put("nuj_duration", LJ - LIZJ);
            long j = LIZLLL;
            if (j > 0) {
                jSONObject.put("load_time", j - LIZJ);
            }
            Set<C0CTS> set = LJFF;
            if (!set.isEmpty()) {
                jSONObject.put("error_reason", C13LP.LJJLIIIJ(set, ",", null, null, 0, null, AFwS232S0000000_4.get$arr$(251), 30));
            }
        }
        return jSONObject;
    }

    public static boolean LIZJ() {
        if (!((Boolean) LJI.getValue()).booleanValue()) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("HomeTabNujLaunchHelper", "nujCheck isFirstInstallAndFirstLaunch false");
            return false;
        }
        int iLJJIJIIJI = C19254610Um.LIZIZ.LJJIJIIJI();
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        boolean z = C10RS.LIZ().LIZ;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("nujCheck status: ");
        sbLIZ.append(iLJJIJIIJI);
        sbLIZ.append(", showed: ");
        sbLIZ.append(z);
        C1720106oR.LJI("HomeTabNujLaunchHelper", C2188811AlT.LIZIZ(sbLIZ));
        return (iLJJIJIIJI == 3 || z) ? false : true;
    }

    public static C19EG LIZ() {
        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
            if (abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) {
                Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
                if (activityLIZIZ != null) {
                    return C1388190mED.LIZIZ(activityLIZIZ);
                }
                return null;
            }
        }
        return null;
    }

    public static void LJ(TabConfig tabConfig) {
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryUpdateTabFcpConfig, tabFcpConfig: ");
        sbLIZ.append(tabConfig);
        C1720106oR.LJI("HomeTabNujLaunchHelper", C2188811AlT.LIZIZ(sbLIZ));
        Boolean bool = tabConfig.isJsonIllegal;
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.LJFF(bool, bool2)) {
            if (LIZIZ) {
                C0CXN.LIZ.getClass();
                if (Intrinsics.LJFF(tabConfig, C0CXN.LIZJ())) {
                    return;
                }
            }
            C1720106oR.LJI("HomeTabNujLaunchHelper", "tryUpdateTabFcpConfig tab fcp config changed ");
            if (LIZJ()) {
                C19EG c19egLIZ = LIZ();
                if (c19egLIZ != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZ)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                    C0CXN.LIZ.getClass();
                    C0CXN.LJFF = tabConfig;
                    if (!Intrinsics.LJFF(C0CXN.LJFF.isJsonIllegal, bool2)) {
                        C0CXN.LIZ(C0CXN.LJFF);
                    }
                    homeTabAbilityLIZ.qP1(EnumC1585090rLn.NUJ);
                    IMFToolBarAbility iMFToolBarAbilityLIZ = C0CUL.LIZ(mainActivityScopeLIZJ);
                    if (iMFToolBarAbilityLIZ != null) {
                        iMFToolBarAbilityLIZ.bv(false, true);
                    }
                    C0CUC c0cuc = C0CUB.LIZ.get(EnumC12936054k.STORY_TOOLBAR_ASSEM);
                    if (c0cuc != null) {
                        c0cuc.LIZ.invoke();
                    }
                    StringBuilder sb = new StringBuilder("updateTabs finished top tabs:");
                    List listL32 = homeTabAbilityLIZ.l32();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listL32, 10));
                    Iterator it2 = listL32.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((InterfaceC1583870rJp) it2.next()).tag());
                    }
                    sb.append(arrayList);
                    sb.append(", bottomTabs: ");
                    List<InterfaceC1583870rJp> listTz = homeTabAbilityLIZ.Tz();
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listTz, 10));
                    Iterator<InterfaceC1583870rJp> it3 = listTz.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(it3.next().tag());
                    }
                    int i2 = C2187451AjH.LIZ;
                    sb.append(arrayList2);
                    C1720106oR.LJI("HomeTabNujLaunchHelper", sb.toString());
                    C1720106oR.LJI("HomeTabNujLaunchHelper", "tryUpdateTabFcpConfig success");
                    LIZIZ = true;
                    LIZLLL(true, null);
                    return;
                }
                C1720106oR.LJI("HomeTabNujLaunchHelper", "tryUpdateTabFcpConfig failure, ability is null");
                LIZLLL(false, C0CTS.LLILZLL);
                return;
            }
            C1720106oR.LIZ("HomeTabNujLaunchHelper", "tryUpdateTabFcpConfig failure, nuj finished");
            LIZLLL(false, C0CTS.LLILZIL);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onNewUserJourneyFinishEvent(C0DNB c0dnb) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNewUserJourneyFinishEvent: ");
        sbLIZ.append(LIZJ());
        sbLIZ.append(", hasRefreshTab: ");
        sbLIZ.append(LIZIZ);
        sbLIZ.append(", errorReason: ");
        Set<C0CTS> set = LJFF;
        sbLIZ.append(set);
        C1720106oR.LJI("HomeTabNujLaunchHelper", C2188811AlT.LIZIZ(sbLIZ));
        LJ = System.currentTimeMillis();
        EventBus.LIZLLL().LJJI(this);
        C0C5P c0c5pLIZJ = C0C5P.LIZJ();
        C0CTN c0ctn = LJIIIZ;
        synchronized (c0c5pLIZJ.LJI) {
            try {
                ((HashSet) c0c5pLIZJ.LJI).remove(c0ctn);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C0C5P.LIZJ().LJIJ("tab_fcp_config_v2", LJIIIIZZ);
        LJIIIZ = null;
        LJIIIIZZ = null;
        if (LJIIJ) {
            if (!LIZIZ && set.isEmpty()) {
                set.add(C0CTS.LLILLJJLI);
                LIZLLL = System.currentTimeMillis();
            }
            C19EG c19egLIZ = LIZ();
            if (c19egLIZ != null) {
                C23250099c.LIZLLL(LJII, null, null, new C0CTM(c19egLIZ, null), 3);
            }
        }
        C19EG c19egLIZ2 = LIZ();
        if (c19egLIZ2 != null) {
            C343520DdO c343520DdO = C343520DdO.LIZ;
            EnumC1585090rLn enumC1585090rLn = EnumC1585090rLn.NUJ_END;
            c343520DdO.getClass();
            C343520DdO.LJ(c19egLIZ2, enumC1585090rLn);
        }
    }

    public static void LIZLLL(boolean z, C0CTS c0cts) {
        if (c0cts != null) {
            LJFF.add(c0cts);
        }
        LIZLLL = System.currentTimeMillis();
        C19EG c19egLIZ = LIZ();
        if (c19egLIZ == null) {
            return;
        }
        C054G c054g = LJII;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c054g, C2107308Nj.LIZ, null, new C0CTR(c19egLIZ, z, c0cts, null), 2);
    }
}
