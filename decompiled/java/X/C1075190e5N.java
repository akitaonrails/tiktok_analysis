package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;

/* JADX INFO: renamed from: X.0e5N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075190e5N extends C1075270e5V {
    @Override // X.C1075270e5V, X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        ShareDependService.LIZ.getClass();
        ShareDependServiceImpl.LJJJJI().LJJIJLIJ(baseSharePackage.extras.getString("aweme_id"), baseSharePackage);
        super.LJIILIIL(context, baseSharePackage);
    }
}
