package X;

import com.ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptorTTNet;
import com.ss.android.ugc.aweme.net.interceptor.ApiCheckInterceptorTTNet;
import com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptorTTNet;
import com.ss.android.ugc.aweme.net.interceptor.UrlTransformInterceptorTTNet;
import com.ss.android.ugc.aweme.utils.InterceptorHolder;
import com.ss.android.ugc.aweme.utils.SecUidInterceptorTTNet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0X4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842940X4y extends AbstractC846150XHh {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0X4z, X.0XHf] */
    @Override // X.AbstractC846150XHh
    public final synchronized C846140XHg LJIIL() {
        ?? r2;
        C0CO1.LIZ().LIZJ();
        r2 = new C846130XHf() { // from class: X.0X4z
            static {
                new HashMap();
                new HashMap();
            }
        };
        if (r2.LIZIZ == null) {
            r2.LIZIZ = new C1493620oyG();
        }
        C1493620oyG c1493620oyG = r2.LIZIZ;
        c1493620oyG.LIZJ = 60000L;
        c1493620oyG.LIZLLL = 60000L;
        c1493620oyG.LJ = 60000L;
        r2.LJIIL(new ApiAlisgInterceptorTTNet());
        r2.LJIIL(new ApiCheckInterceptorTTNet());
        r2.LJIIL(new DevicesNullInterceptorTTNet());
        r2.LJIIL(new UrlTransformInterceptorTTNet());
        r2.LJIIL(new SecUidInterceptorTTNet());
        List listLIZ = InterceptorHolder.LIZLLL().LIZ();
        if (!C086I.LIZIZ(listLIZ)) {
            Iterator it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                r2.LJIIL((InterfaceC1904907d9) it2.next());
            }
        }
        r2.LIZJ = new C842430X2z();
        return new C846140XHg(r2);
    }
}
