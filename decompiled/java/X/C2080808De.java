package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.08De, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2080808De {
    public static boolean LIZIZ() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (contextLIZ == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C08O2.LIZ().getAbsolutePath());
        sbLIZ.append(File.separator);
        sbLIZ.append("VEhookLibNames.ini");
        if (!new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).exists()) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return true;
            }
            return contextLIZ.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            PrintStream printStream = System.err;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isOk ");
            sbLIZ2.append(th);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
    }

    public static String[] LIZJ() throws Throwable {
        String[] strArr = {"libttvebase.so", "libttvideoeditor.so", "libttvideorecorder.so", "libeffect.so", "libAGFX.so", "libaudioeffect.so", "libbytenn.so", "libx264.so", "libttffmpeg.so", "libttvesdk.so"};
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C08O2.LIZ().getAbsolutePath());
        sbLIZ.append(File.separator);
        sbLIZ.append("VEhookLibNames.ini");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new C0VSP(c0vsj)));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                            try {
                                bufferedReader2.close();
                                return strArr2;
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                                return strArr2;
                            }
                        }
                        arrayList.add(line);
                    } catch (Exception e2) {
                        e = e2;
                        bufferedReader = bufferedReader2;
                        TryCatchGuardChecker.doCheck(e);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                                return strArr;
                            } catch (IOException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                return strArr;
                            }
                        }
                        return strArr;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        TryCatchGuardChecker.doCheck(th);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                                throw th;
                            } catch (IOException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                throw th;
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C08O2.LIZ().getAbsolutePath());
        sbLIZ.append(File.separator);
        sbLIZ.append("VEhookTempFiles");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        if (!c0vsj.exists() || !c0vsj.isDirectory()) {
            c0vsj.mkdir();
        }
        return strLIZIZ;
    }
}
