package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.tako.botpage.components.interaction.TakoNewInteractionAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ycj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class ViewOnAttachStateChangeListenerC1864670ycj implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1864670ycj viewOnAttachStateChangeListenerC1864670ycj, View view) {
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC1864670ycj viewOnAttachStateChangeListenerC1864670ycj, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
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
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC1864670ycj(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1864670ycj viewOnAttachStateChangeListenerC1864670ycj, View view) {
        ((TakoNewInteractionAssem) viewOnAttachStateChangeListenerC1864670ycj.l0).Jp(view);
        ((TakoNewInteractionAssem) viewOnAttachStateChangeListenerC1864670ycj.l0).tp();
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1864670ycj viewOnAttachStateChangeListenerC1864670ycj, View view) {
        ((TakoNewInteractionAssem) viewOnAttachStateChangeListenerC1864670ycj.l0).sp();
        ((TakoNewInteractionAssem) viewOnAttachStateChangeListenerC1864670ycj.l0).Wp();
        ((TakoNewInteractionAssem) viewOnAttachStateChangeListenerC1864670ycj.l0).Fp(false);
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1864670ycj viewOnAttachStateChangeListenerC1864670ycj, View view) {
        ((C1846490y9P) viewOnAttachStateChangeListenerC1864670ycj.l0).getClass();
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC1864670ycj viewOnAttachStateChangeListenerC1864670ycj, View view) {
        FrameLayout frameLayout = (FrameLayout) viewOnAttachStateChangeListenerC1864670ycj.l0;
        if (frameLayout != null) {
            frameLayout.setTag(R.id.o0n, null);
        }
    }
}
