package X;

import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0kUT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321390kUT extends C1321420kUW {
    public Map<String, ? extends Object> f;
    public Object g;
    public C1325710kbR h;
    public final HashMap<String, Long> i;

    public C1321390kUT(C21325918cz c21325918cz) {
        super(c21325918cz);
        this.i = new HashMap<>();
    }

    @Override // X.C1321420kUW, X.InterfaceC1321130kU3
    public final void LJIIJ(C1325710kbR c1325710kbR) {
        Object obj = this.LLZZLLIL;
        if ((obj instanceof String) && obj != null) {
            this.h = c1325710kbR;
            this.i.put((String) obj, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0009 A[SYNTHETIC] */
    @Override // X.C1321420kUW, X.AbstractC21333318eB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJILLIZJL(java.util.Map<java.lang.String, ? extends java.lang.Object> r7) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1321390kUT.LJJLIIIJILLIZJL(java.util.Map):void");
    }

    @Override // X.C1321420kUW, X.InterfaceC1321130kU3
    public final void onFailure(Throwable th) {
        Object obj = this.LLZZLLIL;
        String message = null;
        if ((obj instanceof String) && obj != null) {
            try {
                Long lRemove = this.i.remove(obj);
                if (lRemove != null) {
                    long jLongValue = lRemove.longValue();
                    C1325710kbR c1325710kbR = this.h;
                    long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                    Map<String, ? extends Object> map = this.f;
                    if (th != null) {
                        message = th.getMessage();
                    }
                    C1326230kcH.LJFF(true, false, c1325710kbR, jCurrentTimeMillis, 0, map, message, null, 0, null);
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    @Override // X.C1321420kUW, X.InterfaceC1321130kU3
    public final void LIZLLL(Drawable drawable, C1323050kX9 c1323050kX9) {
        super.LIZLLL(drawable, c1323050kX9);
        Object obj = this.LLZZLLIL;
        if ((obj instanceof String) && obj != null) {
            try {
                Long lRemove = this.i.remove(obj);
                if (lRemove != null) {
                    C1326230kcH.LJFF(true, true, this.h, System.currentTimeMillis() - lRemove.longValue(), 0, this.f, null, null, null, null);
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
