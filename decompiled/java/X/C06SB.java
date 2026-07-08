package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06SB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06SB extends C06S9 implements InterfaceC904740ZeS {
    public final C0Y3I LIZ;
    public final C869590Y9l LIZIZ;
    public final Map<String, List<C0YA1>> LIZJ;
    public final Map<String, List<C0YA1>> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06SB)) {
            return false;
        }
        C06SB c06sb = (C06SB) obj;
        return Intrinsics.LJFF(this.LIZ, c06sb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c06sb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c06sb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c06sb.LIZLLL);
    }

    @Override // X.InterfaceC904740ZeS
    public final String getName() {
        return "OnGetModifyPropertyMsgEvent";
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnGetModifyPropertyMsgEvent(tracer=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", oldMessageProperties=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", newMessageProperties=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C06SB(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, ? extends List<? extends C0YA1>> map, Map<String, ? extends List<? extends C0YA1>> map2) {
        this.LIZ = c0y3i;
        this.LIZIZ = c869590Y9l;
        this.LIZJ = map;
        this.LIZLLL = map2;
    }
}
