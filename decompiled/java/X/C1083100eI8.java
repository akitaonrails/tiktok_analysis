package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0eI8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1083100eI8 extends C19MX {
    public Set<Integer> mIdSet;
    public View[] mViews;

    public void invalidateHelper() {
        this.mViews = null;
    }

    public void onViewAdded(View view) {
    }

    public void onViewRemoved(View view) {
    }

    @Override // X.C19MX
    public void updatePreDraw(ConstraintLayout constraintLayout) {
    }

    public C1083100eI8(Context context) {
        super(context);
        this.mIdSet = new HashSet();
    }

    @Override // X.C19MX
    public View[] getViews(ConstraintLayout constraintLayout) {
        View[] viewArr = this.mViews;
        if (viewArr == null || viewArr.length != this.mCount) {
            this.mViews = new View[this.mCount];
            for (int i = 0; i < this.mCount; i++) {
                this.mViews[i] = constraintLayout.getViewById(this.mIds[i]);
            }
        }
        return this.mViews;
    }

    public boolean isReferenced(int i) {
        if (this.mIds != null && this.mIdSet.contains(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }

    @Override // X.C19MX
    public void setReferencedIds(int[] iArr) {
        super.setReferencedIds(iArr);
        if (iArr != null && iArr.length > 0) {
            this.mIdSet = new HashSet();
            for (int i : iArr) {
                this.mIdSet.add(Integer.valueOf(i));
            }
        }
    }

    public C1083100eI8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIdSet = new HashSet();
    }

    public C1083100eI8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIdSet = new HashSet();
    }

    public static void fixReferencedIds(ConstraintLayout constraintLayout, int i, int... iArr) {
        if (constraintLayout != null && iArr != null && iArr.length != 0) {
            View viewFindViewById = constraintLayout.findViewById(i);
            if (viewFindViewById instanceof C19MX) {
                ((C19MX) viewFindViewById).setReferencedIds(iArr);
            }
        }
    }
}
