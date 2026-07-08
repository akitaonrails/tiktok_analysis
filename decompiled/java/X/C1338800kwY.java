package X;

import android.app.Activity;
import android.graphics.Rect;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338800kwY extends C09AY implements Function0<Integer> {
    public C1338800kwY() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJ;
        Activity activityLIZ = C01CR.LIZ();
        if (activityLIZ == null) {
            iLJ = C1338790kwX.LJ(null);
        } else {
            Rect rect = new Rect();
            activityLIZ.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            iLJ = rect.right - rect.left;
        }
        return Integer.valueOf(iLJ);
    }
}
