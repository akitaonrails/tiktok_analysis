package X;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS620S0100000_6;
import wh6.AbS498S0200000_6;

/* JADX INFO: renamed from: X.0HH2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HH2 implements C0SH7 {
    public final LinkedList<C345700Dgu> LIZ = new LinkedList<>();
    public AwS620S0100000_6 LIZIZ;

    @Override // X.C0SH7
    public final View LIZ(Context context) {
        Number numberValueOf;
        int paddingEnd;
        C0GUJ c0guj = new C0GUJ(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0guj);
        c0guj.setLayoutParams(marginLayoutParams);
        int i = 0;
        c0guj.setOrientation(0);
        int i2 = 17;
        c0guj.setGravity(17);
        Paint paint = new Paint();
        paint.setTextSize(C418440Gaw.LIZIZ(12));
        if (this.LIZ.size() == 1) {
            numberValueOf = -2;
        } else {
            Iterator<C345700Dgu> it2 = this.LIZ.iterator();
            if (it2.hasNext()) {
                float fMeasureText = paint.measureText(it2.next().LIZ.toString());
                while (it2.hasNext()) {
                    fMeasureText = Math.max(fMeasureText, paint.measureText(it2.next().LIZ.toString()));
                }
                numberValueOf = Float.valueOf(Math.min(C418440Gaw.LIZIZ(Float.valueOf(fMeasureText)), C418440Gaw.LIZIZ(68) - C418440Gaw.LIZIZ(20)));
            } else {
                throw new NoSuchElementException();
            }
        }
        int i3 = 0;
        for (C345700Dgu c345700Dgu : this.LIZ) {
            int i4 = i3 + 1;
            AttributeSet attributeSet = null;
            if (i3 >= 0) {
                C345700Dgu c345700Dgu2 = c345700Dgu;
                c345700Dgu2.LIZLLL = numberValueOf.intValue();
                C197039127h c197039127h = new C197039127h(context, attributeSet, 6, i);
                Function1<View, Unit> function1 = c345700Dgu2.LIZIZ;
                if (function1 != null) {
                    function1.invoke(c197039127h);
                }
                c197039127h.setButtonSize(0);
                c197039127h.setGravity(i2);
                c197039127h.setButtonVariant(2);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.dy);
                c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
                c197039127h.LJJJJLI(true);
                c197039127h.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0);
                int i5 = c345700Dgu2.LIZLLL;
                if (i5 == -2) {
                    paddingEnd = -2;
                } else {
                    paddingEnd = c197039127h.getPaddingEnd() + i5 + c197039127h.getPaddingStart();
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(paddingEnd, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                if (i3 == 1) {
                    if (C1899620zX6.LIZ()) {
                        layoutParams.setMargins(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0);
                    } else {
                        layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, 0, 0);
                    }
                }
                C786410Ut5.J6(c197039127h, layoutParams);
                c197039127h.setText(c345700Dgu2.LIZ);
                C786410Ut5.I7(new AbS498S0200000_6(this, c345700Dgu2, 2), c197039127h);
                c0guj.addView(c197039127h);
                i3 = i4;
                i2 = 17;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return c0guj;
    }

    public final void LIZIZ(CharSequence charSequence, Function1<? super View, Unit> function1, Function1<? super View, Unit> function12) {
        if (this.LIZ.size() > 1) {
            return;
        }
        this.LIZ.add(new C345700Dgu(charSequence, function1, function12));
    }

    public final void LIZJ(CharSequence charSequence, Function1<? super View, Unit> function1, Function1<? super View, Unit> function12) {
        if (this.LIZ.size() > 1) {
            return;
        }
        this.LIZ.add(new C345700Dgu(charSequence, function1, function12));
    }
}
