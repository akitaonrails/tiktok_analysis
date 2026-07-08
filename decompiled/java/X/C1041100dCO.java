package X;

import com.ss.android.ugc.aweme.ad.service.IAdLandPageDependOutService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dCO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041100dCO extends C09AY implements Function0<InterfaceC1041080dCM> {
    public C1041100dCO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1041080dCM invoke() {
        IAdLandPageDependOutService iAdLandPageDependOutService = (IAdLandPageDependOutService) PluggableExtentionKt.pluggableSpi$default(IAdLandPageDependOutService.class, false, false, false, 14, null);
        if (iAdLandPageDependOutService == null) {
            return null;
        }
        iAdLandPageDependOutService.LIZ();
        return C1041120dCQ.LIZ;
    }
}
