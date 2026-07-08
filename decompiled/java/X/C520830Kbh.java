package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520830Kbh extends C16G0 {
    public C520830Kbh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C16G0
    public final boolean LJIIJ(int i, int i2, View view) {
        boolean zLJIIJ = super.LJIIJ(i, i2, view);
        if (!view.isNestedScrollingEnabled()) {
            return zLJIIJ;
        }
        if (!zLJIIJ) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (Intrinsics.LJFF(childAt, view)) {
                return true;
            }
            if (childAt.getVisibility() == 0 && !childAt.isNestedScrollingEnabled() && Intrinsics.LJFF(childAt.getTag(R.id.emb), Boolean.TRUE) && super.LJIIJ(i, i2, childAt)) {
                return false;
            }
        }
        return true;
    }
}
