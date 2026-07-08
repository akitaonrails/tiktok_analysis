package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C399601gw<T> extends AbstractC399701gx<T> {
    public final T LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C399601gw)) {
            return false;
        }
        C399601gw c399601gw = (C399601gw) obj;
        return Intrinsics.LJFF(this.LIZ, c399601gw.LIZ) && this.LIZIZ == c399601gw.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateFavoriteEffect(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isAdd=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C399601gw(LiveEffect liveEffect, boolean z) {
        this.LIZ = liveEffect;
        this.LIZIZ = z;
    }
}
