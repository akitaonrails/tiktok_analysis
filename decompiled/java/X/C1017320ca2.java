package X;

import com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ca2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017320ca2 extends C09AY implements Function0<ICommerceGlueOutService> {
    public C1017320ca2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICommerceGlueOutService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(ICommerceGlueOutService.class, false, false, false, 14, null);
    }
}
