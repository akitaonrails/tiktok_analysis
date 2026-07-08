package X;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;

/* JADX INFO: renamed from: X.09U7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09U7 {
    public static boolean LIZ(Context context, String str, String str2, String str3, C1383480m6c c1383480m6c) throws Throwable {
        boolean zDownloadFile;
        C0VSJ c0vsj;
        List<C09MP> listExtractImageUrlList = C09MO.extractImageUrlList(str, null);
        if (listExtractImageUrlList != null && !listExtractImageUrlList.isEmpty()) {
            int i = 0;
            for (C09MP c09mp : listExtractImageUrlList) {
                if (c09mp != null) {
                    String str4 = c09mp.LIZ;
                    if (!C2093608Ic.LJ(str4)) {
                        i++;
                        if (i > 3) {
                            break;
                        }
                        Logger.debug();
                        String[] strArr = new String[1];
                        int[] iArr = new int[1];
                        if (context != null) {
                            try {
                                try {
                                    if (!C036E.LIZ.LIZIZ()) {
                                        return false;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return false;
                            }
                        }
                        try {
                            zDownloadFile = NetworkUtils.downloadFile(20971520, str4, str2, null, str3, c1383480m6c, str3, null, c09mp.LIZIZ, strArr, iArr);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (zDownloadFile) {
                            try {
                                try {
                                    try {
                                        c0vsj = new C0VSJ(str2, str3);
                                    } catch (Exception e2) {
                                        e = e2;
                                        TryCatchGuardChecker.doCheck(e);
                                        return zDownloadFile;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                if (c0vsj.isFile()) {
                                    long length = c0vsj.length();
                                    if (length > 0) {
                                        C2217891BrH.LLJIJIL.addAndGet(length);
                                        if (iArr[0] <= 0 && length < 2147483647L) {
                                            iArr[0] = (int) length;
                                            return zDownloadFile;
                                        }
                                        th = th3;
                                        TryCatchGuardChecker.doCheck(th);
                                        if (!(th instanceof SocketException) && !(th instanceof IOException) && !(th instanceof SocketTimeoutException) && !(th instanceof C0XI3)) {
                                            throw th;
                                        }
                                        if (context == null) {
                                            break;
                                        }
                                        try {
                                            if (!C036E.LIZ.LIZIZ()) {
                                                return false;
                                            }
                                        } catch (Exception e3) {
                                            TryCatchGuardChecker.doCheck(e3);
                                        }
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                            }
                        }
                        return zDownloadFile;
                    }
                    continue;
                }
            }
        }
        return false;
    }
}
