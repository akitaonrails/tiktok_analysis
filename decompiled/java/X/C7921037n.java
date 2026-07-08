package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.037n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7921037n {
    public static final void LIZIZ(View view, Function0<Boolean> function0) {
        View viewFindViewById;
        int i;
        if (view != null && (viewFindViewById = view.findViewById(R.id.z92)) != null) {
            if (function0.invoke().booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
    }

    public static final void LIZ(View view, String str, Function0<Boolean> function0) {
        TuxTextView tuxTextView;
        if (view != null && (tuxTextView = (TuxTextView) view.findViewById(R.id.z92)) != null) {
            tuxTextView.setTextColorRes(R.attr.a1k);
            tuxTextView.setTuxFont(71);
            if ((function0 == null || function0.invoke().booleanValue()) && str != null && str.length() != 0) {
                tuxTextView.setText(str);
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            } else {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
        }
    }
}
