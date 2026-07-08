package X;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Zd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1883107Zd {
    public static final C1883107Zd LIZJ = new C1883107Zd(C08CX.INSTANCE, C2097608Jq.LJ());
    public final Set<EnumC1355300lNA> LIZ;
    public final Map<EnumC1355290lN9, EnumC1355300lNA> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1883107Zd)) {
            return false;
        }
        C1883107Zd c1883107Zd = (C1883107Zd) obj;
        return Intrinsics.LJFF(this.LIZ, c1883107Zd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1883107Zd.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessSnapshot(registeredDomains=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", capabilityOwners=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1883107Zd(Set<? extends EnumC1355300lNA> set, Map<EnumC1355290lN9, ? extends EnumC1355300lNA> map) {
        this.LIZ = set;
        this.LIZIZ = map;
    }
}
