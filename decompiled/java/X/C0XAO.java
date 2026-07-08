package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0XAO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XAO extends C09AY implements Function1<Class<? extends Object>, Object> {
    public C0XAO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Class<? extends Object> cls) {
        return ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C2225551C8r.LIZIZ.invoke()).build().create(cls);
    }
}
