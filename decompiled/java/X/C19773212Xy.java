package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;

/* JADX INFO: renamed from: X.12Xy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19773212Xy extends C0DXR {
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

    public C19773212Xy(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(C19773212Xy c19773212Xy, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        Integer numValueOf;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            numValueOf = Integer.valueOf(adapter.getItemViewType(childAdapterPosition));
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            return;
        }
        if (((ReadTextEffectBean) c19773212Xy.l0) == null) {
            if (childAdapterPosition % 2 == 0) {
                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                return;
            } else {
                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                return;
            }
        }
        if (childAdapterPosition % 2 == 0) {
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        } else {
            rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
    }

    public static final void LIZIZ$1(C19773212Xy c19773212Xy, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        if (childAdapterPosition == 0) {
            if (C11VU.LJI((C19517811Xs) c19773212Xy.l0)) {
                rect.right = ((C19517811Xs) c19773212Xy.l0).LLILLJJLI;
            } else {
                rect.left = ((C19517811Xs) c19773212Xy.l0).LLILLJJLI;
            }
        }
        if (childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1) {
            if (C11VU.LJI((C19517811Xs) c19773212Xy.l0)) {
                rect.left = ((C19517811Xs) c19773212Xy.l0).LLILLL;
                return;
            } else {
                rect.right = ((C19517811Xs) c19773212Xy.l0).LLILLL;
                return;
            }
        }
        if (C11VU.LJI((C19517811Xs) c19773212Xy.l0)) {
            rect.left = ((C19517811Xs) c19773212Xy.l0).LL;
        } else {
            rect.right = ((C19517811Xs) c19773212Xy.l0).LL;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ$2(X.C19773212Xy r8, android.graphics.Rect r9, android.view.View r10, androidx.recyclerview.widget.RecyclerView r11, X.C21673919s1 r12) {
        /*
            int r7 = r11.getChildAdapterPosition(r10)
            r0 = -1
            if (r7 != r0) goto L8
            return
        L8:
            if (r7 <= 0) goto Lc
            r9.left = r0
        Lc:
            android.view.ViewGroup$LayoutParams r4 = r10.getLayoutParams()
            java.lang.Object r0 = r8.l0
            X.12Ev r0 = (X.C19723512Ev) r0
            int r6 = r0.getItemCount()
            r3 = 0
            r5 = 1
            if (r7 < r6) goto L2c
            int r0 = r4.width
            if (r0 != 0) goto L24
            int r0 = r4.height
            if (r0 == 0) goto L2b
        L24:
            r4.width = r3
            r4.height = r3
        L28:
            X.C786410Ut5.W5(r10, r4)
        L2b:
            return
        L2c:
            int r2 = r4.height
            java.lang.Object r1 = r8.l0
            X.12Ev r1 = (X.C19723512Ev) r1
            int r0 = r1.LLJIJIL
            if (r2 == r0) goto L39
            r4.height = r0
            r3 = 1
        L39:
            int r0 = r1.getNormalItemWidth()
            if (r0 <= 0) goto L64
            java.lang.Object r0 = r8.l0
            X.12Ev r0 = (X.C19723512Ev) r0
            int r0 = r0.getLastItemWidth()
            if (r0 <= 0) goto L64
            int r6 = r6 - r5
            if (r7 != r6) goto L5b
            java.lang.Object r0 = r8.l0
            X.12Ev r0 = (X.C19723512Ev) r0
            int r1 = r0.getLastItemWidth()
        L54:
            int r0 = r4.width
            if (r0 == r1) goto L64
            r4.width = r1
            goto L28
        L5b:
            java.lang.Object r0 = r8.l0
            X.12Ev r0 = (X.C19723512Ev) r0
            int r1 = r0.getNormalItemWidth()
            goto L54
        L64:
            if (r3 == 0) goto L2b
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19773212Xy.LIZIZ$2(X.12Xy, android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.19s1):void");
    }

    public static final void LIZIZ$3(C19773212Xy c19773212Xy, Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int measuredWidth = ((((RecyclerView) c19773212Xy.l0).getMeasuredWidth() / 5) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))) / 2;
        rect.left = measuredWidth;
        rect.right = measuredWidth;
    }
}
