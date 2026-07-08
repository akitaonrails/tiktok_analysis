package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import eha.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vWL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.RegionSearchInputHelper$onBind$3$5$3", f = "RegionSearchInputHelper.kt", l = {223}, m = "invokeSuspend")
public final class C1745390vWL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ c LLILLJJLI;
    public final /* synthetic */ C1745300vWC LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745390vWL(c cVar, C1745300vWC c1745300vWC, InterfaceC1364105Vn<? super C1745390vWL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cVar;
        this.LLILLL = c1745300vWC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1745390vWL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        RecyclerView recyclerView;
        int top;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1C7U.LIZ("RegionSearchInputHelper@c1cf.onBind$3$5$3");
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
            KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LLILLJJLI.LLILLJJLI.LLJLILLLLZIIL;
            if (keyBoardVisibilityUtil != null && !keyBoardVisibilityUtil.LLILZ) {
                C1745300vWC c1745300vWC = this.LLILLL;
                this.LL = 1;
                if (C0H1U.LJ(c1745300vWC, this, true) == objLJFF) {
                    C1C7U.LIZIZ("RegionSearchInputHelper@c1cf.onBind$3$5$3");
                    return objLJFF;
                }
            }
        }
        ViewParent parent = this.LLILLJJLI.LL.getParent();
        if ((parent instanceof RecyclerView) && (recyclerView = (RecyclerView) parent) != null) {
            c cVar = this.LLILLJJLI;
            int iIndexOfChild = recyclerView.indexOfChild(cVar.LL);
            if (iIndexOfChild >= 1 && cVar.LLILLL.XR2().size() > iIndexOfChild) {
                int i2 = iIndexOfChild - 1;
                if (Intrinsics.LJFF(((C1745680vWo) ListProtector.get(cVar.LLILLL.XR2(), i2)).LIZ.key, "districts")) {
                    iIndexOfChild = i2;
                }
            }
            View childAt = recyclerView.getChildAt(iIndexOfChild);
            if (childAt != null) {
                top = childAt.getTop();
                if (top > 0) {
                    ViewGroup viewGroup = (ViewGroup) cVar.LL.getParent();
                    int childCount = viewGroup.getChildCount();
                    int height = 0;
                    for (int i3 = iIndexOfChild; i3 < childCount; i3++) {
                        View childAt2 = viewGroup.getChildAt(i3);
                        if (childAt2 != null) {
                            height += childAt2.getHeight();
                            ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                if (i3 > iIndexOfChild) {
                                    height += marginLayoutParams.topMargin;
                                }
                                height += marginLayoutParams.bottomMargin;
                            }
                            if (height >= viewGroup.getHeight()) {
                                break;
                            }
                        }
                    }
                    if (height < recyclerView.getHeight()) {
                        cVar.LLILLJJLI.uS(recyclerView.getHeight() - height);
                    }
                }
            } else {
                top = 0;
            }
            recyclerView.smoothScrollBy(0, top);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RegionSearchInputHelper@c1cf.onBind$3$5$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
