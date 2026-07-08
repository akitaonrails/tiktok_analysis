package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.compression.zstd.ZstdInputStream;
import com.bytedance.geckox.model.GeckoManifest;
import com.bytedance.geckox.model.GeckoMd5Check;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: X.0qSa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550860qSa {
    public static void LIZ(InterfaceC1550870qSb interfaceC1550870qSb, InterfaceC1550870qSb interfaceC1550870qSb2) throws Throwable {
        ZstdInputStream zstdInputStream;
        C1550880qSc c1550880qSc = new C1550880qSc(interfaceC1550870qSb);
        try {
            zstdInputStream = new ZstdInputStream(c1550880qSc);
            try {
                byte[] bArr = new byte[32768];
                while (true) {
                    int i = zstdInputStream.read(bArr);
                    if (i != -1) {
                        interfaceC1550870qSb2.LJJIII(0, bArr, i);
                    } else {
                        C08IQ.LIZ(c1550880qSc);
                        C08IQ.LIZ(zstdInputStream);
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C08IQ.LIZ(c1550880qSc);
                        C08IQ.LIZ(zstdInputStream);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            zstdInputStream = null;
        }
    }

    public static void LIZIZ(int i, String str, String str2) {
        C1553130qWF.LIZ("gecko-debug-tag", str2);
        C1551780qU4.LJII(3, i, str2, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unzip file ");
        sbLIZ.append(str2);
        throw new C1550890qSd(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZJ(C1550880qSc c1550880qSc, String str, String str2, int i) {
        ZipInputStream zipInputStream;
        Pair pairLIZ;
        C0VSV c0vsv;
        long length;
        String strLIZIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, GeckoMd5Check> map = new HashMap<>();
        try {
            String canonicalPath = new C0VSJ(str).getCanonicalPath();
            zipInputStream = new ZipInputStream(c1550880qSc);
            boolean z = false;
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        String name = nextEntry.getName();
                        if (!name.startsWith("__MACOSX/") && !name.endsWith(".DS_Store")) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str2);
                            String str3 = File.separator;
                            sbLIZ.append(str3);
                            if (name.startsWith(C2188811AlT.LIZIZ(sbLIZ))) {
                                if (nextEntry.isDirectory()) {
                                    try {
                                        C0VSJ c0vsj = new C0VSJ(canonicalPath, name);
                                        if (c0vsj.getCanonicalPath().startsWith(canonicalPath)) {
                                            c0vsj.mkdirs();
                                        } else {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("directory traversal, dir:");
                                            sbLIZ2.append(name);
                                            sbLIZ2.append(", channel:");
                                            sbLIZ2.append(str2);
                                            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        while (true) {
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                                C08IQ.LIZ(zipInputStream);
                                                throw th;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        }
                                    }
                                } else {
                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                    String canonicalPath2 = new C0VSJ(canonicalPath, name).getCanonicalPath();
                                    if (canonicalPath2.startsWith(canonicalPath)) {
                                        C0VSJ c0vsj2 = new C0VSJ(canonicalPath2);
                                        c0vsj2.getParentFile().mkdirs();
                                        try {
                                            c0vsv = new C0VSV(c0vsj2);
                                            try {
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append(str2);
                                                sbLIZ3.append(str3);
                                                sbLIZ3.append("gecko_manifest.json");
                                                if (name.equals(C2188811AlT.LIZIZ(sbLIZ3))) {
                                                    try {
                                                        try {
                                                            map = ((GeckoManifest) C1551400qTS.LIZIZ.LIZ.LJII(C0X9F.LJIIIIZZ(zipInputStream, c0vsv), GeckoManifest.class)).files;
                                                            C08IQ.LIZ(c0vsv);
                                                            z = true;
                                                        } catch (s e) {
                                                            TryCatchGuardChecker.doCheck(e);
                                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                            sbLIZ4.append("mmap+ZipInputStream unzip,dir:");
                                                            sbLIZ4.append(canonicalPath);
                                                            sbLIZ4.append(",channel:");
                                                            sbLIZ4.append(str2);
                                                            sbLIZ4.append(",manifest to json exception:");
                                                            sbLIZ4.append(e.getMessage());
                                                            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ4));
                                                            C08IQ.LIZ(c0vsv);
                                                            z = true;
                                                        }
                                                    } catch (Throwable th3) {
                                                        TryCatchGuardChecker.doCheck(th3);
                                                        C08IQ.LIZ(c0vsv);
                                                        z = true;
                                                    }
                                                } else {
                                                    BufferedInputStream bufferedInputStream = new BufferedInputStream(zipInputStream);
                                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c0vsv);
                                                    byte[] bArr = new byte[1024];
                                                    int i2 = 0;
                                                    while (true) {
                                                        try {
                                                            int i3 = bufferedInputStream.read(bArr);
                                                            if (i3 == -1) {
                                                                break;
                                                            }
                                                            i2 += i3;
                                                            bufferedOutputStream.write(bArr, 0, i3);
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            while (true) {
                                                                try {
                                                                    TryCatchGuardChecker.doCheck(th);
                                                                    C08IQ.LIZ(c0vsv);
                                                                    throw th;
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    bufferedOutputStream.flush();
                                                    long j = i2;
                                                    long size = nextEntry.getSize();
                                                    if (c0vsj2.exists()) {
                                                        length = c0vsj2.length();
                                                    } else {
                                                        length = -1;
                                                    }
                                                    if (size != 0 && length <= 0 && j > 0) {
                                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                        sbLIZ5.append("mmap+ZipInputStream unzip size 0,file :");
                                                        sbLIZ5.append(name);
                                                        sbLIZ5.append(",entry size:");
                                                        sbLIZ5.append(size);
                                                        sbLIZ5.append(",local file size:");
                                                        sbLIZ5.append(length);
                                                        sbLIZ5.append(",stream size:");
                                                        sbLIZ5.append(j);
                                                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                                                    } else {
                                                        try {
                                                            C0X9F.LIZIZ(c0vsj2);
                                                            strLIZIZ = null;
                                                        } catch (Throwable th6) {
                                                            TryCatchGuardChecker.doCheck(th6);
                                                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                            sbLIZ6.append("mmap+ZipInputStream unzip tasm broken,file dir:");
                                                            sbLIZ6.append(canonicalPath);
                                                            sbLIZ6.append(",file:");
                                                            sbLIZ6.append(name);
                                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                                                        }
                                                    }
                                                    if (TextUtils.isEmpty(strLIZIZ)) {
                                                        try {
                                                            C08IQ.LIZ(c0vsv);
                                                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                            sbLIZ7.append("unzip file :");
                                                            sbLIZ7.append(name);
                                                            sbLIZ7.append(", cost: ");
                                                            sbLIZ7.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                                                            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ7));
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            while (true) {
                                                                TryCatchGuardChecker.doCheck(th);
                                                                C08IQ.LIZ(zipInputStream);
                                                                throw th;
                                                            }
                                                        }
                                                    } else {
                                                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                                        sbLIZ8.append(strLIZIZ);
                                                        sbLIZ8.append(",retry count:");
                                                        sbLIZ8.append(i);
                                                        LIZIZ(31, str2, C2188811AlT.LIZIZ(sbLIZ8));
                                                        throw null;
                                                    }
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            c0vsv = null;
                                        }
                                    } else {
                                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                        sbLIZ9.append("directory traversal, file name:");
                                        sbLIZ9.append(name);
                                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ9));
                                    }
                                }
                            } else {
                                C1551020qSq.LIZ(new C0VSJ(canonicalPath));
                                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                sbLIZ10.append("the zip package outermost folder is not named by channel:");
                                sbLIZ10.append(str2);
                                sbLIZ10.append(",name:");
                                sbLIZ10.append(name);
                                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ10));
                            }
                        }
                        z = true;
                    } else {
                        if (map != null && !map.isEmpty()) {
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                            sbLIZ11.append(canonicalPath);
                            sbLIZ11.append(File.separator);
                            sbLIZ11.append(str2);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ11);
                            for (Map.Entry<String, GeckoMd5Check> entry : map.entrySet()) {
                                String key = entry.getKey();
                                String str4 = entry.getValue().md5;
                                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(str4)) {
                                    C0VSJ c0vsj3 = new C0VSJ(strLIZIZ2, key);
                                    if (c0vsj3.exists() && (pairLIZ = C0X9F.LIZ(c0vsj3, str4)) != null && !((Boolean) pairLIZ.second).booleanValue()) {
                                        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                        sbLIZ12.append("mmap+ZipInputStream unzip md5 check failed,file dir:+");
                                        sbLIZ12.append(strLIZIZ2);
                                        sbLIZ12.append(",file:");
                                        sbLIZ12.append(key);
                                        sbLIZ12.append(",md5:");
                                        sbLIZ12.append((String) pairLIZ.first);
                                        sbLIZ12.append(",expect md5:");
                                        sbLIZ12.append(str4);
                                        sbLIZ12.append(",retry count:");
                                        sbLIZ12.append(i);
                                        LIZIZ(310, str2, C2188811AlT.LIZIZ(sbLIZ12));
                                        throw null;
                                    }
                                }
                            }
                            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                            sbLIZ13.append("unzip md5 success,channel:");
                            sbLIZ13.append(str2);
                            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ13), "cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis3));
                        }
                        if (z) {
                            C08IQ.LIZ(zipInputStream);
                            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                            sbLIZ14.append("unzip success,channel:");
                            sbLIZ14.append(str2);
                            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ14), "cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            return;
                        }
                        c1550880qSc.reset();
                        StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                        sbLIZ15.append("not zip file  channel:");
                        sbLIZ15.append(str2);
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ15));
                    }
                } catch (Throwable th10) {
                    th = th10;
                }
            }
        } catch (Throwable th11) {
            th = th11;
            zipInputStream = null;
        }
    }
}
