package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import j27.s;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0jmL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294030jmL {
    public static String LIZ(Context context, String str, boolean z) {
        InterfaceC1294040jmM interfaceC1294040jmM;
        String strLIZIZ;
        int iLastIndexOf;
        if ((context instanceof s) && !TextUtils.isEmpty(str)) {
            s sVarLIZIZ = C1298530jtb.LIZIZ(context);
            if (sVarLIZIZ == null) {
                LynxLog.e("ImageUrlRedirectUtils", "redirecting url failed due to no context available");
                return str;
            }
            if (z) {
                interfaceC1294040jmM = sVarLIZIZ.LLILZ;
            } else {
                interfaceC1294040jmM = sVarLIZIZ.LLILLL;
            }
            if (interfaceC1294040jmM != null) {
                String str2 = sVarLIZIZ.LLJJIII;
                if (TraceController.isTracingStarted()) {
                    HashMap map = new HashMap();
                    map.put("url", str);
                    TraceEvent.LIZJ("Interceptor.shouldRedirectImageUrl", map);
                }
                String strLIZIZ2 = null;
                try {
                    strLIZIZ = interfaceC1294040jmM.LIZIZ(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("shouldRedirectImageUrl occurred with exception: ");
                    sbLIZ.append(e.getMessage());
                    LynxLog.d("ImageUrlRedirectUtils", C2188811AlT.LIZIZ(sbLIZ));
                    strLIZIZ = null;
                }
                TraceEvent.LJII("Interceptor.shouldRedirectImageUrl");
                boolean z2 = false;
                if (strLIZIZ == null) {
                    if (!TextUtils.isEmpty(str) && str.startsWith("./") && !TextUtils.isEmpty(str2) && (iLastIndexOf = str2.lastIndexOf("/")) > 0) {
                        String strSubstring = str2.substring(0, iLastIndexOf);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strSubstring);
                        sbLIZ2.append(str.substring(1));
                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("shouldRedirectImageUrl use local image url:");
                        sbLIZ3.append(strLIZIZ2);
                        LynxLog.d("ImageUrlRedirectUtils", C2188811AlT.LIZIZ(sbLIZ3));
                        if (!strLIZIZ2.startsWith("http") && !strLIZIZ2.startsWith("file://") && !strLIZIZ2.startsWith("content://") && !strLIZIZ2.startsWith("res://") && !strLIZIZ2.startsWith("data:")) {
                            if (strLIZIZ2.startsWith("assets:///")) {
                                strLIZIZ2 = strLIZIZ2.replace("assets:///", "asset:///");
                            } else if (strLIZIZ2.startsWith("assets://")) {
                                strLIZIZ2 = strLIZIZ2.replace("assets://", "asset:///");
                            } else if (!strLIZIZ2.startsWith("asset:///")) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("file://");
                                sbLIZ4.append(strLIZIZ2);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                                strLIZIZ2 = strLIZIZ;
                            }
                        }
                    }
                } else {
                    strLIZIZ2 = strLIZIZ;
                }
                if (strLIZIZ2 != null) {
                    if (strLIZIZ2.startsWith("res:///")) {
                        int i = 7;
                        while (true) {
                            if (i < strLIZIZ2.length()) {
                                char cCharAt = strLIZIZ2.charAt(i);
                                if (cCharAt < '0' || cCharAt > '9') {
                                    break;
                                }
                                i++;
                            } else {
                                z2 = true;
                                break;
                            }
                        }
                        if (!z2) {
                            int iIndexOf = strLIZIZ2.indexOf(46);
                            if (iIndexOf < 0) {
                                iIndexOf = strLIZIZ2.length();
                            }
                            int iN3 = C786410Ut5.n3(sVarLIZIZ.getResources(), strLIZIZ2.substring(7, iIndexOf), "drawable", sVarLIZIZ.getPackageName());
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("res:///");
                            sbLIZ5.append(iN3);
                            return C2188811AlT.LIZIZ(sbLIZ5);
                        }
                    }
                    return strLIZIZ2;
                }
                return str;
            }
            return str;
        }
        return str;
    }
}
