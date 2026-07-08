package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.WindowInsets;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.GroupCheckMsg;

/* JADX INFO: renamed from: X.0iAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1232370iAt {
    public static final int LIZ(Throwable th) {
        if (th instanceof C0XIR) {
            return ((C23112093u) th).getErrorCode();
        }
        if (th instanceof C1494450ozb) {
            return ((C1494450ozb) th).getCronetInternalErrorCode();
        }
        return -1;
    }

    public static final int LIZIZ(C0YMW c0ymw) {
        Object c098200Yq;
        Integer statusCode;
        if (c0ymw == null) {
            return 0;
        }
        String checkMsg = c0ymw.getCheckMsg();
        Object obj = null;
        if (checkMsg != null) {
            try {
                c098200Yq = (GroupCheckMsg) C051M.LIZIZ(GroupCheckMsg.class, checkMsg);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            GroupCheckMsg groupCheckMsg = (GroupCheckMsg) obj;
            if (groupCheckMsg != null && (statusCode = groupCheckMsg.getStatusCode()) != null) {
                return statusCode.intValue();
            }
        }
        return c0ymw.getCode();
    }

    public static final C0ZBV LIZJ(C0YMW c0ymw) {
        String checkMsg;
        Object c098200Yq;
        Object obj = null;
        if (c0ymw != null && (checkMsg = c0ymw.getCheckMsg()) != null) {
            try {
                c098200Yq = (GroupCheckMsg) C051M.LIZIZ(GroupCheckMsg.class, checkMsg);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            GroupCheckMsg groupCheckMsg = (GroupCheckMsg) obj;
            if (groupCheckMsg != null) {
                Integer statusCode = groupCheckMsg.getStatusCode();
                if (statusCode != null && statusCode.intValue() == 0) {
                    return C0ZBV.SUCCESS;
                }
                return C0ZBV.BUSINESS_FAIL;
            }
        }
        return C0ZBV.ABNORMAL_FAIL;
    }

    public static final int LIZLLL(Context context) throws Exception {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Activity activityLIZIZ;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ == null && ((abstractC1387200mCcLJ = C1906580ziK.LJ()) == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null)) {
            return C497820Jfg.LIZ(context);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            C0IKF.LIZ.getClass();
            C465320IMo.LIZ();
            C19738412Ko c19738412KoLIZ = C19738212Km.LIZ(activityLIZ);
            C20244914Jj c20244914JjLIZIZ = c19738412KoLIZ.LIZIZ.LIZIZ(WindowInsets.Type.systemBars());
            return (c19738412KoLIZ.LIZ().height() - c20244914JjLIZIZ.LIZIZ) - c20244914JjLIZIZ.LIZLLL;
        }
        return C497820Jfg.LIZ(activityLIZ);
    }

    public static final boolean LJ(C0YMW c0ymw) {
        String checkMsg;
        Object c098200Yq;
        if (c0ymw != null && (checkMsg = c0ymw.getCheckMsg()) != null) {
            try {
                c098200Yq = (GroupCheckMsg) C051M.LIZIZ(GroupCheckMsg.class, checkMsg);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            GroupCheckMsg groupCheckMsg = (GroupCheckMsg) c098200Yq;
            if (groupCheckMsg != null && groupCheckMsg.getStatusCode() != null) {
                Integer statusCode = groupCheckMsg.getStatusCode();
                if (statusCode == null || statusCode.intValue() != 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
