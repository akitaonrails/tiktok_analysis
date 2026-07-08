package X;

import android.os.Build;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0KgP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523750KgP {
    public static final C523750KgP LIZ = new C523750KgP();
    public static boolean LIZIZ;

    public static final boolean LJ() {
        int iIntValue = C297780Blo.LIZ() ? ((Number) C523780KgS.LIZ.getValue()).intValue() : C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_no_media_permission_optimize", true);
        if (iIntValue != 1 && iIntValue != 2) {
            return false;
        }
        LIZ.getClass();
        return Build.VERSION.SDK_INT >= 34;
    }

    public static boolean LIZJ(boolean z) {
        if (C0CHQ.LIZ().getAccountService().LIZ() || LIZIZ || Build.VERSION.SDK_INT < 34 || z) {
            return false;
        }
        C0LGY.LIZ.getClass();
        if (C0LGY.LJFF()) {
            return false;
        }
        if (!C0LGY.LJI()) {
            C0L0I.LIZ.getClass();
            if ((!(!C0L0I.LIZIZ.isEmpty()) || !C522640Kec.LIZ()) && !C523360Kfm.LIZJ()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LIZLLL(List<? extends InterfaceC529800KqA> list) {
        LIZ.getClass();
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        C0LGY.LIZ.getClass();
        if (C0LGY.LJFF()) {
            return false;
        }
        if (!C0LGY.LJI()) {
            C0L0I.LIZ.getClass();
            if ((!(!C0L0I.LIZIZ.isEmpty()) || !C522640Kec.LIZ()) && !C523360Kfm.LIZJ()) {
                return false;
            }
        }
        if (!((ArrayList) list).isEmpty()) {
            return false;
        }
        return true;
    }

    public static View.OnClickListener LIZ(final C19EG c19eg, final C0L91 c0l91, final Function0 function0, int i) {
        final String str;
        if ((i & 4) != 0) {
            str = "bpea-creative_tools_album_select_photos";
        } else {
            str = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        LIZ.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            return new View.OnClickListener() { // from class: X.0KgR
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0LGY c0lgy = C0LGY.LIZ;
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19eg);
                    if (c19egLIZIZ != null) {
                        C0L91 c0l912 = c0l91;
                        TokenCert tokenCert = new TokenCert(str);
                        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(function0, (Function0<Unit>) 979);
                        c0lgy.getClass();
                        C0LGY.LJIIJJI(c19egLIZIZ, c0l912, tokenCert, awS552S0100000_8);
                        return;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            };
        }
        return new View.OnClickListener() { // from class: X.0KgQ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        };
    }

    public static void LIZIZ(C523750KgP c523750KgP, C19EG c19eg, C0L91 c0l91, Function0 function0) {
        c523750KgP.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            C0LGY c0lgy = C0LGY.LIZ;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19eg);
            if (c19egLIZIZ != null) {
                TokenCert tokenCert = new TokenCert("bpea-creative_tools_album_select_photos");
                AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(function0, (Function0<Unit>) 980);
                c0lgy.getClass();
                C0LGY.LJIIJJI(c19egLIZIZ, c0l91, tokenCert, awS552S0100000_8);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
