package X;

import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollAssemBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hdm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollAssemBase$onHolderSelected$1$1", f = "AutoScrollAssemBase.kt", l = {133}, m = "invokeSuspend")
public final class C445680Hdm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AutoScrollAssemBase LLILLJJLI;
    public final /* synthetic */ C1361400lX0 LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445680Hdm(AutoScrollAssemBase autoScrollAssemBase, C1361400lX0 c1361400lX0, View view, InterfaceC1364105Vn<? super C445680Hdm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = autoScrollAssemBase;
        this.LLILLL = c1361400lX0;
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C445680Hdm(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoScrollAssemBase@cc62.onHolderSelected$1$1");
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
            if (AnonymousClass0958.LIZIZ(1800L, this) == objLJFF) {
                C1C7U.LIZIZ("AutoScrollAssemBase@cc62.onHolderSelected$1$1");
                return objLJFF;
            }
        }
        AutoScrollAssemBase autoScrollAssemBase = this.LLILLJJLI;
        C450720Hlu c450720Hlu = new C450720Hlu(this.LLILLL);
        c450720Hlu.LJIIJ(2131826956);
        EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.START;
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZLLL = enumC1235690iGF;
        c1391600mJi.LIZIZ = this.LLILZ;
        c1391600mJi.LJII = 3000L;
        autoScrollAssemBase.LLLFF = c450720Hlu.LIZIZ();
        AutoScrollAssemBase.LLLIIIIL = true;
        AutoScrollAssemBase autoScrollAssemBase2 = this.LLILLJJLI;
        ((Keva) autoScrollAssemBase2.LLJZ.getValue()).storeInt(autoScrollAssemBase2.LLJLLIL, ((Keva) autoScrollAssemBase2.LLJZ.getValue()).getInt(autoScrollAssemBase2.LLJLLIL, 0) + 1);
        C0P0T c0p0t = this.LLILLJJLI.LLLFF;
        if (c0p0t != null) {
            c0p0t.show();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoScrollAssemBase@cc62.onHolderSelected$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
