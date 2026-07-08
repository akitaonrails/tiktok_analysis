package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LPm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftRestoreOpt$showLoadingAndRestore$2$deffer$2", f = "DraftRestoreOp.kt", l = {160}, m = "invokeSuspend")
public final class C542520LPm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0LBJ>, Object> {
    public int LL;
    public final /* synthetic */ C542550LPp LLILLJJLI;
    public final /* synthetic */ ProgressDialogC1399790mWv LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C542520LPm(C542550LPp c542550LPp, ProgressDialogC1399790mWv progressDialogC1399790mWv, String str, InterfaceC1364105Vn<? super C542520LPm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c542550LPp;
        this.LLILLL = progressDialogC1399790mWv;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C542520LPm(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftRestoreOpt@9316.showLoadingAndRestore$2$deffer$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C542550LPp c542550LPp = this.LLILLJJLI;
            ProgressDialogC1399790mWv progressDialogC1399790mWv = this.LLILLL;
            String str = this.LLILZ;
            this.LL = 1;
            obj = C542610LPv.LIZ(c542550LPp, null, progressDialogC1399790mWv, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DraftRestoreOpt@9316.showLoadingAndRestore$2$deffer$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DraftRestoreOpt@9316.showLoadingAndRestore$2$deffer$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LBJ> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
