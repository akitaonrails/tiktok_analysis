package X;

import android.view.View;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0Ip1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C478130Ip1 {
    public int LIZ = -1;
    public int LIZIZ = -1;
    public final int[] LIZJ = new int[2];
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(317));

    public final float LIZIZ() {
        return ((Number) this.LIZLLL.getValue()).floatValue();
    }

    public final void LIZ(View view) {
        int[] iArr = this.LIZJ;
        iArr[0] = 0;
        iArr[1] = 0;
        view.getLocationOnScreen(iArr);
    }
}
