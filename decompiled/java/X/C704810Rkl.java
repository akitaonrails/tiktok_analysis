package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Rkl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704810Rkl {
    public static final /* synthetic */ int LIZ = 0;

    public static C704820Rkm LIZ(String str, String str2, C704830Rkn c704830Rkn, AbstractC704860Rkq abstractC704860Rkq, LifecycleCoroutineScope lifecycleCoroutineScope) {
        C1172104iF c1172104iF;
        if (abstractC704860Rkq == null) {
            return new C704820Rkm(null);
        }
        synchronized (C701560RfW.LIZ) {
            if (C701560RfW.LIZ() && str2 != null) {
                Map map = (Map) ((LinkedHashMap) C701560RfW.LIZJ).get(str2);
                if (map != null) {
                    c1172104iF = (C1172104iF) map.get(str);
                } else {
                    c1172104iF = null;
                }
                if (c1172104iF != null) {
                    new LinkedHashMap();
                    throw null;
                }
            }
        }
        return new C704820Rkm(C705380Rlg.LIZ(str, c704830Rkn, abstractC704860Rkq.LIZIZ(), lifecycleCoroutineScope));
    }
}
