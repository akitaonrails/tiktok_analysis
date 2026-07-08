package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YJn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyuser.combo.DefaultComboGetMsgByUserUseCase$onPullMsgEndWithError$2", f = "DefaultComboGetMsgByUserUseCase.kt", l = {}, m = "invokeSuspend")
public final class C872210YJn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C872330YJz LL;
    public final /* synthetic */ C872170YJj LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872210YJn(C872330YJz c872330YJz, C872170YJj c872170YJj, int i, InterfaceC1364105Vn<? super C872210YJn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c872330YJz;
        this.LLILLJJLI = c872170YJj;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C872210YJn(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0YK7 c0yk7;
        C1C7U.LIZ("DefaultComboGetMsgByUserUseCase@23a3.onPullMsgEndWithError$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C872330YJz c872330YJz = this.LL;
        boolean z = true;
        if (c872330YJz != null && c872330YJz.LIZIZ == 0) {
            this.LLILLJJLI.LIZIZ.LJIIZILJ().getDomain().LIZ.LJIILLIIL(this.LLILLL, false);
        }
        C868200Y4c c868200Y4c = this.LLILLJJLI.LIZIZ.LJIIZILJ().getDomain().LIZ;
        C872330YJz c872330YJz2 = this.LL;
        if (c872330YJz2 == null || (c0yk7 = c872330YJz2.LJFF) == null || !c0yk7.isSuccess()) {
            z = false;
        }
        c868200Y4c.LJIJJLI(z);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultComboGetMsgByUserUseCase@23a3.onPullMsgEndWithError$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
