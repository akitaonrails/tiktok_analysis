package X;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tiktok.compose.scopedviewmodel.ViewModelStoreOwnerViewModel;

/* JADX INFO: renamed from: X.08iL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "tiktok.compose.scopedviewmodel.ViewModelStoreOwnerViewModel$AttachedComposable$2$1", f = "ScopedViewModelExt.kt", l = {257}, m = "invokeSuspend")
public final class C2191908iL extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C2192208iO LLILLL;
    public final /* synthetic */ ViewModelStoreOwnerViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191908iL(C2192208iO c2192208iO, ViewModelStoreOwnerViewModel viewModelStoreOwnerViewModel, InterfaceC1364105Vn<? super C2191908iL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2192208iO;
        this.LLILZ = viewModelStoreOwnerViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2191908iL c2191908iL = new C2191908iL(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2191908iL.LLILLJJLI = ((Boolean) obj).booleanValue();
        return c2191908iL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Lifecycle.State currentState;
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
            if (!this.LLILLJJLI && this.LLILLL.LJI.getValue() != null) {
                Lifecycle lifecycle = (Lifecycle) this.LLILLL.LJI.getValue();
                if (lifecycle != null) {
                    currentState = lifecycle.getCurrentState();
                } else {
                    currentState = null;
                }
                if (currentState == Lifecycle.State.RESUMED) {
                    this.LLILZ.wQ2(this.LLILLL.LIZ);
                    return Unit.LIZ;
                }
                C23123094f c23123094fLJJIZ = C09IC.LJJIZ(this.LLILLL.LJI, new C2196908j9(null));
                C2146408b0 c2146408b0 = new C2146408b0(null);
                this.LL = 1;
                obj = C09IC.LJIJJ(c23123094fLJJIZ, this, c2146408b0);
                if (obj == objLJFF) {
                    return objLJFF;
                }
            } else {
                return Unit.LIZ;
            }
        }
        if (obj == null) {
            return Unit.LIZ;
        }
        this.LLILZ.wQ2(this.LLILLL.LIZ);
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
