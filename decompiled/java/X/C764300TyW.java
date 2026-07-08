package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764300TyW extends AbstractC764660Tz6 {
    public final List<LiveEffect> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C764300TyW) && Intrinsics.LJFF(this.LIZ, ((C764300TyW) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateKaraokeSoundEffect(effectList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C764300TyW(List<? extends LiveEffect> list) {
        this.LIZ = list;
    }
}
