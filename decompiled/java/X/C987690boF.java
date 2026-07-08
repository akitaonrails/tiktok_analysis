package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0boF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C987690boF extends C09AY implements Function0<ICommerceService> {
    public C987690boF() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.structure.api.ICommerceService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICommerceService invoke() {
        return ServiceManager.get().getService(ICommerceService.class);
    }
}
