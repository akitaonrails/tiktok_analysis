package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Och, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623370Och extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C1690080u58 LL;
    public final /* synthetic */ InterfaceC1664360tPe<C1147640fyE> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C623370Och(C1690080u58 c1690080u58, InterfaceC1664360tPe<C1147640fyE> interfaceC1664360tPe) {
        super(0);
        this.LL = c1690080u58;
        this.LLILLJJLI = interfaceC1664360tPe;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C06XG c06xg = (C06XG) C13LP.LJJLIIIJL(this.LL.LJIIIZ().LJII());
        return Boolean.valueOf((c06xg != null ? c06xg.getIndex() : -1) >= C1697810uHb.LJIIJ(this.LLILLJJLI) + (-3));
    }
}
