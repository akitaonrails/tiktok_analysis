package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05uR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1502505uR {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        String str3;
        C0I0B.LJFF.LIZIZ();
        if (Intrinsics.LJFF(str, "official_message_inner_message")) {
            str3 = "sa_x_aimoji_welcome_page";
        } else {
            str3 = "sa_x_aimoji_popup";
        }
        C20684815ws.LJIILLIIL(str3, C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("action_type", str2)));
    }

    public static void LIZIZ(Integer num, int i) {
        String str;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = null;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        }
        if (num == null) {
            str = "saved";
        } else if (num.intValue() == 0) {
            str = "something_went_wrong";
        } else {
            str = "failed_to_save";
        }
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("message", str));
        interfaceC1493505szLIZIZ.getClass();
        C20684815ws.LJIILLIIL("sa_x_aimoji_toast", mapLIZJ);
    }
}
