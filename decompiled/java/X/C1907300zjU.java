package X;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.utils.UserVerify;

/* JADX INFO: renamed from: X.0zjU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907300zjU extends C0HX6 {
    public String LLIZ;

    @Override // X.C0HX6
    public final void LIZIZ(C1331670kl3 c1331670kl3) {
        c1331670kl3.LIZLLL(this.LLIZ);
        C1910480zoc.LIZ.getClass();
        C1910480zoc.LIZIZ(c1331670kl3);
    }

    public C1907300zjU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZ = "Avatar";
    }

    public final void LIZLLL(UserVerify userVerify, String str) {
        if (str != null) {
            this.LLIZ = str;
        }
        super.setUserData(userVerify);
    }
}
