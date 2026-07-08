package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: renamed from: X.0cf2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1020420cf2 implements InterfaceC1020440cf4 {
    @Override // X.InterfaceC1020440cf4
    public final List<Class<? extends InterfaceC1063710dmr>> LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC1020440cf4
    public final InterfaceC1057870ddR LIZJ(AdSparkHybridContext adSparkHybridContext, Context context, String str, Bundle bundle) {
        return null;
    }

    @Override // X.InterfaceC1020440cf4
    public AbstractC1542100qES LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC1020440cf4
    public final List<InterfaceC1051730dTX> LIZ(C1051660dTQ c1051660dTQ) {
        ((InterfaceC1000280c8Y) ((ICommercializeAdService) ServiceManager.get().getService(ICommercializeAdService.class)).Q(17)).LJJIIJ();
        return C1020280ceo.LIZ(c1051660dTQ);
    }
}
