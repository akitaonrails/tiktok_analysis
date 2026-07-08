package X;

import android.graphics.Typeface;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DDQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DDQ {
    public final C19EG LIZ;
    public final C0DD8 LIZIZ;
    public final PdpViewModel LIZJ;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence LIZIZ(java.lang.String r8) {
        /*
            java.lang.String r7 = "**"
            r6 = 0
            boolean r0 = kotlin.text.a0.LJJIIZI(r8, r7, r6)
            if (r0 != 0) goto La
            return r8
        La:
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            r3 = 0
        L10:
            int r0 = r8.length()
            if (r3 >= r0) goto L24
            r2 = 4
            int r0 = kotlin.text.a0.LJJJ(r8, r7, r3, r6, r2)
            if (r0 >= 0) goto L25
            java.lang.String r0 = r8.substring(r3)
            r5.append(r0)
        L24:
            return r5
        L25:
            int r1 = r0 + 2
            int r4 = kotlin.text.a0.LJJJ(r8, r7, r1, r6, r2)
            if (r4 >= 0) goto L35
            java.lang.String r0 = r8.substring(r3)
            r5.append(r0)
            return r5
        L35:
            if (r0 <= r3) goto L3e
            java.lang.String r0 = r8.substring(r3, r0)
            r5.append(r0)
        L3e:
            int r3 = r5.length()
            java.lang.String r0 = r8.substring(r1, r4)
            r5.append(r0)
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r0 = 1
            r2.<init>(r0)
            int r1 = r5.length()
            r0 = 33
            X.C786410Ut5.q2(r5, r2, r3, r1, r0)
            int r3 = r4 + 2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DDQ.LIZIZ(java.lang.String):java.lang.CharSequence");
    }

    public final TuxTextView LIZ(CharSequence charSequence, boolean z) {
        int iIntValue;
        int i;
        TuxTextView tuxTextView = new TuxTextView(this.LIZ, null, 6, 0);
        tuxTextView.setText(charSequence);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, tuxTextView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -15329245;
        }
        tuxTextView.setTextColor(iIntValue);
        if (z) {
            i = 43;
        } else {
            i = 61;
        }
        tuxTextView.setTuxFont(i);
        if (z) {
            tuxTextView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        return tuxTextView;
    }

    public C0DDQ(C19EG c19eg, C0DD8 c0dd8, PdpViewModel pdpViewModel) {
        this.LIZ = c19eg;
        this.LIZIZ = c0dd8;
        this.LIZJ = pdpViewModel;
    }
}
