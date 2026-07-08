package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Slq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730960Slq {
    public static volatile C730960Slq LIZ;

    public static C730960Slq LIZ() {
        if (LIZ == null) {
            synchronized (C730960Slq.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C730960Slq();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static void LIZIZ(View view, int i, String str, String str2, String str3, Boolean bool) {
        Boolean bool2 = (Boolean) view.getTag(R.id.v9t);
        if (bool2 != null && bool2.booleanValue()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("group_id", str2);
            c2344009Gk.LJIIIIZZ("author_id", str3);
            String str4 = "";
            c2344009Gk.LJIIIIZZ("show_content", "");
            if (i == 2) {
                c2344009Gk.LIZJ(bool.booleanValue() ? 1 : 0, "is_pop_up");
            } else {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                        }
                    } else {
                        str4 = "comment_highlight_click";
                    }
                } else {
                    str4 = "like_highlight_click";
                }
                C20684815ws.LJIILLIIL(str4, c2344009Gk.LIZ);
            }
            str4 = "share_highlight_click";
            C20684815ws.LJIILLIIL(str4, c2344009Gk.LIZ);
        }
    }
}
