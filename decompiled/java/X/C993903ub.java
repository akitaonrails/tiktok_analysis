package X;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: X.03ub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C993903ub {
    public static final C993903ub LIZ = new C993903ub();

    public static ConstraintLayout LIZ(int i, Activity activity) {
        ConstraintLayout constraintLayout = new ConstraintLayout(activity);
        ImageView imageView = new ImageView(activity);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = i;
        imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
        C19ME c19me = new C19ME(-1, -2);
        c19me.topToTop = 0;
        c19me.startToStart = 0;
        c19me.endToEnd = 0;
        ((ViewGroup.MarginLayoutParams) c19me).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        ((ViewGroup.MarginLayoutParams) c19me).leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        ((ViewGroup.MarginLayoutParams) c19me).rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C786410Ut5.c6(imageView, c19me);
        constraintLayout.addView(imageView);
        return constraintLayout;
    }
}
