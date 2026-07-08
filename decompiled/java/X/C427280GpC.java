package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0GpC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C427280GpC extends AppCompatTextView {
    @Override // android.view.View
    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
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
            getText();
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

    public C427280GpC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTypeface(C1697580uHE.LIZ(400, 17.0f, 0.0f, Float.valueOf(16.0f)));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C427280GpC(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setTypeface(C1697580uHE.LIZ(400, 17.0f, 0.0f, Float.valueOf(16.0f)));
    }
}
