package X;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0jjy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292560jjy implements InterfaceC1292590jk1 {
    public final String LIZ;
    public final List<InterfaceC1292590jk1> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShapeGroup{name='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("' Shapes: ");
        sbLIZ.append(Arrays.toString(this.LIZIZ.toArray()));
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1292560jjy(String str, List<InterfaceC1292590jk1> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }

    @Override // X.InterfaceC1292590jk1
    public final InterfaceC1291780jii LIZ(C1291430ji9 c1291430ji9, AbstractC1292630jk5 abstractC1292630jk5) {
        return new C1292570jjz(c1291430ji9, abstractC1292630jk5, this);
    }
}
