package X;

import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcAddressEditFixConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.TemplateChangeConfig;
import com.ss.android.ugc.aweme.ecommerce.core.engine.BizParserInfo;
import com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0408, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0408 {
    public static boolean LIZIZ;
    public static final AnonymousClass0408 LIZ = new AnonymousClass0408();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(486));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(489));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(490));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(488));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(487));

    public static void LIZIZ() {
        try {
            AnonymousClass0409.LIZ.getClass();
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            TemplateChangeConfig templateChangeConfig = AnonymousClass0409.LIZJ;
            TemplateChangeConfig templateChangeConfig2 = (TemplateChangeConfig) c0c64LJIILLIIL.LJJII(TemplateChangeConfig.class, templateChangeConfig, "pdp_template_change_opt", false);
            if (templateChangeConfig2 != null) {
                templateChangeConfig = templateChangeConfig2;
            }
            if (Intrinsics.LJFF(templateChangeConfig, AnonymousClass0409.LIZIZ)) {
                return;
            }
            LIZ.getClass();
            C01GW c01gw = LJI;
            String string = ((Keva) c01gw.getValue()).getString("once_key", "");
            String str = templateChangeConfig.onceKey;
            Integer num = templateChangeConfig.realTemplate;
            if (Intrinsics.LJFF(str, string)) {
                return;
            }
            if (num == null || num.intValue() != -1) {
                int i = LJIIIIZZ().getInt(LJFF(templateChangeConfig.biz, "product_detail"), -1);
                if (num == null || i != num.intValue()) {
                    LJIIIIZZ().clear();
                }
                ((Keva) c01gw.getValue()).storeString("once_key", str != null ? str : "");
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static Keva LJII() {
        return (Keva) LIZJ.getValue();
    }

    public static Keva LJIIIIZZ() {
        return (Keva) LIZLLL.getValue();
    }

    public static Pair LJI() {
        Integer num;
        for (Map.Entry<String, ?> entry : LJIIIIZZ().getAll().entrySet()) {
            if (a0.LJJIIZI(entry.getKey(), "product_detail", false)) {
                String key = entry.getKey();
                Object value = entry.getValue();
                return new Pair(key, Integer.valueOf((!(value instanceof Integer) || (num = (Integer) value) == null) ? -1 : num.intValue()));
            }
        }
        return null;
    }

    public static Pair LJIIIZ() {
        Integer num;
        Integer num2;
        Pair pair = null;
        for (Map.Entry<String, ?> entry : LJII().getAll().entrySet()) {
            if (a0.LJJIIZI(entry.getKey(), "product_detail", false)) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(entry.getKey(), new String[]{e3.d}, 0, 6);
                int iIntValue = -1;
                if (listLJJLIIIJILLIZJL.size() >= 2 && !Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 1), "*")) {
                    Object obj = ListProtector.get(listLJJLIIIJILLIZJL, 1);
                    Object value = entry.getValue();
                    if ((value instanceof Integer) && (num2 = (Integer) value) != null) {
                        iIntValue = num2.intValue();
                    }
                    return new Pair(obj, Integer.valueOf(iIntValue));
                }
                Object value2 = entry.getValue();
                if ((value2 instanceof Integer) && (num = (Integer) value2) != null) {
                    iIntValue = num.intValue();
                }
                pair = new Pair("none", Integer.valueOf(iIntValue));
            }
        }
        return pair;
    }

    public static Pair LJIIJ() {
        List<BizParserInfo> list = AnonymousClass0407.LIZ().page_biz_list;
        Pair pair = null;
        if (list != null) {
            for (BizParserInfo bizParserInfo : list) {
                if (Intrinsics.LJFF(bizParserInfo.page_name, "product_detail")) {
                    String str = bizParserInfo.region;
                    if (str != null && !Intrinsics.LJFF(str, "*")) {
                        String str2 = bizParserInfo.region;
                        Integer num = bizParserInfo.template;
                        return new Pair(str2, Integer.valueOf(num != null ? num.intValue() : -1));
                    }
                    Integer num2 = bizParserInfo.template;
                    pair = new Pair("none", Integer.valueOf(num2 != null ? num2.intValue() : -1));
                }
            }
        }
        return pair;
    }

    public static boolean LIZ(String str) {
        boolean z;
        if (!Intrinsics.LJFF(str, "pickup_person") && !Intrinsics.LJFF(str, "shipping_address")) {
            z = false;
        } else {
            z = true;
        }
        if (EcAddressEditFixConfig.LIZ().euNewCountryLaunch) {
            if (!z && !Intrinsics.LJFF(str, "shipping_info") && !Intrinsics.LJFF(str, "logistics_address") && !Intrinsics.LJFF(str, "logistics")) {
                return false;
            }
            return true;
        }
        return z;
    }

    public static void LJIILJJIL(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BizParserInfo bizParserInfo = (BizParserInfo) it2.next();
            Integer num = bizParserInfo.template;
            if (num != null) {
                int iIntValue = num.intValue();
                LIZ.getClass();
                LJIIIIZZ().storeInt(LJFF(bizParserInfo.biz_line, bizParserInfo.page_name), iIntValue);
            }
        }
    }

    public static String LJFF(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('.');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJ(String str, String str2, String str3) {
        String upperCase;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('.');
        if (str2 == null || (upperCase = str2.toUpperCase(Locale.ROOT)) == null) {
            upperCase = "";
        }
        sbLIZ.append(upperCase);
        sbLIZ.append('.');
        sbLIZ.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LJIIL(EnumC955203oM enumC955203oM, String str, int i) {
        if (LJIIJJI(this, enumC955203oM, str, null, null, 12) == i) {
            return true;
        }
        return false;
    }

    public static IComponentStrategyService LIZLLL(EnumC955203oM enumC955203oM, String str, String str2, Integer num) {
        String upperCase;
        Object next;
        int iLJIIJJI;
        String strName;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        Object obj = null;
        if (str2 == null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = ILocationDependencyService.class.getName();
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
            }
            upperCase = ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode().toUpperCase(Locale.ROOT);
        } else {
            upperCase = str2;
        }
        Set services = ServiceManager.get().getServices(IComponentStrategyService.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : services) {
            Annotation[] annotations = obj2.getClass().getAnnotations();
            ArrayList arrayList2 = new ArrayList();
            for (Annotation annotation : annotations) {
                if (annotation instanceof C040C) {
                    arrayList2.add(annotation);
                }
            }
            C040C c040c = (C040C) C13LP.LJJJLL(arrayList2);
            if (c040c != null) {
                strName = c040c.name();
            } else {
                strName = null;
            }
            if (Intrinsics.LJFF(strName, str)) {
                arrayList.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                IComponentStrategyService iComponentStrategyService = (IComponentStrategyService) next;
                if (str2 == null && num != null) {
                    iLJIIJJI = num.intValue();
                } else {
                    iLJIIJJI = LJIIJJI(LIZ, enumC955203oM, str, upperCase, null, 8);
                }
                if (iComponentStrategyService.getType().getTemplate() == iLJIIJJI) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        IComponentStrategyService iComponentStrategyService2 = (IComponentStrategyService) next;
        if (iComponentStrategyService2 == null) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (((IComponentStrategyService) next2).getType().getTemplate() == EnumC969503qf.DEFAULT.getTemplate()) {
                    obj = next2;
                    break;
                }
            }
            return (IComponentStrategyService) obj;
        }
        return iComponentStrategyService2;
    }

    public static void LJIILIIL(EnumC955203oM enumC955203oM, String str, String str2, int i) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("page_name", str), new Pair("region", str2), new Pair("biz", enumC955203oM.getBizName()), new Pair("template", String.valueOf(i)), new Pair("is_load_template", String.valueOf(LIZIZ ? 1 : 0)));
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("rd_tiktokec_template_monitor", mapLJIIIIZZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJIIJJI(X.AnonymousClass0408 r16, X.EnumC955203oM r17, java.lang.String r18, java.lang.String r19, X.C040B r20, int r21) {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0408.LJIIJJI(X.0408, X.03oM, java.lang.String, java.lang.String, X.040B, int):int");
    }

    public static IComponentStrategyService LJIILL(AnonymousClass0408 anonymousClass0408, InterfaceC1740480vOQ interfaceC1740480vOQ, EnumC955203oM enumC955203oM, String str, Function0 function0, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        anonymousClass0408.getClass();
        IComponentStrategyService iComponentStrategyServiceLIZLLL = LIZLLL(enumC955203oM, interfaceC1740480vOQ.getPageName(), str, null);
        if (iComponentStrategyServiceLIZLLL == null) {
            return (IComponentStrategyService) function0.invoke();
        }
        return iComponentStrategyServiceLIZLLL;
    }

    public static InterfaceC1002303vx LIZJ(AnonymousClass0408 anonymousClass0408, InterfaceC1740480vOQ interfaceC1740480vOQ, LifecycleOwner lifecycleOwner, EnumC955203oM enumC955203oM, String str, Function0 function0, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        anonymousClass0408.getClass();
        IComponentStrategyService iComponentStrategyServiceLIZLLL = LIZLLL(enumC955203oM, interfaceC1740480vOQ.getPageName(), str, null);
        if (iComponentStrategyServiceLIZLLL == null) {
            iComponentStrategyServiceLIZLLL = (IComponentStrategyService) function0.invoke();
        }
        return iComponentStrategyServiceLIZLLL.LIZJ(lifecycleOwner);
    }
}
