package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.12Xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19773312Xz extends C0DXR {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public C19773312Xz(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LIZIZ$0(C19773312Xz c19773312Xz, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int iLIZIZ = (C497820Jfg.LIZIZ(((RecyclerView) c19773312Xz.l0).getContext()) - C12GK.LLJILLL) / 2;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        if (childAdapterPosition != 0) {
            if (childAdapterPosition == ((C12G1) c19773312Xz.l1).LLLLLL().getItemCount() - 1) {
                C1428310nGv.LJFF(rect, ((RecyclerView) c19773312Xz.l0).getContext(), iLIZIZ2, iLIZIZ, 20);
            } else {
                C1428310nGv.LJFF(rect, ((RecyclerView) c19773312Xz.l0).getContext(), iLIZIZ2, iLIZIZ2, 20);
            }
        }
    }

    public static final void LIZIZ$1(C19773312Xz c19773312Xz, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        int iLIZIZ = (C497820Jfg.LIZIZ(((RecyclerView) c19773312Xz.l0).getContext()) - C12GK.LLJILLL) / 2;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        if (childAdapterPosition != 0) {
            if (childAdapterPosition == ((C12GW) c19773312Xz.l1).LLLLLJLJLL().getItemCount() - 1) {
                C1428310nGv.LJFF(rect, ((RecyclerView) c19773312Xz.l0).getContext(), iLIZIZ2, iLIZIZ, 20);
            } else {
                C1428310nGv.LJFF(rect, ((RecyclerView) c19773312Xz.l0).getContext(), iLIZIZ2, iLIZIZ2, 20);
            }
        }
    }
}
