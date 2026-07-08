package X;

import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0P4L, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4L implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewDetachedFromWindow$0(C0P4L c0p4l, View view) {
    }

    public static final void onViewDetachedFromWindow$1(C0P4L c0p4l, View view) {
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

    public C0P4L(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(C0P4L c0p4l, View view) {
        ((View) c0p4l.l0).removeOnAttachStateChangeListener(c0p4l);
        C0OP5.LJI.LJIIJ();
    }

    public static final void onViewAttachedToWindow$1(C0P4L c0p4l, View view) {
        ((View) c0p4l.l0).removeOnAttachStateChangeListener(c0p4l);
        C0OP5.LJI.LJIIJ();
    }

    public static final void onViewAttachedToWindow$2(C0P4L c0p4l, View view) {
        C1390410mHn c1390410mHn = ((C0OUU) c0p4l.l0).LIZJ;
        if (c1390410mHn != null && c1390410mHn.getParent() != null && c1390410mHn.getVisibility() == 0) {
            c1390410mHn.LIZJ();
        }
    }

    public static final void onViewDetachedFromWindow$2(C0P4L c0p4l, View view) {
        C0OUU c0ouu = (C0OUU) c0p4l.l0;
        HandlerHook.viewRemoveCallbacks(c0ouu.LIZ, c0ouu.LJFF);
        C1390410mHn c1390410mHn = ((C0OUU) c0p4l.l0).LIZJ;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
    }
}
