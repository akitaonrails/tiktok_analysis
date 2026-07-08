package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.ug.pay.PayToMallData;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.035y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7880035y {
    public static PayToMallData LIZ(Context context, String str) {
        Object c098200Yq;
        String string;
        Type type;
        InterfaceC1870830ymf interfaceC1870830ymfLIZ = C1323720kYE.LIZ(context);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ec_pay_to_mall_info_");
        sbLIZ.append(str);
        Object obj = null;
        try {
            Object objLIZ = interfaceC1870830ymfLIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (objLIZ != null && (string = objLIZ.toString()) != null) {
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJII(PayToMallData.class));
                    } else {
                        type = new TypeToken<PayToMallData>() { // from class: X.035z
                        }.getType();
                    }
                    Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(string, type);
                    if (!(objLJIIIIZZ instanceof PayToMallData)) {
                        objLJIIIIZZ = null;
                    }
                    c098200Yq = (PayToMallData) objLJIIIIZZ;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                c098200Yq = null;
                C189200o6.m2constructorimpl(c098200Yq);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (PayToMallData) obj;
    }
}
