package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0wvb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799490wvb {
    public static final /* synthetic */ C1799490wvb LIZ = new C1799490wvb();

    public static InterfaceC1799500wvc LIZ() {
        return (InterfaceC1799500wvc) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(InterfaceC1799500wvc.class);
    }
}
