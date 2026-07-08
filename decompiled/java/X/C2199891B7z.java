package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: X.1B7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199891B7z implements C1B8V {
    public final Object LIZ = new Object();
    public final List<HttpHeader> LIZIZ;
    public final String LIZJ;
    public C1B8V LIZLLL;
    public boolean LJ;
    public long LJFF;
    public InputStream LJI;

    public final boolean LIZLLL() {
        try {
            C1B8V c1b8v = this.LIZLLL;
            if (c1b8v == null) {
                return false;
            }
            int iLIZ = c1b8v.LIZ();
            return iLIZ >= 200 && iLIZ < 300;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC2199921B8c
    public final int LIZ() {
        C1B8V c1b8v = this.LIZLLL;
        if (c1b8v != null) {
            return c1b8v.LIZ();
        }
        return 0;
    }

    public final void LIZJ() {
        C1B8V c1b8vLIZ;
        if (this.LIZLLL != null) {
            return;
        }
        synchronized (this.LIZ) {
            try {
                try {
                    this.LJ = true;
                    InterfaceC1500070p8f interfaceC1500070p8fLJIIJ = C2199681B7e.LJIIJ();
                    if (interfaceC1500070p8fLJIIJ != null) {
                        c1b8vLIZ = ((C1498630p6L) interfaceC1500070p8fLJIIJ).LIZ(this.LIZJ, this.LIZIZ);
                    } else {
                        c1b8vLIZ = null;
                    }
                    this.LIZLLL = c1b8vLIZ;
                    if (c1b8vLIZ != null) {
                        this.LJFF = System.currentTimeMillis();
                        this.LJI = this.LIZLLL.getInputStream();
                    }
                    this.LJ = false;
                    this.LIZ.notifyAll();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LJ = false;
                    this.LIZ.notifyAll();
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final void LJ() {
        synchronized (this.LIZ) {
            try {
                if (this.LJ && this.LIZLLL == null) {
                    this.LIZ.wait();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2199921B8c
    public final void cancel() {
        C1B8V c1b8v = this.LIZLLL;
        if (c1b8v != null) {
            c1b8v.cancel();
        }
    }

    @Override // X.C1B8V
    public final void end() {
        C1B8V c1b8v = this.LIZLLL;
        if (c1b8v != null) {
            c1b8v.end();
        }
    }

    @Override // X.C1B8V
    public final InputStream getInputStream() {
        InputStream inputStream = this.LJI;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    @Override // X.InterfaceC2199921B8c
    public final String LIZIZ(String str) {
        C1B8V c1b8v = this.LIZLLL;
        if (c1b8v != null) {
            return c1b8v.LIZIZ(str);
        }
        return null;
    }

    public C2199891B7z(int i, String str, List list) {
        this.LIZJ = str;
        this.LIZIZ = list;
    }
}
