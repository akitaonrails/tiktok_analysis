package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;

/* JADX INFO: renamed from: X.0R0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688990R0v {
    public static final void LIZ(RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        int iLIZIZ;
        int iLIZIZ2;
        int i2;
        int marginStart;
        int marginEnd;
        int screenWidth;
        int marginStart2;
        int marginEnd2;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        View view = null;
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || linearLayoutManager.getOrientation() != 0) {
            return;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            view = viewHolderFindViewHolderForAdapterPosition.itemView;
        }
        int i3 = 0;
        if (view != null) {
            int width = viewHolderFindViewHolderForAdapterPosition.itemView.getWidth();
            ViewGroup.LayoutParams layoutParams = viewHolderFindViewHolderForAdapterPosition.itemView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart2 = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart2 = 0;
            }
            int i4 = width + marginStart2;
            ViewGroup.LayoutParams layoutParams2 = viewHolderFindViewHolderForAdapterPosition.itemView.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd2 = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
            } else {
                marginEnd2 = 0;
            }
            i2 = i4 + marginEnd2;
        } else {
            View childAt = recyclerView.getChildAt(0);
            if (childAt != null && childAt.getWidth() > 0) {
                iLIZIZ = childAt.getWidth();
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            }
            View childAt2 = recyclerView.getChildAt(0);
            if (childAt2 != null) {
                ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    marginStart = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart();
                } else {
                    marginStart = 0;
                }
                ViewGroup.LayoutParams layoutParams4 = childAt2.getLayoutParams();
                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                    marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd();
                } else {
                    marginEnd = 0;
                }
                iLIZIZ2 = marginStart + marginEnd;
            } else {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            }
            i2 = iLIZIZ + iLIZIZ2;
        }
        if (recyclerView.getWidth() > 0) {
            screenWidth = recyclerView.getWidth();
        } else {
            screenWidth = ScreenUtils.getScreenWidth(recyclerView.getContext());
        }
        int paddingStart = (((screenWidth - recyclerView.getPaddingStart()) - recyclerView.getPaddingEnd()) - i2) / 2;
        if (paddingStart >= 0) {
            i3 = paddingStart;
        }
        linearLayoutManager.scrollToPositionWithOffset(i, i3);
    }

    public static final void LIZIZ(RecyclerView recyclerView, int i) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
            final Context context = recyclerView.getContext();
            C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0R0w
                @Override // X.C21674119s3
                public final int LJIILJJIL() {
                    return -1;
                }

                @Override // X.C21674119s3
                public final int LJIILL() {
                    return -1;
                }
            };
            c21674119s3.LIZ = i;
            layoutManager.startSmoothScroll(c21674119s3);
        }
    }
}
