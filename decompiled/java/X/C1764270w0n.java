package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.pendant.tab.TabIndicatorDataVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.pendant.tab.TabIndicatorItemData;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764270w0n extends HorizontalScrollView {
    public TabIndicatorDataVO LL;
    public int LLILLJJLI;
    public C1764700w1U LLILLL;
    public final int LLILZ;
    public final LinearLayout LLILZIL;
    public Function2<? super Integer, ? super TabIndicatorItemData, Unit> LLILZLL;

    public final int getRealChildCount() {
        return this.LLILZIL.getChildCount();
    }

    public final Function2<Integer, TabIndicatorItemData, Unit> getClickStrategy() {
        return this.LLILZLL;
    }

    public C1764270w0n(Context context) {
        super(context, null, 0);
        this.LLILLJJLI = -1;
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
        setBackgroundResource(R.drawable.b2_);
        LinearLayout linearLayout = new LinearLayout(context);
        this.LLILZIL = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, new FrameLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
        setFadingEdgeLength(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        setHorizontalFadingEdgeEnabled(true);
    }

    public final void setClickStrategy(Function2<? super Integer, ? super TabIndicatorItemData, Unit> function2) {
        this.LLILZLL = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTabPosition(int i) {
        C1764700w1U c1764700w1U;
        List<TabIndicatorItemData> list;
        int i2;
        TabIndicatorItemData tabIndicatorItemData;
        int size;
        if (i < 0) {
            return;
        }
        TabIndicatorDataVO tabIndicatorDataVO = this.LL;
        int size2 = 0;
        if (tabIndicatorDataVO != null && (list = tabIndicatorDataVO.tabData) != null) {
            Iterator it2 = C13LP.LLIIL(list).iterator();
            int i3 = 0;
            do {
                C717610SCx c717610SCx = (C717610SCx) it2;
                if (c717610SCx.hasNext()) {
                    IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
                    i2 = indexedValue.LIZ;
                    tabIndicatorItemData = (TabIndicatorItemData) indexedValue.LIZIZ;
                    List<String> list2 = tabIndicatorItemData.items;
                    if (list2 != null) {
                        size = list2.size();
                    } else {
                        size = 0;
                    }
                    i3 += size;
                } else {
                    c1764700w1U = new C1764700w1U(0, 0);
                    break;
                }
            } while (i3 <= i);
            List<String> list3 = tabIndicatorItemData.items;
            if (list3 != null) {
                size2 = list3.size();
            }
            c1764700w1U = new C1764700w1U(i2, (i + size2) - i3);
        } else {
            c1764700w1U = new C1764700w1U(0, 0);
            break;
        }
        if (!Intrinsics.LJFF(c1764700w1U, this.LLILLL)) {
            this.LLILLL = c1764700w1U;
            Iterator it3 = new C1077420e8y(this.LLILZIL, 35).iterator();
            while (true) {
                C1077410e8x c1077410e8x = (C1077410e8x) it3;
                if (c1077410e8x.hasNext()) {
                    View view = (View) c1077410e8x.next();
                    if (view instanceof C1764260w0m) {
                        ((C1764260w0m) view).setSelectIndex(this.LLILLL);
                    }
                } else {
                    C430110Gtl.LIZ(this, new AwS427S0200000_26(this, c1764700w1U, 76));
                    return;
                }
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.LLILZ;
        if (size > i3) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
