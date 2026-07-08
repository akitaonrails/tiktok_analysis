package X;

import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaOutService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04PN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04PN extends C09AY implements Function0<InterfaceC19744412Mw> {
    public C04PN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC19744412Mw invoke() {
        ICommerceMediaOutService iCommerceMediaOutService = (ICommerceMediaOutService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaOutService.class, false, false, false, 14, null);
        if (iCommerceMediaOutService != null) {
            return iCommerceMediaOutService.LIZ();
        }
        return null;
    }
}
