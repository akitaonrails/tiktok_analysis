package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.feed.drawerfeed.search.LiveSearchIntermediateFragment;

/* JADX INFO: renamed from: X.0xAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809010xAx extends FrameLayout {
    public InterfaceC1808960xAs LL;
    public FragmentManager LLILLJJLI;
    public LiveSearchIntermediateFragment LLILLL;

    public final void LIZ(boolean z) {
        RecyclerView.LayoutManager layoutManager;
        RecyclerView.LayoutManager layoutManager2;
        LiveSearchIntermediateFragment liveSearchIntermediateFragment = this.LLILLL;
        int i = 0;
        if (liveSearchIntermediateFragment != null && liveSearchIntermediateFragment.isAdded()) {
            LiveSearchIntermediateFragment liveSearchIntermediateFragment2 = this.LLILLL;
            AbstractC21673619ry adapter = null;
            if ((liveSearchIntermediateFragment2 instanceof LiveSearchIntermediateFragment) && liveSearchIntermediateFragment2 != null) {
                RecyclerView recyclerView = liveSearchIntermediateFragment2.LLILLJJLI;
                if (recyclerView != null) {
                    adapter = recyclerView.getAdapter();
                }
                if (adapter instanceof C1809130xB9) {
                    RecyclerView recyclerView2 = liveSearchIntermediateFragment2.LLILLJJLI;
                    adapter.getClass();
                    if (recyclerView2 != null && (layoutManager2 = recyclerView2.getLayoutManager()) != null) {
                        int childCount = layoutManager2.getChildCount();
                        while (i < childCount) {
                            View childAt = layoutManager2.getChildAt(i);
                            if (childAt != null) {
                                RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(childAt);
                                if (childViewHolder instanceof C1809140xBA) {
                                    C1809140xBA c1809140xBA = (C1809140xBA) childViewHolder;
                                    if (z) {
                                        c1809140xBA.getClass();
                                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_trending_words_show");
                                        c474500IjALIZ.LJJIIZI(c1809140xBA.I5());
                                        c474500IjALIZ.LIZ();
                                    } else {
                                        c1809140xBA.getClass();
                                    }
                                }
                            }
                            i++;
                        }
                        return;
                    }
                    return;
                }
                if (adapter instanceof C1809160xBC) {
                    RecyclerView recyclerView3 = liveSearchIntermediateFragment2.LLILLJJLI;
                    adapter.getClass();
                    if (recyclerView3 != null && (layoutManager = recyclerView3.getLayoutManager()) != null) {
                        int childCount2 = layoutManager.getChildCount();
                        while (i < childCount2) {
                            View childAt2 = layoutManager.getChildAt(i);
                            if (childAt2 != null) {
                                RecyclerView.ViewHolder childViewHolder2 = recyclerView3.getChildViewHolder(childAt2);
                                if (childViewHolder2 instanceof C1809150xBB) {
                                    C1809150xBB c1809150xBB = (C1809150xBB) childViewHolder2;
                                    if (z) {
                                        c1809150xBB.getClass();
                                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_trending_words_show");
                                        c474500IjALIZ2.LJJIIZI(c1809150xBB.I5());
                                        c474500IjALIZ2.LIZ();
                                    } else {
                                        c1809150xBB.getClass();
                                    }
                                }
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        InterfaceC1808960xAs interfaceC1808960xAs = this.LL;
        if (interfaceC1808960xAs != null) {
            interfaceC1808960xAs.LIZ(motionEvent);
        }
        return zDispatchTouchEvent;
    }

    public final void setOnDispatchTouchEventListener(InterfaceC1808960xAs interfaceC1808960xAs) {
        this.LL = interfaceC1808960xAs;
    }

    public C1809010xAx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
