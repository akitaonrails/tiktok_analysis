package X;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.10sv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19386310sv {
    public static final boolean LIZ(View view) {
        Display display;
        if ((view != null && (display = view.getDisplay()) != null && display.getState() == 1) || C20642615q4.LIZIZ()) {
            return true;
        }
        return false;
    }

    public static final String LIZIZ(Aweme aweme) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(aweme.getAid());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZJ(View view, Integer num, Integer num2) {
        if (view.getLayoutParams() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (num != null) {
            layoutParams.width = num.intValue();
        }
        if (num2 != null) {
            layoutParams.height = num2.intValue();
        }
        C786410Ut5.W5(view, layoutParams);
    }
}
