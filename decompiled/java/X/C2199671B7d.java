package X;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.util.List;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199671B7d {
    public static ConnectivityManager LIZJ;
    public static final String LIZ = C2199671B7d.class.getSimpleName();
    public static final char[] LIZIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static String LIZLLL = null;

    public static boolean LJIJJLI() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void LIZJ(DownloadInfo downloadInfo) {
        C2199751B7l c2199751B7lLJFF;
        JSONObject jSONObjectLJIIIZ;
        String strOptString;
        if (downloadInfo != null && (jSONObjectLJIIIZ = (c2199751B7lLJFF = C2199751B7l.LJFF(downloadInfo.getId(), null)).LJIIIZ("download_dir")) != null) {
            String strOptString2 = jSONObjectLJIIIZ.optString("ins_desc");
            if (!TextUtils.isEmpty(strOptString2)) {
                LJI(downloadInfo.getSavePath(), strOptString2);
            }
            String title = downloadInfo.getTitle();
            if (TextUtils.isEmpty(title)) {
                title = downloadInfo.getName();
            }
            JSONObject jSONObjectLJIIIZ2 = c2199751B7lLJFF.LJIIIZ("download_dir");
            if (jSONObjectLJIIIZ2 != null) {
                strOptString = jSONObjectLJIIIZ2.optString("dir_name");
                if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith("/")) {
                    strOptString = strOptString.substring(1);
                }
                if (!TextUtils.isEmpty(strOptString)) {
                    if (!strOptString.contains("%s")) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strOptString);
                        sbLIZ.append(title);
                        strOptString = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        try {
                            strOptString = C786410Ut5.j4(strOptString, new Object[]{title});
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    if (strOptString.length() > 255) {
                        strOptString = strOptString.substring(strOptString.length() - 255);
                    }
                }
            } else {
                strOptString = "";
            }
            String savePath = downloadInfo.getSavePath();
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(savePath)) {
                File c0vsj = new C0VSJ(strOptString);
                File c0vsj2 = new C0VSJ(savePath);
                while (c0vsj2.isDirectory() && TextUtils.equals(c0vsj.getName(), c0vsj2.getName())) {
                    LJFF(c0vsj2.getPath());
                    c0vsj = c0vsj.getParentFile();
                    c0vsj2 = c0vsj2.getParentFile();
                    if (c0vsj == null || c0vsj2 == null) {
                        return;
                    }
                }
            }
        }
    }

    public static void LIZLLL(DownloadInfo downloadInfo) {
        LJ(downloadInfo, true);
    }

    public static void LJFF(String str) {
        boolean zLIZ = C1490830otl.LIZ();
        String str2 = LIZ;
        if (zLIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Thread:");
            sbLIZ.append(C786410Ut5.u3());
            C1490830otl.LIZIZ(str2, "deleteDirIfEmpty", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C20149513sj.LIZLLL(str) == 1 && C1294200jmc.LIZIZ(str) && !TextUtils.isEmpty(str)) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.isDirectory() && !c0vsj.delete() && C1490830otl.LIZ()) {
                C1490830otl.LIZIZ(str2, "deleteDirIfEmpty", "Delete Failed");
            }
        }
    }

    public static long LJIIIIZZ(String str) throws BaseException {
        try {
            return C2204961BRm.LLFFF(new StatFs(str), new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisoe/W6lMBTCNPX26POXk+I/9SgHI=", null));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new BaseException(1050, e);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw new BaseException(1052, th);
        }
    }

    public static long LJIIIZ(InterfaceC2199921B8c interfaceC2199921B8c) {
        long j = -1;
        if (interfaceC2199921B8c == null) {
            return -1L;
        }
        String strLJIILJJIL = LJIILJJIL(interfaceC2199921B8c, "Content-Length");
        if (TextUtils.isEmpty(strLJIILJJIL)) {
            String strLJIILJJIL2 = LJIILJJIL(interfaceC2199921B8c, "Content-Range");
            if (TextUtils.isEmpty(strLJIILJJIL2)) {
                return -1L;
            }
            try {
                Matcher matcher = PatternProtector.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(strLJIILJJIL2);
                if (!matcher.find()) {
                    return -1L;
                }
                j = (CastLongProtector.parseLong(matcher.group(2)) - CastLongProtector.parseLong(matcher.group(1))) + 1;
                return j;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                String str = LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Exception:");
                sbLIZ.append(e);
                C1490830otl.LIZJ(str, "parseContentLengthFromContentRange", C2188811AlT.LIZIZ(sbLIZ));
                return j;
            }
        }
        try {
            j = CastLongProtector.parseLong(strLJIILJJIL);
            return j;
        } catch (NumberFormatException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return j;
        }
    }

    public static String LJIIJ(Context context) {
        BufferedReader bufferedReader;
        StringBuilder sb;
        String str = LIZLLL;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String string = null;
        try {
            int iMyPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(context, "activity");
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : C2204961BRm.LJII(activityManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisoe/W6lMBTCNPX26POXk+I/9SgHI=", null))) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (C1490830otl.LIZ()) {
                            C1490830otl.LIZIZ(LIZ, "getCurProcessName", "ProcessName: " + runningAppProcessInfo.processName);
                        }
                        String str2 = runningAppProcessInfo.processName;
                        LIZLLL = str2;
                        return str2;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/proc/");
            sbLIZ.append(Process.myPid());
            sbLIZ.append("/cmdline");
            bufferedReader = new BufferedReader(new InputStreamReader(new C0VSP(C2188811AlT.LIZIZ(sbLIZ)), "iso-8859-1"));
        } catch (Throwable th) {
            th = th;
            bufferedReader = null;
        }
        try {
            sb = new StringBuilder();
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            LJJIIJ(bufferedReader);
        }
        while (true) {
            int i = bufferedReader.read();
            if (i <= 0) {
                break;
            }
            sb.append((char) i);
            LIZLLL = string;
            return string;
        }
        string = sb.toString();
        LJJIIJ(bufferedReader);
        LIZLLL = string;
        return string;
    }

    public static String LJIIJJI(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 31 && cCharAt < 127) {
                sb.append(cCharAt);
            } else {
                sb.append(C786410Ut5.j4("\\u%04x", new Object[]{Integer.valueOf(cCharAt)}));
            }
        }
        return sb.toString();
    }

    public static String LJIILIIL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttmd5 check code = ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (i != 99) {
            switch (i) {
                case 0:
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append("md5 match");
                    return C2188811AlT.LIZIZ(sbLIZ2);
                case 1:
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strLIZIZ);
                    sbLIZ3.append("md5 not match");
                    return C2188811AlT.LIZIZ(sbLIZ3);
                case 2:
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(strLIZIZ);
                    sbLIZ4.append("md5 empty");
                    return C2188811AlT.LIZIZ(sbLIZ4);
                case 3:
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(strLIZIZ);
                    sbLIZ5.append("ttmd5 version not support");
                    return C2188811AlT.LIZIZ(sbLIZ5);
                case 4:
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(strLIZIZ);
                    sbLIZ6.append("ttmd5 tag parser error");
                    return C2188811AlT.LIZIZ(sbLIZ6);
                case 5:
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append(strLIZIZ);
                    sbLIZ7.append("file not exist");
                    return C2188811AlT.LIZIZ(sbLIZ7);
                case 6:
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append(strLIZIZ);
                    sbLIZ8.append("get file md5 error");
                    return C2188811AlT.LIZIZ(sbLIZ8);
                default:
                    return strLIZIZ;
            }
        }
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append(strLIZIZ);
        sbLIZ9.append("unknown error");
        return C2188811AlT.LIZIZ(sbLIZ9);
    }

    public static String LJIILLIIL(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            return th.toString();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return "throwable getMsg error";
        }
    }

    public static boolean LJIIZILJ(List<HttpHeader> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (HttpHeader httpHeader : list) {
            if (httpHeader != null && !TextUtils.isEmpty(httpHeader.name) && !TextUtils.isEmpty(httpHeader.value) && "download-tc21-1-15".equals(httpHeader.name) && "download-tc21-1-15".equals(httpHeader.value)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIJJ(Throwable th) {
        if (th == null) {
            return false;
        }
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            int errorCode = baseException.getErrorCode();
            if (errorCode == 1006) {
                return true;
            }
            if (errorCode != 1023 && errorCode != 1039 && errorCode != 1040 && errorCode != 1054 && errorCode != 1064) {
                return false;
            }
            String message = baseException.getMessage();
            if (TextUtils.isEmpty(message) || !message.contains("ENOSPC")) {
                return false;
            }
            return true;
        }
        if (!(th instanceof IOException)) {
            return false;
        }
        String strLJIILLIIL = LJIILLIIL(th);
        if (TextUtils.isEmpty(strLJIILLIIL) || !strLJIILLIIL.contains("ENOSPC")) {
            return false;
        }
        return true;
    }

    public static boolean LJIL(Context context) {
        try {
            ConnectivityManager connectivityManager = LIZJ;
            if (connectivityManager == null) {
                connectivityManager = (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
                LIZJ = connectivityManager;
            }
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager);
            if (networkInfoLJIJ == null) {
                return false;
            }
            return networkInfoLJIJ.isConnected();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean LJJ(Throwable th) {
        if (th == null || !(th instanceof BaseException)) {
            return false;
        }
        int errorCode = ((BaseException) th).getErrorCode();
        if (errorCode >= 2000) {
            if (errorCode < 3000) {
                return true;
            }
        } else if (errorCode == 1075 || errorCode == 1078 || errorCode == 1079 || errorCode == 1055 || errorCode == 1023 || errorCode == 1041 || errorCode == 1022 || errorCode == 1048 || errorCode == 1056 || errorCode == 1057 || errorCode == 1058 || errorCode == 1059 || errorCode == 1060 || errorCode == 1061 || errorCode == 1067 || errorCode == 1049 || errorCode == 1047 || errorCode == 1051 || errorCode == 1004 || errorCode == 1011 || errorCode == 1002 || errorCode == 1013) {
            return true;
        }
        return false;
    }

    public static boolean LJJI(Context context) {
        try {
            ConnectivityManager connectivityManager = LIZJ;
            if (connectivityManager == null) {
                connectivityManager = (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
                LIZJ = connectivityManager;
            }
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager);
            if (networkInfoLJIJ == null || !networkInfoLJIJ.isAvailable()) {
                return false;
            }
            if (1 != C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisoe/W6lMBTCNPX26POXk+I/9SgHI=", null))) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static String LJJIFFI(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes("UTF-8"));
                    return LJJIIJZLJL(messageDigest.digest());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static void LJJIII(Cursor... cursorArr) {
        for (Cursor cursor : cursorArr) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    public static void LJJIIJ(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    public static String LJJIIJZLJL(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= bArr.length) {
                int i = length * 2;
                char[] cArr = new char[i];
                int i2 = 0;
                for (byte b : bArr) {
                    int i3 = b & 255;
                    int i4 = i2 + 1;
                    char[] cArr2 = LIZIZ;
                    cArr[i2] = cArr2[i3 >> 4];
                    i2 = i4 + 1;
                    cArr[i4] = cArr2[i3 & 15];
                }
                return new String(cArr, 0, i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }

    public static boolean LIZ(DownloadInfo downloadInfo, boolean z) {
        boolean zIsDeleteCacheIfCheckFailed = downloadInfo.isDeleteCacheIfCheckFailed();
        String str = LIZ;
        boolean z2 = false;
        if (!zIsDeleteCacheIfCheckFailed && TextUtils.isEmpty(downloadInfo.getLastModified())) {
            if (C1490830otl.LIZ()) {
                C1490830otl.LIZLLL(downloadInfo.getId(), str, "cacheExpiredWithHttp", "Modify is empty, so just return cache");
            }
        } else {
            if (C1490830otl.LIZ()) {
                int id = downloadInfo.getId();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Curt=");
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append(" expired=");
                sbLIZ.append(downloadInfo.getCacheExpiredTime());
                C1490830otl.LIZLLL(id, str, "cacheExpiredWithHttp", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (System.currentTimeMillis() > downloadInfo.getCacheExpiredTime() || z) {
                z2 = true;
            }
        }
        if (C1490830otl.LIZ()) {
            int id2 = downloadInfo.getId();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Name=");
            sbLIZ2.append(downloadInfo.getName());
            sbLIZ2.append(" expired=");
            sbLIZ2.append(z2);
            C1490830otl.LIZLLL(id2, str, "cacheExpiredWithHttp", C2188811AlT.LIZIZ(sbLIZ2));
        }
        return z2;
    }

    public static int LIZIZ(C2199881B7y c2199881B7y, String str) {
        if (c2199881B7y.LIZ.LIZIZ() == 1) {
            return C20130113pb.LIZIZ(str, c2199881B7y.getFile(), null);
        }
        try {
            return C20130113pb.LIZIZ(str, c2199881B7y.getFile(), new C20130513pf(c2199881B7y.LJ()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 5;
        }
    }

    public static void LJ(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo == null) {
            return;
        }
        if (downloadInfo.isForce() && !C1294200jmc.LIZIZ(downloadInfo.getSavePath())) {
            z = false;
        } else if (z) {
            try {
                LJI(downloadInfo.getSavePath(), downloadInfo.getName());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        LJI(downloadInfo.getTempPath(), downloadInfo.getTempName());
        if (downloadInfo.isSavePathRedirected()) {
            LIZJ(downloadInfo);
        }
        if (z) {
            String strLJJIFFI = LJJIFFI(downloadInfo.getUrl());
            if (!TextUtils.isEmpty(strLJJIFFI) && !TextUtils.isEmpty(downloadInfo.getSavePath()) && downloadInfo.getSavePath().contains(strLJJIFFI)) {
                LJFF(downloadInfo.getSavePath());
            }
        }
    }

    public static void LJI(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C2199881B7y c2199881B7y = new C2199881B7y(str, str2, false, true);
            if (c2199881B7y.LJII()) {
                if (C1490830otl.LIZ()) {
                    String str3 = LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Path: ");
                    sbLIZ.append(c2199881B7y.LJIIIIZZ());
                    C1490830otl.LIZIZ(str3, "deleteFile", C2188811AlT.LIZIZ(sbLIZ));
                }
                c2199881B7y.LIZ();
            }
        }
    }

    public static String LJII(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            String strLJJIFFI = LJJIFFI(str2);
            if (!TextUtils.isEmpty(strLJJIFFI) && !str.contains(strLJJIFFI)) {
                return new C0VSJ(str, strLJJIFFI).getAbsolutePath();
            }
            return str;
        }
        return str;
    }

    public static String LJIIL(String str, Throwable th) {
        if (str == null) {
            return LJIILLIIL(th);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("-");
        sbLIZ.append(LJIILLIIL(th));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIILJJIL(InterfaceC2199921B8c interfaceC2199921B8c, String str) {
        if (interfaceC2199921B8c != null && !TextUtils.isEmpty(str)) {
            String strLIZIZ = interfaceC2199921B8c.LIZIZ(str);
            if (!C2199751B7l.LJFF.LJI("fix_get_http_resp_head_ignore_case", true)) {
                return strLIZIZ;
            }
            if (TextUtils.isEmpty(strLIZIZ)) {
                strLIZIZ = interfaceC2199921B8c.LIZIZ(str.toLowerCase());
            }
            if (TextUtils.isEmpty(strLIZIZ)) {
                return interfaceC2199921B8c.LIZIZ(str.toUpperCase());
            }
            return strLIZIZ;
        }
        return null;
    }

    public static String LJIILL(String str, String str2) {
        boolean z;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        boolean z2 = false;
        if (C20149513sj.LIZLLL(str) > 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                C20149513sj.LIZ(UriProtector.parse(str), C20149513sj.LIZLLL(str));
                z2 = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (!z2) {
                return null;
            }
        }
        return new C2199881B7y(str, str2, true, true).getPath();
    }

    public static boolean LJIJI(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (C20149513sj.LIZLLL(str) > 1) {
            try {
                C20149513sj.LIZ(UriProtector.parse(str), C20149513sj.LIZLLL(str));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }
        return new C2199881B7y(str, str2, true, true).LJII();
    }

    public static String LJJII(InputStream inputStream, int i) {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        if (inputStream != null && i > 0) {
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            } catch (Throwable th) {
                th = th;
            }
            do {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                    } else {
                        LJJIIJ(bufferedReader);
                        LJJIIJ(inputStream);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        LJJIIJ(bufferedReader2);
                        LJJIIJ(inputStream);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        LJJIIJ(bufferedReader2);
                        LJJIIJ(inputStream);
                        throw th3;
                    }
                }
                return sb.toString();
            } while (sb.length() <= i);
            String strSubstring = sb.substring(0, i);
            LJJIIJ(bufferedReader);
            LJJIIJ(inputStream);
            return strSubstring;
        }
        LJJIIJ(inputStream);
        return sb.toString();
    }

    public static boolean LJIJ(DownloadInfo downloadInfo, boolean z, String str) {
        if (!z && !TextUtils.isEmpty(downloadInfo.getSavePath()) && !TextUtils.isEmpty(downloadInfo.getName())) {
            try {
                C2199881B7y c2199881B7y = new C2199881B7y(downloadInfo.getSavePath(), downloadInfo.getName(), true, true);
                if (!c2199881B7y.LJII() || c2199881B7y.length() <= 0 || (downloadInfo.getTotalBytes() > 0 && c2199881B7y.length() < downloadInfo.getTotalBytes())) {
                    return false;
                }
                int iLIZIZ = LIZIZ(c2199881B7y, str);
                if (iLIZIZ == 0 || iLIZIZ == 2) {
                    return true;
                }
            } catch (OutOfMemoryError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
        }
        return false;
    }
}
