package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.utils.AVLog;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Locale;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jNv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278890jNv {
    public static String LIZIZ(String str) {
        int i;
        char cCharAt;
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int iIndexOf = lowerCase.indexOf("//");
        if (iIndexOf == -1) {
            i = 0;
        } else {
            i = iIndexOf + 2;
        }
        int i2 = i;
        int i3 = -1;
        while (i < lowerCase.length() && (cCharAt = lowerCase.charAt(i)) != '#' && cCharAt != '/') {
            if (cCharAt != ':') {
                if (cCharAt == '?') {
                    break;
                }
                if (cCharAt == '@') {
                    i2 = i + 1;
                }
            } else {
                i3 = i;
            }
            i++;
        }
        if (i3 != -1) {
            i = i3;
        }
        return str.substring(i2, i);
    }

    public static String LIZJ(String str) {
        if (str.startsWith(e3.e) && str.endsWith(e3.f)) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.e);
        sbLIZ.append(str);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZLLL(String str) {
        if (str.indexOf(58) == -1) {
            return false;
        }
        try {
            return InetAddress.getByName(str) instanceof Inet6Address;
        } catch (UnknownHostException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isIPv6Address: ");
            sbLIZ.append(e.getMessage());
            AVLog.iod("UrlUtils", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public static String LIZ(String str, String str2, String str3) {
        try {
            int length = str.length();
            String strLIZIZ = "";
            if (str.lastIndexOf("?") >= 0) {
                length = str.lastIndexOf("?") + 1;
                boolean z = false;
                for (String str4 : str.substring(length).split("&")) {
                    String[] strArrSplit = str4.split("=");
                    if (strArrSplit.length != 2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append(str4);
                        sbLIZ.append("&");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        if (strArrSplit[0].equals(str2)) {
                            strArrSplit[1] = str3;
                            z = true;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append(strArrSplit[0]);
                        sbLIZ2.append("=");
                        sbLIZ2.append(strArrSplit[1]);
                        sbLIZ2.append("&");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
                if (!z) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strLIZIZ);
                    sbLIZ3.append(str2);
                    sbLIZ3.append("=");
                    sbLIZ3.append(str3);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                }
                if (strLIZIZ.endsWith("&")) {
                    strLIZIZ = strLIZIZ.substring(0, strLIZIZ.length() - 1);
                }
            } else if (str.toLowerCase().lastIndexOf("%3f") >= 0) {
                length = str.toLowerCase().lastIndexOf("%3f") + 3;
                boolean z2 = false;
                for (String str5 : str.substring(length).split("%26")) {
                    String[] strArrSplit2 = str5.split("(%3d|%3D)");
                    if (strArrSplit2.length != 2) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(strLIZIZ);
                        sbLIZ4.append(str5);
                        sbLIZ4.append("%26");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                    } else {
                        if (strArrSplit2[0].equals(str2)) {
                            strArrSplit2[1] = str3;
                            z2 = true;
                        }
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(strLIZIZ);
                        sbLIZ5.append(strArrSplit2[0]);
                        sbLIZ5.append("%3d");
                        sbLIZ5.append(strArrSplit2[1]);
                        sbLIZ5.append("%26");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                    }
                }
                if (!z2) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(strLIZIZ);
                    sbLIZ6.append(str2);
                    sbLIZ6.append("%3d");
                    sbLIZ6.append(str3);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                }
                if (strLIZIZ.endsWith("%26")) {
                    strLIZIZ = strLIZIZ.substring(0, strLIZIZ.length() - 3);
                }
            } else {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("");
                sbLIZ7.append("?");
                sbLIZ7.append(str2);
                sbLIZ7.append("=");
                sbLIZ7.append(str3);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
            }
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append(str.substring(0, length));
            sbLIZ8.append(strLIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ8);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }
}
