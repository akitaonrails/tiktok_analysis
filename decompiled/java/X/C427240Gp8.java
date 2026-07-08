package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0Gp8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427240Gp8 extends TuxTextView {
    @Override // android.view.View
    public final boolean isFocused() {
        return true;
    }

    public final boolean LJJJJJ() {
        Layout layout;
        int right = ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        return right > 0 && (layout = getLayout()) != null && Float.valueOf(layout.getLineWidth(0)) != null && getLayout().getLineWidth(0) > ((float) right);
    }

    @Override // android.view.View
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        sbLIZ.append(", text: ");
        sbLIZ.append((Object) getText());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            boolean zLJJJJJ = LJJJJJ();
            setSelected(!zLJJJJJ);
            setSelected(zLJJJJJ);
            return;
        }
        setSelected(false);
    }

    public C427240Gp8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            boolean zLJJJJJ = LJJJJJ();
            setSelected(!zLJJJJJ);
            setSelected(zLJJJJJ);
            return;
        }
        setSelected(false);
    }
}
