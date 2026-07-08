package X;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: renamed from: X.09Rn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2372909Rn {
    public static final String LIZLLL = C2372909Rn.class.getSimpleName();
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;

    public final boolean LIZ(int i, Context context) {
        if (!(!TextUtils.isEmpty((String) C1964207mi.LIZ("ro.vivo.os.build.display.id")))) {
            return false;
        }
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        Point point = new Point();
        C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYH5Rm5iUYoStac8r5REsNl+v25AfRK8XEo0FSe5pc0liGFA==", null)).getSize(point);
        int i2 = point.y;
        if (i > i2) {
            return true;
        }
        int i3 = this.LIZ;
        if (i3 == 0) {
            this.LIZ = i2;
        } else if (i3 != i2) {
            return true;
        }
        return false;
    }

    public void LIZIZ(int i, Context context) {
        int size = View.MeasureSpec.getSize(i);
        if (LIZ(size, context)) {
            return;
        }
        int i2 = this.LIZIZ;
        if (i2 == 0) {
            this.LIZIZ = size;
            return;
        }
        if (i2 == size) {
            return;
        }
        int i3 = i2 - size;
        if (Math.abs(i3) < C497740JfY.LIZIZ(80.0f)) {
            this.LIZIZ = Math.max(this.LIZIZ, size);
            return;
        }
        String str = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("beforeMeasure, offset = ");
        sbLIZ.append(i3);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (i3 > 0) {
            this.LIZJ = true;
        } else {
            this.LIZJ = false;
        }
        Math.abs(i3);
        this.LIZIZ = size;
    }
}
