package X;

import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: X.0Vo6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC808800Vo6 {
    public static AbstractC808800Vo6 LIZ = new AbstractC808800Vo6() { // from class: X.09Xz
        @Override // X.AbstractC808800Vo6
        public final String LIZIZ(String str, Map map) throws IOException {
            throw new IOException("not implemented");
        }

        @Override // X.AbstractC808800Vo6
        public final String LIZLLL(String str, List list, Map map) throws C829590WgX {
            throw new C829590WgX(0, "not implemented");
        }

        @Override // X.AbstractC808800Vo6
        public final String LJ(String str, byte[] bArr, Map map) throws C829590WgX {
            throw new C829590WgX(0, "not implemented");
        }
    };

    public abstract String LIZIZ(String str, Map map);

    public abstract String LIZLLL(String str, List list, Map map);

    public abstract String LJ(String str, byte[] bArr, Map map);

    public byte[] LJFF(String str, byte[] bArr, Map map) {
        return null;
    }

    public static byte[] LIZ(byte[] bArr) throws Throwable {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                TryCatchGuardChecker.doCheck(th);
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String LIZJ(String str, List<Pair<String, String>> list) {
        new C808790Vo5();
        return LIZLLL(str, list, null);
    }
}
