package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Tx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C340701Tx<T> extends AbstractC399701gx<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C340701Tx) && Intrinsics.LJFF(this.LIZ, ((C340701Tx) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateRecentEffect(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C340701Tx(LiveEffect liveEffect) {
        this.LIZ = liveEffect;
    }
}
