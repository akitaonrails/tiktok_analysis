package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.tako.share.panel.TakoSharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.063N, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoServiceImpl$shareLocalMediaToDM$2$1", f = "TakoServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C063N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<DialogC1389620mGW> LL;
    public final /* synthetic */ TakoSharePackage LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C063N(C259800zU<DialogC1389620mGW> c259800zU, TakoSharePackage takoSharePackage, Activity activity, Context context, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C063N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = takoSharePackage;
        this.LLILLL = activity;
        this.LLILZ = context;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C063N(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        Window window;
        View decorView;
        C1C7U.LIZ("TakoServiceImpl@d56d.shareLocalMediaToDM$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DialogC1389620mGW dialogC1389620mGW = this.LL.element;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        if (this.LLILLJJLI.isVideoMedia) {
            i = 2131822543;
        } else {
            i = 2131822542;
        }
        Activity activity = this.LLILLL;
        Unit unit = null;
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            C0DQF.LJ(decorView, this.LLILZ.getString(i), null, null, false, 28);
        }
        Function1<Boolean, Unit> function1 = this.LLILZIL;
        if (function1 != null) {
            function1.invoke(false);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("TakoServiceImpl@d56d.shareLocalMediaToDM$2$1");
        return unit;
    }
}
