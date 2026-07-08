package X;

import com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialFakeGeneratingUISlotAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LjD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialFakeGeneratingUISlotAssem$observeGeneratingTaskState$1$1", f = "AITheaterSocialFakeGeneratingCardProtocol.kt", l = {418, 435, 442, 445, 460}, m = "invokeSuspend")
public final class C550970LjD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AITheaterSocialFakeGeneratingUISlotAssem LLILLL;
    public final /* synthetic */ C0MXN LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C550970LjD(C0MXN c0mxn, AITheaterSocialFakeGeneratingUISlotAssem aITheaterSocialFakeGeneratingUISlotAssem, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aITheaterSocialFakeGeneratingUISlotAssem;
        this.LLILZ = c0mxn;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C550970LjD c550970LjD = new C550970LjD(this.LLILZ, this.LLILLL, this.LLILZIL, interfaceC1364105Vn);
        c550970LjD.LLILLJJLI = obj;
        return c550970LjD;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C550970LjD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
