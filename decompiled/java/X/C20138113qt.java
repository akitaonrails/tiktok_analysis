package X;

import X.C1387670mDN;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13qt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20138113qt<P extends C1387670mDN> {
    public final InterfaceC20138013qs<P> LIZ;
    public P LIZIZ;
    public Bundle LIZJ;
    public boolean LIZLLL;

    public final P LIZ() {
        Bundle bundle;
        if (this.LIZ != null) {
            if (this.LIZIZ == null && (bundle = this.LIZJ) != null) {
                this.LIZIZ = (P) EnumC20137813qq.INSTANCE.getPresenter(bundle.getString("presenter_id"));
            }
            if (this.LIZIZ == null) {
                C20138313qv c20138313qv = (C20138313qv) this.LIZ;
                c20138313qv.getClass();
                try {
                    P pNewInstance = c20138313qv.LIZ.newInstance();
                    this.LIZIZ = pNewInstance;
                    EnumC20137813qq.INSTANCE.add(pNewInstance);
                    P p = this.LIZIZ;
                    Bundle bundle2 = this.LIZJ;
                    if (bundle2 != null) {
                        bundle2.getBundle("presenter");
                    }
                    p.getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException(e);
                }
            }
            this.LIZJ = null;
        }
        return this.LIZIZ;
    }

    public C20138113qt(C20138313qv c20138313qv) {
        this.LIZ = c20138313qv;
    }
}
