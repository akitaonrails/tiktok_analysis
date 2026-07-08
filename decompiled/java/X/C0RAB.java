package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RAB, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RAB implements Serializable {
    public final int index;
    public final int playOrder;
    public final float progress;
    public final int totalPlayTime;
    public final int videoLengthSum;
    public final int videoPosition;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("index=");
        sbLIZ.append(this.index);
        sbLIZ.append(",progress=");
        sbLIZ.append(this.progress);
        sbLIZ.append(",totalPlayTime=");
        sbLIZ.append(this.totalPlayTime);
        sbLIZ.append(",playOrder=");
        sbLIZ.append(this.playOrder);
        sbLIZ.append(",videoLengthSum=");
        sbLIZ.append(this.videoLengthSum);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0RAB)) {
            return false;
        }
        return Intrinsics.LJFF(toString(), ((C0RAB) obj).toString());
    }

    public C0RAB(int i, float f, int i2, int i3, int i4, int i5) {
        this.index = i;
        this.progress = f;
        this.videoPosition = i2;
        this.totalPlayTime = i3;
        this.playOrder = i4;
        this.videoLengthSum = i5;
    }
}
