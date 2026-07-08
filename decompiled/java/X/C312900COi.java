package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.ad.feed.dialog.DislikeReasonApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0COi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312900COi {
    public static final /* synthetic */ C312900COi LIZ = new C312900COi();
    public static final String LIZIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    public static DislikeReasonApi LIZ() {
        return (DislikeReasonApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(LIZIZ).build().retrofit.LIZ(DislikeReasonApi.class);
    }
}
