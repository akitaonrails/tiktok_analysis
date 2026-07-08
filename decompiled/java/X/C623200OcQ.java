package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623200OcQ {
    public static int LIZ;

    public static RecyclerView.ViewHolder LIZ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, Comment comment) {
        List<InterfaceC1891350zJl> listItems;
        String cid;
        AbstractC1049450dPr abstractC1049450dPr;
        Comment commentLIZ;
        C0WIY<Integer, Integer> c0wiyLIZJ = C665740Q9k.LIZJ(viewOnAttachStateChangeListenerC20604515jv);
        if (c0wiyLIZJ.LIZ == null || c0wiyLIZJ.LIZIZ == null || (listItems = viewOnAttachStateChangeListenerC20604515jv.getListItems()) == null) {
            return null;
        }
        int size = listItems.size();
        for (Integer numValueOf = c0wiyLIZJ.LIZ; numValueOf.intValue() <= c0wiyLIZJ.LIZIZ.intValue() && numValueOf.intValue() < size && numValueOf.intValue() >= 0; numValueOf = Integer.valueOf(numValueOf.intValue() + 1)) {
            Object obj = ListProtector.get(listItems, numValueOf.intValue());
            if ((obj instanceof C1340400kz8) && (abstractC1049450dPr = (AbstractC1049450dPr) obj) != null && (commentLIZ = abstractC1049450dPr.LIZ()) != null) {
                cid = commentLIZ.getCid();
            } else {
                cid = null;
            }
            if (Intrinsics.LJFF(cid, comment.getCid())) {
                return viewOnAttachStateChangeListenerC20604515jv.findViewHolderForAdapterPosition(numValueOf.intValue());
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.ViewOnAttachStateChangeListenerC20604515jv r10, boolean r11, com.ss.android.ugc.aweme.comment.model.Comment r12, int r13) {
        /*
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "scrollToComment "
            r1.append(r0)
            r1.append(r11)
            r0 = 32
            r1.append(r0)
            r0 = 0
            if (r12 == 0) goto L18
            java.lang.String r0 = r12.getCid()
        L18:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            r0 = 300(0x12c, double:1.48E-321)
            r4 = 0
            if (r11 == 0) goto La8
            if (r12 == 0) goto La6
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = LIZ(r10, r12)
            if (r2 == 0) goto La6
            android.graphics.Rect r3 = X.C665740Q9k.LIZIZ(r2)
            if (r3 == 0) goto La6
            r9 = 2
            int[] r2 = new int[r9]
            r10.getLocationOnScreen(r2)
            int r6 = r3.top
            r7 = 1
            r2 = r2[r7]
            int r6 = r6 - r2
            int r6 = r6 - r13
            androidx.recyclerview.widget.RecyclerView$LayoutManager r8 = r10.getLayoutManager()
            boolean r2 = r8 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r2 == 0) goto L94
            androidx.recyclerview.widget.LinearLayoutManager r8 = (androidx.recyclerview.widget.LinearLayoutManager) r8
            int r5 = r8.findLastVisibleItemPosition()
            int r3 = r8.getItemCount()
            r2 = -1
            if (r5 == r2) goto L94
            int r3 = r3 - r9
            if (r5 < r3) goto L94
            android.view.View r2 = r8.findViewByPosition(r5)
            if (r2 == 0) goto L94
            int r3 = r8.getDecoratedTop(r2)
            int r2 = r8.getDecoratedMeasuredHeight(r2)
            int r3 = r3 + r2
            int r5 = r10.getHeight()
            int r2 = r10.getPaddingBottom()
            int r5 = r5 - r2
            int r3 = r3 - r5
            if (r3 >= 0) goto L72
            r3 = 0
        L72:
            boolean r2 = r10.canScrollVertically(r7)
            if (r2 != 0) goto L79
            r3 = 0
        L79:
            if (r6 <= r3) goto L8e
            android.view.ViewPropertyAnimator r5 = r10.animate()
            int r2 = r3 - r6
            float r2 = (float) r2
            android.view.ViewPropertyAnimator r2 = r5.translationY(r2)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.start()
            r6 = r3
        L8e:
            X.C623200OcQ.LIZ = r6
        L90:
            r10.smoothScrollBy(r4, r6)
            return
        L94:
            int r3 = r10.computeVerticalScrollRange()
            int r2 = r10.computeVerticalScrollOffset()
            int r3 = r3 - r2
            int r2 = r10.getHeight()
            int r3 = r3 - r2
            if (r3 > 0) goto L72
            r3 = 0
            goto L72
        La6:
            r6 = 0
            goto L8e
        La8:
            android.view.ViewPropertyAnimator r3 = r10.animate()
            r2 = 0
            android.view.ViewPropertyAnimator r2 = r3.translationY(r2)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.start()
            int r0 = X.C623200OcQ.LIZ
            int r6 = -r0
            X.C623200OcQ.LIZ = r4
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C623200OcQ.LIZIZ(X.15jv, boolean, com.ss.android.ugc.aweme.comment.model.Comment, int):void");
    }
}
