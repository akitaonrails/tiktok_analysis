package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01hE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C401401hE<T> extends AbstractC401801hI<T> {
    public final T LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C401401hE)) {
            return false;
        }
        C401401hE c401401hE = (C401401hE) obj;
        return Intrinsics.LJFF(this.LIZ, c401401hE.LIZ) && this.LIZIZ == c401401hE.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateFavoriteFail(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", wasTryingToAdd=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C401401hE(LiveEffect liveEffect, boolean z) {
        this.LIZ = liveEffect;
        this.LIZIZ = z;
    }
}
