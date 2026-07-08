package X;

import android.text.Layout;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0H96, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H96 {
    public static final /* synthetic */ int LIZ = 0;

    public static Layout LIZ(int i, int i2, int i3, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (i < 0) {
            i = 0;
        }
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LIZIZ.LJ = i;
        c444830HcP.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        c444830HcP.LJIILIIL(charSequence);
        c444830HcP.LJII(101);
        c444830HcP.LJIILJJIL(i2);
        c444830HcP.LJIIIZ(i3);
        if (C0H95.LIZ(charSequence.toString())) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
        c444840HcQ.LJI = alignment;
        if (i3 != Integer.MAX_VALUE) {
            c444840HcQ.LJII = TextUtils.TruncateAt.END;
            c444840HcQ.LJIIIIZZ = i;
        }
        return c444830HcP.LIZIZ();
    }
}
