package X;

import ge.i;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS45S0010000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS83S1000000_33;

/* JADX INFO: renamed from: X.19r5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21668119r5 extends i<InterfaceC374530EmJ, AbstractC1664490tPr<C21667819r2, C21667419qy>, C21667819r2, C21667419qy> implements InterfaceC379610EuV, InterfaceC374530EmJ {
    public static final int LLJJI = 8;
    public final C1DRG LLJILJILJ;
    public final boolean LLJILLL;
    public InterfaceC374650EmV LLJJ;

    @Override // ge.i
    public Function0<AbstractC1664490tPr<C21667819r2, C21667419qy>> E3() {
        return new AwS577S0100000_33(this, 4186);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C21667819r2> o2() {
        return AFwS224S0000000_33.get$arr$(649);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C21667419qy> w2() {
        return new AwS577S0100000_33(this, 4185);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC374530EmJ
    public void LLJJIJIIJIL(boolean z) {
        i3(new AwS45S0010000_33(z, 11));
    }

    @Override // X.InterfaceC374530EmJ
    public void s00(C377060EqO c377060EqO) {
        i3(new AwS612S0100000_33(c377060EqO, 272));
    }

    @Override // X.InterfaceC374530EmJ
    public void setTitle(String str) {
        i3(new AwS83S1000000_33(str, 1));
    }

    @Override // X.InterfaceC374530EmJ
    public void u11(InterfaceC374650EmV interfaceC374650EmV) {
        this.LLJJ = interfaceC374650EmV;
    }

    @Override // X.InterfaceC374530EmJ
    public void DM0(EnumC377110EqT enumC377110EqT, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(T2().LJ);
        linkedHashMap.put(enumC377110EqT, Boolean.valueOf(z));
        i3(new AwS612S0100000_33(linkedHashMap, (Map<EnumC377110EqT, Boolean>) 271));
    }

    @Override // X.InterfaceC374530EmJ
    public void wb0(EnumC377110EqT enumC377110EqT, boolean z) {
        if (enumC377110EqT == EnumC377110EqT.CONFIRM) {
            i3(new AwS45S0010000_33(z, 9));
        } else {
            if (enumC377110EqT != EnumC377110EqT.RESET) {
                return;
            }
            i3(new AwS45S0010000_33(z, 10));
        }
    }

    public C21668119r5(C19A3 c19a3, C1DRG c1drg, boolean z) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = z;
    }
}
