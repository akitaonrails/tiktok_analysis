package X;

import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS127S0101000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rxv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608730rxv extends AbstractC1608790ry1<C1256520inq, C1256630io1> {
    public final C1256630io1 LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3091));

    @Override // X.AbstractC1608790ry1
    public final /* bridge */ /* synthetic */ InterfaceC426680GoE LJ() {
        return this.LIZLLL;
    }

    public C1608730rxv(C1256630io1 c1256630io1) {
        this.LIZLLL = c1256630io1;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0rxu] */
    @Override // X.AbstractC1608790ry1
    public final C1608720rxu LIZIZ(InterfaceC1606880ruw interfaceC1606880ruw) {
        C1256520inq c1256520inq = (C1256520inq) interfaceC1606880ruw;
        if (!c1256520inq.LL) {
            return null;
        }
        final C1606970rv5 c1606970rv5 = new C1606970rv5(new C1609250ryl(new C1557920qdy(49, null, 2), new C1608470rxV(AFwS264S0000000_24.get$arr$(672), AFwS264S0000000_24.get$arr$(673), 4), null, AFwS236S0000000_6.get$arr$(466), AFwS264S0000000_24.get$arr$(674), new AwS598S0100000_19(c1256520inq, 693), false, false, null, null, 3980));
        return new InterfaceC1609010ryN(c1606970rv5) { // from class: X.0rxu
            public final AbstractC1606980rv6 LIZ;
            public final EnumC1608710rxt LIZIZ = EnumC1608710rxt.FRAME;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1608720rxu) && Intrinsics.LJFF(this.LIZ, ((C1608720rxu) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AvatarFrameConfig(nodeState=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1609010ryN
            public final AbstractC1606980rv6 LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1609010ryN
            public final EnumC1608710rxt getNodeType() {
                return this.LIZIZ;
            }

            {
                this.LIZ = c1606970rv5;
            }
        };
    }

    @Override // X.AbstractC1608790ry1
    public final C1606990rv7 LIZJ(InterfaceC1606880ruw interfaceC1606880ruw) {
        int i;
        C1256520inq c1256520inq = (C1256520inq) interfaceC1606880ruw;
        if (C1EDI.LIZJ()) {
            i = 40;
        } else {
            i = 32;
        }
        if (!c1256520inq.LLILLJJLI) {
            return null;
        }
        return new C1606990rv7(new C1606970rv5(new C1609250ryl(new C1557920qdy(17, null, 6), new C1608470rxV(AFwS264S0000000_24.get$arr$(675), AFwS264S0000000_24.get$arr$(676), 4), null, AFwS245S0000000_12.get$arr$(198), new AwS127S0101000_19(i, this, 21), null, true, false, null, null, 3852)));
    }
}
