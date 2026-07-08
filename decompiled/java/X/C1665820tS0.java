package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS311S0000000_25;

/* JADX INFO: renamed from: X.0tS0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665820tS0 extends C09AY implements Function1<C0MAE, Unit> {
    public final /* synthetic */ InterfaceC1665500tRU<InterfaceC1627880sSo> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1665820tS0(InterfaceC1665500tRU<? extends InterfaceC1627880sSo> interfaceC1665500tRU, int i, float f, float f2, InterfaceC1685750ty9 interfaceC1685750ty9) {
        super(1);
        this.LL = interfaceC1665500tRU;
        this.LLILLJJLI = i;
        this.LLILLL = f;
        this.LLILZ = f2;
        this.LLILZIL = interfaceC1685750ty9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0MAE c0mae) {
        InterfaceC1665500tRU<InterfaceC1627880sSo> interfaceC1665500tRU = this.LL;
        c0mae.LIZJ(interfaceC1665500tRU.size(), new C020W(AFwS311S0000000_25.get$arr$(81), interfaceC1665500tRU, 102), new C5183020f((List) interfaceC1665500tRU, (List<Function1<Function1<? super Boolean, Unit>, Unit>>) 372), new C19719212De(-1091073711, new C1665830tS1(interfaceC1665500tRU, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL), true));
        return Unit.LIZ;
    }
}
