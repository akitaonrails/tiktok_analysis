package X;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0ito, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260220ito extends AbstractC1262510ixV {
    @Override // X.AbstractC1262510ixV
    public final int LIZIZ(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1260220ito(AwS563S0100000_19 awS563S0100000_19, EnumC1260230itp enumC1260230itp, int i) {
        EnumC1070410dxf[] enumC1070410dxfArr;
        EnumC1260230itp enumC1260230itp2 = enumC1260230itp;
        Function0 function0 = awS563S0100000_19;
        if ((i & 1) != 0) {
            enumC1070410dxfArr = AbstractC1262510ixV.LJI;
        } else {
            enumC1070410dxfArr = null;
        }
        super((EnumC1070410dxf[]) Arrays.copyOf(enumC1070410dxfArr, enumC1070410dxfArr.length), false, false, false, (i & 2) != 0 ? AFwS207S0000000_19.get$arr$(696) : function0, (i & 4) != 0 ? EnumC1260230itp.DEFAULT : enumC1260230itp2, 14);
    }
}
