package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19PJ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19PJ extends C19PH {
    public int LJI;
    public int LJII;
    public boolean LJIIIIZZ;

    @Override // X.C19PH
    public final void LIZ() {
        if (this.LJI == 0) {
            if (this.LIZIZ > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.LIZJ.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public C19PJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.c53, R.style.a51);
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context, attributeSet, R$styleable.LinearProgressIndicator, R.attr.c53, R.style.a51, new int[0]);
        this.LJI = typedArrayLIZLLL.getInt(R$styleable.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.LJII = typedArrayLIZLLL.getInt(R$styleable.LinearProgressIndicator_indicatorDirectionLinear, 0);
        typedArrayLIZLLL.recycle();
        LIZ();
        this.LJIIIIZZ = this.LJII == 1;
    }
}
