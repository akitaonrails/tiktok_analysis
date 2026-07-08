package X;

import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftRestoreOpt$innerRestore$2$6", f = "DraftRestoreOp.kt", l = {}, m = "invokeSuspend")
public final class C542590LPt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CreativeLoadingDialog LL;
    public final /* synthetic */ ProgressDialogC1399790mWv LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C542590LPt(CreativeLoadingDialog creativeLoadingDialog, ProgressDialogC1399790mWv progressDialogC1399790mWv, InterfaceC1364105Vn<? super C542590LPt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = creativeLoadingDialog;
        this.LLILLJJLI = progressDialogC1399790mWv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C542590LPt(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftRestoreOpt@9316.innerRestore$2$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CreativeLoadingDialog creativeLoadingDialog = this.LL;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.dismiss();
        }
        ProgressDialogC1399790mWv progressDialogC1399790mWv = this.LLILLJJLI;
        if (progressDialogC1399790mWv != null) {
            progressDialogC1399790mWv.dismiss();
            C785410UrT.LIZ(progressDialogC1399790mWv);
        }
        C542610LPv.LIZIZ(C0MVY.DISMISS);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftRestoreOpt@9316.innerRestore$2$6");
        return unit;
    }
}
