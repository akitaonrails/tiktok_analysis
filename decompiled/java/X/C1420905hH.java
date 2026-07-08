package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.sequences.Sequence;
import njp.a;

/* JADX INFO: renamed from: X.05hH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
public final class C1420905hH extends C09AW implements Function2<AbstractC1421005hI<? super View>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1420905hH(View view, InterfaceC1364105Vn<? super C1420905hH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1420905hH c1420905hH = new C1420905hH(this.LLILZ, interfaceC1364105Vn);
        c1420905hH.LLILLL = obj;
        return c1420905hH;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1421005hI abstractC1421005hI;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    return Unit.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC1421005hI = (AbstractC1421005hI) this.LLILLL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            abstractC1421005hI = (AbstractC1421005hI) this.LLILLL;
            View view = this.LLILZ;
            this.LLILLL = abstractC1421005hI;
            this.LLILLJJLI = 1;
            if (abstractC1421005hI.LIZ(view, this) == objLJFF) {
                return objLJFF;
            }
        }
        View view2 = this.LLILZ;
        if (view2 instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup) view2;
            Sequence<View> sequence = new Sequence<View>() { // from class: X.089r
                @Override // kotlin.sequences.Sequence
                public final Iterator<View> iterator() {
                    return new C20716089q(new C09RD(viewGroup).iterator(), AFwS231S0000000_3.get$arr$(248));
                }
            };
            this.LLILLL = null;
            this.LLILLJJLI = 2;
            abstractC1421005hI.getClass();
            Object objLIZIZ = abstractC1421005hI.LIZIZ(sequence.iterator(), this);
            if (objLIZIZ != C099R.LJFF()) {
                objLIZIZ = Unit.LIZ;
            }
            if (objLIZIZ == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1421005hI<? super View> abstractC1421005hI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1421005hI, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
