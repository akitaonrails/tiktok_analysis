package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680360tpS extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1374305Zl LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZ;
    public final /* synthetic */ InterfaceC1680040tow LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1680360tpS(InterfaceC1374305Zl interfaceC1374305Zl, long j, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680040tow interfaceC1680040tow) {
        super(2);
        this.LL = interfaceC1374305Zl;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = interfaceC1685750ty9;
        this.LLILZIL = interfaceC1680040tow;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        int iIntValue = num.intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg2.LJIJJLI(iIntValue & 1, z)) {
            C13ZT.LIZ(C20055113dV.LJIJ.LIZJ(this.LL), C13Z4.LIZJ(1260045569, new C1679870tof(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL), interfaceC1680500tpg2), interfaceC1680500tpg2, 56);
        } else {
            interfaceC1680500tpg2.LIZJ();
        }
        return Unit.LIZ;
    }
}
