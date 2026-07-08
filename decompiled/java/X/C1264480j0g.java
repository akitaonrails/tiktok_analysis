package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0j0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264480j0g {
    public static final C1264480j0g LIZ = new C1264480j0g();

    public static void LIZ(Context context, String str) {
        boolean zLIZLLL;
        String str2;
        if (context == null) {
            zLIZLLL = false;
        } else {
            zLIZLLL = C0XF1.LIZLLL(context);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (zLIZLLL) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_success", str2);
        C20684815ws.LJIILLIIL("relation_list_retry_refresh", c2344009Gk.LIZ);
    }
}
