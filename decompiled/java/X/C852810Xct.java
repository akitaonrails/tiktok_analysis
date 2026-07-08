package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0Xct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852810Xct {
    public static final C852810Xct LIZ = new C852810Xct();
    public static boolean LIZIZ = ((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).isGuestMode();

    public static String LIZ(Fragment fragment) {
        String string;
        Bundle arguments = fragment.getArguments();
        if (arguments == null || (string = arguments.getString("3p_platform")) == null) {
            return "";
        }
        return string;
    }

    public static boolean LIZIZ(Fragment fragment) {
        return fragment.getArguments().getBoolean("code_sent", false);
    }

    public static String LIZJ(Fragment fragment) {
        String string;
        Bundle arguments = fragment.getArguments();
        if (arguments == null || (string = Integer.valueOf(arguments.getInt("config_key")).toString()) == null) {
            return "";
        }
        return string;
    }

    public static String LIZLLL(Fragment fragment) {
        return LJ(fragment.getArguments());
    }

    public static String LJ(Bundle bundle) {
        String string = bundle.getString("args_email");
        if (string == null) {
            return "";
        }
        return string;
    }

    public static String LJFF(Fragment fragment) {
        String string;
        Bundle arguments = fragment.getArguments();
        if (arguments == null || (string = arguments.getString("page")) == null) {
            return "";
        }
        return string;
    }

    public static PhoneNumberUtil.PhoneNumber LJI(Fragment fragment) {
        return LJII(fragment.getArguments());
    }

    public static PhoneNumberUtil.PhoneNumber LJII(Bundle bundle) {
        Serializable serializable = bundle.getSerializable("args_phone_number");
        if (serializable instanceof PhoneNumberUtil.PhoneNumber) {
            return (PhoneNumberUtil.PhoneNumber) serializable;
        }
        return null;
    }

    public static String LJIIIIZZ(Fragment fragment) {
        return fragment.getArguments().getString("args_string_phone_number", "");
    }

    public static boolean LJIIIZ(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("show_close_button");
        }
        return true;
    }

    public static String LJIIJ(Fragment fragment) {
        String string;
        Bundle arguments = fragment.getArguments();
        if (arguments == null || (string = arguments.getString("ticket")) == null) {
            return "";
        }
        return string;
    }

    public static String LJIIJJI(BaseAccountBindingsFlowFragment baseAccountBindingsFlowFragment) {
        return baseAccountBindingsFlowFragment.getArguments().getString("verify_ticket", "");
    }

    public static boolean LJIIL(Fragment fragment) {
        return fragment.getArguments().getBoolean("login_with_2sv", false);
    }

    public static boolean LJIILIIL(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null || !arguments.getBoolean("reset_pwd_from_login", false)) {
            return false;
        }
        return true;
    }

    public static void LJIILJJIL(Fragment fragment, boolean z) {
        fragment.getArguments().putBoolean("code_sent", z);
    }

    public static void LJIILL(Bundle bundle, String str) {
        C786410Ut5.LJJJI("current_page_name", str, bundle);
    }

    public static void LJIILLIIL(Bundle bundle, String str) {
        C786410Ut5.LJJJI("args_email", str, bundle);
    }

    public static void LJIIZILJ(Fragment fragment, String str) {
        C786410Ut5.LJJJI("args_email", str, fragment.getArguments());
    }

    public static void LJIJ(Fragment fragment, PhoneNumberUtil.PhoneNumber phoneNumber) {
        C786410Ut5.LJJIZ(fragment.requireArguments(), "args_phone_number", phoneNumber);
    }

    public static void LJIJI(Bundle bundle, String str) {
        C786410Ut5.LJJJI("args_string_phone_number", str, bundle);
    }

    public static void LJIJJ(Bundle bundle, String str) {
        C786410Ut5.LJJJI("ticket", str, bundle);
    }
}
