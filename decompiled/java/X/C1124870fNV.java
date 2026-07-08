package X;

import Y.AObjectS360S0100000_17;
import Y.ARunnableS117S0100000_17;
import Y.AfS36S1000000_17;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.android.livesdk.i18n.I18nDbManager;
import com.bytedance.android.livesdk.i18n.I18nUpdateManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveI18nCenterInitOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveI18nCenterInitOptSettingV2;
import com.bytedance.android.livesdk.livesetting.performance.LiveI18nCenterTaskScheduleExp;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.keva.Keva;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0fNV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124870fNV {
    public static C1124870fNV LIZ;

    public static C1124870fNV LIZJ() {
        if (LIZ == null) {
            LIZ = new C1124870fNV();
        }
        return LIZ;
    }

    public static boolean LIZLLL() {
        return LiveI18nCenterInitOptSetting.INSTANCE.isEnable();
    }

    public static void LJ() {
        if (LiveI18nCenterInitOptSettingV2.INSTANCE.isEnable()) {
            if (C1124880fNW.LJIIL == null) {
                C1124880fNW.LJIIL = new C1124880fNW();
            }
            C1124880fNW c1124880fNW = C1124880fNW.LJIIL;
            c1124880fNW.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - c1124880fNW.LJIIJJI < r2.getSaveCacheFreqCtrTimeMs()) {
                C20441214yg.LJIIIZ("i18n_translation", "try save cache on freq ctr period, return directly");
                c1124880fNW.LJIIJJI = jCurrentTimeMillis;
            } else {
                c1124880fNW.LJIIJJI = jCurrentTimeMillis;
                C823050WQl.LIZIZ().execute(new ARunnableS117S0100000_17(c1124880fNW, 95));
            }
        }
    }

    public static C11NZ LIZ(String str) {
        Object obj;
        if (LIZLLL()) {
            if (C1124820fNQ.LIZJ == null) {
                C1124820fNQ.LIZJ = new C1124820fNQ();
            }
            C1124820fNQ c1124820fNQ = C1124820fNQ.LIZJ;
            if (c1124820fNQ.LIZ.containsKey(str)) {
                obj = c1124820fNQ.LIZ.get(str);
            } else {
                if (((ConcurrentHashMap) c1124820fNQ.LIZIZ).containsKey(str)) {
                    obj = ((ConcurrentHashMap) c1124820fNQ.LIZIZ).get(str);
                }
                return C11NZ.LJIJJLI(new C1151870g53(c1124820fNQ, str, 1)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJI(new AfS36S1000000_17(str, 2));
            }
            if (obj != null) {
                if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
                    return C11NZ.LJJJJZ(new C1096190edF(obj));
                }
                return C11NZ.LJJJJZ(new C1096190edF(obj)).LJJJLZIJ(C1701940uOG.LIZIZ());
            }
            return C11NZ.LJIJJLI(new C1151870g53(c1124820fNQ, str, 1)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJI(new AfS36S1000000_17(str, 2));
        }
        return C11NZ.LJJJJZ(new C1096190edF(null));
    }

    public static String LIZIZ(String str) {
        if (LiveI18nCenterInitOptSettingV2.INSTANCE.isEnable()) {
            if (C1124880fNW.LJIIL == null) {
                C1124880fNW.LJIIL = new C1124880fNW();
            }
            C1124880fNW c1124880fNW = C1124880fNW.LJIIL;
            c1124880fNW.getClass();
            if (!TextUtils.isEmpty(str)) {
                C1124830fNR.LIZ.addAndGet(1);
                String str2 = c1124880fNW.LIZLLL.get(str);
                if (str2 != null) {
                    C1124830fNR.LIZIZ.addAndGet(1);
                    return str2;
                }
                String string = C1124940fNc.LIZ().getString(str, "");
                if (string != null && string.length() > 0) {
                    c1124880fNW.LIZLLL.put(str, string);
                    return string;
                }
            }
            return null;
        }
        if (C1124890fNX.LJIIIIZZ == null) {
            C1124890fNX.LJIIIIZZ = new C1124890fNX();
        }
        C1124890fNX c1124890fNX = C1124890fNX.LJIIIIZZ;
        c1124890fNX.getClass();
        if (!TextUtils.isEmpty(str)) {
            if (!c1124890fNX.LIZLLL.containsKey(str)) {
                I18nUpdateManager i18nUpdateManager = c1124890fNX.LJ;
                if (i18nUpdateManager != null) {
                    i18nUpdateManager.LIZJ(c1124890fNX.LIZIZ, c1124890fNX.LIZJ);
                }
            } else {
                return c1124890fNX.LIZLLL.get(str);
            }
        }
        return null;
    }

    public static void LJFF(int i, Locale locale) {
        if (LiveI18nCenterInitOptSettingV2.INSTANCE.isEnable()) {
            if (C1124880fNW.LJIIL == null) {
                C1124880fNW.LJIIL = new C1124880fNW();
            }
            C1124880fNW c1124880fNW = C1124880fNW.LJIIL;
            c1124880fNW.getClass();
            C20441214yg.LIZIZ("i18n_translation", "wanna switch locale");
            if (locale == null) {
                C20441214yg.LJ("i18n_translation", "new locale is empty, return");
                return;
            }
            LruCache<Integer, String> lruCache = C0SRQ.LIZ;
            String lowerCase = C837920Wty.LIZIZ(locale).toLowerCase();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.t2(locale));
            sbLIZ.append("_");
            sbLIZ.append(lowerCase);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("new locale is ");
            sbLIZ2.append(strLIZIZ);
            C20441214yg.LIZIZ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ2));
            if (TextUtils.equals(strLIZIZ, c1124880fNW.LIZ)) {
                C20441214yg.LIZIZ("i18n_translation", "new locale is equals to current locale, return");
                return;
            }
            I18nUpdateManager i18nUpdateManager = c1124880fNW.LJI;
            if (i18nUpdateManager != null) {
                i18nUpdateManager.LIZ();
            }
            c1124880fNW.LIZLLL.clear();
            c1124880fNW.LIZIZ = 0L;
            c1124880fNW.LIZJ = null;
            c1124880fNW.LJII = null;
            c1124880fNW.LJII = new I18nDbManager(strLIZIZ, null);
            InterfaceC420801kM interfaceC420801kM = c1124880fNW.LJIIIZ;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
                c1124880fNW.LJIIIZ = null;
            }
            c1124880fNW.LJIIIZ = c1124880fNW.LJII.clearTranslationDB();
            c1124880fNW.LJI = new I18nUpdateManager(strLIZIZ, c1124880fNW.LJIIJ, i);
            if (TextUtils.isEmpty(c1124880fNW.LIZ)) {
                C20441214yg.LIZIZ("i18n_translation", "switch locale when app start, first query keva");
                if (LiveI18nCenterTaskScheduleExp.INSTANCE.isEnable(i)) {
                    ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).commitPTFTask("live_i18n_center_fetch_hot_key", null, new ARunnableS117S0100000_17(c1124880fNW, 96));
                } else {
                    AObjectS360S0100000_17 aObjectS360S0100000_17 = new AObjectS360S0100000_17(c1124880fNW, 79);
                    AbstractC19484711Kz.LJII(C1094540eaa.LL).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new C516201zk(aObjectS360S0100000_17, 82), new C516201zk(aObjectS360S0100000_17, 83));
                }
            } else {
                C20441214yg.LIZIZ("i18n_translation", "switch locale during app running, directly query api");
                c1124880fNW.LJI.LIZJ(c1124880fNW.LIZIZ, c1124880fNW.LIZJ);
            }
            c1124880fNW.LIZ = strLIZIZ;
            return;
        }
        if (C1124890fNX.LJIIIIZZ == null) {
            C1124890fNX.LJIIIIZZ = new C1124890fNX();
        }
        C1124890fNX c1124890fNX = C1124890fNX.LJIIIIZZ;
        c1124890fNX.getClass();
        C20441214yg.LIZIZ("i18n_translation", "wanna switch locale");
        if (locale == null) {
            C20441214yg.LJ("i18n_translation", "new locale is empty, return");
            return;
        }
        LruCache<Integer, String> lruCache2 = C0SRQ.LIZ;
        String lowerCase2 = C837920Wty.LIZIZ(locale).toLowerCase();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(C786410Ut5.t2(locale));
        sbLIZ3.append("_");
        sbLIZ3.append(lowerCase2);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("new locale is ");
        sbLIZ4.append(strLIZIZ2);
        C20441214yg.LIZIZ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ4));
        if (TextUtils.equals(strLIZIZ2, c1124890fNX.LIZ)) {
            C20441214yg.LIZIZ("i18n_translation", "new locale is equals to current locale, return");
            return;
        }
        I18nUpdateManager i18nUpdateManager2 = c1124890fNX.LJ;
        if (i18nUpdateManager2 != null) {
            i18nUpdateManager2.LIZ();
        }
        I18nDbManager i18nDbManager = c1124890fNX.LJI;
        if (i18nDbManager != null) {
            i18nDbManager.destroy();
        }
        c1124890fNX.LIZLLL.clear();
        c1124890fNX.LIZIZ = 0L;
        c1124890fNX.LIZJ = null;
        c1124890fNX.LJI = new I18nDbManager(strLIZIZ2, c1124890fNX.LJII);
        C11JL c11jl = C1124940fNc.LIZ;
        if (c11jl != null) {
            c11jl.dispose();
        }
        C1124940fNc.LIZ = (C11JL) AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0ebA
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<Unit> interfaceC2329309At) {
                C1124940fNc.LIZ().clear();
                ((Keva) C1124940fNc.LIZIZ.getValue()).clear();
                interfaceC2329309At.onSuccess(Unit.LIZ);
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new C09JN() { // from class: X.07xL
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("I18nKevaManager@9da7.clearAllKevaTranslation$2");
                C20441214yg.LJIIIZ("i18n_translation", "clear all keva translation success");
                C1C7U.LIZIZ("I18nKevaManager@9da7.clearAllKevaTranslation$2");
            }
        }, new C09JN() { // from class: X.07xM
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("I18nKevaManager@9da7.clearAllKevaTranslation$3");
                C20441214yg.LJ("i18n_translation", "clear all keva translation error");
                C1C7U.LIZIZ("I18nKevaManager@9da7.clearAllKevaTranslation$3");
            }
        });
        c1124890fNX.LJ = new I18nUpdateManager(strLIZIZ2, c1124890fNX.LJFF, i);
        if (TextUtils.isEmpty(c1124890fNX.LIZ)) {
            C20441214yg.LIZIZ("i18n_translation", "switch locale when app start, first query db");
            c1124890fNX.LJI.queryTranslations();
        } else {
            C20441214yg.LIZIZ("i18n_translation", "switch locale during app running, directly query api");
            c1124890fNX.LJ.LIZJ(c1124890fNX.LIZIZ, c1124890fNX.LIZJ);
        }
        c1124890fNX.LIZ = strLIZIZ2;
    }
}
