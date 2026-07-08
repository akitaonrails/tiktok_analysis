package X;

import android.app.Activity;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;

/* JADX INFO: renamed from: X.0lDI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349180lDI implements InputFilter {
    public int LL;
    public String LLILLJJLI;
    public KeyboardDialogFragment LLILLL;

    public C1349180lDI(int i) {
        this.LL = i;
    }

    public final void LIZ(CharSequence charSequence) {
        if (this.LLILLL != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLL);
            c1389890mGx.LJIIJ(charSequence);
            c1389890mGx.LJIIJJI();
        } else {
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF == null) {
                return;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(activityLJFF);
            c1389890mGx2.LJIIJ(charSequence);
            c1389890mGx2.LJIIJJI();
        }
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.LL - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            if (!TextUtils.isEmpty(charSequence)) {
                if (!TextUtils.isEmpty(this.LLILLJJLI)) {
                    LIZ(this.LLILLJJLI);
                } else {
                    C844470XAv.LIZ.getClass();
                    LIZ(C844470XAv.LIZ().getResources().getString(2131847374, Integer.valueOf(this.LL)));
                    return "";
                }
            }
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        int i6 = i5 - 1;
        if (Character.isHighSurrogate(charSequence.charAt(i6))) {
            if (i6 == i) {
                C844470XAv.LIZ.getClass();
                LIZ(C844470XAv.LIZ().getResources().getString(2131847374, Integer.valueOf(this.LL)));
                return "";
            }
            i5 = i6;
        }
        if (!TextUtils.isEmpty(this.LLILLJJLI)) {
            LIZ(this.LLILLJJLI);
        } else {
            C844470XAv.LIZ.getClass();
            LIZ(C844470XAv.LIZ().getResources().getString(2131847374, Integer.valueOf(this.LL)));
        }
        return charSequence.subSequence(i, i5);
    }
}
