package X;

import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterComponentClick;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0boA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C987640boA extends C09AY implements Function0<ICRouterComponentClick> {
    public C987640boA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterComponentClick, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICRouterComponentClick invoke() {
        return ServiceManager.get().getService(ICRouterComponentClick.class);
    }
}
