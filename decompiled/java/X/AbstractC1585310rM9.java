package X;

import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rM9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1585310rM9 {
    public C1585230rM1 LIZ;

    public abstract Pair<Boolean, EnumC1585290rM7> LIZ();

    public abstract List<String> LIZIZ(boolean z);

    public abstract EnumC1585100rLo LIZLLL();

    public final C1585230rM1 LIZJ() {
        C1585230rM1 c1585230rM1 = this.LIZ;
        if (c1585230rM1 != null) {
            return c1585230rM1;
        }
        return null;
    }

    public final String toString() {
        String strLJI = C13LE.LIZ(getClass()).LJI();
        return strLJI == null ? "TabOperator" : strLJI;
    }
}
