package X;

import com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0Ntx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608590Ntx {
    public static QuickExternalShareVM LIZ(C704830Rkn c704830Rkn) {
        if (c704830Rkn != null) {
            Object obj = c704830Rkn.LJFF.get("quick_share_vm");
            if (obj instanceof QuickExternalShareVM) {
                return (QuickExternalShareVM) obj;
            }
            return null;
        }
        return null;
    }

    public static VideoItemParams LIZIZ(C704830Rkn c704830Rkn) {
        if (c704830Rkn != null) {
            Object obj = c704830Rkn.LJFF.get("video_item_params");
            if (obj instanceof VideoItemParams) {
                return (VideoItemParams) obj;
            }
            return null;
        }
        return null;
    }
}
