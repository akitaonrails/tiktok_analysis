package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12Iw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19734012Iw {
    public static final void LIZJ(TextView textView) {
        Typeface typefaceLIZ = C19736612Jw.LIZ(C12MF.MEDIUM.getFONT_NAME());
        if (typefaceLIZ != null) {
            textView.setTypeface(typefaceLIZ);
        } else {
            textView.setTypeface(textView.getTypeface(), 1);
        }
    }

    public static final Drawable LIZLLL(Drawable drawable, int i) {
        if (drawable == null) {
            return drawable;
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        return drawableMutate;
    }

    public static final void LIZ(TextView textView, AttributeSet attributeSet, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        if (attributeSet != null) {
            if (z) {
                TypedArray typedArrayObtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, R$styleable.AVFontConfig);
                i = typedArrayObtainStyledAttributes.getInt(R$styleable.AVFontConfig_avFontType, Integer.MIN_VALUE);
                typedArrayObtainStyledAttributes.recycle();
            } else {
                TypedArray typedArrayObtainStyledAttributes2 = textView.getContext().obtainStyledAttributes(attributeSet, R$styleable.ToolsStyleView);
                i = typedArrayObtainStyledAttributes2.getInt(R$styleable.ToolsStyleView_ts_font_type, Integer.MIN_VALUE);
                typedArrayObtainStyledAttributes2.recycle();
            }
        } else {
            i = Integer.MIN_VALUE;
        }
        Typeface typefaceLIZ = null;
        if (i != Integer.MIN_VALUE) {
            C19736612Jw c19736612Jw = C19736612Jw.LIZ;
            c19736612Jw.getClass();
            InterfaceC1609810rzf interfaceC1609810rzf = (InterfaceC1609810rzf) C19736612Jw.LIZJ.getValue(c19736612Jw, C19736612Jw.LIZIZ[0]);
            if (interfaceC1609810rzf != null) {
                typefaceLIZ = interfaceC1609810rzf.LIZ(i);
            }
        } else {
            C19736612Jw c19736612Jw2 = C19736612Jw.LIZ;
            c19736612Jw2.getClass();
            Function0 function0 = (Function0) C19736612Jw.LIZLLL.getValue(c19736612Jw2, C19736612Jw.LIZIZ[1]);
            if (function0 != null) {
                typefaceLIZ = (Typeface) function0.invoke();
            }
        }
        if (attributeSet != null) {
            if (z) {
                TypedArray typedArrayObtainStyledAttributes3 = textView.getContext().obtainStyledAttributes(attributeSet, R$styleable.AVFontConfig);
                z2 = typedArrayObtainStyledAttributes3.getBoolean(R$styleable.AVFontConfig_avForceIncludeFontPadding, false);
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = textView.getContext().obtainStyledAttributes(attributeSet, R$styleable.AVFontConfig);
                z3 = typedArrayObtainStyledAttributes4.getBoolean(R$styleable.AVFontConfig_avForceExcludeFontPadding, false);
                typedArrayObtainStyledAttributes4.recycle();
            } else {
                TypedArray typedArrayObtainStyledAttributes5 = textView.getContext().obtainStyledAttributes(attributeSet, R$styleable.ToolsStyleView);
                z2 = typedArrayObtainStyledAttributes5.getBoolean(R$styleable.ToolsStyleView_ts_force_include_font_padding, false);
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = textView.getContext().obtainStyledAttributes(attributeSet, R$styleable.ToolsStyleView);
                z3 = typedArrayObtainStyledAttributes6.getBoolean(R$styleable.ToolsStyleView_ts_force_exclude_font_padding, false);
                typedArrayObtainStyledAttributes6.recycle();
            }
            if (typefaceLIZ != null) {
                if (z2) {
                    textView.setIncludeFontPadding(true);
                }
            } else {
                if (z3) {
                    return;
                }
                textView.setIncludeFontPadding(true);
                return;
            }
        } else if (typefaceLIZ == null) {
            return;
        }
        textView.setTypeface(typefaceLIZ);
    }

    public static final GradientDrawable LIZIZ(Context context, AttributeSet attributeSet, boolean z) {
        float dimension;
        boolean z2;
        boolean z3;
        if (context == null) {
            return null;
        }
        int color = context.getResources().getColor(R.color.a0q);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ToolsStyleView);
            z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ToolsStyleView_ts_circle, false);
            dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.ToolsStyleView_ts_round_radius, 0.0f);
            z3 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ToolsStyleView_ts_top_half_radius, false);
            color = typedArrayObtainStyledAttributes.getColor(R$styleable.ToolsStyleView_ts_background_color, color);
            z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ToolsStyleView_ts_enable_background_color, z);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            dimension = 0.0f;
            z2 = false;
            z3 = false;
        }
        if (!z) {
            return null;
        }
        C1643380sro c1643380sro = new C1643380sro();
        c1643380sro.LIZIZ(color);
        c1643380sro.LJ(color, 0);
        if (z2) {
            c1643380sro.LIZLLL(1);
        } else {
            c1643380sro.LIZLLL(0);
            if (z3) {
                c1643380sro.LJI = new float[]{dimension, dimension, dimension, dimension, 0.0f, 0.0f, 0.0f, 0.0f};
            } else {
                c1643380sro.LIZJ(dimension);
            }
        }
        return c1643380sro.LIZ();
    }
}
