package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0WAI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WAI {
    public static String LIZ(List<File> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ((ArrayList) list).size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(((File) ListProtector.get(list, i)).getPath());
        }
        return sb.toString();
    }

    public static String LIZIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/proc/self/task/");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL(File file) throws IOException {
        C0VSP c0vsp = new C0VSP(file);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int i = c0vsp.read(bArr);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                    c0vsp.close();
                    return str;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                c0vsp.close();
                throw th;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0WAK LIZJ(int r22, java.util.List<java.lang.String> r23) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WAI.LIZJ(int, java.util.List):X.0WAK");
    }
}
