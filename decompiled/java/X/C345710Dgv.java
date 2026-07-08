package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS620S0100000_6;
import wh6.AbS497S0200000_4;

/* JADX INFO: renamed from: X.0Dgv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345710Dgv implements C0SH7 {
    public C345700Dgu LIZ;
    public AwS620S0100000_6 LIZIZ;

    @Override // X.C0SH7
    public final View LIZ(Context context) {
        C0GUJ c0guj = new C0GUJ(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0guj);
        c0guj.setLayoutParams(marginLayoutParams);
        int i = 0;
        c0guj.setOrientation(0);
        c0guj.setGravity(17);
        C345700Dgu c345700Dgu = this.LIZ;
        if (c345700Dgu != null) {
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, i);
            Function1<View, Unit> function1 = c345700Dgu.LIZIZ;
            if (function1 != null) {
                function1.invoke(tuxTextView);
            }
            C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
            tuxTextView.setTuxFont(62);
            tuxTextView.setTextColorRes(R.attr.ee);
            tuxTextView.setMaxLines(1);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setGravity(17);
            tuxTextView.setText(c345700Dgu.LIZ);
            C786410Ut5.I7(new AbS497S0200000_4(this, c345700Dgu, 0), tuxTextView);
            c0guj.addView(tuxTextView);
        }
        return c0guj;
    }
}
