package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewHistoryAuthorizationFragment;

/* JADX INFO: renamed from: X.0TMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745610TMp {
    public static void LIZ(Context context, String str, boolean z, String str2, DialogInterface.OnDismissListener onDismissListener) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ instanceof C19EG) {
            VideoViewHistoryAuthorizationFragment videoViewHistoryAuthorizationFragment = new VideoViewHistoryAuthorizationFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("page_type", str, bundle);
            bundle.putBoolean("is_auto_pop", z);
            C786410Ut5.LJJJI("aid", str2, bundle);
            videoViewHistoryAuthorizationFragment.setArguments(bundle);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = videoViewHistoryAuthorizationFragment;
            tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC786070UsX(onDismissListener, videoViewHistoryAuthorizationFragment, 1);
            tuxSheet.LLJLILLLLZIIL = false;
            c1390920mIc.LJIIIIZZ(0);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLILLL = true;
            tuxSheet2.LL = new DialogInterfaceOnCancelListenerC786010UsR(videoViewHistoryAuthorizationFragment, 0);
            tuxSheet2.show(((C19EG) activityLIZ).getSupportFragmentManager(), "VideoViewHistoryPop");
        }
    }
}
