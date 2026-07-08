package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12Ii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.beauty.impl.view.InternalBeautyListView$updateExclusiveData$1", f = "InternalBeautyListView.kt", l = {600}, m = "invokeSuspend")
public final class C19732612Ii extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C19732312If LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19732612Ii(C19732312If c19732312If, InterfaceC1364105Vn<? super C19732612Ii> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c19732312If;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19732612Ii c19732612Ii = new C19732612Ii(this.LLILLL, interfaceC1364105Vn);
        c19732612Ii.LLILLJJLI = obj;
        return c19732612Ii;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InternalBeautyListView@e93.updateExclusiveData$1");
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
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, C0PEM.LIZJ, null, new C19732512Ih(this.LLILLL, null), 2);
            this.LL = 1;
            if (c099gLIZIZ.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("InternalBeautyListView@e93.updateExclusiveData$1");
                return objLJFF;
            }
        }
        C19732312If c19732312If = this.LLILLL;
        if (c19732312If.LJIILL) {
            c19732312If.LJIJI.notifyDataSetChanged();
        } else {
            c19732312If.LJIJ.notifyDataSetChanged();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InternalBeautyListView@e93.updateExclusiveData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
