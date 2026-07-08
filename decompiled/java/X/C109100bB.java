package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.00bB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C109100bB {
    public static final C109100bB LIZ = new C109100bB();

    public static void LIZ(String str, Map map) {
        String strValueOf;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
            for (Object obj : linkedHashMap.entrySet()) {
                Object key = ((Map.Entry) obj).getKey();
                Object value = ((Map.Entry) obj).getValue();
                if (value instanceof Boolean) {
                    if (((Boolean) value).booleanValue()) {
                        strValueOf = "1";
                    } else {
                        strValueOf = CardStruct.IStatusCode.DEFAULT;
                    }
                } else {
                    strValueOf = String.valueOf(value);
                }
                linkedHashMap2.put(key, strValueOf);
            }
            C20684815ws.LJIILLIIL(str, linkedHashMap2);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
