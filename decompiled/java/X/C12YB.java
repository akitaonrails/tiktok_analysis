package X;

import android.view.SurfaceView;
import android.view.View;

/* JADX INFO: renamed from: X.12YB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YB implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public C12YB(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLayoutChange$0(C12YB c12yb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C19726412Fy) c12yb.l0).LIZLLL();
        ((C19726412Fy) c12yb.l0).LIZIZ();
        ((View) c12yb.l1).removeOnLayoutChangeListener(c12yb);
    }

    public static final void onLayoutChange$1(C12YB c12yb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SurfaceView surfaceView = (SurfaceView) c12yb.l0;
        if (surfaceView != null) {
            ((C19680611zI) c12yb.l1).wx(surfaceView.getWidth(), surfaceView.getHeight());
        }
        SurfaceView surfaceView2 = (SurfaceView) c12yb.l0;
        if (surfaceView2 != null) {
            surfaceView2.removeOnLayoutChangeListener(c12yb);
        }
    }

    public static final void onLayoutChange$2(C12YB c12yb, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C0FV1.LIZJ((C0FV1) c12yb.l0, (C19648611u8) c12yb.l1);
    }
}
