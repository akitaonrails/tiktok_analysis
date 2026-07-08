package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.04E4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04E4 extends C197039127h {
    public Integer LLLIIIL;
    public int LLLIIL;
    public Integer LLLIILIL;

    public final Integer getCustomBgColor() {
        return this.LLLIILIL;
    }

    public final Integer getStyle() {
        return this.LLLIIIL;
    }

    public final int getVariant() {
        return this.LLLIIL;
    }

    @Override // X.C197039127h
    public void setButtonVariant(int i) {
        GradientDrawable gradientDrawable;
        int iLIZ;
        int i2;
        Integer num;
        super.setButtonVariant(i);
        this.LLLIIL = i;
        Drawable background = getBackground();
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            Integer num2 = this.LLLIILIL;
            if (num2 != null) {
                gradientDrawable.setColor(num2.intValue());
                setBackground(gradientDrawable);
                return;
            }
            Context context = getContext();
            Integer num3 = this.LLLIIIL;
            if (num3 != null) {
                iLIZ = num3.intValue();
            } else {
                iLIZ = C04CU.LIZ();
            }
            if (iLIZ == 3) {
                i2 = R.attr.dt;
            } else {
                i2 = R.attr.a04;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(i2, context);
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                if (isEnabled() || ((num = this.LLLIIIL) != null && num.intValue() == 3)) {
                    if (i != 0) {
                        if (i == 4) {
                            gradientDrawable.setStroke(C0H9I.LIZ(1.0f), iIntValue);
                            setTextColor(iIntValue);
                        }
                    } else {
                        gradientDrawable.setColor(iIntValue);
                    }
                    setBackground(gradientDrawable);
                }
            }
        }
    }

    public final void setCustomBgColor(Integer num) {
        this.LLLIILIL = num;
    }

    public final void setStyle(Integer num) {
        setButtonVariant(this.LLLIIL);
        this.LLLIIIL = num;
    }

    public C04E4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        this.LLLIIIL = 1;
    }
}
