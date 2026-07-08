package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07su, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2002607su implements InterfaceC0148002o {
    public final String LL;

    public C2002607su() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2002607su) && Intrinsics.LJFF(this.LL, ((C2002607su) obj).LL);
    }

    public final int hashCode() {
        String str = this.LL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoNovelChoiceState(selectingItemId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2002607su(String str) {
        this.LL = str;
    }
}
