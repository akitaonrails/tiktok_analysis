package X;

import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820230WFp implements InterfaceC814150Vwj {
    public static volatile C820230WFp LIZIZ;
    public final C820220WFo LIZ;

    public C820230WFp(C820220WFo c820220WFo) {
        C0W3J.LJIIIIZZ(c820220WFo);
        this.LIZ = c820220WFo;
        new ConcurrentHashMap();
    }

    @Override // X.InterfaceC814150Vwj
    public final void LIZIZ(Object obj) {
        if (!(!C19781312aR.LIZIZ.contains("fcm"))) {
            return;
        }
        C820210WFn c820210WFn = this.LIZ.LIZ;
        c820210WFn.getClass();
        c820210WFn.LIZIZ(new C820400WGg(c820210WFn, "fcm", "_ln", obj, true));
    }

    @Override // X.InterfaceC814150Vwj
    public final void LIZ(String str, Bundle bundle) {
        if ((!C19781312aR.LIZIZ.contains("fcm")) && !C19781312aR.LIZ.contains(str)) {
            AbstractC19875512pd<String> abstractC19875512pd = C19781312aR.LIZJ;
            int size = abstractC19875512pd.size();
            int i = 0;
            while (i < size) {
                String str2 = abstractC19875512pd.get(i);
                i++;
                if (bundle.containsKey(str2)) {
                    return;
                }
            }
            if ("_cmp".equals(str)) {
                if (!C19781312aR.LIZIZ.contains("fcm")) {
                    AbstractC19875512pd<String> abstractC19875512pd2 = C19781312aR.LIZJ;
                    int size2 = abstractC19875512pd2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        String str3 = abstractC19875512pd2.get(i2);
                        i2++;
                        if (bundle.containsKey(str3)) {
                            return;
                        }
                    }
                    C786410Ut5.LJJJI("_cis", "fcm_integration", bundle);
                } else {
                    return;
                }
            }
            C820210WFn c820210WFn = this.LIZ.LIZ;
            c820210WFn.getClass();
            c820210WFn.LIZIZ(new C820250WFr(c820210WFn, "fcm", str, bundle, true));
        }
    }
}
