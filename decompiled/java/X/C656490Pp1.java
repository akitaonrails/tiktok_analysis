package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Pp1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656490Pp1 {
    public static Pair LIZIZ(Context context, int i) {
        int iLJIIJ = C12ES.LJIIJ(context);
        C12ES.LJIIIIZZ(context);
        if (C656570Pp9.LIZ()) {
            C656570Pp9.LIZIZ();
            iLJIIJ = C656570Pp9.LIZJ();
        }
        float fLIZJ = C12ES.LIZJ(16.0f, context);
        int[] iArr = new int[2];
        if (i == EnumC656500Pp2.HORIZONTAL.getValue()) {
            int i2 = (int) (iLJIIJ - (fLIZJ * 2));
            iArr[0] = i2;
            iArr[1] = (int) (((double) i2) * 0.5625d);
        } else if (i == EnumC656500Pp2.SQUIRE.getValue()) {
            int i3 = (int) (iLJIIJ - (fLIZJ * 2));
            iArr[0] = i3;
            iArr[1] = i3;
        } else {
            iArr[0] = (int) ((((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(354))) * 0.625d) + ((double) 0.5f));
            iArr[1] = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(354));
        }
        return new Pair(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    public static final void LIZ(Aweme aweme, ViewGroup viewGroup, EnumC658120Pre enumC658120Pre) {
        if (aweme == null || viewGroup == null) {
            return;
        }
        C786410Ut5.LJJJJI(viewGroup);
        View viewLJIIZILJ = C0R12.LIZIZ.LJIIZILJ(aweme.getAwemeRawAd(), viewGroup, enumC658120Pre);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (viewLJIIZILJ != null) {
            C786410Ut5.W5(viewLJIIZILJ, layoutParams);
        }
        viewGroup.addView(viewLJIIZILJ);
        if (viewLJIIZILJ != null) {
            C786410Ut5.LJLLLLLL(0, viewLJIIZILJ);
        }
    }
}
