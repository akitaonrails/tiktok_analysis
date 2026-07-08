package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417580GYy {
    public final Integer LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C417580GYy)) {
            return false;
        }
        C417580GYy c417580GYy = (C417580GYy) obj;
        return Intrinsics.LJFF(this.LIZ, c417580GYy.LIZ) && Float.compare(this.LIZIZ, c417580GYy.LIZIZ) == 0;
    }

    public C417580GYy(float f, Integer num) {
        this.LIZ = num;
        this.LIZIZ = f;
    }
}
