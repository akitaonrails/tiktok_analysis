package X;

import android.os.Looper;
import com.bytedance.scalpel.protos.AttributionCustomInfo;
import com.bytedance.scalpel.protos.AttributionRunnableInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1C7R, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C7R {
    public static final C1C7R LIZ = new C1C7R();
    public static final Thread LIZIZ = Looper.getMainLooper().getThread();

    public static ArrayList LIZ(File file) {
        ArrayList arrayList = new ArrayList();
        C0VSP c0vsp = new C0VSP(file);
        try {
            try {
                int iAvailable = c0vsp.available();
                byte[] bArr = new byte[iAvailable];
                c0vsp.read(bArr);
                C1496910p3Z c1496910p3Z = ByteString.Companion;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, iAvailable);
                c1496910p3Z.getClass();
                arrayList.add(C1496910p3Z.LIZIZ(bArrCopyOf));
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                c0vsp.close();
                return arrayList;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return arrayList;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                c0vsp.close();
                throw th;
            } catch (IOException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw th;
            }
        }
    }

    public static ArrayList LIZJ(ConcurrentLinkedQueue concurrentLinkedQueue) {
        ArrayList arrayList = new ArrayList();
        try {
            HashMap map = new HashMap();
            Iterator it2 = concurrentLinkedQueue.iterator();
            while (it2.hasNext()) {
                C1869680yko c1869680yko = (C1869680yko) it2.next();
                String strLIZLLL = LIZLLL(c1869680yko.LIZIZ);
                c1869680yko.LIZIZ = strLIZLLL;
                if (c1869680yko.LJFF) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("(wall)");
                    sbLIZ.append(c1869680yko.LIZ);
                    c1869680yko.LIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZLLL);
                sbLIZ2.append(c1869680yko.LIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                C1869680yko c1869680yko2 = (C1869680yko) map.get(strLIZIZ);
                if (c1869680yko2 == null) {
                    map.put(strLIZIZ, c1869680yko);
                } else {
                    c1869680yko2.LJ += c1869680yko.LJ;
                    long j = c1869680yko.LIZLLL;
                    if (j < c1869680yko2.LIZLLL) {
                        c1869680yko2.LIZLLL = j;
                    }
                }
            }
            Iterator it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                C1869680yko c1869680yko3 = (C1869680yko) ((Map.Entry) it3.next()).getValue();
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, ? extends Object> entry : c1869680yko3.LJIIIIZZ.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                for (Map.Entry<String, ? extends Object> entry2 : c1869680yko3.LJIIIZ.entrySet()) {
                    jSONObject.put(entry2.getKey(), entry2.getValue());
                }
                C1C7S c1c7s = new C1C7S();
                c1c7s.LIZLLL = c1869680yko3.LIZ;
                c1c7s.LJ = c1869680yko3.LIZIZ;
                c1c7s.LJFF = Integer.valueOf(c1869680yko3.LJ);
                c1c7s.LJIIIIZZ = Long.valueOf(c1869680yko3.LIZLLL);
                c1c7s.LJI = c1869680yko3.LJI;
                c1c7s.LJII = C786410Ut5.J3(jSONObject);
                AttributionRunnableInfo attributionRunnableInfoBuild = c1c7s.build();
                C1496910p3Z c1496910p3Z = ByteString.Companion;
                byte[] bArrEncode = attributionRunnableInfoBuild.encode();
                byte[] bArrCopyOf = Arrays.copyOf(bArrEncode, bArrEncode.length);
                c1496910p3Z.getClass();
                arrayList.add(C1496910p3Z.LIZIZ(bArrCopyOf));
            }
            return arrayList;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return new ArrayList();
        }
    }

    public static String LIZLLL(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            str.charAt(i);
            char cCharAt = str.charAt(i);
            if (!Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static ArrayList LIZIZ(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        try {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C1909907dx c1909907dx = (C1909907dx) it2.next();
                C1C7Q c1c7q = new C1C7Q();
                c1c7q.LIZLLL = c1909907dx.LIZ;
                c1c7q.LJ = Double.valueOf(c1909907dx.LIZIZ);
                arrayList3.add(c1c7q.build());
            }
            C1C7O c1c7o = new C1C7O();
            c1c7o.LJ = arrayList3;
            c1c7o.LIZLLL = str;
            AttributionCustomInfo attributionCustomInfoBuild = c1c7o.build();
            C1496910p3Z c1496910p3Z = ByteString.Companion;
            byte[] bArrEncode = attributionCustomInfoBuild.encode();
            byte[] bArrCopyOf = Arrays.copyOf(bArrEncode, bArrEncode.length);
            c1496910p3Z.getClass();
            arrayList2.add(C1496910p3Z.LIZIZ(bArrCopyOf));
            return arrayList2;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return new ArrayList();
        }
    }
}
