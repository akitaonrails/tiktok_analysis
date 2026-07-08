package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tkH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677150tkH extends C09AY implements Function1<InterfaceC1690500u5o, C1676820tjk> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ C13LY<Float> LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1677150tkH(float f, C13LY<Float> c13ly, float f2, float f3, int i) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = c13ly;
        this.LLILLL = f2;
        this.LLILZ = f3;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1676820tjk invoke(InterfaceC1690500u5o interfaceC1690500u5o) {
        return new C1676820tjk(C1677100tkC.LJI(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1690500u5o.LJJJJLL(this.LLILZ), this.LLILZIL));
    }
}
