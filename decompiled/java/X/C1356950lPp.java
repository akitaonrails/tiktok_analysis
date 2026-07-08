package X;

import Y.ARunnableS121S0100000_21;
import Y.AfS190S0100000_21;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356950lPp extends ViewOnAttachStateChangeListenerC20604515jv {
    public static final int LLJLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public static final int LLJLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
    public static final int LLJLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
    public static final int LLJZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(256));
    public static final int LLJZIJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    public static final int LLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
    public C11LS LLILZ;
    public AbstractC1356940lPo LLILZIL;
    public final View LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final Set<String> LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final long LLJJ;
    public int LLJJI;
    public final int LLJJIII;
    public int LLJJIJI;
    public List<? extends InterfaceC1891350zJl> LLJJIJIIJIL;
    public C366620EYy LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public C0SQ1 LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;

    public final void LJJIIZI() {
        ReactionBubbleDescriptionCell reactionBubbleDescriptionCell;
        C0SQ1 c0sq1;
        Set<String> set;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(1);
        if (!(viewHolderFindViewHolderForAdapterPosition instanceof ReactionBubbleDescriptionCell) || (reactionBubbleDescriptionCell = (ReactionBubbleDescriptionCell) viewHolderFindViewHolderForAdapterPosition) == null) {
            return;
        }
        C0SQ2 c0sq2 = reactionBubbleDescriptionCell.LLJILJIL;
        if (c0sq2 != null) {
            c0sq2.LL.LIZ();
        }
        C720890SPn c720890SPn = reactionBubbleDescriptionCell.LLJILJILJ;
        if (c720890SPn == null || (c0sq1 = c720890SPn.LLILZIL) == null || (set = c0sq1.LJI) == null) {
            return;
        }
        set.clear();
    }

    public final void LJJIJ() {
        this.LLJJL = false;
        this.LLJJLIIIJLLLLLLLZ = 0;
        LJJI(getScrollHeaderHeight());
    }

    public final void LJJIJL() {
        View view;
        View view2;
        int measuredHeight = 0;
        RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = findViewHolderForLayoutPosition(0);
        RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition2 = findViewHolderForLayoutPosition(1);
        if (viewHolderFindViewHolderForLayoutPosition == null || viewHolderFindViewHolderForLayoutPosition2 == null || !(viewHolderFindViewHolderForLayoutPosition2 instanceof ReactionBubbleDescriptionCell) || viewHolderFindViewHolderForLayoutPosition == null || (view = viewHolderFindViewHolderForLayoutPosition.itemView) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = this.LLJILJIL - LLJLL;
        if (viewHolderFindViewHolderForLayoutPosition2 != null && (view2 = viewHolderFindViewHolderForLayoutPosition2.itemView) != null) {
            measuredHeight = view2.getMeasuredHeight();
        }
        int i2 = i - measuredHeight;
        if (i2 == layoutParams.height || i2 < 0) {
            return;
        }
        layoutParams.height = i2;
        C786410Ut5.W5(view, layoutParams);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    private final Runnable getDiggToScrollRunnable() {
        return (Runnable) this.LLJILLL.getValue();
    }

    private final int getScrollHeaderHeight() {
        int i;
        int i2;
        if (this.LLJJJJLIIL) {
            i = this.LLJILJIL - LLJLL;
            i2 = LLJLLIL;
        } else {
            i = this.LLJILJIL;
            i2 = LLJLL;
        }
        int i3 = (i - i2) - this.LLJJIJI;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public final void LJJIIJ() {
        Aweme aweme;
        C1344030l4z.LIZJ("ReactionBubbleList", "diggCancel");
        if (this.LLJLILLLLZIIL) {
            this.LLJIJIL = true;
            return;
        }
        AbstractC1356940lPo abstractC1356940lPo = this.LLILZIL;
        if (abstractC1356940lPo == null || (aweme = abstractC1356940lPo.LLILLL) == null || aweme.isLike()) {
            return;
        }
        if (getState() == null || getState().LJIIIIZZ() == 0) {
            this.LLJIJIL = true;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[digg size is: ");
        sbLIZ.append(getState().LJIIIIZZ());
        sbLIZ.append(']');
        C1344030l4z.LIZJ("ReactionBubbleList", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.t(this, 0);
        this.LLJLILLLLZIIL = true;
        this.LLJIJIL = false;
        LJJIJIIJIL();
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) getState().LJII()) {
            if (interfaceC1891350zJl instanceof C0SQ6) {
                C0SQ6 c0sq6 = (C0SQ6) interfaceC1891350zJl;
                if (Intrinsics.LJFF(c0sq6.LLILZIL, "like") && Intrinsics.LJFF(c0sq6.LLILLJJLI.getUid(), curUser.getUid())) {
                    C20600815jK.LJIIL(getState(), interfaceC1891350zJl);
                }
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[diggCancel finish and state size is: ");
        sbLIZ2.append(getState().LJIIIIZZ());
        sbLIZ2.append(']');
        C1344030l4z.LIZJ("ReactionBubbleList", C2188811AlT.LIZIZ(sbLIZ2));
        this.LLJJJIL = true;
        HandlerHook.viewPostDelay(this, getDiggToScrollRunnable(), this.LLJJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        r7 = new X.C0SQ6(r8, java.util.Collections.singletonList(1001), "like", r14.LLJJJJJIL, r12, 36);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r14.LLJLIL <= getState().LJIIIIZZ()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        r14.LLJLIL = getState().LJIIIIZZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e1, code lost:
    
        X.C20600815jK.LIZIZ(getState(), r14.LLJLIL, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL() {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1356950lPp.LJJIIJZLJL():void");
    }

    public final boolean LJJIIZ() {
        if (this.LLJJJJ) {
            return false;
        }
        C698840Rb8 c698840Rb8 = C698840Rb8.LIZ;
        AbstractC1356940lPo abstractC1356940lPo = this.LLILZIL;
        Aweme aweme = abstractC1356940lPo != null ? abstractC1356940lPo.LLILLL : null;
        c698840Rb8.getClass();
        return C698840Rb8.LIZ(aweme, true);
    }

    public final void LJJIJIIJI() {
        C1344030l4z.LIZJ("ReactionBubbleList", "[startAutoScroll]");
        AbstractC1356940lPo abstractC1356940lPo = this.LLILZIL;
        if (abstractC1356940lPo != null) {
            abstractC1356940lPo.LLILZ = true;
        }
        if (this.LLJJJ && this.LLJJJIL) {
            C11LS c11ls = this.LLILZ;
            if (c11ls == null || c11ls.isDisposed()) {
                C786410Ut5.t(this, 0);
                this.LLILZ = (C11LS) new C19490611Ng(C11NN.LJII(this.LLJJ, TimeUnit.MILLISECONDS)).LJIIJ(C1701940uOG.LIZIZ()).LJIIL(new AfS190S0100000_21(this, 0));
            }
        }
    }

    public final void LJJIJIIJIL() {
        C1344030l4z.LIZJ("ReactionBubbleList", "[stopAutoScroll]");
        C11LS c11ls = this.LLILZ;
        if (c11ls != null) {
            c11ls.dispose();
        }
    }

    public final int getSingleItemHeaderHeight() {
        Integer numValueOf = Integer.valueOf(this.LLJJLIIIJLLLLLLLZ);
        int iIntValue = (this.LLJILJIL - LLJLL) - (numValueOf.intValue() > 0 ? numValueOf.intValue() : LLJLLL);
        if (iIntValue >= 0) {
            return iIntValue;
        }
        return 0;
    }

    public final Runnable getStartScrollRunnable() {
        return (Runnable) this.LLJILJILJ.getValue();
    }

    public final boolean LJJII() {
        AbstractC1356940lPo abstractC1356940lPo;
        int iLJIIIIZZ = getState().LJIIIIZZ();
        if (this.LLJJJJ) {
            return iLJIIIIZZ >= 1;
        }
        if (LJJIIZ()) {
            return iLJIIIIZZ > 1;
        }
        if (iLJIIIIZZ <= 1) {
            return iLJIIIIZZ == 1 && ((abstractC1356940lPo = this.LLILZIL) == null || !abstractC1356940lPo.LIZJ());
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C11LS c11ls = this.LLILZ;
        if (c11ls != null) {
            c11ls.dispose();
        }
        this.LLILZ = null;
        HandlerHook.viewRemoveCallbacks(this, getStartScrollRunnable());
        HandlerHook.viewRemoveCallbacks(this, getDiggToScrollRunnable());
    }

    public final AbstractC1356940lPo getBubbleListManager() {
        return this.LLILZIL;
    }

    public final int getFirstDataPositionInState() {
        return this.LLJJJJLIIL ? 1 : 0;
    }

    public final boolean getFromStoryToPost() {
        return this.LLJJJJ;
    }

    public final C0SQ1 getMMobEventParam() {
        return this.LLJJJJJIL;
    }

    public final boolean getReachEnd() {
        return this.LLIZ;
    }

    public final boolean getStopFlag() {
        return this.LLIZLLLIL;
    }

    public final void LJJI(int i) {
        View view = this.LLILZLL;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (i != layoutParams.height && i >= 0) {
            layoutParams.height = i;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public final void LJJIII(int i) {
        if (this.LLJILJIL == i) {
            return;
        }
        this.LLJILJIL = i;
        getLayoutParams().height = i;
        LJJIJIL(this.LLJJJJLIIL);
        requestLayout();
        if (LJJIIZ()) {
            HandlerHook.viewPost(this, new ARunnableS121S0100000_21(this, 23));
        }
    }

    public final void LJJIJIL(boolean z) {
        int scrollHeaderHeight;
        this.LLJJJJLIIL = z;
        this.LLJL = getFirstDataPositionInState();
        if (this.LLJJL) {
            scrollHeaderHeight = getSingleItemHeaderHeight();
        } else {
            scrollHeaderHeight = getScrollHeaderHeight();
        }
        LJJI(scrollHeaderHeight);
    }

    public final void LJJIJLIJ(List<? extends InterfaceC1891350zJl> list) {
        C11LS c11ls;
        if (this.LLJJJIL && getState().LJIIIIZZ() > getFirstDataPositionInState() && (c11ls = this.LLILZ) != null && !c11ls.isDisposed()) {
            this.LLJJIJIIJIL = list;
        } else {
            this.LLJJIJIIJIL = null;
            LJJIFFI(list, true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (getScrollState() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getActionMasked() == 0 && z) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    public final void setBubbleDataReady(boolean z) {
        this.LLJJJIL = z;
    }

    public final void setBubbleListManager(AbstractC1356940lPo abstractC1356940lPo) {
        this.LLILZIL = abstractC1356940lPo;
    }

    public final void setFromStoryToPost(boolean z) {
        this.LLJJJJ = z;
    }

    public final void setHolderSelected(boolean z) {
        this.LLJJJ = z;
    }

    public final void setMMobEventParam(C0SQ1 c0sq1) {
        this.LLJJJJJIL = c0sq1;
    }

    public final void setReachEnd(boolean z) {
        this.LLIZ = z;
    }

    public final void setStopFlag(boolean z) {
        this.LLIZLLLIL = z;
    }

    public C1356950lPp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJJIFFI(List<? extends InterfaceC1891350zJl> list, boolean z) {
        if (list.isEmpty()) {
            if (z) {
                LJJIJIIJIL();
            }
            getState().LJIILL(C13BV.INSTANCE, null);
            this.LLJ.clear();
            this.LLJJJIL = false;
            C786410Ut5.t(this, 4);
            return;
        }
        getState().LJIILL(list, null);
        this.LLJ.clear();
        this.LLJJJIL = true;
        C786410Ut5.t(this, 0);
        if (z) {
            LJJIJIIJI();
        }
    }

    public C1356950lPp(Context context, AttributeSet attributeSet, int i) {
        Fragment fragmentLIZ;
        super(context, attributeSet, i);
        this.LLJ = new LinkedHashSet();
        this.LLJILJIL = LLJZ;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 51));
        this.LLJILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 106));
        this.LLJJ = 40L;
        this.LLJJI = 6;
        this.LLJJIII = LLJZIJLIL;
        addItemDecoration(new C366620EYy(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 1));
        setHasFixedSize(true);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.a4h, this, false);
        this.LLILZLL = viewTd;
        viewTd.setTag(2);
        LJ(0, viewTd);
        View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.a4h, this, false);
        LIZLLL(viewTd2);
        viewTd2.setTag(2);
        setItemAnimator(null);
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null && (fragmentLIZ = iDetailFeedSafService.LIZ(this)) != null) {
            SAFExtensionKt.LIZ(new ViewTreeObserverOnGlobalLayoutListenerC1402100mae(this, 3), getViewTreeObserver(), fragmentLIZ);
        } else {
            C786410Ut5.x3(getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1402100mae(this, 4));
        }
        this.LLJJ = 34L;
        this.LLJJI = 4;
        this.LLJJIII = LLL;
        this.LLJLIL = -1;
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.LLILZ == null) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                C786410Ut5.LJLLLLLL(4, childAt);
            }
            View childAt2 = getChildAt(0);
            if (childAt2 != null) {
                C786410Ut5.T4(childAt2, 1.0f);
                return;
            }
            return;
        }
        int iLJIIIIZZ = getState().LJIIIIZZ();
        if (iLJIIIIZZ < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            View childAt3 = getChildAt(i5);
            if (childAt3 != null) {
                float top = childAt3.getTop();
                float height = getHeight() - childAt3.getBottom();
                int position = -1;
                if (top <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))) {
                    C786410Ut5.LJLLLLLL(4, childAt3);
                    if (Intrinsics.LJFF(childAt3.getTag(), 1)) {
                        childAt3.setTag(0);
                    }
                    if (Intrinsics.LJFF(childAt3.getTag(), 3)) {
                        this.LLJ.add(String.valueOf(childAt3.hashCode()));
                    }
                    RecyclerView.LayoutManager layoutManager = getLayoutManager();
                    if (layoutManager != null && layoutManager.getPosition(childAt3) >= iLJIIIIZZ && !this.LLIZ) {
                        this.LLIZ = true;
                        LJJIJIIJIL();
                        HandlerHook.viewPostDelay(this, new ARunnableS121S0100000_21(this, 135), this.LLJJ);
                    }
                } else if (top <= this.LLJJIII) {
                    C786410Ut5.LJLLLLLL(0, childAt3);
                    C786410Ut5.T4(childAt3, top / this.LLJJIII);
                } else if (height >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30))) {
                    C786410Ut5.LJLLLLLL(0, childAt3);
                    C786410Ut5.T4(childAt3, 1.0f);
                } else if (height >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) {
                    C786410Ut5.LJLLLLLL(0, childAt3);
                    if (!Intrinsics.LJFF(childAt3.getTag(), 1) && !Intrinsics.LJFF(childAt3.getTag(), 2)) {
                        if (Intrinsics.LJFF(childAt3.getTag(), 3) && !this.LLJ.contains(String.valueOf(childAt3.hashCode()))) {
                            C786410Ut5.T4(childAt3, 1.0f);
                        } else if (!LJJII()) {
                            this.LLJ.clear();
                            C786410Ut5.T4(childAt3, 1.0f);
                        } else {
                            C786410Ut5.T4(childAt3, (height - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) / this.LLJJIII);
                        }
                    } else {
                        C786410Ut5.T4(childAt3, 1.0f);
                    }
                    RecyclerView.LayoutManager layoutManager2 = getLayoutManager();
                    if (layoutManager2 != null) {
                        position = layoutManager2.getPosition(childAt3);
                    }
                    if (position >= getFirstDataPositionInState() + 1) {
                        this.LLJL = position;
                        if (position > getState().LJIIIIZZ()) {
                            this.LLJL = getState().LJIIIIZZ();
                        }
                    }
                } else if (height >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))) {
                    C786410Ut5.LJLLLLLL(4, childAt3);
                    C786410Ut5.T4(childAt3, 0.0f);
                } else {
                    C786410Ut5.LJLLLLLL(4, childAt3);
                    C786410Ut5.T4(childAt3, 0.0f);
                    return;
                }
            }
            if (i5 == iLJIIIIZZ) {
                return;
            } else {
                i5++;
            }
        }
    }
}
