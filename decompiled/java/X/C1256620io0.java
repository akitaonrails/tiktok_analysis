package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0io0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1256620io0 implements InterfaceC1608860ry8<C1257180iou> {
    public final C1257180iou LIZ;
    public final Function1<InterfaceC1606880ruw, InterfaceC1606880ruw> LIZIZ;
    public final EnumC1607270rvZ LIZJ;

    public C1256620io0() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1256620io0)) {
            return false;
        }
        C1256620io0 c1256620io0 = (C1256620io0) obj;
        return Intrinsics.LJFF(this.LIZ, c1256620io0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1256620io0.LIZIZ);
    }

    public final int hashCode() {
        C1257180iou c1257180iou = this.LIZ;
        int iHashCode = (c1257180iou == null ? 0 : c1257180iou.hashCode()) * 31;
        Function1<InterfaceC1606880ruw, InterfaceC1606880ruw> function1 = this.LIZIZ;
        return iHashCode + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarLiveData(variant=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stateInterceptor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1608860ry8
    public final EnumC1607270rvZ LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1608860ry8
    public final /* bridge */ /* synthetic */ InterfaceC426680GoE getVariant() {
        return this.LIZ;
    }

    public C1256620io0(C1257180iou c1257180iou, int i) {
        this.LIZ = (i & 1) != 0 ? null : c1257180iou;
        this.LIZIZ = null;
        this.LIZJ = EnumC1607270rvZ.LIVE;
    }
}
