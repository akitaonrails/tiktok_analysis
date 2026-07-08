package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.063X, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageSharePackage$interceptAsync$1", f = "TakoLongImageSharePackage.kt", l = {126}, m = "invokeSuspend")
public final class C063X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ InterfaceC1369790lkX LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C063X(Context context, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn<? super C063X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = interfaceC1369790lkX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C063X(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Window window;
        View decorView;
        String string;
        C1C7U.LIZ("TakoLongImageSharePackage@f869.interceptAsync$1");
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
                C1C7U.LIZIZ("TakoLongImageSharePackage@f869.interceptAsync$1");
                return objLJFF;
            }
        }
        Activity activityLIZ = C1388190mED.LIZ(this.LLILLJJLI);
        if (activityLIZ != null && (window = activityLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            if (Intrinsics.LJFF(this.LLILLL.key(), "tako_share_download_long_image")) {
                string = this.LLILLJJLI.getString(2131822517);
            } else {
                string = this.LLILLJJLI.getString(2131822542);
            }
            C0DQF.LJ(decorView, string, null, null, false, 28);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoLongImageSharePackage@f869.interceptAsync$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoLongImageSharePackage@f869.interceptAsync$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
