package X;

import Y.ACListenerS151S0100000_16;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0d90, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039000d90 {
    public PopupWindow LIZ;
    public View LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public List<Integer> LJ;
    public final Activity LJFF;
    public final InterfaceC1038990d8z LJI;
    public final ACListenerS151S0100000_16 LJII = new ACListenerS151S0100000_16(this, 0);

    public final PopupWindow LIZ() {
        if (this.LIZ == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LJFF), R.layout.bin, null, false);
            this.LIZIZ = viewTd.findViewById(R.id.t22);
            this.LIZJ = viewTd.findViewById(R.id.ey6);
            this.LIZLLL = viewTd.findViewById(R.id.poh);
            C786410Ut5.I7(this.LJII, this.LIZIZ);
            C786410Ut5.I7(this.LJII, this.LIZJ);
            C786410Ut5.I7(this.LJII, this.LIZLLL);
            PopupWindow popupWindow = new PopupWindow(viewTd, -2, -2, true);
            this.LIZ = popupWindow;
            popupWindow.setTouchable(true);
            this.LIZ.setAnimationStyle(R.style.abx);
            this.LIZ.setBackgroundDrawable(new ColorDrawable(0));
        }
        return this.LIZ;
    }

    public C1039000d90(Activity activity, InterfaceC1038990d8z interfaceC1038990d8z) {
        this.LJFF = activity;
        this.LJI = interfaceC1038990d8z;
        LIZ();
    }
}
