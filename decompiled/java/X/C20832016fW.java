package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.16fW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C20832016fW extends AbstractC21144517op {
    @Override // X.AbstractC21144517op
    public final View LJIILIIL(final Context context, final AttributeSet attributeSet) {
        return new TuxTextView(context, attributeSet) { // from class: X.03o8
            {
                setGravity(8388627);
                setMaxLines(1);
                setEllipsize(TextUtils.TruncateAt.END);
                setTuxFont(33);
                setTextColorRes(R.attr.a1h);
            }
        };
    }
}
