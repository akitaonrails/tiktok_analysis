package X;

import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0l7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345720l7i {
    public static final int LIZ(C19EG c19eg) {
        SAFHelper.LIZ.getClass();
        if (SAFHelper.LJIIJ() && (c19eg instanceof InterfaceC1603190roz)) {
            return R.id.tyd;
        }
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null && iDetailFeedSafService.LJFF(c19eg)) {
            return R.id.tyd;
        }
        C295150BhZ.LIZ.getClass();
        if (C295150BhZ.LIZ() && (c19eg instanceof InterfaceC1603190roz)) {
            return R.id.tyd;
        }
        return android.R.id.content;
    }
}
