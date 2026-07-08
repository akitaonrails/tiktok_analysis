package X;

import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZtE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class ViewOnAttachStateChangeListenerC913900ZtE implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC913900ZtE viewOnAttachStateChangeListenerC913900ZtE, View view) {
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

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC913900ZtE viewOnAttachStateChangeListenerC913900ZtE, View view) {
        LifecycleCoroutineScope lifecycleScope;
        AnonymousClass0956 anonymousClass0956 = ((C900940ZWa) viewOnAttachStateChangeListenerC913900ZtE.l0).LL;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C900940ZWa c900940ZWa = (C900940ZWa) viewOnAttachStateChangeListenerC913900ZtE.l0;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get((C1295960jpS) viewOnAttachStateChangeListenerC913900ZtE.l1);
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C900950ZWb((C1295960jpS) viewOnAttachStateChangeListenerC913900ZtE.l1, (C900940ZWa) viewOnAttachStateChangeListenerC913900ZtE.l0, null), 2);
        }
        c900940ZWa.LL = anonymousClass0956LIZLLL;
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC913900ZtE viewOnAttachStateChangeListenerC913900ZtE, View view) {
        ((View) viewOnAttachStateChangeListenerC913900ZtE.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC913900ZtE);
        ((Function0) viewOnAttachStateChangeListenerC913900ZtE.l1).invoke();
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC913900ZtE viewOnAttachStateChangeListenerC913900ZtE, View view) {
        AnonymousClass0956 anonymousClass0956 = ((C900940ZWa) viewOnAttachStateChangeListenerC913900ZtE.l0).LL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public ViewOnAttachStateChangeListenerC913900ZtE(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
