package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777570wMF implements Serializable {
    public static final int $stable = 0;
    public final String effectIcon;
    public final String effectId;
    public final String effectName;

    public C1777570wMF() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777570wMF)) {
            return false;
        }
        C1777570wMF c1777570wMF = (C1777570wMF) obj;
        return Intrinsics.LJFF(this.effectId, c1777570wMF.effectId) && Intrinsics.LJFF(this.effectName, c1777570wMF.effectName) && Intrinsics.LJFF(this.effectIcon, c1777570wMF.effectIcon);
    }

    public int hashCode() {
        String str = this.effectId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.effectName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.effectIcon;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectGameVideoComponent(effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(", effectName=");
        sbLIZ.append(this.effectName);
        sbLIZ.append(", effectIcon=");
        sbLIZ.append(this.effectIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777570wMF(String str, String str2, String str3) {
        this.effectId = str;
        this.effectName = str2;
        this.effectIcon = str3;
    }
}
