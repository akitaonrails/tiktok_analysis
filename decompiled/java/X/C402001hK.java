package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01hK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C402001hK<T> extends AbstractC401801hI<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C402001hK) && Intrinsics.LJFF(this.LIZ, ((C402001hK) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItemUnselected(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C402001hK(SoundEffect soundEffect) {
        this.LIZ = soundEffect;
    }
}
