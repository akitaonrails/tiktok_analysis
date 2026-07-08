package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS98S1000000_13;
import kotlin.ranges.IntRange;
import okhttp3.Request;

/* JADX INFO: renamed from: X.0Wba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826520Wba {
    public static final C0WSU LIZ(InterfaceC1495580p1Q interfaceC1495580p1Q, String str, InterfaceC1495580p1Q interfaceC1495580p1Q2, String str2, C0WZW c0wzw) {
        LinkedHashMap linkedHashMap;
        String str3;
        String[] strArr;
        Request request = interfaceC1495580p1Q2.request();
        if (request == null) {
            return new C0WSU(false, null);
        }
        String str4 = request.url().LJIIIIZZ;
        try {
            URI uri = new URI(str4);
            C0X1V c0x1vHeaders = request.headers();
            String[] strArr2 = c0x1vHeaders.LIZ;
            if (strArr2.length / 2 > 0) {
                IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, strArr2.length / 2);
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                linkedHashMap = new LinkedHashMap(iLIZIZ);
                C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
                while (it2.LLILLL) {
                    int iNextInt = it2.nextInt();
                    Pair pair = new Pair(c0x1vHeaders.LJ(iNextInt), c0x1vHeaders.LJIIJ(iNextInt));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
            } else {
                linkedHashMap = null;
            }
            String host = uri.getHost();
            String scheme = uri.getScheme();
            String strMethod = request.method();
            Map mapLIZIZ = C205000qe.LIZIZ(uri.getRawQuery());
            if (linkedHashMap != null) {
                str3 = (String) linkedHashMap.get("Cookie");
            } else {
                str3 = null;
            }
            Map mapLIZ = C205000qe.LIZ(str3);
            if (c0wzw != null) {
                strArr = c0wzw.LJ;
            } else {
                strArr = null;
            }
            C826260WbA.LIZIZ(new C826120Waw(interfaceC1495580p1Q, str, str4, host, scheme, strMethod, linkedHashMap, mapLIZIZ, mapLIZ, strArr), C826260WbA.LIZ);
            return new C0WSU(false, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ(str2, new AwS98S1000000_13(str4, 5), 3, null);
            return new C0WSU(false, null);
        }
    }
}
