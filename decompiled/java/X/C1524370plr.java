package X;

import android.content.Context;
import com.bytedance.amg.minigameruntime.common.network.http.download.DownloadResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0plr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524370plr {
    public final int LIZ;
    public final Context LIZIZ;
    public final C1524440ply LIZJ;
    public final InterfaceC1524450plz LIZLLL;
    public final AtomicInteger LJ = new AtomicInteger(1);
    public C1502060pBs LJFF;
    public long LJI;

    public final void LIZ() {
        C1502060pBs c1502060pBs;
        C0X9S<?> c0x9s;
        if ((!this.LJ.compareAndSet(1, 4) && !this.LJ.compareAndSet(2, 4)) || (c1502060pBs = this.LJFF) == null || (c0x9s = c1502060pBs.LIZIZ.LIZJ) == null) {
            return;
        }
        c0x9s.cancel();
    }

    public final void LIZJ() {
        File parentFile;
        InterfaceC1524450plz interfaceC1524450plz = this.LIZLLL;
        if (interfaceC1524450plz != null) {
            interfaceC1524450plz.onStart();
        }
        if (!this.LJ.compareAndSet(1, 2)) {
            LIZLLL(-201, "task is finished");
            return;
        }
        C1524440ply c1524440ply = this.LIZJ;
        File file = c1524440ply.LIZIZ;
        if (file == null) {
            LIZLLL(-100, "target file is null");
            return;
        }
        C1524400plu c1524400plu = new C1524400plu(c1524440ply.LIZ, "GET");
        long j = c1524440ply.LIZLLL;
        c1524400plu.LJI = j;
        c1524400plu.LJFF = j;
        c1524400plu.LJ = j;
        c1524400plu.LIZJ = c1524440ply.LIZJ;
        c1524400plu.LIZIZ = "GET";
        BufferedOutputStream bufferedOutputStream = null;
        c1524400plu.LIZLLL = null;
        c1524400plu.LJII = true;
        C1502060pBs c1502060pBs = new C1502060pBs(c1524400plu.LIZ());
        this.LJFF = c1502060pBs;
        C1502600pCk c1502600pCkLIZ = c1502060pBs.LIZ();
        if (c1502600pCkLIZ.LJ != null) {
            LIZLLL(c1502600pCkLIZ.LIZ, c1502600pCkLIZ.LIZIZ);
            return;
        }
        C1293960jmE c1293960jmE = c1502600pCkLIZ.LIZLLL;
        if (c1293960jmE == null) {
            LIZLLL(-105, "response has no body");
            return;
        }
        this.LIZJ.getClass();
        try {
            C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(this.LIZIZ), "bdp/download/" + System.currentTimeMillis() + "_" + this.LIZ + ".tmp");
            File parentFile2 = c0vsj.getParentFile();
            if (parentFile2 != null && !parentFile2.exists() && (parentFile = c0vsj.getParentFile()) != null) {
                parentFile.mkdirs();
            }
            long j2 = c1293960jmE.LLILLJJLI;
            byte[] bArr = new byte[8192];
            long j3 = 0;
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new C0VSV(c0vsj), 32768);
                try {
                    InterfaceC1524450plz interfaceC1524450plz2 = this.LIZLLL;
                    if (interfaceC1524450plz2 != null) {
                        try {
                            LJ(interfaceC1524450plz2, this.LIZ, 0L, j2);
                        } catch (Throwable th) {
                            th = th;
                            bufferedOutputStream = bufferedOutputStream2;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C816280W0k.LIZIZ(c0vsj);
                                this.LIZJ.getClass();
                                LIZLLL(-202, "response body exceed max size 0");
                                C816280W0k.LIZ(bufferedOutputStream);
                                C816280W0k.LIZ(c1293960jmE);
                                return;
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C816280W0k.LIZ(bufferedOutputStream);
                                C816280W0k.LIZ(c1293960jmE);
                                throw th2;
                            }
                        }
                    }
                    while (true) {
                        int i = c1293960jmE.read(bArr);
                        if (i <= 0) {
                            break;
                        }
                        bufferedOutputStream2.write(bArr, 0, i);
                        j3 += (long) i;
                        InterfaceC1524450plz interfaceC1524450plz3 = this.LIZLLL;
                        if (interfaceC1524450plz3 != null) {
                            LJ(interfaceC1524450plz3, this.LIZ, j3, j2);
                        }
                    }
                    bufferedOutputStream2.flush();
                    C816280W0k.LIZ(bufferedOutputStream2);
                    C816280W0k.LIZ(c1293960jmE);
                    try {
                        C816280W0k.LIZJ(file.getParentFile());
                        if (file.exists()) {
                            file.delete();
                        }
                        if (!c0vsj.exists()) {
                            LIZLLL(-98, "temp file not exist");
                        } else if (c0vsj.renameTo(file)) {
                            LJFF(file, c1502600pCkLIZ);
                        } else {
                            try {
                                LIZIZ(c0vsj, file);
                                LJFF(file, c1502600pCkLIZ);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                LIZLLL(-99, "move target file failed");
                            }
                        }
                        C816280W0k.LIZIZ(c0vsj);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        C816280W0k.LIZIZ(c0vsj);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            LIZLLL(-96, "create temp file failed");
        }
    }

    public static void LIZIZ(C0VSJ c0vsj, File file) throws Throwable {
        Closeable closeable;
        C816280W0k.LIZJ(file.getParentFile());
        Closeable closeable2 = null;
        byte[] andSet = C816280W0k.LIZ.getAndSet(null);
        if (andSet == null || andSet.length < 8192) {
            andSet = new byte[8192];
        }
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            C0VSP c0vsp = new C0VSP(c0vsj);
            try {
                C0VSV c0vsv = new C0VSV(file);
                while (true) {
                    try {
                        int i = c0vsp.read(andSet);
                        if (i <= 0) {
                            break;
                        } else {
                            c0vsv.write(andSet, 0, i);
                        }
                    } catch (Throwable th) {
                        th = th;
                        closeable2 = c0vsv;
                        closeable = closeable2;
                        closeable2 = c0vsp;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        if (andSet.length <= 8192) {
                            C816280W0k.LIZ.set(andSet);
                        }
                        C816280W0k.LIZ(closeable2);
                        C816280W0k.LIZ(closeable);
                        throw th;
                    }
                }
                c0vsj.delete();
                if (andSet.length <= 8192) {
                    C816280W0k.LIZ.set(andSet);
                }
                C816280W0k.LIZ(c0vsp);
                C816280W0k.LIZ(c0vsv);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
        }
    }

    public final DownloadResponse LIZLLL(int i, String str) {
        InterfaceC1524450plz interfaceC1524450plz;
        DownloadResponse downloadResponse = new DownloadResponse(i, str, null, C1502140pC0.LIZIZ, "", 0L, null);
        if (this.LJ.compareAndSet(2, 3)) {
            InterfaceC1524450plz interfaceC1524450plz2 = this.LIZLLL;
            if (interfaceC1524450plz2 != null) {
                interfaceC1524450plz2.LIZIZ(this.LIZ, this.LIZJ, downloadResponse);
            }
        } else if (this.LJ.get() == 4 && (interfaceC1524450plz = this.LIZLLL) != null) {
            interfaceC1524450plz.onCancel(this.LIZ);
            return downloadResponse;
        }
        return downloadResponse;
    }

    public final DownloadResponse LJFF(File file, C1502600pCk c1502600pCk) {
        String str;
        InterfaceC1524450plz interfaceC1524450plz;
        int i = c1502600pCk.LIZ;
        String str2 = c1502600pCk.LIZIZ;
        C1502140pC0 c1502140pC0 = c1502600pCk.LIZJ;
        C1293960jmE c1293960jmE = c1502600pCk.LIZLLL;
        if (c1293960jmE == null || (str = c1293960jmE.LL) == null) {
            str = "";
        }
        DownloadResponse downloadResponse = new DownloadResponse(i, str2, file, c1502140pC0, str, c1502600pCk.LIZ(), c1502600pCk.LJ);
        if (this.LJ.compareAndSet(2, 3)) {
            InterfaceC1524450plz interfaceC1524450plz2 = this.LIZLLL;
            if (interfaceC1524450plz2 != null) {
                interfaceC1524450plz2.LIZIZ(this.LIZ, this.LIZJ, downloadResponse);
            }
        } else if (this.LJ.get() == 4 && (interfaceC1524450plz = this.LIZLLL) != null) {
            interfaceC1524450plz.onCancel(this.LIZ);
            return downloadResponse;
        }
        return downloadResponse;
    }

    public C1524370plr(int i, Context context, C1524440ply c1524440ply, C1524480pm2 c1524480pm2) {
        this.LIZ = i;
        this.LIZIZ = context;
        this.LIZJ = c1524440ply;
        this.LIZLLL = c1524480pm2;
    }

    public final void LJ(InterfaceC1524450plz interfaceC1524450plz, int i, long j, long j2) {
        if (j == j2) {
            interfaceC1524450plz.LIZ(i, j, j2);
            return;
        }
        if (this.LJ.get() != 2) {
            return;
        }
        long j3 = this.LIZJ.LJ;
        if (j3 <= 0) {
            j3 = 100;
        }
        if (System.currentTimeMillis() - this.LJI < j3) {
            return;
        }
        this.LJI = System.currentTimeMillis();
        if (this.LJ.get() == 2) {
            interfaceC1524450plz.LIZ(i, j, j2);
        }
    }
}
