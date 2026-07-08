package X;

import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0cET, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003950cET {
    public static final C1003950cET LIZ = new C1003950cET();

    public static void LIZ(TuxTextView tuxTextView, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tuxTextView.getLayoutParams();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            marginLayoutParams.setMarginStart(C679280Qkg.LIZ(1));
                            marginLayoutParams.bottomMargin = C679280Qkg.LIZ(1);
                            tuxTextView.setTuxFont(91);
                        }
                    } else {
                        marginLayoutParams.setMarginStart(C679280Qkg.LIZ(4));
                        marginLayoutParams.bottomMargin = C679280Qkg.LIZ(1);
                        tuxTextView.setTuxFont(81);
                    }
                } else {
                    marginLayoutParams.setMarginStart(C679280Qkg.LIZ(3));
                    marginLayoutParams.bottomMargin = C679280Qkg.LIZ(1);
                    tuxTextView.setTuxFont(71);
                }
            } else {
                marginLayoutParams.setMarginStart(C679280Qkg.LIZ(4));
                marginLayoutParams.bottomMargin = C679280Qkg.LIZ(2);
                tuxTextView.setTuxFont(51);
            }
        } else {
            marginLayoutParams.setMarginStart(C679280Qkg.LIZ(5));
            marginLayoutParams.bottomMargin = C679280Qkg.LIZ(2);
            tuxTextView.setTuxFont(31);
        }
        C786410Ut5.R6(tuxTextView, marginLayoutParams);
    }
}
