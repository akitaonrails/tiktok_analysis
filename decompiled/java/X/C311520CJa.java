package X;

import Y.AComparatorS23S0000000_4;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.api.IDebugConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.absettings.api.IABSettingFetcherConfig;
import com.tiktok.ef.absettings.api.IInitAbSettingsDepend;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311520CJa {
    public static final C311520CJa LIZ = new C311520CJa();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5169));
    public static volatile AtomicBoolean LIZJ = new AtomicBoolean(false);

    public final synchronized void LIZJ() {
        LIZJ.set(false);
    }

    public final synchronized boolean LJIIIIZZ() {
        return LIZJ.compareAndSet(false, true);
    }

    public static C311530CJb LIZLLL() {
        return (C311530CJb) LIZIZ.getValue();
    }

    public static boolean LJII() {
        IABSettingFetcherConfig iABSettingFetcherConfigLIZIZ;
        IInitAbSettingsDepend iInitAbSettingsDepend = (IInitAbSettingsDepend) PluggableExtentionKt.pluggableSpi$default(IInitAbSettingsDepend.class, false, false, false, 14, null);
        return (iInitAbSettingsDepend == null || (iABSettingFetcherConfigLIZIZ = iInitAbSettingsDepend.LIZIZ()) == null || iABSettingFetcherConfigLIZIZ.isForceDisableGroupUpdate() || !((Boolean) C279090Awl.LIZIZ.getValue()).booleanValue()) ? false : true;
    }

    public static void LIZIZ() {
        Iterator<C0CJS> it2 = LIZLLL().LIZIZ.iterator();
        while (it2.hasNext()) {
            int i = it2.next().LIZ;
            Keva kevaLIZLLL = C0CJ2.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetch_config_by_group_info_index_");
            sbLIZ.append(i);
            kevaLIZLLL.erase(C2188811AlT.LIZIZ(sbLIZ));
        }
        LIZLLL().LIZIZ = C08CX.INSTANCE;
        LIZLLL().LIZJ = new LinkedHashSet();
        LJIIIZ(0, C13BV.INSTANCE);
    }

    public static Set LJI() {
        Set<String> set = LIZLLL().LIZJ;
        return (set == null || set.isEmpty()) ? C0CJ2.LIZLLL().getStringSet("white_list", new LinkedHashSet()) : LIZLLL().LIZJ;
    }

    public static boolean LIZ(int i) {
        int i2 = C0CJ2.LIZLLL().getInt("fetch_request_type", -1);
        if (i2 != i && i2 != -1) {
            LIZ.getClass();
            LIZIZ();
            C0CJ2.LJI("{}");
            C0CJ2.LIZLLL().storeInt("fetch_request_type", i);
            return false;
        }
        return true;
    }

    public static Set LJ(List list) {
        Set<C0CJS> set = LIZLLL().LIZIZ;
        ArrayList<C0CJS> arrayList = new ArrayList();
        for (Object obj : set) {
            if (((ArrayList) list).contains(Integer.valueOf(((C0CJS) obj).LIZ))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C0CJS c0cjs : arrayList) {
            if (c0cjs.LIZJ.size() == 0) {
                int i = c0cjs.LIZ;
                Keva kevaLIZLLL = C0CJ2.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetch_config_by_group_info_index_");
                sbLIZ.append(i);
                c0cjs.LIZJ = kevaLIZLLL.getStringSet(C2188811AlT.LIZIZ(sbLIZ), new LinkedHashSet());
            }
            C19719612Di.LJJI(c0cjs.LIZJ, arrayList2);
        }
        return C13LP.LLIIIZ(arrayList2);
    }

    public static Pair LJFF(int i) {
        if (LIZ(i)) {
            C311530CJb c311530CJbLIZLLL = LIZLLL();
            List listLJLLLL = C13LP.LJLLLL(new AComparatorS23S0000000_4(10), c311530CJbLIZLLL.LIZIZ);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJLLLL.iterator();
            while (it2.hasNext()) {
                String str = ((C0CJS) it2.next()).LIZIZ;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            return new Pair(Integer.valueOf(c311530CJbLIZLLL.LIZ), arrayList);
        }
        return new Pair(256, C13BV.INSTANCE);
    }

    public static void LJIIIZ(int i, List list) {
        C0CJ2.LIZLLL().storeInt("fetch_request_type", i);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C0CJS c0cjs = (C0CJS) it2.next();
            int i2 = c0cjs.LIZ;
            Set<String> set = c0cjs.LIZJ;
            Keva kevaLIZLLL = C0CJ2.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetch_config_by_group_info_index_");
            sbLIZ.append(i2);
            kevaLIZLLL.storeStringSet(C2188811AlT.LIZIZ(sbLIZ), set);
        }
        C0CJ2.LIZLLL().storeString("fetch_config_by_group_info", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), LIZLLL()));
        C0CJ2.LIZLLL().storeStringSet("white_list", LIZLLL().LIZJ);
    }

    public static void LJIIL(int i, List list) {
        Set<C0CJS> setLLIIIZ = C13LP.LLIIIZ(LIZLLL().LIZIZ);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((C0CJS) it2.next()).LIZ));
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        Iterator<C0CJS> it3 = setLLIIIZ.iterator();
        while (it3.hasNext()) {
            if (setLLIIJI.contains(Integer.valueOf(it3.next().LIZ))) {
                it3.remove();
            }
        }
        setLLIIIZ.addAll(arrayList2);
        LIZLLL().LIZIZ = setLLIIIZ;
        LJIIIZ(i, arrayList2);
    }

    public static void LJIIJ(n nVar, List list, String[] strArr, Set set, C0CFL c0cfl, C0C7W c0c7w, int i, Function0 function0) {
        boolean zIsOpen;
        try {
            C307900C5c c307900C5c = new C307900C5c();
            c307900C5c.LIZIZ = nVar;
            c307900C5c.LIZJ = nVar;
            c307900C5c.LIZLLL = nVar;
            c307900C5c.LJ = strArr;
            C0C5V c0c5v = new C0C5V(c307900C5c);
            if (function0 != null) {
                function0.invoke();
            }
            C0C5P c0c5pLIZJ = C0C5P.LIZJ();
            IDebugConfig iDebugConfig = (IDebugConfig) PluggableExtentionKt.pluggableSpi$default(IDebugConfig.class, false, false, false, 14, null);
            if (iDebugConfig != null) {
                zIsOpen = iDebugConfig.isOpen();
            } else {
                zIsOpen = false;
            }
            c0c5pLIZJ.LJIILJJIL(zIsOpen, c0c5v, c0cfl, c0c7w);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            if (c0cfl == C0CFL.FIRST_FINISH || c0cfl == C0CFL.FINISH) {
                LIZLLL().LIZJ = set;
                LJIIL(i, list);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
