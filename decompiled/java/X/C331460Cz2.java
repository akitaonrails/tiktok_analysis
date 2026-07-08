package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.ReviewBottomSheetFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.ReviewBottomSheetFragment$observeViewModel$1$1$1", f = "ReviewBottomSheetFragment.kt", l = {}, m = "invokeSuspend")
public final class C331460Cz2 extends C09AX implements Function2<AbstractC331470Cz3, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ReviewBottomSheetFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331460Cz2(ReviewBottomSheetFragment reviewBottomSheetFragment, InterfaceC1364105Vn<? super C331460Cz2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = reviewBottomSheetFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C331460Cz2 c331460Cz2 = new C331460Cz2(this.LLILLJJLI, interfaceC1364105Vn);
        c331460Cz2.LL = obj;
        return c331460Cz2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReviewBottomSheetFragment@751d.observeViewModel$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC331470Cz3 abstractC331470Cz3 = (AbstractC331470Cz3) this.LL;
        if (!(abstractC331470Cz3 instanceof C331480Cz4)) {
            if (abstractC331470Cz3 instanceof C331520Cz8) {
                this.LLILLJJLI.LLILLL.LLLI(((C331520Cz8) abstractC331470Cz3).LIZ);
            } else if (!(abstractC331470Cz3 instanceof C331490Cz5)) {
                throw new C1954807lC();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReviewBottomSheetFragment@751d.observeViewModel$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC331470Cz3 abstractC331470Cz3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC331470Cz3, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
