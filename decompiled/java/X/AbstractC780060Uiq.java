package X;

import android.view.View;
import android.view.WindowManager;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.ConstraintFloatWindowLayout;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0Uiq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC780060Uiq {
    public int LIZIZ;
    public View[] LIZJ;
    public int[] LIZ = new int[32];
    public boolean LIZLLL = true;

    public abstract void LIZJ(ConstraintFloatWindowLayout constraintFloatWindowLayout, WindowManager windowManager);

    public abstract void LIZLLL();

    public abstract void LJ();

    public abstract void LJFF(ConstraintFloatWindowLayout constraintFloatWindowLayout);

    public abstract void LJI();

    /* JADX WARN: Multi-variable type inference failed */
    public final View[] LIZ(ConstraintFloatWindowLayout constraintFloatWindowLayout) {
        Object obj;
        View[] viewArr = this.LIZJ;
        if (viewArr == null || viewArr.length != this.LIZIZ) {
            this.LIZJ = new View[this.LIZIZ];
        }
        int i = this.LIZIZ;
        for (int i2 = 0; i2 < i; i2++) {
            Integer numLJJIIJ = C13LQ.LJJIIJ(i2, this.LIZ);
            if (numLJJIIJ != null) {
                int iIntValue = numLJJIIJ.intValue();
                View[] viewArr2 = this.LIZJ;
                if (viewArr2 != 0) {
                    C19OA c19oa = constraintFloatWindowLayout.LJ.get(iIntValue);
                    Object obj2 = null;
                    if (c19oa != null) {
                        obj = c19oa.mCompanionWidget;
                    } else {
                        obj = null;
                    }
                    if (obj instanceof View) {
                        obj2 = obj;
                    }
                    viewArr2[i2] = obj2;
                }
            }
        }
        return this.LIZJ;
    }

    public final void LIZIZ(int[] iArr) {
        this.LIZIZ = 0;
        for (int i : iArr) {
            int i2 = this.LIZIZ + 1;
            int[] iArr2 = this.LIZ;
            if (i2 > iArr2.length) {
                this.LIZ = Arrays.copyOf(iArr2, iArr2.length * 2);
            }
            int[] iArr3 = this.LIZ;
            int i3 = this.LIZIZ;
            iArr3[i3] = i;
            this.LIZIZ = i3 + 1;
        }
    }
}
