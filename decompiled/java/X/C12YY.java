package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.12YY, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YY implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(C12YY c12yy) {
        if (((ViewTreeObserver) c12yy.l0).isAlive()) {
            C786410Ut5.A3((ViewTreeObserver) c12yy.l0, c12yy);
        } else {
            C786410Ut5.A3(((View) c12yy.l1).getViewTreeObserver(), c12yy);
        }
        ((AtomicBoolean) c12yy.l2).set(false);
        ((Runnable) c12yy.l3).run();
    }

    public static final void onGlobalLayout$1(C12YY c12yy) {
        int i;
        C20244914Jj c20244914JjLIZ;
        C20246014Ju c20246014JuLIZ = C14K4.LIZ(((Window) c12yy.l0).getDecorView());
        if (c20246014JuLIZ != null && (c20244914JjLIZ = c20246014JuLIZ.LIZ(8)) != null) {
            i = c20244914JjLIZ.LIZLLL;
        } else {
            i = 0;
        }
        if (((C013C) c12yy.l1).element) {
            int bottom = (((C118300cf) c12yy.l2).element - ((Window) c12yy.l0).getDecorView().getBottom()) + i;
            if (bottom < 0) {
                bottom = 0;
            }
            ((View) c12yy.l3).setPadding(0, 0, 0, bottom);
        }
    }

    public C12YY(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
