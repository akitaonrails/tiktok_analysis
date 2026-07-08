package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.event.ZipcodeLocateAddress;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.03ql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C970103ql {
    public static ZipcodeLocateAddress LIZ(String str) {
        Type type;
        ZipcodeLocateAddress zipcodeLocateAddress;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJ(ZipcodeLocateAddress.class));
            } else {
                type = new TypeToken<ZipcodeLocateAddress>() { // from class: X.03qo
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
            if (!(objFromJson instanceof ZipcodeLocateAddress)) {
                objFromJson = null;
            }
            zipcodeLocateAddress = (ZipcodeLocateAddress) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (zipcodeLocateAddress == null) {
            return new ZipcodeLocateAddress(-1, null, null, null, null, null);
        }
        return zipcodeLocateAddress;
    }
}
