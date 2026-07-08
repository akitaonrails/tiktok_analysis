package X;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0d92, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039020d92 {
    public final Activity LIZ;
    public PopupWindow LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public View LJ;

    public final PopupWindow LIZ(View.OnClickListener onClickListener) {
        if (this.LIZIZ == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.l6, null, false);
            this.LIZJ = viewTd.findViewById(R.id.t22);
            this.LIZLLL = viewTd.findViewById(R.id.ey6);
            this.LJ = viewTd.findViewById(R.id.poh);
            View view = this.LIZJ;
            if (view != null) {
                C786410Ut5.I7(onClickListener, view);
            }
            View view2 = this.LIZLLL;
            if (view2 != null) {
                C786410Ut5.I7(onClickListener, view2);
            }
            View view3 = this.LJ;
            if (view3 != null) {
                C786410Ut5.I7(onClickListener, view3);
            }
            PopupWindow popupWindow = new PopupWindow(viewTd, -2, -2, true);
            this.LIZIZ = popupWindow;
            popupWindow.setTouchable(true);
            this.LIZIZ.setAnimationStyle(R.style.a_2);
            this.LIZIZ.setBackgroundDrawable(new ColorDrawable(0));
        }
        return this.LIZIZ;
    }

    public C1039020d92(Activity activity, View.OnClickListener onClickListener) {
        this.LIZ = activity;
        LIZ(onClickListener);
    }
}
