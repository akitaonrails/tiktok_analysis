package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0NcE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597600NcE {
    public static final /* synthetic */ C597600NcE LIZ = new C597600NcE();
    public static final InterfaceC597590NcD LIZIZ = (InterfaceC597590NcD) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/").build().retrofit.LIZ(InterfaceC597590NcD.class);
}
