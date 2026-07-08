package X;

import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LE9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity$onPlayerCompileSuccess$1", f = "NewCutPlayerActivity.kt", l = {}, m = "invokeSuspend")
public final class C0LE9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ NewCutPlayerActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LE9(NewCutPlayerActivity newCutPlayerActivity, InterfaceC1364105Vn<? super C0LE9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = newCutPlayerActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LE9(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NewCutPlayerActivity@18cb.onPlayerCompileSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ProgressDialogC1397780mTg progressDialogC1397780mTg = this.LL.LLJLL;
        if (progressDialogC1397780mTg != null) {
            progressDialogC1397780mTg.dismiss();
            C785410UrT.LIZ(progressDialogC1397780mTg);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewCutPlayerActivity@18cb.onPlayerCompileSuccess$1");
        return unit;
    }
}
