package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0R0S, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R0S extends C0DXR {
    public float LL;
    public final Paint LLILLJJLI;
    public int LLILLL = 1;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public C21679719sx LLIZLLLIL;
    public C21679619sw LLJ;

    public C0R0S() {
        Paint paint = new Paint();
        this.LLILLJJLI = paint;
        paint.setAntiAlias(true);
        paint.setColor(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJ(androidx.recyclerview.widget.RecyclerView r6, int r7) {
        /*
            r5 = this;
            int r0 = r6.getChildCount()
            int r4 = java.lang.Math.min(r0, r7)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r6.getLayoutManager()
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L46
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            int r0 = r2.getOrientation()
            if (r0 != 0) goto L2d
            X.19sw r0 = r5.LLJ
            if (r0 == 0) goto L20
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.LIZ
            if (r0 == r2) goto L27
        L20:
            X.19sw r0 = new X.19sw
            r0.<init>(r2)
            r5.LLJ = r0
        L27:
            X.19sw r3 = r5.LLJ
        L29:
            r2 = 0
            if (r3 != 0) goto L48
            return r2
        L2d:
            int r1 = r2.getOrientation()
            r0 = 1
            if (r1 != r0) goto L46
            X.19sx r0 = r5.LLIZLLLIL
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.LIZ
            if (r0 == r2) goto L43
        L3c:
            X.19sx r0 = new X.19sx
            r0.<init>(r2)
            r5.LLIZLLLIL = r0
        L43:
            X.19sx r3 = r5.LLIZLLLIL
            goto L29
        L46:
            r3 = 0
            goto L29
        L48:
            r1 = 0
        L49:
            int r0 = r4 + (-1)
            if (r2 >= r0) goto L59
            android.view.View r0 = r6.getChildAt(r2)
            int r0 = r3.LIZJ(r0)
            int r1 = r1 + r0
            int r2 = r2 + 1
            goto L49
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0R0S.LJ(androidx.recyclerview.widget.RecyclerView, int):int");
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i));
            if (childAdapterPosition != 0 && childAdapterPosition != childCount - 1) {
                if (this.LLILLL == 1) {
                    canvas.drawRect(recyclerView.getPaddingLeft() + 0.0f, r1.getTop() - this.LL, (recyclerView.getWidth() - recyclerView.getPaddingRight()) - 0.0f, r1.getTop(), this.LLILLJJLI);
                } else {
                    canvas.drawRect(r1.getLeft() - this.LL, recyclerView.getPaddingTop() + 0.0f, r1.getLeft(), (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - 0.0f, this.LLILLJJLI);
                }
            }
        }
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int i;
        int width;
        int iLJ;
        int iMax;
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (this.LLILZLL && recyclerView.getChildAdapterPosition(view) == itemCount - this.LLIZ) {
                if (itemCount > 2 && recyclerView.getChildCount() == 2) {
                    iMax = 0;
                } else {
                    if (this.LLILLL == 1) {
                        width = recyclerView.getHeight();
                        iLJ = LJ(recyclerView, itemCount);
                    } else {
                        width = recyclerView.getWidth();
                        iLJ = LJ(recyclerView, itemCount);
                    }
                    iMax = Math.max(width - iLJ, 0);
                }
                int i2 = iMax + this.LLILZIL;
                if (this.LLILLL == 1) {
                    rect.top = i2;
                    return;
                } else if (C426750GoL.LIZLLL(view.getContext())) {
                    rect.right = i2;
                    return;
                } else {
                    rect.left = i2;
                    return;
                }
            }
        }
        if (recyclerView.getChildAdapterPosition(view) == 0 && (i = this.LLILZ) != 0) {
            if (this.LLILLL == 1) {
                rect.top = i;
                return;
            } else if (C426750GoL.LIZLLL(view.getContext())) {
                rect.right = this.LLILZ;
                return;
            } else {
                rect.left = this.LLILZ;
                return;
            }
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != 0) {
            if (this.LLILLL == 1) {
                rect.top = (int) this.LL;
            } else if (C426750GoL.LIZLLL(view.getContext())) {
                rect.right = (int) this.LL;
                rect.left = 0;
            } else {
                rect.left = (int) this.LL;
                rect.right = 0;
            }
        } else {
            int i3 = this.LLILZ;
            if (this.LLILLL == 1) {
                rect.top = i3;
            } else if (C426750GoL.LIZLLL(view.getContext())) {
                rect.right = i3;
            } else {
                rect.left = i3;
            }
        }
        if (recyclerView.getAdapter() != null && childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1) {
            int i4 = this.LLILZIL;
            if (this.LLILLL == 1) {
                rect.bottom = i4;
            } else if (C426750GoL.LIZLLL(view.getContext())) {
                rect.left = i4;
            } else {
                rect.right = i4;
            }
        }
    }
}
