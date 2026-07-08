package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Osn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633350Osn extends C09AY implements Function0<C1690080u58> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ InterfaceC1690390u5d LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C633350Osn(int i, int i2, InterfaceC1690390u5d interfaceC1690390u5d) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = interfaceC1690390u5d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1690080u58 invoke() {
        return new C1690080u58(this.LL, this.LLILLJJLI, this.LLILLL);
    }
}
