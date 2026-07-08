package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Dho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346260Dho extends C0DXR {
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
            case 2:
                LIZIZ$2(this, rect, view, recyclerView, c21673919s1);
                break;
            case 3:
                LIZIZ$3(this, rect, view, recyclerView, c21673919s1);
                break;
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    public C346260Dho(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(C346260Dho c346260Dho, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int itemCount;
        int iLIZIZ;
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        AbstractC21673619ry adapter = ((RecyclerView) c346260Dho.l0).getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        if (childAdapterPosition == itemCount) {
            iLIZIZ = 0;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f)));
        }
        rect.set(0, 0, iLIZIZ, 0);
    }

    public static final void LIZIZ$1(C346260Dho c346260Dho, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int itemCount;
        int iLIZIZ;
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        AbstractC21673619ry adapter = ((RecyclerView) c346260Dho.l0).getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        if (childAdapterPosition == itemCount) {
            iLIZIZ = 0;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(8.0f)));
        }
        rect.set(0, 0, iLIZIZ, 0);
    }

    public static final void LIZIZ$2(C346260Dho c346260Dho, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) c346260Dho.l0;
        int i = gridLayoutManager.LLILLJJLI;
        gridLayoutManager.LLIZ.LJFF(childAdapterPosition);
        ((GridLayoutManager) c346260Dho.l0).LLIZ.LJ(childAdapterPosition, i);
        if (childAdapterPosition < i) {
            rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
    }

    public static final void LIZIZ$3(C346260Dho c346260Dho, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = childAdapterPosition % 2;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((i * 8) / 2)));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(8 - (((i + 1) * 8) / 2))));
        if (C426750GoL.LIZLLL(((ViewOnAttachStateChangeListenerC20604515jv) c346260Dho.l0).getContext())) {
            rect.left = iLIZIZ2;
            rect.right = iLIZIZ;
        } else {
            rect.left = iLIZIZ;
            rect.right = iLIZIZ2;
        }
        if (childAdapterPosition >= 2) {
            rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
    }
}
