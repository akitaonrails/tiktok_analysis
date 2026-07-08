package X;

import Y.AsS57S0100000_32;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.style.CombinedSkuExpandableFlowLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.style.CombinedSkuGridLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.view.OspExpandableSpecCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.view.OspImageSpecCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.view.OspImageWithTextSpecCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.view.OspTextSpecCell;
import com.ss.android.ugc.aweme.ecommerce.core.utils.ScrollTopLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.188r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212363188r extends ConstraintLayout implements C1A0V {
    public final C21714919yd LL;
    public InterfaceC813403Fs LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public List<C041T> LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;

    private final int getDataSize() {
        List<C041T> list = this.LLILZIL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final CombinedSkuGridLayoutManager getLayoutManager() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv != null ? viewOnAttachStateChangeListenerC20604515jv.getLayoutManager() : null;
        if (layoutManager instanceof CombinedSkuGridLayoutManager) {
            return (CombinedSkuGridLayoutManager) layoutManager;
        }
        return null;
    }

    public final LinearLayoutManager getLinearLayoutManager() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv != null ? viewOnAttachStateChangeListenerC20604515jv.getLayoutManager() : null;
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    public final boolean getNeedScrollBar() {
        RecyclerView.LayoutManager layoutManager;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv2 == null || (layoutManager = viewOnAttachStateChangeListenerC20604515jv2.getLayoutManager()) == null) {
            return false;
        }
        if (layoutManager instanceof CombinedSkuGridLayoutManager) {
            return !((CombinedSkuGridLayoutManager) layoutManager).LLJI;
        }
        if (!(layoutManager instanceof LinearLayoutManager) || (viewOnAttachStateChangeListenerC20604515jv = this.LLJ) == null) {
            return false;
        }
        return viewOnAttachStateChangeListenerC20604515jv.canScrollHorizontally(1) || viewOnAttachStateChangeListenerC20604515jv.canScrollHorizontally(-1);
    }

    public final Boolean getViewAllFromLayoutManager() {
        CombinedSkuExpandableFlowLayoutManager combinedSkuExpandableFlowLayoutManager;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv != null ? viewOnAttachStateChangeListenerC20604515jv.getLayoutManager() : null;
        if (!(layoutManager instanceof CombinedSkuExpandableFlowLayoutManager) || (combinedSkuExpandableFlowLayoutManager = (CombinedSkuExpandableFlowLayoutManager) layoutManager) == null) {
            return null;
        }
        return Boolean.valueOf(combinedSkuExpandableFlowLayoutManager.LLILLJJLI);
    }

    public final void h0() {
        LinearLayoutManager linearLayoutManager;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3;
        View childAt;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJ;
        Integer numValueOf = null;
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv4 != null ? viewOnAttachStateChangeListenerC20604515jv4.getLayoutManager() : null;
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (getDataSize() <= Math.abs(iFindFirstVisibleItemPosition - iFindLastVisibleItemPosition) || (viewOnAttachStateChangeListenerC20604515jv = this.LLJ) == null || viewOnAttachStateChangeListenerC20604515jv.getChildCount() <= 0) {
            return;
        }
        if (this.LLILLL != -1) {
            int i = (iFindFirstVisibleItemPosition + iFindLastVisibleItemPosition) / 2;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv5 != null && (childAt = viewOnAttachStateChangeListenerC20604515jv5.getChildAt(0)) != null) {
                numValueOf = Integer.valueOf(childAt.getWidth());
            }
            int i2 = C426750GoL.LIZLLL(getContext()) ? -1 : 1;
            int i3 = this.LLILLL;
            if (i3 == i) {
                return;
            }
            if (i3 <= i || ((viewOnAttachStateChangeListenerC20604515jv3 = this.LLJ) != null && viewOnAttachStateChangeListenerC20604515jv3.canScrollHorizontally(i2))) {
                if (this.LLILLL >= i || ((viewOnAttachStateChangeListenerC20604515jv2 = this.LLJ) != null && viewOnAttachStateChangeListenerC20604515jv2.canScrollHorizontally(-i2))) {
                    int iAbs = (int) ((((double) Math.abs(this.LLILLL - i)) + 0.5d) * ((double) (numValueOf != null ? numValueOf.intValue() : 0)));
                    if (this.LLILLL <= i) {
                        i2 = -i2;
                    }
                    int i4 = iAbs * i2;
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LLJ;
                    if (viewOnAttachStateChangeListenerC20604515jv6 != null) {
                        viewOnAttachStateChangeListenerC20604515jv6.smoothScrollBy(i4, 0);
                    }
                }
            }
        }
    }

    public final ViewOnAttachStateChangeListenerC20604515jv getSpecList() {
        return this.LLJ;
    }

    public final void e0(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        float f;
        if (getNeedScrollBar() && recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if ((layoutManager instanceof CombinedSkuGridLayoutManager) || (layoutManager instanceof LinearLayoutManager)) {
                C420270Gdt c420270Gdt = (C420270Gdt) findViewById(R.id.vt8);
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
                if (recyclerView.computeHorizontalScrollRange() > 0) {
                    f = iComputeHorizontalScrollOffset / (r0 - iComputeHorizontalScrollExtent);
                } else {
                    f = 0.0f;
                }
                c420270Gdt.setProgress(f);
            }
        }
    }

    public final void setClickListener(InterfaceC813403Fs interfaceC813403Fs) {
        this.LLILLJJLI = interfaceC813403Fs;
    }

    public final void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof LinearLayoutManager) {
            C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), findViewById(R.id.vt8));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(layoutManager);
        }
    }

    public final void setSpecList(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LLJ = viewOnAttachStateChangeListenerC20604515jv;
    }

    public final void setTextLayoutMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C426160GnO c426160GnO = (C426160GnO) findViewById(R.id.vt6);
        ViewGroup.LayoutParams layoutParams = c426160GnO.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(i);
            }
        } else {
            marginLayoutParams = null;
        }
        C786410Ut5.a7(c426160GnO, marginLayoutParams);
    }

    public C212363188r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.C1A0V
    public final void LJJIFFI(int i, Object obj) {
        C041T c041t;
        InterfaceC813403Fs interfaceC813403Fs = this.LLILLJJLI;
        if (interfaceC813403Fs != null) {
            int i2 = this.LLILZLL;
            List<C041T> list = this.LLILZIL;
            if (list != null) {
                c041t = (C041T) C13LP.LJJJLZIJ(i, list);
            } else {
                c041t = null;
            }
            interfaceC813403Fs.LLJJL(i2, i, c041t);
        }
    }

    @Override // X.C1A0V
    public final void LJJLIIIJ(int i, RecyclerView.ViewHolder viewHolder) {
        C041T c041t;
        InterfaceC813403Fs interfaceC813403Fs = this.LLILLJJLI;
        if (interfaceC813403Fs != null) {
            View view = viewHolder.itemView;
            int i2 = this.LLILZLL;
            List<C041T> list = this.LLILZIL;
            if (list != null) {
                c041t = (C041T) C13LP.LJJJLZIJ(i, list);
            } else {
                c041t = null;
            }
            interfaceC813403Fs.b0(view, i2, i, c041t);
        }
    }

    public C212363188r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new C21714919yd();
        this.LLILLL = -1;
        this.LLILZ = -2;
        this.LLILZLL = -1;
        this.LLIZ = -1;
        C03XA.LIZ.getClass();
        C03XA.LIZJ(context, R.layout.apw, this, true);
        this.LLJ = (ViewOnAttachStateChangeListenerC20604515jv) findViewById(R.id.vt1);
        TextView textView = (TextView) findViewById(R.id.vt5);
        C420270Gdt c420270Gdt = (C420270Gdt) findViewById(R.id.vt8);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(OspTextSpecCell.class, OspImageSpecCell.class, OspImageWithTextSpecCell.class, OspExpandableSpecCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setItemAnimator(null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            ScrollTopLinearLayoutManager scrollTopLinearLayoutManager = new ScrollTopLinearLayoutManager(context);
            scrollTopLinearLayoutManager.setOrientation(0);
            viewOnAttachStateChangeListenerC20604515jv3.setLayoutManager(scrollTopLinearLayoutManager);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            viewOnAttachStateChangeListenerC20604515jv4.addOnScrollListener(new AsS57S0100000_32(this, 1));
        }
        C786410Ut5.LJLLLLLL(8, c420270Gdt);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJ;
        if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
            viewOnAttachStateChangeListenerC20604515jv5.addOnLayoutChangeListener(new C19LU(c420270Gdt, this, 0));
        }
        int iLIZLLL = (int) (((double) C958103op.LIZLLL()) * 0.5d);
        if (iLIZLLL > 0) {
            textView.setMaxWidth(iLIZLLL);
        }
    }
}
