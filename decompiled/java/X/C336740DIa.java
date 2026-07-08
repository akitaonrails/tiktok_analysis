package X;

import android.text.Layout;
import android.text.StaticLayout;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0DIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336740DIa {
    public static final StaticLayout LIZ(TuxTextView tuxTextView, CharSequence charSequence, int i) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), tuxTextView.getPaint(), i).setIncludePad(tuxTextView.getIncludeFontPadding()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(tuxTextView.getLineSpacingExtra(), tuxTextView.getLineSpacingMultiplier()).build();
    }
}
