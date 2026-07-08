package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0itq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260240itq extends AbstractC1262510ixV {
    /* JADX WARN: Illegal instructions before constructor call */
    public C1260240itq(EnumC1260230itp enumC1260230itp, int i) {
        EnumC1070410dxf[] enumC1070410dxfArr;
        boolean z;
        EnumC1260230itp enumC1260230itp2 = enumC1260230itp;
        if ((i & 1) != 0) {
            enumC1070410dxfArr = AbstractC1262510ixV.LJI;
        } else {
            enumC1070410dxfArr = null;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        super((EnumC1070410dxf[]) Arrays.copyOf(enumC1070410dxfArr, enumC1070410dxfArr.length), false, z, false, null, (i & 8) != 0 ? EnumC1260230itp.DEFAULT : enumC1260230itp2, 18);
    }
}
