package X;

import Y.ACListenerS109S0200000_5;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0EsO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378300EsO {
    public static final C378300EsO LIZ = new C378300EsO();

    public static final void LIZ(LayoutInflater layoutInflater, LinearLayout linearLayout, ContextThemeWrapper contextThemeWrapper, C378290EsN c378290EsN, int i, int i2, int i3, Function0<Unit> function0, boolean z) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bzj, linearLayout, false);
        C427690Gpr.LJ(viewTd, 0.0f);
        TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.ish);
        tuxIconView.setIconRes(i);
        tuxIconView.setTintColor(c378290EsN.LIZIZ);
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.isi);
        tuxTextView.setText(i2);
        tuxTextView.setTuxFont(c378290EsN.LIZ);
        tuxTextView.setTextColor(c378290EsN.LIZIZ);
        tuxTextView.setTuxFont(102);
        TuxTextView tuxTextView2 = (TuxTextView) viewTd.findViewById(R.id.isg);
        tuxTextView2.setText(i3);
        tuxTextView2.setTuxFont(71);
        tuxTextView2.setTextColorRes(R.attr.a1k);
        C786410Ut5.I7(new ACListenerS109S0200000_5(function0, linearLayout, 23), viewTd);
        linearLayout.addView(viewTd);
        if (z) {
            C378300EsO c378300EsO = LIZ;
            int i4 = c378290EsN.LIZJ;
            c378300EsO.getClass();
            View view = new View(contextThemeWrapper);
            C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, (int) C418440Gaw.LIZIZ(Float.valueOf(0.5f))));
            view.setBackgroundColor(i4);
            linearLayout.addView(view);
        }
    }
}
