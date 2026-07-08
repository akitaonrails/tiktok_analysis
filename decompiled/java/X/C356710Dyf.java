package X;

import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.restore.DraftImageTextTemplateHandler$restoreWithNet$2$1", f = "DraftImageTextTemplateHandler.kt", l = {115}, m = "invokeSuspend")
public final class C356710Dyf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0F4T LLILLJJLI;
    public final /* synthetic */ InterfaceC20236714Gf<List<DraftFileRestoreResult>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C356710Dyf(C0F4T c0f4t, InterfaceC20236714Gf<? super List<DraftFileRestoreResult>> interfaceC20236714Gf, InterfaceC1364105Vn<? super C356710Dyf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0f4t;
        this.LLILLL = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C356710Dyf(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftImageTextTemplateHandler@4c2d.restoreWithNet$2$1");
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
            C0F4T c0f4t = this.LLILLJJLI;
            InterfaceC20236714Gf<List<DraftFileRestoreResult>> interfaceC20236714Gf = this.LLILLL;
            this.LL = 1;
            if (c0f4t.LJIIIIZZ(interfaceC20236714Gf, this) == objLJFF) {
                C1C7U.LIZIZ("DraftImageTextTemplateHandler@4c2d.restoreWithNet$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftImageTextTemplateHandler@4c2d.restoreWithNet$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
