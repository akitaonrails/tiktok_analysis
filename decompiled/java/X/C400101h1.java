package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01h1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C400101h1<T> extends AbstractC399701gx<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C400101h1) && Intrinsics.LJFF(this.LIZ, ((C400101h1) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectItem(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C400101h1(SoundEffect soundEffect) {
        this.LIZ = soundEffect;
    }
}
