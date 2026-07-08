package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.pictureinpicture.IPdpPiPAbility;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import java.util.Map;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0pMK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508540pMK {
    public static final /* synthetic */ int LIZ = 0;

    public static AbstractC1470205pE LIZ(View view, Map map) {
        PdpFragment pdpFragment;
        Object obj;
        Integer num;
        Fragment fragmentLIZ = C946803n0.LIZ(view);
        if (fragmentLIZ instanceof PdpFragment) {
            pdpFragment = (PdpFragment) fragmentLIZ;
        } else {
            pdpFragment = null;
        }
        if (pdpFragment == null) {
            return new C1470005pC(0, "Fragment is null", null);
        }
        if (map != null) {
            obj = map.get("actionType");
        } else {
            obj = null;
        }
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            int iIntValue = num.intValue();
            IPdpPiPAbility iPdpPiPAbilityYS = pdpFragment.yS();
            if (iPdpPiPAbilityYS == null) {
                return new C1470005pC(0, "no pip active", null);
            }
            AFwS232S0000000_4 aFwS232S0000000_4 = AFwS232S0000000_4.get$arr$(276);
            if (iIntValue == EnumC1486170omF.PAUSE.getValue()) {
                aFwS232S0000000_4.invoke(new AwS567S0100000_23(iPdpPiPAbilityYS, 220));
            } else if (iIntValue == EnumC1486170omF.PLAY.getValue()) {
                aFwS232S0000000_4.invoke(new AwS567S0100000_23(iPdpPiPAbilityYS, 221));
            } else {
                return new C1470005pC(0, "Unknown or missing actionType", null);
            }
            return new C1470305pF((Map) null, 3);
        }
        return new C1470005pC(0, "incorrect action type", null);
    }
}
