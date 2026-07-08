package X;

import X.C1BU1;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0glE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178020glE<T extends C1BU1> implements InterfaceC1177120gjm<T> {
    public final C1178490glz LIZ;
    public final Collection<T> LIZIZ;

    @Override // X.InterfaceC1177120gjm
    public final int getSize() {
        return this.LIZIZ.size();
    }

    public final int hashCode() {
        return this.LIZ.hashCode() + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CopyCluster, list=");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1177120gjm
    public final Collection<T> getItems() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1177120gjm
    public final C1178490glz getPosition() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof InterfaceC1177120gjm)) {
            return false;
        }
        InterfaceC1177120gjm interfaceC1177120gjm = (InterfaceC1177120gjm) obj;
        if (!Intrinsics.LJFF(interfaceC1177120gjm.getPosition(), this.LIZ) || !Intrinsics.LJFF(interfaceC1177120gjm.getItems(), this.LIZIZ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1178020glE(C1178490glz c1178490glz, Collection<? extends T> collection) {
        this.LIZ = c1178490glz;
        this.LIZIZ = collection;
    }
}
