package X;

import android.graphics.Typeface;
import android.text.SpannableString;

/* JADX INFO: renamed from: X.0HcX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444910HcX extends SpannableString {
    public C444910HcX(String str) {
        super(str == null ? "" : str);
    }

    public final void LIZ(int i) {
        C444900HcW c444900HcWLIZJ = C1697600uHG.LIZJ(i, true, false);
        C786410Ut5.s2(this, new C434230H0z(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c444900HcWLIZJ.LIZIZ)))), 0, length(), 17);
        Typeface typeface = c444900HcWLIZJ.LIZJ;
        Float fValueOf = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c444900HcWLIZJ.LIZ)));
        C444920HcY c444920HcY = new C444920HcY();
        c444920HcY.LL = typeface;
        c444920HcY.LLILLJJLI = fValueOf;
        C786410Ut5.s2(this, c444920HcY, 0, length(), 17);
        length();
    }
}
