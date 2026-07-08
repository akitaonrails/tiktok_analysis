package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.TTRetrofit;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Cfr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C319570Cfr extends C09AY implements Function0<C319560Cfq> {
    public C319570Cfr() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Cfq] */
    @Override // kotlin.jvm.functions.Function0
    public final C319560Cfq invoke() {
        final TTRetrofit tTRetrofitBuild = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build();
        return new C0O3U() { // from class: X.0Cfq
            @Override // X.C0O3U
            public final <T> T create(Class<T> cls) {
                return (T) tTRetrofitBuild.create(cls);
            }
        };
    }
}
