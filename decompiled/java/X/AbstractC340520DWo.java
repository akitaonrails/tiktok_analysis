package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC340520DWo extends C0DXR {
    public final boolean LL;

    public abstract float LJ();

    public abstract float LJFF();

    public abstract float LJI();

    public AbstractC340520DWo(boolean z) {
        this.LL = z;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        GridLayoutManager gridLayoutManager;
        Integer numValueOf;
        Integer numValueOf2;
        int itemCount;
        int iLJFF;
        float fLJ;
        int i;
        AbstractC214823195h abstractC214823195h;
        C21681919tJ c21681919tJ;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Integer numValueOf3 = null;
        if (layoutManager instanceof GridLayoutManager) {
            gridLayoutManager = (GridLayoutManager) layoutManager;
        } else {
            gridLayoutManager = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof C21681919tJ) && (c21681919tJ = (C21681919tJ) layoutParams) != null) {
            numValueOf = Integer.valueOf(c21681919tJ.LL);
        } else {
            numValueOf = null;
        }
        if (gridLayoutManager != null) {
            numValueOf2 = Integer.valueOf(gridLayoutManager.LLILLJJLI);
        } else {
            numValueOf2 = null;
        }
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        int iLIZIZ = 0;
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        if (childAdapterPosition < itemCount && gridLayoutManager != null && (abstractC214823195h = gridLayoutManager.LLIZ) != null) {
            iLJFF = abstractC214823195h.LJFF(childAdapterPosition);
        } else {
            iLJFF = 0;
        }
        AbstractC21673619ry adapter2 = recyclerView.getAdapter();
        if (adapter2 != null && childAdapterPosition == adapter2.getItemCount() - 1) {
            fLJ = LJI();
        } else {
            fLJ = LJ();
        }
        int iLIZ = (int) C11VU.LIZ(LJFF());
        int i2 = view.getContext().getResources().getConfiguration().smallestScreenWidthDp;
        if (i2 > 320) {
            if (i2 < 391) {
                iLIZIZ = iLIZ / 2;
            } else {
                iLIZIZ = iLIZ;
            }
        }
        if (this.LL) {
            if (childAdapterPosition == 0) {
                fLJ = 0.0f;
            } else if (numValueOf2 != null && numValueOf2.intValue() == iLJFF) {
                iLIZIZ += (int) C418440Gaw.LIZIZ(13);
                fLJ = 10.0f;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            i = iLIZIZ;
        } else {
            i = iLIZIZ / 2;
        }
        rect.left = i;
        if (numValueOf != null) {
            numValueOf3 = Integer.valueOf(numValueOf.intValue() + iLJFF);
        }
        if (!Intrinsics.LJFF(numValueOf3, numValueOf2)) {
            iLIZIZ /= 2;
        }
        rect.right = iLIZIZ;
        rect.bottom = (int) C11VU.LIZ(fLJ);
    }
}
