package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0M4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562460M4e extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C0M22 LL;
    public final /* synthetic */ List<C0M0P> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ InterfaceC1631630sYr<String, String, InterfaceC1680500tpg, Integer, Unit> LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C562460M4e(C0M22 c0m22, List<C0M0P> list, int i, long j, int i2, float f, InterfaceC1631630sYr<? super String, ? super String, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr, int i3) {
        super(2);
        this.LL = c0m22;
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = j;
        this.LLILZIL = i2;
        this.LLILZLL = f;
        this.LLIZ = interfaceC1631630sYr;
        this.LLIZLLLIL = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1666890tTj.LIZLLL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1));
        return Unit.LIZ;
    }
}
