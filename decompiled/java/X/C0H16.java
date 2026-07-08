package X;

import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0H16, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H16 {
    public static final int LIZ(Spanned spanned, int i) {
        Object[] spans = spanned.getSpans(0, spanned.length(), LeadingMarginSpan.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (spanned.getSpanStart(obj) <= i && i <= spanned.getSpanEnd(obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        int leadingMargin = 0;
        while (it2.hasNext()) {
            leadingMargin += ((LeadingMarginSpan) it2.next()).getLeadingMargin(false);
        }
        return leadingMargin;
    }
}
