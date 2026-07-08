package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;
import ttpobfuscated.fe;

/* JADX INFO: renamed from: X.0X2P, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X2P {
    public static final C0X2P LIZ = new C0X2P();

    public static void LIZ(int i) {
        try {
            String strLLIZ = C2204961BRm.LLIZ(C786410Ut5.A2(), "https://tiktokv.com", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEOp7phYk4axojZYzPai1qYNI", null));
            boolean z = true;
            if (TextUtils.isEmpty(strLLIZ) || !a0.LJJIIZI(strLLIZ, fe.e, false)) {
                C844470XAv.LIZ.getClass();
                if (C1256140inE.LIZ(C1493400oxu.LJIIJ(C844470XAv.LIZ()).LJ(".tiktokv.com"))) {
                    z = false;
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("cookie1", strLLIZ);
                int i2 = 2;
                c2344009Gk.LIZJ(2, "empty");
                if (!z) {
                    i2 = 3;
                }
                c2344009Gk.LIZJ(i2, "in_share_cookie");
                if (!z) {
                    c2344009Gk.LJFF("share_cookie", C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "ss_app_config").getString("share_cookie_host_list", ""));
                }
                c2344009Gk.LIZJ(i, "enter_from");
                C20684815ws.LJIILLIIL("cookie_status", c2344009Gk.LIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
