package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ad.experiment.LandingPageNavBarAnimationConfigExp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d6F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037290d6F {
    public static int LIZ(ViewGroup viewGroup, Boolean bool, boolean z) {
        float fLIZJ;
        float f;
        if (!z) {
            Context context = viewGroup.getContext();
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                f = -56.0f;
            } else {
                f = -44.0f;
            }
            fLIZJ = C12ES.LIZJ(f, context);
        } else if (((Number) LandingPageNavBarAnimationConfigExp.LIZLLL.getValue()).intValue() == 1) {
            fLIZJ = C12ES.LIZJ(-52.0f, viewGroup.getContext());
        } else {
            fLIZJ = C12ES.LIZJ(-18.0f, viewGroup.getContext());
        }
        return (int) fLIZJ;
    }
}
