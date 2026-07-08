package X;

import android.graphics.Color;
import kotlin.Pair;

/* JADX INFO: renamed from: X.00Gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C050800Gk {
    public final String LIZ;
    public final String LIZIZ;

    public final Pair<Integer, Integer> LIZ(boolean z) {
        Integer numLJFF = C202500qF.LJFF(this.LIZ);
        if (numLJFF != null) {
            int iIntValue = numLJFF.intValue();
            Integer numLJFF2 = C202500qF.LJFF(this.LIZIZ);
            if (numLJFF2 != null) {
                int iIntValue2 = numLJFF2.intValue();
                if (z) {
                    iIntValue2 = Color.argb(77, (16711680 & iIntValue2) >> 16, (65280 & iIntValue2) >> 8, iIntValue2 & 255);
                }
                return new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
            }
            return null;
        }
        return null;
    }

    public C050800Gk(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
