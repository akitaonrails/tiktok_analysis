package X;

import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.prefetch.libra.NativePrefetchConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vNH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739770vNH {
    public static final Map<String, C1739860vNQ> LIZ = new LinkedHashMap();

    public static String LIZ(String str) {
        String string;
        Uri uri = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ec_native_prefetch_multi");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && !a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            return str;
        }
        String str2 = (String) LIZJ(str).getSecond();
        if (!a0.LJJJIL(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(':');
            sbLIZ.append(UUID.randomUUID());
            string = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            string = UUID.randomUUID().toString();
        }
        return uri.buildUpon().appendQueryParameter("ec_native_prefetch_multi", string).build().toString();
    }

    public static boolean LIZIZ(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "ec_ug_native_prefetch_key");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && !a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            return false;
        }
        return ((Boolean) LIZJ(str).getFirst()).booleanValue();
    }

    public static Pair LIZJ(String str) {
        NativePrefetchConfig.NativePrefetchConfigModel nativePrefetchConfigModel;
        Unit unit;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            nativePrefetchConfigModel = NativePrefetchConfig.LIZ;
            NativePrefetchConfig.NativePrefetchConfigModel nativePrefetchConfigModel2 = (NativePrefetchConfig.NativePrefetchConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ec_ug_native_prefetch_config", NativePrefetchConfig.NativePrefetchConfigModel.class, nativePrefetchConfigModel);
            if (nativePrefetchConfigModel2 != null) {
                nativePrefetchConfigModel = nativePrefetchConfigModel2;
            }
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                nativePrefetchConfigModel = NativePrefetchConfig.LIZ;
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1AF0.LJ(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        if (!Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "enable_ug_native_prefetch"), "1")) {
            Boolean bool = nativePrefetchConfigModel.enableWithoutParamsCheck;
            Boolean bool2 = Boolean.FALSE;
            if (Intrinsics.LJFF(bool, bool2)) {
                return new Pair(bool2, "");
            }
        }
        if (C1836307Hd.LIZ) {
            List<String> list = nativePrefetchConfigModel.channelList;
            if (list != null) {
                for (String str2 : list) {
                    if (a0.LJJIIZI(str, str2, false)) {
                        return new Pair(Boolean.TRUE, str2);
                    }
                }
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
            return new Pair(Boolean.FALSE, "");
        }
        return new Pair(Boolean.FALSE, "");
    }

    public static boolean LIZLLL(String str) {
        return Intrinsics.LJFF(C416901jj.LIZ(UriProtector.parse(str), "combine_ec_and_ug_native_prefetch"), "1");
    }

    public static String LJFF(String str) {
        Pair pair;
        Pair pairLIZJ = LIZJ(str);
        boolean zBooleanValue = ((Boolean) pairLIZJ.getFirst()).booleanValue();
        String str2 = (String) pairLIZJ.getSecond();
        if (!zBooleanValue) {
            return str;
        }
        try {
            pair = new Pair(str2, String.valueOf(AnonymousClass0185.LIZIZ(UriProtector.parse(str).buildUpon().appendQueryParameter("ec_ug_native_prefetch_key", str2).build(), "enable_prefetch", CardStruct.IStatusCode.DEFAULT)));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            pair = new Pair("", str);
        }
        String str3 = (String) pair.getFirst();
        String str4 = (String) pair.getSecond();
        if (!a0.LJJJIL(str3)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Uri uri = UriProtector.parse(str4);
            for (String str5 : UriProtector.getQueryParameterNames(uri)) {
                linkedHashMap.put(str5, C416901jj.LIZ(uri, str5));
            }
            LJ(str4, linkedHashMap, str2, str3, "nativeprefetch", AFwS268S0000000_26.get$arr$(505));
        }
        return str4;
    }

    public static void LJ(String str, Map map, String str2, String str3, String str4, Function1 function1) {
        C1739860vNQ c1739860vNQ;
        C1739950vNZ.LIZIZ(C1739950vNZ.LIZ, "init", "success", str2, null, null, null, null, null, null, null, null, 2040);
        if (str != null && LIZLLL(str)) {
            c1739860vNQ = new C1739860vNQ(str2);
        } else {
            LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
            Object c1739860vNQ2 = linkedHashMap.get(str3);
            if (c1739860vNQ2 == null) {
                c1739860vNQ2 = new C1739860vNQ(str2);
                linkedHashMap.put(str3, c1739860vNQ2);
            }
            c1739860vNQ = (C1739860vNQ) c1739860vNQ2;
        }
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(C817503Hh.LL, null, C099V.LAZY, new C1739780vNI(c1739860vNQ, str2, str4, str, map, null, function1), 1);
        c1739860vNQ.LIZ();
        c1739860vNQ.LIZLLL = anonymousClass0956LIZLLL;
        anonymousClass0956LIZLLL.start();
    }
}
