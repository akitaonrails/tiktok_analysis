package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IkK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.skylight.nearby.NearbyController$jumpToNearby$1", f = "NearbyController.kt", l = {45, 55}, m = "invokeSuspend")
public final class C475220IkK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ InterfaceC475140IkC LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C19EG LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ InterfaceC475250IkN LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C475220IkK(Integer num, InterfaceC475140IkC interfaceC475140IkC, String str, C19EG c19eg, boolean z, InterfaceC475250IkN interfaceC475250IkN, InterfaceC1364105Vn<? super C475220IkK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = num;
        this.LLILLL = interfaceC475140IkC;
        this.LLILZ = str;
        this.LLILZIL = c19eg;
        this.LLILZLL = z;
        this.LLIZ = interfaceC475250IkN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C475220IkK(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C475220IkK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
