package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS76S1000000_26;

/* JADX INFO: renamed from: X.0uY0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1707980uY0 {
    public static final ArrayList<String> LIZ;

    static {
        new BPEAHandler(Looper.getMainLooper());
        LIZ = new ArrayList<>();
    }

    public static void LIZ(int i, String str, Integer num, String str2) {
        ArrayList<String> arrayList = LIZ;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
        n nVar = new n();
        nVar.LJJIIJ("refund_request_id", str);
        nVar.LJJIII(Integer.valueOf(i), "result");
        if (str2 != null) {
            nVar.LJJIIJ("error_msg", str2);
        }
        if (num != null) {
            nVar.LJJIIJ("error_code", String.valueOf(num.intValue()));
        }
        new C1548870qPN().LJ("pipo_refund_result", nVar.toString());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("result", String.valueOf(i));
        C1708030uY5.LIZ.LIZ(new C1708080uYA(str)).LJ(linkedHashMap, new AwS76S1000000_26(str, 23));
    }
}
