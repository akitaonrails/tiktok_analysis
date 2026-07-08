package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;

/* JADX INFO: renamed from: X.0Hcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444990Hcf {
    public final C445000Hcg LIZ = new LruCache<String, StaticLayout>() { // from class: X.0Hcg
        @Override // android.util.LruCache
        public final StaticLayout create(String str) {
            return null;
        }

        @Override // android.util.LruCache
        public final void entryRemoved(boolean z, String str, StaticLayout staticLayout, StaticLayout staticLayout2) {
        }

        @Override // android.util.LruCache
        public final int sizeOf(String str, StaticLayout staticLayout) {
            return 1;
        }
    };

    public static StaticLayout LIZ(C444990Hcf c444990Hcf, CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, int i2) {
        int length = ((String) charSequence).length();
        c444990Hcf.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) charSequence);
        sbLIZ.append('-');
        sbLIZ.append(0);
        sbLIZ.append('-');
        sbLIZ.append(length);
        sbLIZ.append('-');
        sbLIZ.append(textPaint);
        sbLIZ.append('-');
        sbLIZ.append(i);
        sbLIZ.append('-');
        sbLIZ.append(alignment);
        sbLIZ.append('-');
        sbLIZ.append(f);
        sbLIZ.append('-');
        sbLIZ.append(f2);
        sbLIZ.append('-');
        sbLIZ.append(true);
        sbLIZ.append('-');
        sbLIZ.append(i2);
        sbLIZ.append('-');
        sbLIZ.append((Object) null);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StaticLayout staticLayoutBuild = c444990Hcf.LIZ.get(strLIZIZ);
        if (staticLayoutBuild == null) {
            staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, length, textPaint, i).setAlignment(alignment).setLineSpacing(f2, f).setIncludePad(true).setEllipsizedWidth(i2).setEllipsize(null).build();
        }
        c444990Hcf.LIZ.put(strLIZIZ, staticLayoutBuild);
        return staticLayoutBuild;
    }
}
