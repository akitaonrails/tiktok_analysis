package X;

import com.ss.android.ugc.aweme.IToastHelper;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0ZsS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913420ZsS extends C09AY implements Function1<C913430ZsT, Unit> {
    public C913420ZsS() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C913430ZsT c913430ZsT) {
        IToastHelper iToastHelper;
        C913430ZsT c913430ZsT2 = c913430ZsT;
        C900610ZUt.LIZJ.getClass();
        IEvent iEvent = c913430ZsT2.LIZJ;
        if (iEvent != null) {
            IMShareService.LIZ.getClass();
            IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
            if (iMShareServiceLIZ != null && iMShareServiceLIZ.LJJIIJ(iEvent) && !c913430ZsT2.LIZ && (iToastHelper = (IToastHelper) PluggableExtentionKt.pluggableSpiForReal(IToastHelper.class)) != null) {
                iToastHelper.LIZ(EnumC1365740le0.TOP, C1383370m6R.LJIIJ(2131831442), 3000L, AFwS201S0000000_14.get$arr$(291), false, 3, false, UUID.randomUUID().toString(), C0ZTX.LIZ);
            }
        }
        return Unit.LIZ;
    }
}
