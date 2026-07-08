package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterSceneEnum;

/* JADX INFO: renamed from: X.0r8Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1576890r8Z {
    public static final C1576890r8Z LIZ = new C1576890r8Z();

    public static final void LIZ(Context context) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://paidcontent/drama/center");
        Bundle bundle = new Bundle();
        bundle.putInt(Scene.SCENE_SERVICE, SeriesCenterSceneEnum.ALL.getValue());
        C786410Ut5.LJJJI("enter_from", "paid_series_detail_page", bundle);
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.open();
    }
}
