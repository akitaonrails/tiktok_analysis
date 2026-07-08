package X;

import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10a6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19269610a6 extends C09AY implements Function0<InterfaceC19269510a5> {
    public C19269610a6() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.10a5, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC19269510a5 invoke() {
        InterfaceC19269510a5.LIZ.getClass();
        return ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(InterfaceC19269510a5.class);
    }
}
