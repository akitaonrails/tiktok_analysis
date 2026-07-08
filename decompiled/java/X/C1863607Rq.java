package X;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: renamed from: X.07Rq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1863607Rq {
    public static Object LIZ(View view, String str) {
        Object obj;
        if (view != null) {
            Object tag = view.getTag();
            if ((tag instanceof C1863507Rp) && (obj = ((HashMap) tag).get(str)) != null) {
                return obj;
            }
            return null;
        }
        return null;
    }

    public static void LIZIZ(View view, final String str, final Object obj) {
        if (view != null) {
            Object tag = view.getTag();
            if (tag instanceof C1863507Rp) {
                ((HashMap) tag).put(str, obj);
            } else {
                view.setTag(new HashMap<String, Object>(str, obj) { // from class: X.07Rp
                    {
                        put(str, obj);
                    }
                });
            }
        }
    }
}
