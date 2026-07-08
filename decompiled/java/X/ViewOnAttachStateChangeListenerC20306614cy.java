package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.ss.android.ugc.aweme.tako.botpage.components.sug.TakoSugAssem;

/* JADX INFO: renamed from: X.14cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class ViewOnAttachStateChangeListenerC20306614cy implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC20306614cy viewOnAttachStateChangeListenerC20306614cy, View view) {
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC20306614cy viewOnAttachStateChangeListenerC20306614cy, View view) {
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

    /* JADX WARN: Type inference failed for: r0v8, types: [T, kotlin.jvm.internal.AwS425S0200000_24] */
    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC20306614cy viewOnAttachStateChangeListenerC20306614cy, View view) {
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get((AbstractC20085213iM) viewOnAttachStateChangeListenerC20306614cy.l0);
        AbstractC20085213iM abstractC20085213iM = (AbstractC20085213iM) viewOnAttachStateChangeListenerC20306614cy.l0;
        if (lifecycleOwner != null) {
            ((C259800zU) viewOnAttachStateChangeListenerC20306614cy.l1).element = C1558660qfA.LIZ(abstractC20085213iM, lifecycleOwner.getLifecycle());
            ((AbstractC20085213iM) viewOnAttachStateChangeListenerC20306614cy.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC20306614cy);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("View tree for ");
            sbLIZ.append(abstractC20085213iM);
            sbLIZ.append(" has no ViewTreeLifecycleOwner");
            C1696250uF5.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            throw new C2197108jB();
        }
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC20306614cy viewOnAttachStateChangeListenerC20306614cy, View view) {
        ((View) viewOnAttachStateChangeListenerC20306614cy.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC20306614cy);
        ((TakoSugAssem) viewOnAttachStateChangeListenerC20306614cy.l1).zp();
    }

    public ViewOnAttachStateChangeListenerC20306614cy(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
