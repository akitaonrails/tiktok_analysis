package X;

import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: renamed from: X.0UzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC790360UzS {
    public final ComponentName LIZ;
    public boolean LIZIZ;
    public int LIZJ;

    public abstract void LIZ(Intent intent);

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    public void LJ() {
    }

    public AbstractC790360UzS(ComponentName componentName) {
        this.LIZ = componentName;
    }

    public final void LIZIZ(int i) {
        if (!this.LIZIZ) {
            this.LIZIZ = true;
            this.LIZJ = i;
        } else {
            if (this.LIZJ == i) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Given job ID ");
            sbLIZ.append(i);
            sbLIZ.append(" is different than previous ");
            sbLIZ.append(this.LIZJ);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
