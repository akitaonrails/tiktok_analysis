package X;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.covode.number.MaxIndexGetter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* JADX INFO: renamed from: X.0kZN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324430kZN extends Covode {
    public static final C1324430kZN LJ = new C1324430kZN();
    public String LIZ;
    public C0VSJ LIZIZ;
    public boolean LIZJ;
    public C0T5K LIZLLL;

    public static byte[] LIZ(File file) throws Throwable {
        C0VSP c0vsp;
        C0VSP c0vsp2 = null;
        try {
            try {
                c0vsp = new C0VSP(file);
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                try {
                    c0vsp2.close();
                    throw th;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw th;
                }
            }
            try {
                try {
                    byte[] bArr = new byte[c0vsp.available()];
                    c0vsp.read(bArr);
                    try {
                        c0vsp.close();
                        return bArr;
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return bArr;
                    }
                } catch (Exception e3) {
                    e = e3;
                    TryCatchGuardChecker.doCheck(e);
                    try {
                        c0vsp.close();
                        return null;
                    } catch (IOException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        return null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                c0vsp2 = c0vsp;
                TryCatchGuardChecker.doCheck(th);
                c0vsp2.close();
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            c0vsp = null;
        }
    }

    @Override // com.bytedance.covode.number.Covode
    public final synchronized boolean report(InterfaceC1324450kZP interfaceC1324450kZP) {
        if (this.LIZ == null) {
            return false;
        }
        if (this.LIZIZ == null) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(this.LIZ);
        if (!c0vsj.exists()) {
            return false;
        }
        File[] fileArrListFiles = c0vsj.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (this.LIZIZ == null || !file.getName().equals(this.LIZIZ.getName())) {
                    LIZIZ(file, interfaceC1324450kZP);
                    file.delete();
                }
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0T5K] */
    @Override // com.bytedance.covode.number.Covode
    public final synchronized boolean start(C741140T5k c741140T5k) {
        if (this.LIZJ) {
            return true;
        }
        final int i = 0;
        if (MaxIndexGetter.getMaxIndex() == Integer.MIN_VALUE) {
            return false;
        }
        try {
            c741140T5k.getClass();
            this.LIZ = null;
            this.LIZLLL = new C0W9W(i) { // from class: X.0T5K
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("CovodeNumberImpl$SaveTask@907.run");
                    boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                    try {
                        Covode.save();
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("CovodeNumberImpl$SaveTask@907.run");
                }
            };
            PthreadTimer pthreadTimer = new PthreadTimer("CovodeNumberImpl");
            C0T5K c0t5k = this.LIZLLL;
            c741140T5k.getClass();
            long j = 0;
            pthreadTimer.scheduleAtFixedRate(c0t5k, j, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LIZJ = true;
        return true;
    }

    public static void LIZIZ(File file, InterfaceC1324450kZP interfaceC1324450kZP) throws Throwable {
        DeflaterOutputStream deflaterOutputStream;
        byte[] bArrLIZ = LIZ(file);
        if (bArrLIZ != null && bArrLIZ.length > 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflaterOutputStream deflaterOutputStream2 = null;
            try {
                try {
                    try {
                        deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, new Deflater(9));
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                deflaterOutputStream.write(bArrLIZ);
                deflaterOutputStream.close();
                String str = new String(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                String[] strArrSplit = file.getName().split("_");
                if (strArrSplit != null && strArrSplit.length == 2) {
                    Integer.parseInt(strArrSplit[1]);
                    interfaceC1324450kZP.LIZ(str);
                }
                deflaterOutputStream.close();
            } catch (IOException e3) {
                e = e3;
                deflaterOutputStream2 = deflaterOutputStream;
                TryCatchGuardChecker.doCheck(e);
                deflaterOutputStream2.close();
            } catch (Throwable th2) {
                th = th2;
                deflaterOutputStream2 = deflaterOutputStream;
                TryCatchGuardChecker.doCheck(th);
                try {
                    deflaterOutputStream2.close();
                    throw th;
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    throw th;
                }
            }
        }
    }
}
