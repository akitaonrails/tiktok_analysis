package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05bB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1383105bB extends C09AY implements Function0<C1382705b7> {
    public final /* synthetic */ EnumC1382405b4 LL;
    public final /* synthetic */ InterfaceC1690500u5o LLILLJJLI;
    public final /* synthetic */ InterfaceC1677030tk5<Float> LLILLL;
    public final /* synthetic */ Function1<EnumC1382405b4, Boolean> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1383105bB(EnumC1382405b4 enumC1382405b4, InterfaceC1690500u5o interfaceC1690500u5o, InterfaceC1677030tk5<Float> interfaceC1677030tk5, Function1<? super EnumC1382405b4, Boolean> function1, boolean z) {
        super(0);
        this.LL = enumC1382405b4;
        this.LLILLJJLI = interfaceC1690500u5o;
        this.LLILLL = interfaceC1677030tk5;
        this.LLILZ = function1;
        this.LLILZIL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1382705b7 invoke() {
        EnumC1382405b4 enumC1382405b4 = this.LL;
        InterfaceC1690500u5o interfaceC1690500u5o = this.LLILLJJLI;
        C1382705b7 c1382705b7 = new C1382705b7(enumC1382405b4, this.LLILLL, this.LLILZIL, this.LLILZ);
        c1382705b7.LIZLLL = interfaceC1690500u5o;
        return c1382705b7;
    }
}
