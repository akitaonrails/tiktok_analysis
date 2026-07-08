package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01tV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C477501tV extends C16F5 {
    public C477501tV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void LJJJJI(int i, long j) {
        int i2;
        String strLJFF = C1850730yGF.LJFF(j);
        String strJ4 = C786410Ut5.j4(C497740JfY.LJIJI(i), Arrays.copyOf(new Object[]{strLJFF}, 1));
        int iLJJJ = a0.LJJJ(strJ4, strLJFF, 0, false, 6);
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(R.attr.f02, typedValue, true)) {
            i2 = typedValue.data;
        } else {
            i2 = -16776961;
        }
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(null, 0, (int) C497740JfY.LJJIFFI(13.0f), ColorStateList.valueOf(i2), null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strJ4);
        TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(getContext(), R.raw.icon_color_polygon_circle);
        int iLJJIFFI = (int) C497740JfY.LJJIFFI(12.0f);
        tuxIconDrawable.setBounds(0, 0, iLJJIFFI, iLJJIFFI);
        ImageSpan imageSpan = new ImageSpan(tuxIconDrawable, 2);
        spannableStringBuilder.insert(iLJJJ, (CharSequence) " ");
        int i3 = iLJJJ + 1;
        C786410Ut5.q2(spannableStringBuilder, imageSpan, iLJJJ, i3, 33);
        C786410Ut5.q2(spannableStringBuilder, textAppearanceSpan, i3, strLJFF.length() + iLJJJ + 1, 34);
        C1119920fFW.LJIIIIZZ(spannableStringBuilder, i3, iLJJJ + strLJFF.length() + 1, 34, 500);
        setText(spannableStringBuilder);
    }
}
