package X;

import com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L8S, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity$updateProgress$1", f = "NLECutCompressActivity.kt", l = {}, m = "invokeSuspend")
public final class C0L8S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ NLECutCompressActivity LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L8S(NLECutCompressActivity nLECutCompressActivity, int i, InterfaceC1364105Vn<? super C0L8S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nLECutCompressActivity;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L8S(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NLECutCompressActivity@cdc7.updateProgress$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ProgressDialogC1397780mTg progressDialogC1397780mTg = this.LL.LLILZ;
        if (progressDialogC1397780mTg == null) {
            progressDialogC1397780mTg = null;
        }
        progressDialogC1397780mTg.setProgress(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NLECutCompressActivity@cdc7.updateProgress$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
