package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0k1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303490k1b extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1685750ty9 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303490k1b(int i, InterfaceC1685750ty9 interfaceC1685750ty9, String str) {
        super(2);
        this.LL = interfaceC1685750ty9;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        InterfaceC1685750ty9 interfaceC1685750ty9 = this.LL;
        String str = this.LLILLJJLI;
        C1684420tw0.LJIIIZ(C341440Da2.LIZ(this.LLILLL | 1), interfaceC1680500tpg, interfaceC1685750ty9, str);
        return Unit.LIZ;
    }
}
