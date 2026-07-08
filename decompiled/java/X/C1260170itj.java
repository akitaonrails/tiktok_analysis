package X;

import Y.ARunnableS119S0100000_19;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0itj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260170itj {
    public static final boolean LIZ(RecyclerView recyclerView, View view, Aweme aweme) {
        RecyclerView.ViewHolder childViewHolder;
        SmartImageView smartImageView;
        ViewGroup viewGroup;
        if ((((Number) C267320Adm.LIZ.getValue()).intValue() & 1) != 1 || (childViewHolder = recyclerView.getChildViewHolder(view)) == null || !(childViewHolder instanceof C1259780it6) || (smartImageView = ((AbstractC1620180sGO) childViewHolder).LLILLJJLI) == null) {
            return false;
        }
        ViewParent parent = smartImageView.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return false;
        }
        int iIndexOfChild = viewGroup.indexOfChild(smartImageView);
        ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
        if (layoutParams == null) {
            return false;
        }
        childViewHolder.setIsRecyclable(false);
        C806840Vkw c806840Vkw = C806840Vkw.LIZ;
        c806840Vkw.getClass();
        C806840Vkw.LIZIZ = smartImageView;
        c806840Vkw.getClass();
        C806840Vkw.LIZJ = viewGroup;
        c806840Vkw.getClass();
        C806840Vkw.LIZLLL = iIndexOfChild;
        c806840Vkw.getClass();
        C806840Vkw.LJ = layoutParams;
        ARunnableS119S0100000_19 aRunnableS119S0100000_19 = new ARunnableS119S0100000_19(childViewHolder, 221);
        c806840Vkw.getClass();
        C806840Vkw.LJFF = aRunnableS119S0100000_19;
        String aid = aweme.getAid();
        c806840Vkw.getClass();
        C806840Vkw.LJI = aid;
        return true;
    }
}
