package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Gh8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422280Gh8 extends C0DXR {
    public final int LLILLJJLI;
    public final int LL = 2;
    public final boolean LLILLL = false;

    public C422280Gh8(int i) {
        this.LLILLJJLI = i;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        boolean z;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = childAdapterPosition % this.LL;
        if (recyclerView.getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLILLL) {
            if (z) {
                int i2 = this.LLILLJJLI;
                int i3 = this.LL;
                rect.right = i2 - ((i * i2) / i3);
                rect.left = ((i + 1) * i2) / i3;
            } else {
                int i4 = this.LLILLJJLI;
                int i5 = this.LL;
                rect.left = i4 - ((i * i4) / i5);
                rect.right = ((i + 1) * i4) / i5;
            }
            if (childAdapterPosition < this.LL) {
                rect.top = this.LLILLJJLI;
            }
            rect.bottom = this.LLILLJJLI;
            return;
        }
        if (z) {
            int i6 = this.LLILLJJLI;
            int i7 = this.LL;
            rect.right = (i * i6) / i7;
            rect.left = i6 - (((i + 1) * i6) / i7);
        } else {
            int i8 = this.LLILLJJLI;
            int i9 = this.LL;
            rect.left = (i * i8) / i9;
            rect.right = i8 - (((i + 1) * i8) / i9);
        }
        if (childAdapterPosition < this.LL) {
            return;
        }
        rect.top = this.LLILLJJLI;
    }
}
