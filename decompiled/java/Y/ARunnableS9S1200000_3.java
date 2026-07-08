package Y;

import X.C1611670s2f;
import X.C19EG;
import X.C1C7U;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS9S1200000_3 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS9S1200000_3 aRunnableS9S1200000_3) {
        boolean zLIZ;
        C1C7U.LIZ("TEImageFactory@acee.decodeImage$1");
        try {
            ((Bitmap[]) aRunnableS9S1200000_3.l1)[0] = BitmapFactory.decodeFile(aRunnableS9S1200000_3.s0, (BitmapFactory.Options) aRunnableS9S1200000_3.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TEImageFactory@acee.decodeImage$1");
    }

    public static final void run$1(ARunnableS9S1200000_3 aRunnableS9S1200000_3) {
        boolean zLIZ;
        C1C7U.LIZ("AsyncTaskManagerServiceImpl@7ddd.applyAutoPickCoverToView$1$onGetVideoCoverSuccess$1");
        try {
            if (!((Bitmap) aRunnableS9S1200000_3.l1).isRecycled() && Intrinsics.LJFF(((SmartImageView) aRunnableS9S1200000_3.l2).getTag(), aRunnableS9S1200000_3.s0)) {
                ((SmartImageView) aRunnableS9S1200000_3.l2).setImageBitmap((Bitmap) aRunnableS9S1200000_3.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AsyncTaskManagerServiceImpl@7ddd.applyAutoPickCoverToView$1$onGetVideoCoverSuccess$1");
    }

    public static final void run$2(ARunnableS9S1200000_3 aRunnableS9S1200000_3) {
        boolean zLIZ;
        Bundle extras;
        Intent extra;
        C1C7U.LIZ("SeriesInnerFeedInterceptor@9617.launchInnerFeedWhenVisible$runnable$1");
        try {
            C1611670s2f c1611670s2f = C1611670s2f.LIZ;
            String str = aRunnableS9S1200000_3.s0;
            c1611670s2f.getClass();
            C1611670s2f.LIZIZ(str).LIZJ();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C19EG) aRunnableS9S1200000_3.l1, "aweme://series/innerfeed");
            RouteIntent routeIntent = (RouteIntent) aRunnableS9S1200000_3.l2;
            if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                try {
                    extras = extra.getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    extras = null;
                }
                smartRouteBuildRoute.withParam(extras);
                smartRouteBuildRoute.open();
            } else {
                extras = null;
                smartRouteBuildRoute.withParam(extras);
                smartRouteBuildRoute.open();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeriesInnerFeedInterceptor@9617.launchInnerFeedWhenVisible$runnable$1");
    }

    public ARunnableS9S1200000_3(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
