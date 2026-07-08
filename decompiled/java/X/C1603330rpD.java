package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0rpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1603330rpD implements ICommerceCommonService {
    public static final C1603330rpD LIZIZ = new C1603330rpD();
    public final /* synthetic */ ICommerceCommonService LIZ = (ICommerceCommonService) ServiceManager.get().getService(ICommerceCommonService.class);

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final void LIZIZ(Context context, String str) {
        this.LIZ.LIZIZ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final InterfaceC988770bpz LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final boolean LJFF(Aweme aweme) {
        return this.LIZ.LJFF(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final String LJI(String str) {
        return this.LIZ.LJI(str);
    }
}
