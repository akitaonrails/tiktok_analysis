package X;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01RV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01RV extends C09AY implements InterfaceC1631620sYq<List<? extends String>, Integer, String, Unit> {
    public final /* synthetic */ InterfaceC1364105Vn<C443120HZe<? extends List<String>, Integer, String>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01RV(C23260099m c23260099m) {
        super(3);
        this.LL = c23260099m;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(List<? extends String> list, Integer num, String str) {
        int iIntValue = num.intValue();
        InterfaceC1364105Vn<C443120HZe<? extends List<String>, Integer, String>> interfaceC1364105Vn = this.LL;
        C443120HZe c443120HZe = new C443120HZe(list, Integer.valueOf(iIntValue), str);
        C189200o6.m2constructorimpl(c443120HZe);
        interfaceC1364105Vn.resumeWith(c443120HZe);
        return Unit.LIZ;
    }
}
