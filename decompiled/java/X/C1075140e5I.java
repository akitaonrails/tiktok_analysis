package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;

/* JADX INFO: renamed from: X.0e5I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075140e5I extends C1377850lxX {
    public C1075140e5I() {
        super("fromWeb", true);
    }

    @Override // X.C1377850lxX
    public final String LJ(BaseSharePackage baseSharePackage, String str) {
        return baseSharePackage.url;
    }

    @Override // X.C1377850lxX, X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        ShareDependService.LIZ.getClass();
        ShareDependServiceImpl.LJJJJI().LJ(baseSharePackage.extras.getString("aweme_id"), baseSharePackage);
        super.LJIILIIL(context, baseSharePackage);
    }
}
