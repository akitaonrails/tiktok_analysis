package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0GpO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427400GpO extends CardView {
    public final C427870Gq9 LLIZLLLIL;
    public final TuxTextView LLJ;
    public final TuxTextView LLJI;

    public final Pair<Integer, Integer> LJIIIIZZ() {
        if (getWidth() > 0 && getHeight() > 0) {
            return new Pair<>(Integer.valueOf(getWidth()), Integer.valueOf(getHeight()));
        }
        measure(View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(145)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
        return new Pair<>(Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getMeasuredHeight()));
    }

    public C427400GpO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.e3m, this, true);
        this.LLIZLLLIL = (C427870Gq9) findViewById(R.id.r1j);
        this.LLJ = (TuxTextView) findViewById(R.id.r1l);
        this.LLJI = (TuxTextView) findViewById(R.id.f792r1k);
        findViewById(R.id.r18);
        setCardElevation(C418440Gaw.LIZIZ(2));
        setRadius(200.0f);
    }

    public final void LJIIIZ(String str, String str2, TuxIconDrawable tuxIconDrawable, String str3, TuxIconDrawable tuxIconDrawable2) {
        boolean z;
        if (str == null) {
            str = "";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        c1331670kl3LJIIIZ.LJIIIIZZ = iLIZIZ;
        c1331670kl3LJIIIZ.LJIIIZ = iLIZIZ2;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_map_pin_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a0o);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1m);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c1331670kl3LJIIIZ.LJJIIZI(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(getContext())));
        c1331670kl3LJIIIZ.LJJ(this.LLIZLLLIL);
        c1331670kl3LJIIIZ.LJIIJJI();
        TuxTextView tuxTextView = this.LLJ;
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        } else {
            tuxTextView.setText(str2);
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        TuxTextView tuxTextView2 = this.LLJI;
        if (str3 != null && str3.length() != 0) {
            tuxTextView2.setText(str3);
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
        } else {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        }
        if (tuxIconDrawable != null) {
            tuxIconDrawable.setBounds(0, 0, tuxIconDrawable.LJII, tuxIconDrawable.LJIIIIZZ);
            this.LLJ.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawable, (Drawable) null);
        }
        if (tuxIconDrawable2 != null) {
            tuxIconDrawable2.setBounds(0, 0, tuxIconDrawable2.getIntrinsicWidth(), tuxIconDrawable2.getIntrinsicHeight());
            this.LLJI.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawable2, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }
}
