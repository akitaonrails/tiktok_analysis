package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682060tsC extends C09AY implements Function1<InterfaceC1679550to9, Unit> {
    public final /* synthetic */ InterfaceC1690500u5o LL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLJJLI;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLL;
    public final /* synthetic */ float LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1682060tsC(InterfaceC1690500u5o interfaceC1690500u5o, C1677480tko<Float, C1677280tkU> c1677480tko, C1677480tko<Float, C1677280tkU> c1677480tko2, float f) {
        super(1);
        this.LL = interfaceC1690500u5o;
        this.LLILLJJLI = c1677480tko;
        this.LLILLL = c1677480tko2;
        this.LLILZ = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1679550to9 interfaceC1679550to9) {
        InterfaceC1679550to9 interfaceC1679550to92 = interfaceC1679550to9;
        InterfaceC1690500u5o interfaceC1690500u5o = this.LL;
        C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLL;
        interfaceC1679550to92.LJII(interfaceC1690500u5o.LJJJJLL(c1677480tko.LIZLLL().floatValue()) * this.LLILZ);
        interfaceC1679550to92.LJFF(this.LLILLJJLI.LIZLLL().floatValue());
        return Unit.LIZ;
    }
}
