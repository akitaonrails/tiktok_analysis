package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ISocPubDistributeService;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rtX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606010rtX implements ISocPubDistributeService {
    public static final C1606010rtX LIZIZ = new C1606010rtX();
    public final /* synthetic */ ISocPubDistributeService LIZ = (ISocPubDistributeService) ServiceManager.get().getService(ISocPubDistributeService.class);

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final InterfaceC1398730mVD LIZ(C1605770rt9 c1605770rt9) {
        return this.LIZ.LIZ(c1605770rt9);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final C1608950ryH LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final void LIZJ(EnumC1615506Uf enumC1615506Uf, EnumC1606080rte enumC1606080rte, List list, Function1 function1) {
        this.LIZ.LIZJ(enumC1615506Uf, enumC1606080rte, list, function1);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final void LIZLLL(EnumC1615506Uf enumC1615506Uf, EnumC1606080rte enumC1606080rte, List list, List list2, Function1 function1) {
        this.LIZ.LIZLLL(enumC1615506Uf, enumC1606080rte, list, list2, function1);
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final void LJ() {
        this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.service.ISocPubDistributeService
    public final boolean LJFF(User user) {
        return this.LIZ.LJFF(user);
    }
}
