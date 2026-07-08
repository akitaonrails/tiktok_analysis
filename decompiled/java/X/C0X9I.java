package X;

import com.bytedance.geckox.AppSettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0X9I, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X9I {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public volatile File LIZLLL;
    public volatile Long LJ;
    public volatile C0X9H LJFF;
    public final AtomicBoolean LJI = new AtomicBoolean(false);
    public final AtomicBoolean LJII = new AtomicBoolean(false);

    public final void LIZJ() throws Throwable {
        if (this.LJFF != null) {
            this.LJFF.getClass();
        }
        if (!AppSettingsManager.LIZIZ()) {
            if (this.LJI.compareAndSet(true, false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(File.separator);
                sbLIZ.append(this.LIZJ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C0X9L.LIZLLL(strLIZIZ);
                C1551020qSq.LIZIZ(0L, strLIZIZ, true, true);
                return;
            }
            return;
        }
        if (this.LJII.getAndSet(true)) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZIZ);
        String str = File.separator;
        sbLIZ2.append(str);
        sbLIZ2.append(this.LIZJ);
        sbLIZ2.append(str);
        sbLIZ2.append("select.lock");
        C2222308nF c2222308nFLIZ = C2222308nF.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        C1553130qWF.LIZ("gecko-file-lock", "channel version loader clean");
        try {
            if (this.LIZLLL == null) {
                c2222308nFLIZ.LIZIZ();
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.LIZLLL.getAbsolutePath());
            sbLIZ3.append(str);
            sbLIZ3.append("using.lock");
            C2223008nM.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
            c2222308nFLIZ.LIZIZ();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(this.LIZIZ);
            sbLIZ4.append(str);
            sbLIZ4.append(this.LIZJ);
            C1551020qSq.LIZIZ(0L, C2188811AlT.LIZIZ(sbLIZ4), false, true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2222308nFLIZ.LIZIZ();
            throw th;
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        C1553130qWF.LIZ("gecko-debug-tag", "channel loader finalize lock");
        try {
            LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2222008nC.LIZ(th);
        }
    }

    public final synchronized File LIZ(String str, boolean z) {
        if (this.LIZLLL != null && !z) {
            return this.LIZLLL;
        }
        if (AppSettingsManager.LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            String str2 = File.separator;
            sbLIZ.append(str2);
            sbLIZ.append(str);
            sbLIZ.append(str2);
            sbLIZ.append("select.lock");
            C2222308nF c2222308nFLIZ = C2222308nF.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            try {
                if (this.LJ == null) {
                    this.LJ = C1550600qSA.LJIIIZ(this.LIZ, str, false, false);
                } else if (z) {
                    if (C1550600qSA.LJI(this.LJ.longValue(), this.LIZ, str) == null) {
                        c2222308nFLIZ.LIZIZ();
                        return null;
                    }
                }
                if (this.LJ == null) {
                    c2222308nFLIZ.LIZIZ();
                    return null;
                }
                String str3 = this.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append(str);
                sbLIZ2.append(str2);
                sbLIZ2.append(this.LJ);
                sbLIZ2.append(str2);
                sbLIZ2.append("using.lock");
                C0VSJ c0vsj = new C0VSJ(str3, C2188811AlT.LIZIZ(sbLIZ2));
                this.LIZLLL = c0vsj.getParentFile();
                C2223008nM.LIZIZ(c0vsj.getAbsolutePath());
                File file = this.LIZLLL;
                c2222308nFLIZ.LIZIZ();
                return file;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c2222308nFLIZ.LIZIZ();
                throw th;
            }
        }
        if (this.LJ == null) {
            this.LJ = C1550600qSA.LJIIIZ(this.LIZ, str, false, false);
        }
        if (this.LJ == null) {
            return null;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this.LIZIZ);
        sbLIZ3.append(File.separator);
        sbLIZ3.append(this.LIZJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        this.LJI.set(C0X9L.LIZJ(strLIZIZ));
        if (!this.LJI.get()) {
            return null;
        }
        this.LIZLLL = new C0VSJ(strLIZIZ, String.valueOf(this.LJ));
        return this.LIZLLL;
    }

    public final C0X9H LIZIZ(String str, EnumC797980VSa enumC797980VSa) {
        C1550730qSN c1550730qSN = C1550730qSN.LIZ;
        String str2 = this.LIZ;
        c1550730qSN.getClass();
        boolean zLIZLLL = C1550730qSN.LIZLLL(str2, str);
        if (this.LJFF != null) {
            C1551330qTL c1551330qTL = C1551330qTL.LIZ;
            String str3 = this.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1551330qTL.getClass();
            C1551330qTL.LJIIIZ(str3, str, 0L, enumC797980VSa, true, jCurrentTimeMillis, zLIZLLL);
            return this.LJFF;
        }
        synchronized (this) {
            try {
                File fileLIZ = LIZ(str, zLIZLLL);
                if (fileLIZ != null) {
                    C0VSJ c0vsj = new C0VSJ(fileLIZ, "res");
                    if (c0vsj.exists() && c0vsj.isDirectory()) {
                        this.LJFF = new C0X9H(fileLIZ);
                        this.LJFF.LIZIZ = this.LIZ;
                        this.LJFF.LIZJ = str;
                        C1551330qTL c1551330qTL2 = C1551330qTL.LIZ;
                        String str4 = this.LIZ;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        c1551330qTL2.getClass();
                        C1551330qTL.LJIIIZ(str4, str, 0L, enumC797980VSa, true, jCurrentTimeMillis2, zLIZLLL);
                    } else {
                        C1551330qTL c1551330qTL3 = C1551330qTL.LIZ;
                        String str5 = this.LIZ;
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        c1551330qTL3.getClass();
                        C1551330qTL.LJIIIZ(str5, str, 0L, enumC797980VSa, false, jCurrentTimeMillis3, zLIZLLL);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("can not find res, dir:");
                        sbLIZ.append(fileLIZ.getAbsolutePath());
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    C1551330qTL c1551330qTL4 = C1551330qTL.LIZ;
                    String str6 = this.LIZ;
                    long jCurrentTimeMillis4 = System.currentTimeMillis();
                    c1551330qTL4.getClass();
                    C1551330qTL.LJIIIZ(str6, str, 0L, enumC797980VSa, false, jCurrentTimeMillis4, zLIZLLL);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("channel no exist，channel:");
                    sbLIZ2.append(str);
                    throw new FileNotFoundException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this.LJFF;
    }

    public C0X9I(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
