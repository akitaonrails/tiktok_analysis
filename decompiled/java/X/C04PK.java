package X;

import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdOutService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04PK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04PK extends C09AY implements Function0<InterfaceC1025290cmt> {
    public C04PK() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1025290cmt invoke() {
        ICommercializeAdOutService iCommercializeAdOutService = (ICommercializeAdOutService) PluggableExtentionKt.pluggableSpi$default(ICommercializeAdOutService.class, false, false, false, 14, null);
        if (iCommercializeAdOutService == null) {
            return null;
        }
        iCommercializeAdOutService.LIZ();
        return C1025250cmp.LIZ;
    }
}
