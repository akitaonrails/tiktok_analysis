package X;

import android.content.Context;
import android.graphics.Shader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608120rww implements InterfaceC1609020ryO {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final Function2<C1608740rxw, Context, Shader> LIZJ;
    public final Function1<C1608740rxw, Float> LIZLLL;
    public final Function1<C1608740rxw, Float> LJ;
    public final Function1<C1606310ru1, Unit> LJFF;
    public final C1608950ryH LJI;
    public final boolean LJII;
    public final C1608470rxV LJIIIIZZ;
    public final C1557920qdy LJIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1608120rww() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1608120rww)) {
            return false;
        }
        C1608120rww c1608120rww = (C1608120rww) obj;
        return Intrinsics.LJFF(this.LIZ, c1608120rww.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1608120rww.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1608120rww.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1608120rww.LIZLLL) && Intrinsics.LJFF(this.LJ, c1608120rww.LJ) && Intrinsics.LJFF(this.LJFF, c1608120rww.LJFF) && Intrinsics.LJFF(this.LJI, c1608120rww.LJI) && this.LJII == c1608120rww.LJII;
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Function2<C1608740rxw, Context, Shader> function2 = this.LIZJ;
        int iHashCode3 = (((((iHashCode2 + (function2 == null ? 0 : function2.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        Function1<C1606310ru1, Unit> function1 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31;
        C1608950ryH c1608950ryH = this.LJI;
        return ((iHashCode4 + (c1608950ryH != null ? c1608950ryH.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarRingUIData(color=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", attrColorRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", shader=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", diameter=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", strokeWidth=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onStateChange=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", lottieSource=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", shouldDelayDrawRing=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1609020ryO
    public final InterfaceC1609270ryn getPosition() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1609020ryO
    public final C1608470rxV getSize() {
        return this.LJIIIIZZ;
    }

    public /* synthetic */ C1608120rww(Function2 function2, AFwS264S0000000_24 aFwS264S0000000_24, Function1 function1, int i) {
        this(null, null, (i & 4) != 0 ? null : function2, (i & 8) != 0 ? AFwS264S0000000_24.get$arr$(9) : aFwS264S0000000_24, (i & 16) != 0 ? AFwS231S0000000_3.get$arr$(24) : function1, null, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1608120rww(Integer num, Integer num2, Function2<? super C1608740rxw, ? super Context, ? extends Shader> function2, Function1<? super C1608740rxw, Float> function1, Function1<? super C1608740rxw, Float> function12, Function1<? super C1606310ru1, Unit> function13, C1608950ryH c1608950ryH, boolean z) {
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = function2;
        this.LIZLLL = function1;
        this.LJ = function12;
        this.LJFF = function13;
        this.LJI = c1608950ryH;
        this.LJII = z;
        this.LJIIIIZZ = new C1608470rxV(new AwS603S0100000_24(this, 17), new AwS603S0100000_24(this, 18), 4);
        this.LJIIIZ = new C1557920qdy(17, null, 6);
    }
}
