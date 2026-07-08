package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.friendstab.ability.FriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;

/* JADX INFO: renamed from: X.0sHI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class ViewOnAttachStateChangeListenerC1620740sHI implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
        }
    }

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1620740sHI viewOnAttachStateChangeListenerC1620740sHI, View view) {
        C19EG c19eg = (C19EG) viewOnAttachStateChangeListenerC1620740sHI.l0;
        FriendsTabLayoutAbility friendsTabLayoutAbility = (FriendsTabLayoutAbility) viewOnAttachStateChangeListenerC1620740sHI.l1;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) viewOnAttachStateChangeListenerC1620740sHI.l2;
        if (!C1591220rVg.LIZLLL()) {
            lifecycleOwner = null;
        }
        C1558520qew.LJII(C1558360qeg.LJI(c19eg, null), friendsTabLayoutAbility, IFriendsTabLayoutAbility.class, null, lifecycleOwner);
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1620740sHI viewOnAttachStateChangeListenerC1620740sHI, View view) {
        View view2 = (View) viewOnAttachStateChangeListenerC1620740sHI.l0;
        C786410Ut5.z3(view2.getViewTreeObserver(), (ViewTreeObserver.OnScrollChangedListener) viewOnAttachStateChangeListenerC1620740sHI.l1);
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1620740sHI viewOnAttachStateChangeListenerC1620740sHI, View view) {
        C1558520qew.LJIIJJI(C1558360qeg.LJI((C19EG) viewOnAttachStateChangeListenerC1620740sHI.l0, null), TopTabAbility.class, null);
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1620740sHI viewOnAttachStateChangeListenerC1620740sHI, View view) {
        View view2 = (View) viewOnAttachStateChangeListenerC1620740sHI.l0;
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) viewOnAttachStateChangeListenerC1620740sHI.l1;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
            C2187701Ajg.LIZIZ(viewTreeObserver, onScrollChangedListener, ViewTreeObserver.OnScrollChangedListener.class);
        }
        HandlerHook.viewRemoveCallbacks(view, (Runnable) viewOnAttachStateChangeListenerC1620740sHI.l2);
        ((View) viewOnAttachStateChangeListenerC1620740sHI.l0).setOnTouchListener(null);
    }

    public ViewOnAttachStateChangeListenerC1620740sHI(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
