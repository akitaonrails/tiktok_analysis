package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0PyD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662190PyD extends FrameLayout {
    public final C0Q5B LL;
    public final C661490Px5 LLILLJJLI;

    public C662190PyD(Context context, C0Q57 c0q57) {
        View c1473870oSP;
        super(context);
        C661490Px5 c661490Px5 = new C661490Px5();
        this.LLILLJJLI = c661490Px5;
        if ((C0C1E.LIZ() & 1) == 1) {
            c1473870oSP = new C1473990oSb(context);
        } else {
            c1473870oSP = new C1473870oSP(context, null);
        }
        this.LL = new C0Q5B(c1473870oSP, c0q57, c661490Px5, false);
        addView(c1473870oSP);
    }
}
