package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0H6H, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H6H extends AppCompatTextView {
    public static final /* synthetic */ int LLJJ = 0;
    public int LLIZLLLIL;
    public int LLJ;
    public float LLJI;
    public Function0<Unit> LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public final GradientDrawable LLJILLL;

    public C0H6H(Context context) {
        int i;
        super(context, null, 0);
        float f = getResources().getDisplayMetrics().density;
        int color = ColorProtector.parseColor("#333333");
        int color2 = ColorProtector.parseColor("#000000");
        this.LLIZLLLIL = color;
        this.LLJ = color2;
        this.LLJI = 18.0f * f;
        this.LLJILJIL = true;
        this.LLJILJILJ = (int) (96 * f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.mutate();
        if (C960203pA.LIZIZ(context)) {
            i = this.LLIZLLLIL;
        } else {
            i = this.LLJ;
        }
        gradientDrawable.setColor(i);
        gradientDrawable.setAlpha(170);
        this.LLJILLL = gradientDrawable;
        setText("");
        setTextColor(-1);
        int i2 = (int) (12 * f);
        int i3 = (int) (8 * f);
        setPadding(i2, i3, i2, i3);
        setBackground(gradientDrawable);
        setClickable(true);
        setFocusable(true);
        setContentDescription("");
        LJJJI(C0H4W.LIZ());
    }

    public final void LJJJI(boolean z) {
        float[] fArr;
        float f = this.LLJI;
        GradientDrawable gradientDrawable = this.LLJILLL;
        if (z) {
            fArr = new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
        } else {
            fArr = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
        }
        gradientDrawable.setCornerRadii(fArr);
        setBackground(this.LLJILLL);
    }
}
