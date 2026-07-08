package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437570HDv {
    public final long LIZ;
    public final float LIZIZ;
    public final Integer LIZJ;

    public C437570HDv() {
        this(0L, 0.0f, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C437570HDv)) {
            return false;
        }
        C437570HDv c437570HDv = (C437570HDv) obj;
        return this.LIZ == c437570HDv.LIZ && Float.compare(this.LIZIZ, c437570HDv.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c437570HDv.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarProgressInfo(waitQueueEstTimeMills=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inGeneratingProgress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stickerCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C437570HDv(long j, float f, int i) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? -1.0f : f, (Integer) null);
    }

    public C437570HDv(long j, float f, Integer num) {
        this.LIZ = j;
        this.LIZIZ = f;
        this.LIZJ = num;
    }
}
