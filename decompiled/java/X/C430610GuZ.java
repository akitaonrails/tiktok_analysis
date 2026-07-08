package X;

import android.view.View;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0GuZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430610GuZ {
    public static final Pair<Integer, Integer> LIZ(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Pair<>(Integer.valueOf(iArr[0] + view.getPaddingLeft() + (((view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight()) / 2)), Integer.valueOf(iArr[1] + view.getPaddingTop()));
    }
}
