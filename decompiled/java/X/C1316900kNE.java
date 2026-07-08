package X;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: X.0kNE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1316900kNE {
    public final int LIZ;
    public final int LIZIZ;
    public final Object LIZJ;

    public final void LIZ(SpannableStringBuilder spannableStringBuilder) {
        int i;
        int i2 = this.LIZ;
        if (i2 == 0) {
            i = 18;
        } else {
            i = 34;
        }
        Object obj = this.LIZJ;
        if ((obj instanceof AbstractC1315450kKt) || (obj instanceof C1316760kN0)) {
            i = 33;
        }
        C786410Ut5.q2(spannableStringBuilder, obj, i2, this.LIZIZ, i);
    }

    public C1316900kNE(int i, int i2, Object obj) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = obj;
    }
}
