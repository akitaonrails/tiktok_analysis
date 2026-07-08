package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AFwS329S0000000_4;
import kotlin.jvm.internal.AFwS349S0000000_27;
import kotlin.jvm.internal.AwS676S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yXN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861350yXN {
    public final EnumC1861380yXQ LIZ;
    public final InterfaceC1631620sYq<? super LinearLayoutManager, ? super Context, ? super Integer, Boolean> LIZIZ;
    public final InterfaceC1631620sYq<? super C1861310yXJ, ? super RecyclerView, ? super Integer, Integer> LIZJ;
    public double LIZLLL;
    public final int LJ;
    public boolean LJFF;
    public boolean LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C1861350yXN() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0d, 0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1861350yXN)) {
            return false;
        }
        C1861350yXN c1861350yXN = (C1861350yXN) obj;
        return this.LIZ == c1861350yXN.LIZ && Intrinsics.LJFF(this.LIZIZ, c1861350yXN.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1861350yXN.LIZJ) && Double.compare(this.LIZLLL, c1861350yXN.LIZLLL) == 0 && this.LJ == c1861350yXN.LJ && this.LJFF == c1861350yXN.LJFF && this.LJI == c1861350yXN.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.X2(this.LIZLLL)) * 31) + this.LJ) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocatorConfig(locatorStyle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" xDp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" viewHeight=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(" needDelayScroll=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1861350yXN(EnumC1861380yXQ enumC1861380yXQ, C1860330yVj c1860330yVj, AwS676S0100000_27 awS676S0100000_27, double d, int i, int i2) {
        boolean z;
        int i3 = i;
        InterfaceC1631620sYq interfaceC1631620sYq = awS676S0100000_27;
        InterfaceC1631620sYq interfaceC1631620sYq2 = c1860330yVj;
        double d2 = d;
        EnumC1861380yXQ enumC1861380yXQ2 = (i2 & 1) != 0 ? EnumC1861380yXQ.NORMAL : enumC1861380yXQ;
        interfaceC1631620sYq2 = (i2 & 2) != 0 ? AFwS329S0000000_4.get$arr$(7) : interfaceC1631620sYq2;
        interfaceC1631620sYq = (i2 & 4) != 0 ? AFwS349S0000000_27.get$arr$(2) : interfaceC1631620sYq;
        d2 = (i2 & 8) != 0 ? 0.0d : d2;
        i3 = (i2 & 16) != 0 ? 0 : i3;
        if ((i2 & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(enumC1861380yXQ2, interfaceC1631620sYq2, interfaceC1631620sYq, d2, i3, z, false);
    }

    public C1861350yXN(EnumC1861380yXQ enumC1861380yXQ, InterfaceC1631620sYq<? super LinearLayoutManager, ? super Context, ? super Integer, Boolean> interfaceC1631620sYq, InterfaceC1631620sYq<? super C1861310yXJ, ? super RecyclerView, ? super Integer, Integer> interfaceC1631620sYq2, double d, int i, boolean z, boolean z2) {
        this.LIZ = enumC1861380yXQ;
        this.LIZIZ = interfaceC1631620sYq;
        this.LIZJ = interfaceC1631620sYq2;
        this.LIZLLL = d;
        this.LJ = i;
        this.LJFF = z;
        this.LJI = z2;
    }
}
