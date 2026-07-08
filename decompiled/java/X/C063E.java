package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.063E, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.share.panel.TakoBatchMessageSharePackage$interceptAsync$1", f = "TakoBatchMessageSharePackage.kt", l = {97}, m = "invokeSuspend")
public final class C063E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DialogC1389620mGW LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C063E(DialogC1389620mGW dialogC1389620mGW, View view, Activity activity, Context context, InterfaceC1364105Vn<? super C063E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dialogC1389620mGW;
        this.LLILLL = view;
        this.LLILZ = activity;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C063E(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activity;
        Window window;
        C1C7U.LIZ("TakoBatchMessageSharePackage@398c.interceptAsync$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("TakoBatchMessageSharePackage@398c.interceptAsync$1");
                return objLJFF;
            }
        }
        DialogC1389620mGW dialogC1389620mGW = this.LLILLJJLI;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        View decorView = this.LLILLL;
        if (decorView == null && ((activity = this.LLILZ) == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoBatchMessageSharePackage@398c.interceptAsync$1");
            return unit;
        }
        C0DQF.LJ(decorView, this.LLILZIL.getString(2131829222), null, null, true, 12);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoBatchMessageSharePackage@398c.interceptAsync$1");
        return unit2;
    }
}
