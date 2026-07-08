package X;

import android.content.Context;
import android.widget.Toast;
import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LxU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity$onPlayerCompileError$1", f = "NewCutPlayerActivity.kt", l = {}, m = "invokeSuspend")
public final class C559820LxU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ NewCutPlayerActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C559820LxU(NewCutPlayerActivity newCutPlayerActivity, InterfaceC1364105Vn<? super C559820LxU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = newCutPlayerActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C559820LxU(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NewCutPlayerActivity@18cb.onPlayerCompileError$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context applicationContext = this.LL.getApplicationContext();
        if (C2409809cO.LIZIZ && applicationContext == null) {
            applicationContext = C2409809cO.LIZ;
        }
        C786410Ut5.re(Toast.makeText(applicationContext, "Compile Error", 0));
        ProgressDialogC1397780mTg progressDialogC1397780mTg = this.LL.LLJLL;
        if (progressDialogC1397780mTg != null) {
            progressDialogC1397780mTg.dismiss();
            C785410UrT.LIZ(progressDialogC1397780mTg);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewCutPlayerActivity@18cb.onPlayerCompileError$1");
        return unit;
    }
}
