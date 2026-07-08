package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.03Yk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C862003Yk {
    public static AddressPageStarter.AddressEvent LIZ(String str) {
        Type type;
        AddressPageStarter.AddressEvent addressEvent;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJ(AddressPageStarter.AddressEvent.class));
            } else {
                type = new TypeToken<AddressPageStarter.AddressEvent>() { // from class: X.03Yl
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
            if (!(objFromJson instanceof AddressPageStarter.AddressEvent)) {
                objFromJson = null;
            }
            addressEvent = (AddressPageStarter.AddressEvent) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (addressEvent == null) {
            return new AddressPageStarter.AddressEvent("", -1, null, null, null, null);
        }
        return addressEvent;
    }
}
