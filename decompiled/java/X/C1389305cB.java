package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05cB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1389305cB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1678560tmY LL;
    public final /* synthetic */ InterfaceC1690500u5o LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1389305cB(C1678560tmY c1678560tmY, InterfaceC1690500u5o interfaceC1690500u5o, float f) {
        super(0);
        this.LL = c1678560tmY;
        this.LLILLJJLI = interfaceC1690500u5o;
        this.LLILLL = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZIZ = this.LLILLJJLI;
        this.LL.LIZ.LJIIIIZZ(C2097608Jq.LJIIIIZZ(new Pair(EnumC1678550tmX.Closed, Float.valueOf(this.LLILLL)), new Pair(EnumC1678550tmX.Open, Float.valueOf(0.0f))), null);
        return Unit.LIZ;
    }
}
