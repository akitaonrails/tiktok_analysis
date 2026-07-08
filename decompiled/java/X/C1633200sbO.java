package X;

import com.google.gson.Gson;
import java.util.List;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sbO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633200sbO {
    public static final C01GW<Gson> LIZLLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(379));
    public final List<String> LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1633200sbO)) {
            return false;
        }
        C1633200sbO c1633200sbO = (C1633200sbO) obj;
        return Intrinsics.LJFF(this.LIZ, c1633200sbO.LIZ) && this.LIZIZ == c1633200sbO.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1633200sbO.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectStreamSensitiveParams(insertEffects=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", whitelistScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stickerId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1633200sbO(List<String> list, int i, String str) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = str;
    }

    public static C1633200sbO LIZ(C1633200sbO c1633200sbO, List list, int i, int i2) {
        String str;
        if ((i2 & 1) != 0) {
            list = c1633200sbO.LIZ;
        }
        if ((i2 & 2) != 0) {
            i = c1633200sbO.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            str = c1633200sbO.LIZJ;
        } else {
            str = null;
        }
        c1633200sbO.getClass();
        return new C1633200sbO(list, i, str);
    }
}
