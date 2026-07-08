package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0X8T, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.CommerceAttributionHandler$sendExposureLog$1", f = "CommerceAttributionHandler.kt", l = {}, m = "invokeSuspend")
public final class C0X8T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C843920X8s LLILLJJLI;
    public final /* synthetic */ C0X8U LLILLL;
    public final /* synthetic */ C843940X8u LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0X8T(String str, C843920X8s c843920X8s, C0X8U c0x8u, C843940X8u c843940X8u, InterfaceC1364105Vn<? super C0X8T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c843920X8s;
        this.LLILLL = c0x8u;
        this.LLILZ = c843940X8u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0X8T(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ce  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X8T.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
