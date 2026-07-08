package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.10wD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19406710wD extends LinearLayout {
    public final C19406810wE LL;
    public final C19406810wE LLILLJJLI;

    public static LinearLayout.LayoutParams LIZ(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
        if (i == 0) {
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        }
        return layoutParams;
    }

    public C19406710wD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C19406810wE c19406810wE = new C19406810wE(0, context);
        this.LL = c19406810wE;
        C19406810wE c19406810wE2 = new C19406810wE(1, context);
        this.LLILLJJLI = c19406810wE2;
        setOrientation(1);
        addView(c19406810wE, LIZ(0));
        addView(c19406810wE2, LIZ(1));
    }
}
