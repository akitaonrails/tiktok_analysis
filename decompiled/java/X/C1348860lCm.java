package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0lCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1348860lCm {
    public int LIZ;
    public int LIZIZ;
    public long LIZJ;
    public List<InterfaceC1349170lDH> LIZLLL;
    public boolean LJ;

    public final boolean LIZ(int i, Context context) {
        if (!C815020Vy8.LIZJ()) {
            return false;
        }
        int iIntValue = ((Integer) C473380IhM.LIZ(C1388190mED.LIZ(context)).getSecond()).intValue();
        if (i > iIntValue) {
            return true;
        }
        int i2 = this.LIZ;
        if (i2 == 0) {
            this.LIZ = iIntValue;
        } else if (i2 != iIntValue) {
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
        if (Math.abs(i3) < C12ES.LIZJ(80.0f, context)) {
            return;
        }
        if (Build.VERSION.SDK_INT == 30) {
            long jNanoTime = System.nanoTime() / 1000000;
            if (jNanoTime - this.LIZJ > 100) {
                this.LIZJ = jNanoTime;
            } else {
                return;
            }
        }
        if (i3 > 0) {
            this.LJ = true;
        } else {
            this.LJ = false;
        }
        LIZJ(Math.abs(i3), this.LJ);
        this.LIZIZ = size;
    }

    public final void LIZJ(int i, boolean z) {
        List<InterfaceC1349170lDH> list = this.LIZLLL;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1349170lDH) it2.next()).u2(i, z);
            }
        }
    }
}
