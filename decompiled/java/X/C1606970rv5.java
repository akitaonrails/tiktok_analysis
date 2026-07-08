package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606970rv5 extends AbstractC1606980rv6 {
    public final InterfaceC1609020ryO LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1606970rv5) && Intrinsics.LJFF(this.LIZIZ, ((C1606970rv5) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarNodeActive(uiData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1606980rv6
    public final InterfaceC1609020ryO LIZ() {
        return this.LIZIZ;
    }

    public C1606970rv5(InterfaceC1609020ryO interfaceC1609020ryO) {
        super(interfaceC1609020ryO);
        this.LIZIZ = interfaceC1609020ryO;
    }
}
