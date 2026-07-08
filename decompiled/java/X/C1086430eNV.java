package X;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.like.widget.SelfLikeWidget;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eNV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086430eNV extends AbstractC1086460eNY {
    public final /* synthetic */ SelfLikeWidget LIZ;

    public C1086430eNV(SelfLikeWidget selfLikeWidget) {
        this.LIZ = selfLikeWidget;
    }

    public final void LIZ(Bitmap bitmap) {
        int iLJIIIZ;
        C1086420eNU c1086420eNU;
        if (LiveLikeDegradeSettings.INSTANCE.disableBottomView(this.LIZ.dataChannel)) {
            return;
        }
        if (this.LIZ.LLJJIJI) {
            LiveHostAutoAdaptiveParams.INSTANCE.setDisableLikeBottomLastTime(SystemClock.uptimeMillis());
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SelfLikeWidget selfLikeWidget = this.LIZ;
        if (jCurrentTimeMillis - selfLikeWidget.LLJILJILJ < selfLikeWidget.LLJILJIL) {
            return;
        }
        selfLikeWidget.LLJILJILJ = System.currentTimeMillis();
        SelfLikeWidget selfLikeWidget2 = this.LIZ;
        LikeHelper likeHelper = selfLikeWidget2.LLJIJIL;
        if (likeHelper != null) {
            iLJIIIZ = likeHelper.LJJIJ();
        } else {
            iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.akg);
        }
        int i = (iLJIIIZ - C1120240fG2.LLJJIJI) / 2;
        if (i > 0) {
            AbstractC19994813Le.Default.nextInt(-i, i);
        }
        LikeHelper likeHelper2 = selfLikeWidget2.LLJIJIL;
        if (likeHelper2 != null && (c1086420eNU = likeHelper2.LLLJ) != null) {
            c1086420eNU.LIZIZ(true, bitmap, iLJIIIZ, i);
        }
    }
}
