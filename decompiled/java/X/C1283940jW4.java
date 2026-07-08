package X;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: renamed from: X.0jW4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283940jW4 {
    public static final int LIZ(float f) {
        return new BigDecimal(f).setScale(0, RoundingMode.HALF_EVEN).intValue();
    }
}
