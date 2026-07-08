package X;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01ws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C498401ws extends C09AY implements InterfaceC1631620sYq<List<? extends InterfaceC1381610m3b>, Double, Double, Unit> {
    public final /* synthetic */ InterfaceC1364105Vn<C443120HZe<? extends List<? extends InterfaceC1381610m3b>, Double, Double>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C498401ws(C23260099m c23260099m) {
        super(3);
        this.LL = c23260099m;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(List<? extends InterfaceC1381610m3b> list, Double d, Double d2) {
        double dDoubleValue = d.doubleValue();
        double dDoubleValue2 = d2.doubleValue();
        InterfaceC1364105Vn<C443120HZe<? extends List<? extends InterfaceC1381610m3b>, Double, Double>> interfaceC1364105Vn = this.LL;
        C443120HZe c443120HZe = new C443120HZe(list, Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2));
        C189200o6.m2constructorimpl(c443120HZe);
        interfaceC1364105Vn.resumeWith(c443120HZe);
        return Unit.LIZ;
    }
}
