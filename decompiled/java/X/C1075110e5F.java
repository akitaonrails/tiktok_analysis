package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.web.service.IAdWebUIUtils;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0e5F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075110e5F extends C1377850lxX {
    public final C1075210e5P LLILLL;

    @Override // X.C1377850lxX, X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        IAdWebUIUtils iAdWebUIUtils = (IAdWebUIUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUIUtils.class, false, false, false, 14, null);
        return (iAdWebUIUtils == null || !iAdWebUIUtils.LIZ(this.LLILLL.LIZIZ, null)) ? R.raw.icon_2pt_link : R.raw.icon_link;
    }

    public C1075110e5F(C1075210e5P c1075210e5P) {
        super("fromWeb", true);
        this.LLILLL = c1075210e5P;
    }

    @Override // X.C1377850lxX
    public final String LJ(BaseSharePackage baseSharePackage, String str) {
        return baseSharePackage.url;
    }

    @Override // X.C1377850lxX, X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        IAdWebUIUtils iAdWebUIUtils = (IAdWebUIUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUIUtils.class, false, false, false, 14, null);
        if (iAdWebUIUtils == null || !iAdWebUIUtils.LIZ(this.LLILLL.LIZIZ, null)) {
            ShareDependService.LIZ.getClass();
            ShareDependServiceImpl.LJJJJI().LJ(baseSharePackage.extras.getString("aweme_id"), baseSharePackage);
        }
        super.LJIILIIL(context, baseSharePackage);
    }
}
