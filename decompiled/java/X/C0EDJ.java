package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EDJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.components.base.resourceview.ResourceListView$fetchResourceList$1$2$1", f = "ResourceListView.kt", l = {379}, m = "invokeSuspend")
public final class C0EDJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0EDF LLILLJJLI;
    public final /* synthetic */ C0ED8 LLILLL;
    public final /* synthetic */ Function2<List<? extends ResourceItem>, Boolean, Object> LLILZ;
    public final /* synthetic */ Function2<C0EDV, Boolean, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0EDJ(C0EDF c0edf, C0ED8 c0ed8, Function2<? super List<? extends ResourceItem>, ? super Boolean, ? extends Object> function2, Function2<? super C0EDV, ? super Boolean, Unit> function22, InterfaceC1364105Vn<? super C0EDJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0edf;
        this.LLILLL = c0ed8;
        this.LLILZ = function2;
        this.LLILZIL = function22;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0EDJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objXu2;
        Exception exc;
        C1C7U.LIZ("ResourceListView@eb87.fetchResourceList$1$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objXu2 = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC361290EEl interfaceC361290EEl = this.LLILLJJLI.LLJJ;
            if (interfaceC361290EEl != null) {
                String str = this.LLILLL.LIZJ;
                this.LL = 1;
                objXu2 = interfaceC361290EEl.Xu2(str, this);
                if (objXu2 == objLJFF) {
                    C1C7U.LIZIZ("ResourceListView@eb87.fetchResourceList$1$2$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ResourceListView@eb87.fetchResourceList$1$2$1");
            return unit;
        }
        Function2<List<? extends ResourceItem>, Boolean, Object> function2 = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(objXu2)) {
            function2.invoke((List<? extends ResourceItem>) objXu2, false);
        }
        Function2<C0EDV, Boolean, Unit> function22 = this.LLILZIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objXu2);
        if (thM5exceptionOrNullimpl != null) {
            if (thM5exceptionOrNullimpl instanceof Exception) {
                exc = (Exception) thM5exceptionOrNullimpl;
            } else {
                exc = null;
            }
            function22.invoke(new C0EDV(exc, -1), false);
        }
        C189200o6.m1boximpl(objXu2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ResourceListView@eb87.fetchResourceList$1$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
