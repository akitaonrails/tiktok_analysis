package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftFileRestoreHandlers$restore$2$setProgress$2", f = "IDraftFileRestoreHandler.kt", l = {}, m = "invokeSuspend")
public final class C366740EZk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C0LQ2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C366740EZk(C118300cf c118300cf, int i, C0LQ2 c0lq2, InterfaceC1364105Vn<? super C366740EZk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c118300cf;
        this.LLILLJJLI = i;
        this.LLILLL = c0lq2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C366740EZk(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftFileRestoreHandlers@aee8.restore$2$setProgress$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C118300cf c118300cf = this.LL;
        int i = c118300cf.element + this.LLILLJJLI;
        c118300cf.element = i;
        C542610LPv.LIZ = i;
        ProgressDialogC1399790mWv progressDialogC1399790mWv = this.LLILLL.LIZ.LIZJ;
        if (progressDialogC1399790mWv != null) {
            progressDialogC1399790mWv.setProgress(i);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftFileRestoreHandlers@aee8.restore$2$setProgress$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
