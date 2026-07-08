package X;

import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21399318op implements SpanWatcher {
    public int LL;
    public int LLILLJJLI;

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
    }

    @Override // android.text.SpanWatcher
    public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        Object[] spans;
        Object objLJJIFFI;
        Object[] spans2;
        Object objLJJIFFI2;
        if (Intrinsics.LJFF(obj, Selection.SELECTION_END) && this.LLILLJJLI != i3) {
            this.LLILLJJLI = i3;
            if (spannable != null && (spans2 = spannable.getSpans(i3, i4, C21399218oo.class)) != null && (objLJJIFFI2 = C13LQ.LJJIFFI(spans2)) != null) {
                int spanStart = spannable.getSpanStart(objLJJIFFI2);
                int spanEnd = spannable.getSpanEnd(objLJJIFFI2);
                if (Math.abs(this.LLILLJJLI - spanEnd) <= Math.abs(this.LLILLJJLI - spanStart)) {
                    spanStart = spanEnd;
                }
                Selection.setSelection(spannable, Selection.getSelectionStart(spannable), spanStart);
            }
        }
        if (obj == Selection.SELECTION_START && this.LL != i3) {
            this.LL = i3;
            if (spannable != null && (spans = spannable.getSpans(i3, i4, C21399218oo.class)) != null && (objLJJIFFI = C13LQ.LJJIFFI(spans)) != null) {
                int spanStart2 = spannable.getSpanStart(objLJJIFFI);
                int spanEnd2 = spannable.getSpanEnd(objLJJIFFI);
                if (Math.abs(this.LL - spanEnd2) <= Math.abs(this.LL - spanStart2)) {
                    spanStart2 = spanEnd2;
                }
                Selection.setSelection(spannable, spanStart2, Selection.getSelectionEnd(spannable));
            }
        }
    }
}
