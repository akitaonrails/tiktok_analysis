package X;

import android.graphics.Bitmap;
import android.text.Spannable;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.gift.LivePSMGiftIconSpaceFixSetting;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ezV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109990ezV implements InterfaceC176300m1 {
    public final TextView LL;
    public final CharSequence LLILLJJLI;

    public C1109990ezV(TextView textView, CharSequence charSequence) {
        this.LL = textView;
        this.LLILLJJLI = charSequence;
    }

    @Override // X.InterfaceC176300m1
    public final void LLLL(Bitmap bitmap, AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o) {
        Spannable spannable;
        Spannable spannable2;
        if (bitmap != null && abstractC1110800f0o != null) {
            if (LivePSMGiftIconSpaceFixSetting.INSTANCE.enabled()) {
                CharSequence charSequence = this.LLILLJJLI;
                if ((charSequence instanceof Spannable) && (spannable2 = (Spannable) charSequence) != null) {
                    C1133830fbx.LIZLLL(spannable2, bitmap, abstractC1110800f0o, true);
                }
            } else {
                int iLJJJJI = a0.LJJJJI(String.valueOf(this.LLILLJJLI), " . ", 0, 6);
                if (iLJJJJI != -1) {
                    CharSequence charSequence2 = this.LLILLJJLI;
                    if ((charSequence2 instanceof Spannable) && (spannable = (Spannable) charSequence2) != null) {
                        C1133830fbx.LIZIZ(spannable, bitmap, iLJJJJI + 1, iLJJJJI + 2, abstractC1110800f0o);
                    }
                }
            }
            this.LL.setText(this.LLILLJJLI);
        }
    }
}
