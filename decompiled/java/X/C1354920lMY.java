package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lMY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354920lMY {
    public static C0XIR LIZ(Exception exc) {
        if (exc instanceof C0XIR) {
            return (C0XIR) exc;
        }
        Throwable cause = exc.getCause();
        if (cause instanceof C0XIR) {
            return (C0XIR) cause;
        }
        return null;
    }

    public static void LIZIZ(Context context, C0XIR c0xir) {
        if (!TextUtils.isEmpty(c0xir.getResponse())) {
            try {
                JSONObject jSONObject = new JSONObject(c0xir.getResponse());
                if (!TextUtils.isEmpty(jSONObject.optString("status_msg"))) {
                    c0xir.setErrorMsg(jSONObject.optString("status_msg"));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LIZLLL(context, c0xir, R.string.txq);
    }

    public static boolean LIZJ(Context context, Throwable th) {
        return LIZLLL(context, th, R.string.txq);
    }

    public static boolean LIZLLL(Context context, Throwable th, int i) {
        C0XIR c0xir;
        int errorCode;
        if (context == null || th == null) {
            return false;
        }
        if (th instanceof C0XIR) {
            c0xir = (C0XIR) th;
        } else {
            Throwable cause = th.getCause();
            if (cause instanceof C0XIR) {
                c0xir = (C0XIR) cause;
            } else {
                c0xir = null;
            }
        }
        if (c0xir != null) {
            if (c0xir.getErrorCode() == 2155 || (errorCode = c0xir.getErrorCode()) == 3070 || errorCode == 3071 || errorCode == 3072 || errorCode == 8) {
                return true;
            }
            if (errorCode == 1001) {
                try {
                    C1397620mTQ c1397620mTQ = new C1397620mTQ(context);
                    c1397620mTQ.LJFF(2131838680, null);
                    C1397580mTM c1397580mTM = new C1397580mTM(context);
                    c1397580mTM.LIZIZ(c0xir.getErrorMsg());
                    c1397580mTM.LJIIL = c1397620mTQ;
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    return true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return true;
                }
            }
            if (errorCode != 2003 && errorCode != 2004) {
                if (!TextUtils.isEmpty(c0xir.getPrompt())) {
                    C0XQ7.LJ();
                    C0XQ7.LIZ.LJIIIZ().promptIfNeededOrToast(context, c0xir.getPrompt(), errorCode);
                    return false;
                }
                if (!TextUtils.isEmpty(c0xir.getErrorMsg())) {
                    C0XQ7.LJ();
                    C0XQ7.LIZ.LJIIIZ().promptIfNeededOrToast(context, c0xir.getErrorMsg(), errorCode);
                    return false;
                }
                if (c0xir.getErrorCode() == 100) {
                    C1233040iBy c1233040iBy = new C1233040iBy(context);
                    c1233040iBy.LIZIZ(2131829156);
                    c1233040iBy.LIZLLL();
                    return false;
                }
                if (c0xir.getErrorCode() == 3004008) {
                    C1233040iBy c1233040iBy2 = new C1233040iBy(context);
                    c1233040iBy2.LIZIZ(2131835567);
                    c1233040iBy2.LIZLLL();
                    return false;
                }
                C1233040iBy c1233040iBy3 = new C1233040iBy(context);
                c1233040iBy3.LIZIZ(i);
                c1233040iBy3.LIZLLL();
                return false;
            }
            return true;
        }
        if (C299060Bns.LIZ()) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            boolean zLIZLLL = true ^ C0XF1.LIZLLL(context);
            if (activityLIZ != null && zLIZLLL) {
                C1389880mGw c1389880mGw = new C1389880mGw(activityLIZ);
                c1389880mGw.LJIIIIZZ(2131837962);
                c1389880mGw.LJIIJ();
                return false;
            }
            C1233040iBy c1233040iBy4 = new C1233040iBy(context);
            c1233040iBy4.LIZIZ(i);
            c1233040iBy4.LIZLLL();
            return false;
        }
        C1233040iBy c1233040iBy5 = new C1233040iBy(context);
        c1233040iBy5.LIZIZ(i);
        c1233040iBy5.LIZLLL();
        return false;
    }
}
