package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0HI7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HI7 {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.view.View LIZ(androidx.fragment.app.Fragment r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L37
            androidx.fragment.app.Fragment r1 = r3.getParentFragment()
            if (r1 == 0) goto L26
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L26
            boolean r0 = r1 instanceof com.bytedance.tux.sheet.sheet.TuxSheet
            if (r0 == 0) goto L26
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            if (r1 == 0) goto L24
            android.app.Dialog r0 = r1.getDialog()
            if (r0 == 0) goto L24
            android.view.View r0 = r0.getCurrentFocus()
            if (r0 == 0) goto L24
            return r0
        L24:
            if (r3 == 0) goto L37
        L26:
            X.19EG r0 = r3.getActivity()
            if (r0 == 0) goto L37
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L37
            android.view.View r2 = r0.getCurrentFocus()
            return r2
        L37:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HI7.LIZ(androidx.fragment.app.Fragment):android.view.View");
    }

    public static final int LIZIZ(RecyclerView recyclerView, int i) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (i < 0 || recyclerView == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) == null) {
            return 0;
        }
        View view = viewHolderFindViewHolderForAdapterPosition.itemView;
        Rect rect = new Rect();
        try {
            recyclerView.getDecoratedBoundsWithMargins(view, rect);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        return (int) (rect.bottom + view.getTranslationY());
    }

    public static final int LIZJ(RecyclerView recyclerView, int i) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (i < 0 || recyclerView == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) == null) {
            return 0;
        }
        View view = viewHolderFindViewHolderForAdapterPosition.itemView;
        Rect rect = new Rect();
        try {
            recyclerView.getDecoratedBoundsWithMargins(view, rect);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        return (int) (rect.top + view.getTranslationY());
    }
}
