package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05vb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1509705vb implements InterfaceC904740ZeS {
    public final List<C869590Y9l> LIZ;
    public final int LIZIZ;
    public final C0Y7P LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1509705vb)) {
            return false;
        }
        C1509705vb c1509705vb = (C1509705vb) obj;
        return Intrinsics.LJFF(this.LIZ, c1509705vb.LIZ) && this.LIZIZ == c1509705vb.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1509705vb.LIZJ);
    }

    @Override // X.InterfaceC904740ZeS
    public final String getName() {
        return "OnGetMessageEvent";
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnGetMessageEvent(list=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msgSource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1509705vb(List<? extends C869590Y9l> list, int i, C0Y7P c0y7p) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = c0y7p;
    }
}
