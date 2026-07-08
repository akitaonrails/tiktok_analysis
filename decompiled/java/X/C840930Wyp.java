package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wyp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840930Wyp {
    public final EnumC841300WzQ LIZ;
    public final List<InterfaceC841560Wzq> LIZIZ;
    public final List<InterfaceC841560Wzq> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C840930Wyp)) {
            return false;
        }
        C840930Wyp c840930Wyp = (C840930Wyp) obj;
        return this.LIZ == c840930Wyp.LIZ && Intrinsics.LJFF(this.LIZIZ, c840930Wyp.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c840930Wyp.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StagePluginPlan(stage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentThreadPlugins=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", deferredPlugins=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C840930Wyp(EnumC841300WzQ enumC841300WzQ, List<? extends InterfaceC841560Wzq> list, List<? extends InterfaceC841560Wzq> list2) {
        this.LIZ = enumC841300WzQ;
        this.LIZIZ = list;
        this.LIZJ = list2;
    }
}
