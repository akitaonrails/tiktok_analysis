package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.01Lt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C319501Lt {
    public static final void LIZ() {
        List<LinkUser> listLIZLLL;
        long jLIZIZ = C963140bAe.LIZIZ() - C310501Ih.LIZLLL;
        long jLJII = C01JX.LJII();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        int size = (interfaceC954180awCLLJLL == null || (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) == null) ? 0 : listLIZLLL.size();
        HashMap map = new HashMap();
        map.put("room_id", String.valueOf(jLJII));
        map.put("guest_cnt", String.valueOf(size));
        EnumC918970a1P enumC918970a1PLJIILIIL = C917520Zz4.LJIILIIL();
        map.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJIILIIL).getFirst());
        map.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJIILIIL).getSecond());
        map.put("duration", String.valueOf(jLIZIZ));
        C0KX4.LIZ("livesdk_multi_audience_countdown_over", map, null, true);
        C310501Ih.LIZLLL = 0L;
    }

    public static final void LJFF() {
        if (C01HE.LIZJ() && C310501Ih.LIZJ == 0) {
            C310501Ih.LIZJ = C963140bAe.LIZIZ();
        }
        if (C01HE.LIZJ() || C310501Ih.LIZLLL != 0) {
            return;
        }
        C310501Ih.LIZLLL = C963140bAe.LIZIZ();
    }

    public static void LIZIZ(String str, String str2) {
        LJ(0, "preview_effect", str, str2, null);
    }

    public static final void LIZLLL(Long l, Long l2) {
        long jLongValue;
        long jLongValue2;
        long jLIZIZ = C963140bAe.LIZIZ() - C310501Ih.LIZJ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        C310501Ih.LIZIZ(jLIZIZ, jLongValue, jLongValue2);
    }

    public static final void LIZJ(int i, String str, String str2) {
        if (i == 1) {
            LJ(0, "start_countdown_for_all", str, str2, null);
        }
    }

    public static final void LJ(int i, String str, String str2, String str3, String str4) {
        int size;
        List<LinkUser> listLIZLLL;
        HashMap map = new HashMap();
        map.put("room_id", String.valueOf(C01JX.LJII()));
        map.put("anchor_id", String.valueOf(C930540aK4.LJII()));
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
            size = listLIZLLL.size();
        } else {
            size = 1;
        }
        map.put("guest_cnt", String.valueOf(size - 1));
        C923330a8R c923330a8R = C923330a8R.LIZ;
        map.put("is_moderator", C923330a8R.LIZLLL());
        map.put("function_name", str);
        map.put("action_detail", str2);
        map.put("to_user_type", "anchor");
        if (str4 == null) {
            str4 = "";
        }
        map.put("drop_reason", str4);
        map.put("error_code", String.valueOf(i));
        if (str3 == null) {
            str3 = "";
        }
        map.put("error_msg", str3);
        C0KX4.LIZ("livesdk_multi_function_call_result", map, null, true);
    }
}
