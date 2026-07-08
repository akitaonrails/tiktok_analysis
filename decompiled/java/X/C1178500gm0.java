package X;

import X.C1BU1;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.0gm0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178500gm0<T extends C1BU1> implements InterfaceC1177120gjm<T> {
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
        sbLIZ.append("StaticCluster{mCenter=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mItems.size=");
        sbLIZ.append(this.LIZIZ.size());
        sbLIZ.append('}');
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

    public C1178500gm0(C1178490glz c1178490glz) {
        this.LIZIZ = new LinkedHashSet();
        this.LIZ = c1178490glz;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1178500gm0)) {
            return false;
        }
        C1178500gm0 c1178500gm0 = (C1178500gm0) obj;
        if (!c1178500gm0.LIZ.equals(this.LIZ) || !c1178500gm0.LIZIZ.equals(this.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C1178500gm0(C1178490glz c1178490glz, Collection<T> collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.LIZIZ = linkedHashSet;
        this.LIZ = c1178490glz;
        linkedHashSet.addAll(collection);
    }
}
