package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O08, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.next.standardized.template.common.action.FcpStandardTaskKt$doCheckAppInstalled$task$1$execute$1$1", f = "FcpStandardTask.kt", l = {}, m = "invokeSuspend")
public final class C0O08 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C705340Rlc LLILLJJLI;
    public final /* synthetic */ C0O09 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O08(boolean z, C705340Rlc c705340Rlc, C0O09 c0o09, InterfaceC1364105Vn<? super C0O08> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c705340Rlc;
        this.LLILLL = c0o09;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O08(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FcpStandardTaskKt@256e.doCheckAppInstalled$task$1$execute$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            this.LLILLJJLI.LIZIZ("render_open_app_template");
        } else {
            this.LLILLJJLI.LIZIZ("render_download_app_template");
        }
        LJ(null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FcpStandardTaskKt@256e.doCheckAppInstalled$task$1$execute$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
