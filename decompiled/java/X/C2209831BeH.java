package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.1BeH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209831BeH {
    public final C2209901BeO LIZ;

    public C2209831BeH(C2209901BeO c2209901BeO) {
        this.LIZ = c2209901BeO;
    }

    public final String LIZ(Context context, String str) {
        if (this.LIZ.LJIL) {
            if (str.contains("?")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("&");
                sbLIZ.append("tt_data=a");
                str = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("?");
                sbLIZ2.append("tt_data=a");
                str = C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        return C2209651Bdz.LIZJ(this.LIZ.LJLILLLLZI(context, str, true, C0XDP.L1), C20223814Bg.LIZJ);
    }

    public final String[] LIZIZ(C2209911BeP c2209911BeP, boolean z, C2209631Bdx c2209631Bdx) {
        String[] strArr;
        String[] strArr2;
        C2210461BfI c2210461BfILJII = c2209911BeP.LJII();
        if (z) {
            strArr = c2210461BfILJII.LIZIZ;
        } else {
            strArr = c2210461BfILJII.LIZ;
        }
        if (c2209631Bdx != null && (!TextUtils.isEmpty(c2209631Bdx.LJI) || !TextUtils.isEmpty(c2209631Bdx.LJII))) {
            if (c2209631Bdx.LJIIIIZZ == null) {
                c2209631Bdx.LJIIIIZZ = new String[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    int iIndexOf = strArr[i].indexOf("/service/2/app_log/");
                    if (iIndexOf > 0) {
                        String strSubstring = strArr[i].substring(0, iIndexOf);
                        String strSubstring2 = strArr[i].substring(iIndexOf);
                        if (!TextUtils.isEmpty(c2209631Bdx.LJI) && c2209631Bdx.LJI.startsWith("https://") && !c2209631Bdx.LJI.endsWith("/")) {
                            strSubstring = c2209631Bdx.LJI;
                        }
                        if (!TextUtils.isEmpty(c2209631Bdx.LJII) && c2209631Bdx.LJII.startsWith("/") && c2209631Bdx.LJII.endsWith("/")) {
                            strSubstring2 = c2209631Bdx.LJII;
                        }
                        String[] strArr3 = c2209631Bdx.LJIIIIZZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strSubstring);
                        sbLIZ.append(strSubstring2);
                        strArr3[i] = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        c2209631Bdx.LJIIIIZZ[i] = strArr[i];
                    }
                }
            }
            if (!c2209631Bdx.LJIIIZ && (strArr2 = c2209631Bdx.LJIIIIZZ) != null && strArr2.length > 0 && strArr2.length > 0) {
                strArr = strArr2;
            }
        }
        Application application = c2209911BeP.LLILLL.LJIIJ;
        int length = strArr.length;
        String[] strArr4 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr4[i2] = LIZ(application, strArr[i2]);
        }
        return strArr4;
    }
}
