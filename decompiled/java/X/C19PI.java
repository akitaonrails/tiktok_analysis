package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19PI, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19PI extends C19PH {
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;

    @Override // X.C19PH
    public final void LIZ() {
        if (this.LJI >= this.LIZ * 2) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The indicatorSize (");
        sbLIZ.append(this.LJI);
        sbLIZ.append(" px) cannot be less than twice of the trackThickness (");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" px).");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C19PI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f534bha, R.style.a4p);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.aa7);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.aa2);
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context, attributeSet, R$styleable.CircularProgressIndicator, R.attr.f534bha, R.style.a4p, new int[0]);
        this.LJI = C19RN.LIZJ(context, typedArrayLIZLLL, R$styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize);
        this.LJII = C19RN.LIZJ(context, typedArrayLIZLLL, R$styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.LJIIIIZZ = typedArrayLIZLLL.getInt(R$styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        typedArrayLIZLLL.recycle();
        LIZ();
    }
}
