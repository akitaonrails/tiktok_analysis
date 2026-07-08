package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationFollowDialog;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10kP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class ViewTreeObserverOnPreDrawListenerC19333510kP implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC19333510kP viewTreeObserverOnPreDrawListenerC19333510kP) {
        int i;
        int height = ((NotificationFollowDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).SR().getHeight() - ((NotificationFollowDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).OR().getHeight();
        NotificationFollowDialog notificationFollowDialog = (NotificationFollowDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0;
        View viewFindViewById = notificationFollowDialog.LLJIJIL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view = notificationFollowDialog.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.iel);
            } else {
                viewFindViewById = null;
            }
            notificationFollowDialog.LLJIJIL = (TuxTextView) viewFindViewById;
        }
        int bottom = height - (viewFindViewById.getBottom() - ((NotificationFollowDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).PR().getTop());
        NotificationFollowDialog notificationFollowDialog2 = (NotificationFollowDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0;
        View view2 = notificationFollowDialog2.LLJI;
        if (view2 == null) {
            View view3 = notificationFollowDialog2.getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.if2);
            }
            notificationFollowDialog2.LLJI = (TuxNavBar) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        int bottom2 = (bottom - view2.getBottom()) / 10;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((NotificationFollowDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).PR().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ((NotificationFollowDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).OR().getLayoutParams();
        ViewGroup.LayoutParams layoutParams = ((NotificationFollowDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).SR().getLayoutParams();
        if (((NotificationFollowDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).SR().getHeight() > ((int) (((double) C12ES.LJIIIIZZ(((NotificationFollowDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).getContext())) * 0.73d))) {
            layoutParams.height = (int) (((double) C12ES.LJIIIIZZ(((NotificationFollowDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).getContext())) * 0.73d);
            C786410Ut5.a6(((NotificationFollowDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).SR(), layoutParams);
            return false;
        }
        int i2 = bottom2 * 4;
        if (marginLayoutParams.topMargin == i2 && marginLayoutParams2.topMargin == (i = bottom2 * 3) && marginLayoutParams2.bottomMargin == i) {
            C786410Ut5.D3(((NotificationFollowDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).RR().getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC19333510kP);
            return true;
        }
        marginLayoutParams.topMargin = i2;
        int i3 = bottom2 * 3;
        marginLayoutParams2.topMargin = i3;
        marginLayoutParams2.bottomMargin = i3;
        C422820Gi0 c422820Gi0PR = ((NotificationFollowDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).PR();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c422820Gi0PR);
        c422820Gi0PR.setLayoutParams(marginLayoutParams);
        C786410Ut5.J6(((NotificationFollowDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).OR(), marginLayoutParams2);
        return false;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC19333510kP viewTreeObserverOnPreDrawListenerC19333510kP) {
        int i;
        int height = ((NotificationLiveBottomDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).kS().getHeight() - ((NotificationLiveBottomDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).VR().getHeight();
        NotificationLiveBottomDialog notificationLiveBottomDialog = (NotificationLiveBottomDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0;
        View viewFindViewById = notificationLiveBottomDialog.LLJJIJI;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view = notificationLiveBottomDialog.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.iel);
            } else {
                viewFindViewById = null;
            }
            notificationLiveBottomDialog.LLJJIJI = (TuxTextView) viewFindViewById;
        }
        int bottom = height - (viewFindViewById.getBottom() - ((NotificationLiveBottomDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).WR().getTop());
        NotificationLiveBottomDialog notificationLiveBottomDialog2 = (NotificationLiveBottomDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0;
        View view2 = notificationLiveBottomDialog2.LLJJIII;
        if (view2 == null) {
            View view3 = notificationLiveBottomDialog2.getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.if2);
            }
            notificationLiveBottomDialog2.LLJJIII = (TuxNavBar) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        int bottom2 = (bottom - view2.getBottom()) / 10;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((NotificationLiveBottomDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).WR().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ((NotificationLiveBottomDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).VR().getLayoutParams();
        ViewGroup.LayoutParams layoutParams = ((NotificationLiveBottomDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).kS().getLayoutParams();
        if (((NotificationLiveBottomDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).kS().getHeight() > ((int) (((double) C12ES.LJIIIIZZ(((NotificationLiveBottomDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).getContext())) * 0.73d))) {
            layoutParams.height = (int) (((double) C12ES.LJIIIIZZ(((NotificationLiveBottomDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).getContext())) * 0.73d);
            C786410Ut5.a6(((NotificationLiveBottomDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).kS(), layoutParams);
            return false;
        }
        int i2 = bottom2 * 4;
        if (marginLayoutParams.topMargin == i2 && marginLayoutParams2.topMargin == (i = bottom2 * 3) && marginLayoutParams2.bottomMargin == i) {
            C786410Ut5.D3(((NotificationLiveBottomDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).ZR().getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC19333510kP);
            return true;
        }
        marginLayoutParams.topMargin = i2;
        int i3 = bottom2 * 3;
        marginLayoutParams2.topMargin = i3;
        marginLayoutParams2.bottomMargin = i3;
        C422820Gi0 c422820Gi0WR = ((NotificationLiveBottomDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).WR();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c422820Gi0WR);
        c422820Gi0WR.setLayoutParams(marginLayoutParams);
        C786410Ut5.J6(((NotificationLiveBottomDialog) viewTreeObserverOnPreDrawListenerC19333510kP.l0).VR(), marginLayoutParams2);
        return false;
    }

    public ViewTreeObserverOnPreDrawListenerC19333510kP(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
