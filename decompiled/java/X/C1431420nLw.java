package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.vesdk.VEException;
import java.io.IOException;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431420nLw {
    public static final C1431420nLw LIZ = new C1431420nLw();

    public static final boolean LIZ(Throwable th) {
        LIZ.getClass();
        if (th.getCause() instanceof IOException) {
            if (LIZLLL(th) || Math.min(C2354709Kn.LJIILL(), 2147483647L) < 100) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZIZ(Throwable th) {
        Throwable cause;
        if (!(th instanceof C1431430nLx)) {
            if (th != null) {
                cause = th.getCause();
            } else {
                cause = null;
            }
            if (!(cause instanceof C1431430nLx)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean LIZJ(Throwable th) {
        int iLJFF = LJFF(th);
        if (iLJFF != -66666 && iLJFF != -6666601) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Throwable th) {
        if (th == null) {
            return false;
        }
        do {
            String message = th.getMessage();
            if (message != null && a0.LJJIIZI(message, "No space left on device", false)) {
                return true;
            }
            th = th.getCause();
        } while (th != null);
        return false;
    }

    public static final String LJ(Throwable th) {
        BaseResponse.ServerTimeExtra serverTimeExtra;
        if (th instanceof C0XIR) {
            Object rawResponse = ((C0XIR) th).getRawResponse();
            if ((rawResponse instanceof BaseResponse) && (serverTimeExtra = ((BaseResponse) rawResponse).extra) != null) {
                String str = serverTimeExtra.logid;
                if (str == null) {
                    return "empty_log_id";
                }
                return str;
            }
            return "";
        }
        if (th instanceof C1435220nS4) {
            return LJ(th.getCause());
        }
        return "";
    }

    public static final int LJFF(Throwable th) {
        int code;
        if (th instanceof C1433670nPZ) {
            code = ((C1433670nPZ) th).getCode();
        } else if (th instanceof VEException) {
            code = ((VEException) th).getRetCd();
        } else if (th instanceof C1435220nS4) {
            code = ((C1435220nS4) th).getCode();
        } else {
            code = 10038;
        }
        LIZ.getClass();
        if (LIZLLL(th)) {
            return 100101;
        }
        return code;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LJII(java.lang.Throwable r6) {
        /*
            boolean r0 = r6 instanceof X.C1434330nQd
            if (r0 == 0) goto L17
            r5 = r6
            X.0nQd r5 = (X.C1434330nQd) r5
            long r3 = r5.getErrorCode()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L17
            long r1 = r5.getErrorCode()
        L15:
            int r0 = (int) r1
            return r0
        L17:
            boolean r0 = r6 instanceof X.C1435220nS4
            if (r0 == 0) goto L22
            X.0nS4 r6 = (X.C1435220nS4) r6
            int r0 = r6.getCode()
            return r0
        L22:
            boolean r0 = r6 instanceof X.C1431450nLz
            if (r0 == 0) goto L2d
            X.0nLz r6 = (X.C1431450nLz) r6
            long r1 = r6.getErrorCode()
            goto L15
        L2d:
            r0 = 12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1431420nLw.LJII(java.lang.Throwable):int");
    }

    public static final int LJI(int i, Throwable th) {
        if (th instanceof C1431430nLx) {
            return ((C1431180nLY) th).getErrorCode();
        }
        if (th instanceof C0XIR) {
            return ((C23112093u) th).getErrorCode();
        }
        if (th instanceof C1435220nS4) {
            return ((C1435220nS4) th).getCode();
        }
        if (th instanceof C1900507cR) {
            return 2713;
        }
        if (!(th instanceof C1494690ozz)) {
            return i;
        }
        return ((C1494690ozz) th).getCronetInternalErrorCode();
    }
}
