package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.062h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.share.panel.TakoVideoSharePackage$interceptAsync$1", f = "TakoVideoSharePackage.kt", l = {43}, m = "invokeSuspend")
public final class C15429062h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15429062h(Context context, InterfaceC1364105Vn<? super C15429062h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15429062h(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Window window;
        View decorView;
        C1C7U.LIZ("TakoVideoSharePackage@c726.interceptAsync$1");
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
                C1C7U.LIZIZ("TakoVideoSharePackage@c726.interceptAsync$1");
                return objLJFF;
            }
        }
        Activity activityLIZ = C1388190mED.LIZ(this.LLILLJJLI);
        if (activityLIZ != null && (window = activityLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            C0DQF.LJ(decorView, this.LLILLJJLI.getString(2131822543), null, null, false, 28);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoVideoSharePackage@c726.interceptAsync$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoVideoSharePackage@c726.interceptAsync$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
