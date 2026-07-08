package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.049Q, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C049Q {
    public static final CartRefreshEvent LIZ(String str) {
        Type type;
        CartRefreshEvent cartRefreshEvent;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJ(CartRefreshEvent.class));
            } else {
                type = new TypeToken<CartRefreshEvent>() { // from class: X.049R
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
            if (!(objFromJson instanceof CartRefreshEvent)) {
                objFromJson = null;
            }
            cartRefreshEvent = (CartRefreshEvent) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (cartRefreshEvent == null) {
            return new CartRefreshEvent(1, null, null, null, null, null, null);
        }
        return cartRefreshEvent;
    }
}
