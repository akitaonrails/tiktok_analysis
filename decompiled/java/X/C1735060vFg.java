package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.compliance.ScenesConfig;
import com.ss.android.ugc.aweme.ecommerce.compliance.ToastIcon;
import com.ss.android.ugc.aweme.ecommerce.compliance.manager.ToastPerDayData;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.0vFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735060vFg {
    public static final C1735060vFg LIZ = new C1735060vFg();
    public static final Map<String, List<ToastPerDayData>> LIZIZ = new LinkedHashMap();
    public static final Set<String> LIZJ;
    public static final Map<String, Integer> LIZLLL;
    public static final Map<String, Boolean> LJ;
    public static boolean LJFF;

    static {
        Type type;
        List<String> listLJJLL;
        List listLJJLL2;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        LIZJ = linkedHashSet;
        LIZLLL = new LinkedHashMap();
        LJ = new LinkedHashMap();
        try {
            String[] stringArray = C1257480ipO.LIZ.getStringArray("toast_scene", null);
            if (stringArray != null && (listLJJLL2 = C13LQ.LJJLL(stringArray)) != null) {
                linkedHashSet.addAll(listLJJLL2);
            }
            for (String str : linkedHashSet) {
                Keva keva = C1257480ipO.LIZ;
                LIZ.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("toast_show_count_date_");
                sbLIZ.append(str);
                String[] stringArray2 = keva.getStringArray(C2188811AlT.LIZIZ(sbLIZ), null);
                if (stringArray2 != null && (listLJJLL = C13LQ.LJJLL(stringArray2)) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : listLJJLL) {
                        try {
                            Gson gsonLJFF = C1741890vQh.LJFF();
                            C1120604Zw.LIZ.getClass();
                            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                            Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(str2, (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) ? new TypeToken<ToastPerDayData>() { // from class: X.0vFi
                            }.getType() : C2371409Qy.LIZJ(C13LE.LJII(ToastPerDayData.class)));
                            if (!(objLJIIIIZZ instanceof ToastPerDayData)) {
                                objLJIIIIZZ = null;
                            }
                            ToastPerDayData toastPerDayData = (ToastPerDayData) objLJIIIIZZ;
                            if (toastPerDayData != null) {
                                arrayList.add(toastPerDayData);
                            }
                        } catch (s e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    LIZIZ.put(str, arrayList);
                }
            }
            String string = C1257480ipO.LIZ.getString("toast_record", null);
            if (string != null) {
                try {
                    Gson gsonLJFF2 = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ2 == null || !c1121904a9LIZIZ2.LJII) {
                        type = new TypeToken<HashMap<String, Boolean>>() { // from class: X.0vFh
                        }.getType();
                    } else {
                        C13JX c13jx = KTypeProjection.LIZJ;
                        C13JW c13jwLJII = C13LE.LJII(String.class);
                        c13jx.getClass();
                        type = C2371409Qy.LIZJ(C13LE.LJIIIZ(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(Boolean.TYPE))));
                    }
                    Object objLJIIIIZZ2 = gsonLJFF2.LJIIIIZZ(string, type);
                    if (!(objLJIIIIZZ2 instanceof HashMap)) {
                        objLJIIIIZZ2 = null;
                    }
                    HashMap map = (HashMap) objLJIIIIZZ2;
                    if (map != null) {
                        LJ.putAll(map);
                    }
                } catch (s e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static String LIZIZ() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public static String LIZ(int i) {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        boolean z;
        boolean z2;
        String name;
        String name2 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = IAccountDependencyService.class.getName();
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        IAccountDependencyService iAccountDependencyService = (IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        if (iAccountDependencyService.isLogin() && i == EnumC12971055t.UID.getValue()) {
            return iAccountDependencyService.getUserId();
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name4 = ILogDependencyService.class.getName();
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        return ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getServerDeviceId();
    }

    public static void LIZJ(ScenesConfig scenesConfig, ToastIcon toastIcon, Object obj, String str, String str2, String str3) {
        int iIntValue;
        ArrayList<ToastPerDayData> arrayList;
        String str4;
        String str5 = str2;
        LJFF = true;
        if (toastIcon != null && (str4 = toastIcon.url) != null) {
            str5 = str4;
        }
        try {
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str5);
            c1331670kl3LIZLLL.LIZLLL("ec_compliance_icon");
            c1331670kl3LIZLLL.LJIILL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C1735090vFj(str, str5, scenesConfig, obj, toastIcon, str3, null), 2);
        String str6 = scenesConfig.sceneName;
        Integer num = scenesConfig.saveType;
        if (str6 != null) {
            if (num != null) {
                int iIntValue2 = num.intValue();
                LIZ.getClass();
                String strLIZ = LIZ(iIntValue2);
                if (strLIZ != null) {
                    Map<String, Boolean> map = LJ;
                    map.put(strLIZ, Boolean.TRUE);
                    C1257480ipO.LIZ.storeString("toast_record", C1741890vQh.LJIIIIZZ(map));
                }
            }
            Map<String, Integer> map2 = LIZLLL;
            Integer num2 = (Integer) ((LinkedHashMap) map2).get(str6);
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            map2.put(str6, Integer.valueOf(iIntValue + 1));
            Collection collection = (Collection) ((LinkedHashMap) LIZIZ).get(str6);
            if (collection != null) {
                arrayList = new ArrayList(collection);
            } else {
                arrayList = new ArrayList();
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str7 = ((ToastPerDayData) it2.next()).date;
                    LIZ.getClass();
                    if (Intrinsics.LJFF(str7, LIZIZ())) {
                        for (ToastPerDayData toastPerDayData : arrayList) {
                            String str8 = toastPerDayData.date;
                            LIZ.getClass();
                            if (Intrinsics.LJFF(str8, LIZIZ())) {
                                toastPerDayData.count++;
                            }
                        }
                    }
                }
                ListProtector.add(arrayList, 0, new ToastPerDayData(str6, LIZIZ(), 1));
            } else {
                ListProtector.add(arrayList, 0, new ToastPerDayData(str6, LIZIZ(), 1));
            }
            if (arrayList.size() + 1 >= 30) {
                C19719612Di.LJJIJIIJI(arrayList);
            }
            LIZIZ.put(str6, arrayList);
            Keva keva = C1257480ipO.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("toast_show_count_date_");
            sbLIZ.append(str6);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(C1741890vQh.LJIIIIZZ(it3.next()));
            }
            keva.storeStringArray(strLIZIZ, (String[]) arrayList2.toArray(new String[0]));
            Set<String> set = LIZJ;
            if (!set.contains(str6)) {
                Keva keva2 = C1257480ipO.LIZ;
                set.add(str6);
                keva2.storeStringArray("toast_scene", (String[]) set.toArray(new String[0]));
            }
        }
    }
}
