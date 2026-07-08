package X;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0Qzs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688700Qzs {
    public final TextView LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJFF;
    public int LJI;
    public final C0R4E LJII = new C0R4E(this, 0);

    public final void LIZIZ() {
        Spanned spanned;
        C688720Qzu[] c688720QzuArr;
        this.LIZLLL = true;
        CharSequence text = this.LIZ.getText();
        if (text == null || text.length() == 0 || !(text instanceof Spanned) || (spanned = (Spanned) text) == null || (c688720QzuArr = (C688720Qzu[]) spanned.getSpans(0, ((Spanned) text).length(), C688720Qzu.class)) == null || c688720QzuArr.length == 0) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        C688720Qzu[] c688720QzuArr2 = (C688720Qzu[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C688720Qzu.class);
        if (c688720QzuArr2 != null) {
            for (C688720Qzu c688720Qzu : c688720QzuArr2) {
                spannableStringBuilder.removeSpan(c688720Qzu);
            }
        }
        this.LIZ.setText(spannableStringBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LIZ(java.lang.CharSequence r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C688700Qzs.LIZ(java.lang.CharSequence, boolean):java.lang.CharSequence");
    }

    public C688700Qzs(TextView textView, int i, int i2) {
        this.LIZ = textView;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LJI = textView.getContext().getResources().getConfiguration().orientation;
    }
}
