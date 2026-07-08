package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZRM, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZRM {
    public static final C0ZRM LIZJ = new C0ZRM(0);
    public final Map<String, String> LIZ;
    public final EnumC901300ZXk LIZIZ;

    public C0ZRM() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZRM)) {
            return false;
        }
        C0ZRM c0zrm = (C0ZRM) obj;
        return Intrinsics.LJFF(this.LIZ, c0zrm.LIZ) && this.LIZIZ == c0zrm.LIZIZ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        EnumC901300ZXk enumC901300ZXk = this.LIZIZ;
        return iHashCode + (enumC901300ZXk == null ? 0 : enumC901300ZXk.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageLongPressContext(etParams=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0ZRM(int i) {
        this(C2097608Jq.LJ(), null);
    }

    public C0ZRM(Map<String, String> map, EnumC901300ZXk enumC901300ZXk) {
        this.LIZ = map;
        this.LIZIZ = enumC901300ZXk;
    }
}
