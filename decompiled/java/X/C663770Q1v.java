package X;

import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecom.data.ProductGroup;
import com.ss.android.ugc.aweme.search.ecommerce.core.ui.ProductCell;
import com.ss.android.ugc.aweme.search.ecommerce.core.ui.ProductSeeAllCell;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q1v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663770Q1v extends ViewOnAttachStateChangeListenerC20604515jv {
    public static final int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public final boolean LLILZ;
    public InterfaceC663810Q1z LLILZIL;
    public InterfaceC663800Q1y LLILZLL;
    public Function0<Unit> LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;

    public final void setData(ProductGroup productGroup) {
        getState().LJFF(null);
        this.LLJ = 0;
        List<Product> list = productGroup.productList;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (Product product : list) {
                if (product.activityInfo != null) {
                    this.LLIZLLLIL = true;
                }
                arrayList.add(new C663780Q1w(product, this.LLILZLL, this.LLILZIL));
            }
            getState().LIZLLL(arrayList, null);
        }
        if (Intrinsics.LJFF(productGroup.hasMore, Boolean.TRUE)) {
            C20600815jK.LIZJ(getState(), new C1276504z5(new AwS554S0100000_10(this, 311)));
        }
    }

    public C663770Q1v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        ProductCell productCell;
        int height;
        int i3 = this.LLJ;
        if (i3 > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            return;
        }
        int iI5 = 0;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(0);
        if (viewHolderFindViewHolderForAdapterPosition == null) {
            viewHolderFindViewHolderForAdapterPosition = findViewHolderForLayoutPosition(0);
        }
        TextView textView = null;
        ViewGroup viewGroup = null;
        if ((viewHolderFindViewHolderForAdapterPosition instanceof ProductCell) && (productCell = (ProductCell) viewHolderFindViewHolderForAdapterPosition) != null) {
            if (this.LLIZLLLIL) {
                SmartImageView smartImageView = productCell.LL;
                if (smartImageView != null) {
                    int height2 = smartImageView.getHeight();
                    SmartImageView smartImageView2 = productCell.LL;
                    if (smartImageView2 == null) {
                        smartImageView2 = null;
                    }
                    int iI52 = height2 + ProductCell.I5(smartImageView2);
                    TextView textView2 = productCell.LLILLJJLI;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    int height3 = textView2.getHeight();
                    TextView textView3 = productCell.LLILLJJLI;
                    if (textView3 == null) {
                        textView3 = null;
                    }
                    int iI53 = height3 + ProductCell.I5(textView3);
                    TextView textView4 = productCell.LLILLL;
                    if (textView4 == null) {
                        textView4 = null;
                    }
                    int height4 = textView4.getHeight();
                    TextView textView5 = productCell.LLILLL;
                    if (textView5 == null) {
                        textView5 = null;
                    }
                    int iI54 = height4 + ProductCell.I5(textView5);
                    ViewGroup viewGroup2 = productCell.LLILZ;
                    if (viewGroup2 == null) {
                        viewGroup2 = null;
                    }
                    int visibility = viewGroup2.getVisibility();
                    ViewGroup viewGroup3 = productCell.LLILZ;
                    if (viewGroup3 == null) {
                        viewGroup3 = null;
                    }
                    if (viewGroup3.getVisibility() != 0) {
                        ViewGroup viewGroup4 = productCell.LLILZ;
                        if (viewGroup4 == null) {
                            viewGroup4 = null;
                        }
                        C661350Pwr.LIZLLL(viewGroup4);
                    }
                    ViewGroup viewGroup5 = productCell.LLILZ;
                    if (viewGroup5 == null) {
                        viewGroup5 = null;
                    }
                    if (viewGroup5.getHeight() <= 0) {
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        ViewGroup viewGroup6 = productCell.LLILZ;
                        if (viewGroup6 == null) {
                            viewGroup6 = null;
                        }
                        viewGroup6.measure(0, iMakeMeasureSpec);
                        ViewGroup viewGroup7 = productCell.LLILZ;
                        if (viewGroup7 == null) {
                            viewGroup7 = null;
                        }
                        height = viewGroup7.getMeasuredHeight();
                    } else {
                        ViewGroup viewGroup8 = productCell.LLILZ;
                        if (viewGroup8 == null) {
                            viewGroup8 = null;
                        }
                        height = viewGroup8.getHeight();
                    }
                    ViewGroup viewGroup9 = productCell.LLILZ;
                    if (viewGroup9 == null) {
                        viewGroup9 = null;
                    }
                    int iI55 = height + ProductCell.I5(viewGroup9);
                    ViewGroup viewGroup10 = productCell.LLILZ;
                    if (viewGroup10 != null) {
                        viewGroup = viewGroup10;
                    }
                    C786410Ut5.LJLZ(visibility, viewGroup);
                    iI5 = iI52 + iI53 + iI55 + iI54;
                }
            } else {
                SmartImageView smartImageView3 = productCell.LL;
                if (smartImageView3 != null) {
                    int height5 = smartImageView3.getHeight();
                    SmartImageView smartImageView4 = productCell.LL;
                    if (smartImageView4 == null) {
                        smartImageView4 = null;
                    }
                    int iI56 = height5 + ProductCell.I5(smartImageView4);
                    TextView textView6 = productCell.LLILLJJLI;
                    if (textView6 == null) {
                        textView6 = null;
                    }
                    int height6 = textView6.getHeight();
                    TextView textView7 = productCell.LLILLJJLI;
                    if (textView7 == null) {
                        textView7 = null;
                    }
                    int iI57 = height6 + ProductCell.I5(textView7);
                    TextView textView8 = productCell.LLILLL;
                    if (textView8 == null) {
                        textView8 = null;
                    }
                    int height7 = textView8.getHeight();
                    TextView textView9 = productCell.LLILLL;
                    if (textView9 != null) {
                        textView = textView9;
                    }
                    iI5 = iI56 + iI57 + height7 + ProductCell.I5(textView);
                }
            }
            int i4 = iI5 + LLJI;
            this.LLJ = i4;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            return;
        }
        super.onMeasure(i, i2);
    }

    public C663770Q1v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipToPadding(false);
        setOrientation(0);
        addItemDecoration(new C0DXR() { // from class: X.0Gin
            public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int iLIZIZ = c21673919s1.LIZIZ() - 1;
                if (childAdapterPosition == 0) {
                    if (C426750GoL.LJ(this.LLILLJJLI)) {
                        rect.left = this.LL;
                        rect.right = 0;
                        return;
                    } else {
                        rect.right = this.LL;
                        rect.left = 0;
                        return;
                    }
                }
                if (childAdapterPosition == iLIZIZ) {
                    if (iLIZIZ < 0) {
                        return;
                    }
                    if (C426750GoL.LJ(this.LLILLJJLI)) {
                        rect.left = 0;
                        rect.right = this.LL;
                        return;
                    } else {
                        rect.right = 0;
                        rect.left = this.LL;
                        return;
                    }
                }
                int i2 = this.LL;
                rect.left = i2;
                rect.right = i2;
            }
        });
        C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(LLJI), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, 16);
        LJIILJJIL(ProductCell.class, ProductSeeAllCell.class);
        AbstractC21673619ry adapter = getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.0Q1x
                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i2, int i3) {
                    C663770Q1v c663770Q1v = this.LIZ;
                    HandlerHook.viewPostDelay(c663770Q1v, new ARunnableS110S0100000_10(c663770Q1v, 39), 300L);
                }
            });
        }
        this.LLILZ = true;
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
