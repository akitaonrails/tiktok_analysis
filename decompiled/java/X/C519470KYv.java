package X;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519470KYv {
    public final View LIZ;
    public final Context LIZIZ;
    public final Function0<Unit> LIZJ;
    public ViewTreeObserverOnGlobalLayoutListenerC521800KdG LIZLLL;

    public final Layout LIZ(int i, String str) {
        int iIntValue;
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LJIILIIL(str);
        c444830HcP.LJIIIZ(3);
        c444830HcP.LJIILL(i);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, this.LIZIZ);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c444830HcP.LJIILJJIL(iIntValue);
        c444830HcP.LJII(123);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
        c444840HcQ.LJI = alignment;
        c444840HcQ.LJII = TextUtils.TruncateAt.END;
        return C444830HcP.LIZJ(c444830HcP, 0.0f, true, C1697810uHb.LJIIJJI(new Pair(31, 32), new Pair(28, 30), new Pair(23, 27)), 25);
    }

    public C519470KYv(Context context, View view, C1575510r6L c1575510r6L) {
        this.LIZ = view;
        this.LIZIZ = context;
        this.LIZJ = c1575510r6L;
    }
}
