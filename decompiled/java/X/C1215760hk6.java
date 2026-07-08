package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;

/* JADX INFO: renamed from: X.0hk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215760hk6 {
    public static boolean LIZ(String str, Context context) {
        if (str != null && str.length() >= 2) {
            if (str.length() > 24) {
                C1233040iBy c1233040iBy = new C1233040iBy(context);
                c1233040iBy.LIZIZ(2131847638);
                c1233040iBy.LIZLLL();
                return false;
            }
            if (!str.matches("[0-9A-Za-z_.]*")) {
                C1233040iBy c1233040iBy2 = new C1233040iBy(context);
                c1233040iBy2.LIZIZ(2131847634);
                c1233040iBy2.LIZLLL();
                return false;
            }
            if (PatternProtector.compile("[0-9]*").matcher(str).matches()) {
                C1233040iBy c1233040iBy3 = new C1233040iBy(context);
                c1233040iBy3.LIZIZ(2131847635);
                c1233040iBy3.LIZLLL();
                return false;
            }
            return true;
        }
        C1233040iBy c1233040iBy4 = new C1233040iBy(context);
        c1233040iBy4.LIZIZ(2131847637);
        c1233040iBy4.LIZLLL();
        return false;
    }

    public static boolean LIZIZ(String str, String str2, String str3, Context context) {
        if ((str3 != null && str3.toLowerCase().contains("tiktok")) || TextUtils.equals(str, "2062")) {
            C1233040iBy c1233040iBy = new C1233040iBy(context);
            c1233040iBy.LIZIZ(2131835658);
            c1233040iBy.LIZLLL();
            return false;
        }
        if (TextUtils.equals(str, "2064")) {
            C1233040iBy c1233040iBy2 = new C1233040iBy(context);
            c1233040iBy2.LIZIZ(2131847636);
            c1233040iBy2.LIZLLL();
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        C1233040iBy c1233040iBy3 = new C1233040iBy(context);
        c1233040iBy3.LIZJ(str2);
        c1233040iBy3.LIZLLL();
        return false;
    }
}
