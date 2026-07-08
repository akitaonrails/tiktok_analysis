package X;

import Y.AfS182S0100000_13;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ICoinEmailAccountService;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS592S0100000_13;

/* JADX INFO: renamed from: X.0XeR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853770XeR {
    public static final C853770XeR LIZ = new C853770XeR();

    public static boolean LIZ(BaseAccountFlowFragment baseAccountFlowFragment) {
        int i;
        Bundle arguments = baseAccountFlowFragment.getArguments();
        if (arguments != null) {
            i = arguments.getInt("current_scene");
        } else {
            i = -1;
        }
        if (i == EnumC852660Xce.UNBIND_PHONE.getValue()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(BaseAccountFlowFragment baseAccountFlowFragment) {
        if (baseAccountFlowFragment.VR() != EnumC852910Xd3.UNBIND_EMAIL_VERIFY_USING_PHONE && baseAccountFlowFragment.VR() != EnumC852910Xd3.UNBIND_PHONE_VERIFY) {
            return false;
        }
        return true;
    }

    public static void LIZJ(BaseAccountFlowFragment baseAccountFlowFragment, String str, Function0 function0, Map map, Function0 function02) {
        ICoinEmailAccountService iCoinEmailAccountService = (ICoinEmailAccountService) PluggableExtentionKt.pluggableSpi$default(ICoinEmailAccountService.class, false, false, false, 14, null);
        if (iCoinEmailAccountService != null) {
            iCoinEmailAccountService.LIZJ();
        }
        C0XZ4.LJJIII(C0XZ4.LIZ, baseAccountFlowFragment, baseAccountFlowFragment, "", 25, str, map, null, null, null, null, 960).LJIIIIZZ(new AfS182S0100000_13(function02, 115)).LJI(new C854700Xfw(function0, 8)).LJIILL();
    }

    public static void LJ(C853770XeR c853770XeR, BaseAccountFlowFragment baseAccountFlowFragment, String str, AwS563S0100000_19 awS563S0100000_19, Map map, AwS592S0100000_13 awS592S0100000_13, Function0 function0, int i) {
        Map map2 = map;
        AwS592S0100000_13 awS592S0100000_132 = null;
        if ((i & 4) != 0) {
            awS563S0100000_19 = null;
        }
        if ((i & 8) != 0) {
            map2 = null;
        }
        if ((i & 16) == 0) {
            awS592S0100000_132 = awS592S0100000_13;
        }
        c853770XeR.getClass();
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.UNBIND_PHONE_CONFIRM;
        c0xz4.getClass();
        C0XZ4.LJJIIJ(baseAccountFlowFragment, baseAccountFlowFragment, "", enumC852910Xd3, str, map2, awS592S0100000_132).LJIIIIZZ(new C516201zk(function0, 291)).LJI(new C854700Xfw(awS563S0100000_19, 9)).LJIILL();
    }
}
