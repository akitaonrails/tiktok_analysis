package X;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: X.0JCX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JCX {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i) {
        C19EG c19eg;
        Activity activityLJFF = C2214201BlK.LJFF();
        if ((activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null) {
            c19eg.runOnUiThread(new RunnableC514901zX(c19eg, c19eg.getString(i), 1));
        }
    }

    public static void LIZLLL(String str) {
        C19EG c19eg;
        if (str != null && str.length() != 0) {
            Activity activityLJFF = C2214201BlK.LJFF();
            if ((activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null) {
                c19eg.runOnUiThread(new RunnableC514901zX(c19eg, str, 1));
            }
        }
    }

    public static void LIZIZ(int i, Context context) {
        if (context == null) {
            LIZ(i);
        } else {
            LIZJ(context, context.getString(i));
        }
    }

    public static void LIZJ(Context context, String str) {
        C19EG c19eg;
        if (str != null && str.length() != 0) {
            if (!(context instanceof C19EG) || (c19eg = (C19EG) context) == null) {
                Activity activityLJFF = C2214201BlK.LJFF();
                if (!(activityLJFF instanceof C19EG) || (c19eg = (C19EG) activityLJFF) == null) {
                    return;
                }
            }
            c19eg.runOnUiThread(new RunnableC514901zX(c19eg, str, 1));
        }
    }
}
