package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0WRm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823320WRm {
    public static final C823320WRm LIZ = new C823320WRm();
    public static C839130Wvv LIZIZ;
    public static String LIZJ;
    public static C839190Ww1 LIZLLL;

    public static final Object LIZ(String str) {
        Function0<String> function0;
        String strInvoke;
        String str2;
        List<String> listInvoke;
        Function0<List<String>> function02;
        Map<String, Function0<Boolean>> map;
        Function0<Boolean> function03;
        Function0<String> function04;
        String strInvoke2;
        Function0<String> function05;
        String strInvoke3;
        if (Intrinsics.LJFF(str, "priority_region")) {
            C839130Wvv c839130Wvv = LIZIZ;
            if (c839130Wvv == null || (function05 = c839130Wvv.LJ) == null || (strInvoke3 = function05.invoke()) == null) {
                return "pns-null";
            }
            return strInvoke3;
        }
        if (Intrinsics.LJFF(str, "store_region")) {
            C839130Wvv c839130Wvv2 = LIZIZ;
            if (c839130Wvv2 == null || (function04 = c839130Wvv2.LIZLLL) == null || (strInvoke2 = function04.invoke()) == null) {
                return "pns-null";
            }
            return strInvoke2;
        }
        if (Intrinsics.LJFF(str, "background_status")) {
            C822890WPv c822890WPv = C822890WPv.LIZ;
            long jLIZJ = C822920WPy.LIZJ();
            if (jLIZJ <= 0) {
                return "pns-null";
            }
            if (jLIZJ <= Mp4ScreenVideoLoadTimeout.CONTROL) {
                return "0-5";
            }
            if (jLIZJ <= 60000) {
                return "5-60";
            }
            if (jLIZJ <= 600000) {
                return "60-600";
            }
            return "600+";
        }
        if (Intrinsics.LJFF(str, "release_build")) {
            String str3 = LIZJ;
            if (str3 == null) {
                return "pns-null";
            }
            return str3;
        }
        C839130Wvv c839130Wvv3 = LIZIZ;
        if (c839130Wvv3 != null && (map = c839130Wvv3.LJIIIIZZ) != null && (function03 = map.get(str)) != null) {
            if (function03.invoke().booleanValue()) {
                return "1";
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        if (Intrinsics.LJFF(str, "pl_btm_stack")) {
            C839130Wvv c839130Wvv4 = LIZIZ;
            if (c839130Wvv4 != null && (function02 = c839130Wvv4.LJIJI) != null) {
                listInvoke = function02.invoke();
            } else {
                listInvoke = null;
            }
            JSONArray jSONArray = new JSONArray();
            if (listInvoke != null) {
                Iterator<String> it2 = listInvoke.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next());
                }
            }
            return jSONArray;
        }
        if (Intrinsics.LJFF(str, "pl_page_stack")) {
            C796440VMc<String> c796440VMc = C813160Vv8.LIZIZ;
            JSONArray jSONArray2 = new JSONArray();
            if (c796440VMc != null) {
                Iterator<String> it3 = c796440VMc.iterator();
                while (it3.hasNext()) {
                    jSONArray2.put(it3.next());
                }
            }
            return jSONArray2;
        }
        if (Intrinsics.LJFF(str, "pumbaa_version_code")) {
            C839190Ww1 c839190Ww1 = LIZLLL;
            if (c839190Ww1 == null) {
                return "pns-null";
            }
            return Long.valueOf(c839190Ww1.LIZJ);
        }
        if (Intrinsics.LJFF(str, "pumbaa_app_version")) {
            C839190Ww1 c839190Ww12 = LIZLLL;
            if (c839190Ww12 == null || (str2 = c839190Ww12.LIZLLL) == null) {
                return "pns-null";
            }
            return str2;
        }
        if (!Intrinsics.LJFF(str, "nxet_info")) {
            return "pns-null";
        }
        C839130Wvv c839130Wvv5 = LIZIZ;
        if (c839130Wvv5 == null || (function0 = c839130Wvv5.LIZ) == null || (strInvoke = function0.invoke()) == null) {
            return "";
        }
        return strInvoke;
    }

    public static void LIZIZ(C839190Ww1 c839190Ww1, C839130Wvv c839130Wvv) {
        Object c098200Yq;
        LIZLLL = c839190Ww1;
        LIZIZ = c839130Wvv;
        try {
            Properties properties = new Properties();
            properties.load(c839190Ww1.LIZ.getAssets().open("slardar.properties"));
            LIZJ = String.valueOf(properties.get("release_build"));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            LIZJ = c839190Ww1.LJI;
        }
    }
}
