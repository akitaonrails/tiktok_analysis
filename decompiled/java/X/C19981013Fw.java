package X;

import Y.AObjectS95S1100000_30;
import java.lang.Enum;
import java.util.Arrays;

/* JADX INFO: renamed from: X.13Fw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19981013Fw<T extends Enum<T>> implements C13HG<T> {
    public final T[] LIZ;
    public final C01GW LIZIZ;

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return (InterfaceC19983313Gt) this.LIZIZ.getValue();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("kotlinx.serialization.internal.EnumSerializer<");
        sbLIZ.append(getDescriptor().LJI());
        sbLIZ.append('>');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        int iLJIILIIL = c13hb.LJIILIIL(getDescriptor());
        if (iLJIILIIL >= 0 && iLJIILIIL < this.LIZ.length) {
            return this.LIZ[iLJIILIIL];
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iLJIILIIL);
        sbLIZ.append(" is not among valid ");
        sbLIZ.append(getDescriptor().LJI());
        sbLIZ.append(" enum values, values size is ");
        sbLIZ.append(this.LIZ.length);
        throw new C19981113Fx(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C19981013Fw(String str, T[] tArr) {
        this.LIZ = tArr;
        this.LIZIZ = C452501pT.LIZIZ(new AObjectS95S1100000_30(this, str, 0));
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        int iLJJIJIIJI = C13LQ.LJJIJIIJI(obj, this.LIZ);
        if (iLJJIJIIJI != -1) {
            c13hd.LJIILJJIL(getDescriptor(), iLJJIJIIJI);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj);
        sbLIZ.append(" is not a valid enum ");
        sbLIZ.append(getDescriptor().LJI());
        sbLIZ.append(", must be one of ");
        sbLIZ.append(Arrays.toString(this.LIZ));
        throw new C19981113Fx(C2188811AlT.LIZIZ(sbLIZ));
    }
}
