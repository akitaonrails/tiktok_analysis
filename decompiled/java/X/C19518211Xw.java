package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11Xw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19518211Xw extends AppCompatTextView {
    public C19518211Xw() {
        throw null;
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

    public C19518211Xw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19736612Jw.LIZ(C12MF.MEDIUM.getFONT_NAME());
        LJJJI(context, attributeSet);
    }

    public final void LJJJI(Context context, AttributeSet attributeSet) {
        C19734012Iw.LIZ(this, attributeSet, false);
        GradientDrawable gradientDrawableLIZIZ = C19734012Iw.LIZIZ(context, attributeSet, false);
        if (gradientDrawableLIZIZ != null) {
            setBackground(gradientDrawableLIZIZ);
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ToolsStyleView);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ToolsStyleView_ts_enable_text_color, true);
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.ToolsStyleView_ts_text_color);
            typedArrayObtainStyledAttributes.recycle();
            if (z) {
                if (colorStateList != null) {
                    setTextColor(colorStateList);
                    return;
                }
            } else {
                return;
            }
        }
        setTextColor(context.getResources().getColor(R.color.a0u));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C19518211Xw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19736612Jw.LIZ(C12MF.MEDIUM.getFONT_NAME());
        LJJJI(context, attributeSet);
    }
}
