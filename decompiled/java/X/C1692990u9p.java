package X;

import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0u9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692990u9p {
    public static final /* synthetic */ int LIZ = 0;

    public static C1692220u8a LIZ(Spanned spanned) {
        C1693450uAZ c1693450uAZ;
        C1692230u8b c1692230u8b = new C1692230u8b(spanned.toString());
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style != 1) {
                    if (style != 2) {
                        c1693450uAZ = new C1693450uAZ(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                    } else {
                        c1693450uAZ = new C1693450uAZ(0L, 0L, null, new C1693240uAE(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527);
                    }
                } else {
                    c1693450uAZ = new C1693450uAZ(0L, 0L, C1680190tpB.LLJ, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531);
                }
                c1692230u8b.LIZIZ(c1693450uAZ, spanStart, spanEnd);
            } else if (obj instanceof ForegroundColorSpan) {
                c1692230u8b.LIZIZ(new C1693450uAZ(C1685850tyJ.LIZIZ(((ForegroundColorSpan) obj).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), spanStart, spanEnd);
            } else if (obj instanceof URLSpan) {
                ((ArrayList) c1692230u8b.LLILLL).add(new C1692290u8h(new C1556440qba(((URLSpan) obj).getURL()), spanStart, spanEnd, "URL"));
            }
        }
        return c1692230u8b.LJIIL();
    }
}
