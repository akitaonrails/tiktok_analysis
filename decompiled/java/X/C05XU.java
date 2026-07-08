package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.05XU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05XU {
    public static final /* synthetic */ C05XU LIZ = new C05XU();
    public static final C11G6 LIZIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        LIZIZ = (C11G6) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C2188811AlT.LIZIZ(sbLIZ)).build().retrofit.LIZ(C11G6.class);
    }
}
