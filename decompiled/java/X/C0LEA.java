package X;

import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LEA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity$onPlayerCompileProgress$1", f = "NewCutPlayerActivity.kt", l = {}, m = "invokeSuspend")
public final class C0LEA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ NewCutPlayerActivity LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LEA(NewCutPlayerActivity newCutPlayerActivity, float f, InterfaceC1364105Vn<? super C0LEA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = newCutPlayerActivity;
        this.LLILLJJLI = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LEA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NewCutPlayerActivity@18cb.onPlayerCompileProgress$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ProgressDialogC1397780mTg progressDialogC1397780mTg = this.LL.LLJLL;
        if (progressDialogC1397780mTg != null) {
            progressDialogC1397780mTg.setProgress((int) (this.LLILLJJLI * 100));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewCutPlayerActivity@18cb.onPlayerCompileProgress$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
