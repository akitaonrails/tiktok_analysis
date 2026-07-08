package X;

import com.bytedance.retrofit2.client.Request;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pKw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507680pKw implements InterfaceC2027307wt {
    public static final /* synthetic */ int LIZ = 0;

    @Override // X.InterfaceC2027307wt
    public final boolean LIZIZ(String str, Request request, boolean z) {
        boolean zLJJIIZI;
        String str2;
        if (!C585850MyN.LIZ()) {
            return false;
        }
        String url = request.getUrl();
        System.currentTimeMillis();
        if (url != null) {
            zLJJIIZI = a0.LJJIIZI(url, "ec_native_prefetch_key", false);
        } else {
            zLJJIIZI = false;
        }
        System.currentTimeMillis();
        if (!zLJJIIZI) {
            return false;
        }
        String strLIZ = C1507690pKx.LIZ(request);
        if (C1507840pLC.LIZ.enable && (str2 = C1507840pLC.LIZIZ().nativePrefetchScene.get(str)) != null && C770702zh.LIZ(strLIZ)) {
            C2232408os c2232408os = C1507830pLB.LIZ;
            C1507830pLB.LIZ(str2);
        }
        return C770702zh.LIZ(strLIZ);
    }

    @Override // X.InterfaceC2027307wt
    public final void LJ(Map<String, ? extends Object> map, Request request, String str, boolean z, Object obj, List<C080U> list, C07WL c07wl) {
        String strLIZ = C1507690pKx.LIZ(request);
        if (C770702zh.LIZ(strLIZ)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1505650pHf c1505650pHf = C1505650pHf.LIZ;
            C1507770pL5 c1507770pL5LIZ = C1507760pL4.LIZ(str, jCurrentTimeMillis, map, obj, list, c07wl.LIZ);
            c1505650pHf.getClass();
            C1505650pHf.LIZJ(strLIZ, c1507770pL5LIZ);
        }
    }
}
