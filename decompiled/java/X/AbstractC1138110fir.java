package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayStuckRecoverySetting;

/* JADX INFO: renamed from: X.0fir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1138110fir {
    public final C1138090fip LIZ;

    public abstract String LIZ();

    public abstract void LIZJ();

    public abstract void LIZLLL(C1135810ff9 c1135810ff9);

    public abstract void LJ(C1135810ff9 c1135810ff9);

    public abstract void LJFF(C1135810ff9 c1135810ff9);

    public AbstractC1138110fir(C1138090fip c1138090fip) {
        this.LIZ = c1138090fip;
    }

    public final void LJI(String str) {
        C1138090fip c1138090fip = this.LIZ;
        c1138090fip.LIZLLL(str);
        if (LiveGiftTrayStuckRecoverySetting.INSTANCE.recoverIfLifecycleNull()) {
            c1138090fip.LIZ.LJIIL();
            c1138090fip.LIZIZ(new C1138250fj5(this.LIZ));
            c1138090fip.LJFF = null;
            c1138090fip.LIZIZ.LIZJ();
        }
    }

    public final void LJII(String str) {
        C1138090fip c1138090fip = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unexpected:");
        sbLIZ.append(str);
        c1138090fip.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZIZ(String str, C1135810ff9 c1135810ff9, boolean z) {
        if (z) {
            this.LIZ.LIZ();
        }
        C1138090fip c1138090fip = this.LIZ;
        c1138090fip.LIZ.LIZJ(c1135810ff9);
        LifecycleCoroutineScope lifecycleCoroutineScope = c1138090fip.LIZ.getLifecycleCoroutineScope();
        if (lifecycleCoroutineScope != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ.LLIILII(), null, new C1138120fis(c1138090fip, this, null), 2);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scope_null:");
            sbLIZ.append(str);
            LJI(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
