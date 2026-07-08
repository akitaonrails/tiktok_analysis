package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftRestoreOpt$innerRestore$2$1", f = "DraftRestoreOp.kt", l = {}, m = "invokeSuspend")
public final class C542630LPx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProgressDialogC1399790mWv LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C542630LPx(ProgressDialogC1399790mWv progressDialogC1399790mWv, InterfaceC1364105Vn<? super C542630LPx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = progressDialogC1399790mWv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C542630LPx(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftRestoreOpt@9316.innerRestore$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ProgressDialogC1399790mWv progressDialogC1399790mWv = this.LL;
        int progress = 0;
        if (progressDialogC1399790mWv != null) {
            progressDialogC1399790mWv.setProgress(0);
        }
        ProgressDialogC1399790mWv progressDialogC1399790mWv2 = this.LL;
        if (progressDialogC1399790mWv2 != null) {
            progress = progressDialogC1399790mWv2.getProgress();
        }
        C542610LPv.LIZ = progress;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftRestoreOpt@9316.innerRestore$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
