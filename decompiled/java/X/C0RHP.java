package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0RHP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RHP {
    public static final C0RHP LIZ = new C0RHP();

    public static void LIZ(Context context, Aweme aweme, int i, String str, String str2, String str3, String str4, String str5, User user) {
        String str6;
        String strLJII;
        String requestId;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C735410St1 c735410St1 = new C735410St1();
        c735410St1.LJJIJLIJ(i, aweme);
        if (aweme != null && (requestId = aweme.getRequestId()) != null) {
            c735410St1.LJJLIL = requestId;
        }
        c735410St1.LLIIIZ = user;
        if (str == null) {
            str6 = "";
        } else {
            str6 = str;
        }
        c735410St1.LIZLLL = str6;
        c735410St1.LJJIJL(context);
        c735410St1.LJJLIIIJILLIZJL = str3;
        if (aweme != null) {
            strLJII = C729510SjV.LJII(aweme);
        } else {
            strLJII = null;
        }
        c735410St1.LJJJZ = strLJII;
        c735840Sti.getClass();
        c735410St1.LJJL = C735840Sti.LJIIIZ(aweme);
        c735840Sti.getClass();
        C735840Sti.LIZJ(c735410St1, aweme, str, str2, context, null);
        C1380890m2R.LJ(aweme, c735410St1);
        c735410St1.LIZIZ(C666580QCq.LIZIZ(aweme, "enter_personal_detail", str, null));
        c735410St1.LJFF("enter_position", str4, InterfaceC1210900hcG.LIZ);
        if (str5 != null) {
            c735410St1.LJ("previous_page_position", str5);
        }
        c735410St1.LJIILJJIL();
    }
}
