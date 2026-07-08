package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Iu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19733812Iu extends C19518111Xv {
    public int LL;

    public C19733812Iu(Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2;
        float dimension;
        super(context, attributeSet, 0);
        this.LL = context.getResources().getColor(R.color.a0q);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ToolsStyleView);
            z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ToolsStyleView_ts_circle, false);
            dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.ToolsStyleView_ts_round_radius, 0.0f);
            z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ToolsStyleView_ts_top_half_radius, false);
            this.LL = typedArrayObtainStyledAttributes.getColor(R$styleable.ToolsStyleView_ts_background_color, this.LL);
            boolean z3 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ToolsStyleView_ts_enable_background_color, true);
            typedArrayObtainStyledAttributes.recycle();
            if (!z3) {
                return;
            }
        } else {
            z = false;
            z2 = false;
            dimension = 0.0f;
        }
        C1643380sro c1643380sro = new C1643380sro();
        c1643380sro.LIZIZ(this.LL);
        c1643380sro.LJ(this.LL, 0);
        if (z) {
            c1643380sro.LIZLLL(1);
        } else {
            c1643380sro.LIZLLL(0);
            if (z2) {
                c1643380sro.LJI = new float[]{dimension, dimension, dimension, dimension, 0.0f, 0.0f, 0.0f, 0.0f};
            } else {
                c1643380sro.LIZJ(dimension);
            }
        }
        setBackground(c1643380sro.LIZ());
    }
}
