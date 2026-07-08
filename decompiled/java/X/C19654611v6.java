package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11v6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19654611v6 extends CharacterStyle implements UpdateAppearance {
    public final /* synthetic */ C19646111tj LL;

    public C19654611v6(C19646111tj c19646111tj) {
        this.LL = c19646111tj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Integer numLIZ = C1308910kAL.LIZ(R.attr.a1q, this.LL.getContext());
        if (numLIZ != null) {
            textPaint.setColor(numLIZ.intValue());
        }
        textPaint.setUnderlineText(false);
    }
}
