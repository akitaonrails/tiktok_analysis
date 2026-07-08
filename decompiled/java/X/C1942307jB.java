package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.07jB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1942307jB {
    public static final Map<String, String> LIZ(Uri uri) {
        String[] strArr = {"x-use-ppe", "ppe", "x-use-boe", "boe"};
        ArrayList arrayList = new ArrayList(4);
        int i = 0;
        do {
            String str = strArr[i];
            arrayList.add(new Pair(str, LIZIZ(uri, str)));
            i++;
        } while (i < 4);
        Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapLJIILLIIL.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final String LIZIZ(Uri uri, String str) {
        try {
            return C1942407jC.LIZIZ(uri, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
