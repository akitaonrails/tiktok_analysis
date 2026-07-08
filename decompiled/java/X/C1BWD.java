package X;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.lobby.auth.AuthResult;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1BWD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C1BWD {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C1BWA LIZ(String str) {
        C1BWA.LIZ.getClass();
        switch (str.hashCode()) {
            case -1240244679:
                if (!str.equals("google")) {
                    return null;
                }
                return new C1BWA() { // from class: X.1BWG
                    public static final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(7, 8, 16, 12501, 12502);

                    @Override // X.C1BWA
                    public final void LIZ(AuthResult authResult, C20431714x9 c20431714x9) {
                        C20431714x9 c20431714x9LIZ = C1BWC.LIZ(authResult, c20431714x9, "google");
                        if (c20431714x9LIZ == null) {
                            return;
                        }
                        int providerErrorCode = 0;
                        String message = null;
                        if (authResult.mIsSuccessful) {
                            C20431814xA.LIZ(c20431714x9LIZ, EnumC20431914xB.SUCCESS, null, 0, null);
                            return;
                        }
                        C851480Xak c851480Xak = authResult.mErrorCause;
                        if (c851480Xak != null) {
                            providerErrorCode = c851480Xak.getProviderErrorCode();
                            c851480Xak.getErrorCode();
                            message = c851480Xak.getMessage();
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("googleErrorCode: ");
                        sbLIZ.append(providerErrorCode);
                        sbLIZ.append(", errorDesc: ");
                        sbLIZ.append(message);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        if (!authResult.mIsCancelled && !LIZIZ.contains(Integer.valueOf(providerErrorCode))) {
                            C20431814xA.LIZIZ(c20431714x9LIZ, strLIZIZ, providerErrorCode, message);
                        } else {
                            C20431814xA.LIZ(c20431714x9LIZ, EnumC20431914xB.CANCEL, strLIZIZ, providerErrorCode, message);
                        }
                    }
                };
            case 3321844:
                if (!str.equals("line")) {
                    return null;
                }
                return new C1BWA() { // from class: X.1BWE
                    @Override // X.C1BWA
                    public final void LIZ(AuthResult authResult, C20431714x9 c20431714x9) {
                        int errorCode;
                        String message;
                        C20431714x9 c20431714x9LIZ = C1BWC.LIZ(authResult, c20431714x9, "line");
                        if (c20431714x9LIZ == null) {
                            return;
                        }
                        if (authResult.mIsSuccessful) {
                            if (!TextUtils.isEmpty(authResult.mToken)) {
                                C20431814xA.LIZ(c20431714x9LIZ, EnumC20431914xB.SUCCESS, null, 0, null);
                                return;
                            } else {
                                C20431814xA.LIZIZ(c20431714x9LIZ, "token = null", 0, null);
                                return;
                            }
                        }
                        C851480Xak c851480Xak = authResult.mErrorCause;
                        if (c851480Xak != null) {
                            errorCode = c851480Xak.getErrorCode();
                            message = c851480Xak.getMessage();
                        } else {
                            errorCode = 0;
                            message = null;
                        }
                        if (authResult.mIsCancelled) {
                            C20431814xA.LIZ(c20431714x9LIZ, EnumC20431914xB.CANCEL, null, errorCode, message);
                            return;
                        }
                        int i = authResult.mBundle.getInt("line_response_ordinal", 0);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Internal error {code = ");
                        sbLIZ.append(i);
                        sbLIZ.append(", desc = ");
                        sbLIZ.append(message);
                        sbLIZ.append('}');
                        C20431814xA.LIZIZ(c20431714x9LIZ, C2188811AlT.LIZIZ(sbLIZ), i, message);
                    }
                };
            case 486515695:
                if (!str.equals("kakaotalk")) {
                    return null;
                }
                return new C1BWA() { // from class: X.1BWH
                    @Override // X.C1BWA
                    public final void LIZ(AuthResult authResult, C20431714x9 c20431714x9) {
                        String message;
                        int errorCode;
                        C20431714x9 c20431714x9LIZ = C1BWC.LIZ(authResult, c20431714x9, "kakaotalk");
                        if (c20431714x9LIZ == null) {
                            return;
                        }
                        C851480Xak c851480Xak = authResult.mErrorCause;
                        if (c851480Xak != null) {
                            errorCode = c851480Xak.getErrorCode();
                            message = c851480Xak.getMessage();
                        } else {
                            message = null;
                            errorCode = 0;
                        }
                        if (authResult.mIsSuccessful) {
                            C20431814xA.LIZ(c20431714x9LIZ, EnumC20431914xB.SUCCESS, null, 0, null);
                            return;
                        }
                        if (authResult.mIsCancelled) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(message);
                            sbLIZ.append(" | ");
                            sbLIZ.append(Log.getStackTraceString(authResult.mErrorCause));
                            C20431814xA.LIZ(c20431714x9LIZ, EnumC20431914xB.CANCEL, C2188811AlT.LIZIZ(sbLIZ), errorCode, message);
                            return;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Error code = ");
                        sbLIZ2.append(errorCode);
                        sbLIZ2.append(", desc = ");
                        sbLIZ2.append(message);
                        C20431814xA.LIZIZ(c20431714x9LIZ, C2188811AlT.LIZIZ(sbLIZ2), errorCode, message);
                    }
                };
            case 497130182:
                if (!str.equals("facebook")) {
                    return null;
                }
                return new C1BWA() { // from class: X.1BWF
                    @Override // X.C1BWA
                    public final void LIZ(AuthResult authResult, C20431714x9 c20431714x9) {
                        String message;
                        int errorCode;
                        int i;
                        C20431714x9 c20431714x9LIZ = C1BWC.LIZ(authResult, c20431714x9, "facebook");
                        if (c20431714x9LIZ == null) {
                            return;
                        }
                        if (authResult.mIsSuccessful) {
                            C20431814xA.LIZ(c20431714x9LIZ, EnumC20431914xB.SUCCESS, null, 0, null);
                            return;
                        }
                        C851480Xak c851480Xak = authResult.mErrorCause;
                        if (c851480Xak != null) {
                            errorCode = c851480Xak.getErrorCode();
                            message = c851480Xak.getMessage();
                        } else {
                            message = "";
                            errorCode = 0;
                        }
                        if (authResult.mIsCancelled) {
                            C20431814xA.LIZ(c20431714x9LIZ, EnumC20431914xB.CANCEL, message, errorCode, message);
                            return;
                        }
                        C2344809Gs.LJI(authResult.mErrorCause);
                        StringBuilder sb = new StringBuilder();
                        sb.append(message);
                        sb.append(" | ");
                        C851480Xak c851480Xak2 = authResult.mErrorCause;
                        if (c851480Xak2 != null && c851480Xak2.getStackTrace() != null) {
                            C089E c089e = new C089E(authResult.mErrorCause.getStackTrace());
                            while (c089e.hasNext()) {
                                sb.append(((StackTraceElement) c089e.next()).toString());
                            }
                        }
                        String string = sb.toString();
                        if (message != null && message.length() != 0 && a0.LJJIIZI(message, "connection", true)) {
                            i = -10002;
                        } else {
                            i = -10000;
                        }
                        C20431814xA.LIZIZ(c20431714x9LIZ, string, i, message);
                    }
                };
            default:
                return null;
        }
    }
}
