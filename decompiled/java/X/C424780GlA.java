package X;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: renamed from: X.0GlA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424780GlA extends C0DXR {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public C424780GlA(int i, int i2, int i3) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                if (childAdapterPosition == 0) {
                    rect.right = this.LL;
                } else {
                    rect.right = this.LLILLJJLI;
                }
                if (childAdapterPosition == itemCount - 1) {
                    rect.left = this.LLILLL;
                    return;
                }
                return;
            }
            if (childAdapterPosition == 0) {
                rect.left = this.LL;
            } else {
                rect.left = this.LLILLJJLI;
            }
            if (childAdapterPosition != itemCount - 1) {
                return;
            }
            rect.right = this.LLILLL;
        }
    }
}
