package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1746006sc implements InterfaceC904740ZeS {
    public final List<C869590Y9l> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1746006sc) && Intrinsics.LJFF(this.LIZ, ((C1746006sc) obj).LIZ);
    }

    @Override // X.InterfaceC904740ZeS
    public final String getName() {
        return "OnResolveMsgGapEvent";
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnResolveMsgGapEvent(list=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1746006sc(List<? extends C869590Y9l> list) {
        this.LIZ = list;
    }
}
