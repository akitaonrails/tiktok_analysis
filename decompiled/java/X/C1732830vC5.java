package X;

import com.bytedance.android.live.scope.LiveFragmentScope;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import java.util.Map;

/* JADX INFO: renamed from: X.0vC5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1732830vC5 {
    public static final ISeaLiveContextAbility LIZ(Map<String, ? extends Object> map) {
        C0IIC c0iic;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ;
        Object ability;
        Object obj = map.get("param_sea_live_di_provider");
        Object obj2 = null;
        if (!(obj instanceof C0IIC) || (c0iic = (C0IIC) obj) == null || (interfaceC665370Q7zLIZ = c0iic.LIZ()) == null) {
            return null;
        }
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7zLIZ, LiveFragmentScope.class);
        if (c0qsjLIZJ != null) {
            ability = c0qsjLIZJ.getAbility(ISeaLiveContextAbility.class);
        } else {
            ability = null;
        }
        if (ability instanceof ISeaLiveContextAbility) {
            obj2 = ability;
        }
        return (ISeaLiveContextAbility) obj2;
    }
}
