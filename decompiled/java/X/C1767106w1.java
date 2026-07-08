package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.06w1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1767106w1 extends C0DXR {
    public final int $t;

    @Override // X.C0DXR
    public final void LIZ(int i, Rect rect) {
        if (6 - this.$t != 0) {
            super.LIZ(i, rect);
        } else {
            LIZ$0(this, i, rect);
        }
    }

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
            case 4:
                LIZIZ$4(this, rect, view, recyclerView, c21673919s1);
                break;
            case 5:
                LIZIZ$5(this, rect, view, recyclerView, c21673919s1);
                break;
            case 6:
            default:
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                break;
            case 7:
                LIZIZ$6(this, rect, view, recyclerView, c21673919s1);
                break;
        }
    }

    public C1767106w1(int i) {
        this.$t = i;
    }

    public static final void LIZ$0(C1767106w1 c1767106w1, int i, Rect rect) {
        int iLIZIZ;
        if (i == 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        } else {
            iLIZIZ = 0;
        }
        rect.set(0, iLIZIZ, 0, 0);
    }

    public static final void LIZIZ$0(C1767106w1 c1767106w1, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        rect.set(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0);
    }

    public static final void LIZIZ$1(C1767106w1 c1767106w1, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        rect.set(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0);
    }

    public static final void LIZIZ$2(C1767106w1 c1767106w1, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int iLIZIZ = c21673919s1.LIZIZ();
        rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        if (C426750GoL.LIZLLL(view.getContext())) {
            if (childAdapterPosition == 0) {
                rect.right = 0;
                return;
            } else {
                if (childAdapterPosition != iLIZIZ - 1) {
                    return;
                }
                rect.left = 0;
                return;
            }
        }
        if (childAdapterPosition == 0) {
            rect.left = 0;
        } else {
            if (childAdapterPosition != iLIZIZ - 1) {
                return;
            }
            rect.right = 0;
        }
    }

    public static final void LIZIZ$3(C1767106w1 c1767106w1, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        rect.set(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
    }

    public static final void LIZIZ$4(C1767106w1 c1767106w1, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int i;
        if (recyclerView.getChildAdapterPosition(view) == c21673919s1.LIZIZ() - 1) {
            i = 12;
        } else {
            i = 8;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        if (recyclerView.getLayoutDirection() == 1) {
            rect.left = iLIZIZ;
        } else {
            rect.right = iLIZIZ;
        }
    }

    public static final void LIZIZ$5(C1767106w1 c1767106w1, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            boolean z = true;
            if (view.getLayoutDirection() != 1) {
                z = false;
            }
            if (z) {
                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            } else {
                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
        }
    }

    public static final void LIZIZ$6(C1767106w1 c1767106w1, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int itemCount;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = 0;
        }
        int i = itemCount - 1;
        if (childAdapterPosition == 0) {
            if (i == 0) {
                rect.set(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(86)));
                return;
            } else {
                rect.set(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 0, 0);
                return;
            }
        }
        if (childAdapterPosition == i) {
            rect.set(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(86)));
        } else {
            rect.set(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), 0, 0);
        }
    }
}
