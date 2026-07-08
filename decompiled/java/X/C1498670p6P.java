package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0p6P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498670p6P implements InterfaceC1498840p6g {
    public static volatile boolean LIZIZ;
    public static volatile C1498690p6R LIZJ;
    public static volatile Class<?> LIZLLL;
    public final C1498680p6Q LIZ;

    static {
        try {
            Class.forName("com.bytedance.ttnet.TTNetInit");
            LIZIZ = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fail to get TTNetInit with: ");
            sbLIZ.append(th.toString());
            C1490830otl.LIZJ("TTNetHandlerImpl", "Init", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1498840p6g
    public final InterfaceC1498660p6O LIZJ() {
        if (LIZIZ) {
            return (InterfaceC1498660p6O) LJFF();
        }
        return null;
    }

    public final Object LJFF() {
        if (LIZJ == null) {
            synchronized (C1498670p6P.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1498690p6R(this.LIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    @Override // X.InterfaceC1498840p6g
    public final InterfaceC1500070p8f getTTNetDownloadHttpService() {
        if (LIZIZ) {
            return (InterfaceC1500070p8f) LJFF();
        }
        return null;
    }

    @Override // X.InterfaceC1498840p6g
    public final boolean LIZIZ() {
        return LIZIZ;
    }

    public C1498670p6P(C1498680p6Q c1498680p6Q) {
        this.LIZ = c1498680p6Q;
    }

    public static int LJ(Throwable th) {
        int errorCode;
        if (th == null) {
            return -1;
        }
        if (th instanceof C1494430ozZ) {
            return ((C1494430ozZ) th).getStatusCode();
        }
        if (!(th instanceof DownloadTTNetException) || (errorCode = ((BaseException) th).getErrorCode()) >= 4000 || errorCode <= 3000) {
            return -1;
        }
        return errorCode - LivePreCreateNextRoomPlayer.ENABLE;
    }

    @Override // X.InterfaceC1498840p6g
    public final int LIZLLL(Throwable th) {
        if (LIZIZ && th != null && LJ(th) <= 0) {
            return LJ(th.getCause());
        }
        return -1;
    }

    @Override // X.InterfaceC1498840p6g
    public final DownloadTTNetException LIZ(String str, Throwable th) {
        int i;
        int iIntValue;
        if (LIZIZ && th != null) {
            if (th instanceof DownloadTTNetException) {
                DownloadTTNetException downloadTTNetException = (DownloadTTNetException) th;
                if (!TextUtils.isEmpty(str)) {
                    downloadTTNetException.setRequestLog(str);
                }
                return downloadTTNetException;
            }
            if (th instanceof C1494430ozZ) {
                C1494430ozZ c1494430ozZ = (C1494430ozZ) th;
                if (c1494430ozZ.getStatusCode() > 0) {
                    DownloadTTNetException downloadTTNetException2 = new DownloadTTNetException(c1494430ozZ.getStatusCode() + LivePreCreateNextRoomPlayer.ENABLE, th);
                    downloadTTNetException2.setRequestLog(str);
                    return downloadTTNetException2;
                }
                DownloadTTNetException downloadTTNetException3 = new DownloadTTNetException(1082, th);
                downloadTTNetException3.setRequestLog(str);
                return downloadTTNetException3;
            }
            TTNetInit.getTTNetDepend().LIZIZ();
            if (LIZLLL == null) {
                try {
                    LIZLLL = Class.forName("com.ttnet.org.chromium.net.impl.NetworkExceptionImpl");
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (C1490830otl.LIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Fail to get Cronet Class ");
                        sbLIZ.append(th2.toString());
                        C1490830otl.LIZIZ("TTNetHandlerImpl", "translateTTNetException", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
            try {
                if (LIZLLL != null && LIZLLL.isInstance(th) && (iIntValue = ((Integer) Reflect.on(th).call("getCronetInternalErrorCode").get()).intValue()) < 0) {
                    DownloadTTNetException downloadTTNetException4 = new DownloadTTNetException(Math.abs(iIntValue) + 2000, th);
                    downloadTTNetException4.setRequestLog(str);
                    return downloadTTNetException4;
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                if (C1490830otl.LIZ()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Fail to call NetworkExceptionImpl function ");
                    sbLIZ2.append(th3.toString());
                    C1490830otl.LIZIZ("TTNetHandlerImpl", "translateTTNetException", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            if (th instanceof C1494690ozz) {
                try {
                    String requestLog = ((C1494690ozz) th).getRequestLog();
                    if (!TextUtils.isEmpty(requestLog)) {
                        JSONObject jSONObject = new JSONObject(requestLog);
                        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "base");
                        if (jSONObject2.has("net_error")) {
                            DownloadTTNetException downloadTTNetException5 = new DownloadTTNetException(Math.abs(JSONObjectProtectorUtils.getInt(jSONObject2, "net_error")) + 2000, th);
                            downloadTTNetException5.setRequestLog(requestLog);
                            return downloadTTNetException5;
                        }
                        JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "response");
                        if (jSONObject3.has("code") && (i = JSONObjectProtectorUtils.getInt(jSONObject3, "code")) > 0) {
                            DownloadTTNetException downloadTTNetException6 = new DownloadTTNetException(i + LivePreCreateNextRoomPlayer.ENABLE, th);
                            downloadTTNetException6.setRequestLog(requestLog);
                            return downloadTTNetException6;
                        }
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                }
                DownloadTTNetException downloadTTNetException7 = new DownloadTTNetException(1078, th);
                downloadTTNetException7.setRequestLog(str);
                return downloadTTNetException7;
            }
            return null;
        }
        return null;
    }
}
