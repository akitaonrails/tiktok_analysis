package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.myna.render.render.MynaElement;
import com.tiktok.myna.render.render.bindinfo.MynaBindForConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.18dY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21329418dY {
    public static final void LIZ(C21328418dO c21328418dO, String str, C21329018dU c21329018dU, Function1<? super C14SW, Unit> function1) {
        c21328418dO.getClass();
        if (c21329018dU == null) {
            try {
                c21329018dU = c21328418dO.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (function1 != null) {
                    function1.invoke(new C14SW(str, th, 2001));
                    return;
                }
                return;
            }
        }
        if (c21329018dU.LIZ.LIZ.get(str.trim()) == null) {
            C21343718fr c21343718fr = c21328418dO.LJ;
            C21328818dS c21328818dS = c21328418dO.LJFF;
            c21343718fr.getClass();
            c21329018dU.LIZ.LIZ.put(str.trim(), C21343718fr.LIZ(str, c21328818dS));
        }
    }

    public static final void LIZIZ(C21328418dO c21328418dO, C21329618da c21329618da, C21329018dU c21329018dU, Function1<? super C14SW, Unit> function1) {
        Map<String, String> map = c21329618da.LIZIZ;
        if (map != null) {
            Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                LIZ(c21328418dO, it2.next().getValue(), c21329018dU, function1);
            }
        }
        Map<String, String> map2 = c21329618da.LIZJ;
        if (map2 != null) {
            Iterator<Map.Entry<String, String>> it3 = map2.entrySet().iterator();
            while (it3.hasNext()) {
                LIZ(c21328418dO, it3.next().getValue(), c21329018dU, function1);
            }
        }
        Map<String, String> map3 = c21329618da.LIZ;
        if (map3 != null) {
            Iterator<Map.Entry<String, String>> it4 = map3.entrySet().iterator();
            while (it4.hasNext()) {
                LIZ(c21328418dO, it4.next().getValue(), c21329018dU, function1);
            }
        }
        Map<String, String> map4 = c21329618da.LJFF;
        if (map4 != null) {
            Iterator<Map.Entry<String, String>> it5 = map4.entrySet().iterator();
            while (it5.hasNext()) {
                LIZ(c21328418dO, it5.next().getValue(), c21329018dU, function1);
            }
        }
        Map<String, String> map5 = c21329618da.LIZLLL;
        if (map5 != null) {
            Iterator<Map.Entry<String, String>> it6 = map5.entrySet().iterator();
            while (it6.hasNext()) {
                LIZ(c21328418dO, it6.next().getValue(), c21329018dU, function1);
            }
        }
        Map<String, String> map6 = c21329618da.LJI;
        if (map6 != null) {
            Iterator<Map.Entry<String, String>> it7 = map6.entrySet().iterator();
            while (it7.hasNext()) {
                LIZ(c21328418dO, it7.next().getValue(), c21329018dU, function1);
            }
        }
        MynaBindForConfig mynaBindForConfig = c21329618da.LJ;
        if (mynaBindForConfig != null) {
            LIZ(c21328418dO, mynaBindForConfig.start, c21329018dU, function1);
            LIZ(c21328418dO, mynaBindForConfig.end, c21329018dU, function1);
            LIZ(c21328418dO, mynaBindForConfig.target, c21329018dU, function1);
        }
        String str = c21329618da.LJIIIZ;
        if (str != null && str.length() != 0) {
            LIZ(c21328418dO, c21329618da.LJIIIZ, c21329018dU, function1);
        }
        String str2 = c21329618da.LJIIJ;
        if (str2 != null && str2.length() != 0) {
            LIZ(c21328418dO, c21329618da.LJIIJ, c21329018dU, function1);
        }
        String str3 = c21329618da.LJIIJJI;
        if (str3 != null && str3.length() != 0) {
            LIZ(c21328418dO, c21329618da.LJIIJJI, c21329018dU, function1);
        }
        String str4 = c21329618da.LJII;
        if (str4 != null && str4.length() != 0) {
            LIZ(c21328418dO, c21329618da.LJII, c21329018dU, function1);
        }
    }

    public static final void LIZJ(C21328418dO c21328418dO, MynaElement mynaElement, C21329018dU c21329018dU, Function2<? super Integer, ? super String, Unit> function2, Function1<? super C14SW, Unit> function1) {
        String str;
        try {
            C21329618da c21329618da = mynaElement.bindInfo;
            if (c21329618da != null) {
                LIZIZ(c21328418dO, c21329618da, c21329018dU, function1);
            }
            Map<String, Object> props = mynaElement.getProps();
            if (props != null) {
                for (Map.Entry<String, Object> entry : props.entrySet()) {
                    if (C1893407bI.LIZ(entry.getKey())) {
                        Object value = entry.getValue();
                        if ((value instanceof String) && (str = (String) value) != null) {
                            LIZ(c21328418dO, str, c21329018dU, function1);
                        }
                    }
                }
            }
            List<MynaElement> elements = mynaElement.getElements();
            if (elements != null) {
                Iterator<MynaElement> it2 = elements.iterator();
                while (it2.hasNext()) {
                    LIZJ(c21328418dO, it2.next(), c21329018dU, null, function1);
                }
            }
            if (function2 != null) {
                function2.invoke(0, "pre execute expression success");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (function1 != null) {
                function1.invoke(new C14SW("", th, 2001));
            }
            C1325860kbg.LIZIZ(th, AFwS223S0000000_32.get$arr$(177), C2097608Jq.LJ());
        }
    }
}
