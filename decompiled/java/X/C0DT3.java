package X;

import android.text.Layout;
import android.text.StaticLayout;

/* JADX INFO: renamed from: X.0DT3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DT3 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(int i, C16F5 c16f5, String str) {
        return StaticLayout.Builder.obtain(str, 0, str.length(), c16f5.getPaint(), i).setIncludePad(c16f5.getIncludeFontPadding()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(c16f5.getLineSpacingExtra(), c16f5.getLineSpacingMultiplier()).build().getLineCount();
    }
}
