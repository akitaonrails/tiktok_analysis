package X;

import com.bytedance.applog.AppLog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1Bel, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210131Bel implements InterfaceC2209801BeE, C0XD6 {
    public volatile C844770XBz LIZIZ;
    public volatile C1BA2 LIZJ;
    public final C2209901BeO LIZLLL;
    public volatile C0XCI LJ;
    public C0XBN LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public volatile C0XC1 LIZ = new C0XC1();
    public final ConcurrentHashMap<String, Object> LJFF = new ConcurrentHashMap<>();

    public final InterfaceC844530XBb LIZIZ() {
        if (this.LJ == null) {
            synchronized (this) {
                try {
                    if (this.LJ == null) {
                        if (AppLog.getInstance() == this.LIZLLL) {
                            this.LJ = C0XCJ.LIZIZ;
                        } else {
                            this.LJ = new C0XCI();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJ;
    }

    public final C0XBN LIZJ() {
        if (this.LJI == null) {
            this.LJI = ((C0XCI) LIZIZ()).LJI();
        }
        return this.LJI;
    }

    public C2210131Bel(C2209901BeO c2209901BeO) {
        this.LIZLLL = c2209901BeO;
    }

    @Override // X.C0XD6
    public final void LIZ(C0XBN c0xbn) {
        this.LJI = c0xbn;
    }
}
