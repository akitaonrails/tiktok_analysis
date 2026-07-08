package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C442740HXs {
    public final long LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C442740HXs)) {
            return false;
        }
        C442740HXs c442740HXs = (C442740HXs) obj;
        return this.LIZ == c442740HXs.LIZ && Intrinsics.LJFF(this.LIZIZ, c442740HXs.LIZIZ) && this.LIZJ == c442740HXs.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerAnimationTask(stickerId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C442740HXs(long j, String str, int i) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = i;
    }
}
