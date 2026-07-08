package X;

import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterModelTransform;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04t7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1239504t7 extends C09AY implements Function0<ICRouterModelTransform> {
    public C1239504t7() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterModelTransform, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICRouterModelTransform invoke() {
        return ServiceManager.get().getService(ICRouterModelTransform.class);
    }
}
