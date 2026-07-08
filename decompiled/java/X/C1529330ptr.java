package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ptr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529330ptr {
    public static C0VSJ LIZ;
    public static final ConcurrentHashMap<String, InterfaceC1530870pwL> LIZIZ = new ConcurrentHashMap<>();

    public static File LIZ() {
        C0VSJ c0vsj = LIZ;
        if (c0vsj != null) {
            return c0vsj;
        }
        C1532680pzG.LIZ.getClass();
        C0VSJ c0vsj2 = new C0VSJ(C1532680pzG.LIZIZ().getCacheDir(), "rl_resource_offline");
        c0vsj2.mkdirs();
        LIZ = c0vsj2;
        return c0vsj2;
    }

    public static InterfaceC1532130pyN LIZJ(File file) {
        C098200Yq c098200Yq;
        Object obj = null;
        if (file == null) {
            return null;
        }
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (file.isFile()) {
            final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            return new InterfaceC1532130pyN() { // from class: X.0pts
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    randomAccessFile.close();
                }

                @Override // X.InterfaceC1532130pyN
                public final void LJ(int i) throws IOException {
                    randomAccessFile.seek(i);
                }

                @Override // X.InterfaceC1532130pyN
                public final int read(byte[] bArr, int i, int i2) {
                    return randomAccessFile.read(bArr, i, i2);
                }
            };
        }
        C189200o6.m2constructorimpl(null);
        c098200Yq = null;
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (InterfaceC1532130pyN) obj;
    }

    public static C1529350ptt LIZIZ(String str, String str2) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && str2.length() > 0) {
            if (!a0.LJJIJIIJIL(str2, '/')) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append('/');
                str2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            Integer numValueOf = Integer.valueOf(a0.LJJJ(str, str2, 0, false, 6));
            if (numValueOf.intValue() != -1) {
                String strSubstring = str.substring(numValueOf.intValue() + str2.length());
                Integer numValueOf2 = Integer.valueOf(a0.LJJIZ(strSubstring, '/', 0, false, 6));
                if (numValueOf2.intValue() != -1) {
                    int iIntValue = numValueOf2.intValue();
                    String strSubstring2 = strSubstring.substring(0, iIntValue);
                    String strSubstring3 = strSubstring.substring(iIntValue + 1);
                    if ((!a0.LJJJIL(strSubstring2)) && (!a0.LJJJIL(strSubstring3))) {
                        return new C1529350ptt("", strSubstring2, strSubstring3);
                    }
                }
            }
        }
        return null;
    }
}
