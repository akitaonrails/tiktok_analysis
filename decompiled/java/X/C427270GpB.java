package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0GpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427270GpB extends TuxTextView {
    @Override // android.view.View
    public final boolean isFocused() {
        return true;
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
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
            setSelected(false);
            setSelected(true);
        } else {
            setSelected(false);
        }
    }

    public C427270GpB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            setSelected(false);
            setSelected(true);
        } else {
            setSelected(false);
        }
    }
}
