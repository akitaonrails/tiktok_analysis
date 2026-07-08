package X;

import android.text.TextUtils;
import android.util.LruCache;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* JADX INFO: renamed from: X.0oUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475260oUe implements InterfaceC1479880oc6<C1477160oXi> {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ SimVideoUrlModel LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // X.InterfaceC1479880oc6
    public final C1477160oXi LIZ() {
        return C607330Nrv.LIZ.LIZ().getProcessUrlData(this.LIZIZ, this.LIZLLL);
    }

    @Override // X.InterfaceC1479880oc6
    public final C1477160oXi get() {
        C1477160oXi c1477160oXiLIZLLL;
        LruCache<SimVideoUrlModel, C1477160oXi> lruCache;
        if (((this.LIZ || !C1479290ob9.LIZ().PreloadProcessDataExperiment()) && !((Boolean) C1474810oTv.V0.getValue()).booleanValue()) || (lruCache = C1479290ob9.LIZIZ) == null || (c1477160oXiLIZLLL = lruCache.get(this.LIZIZ)) == null) {
            C1475330oUl c1475330oUl = new C1475330oUl();
            c1475330oUl.LIZ = this.LIZIZ;
            c1475330oUl.LIZIZ = this.LIZ;
            c1475330oUl.LIZJ = this.LIZJ;
            c1477160oXiLIZLLL = C607330Nrv.LIZ.LIZ().createVideoUrlProcessor().LIZLLL(c1475330oUl);
            if (((Boolean) C1474810oTv.V0.getValue()).booleanValue()) {
                Object obj = c1477160oXiLIZLLL.LIZ;
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!TextUtils.isEmpty(str) && !str.startsWith("http") && !str.startsWith("mdl:")) {
                        return c1477160oXiLIZLLL;
                    }
                }
                C1479290ob9.LIZIZ.put(this.LIZIZ, c1477160oXiLIZLLL);
                return c1477160oXiLIZLLL;
            }
        }
        return c1477160oXiLIZLLL;
    }

    public C1475260oUe(SimVideoUrlModel simVideoUrlModel, String str, boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = simVideoUrlModel;
        this.LIZJ = z2;
        this.LIZLLL = str;
    }
}
