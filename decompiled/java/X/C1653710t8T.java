package X;

import Y.ATListenerS457S0100000_25;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.0t8T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653710t8T implements InterfaceC1644710stx {
    public final /* synthetic */ View LIZ;

    public C1653710t8T(View view) {
        this.LIZ = view;
    }

    @Override // X.InterfaceC1644710stx
    public final void LIZ(View.OnClickListener onClickListener) {
        View view = this.LIZ;
        if (view == null) {
            return;
        }
        C786410Ut5.I7(onClickListener, view);
        Context context = this.LIZ.getContext();
        final View view2 = this.LIZ;
        this.LIZ.setOnTouchListener(new ATListenerS457S0100000_25(new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: X.0t8U
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                view2.performClick();
                return true;
            }
        }), 2));
    }
}
