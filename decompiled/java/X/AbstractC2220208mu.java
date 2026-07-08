package X;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08mu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2220208mu extends C2167508eP {
    public final Context LIZLLL;
    public String LJ;
    public C2123708Tr LJFF;
    public final Map<String, Object> LJI;

    public abstract AbstractC2220508mx LJIIJJI();

    public byte[] LJII() {
        Parcel parcelObtain = Parcel.obtain();
        AbstractC2220508mx abstractC2220508mxLJIIJJI = LJIIJJI();
        try {
            C2221108n3[] c2221108n3Arr = abstractC2220508mxLJIIJJI.LIZ().LIZ;
            parcelObtain.writeByte((byte) 1);
            parcelObtain.writeInt(c2221108n3Arr.length);
            for (int i = 0; i < c2221108n3Arr.length; i++) {
                parcelObtain.writeString(c2221108n3Arr[i].LL);
                parcelObtain.writeString(c2221108n3Arr[i].LLILLJJLI);
            }
            abstractC2220508mxLJIIJJI.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (abstractC2220508mxLJIIJJI != null) {
                try {
                    abstractC2220508mxLJIIJJI.close();
                    throw th;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    @Override // X.AbstractC2167908eT
    public final void LIZIZ(int i) throws Throwable {
        File file = this.LIZ;
        if (!file.mkdirs() && !file.isDirectory()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cannot mkdir: ");
            sbLIZ.append(file);
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        }
        C2123708Tr c2123708TrLJIIIZ = LJIIIZ(new C0VSJ(this.LIZ, "dso_lock"), true);
        if (this.LJFF == null) {
            this.LJFF = LJIIIZ(new C0VSJ(this.LIZ, "dso_instance_lock"), false);
        }
        boolean zCanWrite = this.LIZ.canWrite();
        if (!zCanWrite) {
            try {
                this.LIZ.setWritable(true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!zCanWrite) {
                    this.LIZ.setWritable(false);
                }
                if (c2123708TrLJIIIZ != null) {
                    c2123708TrLJIIIZ.close();
                }
                throw th;
            }
        }
        if (LJIIL(c2123708TrLJIIIZ, i, LJII())) {
            c2123708TrLJIIIZ = null;
        }
        if (!zCanWrite) {
            this.LIZ.setWritable(false);
        }
        if (c2123708TrLJIIIZ != null) {
            c2123708TrLJIIIZ.close();
        }
    }

    public final void LJ(C2221108n3[] c2221108n3Arr) throws IOException {
        String[] list = this.LIZ.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_instance_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    int i = 0;
                    while (true) {
                        if (i < c2221108n3Arr.length) {
                            if (!c2221108n3Arr[i].LL.equals(str)) {
                                i++;
                                if (0 == 0) {
                                }
                            }
                        } else {
                            SysUtil.LIZ(new C0VSJ(this.LIZ, str));
                            break;
                        }
                    }
                }
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unable to list directory ");
        sbLIZ.append(this.LIZ);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Object LJIIIIZZ(String str) {
        Object obj;
        synchronized (this.LJI) {
            try {
                obj = ((HashMap) this.LJI).get(str);
                if (obj == null) {
                    obj = new Object();
                    ((HashMap) this.LJI).put(str, obj);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return obj;
    }

    public AbstractC2220208mu(Context context, String str) {
        super(LJIIJ(context, str), 1);
        this.LJI = new HashMap();
        this.LIZLLL = context;
    }

    public static C0VSJ LJIIJ(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(context.getApplicationInfo().dataDir);
        sbLIZ.append("/");
        sbLIZ.append(str);
        return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIILJJIL(File file, byte b) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJFF(InterfaceC2221208n4 interfaceC2221208n4, byte[] bArr) {
        try {
            if (this.LIZ.setWritable(true)) {
                LJI(interfaceC2221208n4, bArr);
                this.LIZ.setWritable(false);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cannot make directory writable for us: ");
                sbLIZ.append(this.LIZ);
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.setWritable(false);
            throw th;
        }
    }

    public final void LJI(InterfaceC2221208n4 interfaceC2221208n4, byte[] bArr) throws IOException {
        RandomAccessFile randomAccessFile;
        int i;
        C0VSJ c0vsj = new C0VSJ(this.LIZ, ((C2220408mw) interfaceC2221208n4).LL.LL);
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (c0vsj.exists()) {
                    c0vsj.setWritable(true);
                }
                try {
                    randomAccessFile = new RandomAccessFile(c0vsj, "rw");
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    SysUtil.LIZ(c0vsj);
                    randomAccessFile = new RandomAccessFile(c0vsj, "rw");
                }
                randomAccessFile2 = randomAccessFile;
                int iAvailable = ((C2220408mw) interfaceC2221208n4).LLILLJJLI.available();
                if (iAvailable > 1) {
                    SysUtil.LollipopSysdeps.fallocateIfSupported(randomAccessFile.getFD(), iAvailable);
                }
                InputStream inputStream = ((C2220408mw) interfaceC2221208n4).LLILLJJLI;
                int i2 = 0;
                while (i2 < Integer.MAX_VALUE && (i = inputStream.read(bArr, 0, Math.min(bArr.length, Integer.MAX_VALUE - i2))) != -1) {
                    randomAccessFile2.write(bArr, 0, i);
                    i2 += i;
                }
                randomAccessFile2.setLength(randomAccessFile2.getFilePointer());
                if (c0vsj.setExecutable(true, false)) {
                    c0vsj.setWritable(false);
                    randomAccessFile2.close();
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cannot make file executable: ");
                    sbLIZ.append(c0vsj);
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                SysUtil.LIZ(c0vsj);
                throw e2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0vsj.setWritable(false);
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2123708Tr LJIIIZ(X.C0VSJ r7, boolean r8) throws java.lang.Throwable {
        /*
            r6 = this;
            java.io.File r5 = r6.LIZ
            r4 = 0
            r3 = 1
            r2 = 0
            if (r8 == 0) goto Ld
            X.08Tr r0 = new X.08Tr     // Catch: java.io.FileNotFoundException -> L1b java.lang.Throwable -> L41
            r0.<init>(r7, r2)     // Catch: java.io.FileNotFoundException -> L1b java.lang.Throwable -> L41
            return r0
        Ld:
            X.08Tr r1 = new X.08Tr     // Catch: java.io.FileNotFoundException -> L1b java.lang.Throwable -> L41
            r1.<init>(r7, r3)     // Catch: java.io.FileNotFoundException -> L1b java.lang.Throwable -> L41
            java.nio.channels.FileLock r0 = r1.LLILLJJLI     // Catch: java.io.FileNotFoundException -> L1b java.lang.Throwable -> L41
            if (r0 != 0) goto L1a
            r1.close()     // Catch: java.io.FileNotFoundException -> L1b java.lang.Throwable -> L41
            return r4
        L1a:
            return r1
        L1b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L41
            boolean r0 = r5.setWritable(r3)     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L40
            if (r8 == 0) goto L2d
            X.08Tr r0 = new X.08Tr     // Catch: java.lang.Throwable -> L47
            r0.<init>(r7, r2)     // Catch: java.lang.Throwable -> L47
            goto L3c
        L2d:
            X.08Tr r1 = new X.08Tr     // Catch: java.lang.Throwable -> L47
            r1.<init>(r7, r3)     // Catch: java.lang.Throwable -> L47
            java.nio.channels.FileLock r0 = r1.LLILLJJLI     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L3a
            r1.close()     // Catch: java.lang.Throwable -> L47
            goto L3b
        L3a:
            r4 = r1
        L3b:
            r0 = r4
        L3c:
            r5.setWritable(r2)
            return r0
        L40:
            throw r1     // Catch: java.lang.Throwable -> L47
        L41:
            r0 = move-exception
            r3 = 0
        L43:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L47
            goto L49
        L47:
            r0 = move-exception
            goto L43
        L49:
            if (r3 == 0) goto L4e
            r5.setWritable(r2)
        L4e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2220208mu.LJIIIZ(X.0VSJ, boolean):X.08Tr");
    }

    @Override // X.C2167508eP, X.AbstractC2167908eT
    public final int LIZ(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        int iLIZLLL;
        synchronized (LJIIIIZZ(str)) {
            try {
                iLIZLLL = LIZLLL(str, i, threadPolicy);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIL(final X.C2123708Tr r15, int r16, final byte[] r17) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2220208mu.LJIIL(X.08Tr, int, byte[]):boolean");
    }

    public final void LJIILIIL(byte b, C2220308mv c2220308mv, AbstractC2221008n2 abstractC2221008n2) throws IOException {
        C2220308mv c2220308mvLIZ;
        RandomAccessFile randomAccessFile = new RandomAccessFile(new C0VSJ(this.LIZ, "dso_manifest"), "rw");
        try {
            if (b == 1) {
                try {
                    c2220308mvLIZ = C2220308mv.LIZ(randomAccessFile);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c2220308mvLIZ = null;
                }
            } else {
                c2220308mvLIZ = null;
            }
            if (c2220308mvLIZ == null) {
                c2220308mvLIZ = new C2220308mv(new C2221108n3[0]);
            }
            LJ(c2220308mv.LIZ);
            byte[] bArr = new byte[32768];
            while (abstractC2221008n2.LIZ()) {
                C2220408mw c2220408mwLIZIZ = abstractC2221008n2.LIZIZ();
                boolean z = true;
                int i = 0;
                while (true) {
                    try {
                        C2221108n3[] c2221108n3Arr = c2220308mvLIZ.LIZ;
                        if (i >= c2221108n3Arr.length) {
                            break;
                        }
                        if (!c2221108n3Arr[i].LL.equals(c2220408mwLIZIZ.LL.LL) || !c2220308mvLIZ.LIZ[i].LLILLJJLI.equals(c2220408mwLIZIZ.LL.LLILLJJLI)) {
                            i++;
                            if (1 == 0) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    } finally {
                    }
                }
                if (!new C0VSJ(this.LIZ, c2220408mwLIZIZ.LL.LL).exists() || z) {
                    LJFF(c2220408mwLIZIZ, bArr);
                }
                c2220408mwLIZIZ.close();
            }
            randomAccessFile.close();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                randomAccessFile.close();
                throw th;
            } finally {
                TryCatchGuardChecker.doCheck(th);
                th.addSuppressed(th);
            }
        }
    }
}
