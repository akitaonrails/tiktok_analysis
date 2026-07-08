package X;

import android.graphics.Rect;

/* JADX INFO: renamed from: X.1AiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186861AiK extends AbstractC2186971AiV {
    @Override // X.AbstractC2186971AiV
    public final float LIZ(C2186841AiI c2186841AiI, C2186841AiI c2186841AiI2) {
        if (c2186841AiI.LL > 0 && c2186841AiI.LLILLJJLI > 0) {
            C2186841AiI c2186841AiILIZJ = c2186841AiI.LIZJ(c2186841AiI2);
            float fPow = (c2186841AiILIZJ.LL * 1.0f) / c2186841AiI.LL;
            if (fPow > 1.0f) {
                fPow = (float) Math.pow(1.0f / fPow, 1.1d);
            }
            float f = ((c2186841AiILIZJ.LL * 1.0f) / c2186841AiI2.LL) + ((c2186841AiILIZJ.LLILLJJLI * 1.0f) / c2186841AiI2.LLILLJJLI);
            return fPow * ((1.0f / f) / f);
        }
        return 0.0f;
    }

    @Override // X.AbstractC2186971AiV
    public final Rect LIZIZ(C2186841AiI c2186841AiI, C2186841AiI c2186841AiI2) {
        C2186841AiI c2186841AiILIZJ = c2186841AiI.LIZJ(c2186841AiI2);
        int i = (c2186841AiILIZJ.LL - c2186841AiI2.LL) / 2;
        int i2 = (c2186841AiILIZJ.LLILLJJLI - c2186841AiI2.LLILLJJLI) / 2;
        return new Rect(-i, -i2, c2186841AiILIZJ.LL - i, c2186841AiILIZJ.LLILLJJLI - i2);
    }
}
