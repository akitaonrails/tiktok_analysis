package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.share.multiapp.DowngradeShareExService;
import com.ss.android.ugc.aweme.share.multiapp.IShareExService;

/* JADX INFO: renamed from: X.0tgn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674990tgn implements IShareExService {
    public static final C1674990tgn LIZIZ = new C1674990tgn();
    public final /* synthetic */ IShareExService LIZ;

    @Override // com.ss.android.ugc.aweme.share.multiapp.IShareExService
    public final int LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.share.multiapp.IShareExService
    public final boolean LIZIZ(String str, String str2) {
        return this.LIZ.LIZIZ(str, str2);
    }

    public C1674990tgn() {
        IShareExService iShareExService = (IShareExService) PluggableExtentionKt.pluggableSpi$default(IShareExService.class, false, false, false, 14, null);
        this.LIZ = iShareExService == null ? new DowngradeShareExService() : iShareExService;
    }
}
