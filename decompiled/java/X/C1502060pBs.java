package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0pBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502060pBs {
    public final C1502070pBt LIZ;
    public final C1502050pBr LIZIZ;
    public boolean LIZJ;

    public final C1502600pCk LIZ() {
        if (this.LIZJ) {
            return new C1502600pCk(-201, "call has requested", C1502140pC0.LIZIZ, null, new Exception("call has requested"));
        }
        this.LIZJ = true;
        C1502050pBr c1502050pBr = this.LIZIZ;
        C0X9S<?> c0x9s = c1502050pBr.LIZJ;
        if (c0x9s == null) {
            Throwable th = c1502050pBr.LIZIZ;
            Class<?> cls = th != null ? th.getClass() : null;
            Throwable th2 = c1502050pBr.LIZIZ;
            return new C1502600pCk(-1, cls + ": " + (th2 != null ? th2.getMessage() : null) + ", -1", C1502140pC0.LIZIZ, null, c1502050pBr.LIZIZ);
        }
        try {
            return C1502050pBr.LIZ(c0x9s.execute());
        } catch (C1494430ozZ e) {
            TryCatchGuardChecker.doCheck(e);
            return new C1502600pCk(e.getStatusCode(), C1494430ozZ.class + ": " + e.getMessage() + ", " + e.getStatusCode(), C1502140pC0.LIZIZ, null, e);
        } catch (C1494690ozz e2) {
            TryCatchGuardChecker.doCheck(e2);
            return new C1502600pCk(e2.getStatusCode(), C1494690ozz.class + ": " + e2.getMessage() + ", " + e2.getStatusCode(), C1502140pC0.LIZIZ, null, e2);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            return new C1502600pCk(-1, e3.getClass() + ": " + e3.getMessage() + ", -1", C1502140pC0.LIZIZ, null, e3);
        }
    }

    public C1502060pBs(C1502070pBt c1502070pBt) {
        this.LIZ = c1502070pBt;
        C1502130pBz c1502130pBz = new C1502130pBz(c1502070pBt.LIZJ);
        c1502130pBz.LIZ("x-metasec-bypass-ttnet-features", "1");
        c1502130pBz.LIZ("x-tt-bypass-dp", "1");
        c1502130pBz.LIZ("bypass-boe", "1");
        c1502130pBz.LIZ("bdp_ttnet_request_type", "raw");
        c1502130pBz.LIZ("x-ttnet-httpdns-enable", "1");
        this.LIZIZ = new C1502050pBr(c1502070pBt);
    }
}
