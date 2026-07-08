package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SearchInputItemViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SearchInputItemViewHolder$onFocusChanged$1", f = "SearchInputItemViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C434070H0j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchInputItemViewHolder LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C434070H0j(SearchInputItemViewHolder searchInputItemViewHolder, InterfaceC1364105Vn<? super C434070H0j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchInputItemViewHolder;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C434070H0j(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1C7U.LIZ("SearchInputItemViewHolder@f064.onFocusChanged$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        RecyclerView recyclerView = (RecyclerView) this.LL.itemView.getParent();
        int iIndexOfChild = recyclerView.indexOfChild(this.LL.itemView);
        int top = this.LL.itemView.getTop();
        if (top > 0 && iIndexOfChild > 0) {
            ViewGroup viewGroup = (ViewGroup) this.LL.itemView.getParent();
            int childCount = viewGroup.getChildCount();
            int height = 0;
            for (int i = iIndexOfChild; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    height += childAt.getHeight();
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        if (i > iIndexOfChild) {
                            height += marginLayoutParams.topMargin;
                        }
                        height += marginLayoutParams.bottomMargin;
                    }
                }
                if (height >= viewGroup.getHeight()) {
                    break;
                }
            }
            if (height < recyclerView.getHeight()) {
                this.LL.LLJILJILJ.uS(recyclerView.getHeight() - height);
            }
        }
        recyclerView.smoothScrollBy(0, top);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchInputItemViewHolder@f064.onFocusChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
