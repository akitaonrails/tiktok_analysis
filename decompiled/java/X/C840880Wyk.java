package X;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840880Wyk {
    public final List<InterfaceC841560Wzq> LIZ;
    public final Set<EnumC841380WzY> LIZIZ;
    public final Set<EnumC841390WzZ> LIZJ;
    public final C840930Wyp LIZLLL;
    public final C840930Wyp LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C840880Wyk)) {
            return false;
        }
        C840880Wyk c840880Wyk = (C840880Wyk) obj;
        return Intrinsics.LJFF(this.LIZ, c840880Wyk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c840880Wyk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c840880Wyk.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c840880Wyk.LIZLLL) && Intrinsics.LJFF(this.LJ, c840880Wyk.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileAssemblyPlan(enabledPlugins=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enabledAdapters=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enabledBridges=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", beforeCallPlan=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", afterCallPlan=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C840880Wyk(List<? extends InterfaceC841560Wzq> list, Set<? extends EnumC841380WzY> set, Set<? extends EnumC841390WzZ> set2, C840930Wyp c840930Wyp, C840930Wyp c840930Wyp2) {
        this.LIZ = list;
        this.LIZIZ = set;
        this.LIZJ = set2;
        this.LIZLLL = c840930Wyp;
        this.LJ = c840930Wyp2;
    }
}
