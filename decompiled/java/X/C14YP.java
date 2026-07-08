package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.14YP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14YP extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C2025207wY LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14YP(C2025207wY c2025207wY, String str, boolean z, boolean z2, int i) {
        super(2);
        this.LL = c2025207wY;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C14YO.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1));
        return Unit.LIZ;
    }
}
