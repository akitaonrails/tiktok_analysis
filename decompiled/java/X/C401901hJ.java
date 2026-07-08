package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01hJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C401901hJ<T> extends AbstractC401801hI<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C401901hJ) && Intrinsics.LJFF(this.LIZ, ((C401901hJ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItemSelected(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C401901hJ(SoundEffect soundEffect) {
        this.LIZ = soundEffect;
    }
}
