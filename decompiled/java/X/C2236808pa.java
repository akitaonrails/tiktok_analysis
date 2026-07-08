package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: X.08pa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2236808pa {
    public static void LIZ(Context context, boolean z) {
        boolean zDelete;
        boolean zCreateNewFile;
        if (Build.VERSION.SDK_INT >= 28) {
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(context.getDataDir().getAbsolutePath());
                sbLIZ.append("/app_webview/webview_data.lock");
                C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                if (c0vsj.exists()) {
                    boolean zCreateNewFile2 = false;
                    try {
                        FileLock fileLockTryLock = new RandomAccessFile(c0vsj, "rw").getChannel().tryLock();
                        if (fileLockTryLock != null) {
                            fileLockTryLock.close();
                            return;
                        }
                        boolean zDelete2 = c0vsj.delete();
                        if (zDelete2 && !c0vsj.exists()) {
                            try {
                                zCreateNewFile = c0vsj.createNewFile();
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                                zCreateNewFile = false;
                            }
                        } else {
                            zCreateNewFile = false;
                        }
                        C2241008qG c2241008qG = new C2241008qG();
                        c2241008qG.LIZ.put("errorCode", 4005);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("web_view.lock locked, need delete:");
                        sbLIZ2.append(zDelete2);
                        sbLIZ2.append(" isCreateNew:");
                        sbLIZ2.append(zCreateNewFile);
                        c2241008qG.LIZ.put("errorDesc", C2188811AlT.LIZIZ(sbLIZ2));
                        C794240VDq.LIZJ("web_view_set_directory_error", c2241008qG.LJ());
                        return;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        if (c0vsj.exists()) {
                            zDelete = c0vsj.delete();
                            if (zDelete && !c0vsj.exists()) {
                                try {
                                    zCreateNewFile2 = c0vsj.createNewFile();
                                } catch (IOException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                }
                            }
                        } else {
                            zDelete = false;
                        }
                        C2241008qG c2241008qG2 = new C2241008qG();
                        c2241008qG2.LIZ.put("errorCode", 4004);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("web_view.lock locked, need delete:");
                        sbLIZ3.append(zDelete);
                        sbLIZ3.append(" isCreateNew:");
                        sbLIZ3.append(zCreateNewFile2);
                        sbLIZ3.append(" e:");
                        sbLIZ3.append(e2.getMessage());
                        c2241008qG2.LIZ.put("errorDesc", C2188811AlT.LIZIZ(sbLIZ3));
                        C794240VDq.LIZJ("web_view_set_directory_error", c2241008qG2.LJ());
                        return;
                    }
                }
                return;
            }
            String strLIZ = C2162308dZ.LIZ(context);
            if (strLIZ == null) {
                C2241008qG c2241008qG3 = new C2241008qG();
                c2241008qG3.LIZ.put("errorCode", 4002);
                c2241008qG3.LIZ.put("errorDesc", "processName == null");
                C794240VDq.LIZJ("web_view_set_directory_error", c2241008qG3.LJ());
            }
            if (TextUtils.equals("", strLIZ)) {
                C2241008qG c2241008qG4 = new C2241008qG();
                c2241008qG4.LIZ.put("errorCode", 4003);
                c2241008qG4.LIZ.put("errorDesc", "processName is empty");
                C794240VDq.LIZJ("web_view_set_directory_error", c2241008qG4.LJ());
            }
            try {
                WebView.setDataDirectorySuffix(strLIZ);
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                C2241008qG c2241008qG5 = new C2241008qG();
                c2241008qG5.LIZ.put("errorCode", 4001);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("setDataDirectorySuffix error:");
                sbLIZ4.append(e4.getMessage());
                c2241008qG5.LIZ.put("errorDesc", C2188811AlT.LIZIZ(sbLIZ4));
                c2241008qG5.LIZ.put("processName", strLIZ);
                C794240VDq.LIZJ("web_view_set_directory_error", c2241008qG5.LJ());
            }
        }
    }
}
