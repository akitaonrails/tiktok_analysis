package X;

import Y.ARunnableS110S0100000_10;
import Y.ARunnableS79S0200000_10;
import Y.AsS37S0100000_10;
import android.content.Context;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.api.IAppContextManagerService;
import com.ss.android.ugc.aweme.api.IDebugConfig;
import com.ss.android.ugc.aweme.api.ITerminalMonitorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC683510QrV extends AbstractC438050HFr {
    public static final C683550QrZ Companion = new Object() { // from class: X.0QrZ
    };
    public static final String TAG = AbstractC683510QrV.class.getSimpleName();
    public boolean isFooterShowing;
    public String mmLabel;
    public C0P6P mmLoadMoreListener;
    public RecyclerView mmRecyclerView;
    public AbstractC214823195h spanSizeLookup;
    public AbstractC683540QrY spanSizeLookup2;
    public long mmLoadStartTime = -1;
    public final C683500QrU mmLoadMoreState = new C683500QrU();
    public final AbstractC1585810rMx mmOnScrollListener = new AsS37S0100000_10(this, 26);
    public final AbstractC1338480kw2 mmOnFlingListener = new AbstractC1338480kw2() { // from class: X.0QrW
        @Override // X.AbstractC1338480kw2
        public final boolean LIZ(int i, int i2) {
            if (i2 < 0) {
                return false;
            }
            return this.LIZ.isNestedFlingHandled();
        }
    };

    public boolean isNestedFlingStopCompat() {
        return false;
    }

    private final void notifyLoadMoreItemChanged() {
        if (!this.mShowFooter || this.mmRecyclerView == null) {
            return;
        }
        RuntimeException runtimeException = new RuntimeException("Notify when recyclerview scroll or layout");
        RecyclerView recyclerView = this.mmRecyclerView;
        if (recyclerView != null) {
            HandlerHook.viewPost(recyclerView, new ARunnableS79S0200000_10(this, runtimeException, 89));
        }
    }

    public void hideLoadMore() {
        this.mmLoadMoreState.LIZ = 5;
        notifyLoadMoreItemChanged();
    }

    public final boolean isNestedFlingHandled() {
        RecyclerView recyclerView = this.mmRecyclerView;
        return recyclerView != null && isNestedFlingStopCompat() && this.isFooterShowing && !recyclerView.canScrollVertically(1);
    }

    public final void resetLoadMoreState() {
        this.mmLoadMoreState.LIZ = -1;
        notifyLoadMoreItemChanged();
        this.mmLoadStartTime = -1L;
    }

    public final void showFooter() {
        RecyclerView recyclerView = this.mmRecyclerView;
        if (recyclerView == null) {
            setShowFooter(true);
        } else if (recyclerView.isComputingLayout()) {
            HandlerHook.viewPost(recyclerView, new ARunnableS110S0100000_10(this, 182));
        } else {
            setShowFooter(true);
        }
    }

    public void showLoadMoreEmpty() {
        this.mmLoadMoreState.LIZ = 1;
        notifyLoadMoreItemChanged();
    }

    public final void showLoadMoreError() {
        this.mmLoadMoreState.LIZ = 2;
        notifyLoadMoreItemChanged();
    }

    public final void showLoadMoreLoading() {
        this.mmLoadMoreState.LIZ = 0;
        notifyLoadMoreItemChanged();
        if (this.mmLoadStartTime == -1) {
            this.mmLoadStartTime = System.currentTimeMillis();
        }
    }

    public final void showPullUpLoadMore() {
        RecyclerView recyclerView = this.mmRecyclerView;
        if (recyclerView != null) {
            showPullUpLoadMore(recyclerView, true);
        }
    }

    @Override // X.AbstractC438050HFr, X.AbstractC21673619ry
    public int getItemCount() {
        if (getBasicItemCount() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    public final C0P6P getLoadMoreListener() {
        return this.mmLoadMoreListener;
    }

    public final C683500QrU getMmLoadMoreState() {
        return this.mmLoadMoreState;
    }

    public final RecyclerView.ViewHolder createFooterViewHolder(ViewGroup viewGroup) {
        return new C683490QrT(this, viewGroup);
    }

    public void notifyLoadMoreItemChangedReal(Exception exc) {
        RecyclerView recyclerView;
        if (this.mShowFooter && getItemCount() > 0 && (recyclerView = this.mmRecyclerView) != null) {
            IAppContextManagerService iAppContextManagerServiceLIZ = C1948707kD.LIZ();
            if (iAppContextManagerServiceLIZ != null && iAppContextManagerServiceLIZ.isDebug()) {
                notifyItemChanged(getItemCount() - 1);
            } else {
                if (recyclerView.isComputingLayout()) {
                    return;
                }
                notifyItemChanged(getItemCount() - 1);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.mmRecyclerView = recyclerView;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LJIJI(new C689720R3q(this, layoutManager, 1));
        }
        recyclerView.addOnScrollListener(this.mmOnScrollListener);
        if (recyclerView.getOnFlingListener() == null) {
            recyclerView.setOnFlingListener(this.mmOnFlingListener);
        }
    }

    @Override // X.AbstractC438050HFr
    public void onBindFooterViewHolder(RecyclerView.ViewHolder viewHolder) {
        C683490QrT c683490QrT;
        IDebugConfig iDebugConfig = (IDebugConfig) PluggableExtentionKt.pluggableSpi$default(IDebugConfig.class, false, false, false, 14, null);
        if (iDebugConfig != null && iDebugConfig.isOpen()) {
            ((C683490QrT) viewHolder).I5();
        } else {
            if (!(viewHolder instanceof C683490QrT) || (c683490QrT = (C683490QrT) viewHolder) == null) {
                return;
            }
            c683490QrT.I5();
        }
    }

    @Override // X.AbstractC438050HFr
    public RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        return createFooterViewHolder(viewGroup);
    }

    @Override // X.AbstractC21673619ry
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.removeOnScrollListener(this.mmOnScrollListener);
        if (recyclerView.getOnFlingListener() == this.mmOnFlingListener) {
            recyclerView.setOnFlingListener(null);
        }
    }

    @Override // X.AbstractC21673619ry
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        boolean z;
        super.onViewAttachedToWindow(viewHolder);
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof C21681819tI)) {
            C21681819tI c21681819tI = (C21681819tI) layoutParams;
            if (getItemViewType(viewHolder.getLayoutPosition()) == Integer.MIN_VALUE) {
                z = true;
            } else {
                z = false;
            }
            c21681819tI.LLILLJJLI = z;
        }
        if (viewHolder instanceof C683490QrT) {
            this.isFooterShowing = true;
        }
    }

    @Override // X.AbstractC21673619ry
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (this.mmLoadStartTime != -1 && !TextUtils.isEmpty(this.mmLabel)) {
            ITerminalMonitorService iTerminalMonitorService = (ITerminalMonitorService) PluggableExtentionKt.pluggableSpi$default(ITerminalMonitorService.class, false, false, false, 14, null);
            if (iTerminalMonitorService != null) {
                iTerminalMonitorService.LIZJ(this.mmLabel, System.currentTimeMillis() - this.mmLoadStartTime);
            }
            this.mmLoadStartTime = -1L;
        }
        if (viewHolder instanceof C683490QrT) {
            this.isFooterShowing = false;
        }
    }

    public final void setLabel(String str) {
        this.mmLabel = str;
    }

    public final void setLoadEmptyText(int i) {
        String string;
        Context applicationContext;
        IAppContextManagerService iAppContextManagerServiceLIZ = C1948707kD.LIZ();
        if (iAppContextManagerServiceLIZ != null && (applicationContext = iAppContextManagerServiceLIZ.getApplicationContext()) != null) {
            string = applicationContext.getString(i);
        } else {
            string = null;
        }
        setLoadEmptyText(string);
    }

    public final void setLoadEmptyTextColor(Integer num) {
        this.mmLoadMoreState.LIZLLL = num;
        notifyLoadMoreItemChanged();
    }

    public final void setLoadEmptyTextViewMovementMethod(MovementMethod movementMethod) {
        this.mmLoadMoreState.LJ = movementMethod;
        notifyLoadMoreItemChanged();
    }

    public final void setLoadErrorText(int i) {
        String string;
        Context applicationContext;
        IAppContextManagerService iAppContextManagerServiceLIZ = C1948707kD.LIZ();
        if (iAppContextManagerServiceLIZ != null && (applicationContext = iAppContextManagerServiceLIZ.getApplicationContext()) != null) {
            string = applicationContext.getString(i);
        } else {
            string = null;
        }
        setLoadErrorText(string);
    }

    public final void setLoadErrorTextColor(Integer num) {
        this.mmLoadMoreState.LJII = num;
        notifyLoadMoreItemChanged();
    }

    public final void setLoadMoreListener(final Function0<Unit> function0) {
        this.mmLoadMoreListener = new C0P6P() { // from class: X.0QrX
            @Override // X.C0P6P
            public final void LJJIFFI() {
                function0.invoke();
            }
        };
    }

    public final void setSpanSizeLookup(AbstractC214823195h abstractC214823195h) {
        this.spanSizeLookup = abstractC214823195h;
    }

    public final void setSpanSizeLookup2(AbstractC683540QrY abstractC683540QrY) {
        this.spanSizeLookup2 = abstractC683540QrY;
    }

    public final void setLoadEmptyText(CharSequence charSequence) {
        this.mmLoadMoreState.LIZIZ = charSequence;
        notifyLoadMoreItemChanged();
    }

    public final void setLoadErrorText(CharSequence charSequence) {
        this.mmLoadMoreState.LJFF = charSequence;
        notifyLoadMoreItemChanged();
    }

    public void setLoadMoreListener(C0P6P c0p6p) {
        this.mmLoadMoreListener = c0p6p;
    }

    public void showPullUpLoadMore(RecyclerView recyclerView, boolean z) {
        this.mmLoadMoreState.LIZ = 2;
        notifyLoadMoreItemChanged();
        if (z && recyclerView != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(recyclerView);
            c1389890mGx.LJIIIZ(2131836753);
            c1389890mGx.LJIIJJI();
        }
    }
}
