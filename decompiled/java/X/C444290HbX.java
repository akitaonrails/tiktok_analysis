package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HbX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444290HbX extends C444280HbW {
    @Override // X.C444280HbW
    public int getDotIndicatorBackground() {
        return R.drawable.cgg;
    }

    @Override // X.C444280HbW
    public float getDotIndicatorBackgroundAlpha() {
        return 0.32f;
    }

    @Override // X.C444280HbW
    public int getDotIndicatorSelectedBackground() {
        return R.drawable.cgf;
    }

    @Override // X.C444280HbW
    public final void LJIIIIZZ() {
        int iLIZ = (int) C11VU.LIZ(16.0f);
        int iLIZ2 = (int) C11VU.LIZ(66.0f);
        setPadding(iLIZ2, 0, iLIZ2, iLIZ);
    }

    public C444290HbX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
