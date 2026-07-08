package X;

import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hdd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1211750hdd extends AbstractC1211760hde {
    public final FrameLayout LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1211750hdd) && Intrinsics.LJFF(this.LIZ, ((C1211750hdd) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeVideoView(frameLayout=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1211750hdd(FrameLayout frameLayout) {
        this.LIZ = frameLayout;
    }
}
