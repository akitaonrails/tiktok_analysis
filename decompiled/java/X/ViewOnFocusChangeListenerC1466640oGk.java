package X;

import android.view.View;

/* JADX INFO: renamed from: X.0oGk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class ViewOnFocusChangeListenerC1466640oGk implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                break;
            case 1:
                onFocusChange$1(this, view, z);
                break;
        }
    }

    public ViewOnFocusChangeListenerC1466640oGk(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(ViewOnFocusChangeListenerC1466640oGk viewOnFocusChangeListenerC1466640oGk, View view, boolean z) {
        if (z) {
            ((C1427290nFH) viewOnFocusChangeListenerC1466640oGk.l0).LLLLIL().LIZIZ.invoke();
        }
    }

    public static final void onFocusChange$1(ViewOnFocusChangeListenerC1466640oGk viewOnFocusChangeListenerC1466640oGk, View view, boolean z) {
        if (z) {
            ((C1427280nFG) viewOnFocusChangeListenerC1466640oGk.l0).LLLLIL().LIZIZ.invoke();
        }
    }
}
