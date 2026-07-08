package X;

import Y.ARunnableS119S0100000_19;
import android.text.InputFilter;
import android.text.Spanned;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.14o7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20375714o7 implements InputFilter {
    public boolean LL;
    public final /* synthetic */ int LLILLJJLI = 100;
    public final /* synthetic */ C20375614o6 LLILLL;

    public C20375714o7(C20375614o6 c20375614o6) {
        this.LLILLL = c20375614o6;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length;
        if (spanned != null) {
            length = spanned.length();
        } else {
            length = 0;
        }
        int i5 = (length + (i2 - i)) - (i4 - i3);
        int i6 = this.LLILLJJLI;
        if (i6 > 0 && i5 >= i6 && !this.LL && !this.LLILLL.LLIZLLLIL) {
            C766270U4b.LIZLLL(2131854040);
            this.LL = true;
            LiveEditText liveEditText = this.LLILLL.LLILLL;
            if (liveEditText != null) {
                HandlerHook.viewPostDelay(liveEditText, new ARunnableS119S0100000_19(this, 237), 1500L);
            }
        }
        int i7 = this.LLILLJJLI;
        if (i7 > 0 && i5 > i7) {
            return "";
        }
        return null;
    }
}
