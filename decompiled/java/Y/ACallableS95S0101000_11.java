package Y;

import X.C01GW;
import X.C1619720sFe;
import X.C1C7U;
import X.C709340Rs4;
import X.C721680SSo;
import X.InterfaceC1897260zTI;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import com.bytedance.touchpoint.api.model.IncentiveShareCard;
import com.bytedance.touchpoint.api.model.TaskDoneReponse;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaSizeMobComponent;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes12.dex */
public class ACallableS95S0101000_11 implements Callable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS95S0101000_11 aCallableS95S0101000_11) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1C7U.LIZ("InteractAreaSizeMobComponent@5b1e.onBottomSizeChangeInternal$1");
        View viewFindViewById = ((InteractAreaSizeMobComponent) aCallableS95S0101000_11.l0).LJJIJL().findViewById(R.id.kv2);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        int i2 = i - InteractAreaSizeMobComponent.LLJZ;
        int width = viewFindViewById.getWidth() + viewFindViewById.getPaddingStart();
        C01GW c01gw = C709340Rs4.LIZ;
        C709340Rs4.LIZIZ(new ARunnableS0S0103000_11((InteractAreaSizeMobComponent) aCallableS95S0101000_11.l0, aCallableS95S0101000_11.i1, i2, width, 1));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InteractAreaSizeMobComponent@5b1e.onBottomSizeChangeInternal$1");
        return unit;
    }

    public static final Object call$1(ACallableS95S0101000_11 aCallableS95S0101000_11) {
        ListenableFuture<TaskDoneReponse> listenableFutureRequestOnNotificationAction;
        INetworkApi iNetworkApiLIZJ;
        String str;
        C1C7U.LIZ("IncentiveShareCardManager@7a4a.mobNotificationAction$1");
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null) {
            IncentiveShareCard incentiveShareCard = ((C721680SSo) aCallableS95S0101000_11.l0).LIZ;
            if (incentiveShareCard == null || (str = incentiveShareCard.notificationId) == null) {
                str = "";
            }
            listenableFutureRequestOnNotificationAction = iNetworkApiLIZJ.requestOnNotificationAction(str, aCallableS95S0101000_11.i1, "feed_card", "", 0, 0, null);
        } else {
            listenableFutureRequestOnNotificationAction = null;
        }
        C1C7U.LIZIZ("IncentiveShareCardManager@7a4a.mobNotificationAction$1");
        return listenableFutureRequestOnNotificationAction;
    }

    public ACallableS95S0101000_11(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
