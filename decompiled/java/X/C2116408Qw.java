package X;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.08Qw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2116408Qw {
    public static volatile C0VSJ LIZ;
    public static final Set<String> LIZIZ = Collections.synchronizedSet(new HashSet());
    public static ApplicationInfo LIZJ;

    public static File LIZIZ() {
        C0VSJ c0vsj = LIZ;
        if (c0vsj != null) {
            return c0vsj;
        }
        try {
            C0VSJ c0vsj2 = new C0VSJ(new C0VSJ(LIZJ.dataDir, "files"), "ColdBootFilePrefs");
            LIZ = c0vsj2;
            return c0vsj2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String str = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName().split(":")[0] : "com.zhiliaoapp.musically";
            if (C2105908Mv.LIZ(str)) {
                throw new RuntimeException(th);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/data/data/");
            sbLIZ.append(str);
            sbLIZ.append("/files");
            return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ), "ColdBootFilePrefs");
        }
    }

    public static void LIZJ(String str, int i) {
        try {
            LIZIZ.add(str);
            File fileLIZIZ = LIZIZ();
            fileLIZIZ.mkdirs();
            DataOutputStream dataOutputStream = new DataOutputStream(new C0VSV(new C0VSJ(fileLIZIZ, str)));
            try {
                dataOutputStream.writeInt(i);
                dataOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static int LIZ(int i, String str, boolean z) {
        try {
            C0VSJ c0vsj = new C0VSJ(LIZIZ(), str);
            if (c0vsj.isFile()) {
                DataInputStream dataInputStream = new DataInputStream(new C0VSP(c0vsj));
                try {
                    int i2 = dataInputStream.readInt();
                    dataInputStream.close();
                    if (z) {
                        c0vsj.delete();
                    }
                    return i2;
                } finally {
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return i;
    }
}
