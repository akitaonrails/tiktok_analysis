package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Sz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21543919Sz extends C20094213jo {
    public final C21543419Su LIZ;

    public C21543919Sz(C21543419Su c21543419Su) {
        this.LIZ = c21543419Su;
    }

    @Override // X.C20094213jo
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        CharSequence text;
        boolean z;
        String strLIZIZ;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        EditText editText = this.LIZ.getEditText();
        if (editText != null) {
            text = editText.getText();
        } else {
            text = null;
        }
        CharSequence hint = this.LIZ.getHint();
        CharSequence error = this.LIZ.getError();
        CharSequence placeholderText = this.LIZ.getPlaceholderText();
        int counterMaxLength = this.LIZ.getCounterMaxLength();
        CharSequence counterOverflowDescription = this.LIZ.getCounterOverflowDescription();
        boolean z2 = !TextUtils.isEmpty(text);
        boolean z3 = !TextUtils.isEmpty(hint);
        boolean z4 = !this.LIZ.LLLLLLZ;
        boolean z5 = !TextUtils.isEmpty(error);
        if (!z5 && TextUtils.isEmpty(counterOverflowDescription)) {
            z = false;
        } else {
            z = true;
        }
        if (z3) {
            strLIZIZ = hint.toString();
        } else {
            strLIZIZ = "";
        }
        if (z2) {
            accessibilityNodeInfoCompat.setText(text);
        } else if (!TextUtils.isEmpty(strLIZIZ)) {
            accessibilityNodeInfoCompat.setText(strLIZIZ);
            if (z4 && placeholderText != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(", ");
                sbLIZ.append((Object) placeholderText);
                accessibilityNodeInfoCompat.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfoCompat.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(strLIZIZ)) {
            if (Build.VERSION.SDK_INT >= 26) {
                accessibilityNodeInfoCompat.setHintText(strLIZIZ);
            } else {
                if (z2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append((Object) text);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(strLIZIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                accessibilityNodeInfoCompat.setText(strLIZIZ);
            }
            accessibilityNodeInfoCompat.setShowingHintText(!z2);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfoCompat.setMaxTextLength(counterMaxLength);
        if (z) {
            if (!z5) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfoCompat.setError(error);
        }
        if (editText != null) {
            editText.setLabelFor(R.id.xrs);
        }
    }
}
