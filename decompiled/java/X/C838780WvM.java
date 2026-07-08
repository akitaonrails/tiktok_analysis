package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.crash.Npth;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.account.platform.setting.CsrfMonitorSwitch;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.TTAccountInit;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WvM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838780WvM {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, String str2) {
        boolean z;
        Object objLIZ;
        CsrfMonitorSwitch csrfMonitorSwitch = C838830WvR.LIZ;
        CsrfMonitorSwitch csrfMonitorSwitch2 = C838830WvR.LIZ;
        InterfaceC838850WvT interfaceC838850WvT = C310900CGq.LIZ;
        if (interfaceC838850WvT != null && (objLIZ = interfaceC838850WvT.LIZ(CsrfMonitorSwitch.class, csrfMonitorSwitch2)) != null) {
            csrfMonitorSwitch2 = objLIZ;
        }
        String string = "";
        if (csrfMonitorSwitch2.enableSDK) {
            boolean z2 = true;
            try {
                Object objLIZIZ = C838800WvO.LIZIZ(str);
                if (objLIZIZ != null) {
                    if (objLIZIZ instanceof String) {
                        if (((CharSequence) objLIZIZ).length() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((CharSequence) objLIZIZ, new String[]{";"}, 0, 6);
                            if (!listLJJLIIIJILLIZJL.isEmpty()) {
                                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                                while (it2.hasNext()) {
                                    List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
                                    if (listLJJLIIIJILLIZJL2.size() >= 2 && (u.LJIJI(a0.LJLIIIL((String) listLJJLIIIJILLIZJL2.get(0)).toString(), "passport_csrf_token", true) || u.LJIJI(a0.LJLIIIL((String) listLJJLIIIJILLIZJL2.get(0)).toString(), "passport_csrf_token_default", true))) {
                                        string = a0.LJLIIIL((String) listLJJLIIIJILLIZJL2.get(1)).toString();
                                        break;
                                    }
                                }
                                if (string.length() != 0) {
                                    z2 = false;
                                }
                                if (z2) {
                                    throw new C838820WvQ("cookie is not empty, but csrf not found");
                                }
                            } else {
                                throw new C838820WvQ("cookie array is empty");
                            }
                        } else {
                            throw new C838820WvQ("cookie is a empty string");
                        }
                    } else {
                        throw new C838820WvQ("cookie is not string");
                    }
                } else {
                    throw new C838820WvQ("cookie is null");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZIZ(str, str2, th);
                return "";
            }
        } else {
            String strLIZ = C838790WvN.LIZ(str, "passport_csrf_token");
            if (TextUtils.isEmpty(strLIZ)) {
                strLIZ = C838790WvN.LIZ(str, "passport_csrf_token_default");
            }
            if (strLIZ != null) {
                return strLIZ;
            }
        }
        return string;
    }

    public static void LIZIZ(String str, String str2, Throwable th) {
        String strLIZIZ;
        try {
            Uri uri = UriProtector.parse(str);
            HashMap map = new HashMap();
            String host = uri.getHost();
            String str3 = "";
            if (host == null) {
                host = "";
            }
            map.put("host", host);
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            map.put("path", path);
            map.put("from", str2);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            map.put("message", message);
            map.put("stack", C13SZ.LIZIZ(th));
            Throwable cause = th.getCause();
            if (cause == null || (strLIZIZ = C13SZ.LIZIZ(cause)) == null) {
                strLIZIZ = "";
            }
            map.put("cause", strLIZIZ);
            ((C848000XOk) TTAccountInit.LIZ()).getClass();
            new C837540WtM().LIZ("passport_get_csrf_failed", new JSONObject(map));
            ((C848000XOk) TTAccountInit.LIZ()).getClass();
            String message2 = th.getMessage();
            if (message2 != null) {
                str3 = message2;
            }
            Npth.reportBizException("PassportGetCsrfEmpty", th, str3, (Map<String, String>) map, true);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
