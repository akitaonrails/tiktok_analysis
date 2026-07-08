package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.ss.android.ugc.feed.platform.ab.FeedBottomTagStyleConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SXP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SXP {
    public static final FeedBottomTagStyleConfig LIZ = new FeedBottomTagStyleConfig(false, 0, 0, "", "", "");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0SXS());

    public static FeedBottomTagStyleConfig LIZIZ() {
        return (FeedBottomTagStyleConfig) LIZIZ.getValue();
    }

    public static Integer LIZJ() {
        if (!LIZIZ().enable) {
            return null;
        }
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LIZIZ().endPadding))));
    }

    public static Integer LIZLLL() {
        if (!LIZIZ().enable) {
            return null;
        }
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LIZIZ().startPadding))));
    }

    public static Integer LJFF() {
        if (!LIZIZ().enable) {
            return null;
        }
        C01GW c01gw = C2248361CzK.LIZ;
        Integer numLIZIZ = C2248361CzK.LIZIZ(LIZIZ().textFont);
        if (numLIZIZ != null) {
            return numLIZIZ;
        }
        return 82;
    }

    public static void LIZ(View view) {
        C01GW c01gw = C2248361CzK.LIZ;
        Integer numLJ = C2248361CzK.LJ(view.getContext(), LIZIZ().backgroundColor);
        if (numLJ == null) {
            numLJ = C1308910kAL.LIZJ(R.attr.e4, view.getContext());
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        if (numLJ != null) {
            numLJ.intValue();
            gradientDrawable.setColor(numLJ.intValue());
        }
        view.setBackground(gradientDrawable);
    }

    public static Integer LJ(Context context) {
        if (!LIZIZ().enable) {
            return null;
        }
        C01GW c01gw = C2248361CzK.LIZ;
        Integer numLJ = C2248361CzK.LJ(context, LIZIZ().textColor);
        if (numLJ != null) {
            return numLJ;
        }
        return C1308910kAL.LIZJ(R.attr.ee, context);
    }
}
