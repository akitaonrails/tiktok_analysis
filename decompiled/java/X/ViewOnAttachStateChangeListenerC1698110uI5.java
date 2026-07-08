package X;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;

/* JADX INFO: renamed from: X.0uI5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class ViewOnAttachStateChangeListenerC1698110uI5 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1698110uI5 viewOnAttachStateChangeListenerC1698110uI5, View view) {
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC1698110uI5 viewOnAttachStateChangeListenerC1698110uI5, View view) {
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1698110uI5 viewOnAttachStateChangeListenerC1698110uI5, View view) {
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

    public ViewOnAttachStateChangeListenerC1698110uI5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1698110uI5 viewOnAttachStateChangeListenerC1698110uI5, View view) {
        if (((StickerCategoryFragment) viewOnAttachStateChangeListenerC1698110uI5.l0).getUserVisibleHint()) {
            ((StickerCategoryFragment) viewOnAttachStateChangeListenerC1698110uI5.l0).kS();
        }
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1698110uI5 viewOnAttachStateChangeListenerC1698110uI5, View view) {
        ((EffectTemplateCategoryFragment) viewOnAttachStateChangeListenerC1698110uI5.l0).OR();
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC1698110uI5 viewOnAttachStateChangeListenerC1698110uI5, View view) {
        LifecycleRegistry lifecycleRegistry = ((C1685290txP) viewOnAttachStateChangeListenerC1698110uI5.l0).LL;
        if ((lifecycleRegistry instanceof LifecycleRegistry) && lifecycleRegistry != null) {
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        }
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1698110uI5);
    }
}
