package X;

import Y.ARunnableS98S0200000_29;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12YE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YE implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public C12YE(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj3;
        this.l2 = obj2;
    }

    public static final void onLayoutChange$0(C12YE c12ye, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c12ye);
        if (((View) c12ye.l0).isAttachedToWindow()) {
            Rect rect = new Rect();
            ((View) c12ye.l0).getHitRect(rect);
            ((Function1) c12ye.l1).invoke(rect);
            C19747812Oe c19747812Oe = (C19747812Oe) c12ye.l2;
            View view2 = (View) c12ye.l0;
            c19747812Oe.LIZ.add(new Rect(rect));
            c19747812Oe.LIZIZ.add(new TouchDelegate(rect, view2));
        }
    }

    public static final void onLayoutChange$1(C12YE c12ye, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c12ye);
        C19655911vJ editor = ((C19646111tj) c12ye.l0).getEditor();
        View rootView = editor.getRootView();
        if (((Function0) c12ye.l1) != null) {
            C786410Ut5.x3(rootView.getViewTreeObserver(), new C12YV((AbstractC19644711tV) c12ye.l2, (Function0) c12ye.l1, rootView, 2));
        }
        HandlerHook.viewPostDelay(editor, new ARunnableS98S0200000_29(editor, (C19646111tj) c12ye.l0, 60), 100L);
    }
}
