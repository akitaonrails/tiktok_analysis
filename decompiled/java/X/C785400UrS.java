package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UrS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785400UrS extends AbstractC214914198u {
    public final C214906198m LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C785400UrS) && Intrinsics.LJFF(this.LIZ, ((C785400UrS) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopupWrapper(popupWindow=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC214914198u
    public final void LIZ() {
        try {
            if (this.LIZ.isShowing()) {
                this.LIZ.dismiss();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.AbstractC214914198u
    public final void LIZJ() {
        this.LIZ.hookHideTemporary$saf_release();
    }

    @Override // X.AbstractC214914198u
    public final void LIZLLL() {
        this.LIZ.hookShowIfNeeded$saf_release();
    }

    public C785400UrS(C214906198m c214906198m) {
        this.LIZ = c214906198m;
    }
}
