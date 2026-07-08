package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* JADX INFO: renamed from: X.0rwf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1607950rwf {
    public Bundle LJFF() {
        return null;
    }

    public static C1606420ruC LJ(Activity activity, C0WIY... c0wiyArr) {
        Pair[] pairArr;
        if (c0wiyArr != null) {
            pairArr = new Pair[c0wiyArr.length];
            for (int i = 0; i < c0wiyArr.length; i++) {
                C0WIY c0wiy = c0wiyArr[i];
                pairArr[i] = Pair.create(c0wiy.LIZ, c0wiy.LIZIZ);
            }
        } else {
            pairArr = null;
        }
        return new C1606420ruC(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    public static C1606420ruC LIZ(View view, int i, int i2) {
        return new C1606420ruC(ActivityOptions.makeClipRevealAnimation(view, 0, 0, i, i2));
    }

    public static C1606420ruC LIZIZ(int i, int i2, Context context) {
        return new C1606420ruC(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    public static C1606420ruC LIZLLL(Activity activity, View view, String str) {
        return new C1606420ruC(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    public static C1606420ruC LIZJ(View view, int i, int i2, int i3, int i4) {
        return new C1606420ruC(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
    }
}
