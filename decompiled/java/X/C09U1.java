package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09U1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.common.platform_misc.UDPSocketPlatformMisc$send$1", f = "UDPSocketPlatformMisc.kt", l = {}, m = "invokeSuspend")
public final class C09U1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C09U3 LL;
    public final /* synthetic */ C09U5 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09U1(C09U3 c09u3, C09U5 c09u5, int i, String str, int i2, String str2, String str3, int i3, int i4, boolean z, InterfaceC1364105Vn<? super C09U1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c09u3;
        this.LLILLJJLI = c09u5;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = i2;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = i3;
        this.LLJ = i4;
        this.LLJI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09U1(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UDPSocketPlatformMisc@e2cc.send$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UDPSocketPlatformMisc@e2cc.send$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
