package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VC3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VC3 implements InterfaceC794060VCy {
    public volatile C793800VBy LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public volatile long LIZ = 60000;
    public final C0V6Z<C0VCA> LIZIZ = new C0V6Z<>(10);
    public volatile boolean LJFF = false;

    public final synchronized void LIZ() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        C793980VCq.LIZ.LIZ(this);
    }

    public final void LIZJ() {
        ArrayList arrayList = new ArrayList();
        if (this.LIZJ != null) {
            List<File> listLIZLLL = this.LIZJ.LIZLLL();
            if (!C08GN.LIZIZ(listLIZLLL)) {
                arrayList.addAll(listLIZLLL);
            }
        }
        if (C08GN.LIZIZ(arrayList)) {
            return;
        }
        C0VCV.LIZJ = System.currentTimeMillis();
        C0VCV.LIZLLL = 0L;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            File file = (File) ListProtector.get(arrayList, i2);
            if (file.exists()) {
                try {
                    byte[] bArrLIZIZ = C2404609bY.LIZIZ(file);
                    if (bArrLIZIZ != null) {
                        C0VCA c0vcaLIZ = C0VCA.LIZ(ByteBuffer.wrap(bArrLIZIZ));
                        if (c0vcaLIZ != null) {
                            c0vcaLIZ.LIZJ = file;
                            int i3 = c0vcaLIZ.LIZIZ;
                            if (i != 0 && i + i3 >= 1048576) {
                                C793890VCh.LIZ.LJFF(arrayList2);
                                C0VCV.LIZLLL = System.currentTimeMillis();
                                return;
                            } else {
                                i += i3;
                                arrayList2.add(c0vcaLIZ);
                            }
                        } else {
                            C0VCY.LIZ("APM-SDK", "fromMemory bytes is null");
                        }
                    } else {
                        C0VCY.LIZ("APM-SDK", "fromFile bytes is null");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C0VCY.LIZIZ("fromFile", th);
                }
                file.delete();
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reportFile file is not exist:");
                sbLIZ.append(file.getAbsolutePath());
                C0VCY.LIZ("APM-SDK", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (C08GN.LIZIZ(arrayList2)) {
            return;
        }
        C793890VCh.LIZ.LJFF(arrayList2);
        C0VCV.LIZLLL = System.currentTimeMillis();
    }

    public final void LIZLLL() {
        if (this.LIZIZ.LIZ()) {
            return;
        }
        C0VCV.LIZ = System.currentTimeMillis();
        C0VCV.LIZIZ = 0L;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (!this.LIZIZ.LIZ()) {
            arrayList.add(this.LIZIZ.LIZIZ());
            C0VCA c0vcaLIZIZ = this.LIZIZ.LIZIZ();
            if (c0vcaLIZIZ != null) {
                int i2 = c0vcaLIZIZ.LIZIZ;
                if (i == 0 || i + i2 < 1048576) {
                    i += i2;
                    arrayList.add(c0vcaLIZIZ);
                } else {
                    C793890VCh.LIZ.LJFF(arrayList);
                    arrayList.clear();
                    arrayList.add(c0vcaLIZIZ);
                    i = i2;
                }
            }
        }
        C793890VCh.LIZ.LJFF(arrayList);
        C0VCV.LIZIZ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC794060VCy
    public final void LIZIZ(long j) {
        if (j - this.LJ >= this.LIZ) {
            try {
                System.currentTimeMillis();
                try {
                    if (this.LIZJ != null) {
                        this.LIZJ.LIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C0VCY.LIZIZ("flushBuffer", th);
                }
                LIZLLL();
                if (C0VC5.LIZLLL()) {
                    LIZJ();
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C0VCY.LIZIZ("report", th2);
            }
            this.LJ = System.currentTimeMillis();
        }
    }

    public final synchronized void LJ(long j) {
        if (j > 0) {
            if (this.LIZ != j) {
                this.LIZ = Math.min(j, this.LIZ);
            }
        }
    }
}
