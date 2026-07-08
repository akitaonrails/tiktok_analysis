package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.EcCommentAnchorPanelActivity;

/* JADX INFO: renamed from: X.19LO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LO extends C0DXR {
    public final int $t;
    public Object l0;

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, rect, view, recyclerView, c21673919s1);
                break;
            case 1:
                LIZIZ$1(this, rect, view, recyclerView, c21673919s1);
                break;
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    public C19LO(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(C19LO c19lo, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            EcCommentAnchorPanelActivity ecCommentAnchorPanelActivity = (EcCommentAnchorPanelActivity) c19lo.l0;
            int i = ecCommentAnchorPanelActivity.LLJJJJLIIL;
            rect.top = i;
            rect.left = i;
            rect.right = ecCommentAnchorPanelActivity.LLJJJJ;
        } else if (childAdapterPosition == 1) {
            EcCommentAnchorPanelActivity ecCommentAnchorPanelActivity2 = (EcCommentAnchorPanelActivity) c19lo.l0;
            int i2 = ecCommentAnchorPanelActivity2.LLJJJJLIIL;
            rect.top = i2;
            rect.right = i2;
            rect.left = ecCommentAnchorPanelActivity2.LLJJJJ;
        } else {
            int i3 = childAdapterPosition % 2;
            if (i3 == 0) {
                EcCommentAnchorPanelActivity ecCommentAnchorPanelActivity3 = (EcCommentAnchorPanelActivity) c19lo.l0;
                rect.right = ecCommentAnchorPanelActivity3.LLJJJJ;
                rect.left = ecCommentAnchorPanelActivity3.LLJJJJLIIL;
                rect.top = ecCommentAnchorPanelActivity3.LLJJJJJIL;
            } else if (i3 == 1) {
                EcCommentAnchorPanelActivity ecCommentAnchorPanelActivity4 = (EcCommentAnchorPanelActivity) c19lo.l0;
                rect.left = ecCommentAnchorPanelActivity4.LLJJJJ;
                rect.top = ecCommentAnchorPanelActivity4.LLJJJJJIL;
                rect.right = ecCommentAnchorPanelActivity4.LLJJJJLIIL;
            }
        }
        if (((EcCommentAnchorPanelActivity) c19lo.l0).LLJILLL.size() % 2 == 0 && (childAdapterPosition == ((EcCommentAnchorPanelActivity) c19lo.l0).LLJILLL.size() - 1 || childAdapterPosition == ((EcCommentAnchorPanelActivity) c19lo.l0).LLJILLL.size() - 2)) {
            rect.bottom = ((EcCommentAnchorPanelActivity) c19lo.l0).LLJJL;
        }
        if (((EcCommentAnchorPanelActivity) c19lo.l0).LLJILLL.size() % 2 == 1 && childAdapterPosition == ((EcCommentAnchorPanelActivity) c19lo.l0).LLJILLL.size() - 1) {
            rect.bottom = ((EcCommentAnchorPanelActivity) c19lo.l0).LLJJL;
        }
        if (C1744760vVK.LIZ()) {
            int i4 = rect.left;
            rect.left = rect.right;
            rect.right = i4;
        }
    }

    public static final void LIZIZ$1(C19LO c19lo, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition;
        if (recyclerView.getAdapter() == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) == -1) {
            return;
        }
        if (childAdapterPosition == 0) {
            C21379118lZ c21379118lZ = (C21379118lZ) c19lo.l0;
            c21379118lZ.getClass();
            if (c21379118lZ.getLayoutDirection() == 1) {
                rect.right = ((C21379118lZ) c19lo.l0).LLILLJJLI;
            } else {
                rect.left = ((C21379118lZ) c19lo.l0).LLILLJJLI;
            }
        }
        if (childAdapterPosition == r3.getItemCount() - 1) {
            C21379118lZ c21379118lZ2 = (C21379118lZ) c19lo.l0;
            c21379118lZ2.getClass();
            if (c21379118lZ2.getLayoutDirection() == 1) {
                rect.left = ((C21379118lZ) c19lo.l0).LLILLL;
                return;
            } else {
                rect.right = ((C21379118lZ) c19lo.l0).LLILLL;
                return;
            }
        }
        C21379118lZ c21379118lZ3 = (C21379118lZ) c19lo.l0;
        c21379118lZ3.getClass();
        if (c21379118lZ3.getLayoutDirection() == 1) {
            rect.left = ((C21379118lZ) c19lo.l0).LL;
        } else {
            rect.right = ((C21379118lZ) c19lo.l0).LL;
        }
    }
}
