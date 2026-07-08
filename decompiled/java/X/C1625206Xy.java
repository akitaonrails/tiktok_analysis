package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Xy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.utils.TuxAvatarEtxKt$asyncBind$1", f = "TuxAvatarEtx.kt", l = {}, m = "invokeSuspend")
public final class C1625206Xy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C427660Gpo LL;
    public final /* synthetic */ Object LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1625206Xy(C427660Gpo c427660Gpo, Object obj, InterfaceC1364105Vn<? super C1625206Xy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c427660Gpo;
        this.LLILLJJLI = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1625206Xy(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TuxAvatarEtxKt@d53.asyncBind$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C427660Gpo.LJIIJJI(this.LL, this.LLILLJJLI, false, null, null, false, false, null, null, false, null, 1022);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TuxAvatarEtxKt@d53.asyncBind$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
