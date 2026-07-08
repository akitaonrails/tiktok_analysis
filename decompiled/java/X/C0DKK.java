package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.OneSearchItemViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DKK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.OneSearchItemViewHolder$onFocusChanged$1", f = "OneSearchItemViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C0DKK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ OneSearchItemViewHolder LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DKK(OneSearchItemViewHolder oneSearchItemViewHolder, InterfaceC1364105Vn<? super C0DKK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = oneSearchItemViewHolder;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DKK(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        C1C7U.LIZ("OneSearchItemViewHolder@27d.onFocusChanged$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        RecyclerView recyclerView = (RecyclerView) this.LL.itemView.getParent();
        int top = this.LL.itemView.getTop();
        ViewGroup.LayoutParams layoutParams = this.LL.itemView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        recyclerView.smoothScrollBy(0, top - i);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OneSearchItemViewHolder@27d.onFocusChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
