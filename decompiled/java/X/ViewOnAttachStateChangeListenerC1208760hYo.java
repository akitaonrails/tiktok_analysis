package X;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.poi.videopublish.IPoiPublishUpdateUiStatusAbility;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0hYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class ViewOnAttachStateChangeListenerC1208760hYo implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC1208760hYo viewOnAttachStateChangeListenerC1208760hYo, View view) {
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

    public ViewOnAttachStateChangeListenerC1208760hYo(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1208760hYo viewOnAttachStateChangeListenerC1208760hYo, View view) {
        TakoSheetFragment takoSheetFragment = (TakoSheetFragment) viewOnAttachStateChangeListenerC1208760hYo.l0;
        takoSheetFragment.getClass();
        if (!EventBus.LIZLLL().LJIIJ(takoSheetFragment)) {
            EventBus.LIZLLL().LJIJJ(takoSheetFragment);
        }
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC1208760hYo viewOnAttachStateChangeListenerC1208760hYo, View view) {
        C19EG c19egLIZ;
        IPoiPublishUpdateUiStatusAbility iPoiPublishUpdateUiStatusAbility;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) viewOnAttachStateChangeListenerC1208760hYo.l0;
        if ((lifecycleOwner instanceof AbstractC738140SxQ) && lifecycleOwner != null && (c19egLIZ = C724240Sb0.LIZ(lifecycleOwner)) != null && (iPoiPublishUpdateUiStatusAbility = (IPoiPublishUpdateUiStatusAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZ, null), IPoiPublishUpdateUiStatusAbility.class, null)) != null) {
            iPoiPublishUpdateUiStatusAbility.NO(view);
        }
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1208760hYo viewOnAttachStateChangeListenerC1208760hYo, View view) {
        TakoSheetFragment takoSheetFragment = (TakoSheetFragment) viewOnAttachStateChangeListenerC1208760hYo.l0;
        takoSheetFragment.getClass();
        if (EventBus.LIZLLL().LJIIJ(takoSheetFragment)) {
            EventBus.LIZLLL().LJJI(takoSheetFragment);
        }
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1208760hYo viewOnAttachStateChangeListenerC1208760hYo, View view) {
        ((C1205180hT2) viewOnAttachStateChangeListenerC1208760hYo.l0).LLILLJJLI.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        ((C1205180hT2) viewOnAttachStateChangeListenerC1208760hYo.l0).LLILLJJLI.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1208760hYo viewOnAttachStateChangeListenerC1208760hYo, View view) {
    }
}
