package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OZW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OZW extends C0DXR {
    public final boolean LL = false;
    public double LLILLJJLI;

    public static double LJ(View view) {
        Object parent = view.getParent();
        if (parent != null && (parent instanceof View)) {
            return LJ((View) parent);
        }
        return view.getHeight();
    }

    public static int LJFF(View view, ViewGroup viewGroup) {
        if (view.getParent() != null && !Intrinsics.LJFF(view.getParent(), viewGroup)) {
            return view.getTop() + LJFF((View) view.getParent(), viewGroup);
        }
        return view.getTop();
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        BulletinBaseCell bulletinBaseCell;
        C21568519b1 c21568519b1;
        double dLJ;
        float fLJFF;
        float translationY;
        int top;
        if (!c21673919s1.LJIIIIZZ && !c21673919s1.LJI) {
            if (this.LL && this.LLILLJJLI <= 0.0d) {
                this.LLILLJJLI = recyclerView.getRootView().getHeight();
            }
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerView.ViewHolder viewHolderFindContainingViewHolder = recyclerView.findContainingViewHolder(childAt);
                if (viewHolderFindContainingViewHolder != null) {
                    View view = null;
                    if ((viewHolderFindContainingViewHolder instanceof BulletinBaseCell) && (bulletinBaseCell = (BulletinBaseCell) viewHolderFindContainingViewHolder) != null) {
                        if (!bulletinBaseCell.To()) {
                            return;
                        }
                        C21568919b5 c21568919b5R6 = bulletinBaseCell.r6();
                        if (c21568919b5R6 != null) {
                            Drawable background = c21568919b5R6.getBackground();
                            if ((background instanceof C21568519b1) && (c21568519b1 = (C21568519b1) background) != null) {
                                if (this.LL) {
                                    dLJ = this.LLILLJJLI;
                                } else {
                                    dLJ = LJ(recyclerView);
                                }
                                if (this.LL) {
                                    Object parent = c21568919b5R6.getParent();
                                    if (parent instanceof View) {
                                        view = (View) parent;
                                    }
                                    int top2 = c21568919b5R6.getTop();
                                    if (view != null) {
                                        top = view.getTop();
                                    } else {
                                        top = 0;
                                    }
                                    fLJFF = top2 + top;
                                    translationY = childAt.getTranslationY();
                                } else {
                                    fLJFF = LJFF(c21568919b5R6, recyclerView);
                                    translationY = childAt.getTranslationY();
                                }
                                if (c21568519b1.LIZLLL(dLJ, fLJFF + translationY) && !this.LL) {
                                    c21568919b5R6.invalidateDrawable(c21568919b5R6.getBackground());
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
