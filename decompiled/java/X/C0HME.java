package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HME, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HME extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HME(String str, InterfaceC1685750ty9 interfaceC1685750ty9, float f, int i, int i2) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = f;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1674160tfS.LJ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZ | 1), this.LLILZIL);
        return Unit.LIZ;
    }
}
