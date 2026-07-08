package X;

import android.view.View;
import com.ss.android.ugc.aweme.api.creationeoy.ICreationEoyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ruu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C711100Ruu extends C09AY implements Function1<C711590Rvh, View> {
    public C711100Ruu() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(C711590Rvh c711590Rvh) {
        View viewLIZ;
        C711590Rvh c711590Rvh2 = c711590Rvh;
        ICreationEoyService iCreationEoyService = (ICreationEoyService) PluggableExtentionKt.pluggableSpi$default(ICreationEoyService.class, false, false, false, 14, null);
        if (iCreationEoyService == null || (viewLIZ = iCreationEoyService.LIZ(c711590Rvh2.LIZIZ)) == null) {
            return new View(c711590Rvh2.LIZIZ);
        }
        return viewLIZ;
    }
}
