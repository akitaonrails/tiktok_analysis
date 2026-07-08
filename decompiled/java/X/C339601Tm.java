package X;

import android.view.View;
import android.view.ViewConfiguration;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Tm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercebase.utils.LifecycleKt$onClick$1$1", f = "Lifecycle.kt", l = {59, 60}, m = "invokeSuspend")
public final class C339601Tm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> LLILZIL;
    public final /* synthetic */ View LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C339601Tm(int i, View view, InterfaceC1631620sYq<? super InterfaceC497601wk, ? super View, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, View view2, InterfaceC1364105Vn<? super C339601Tm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = view;
        this.LLILZIL = interfaceC1631620sYq;
        this.LLILZLL = view2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C339601Tm c339601Tm = new C339601Tm(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c339601Tm.LLILLJJLI = obj;
        return c339601Tm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C09AE c09aeLIZLLL;
        C1C7U.LIZ("LifecycleKt@70c8.onClick$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILZ.setEnabled(true);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LifecycleKt@70c8.onClick$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c09aeLIZLLL = (C09AE) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            c09aeLIZLLL = C23250099c.LIZLLL((InterfaceC497601wk) this.LLILLJJLI, null, null, new C339501Tl(this.LLILZIL, this.LLILZLL, null), 3);
            long jMax = Math.max(ViewConfiguration.getDoubleTapTimeout(), this.LLILLL);
            this.LLILLJJLI = c09aeLIZLLL;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jMax, this) == objLJFF) {
                C1C7U.LIZIZ("LifecycleKt@70c8.onClick$1$1");
                return objLJFF;
            }
        }
        if (this.LLILLL <= 0) {
            this.LLILLJJLI = null;
            this.LL = 2;
            if (c09aeLIZLLL.LJJZ(this) == objLJFF) {
                C1C7U.LIZIZ("LifecycleKt@70c8.onClick$1$1");
                return objLJFF;
            }
        }
        this.LLILZ.setEnabled(true);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LifecycleKt@70c8.onClick$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
