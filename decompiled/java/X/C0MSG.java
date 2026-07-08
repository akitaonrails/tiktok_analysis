package X;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MSG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MSG {
    public float LIZ;
    public float LIZIZ;
    public final RectF LIZJ;

    public C0MSG() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0MSG)) {
            return false;
        }
        C0MSG c0msg = (C0MSG) obj;
        return Float.compare(this.LIZ, c0msg.LIZ) == 0 && Float.compare(this.LIZIZ, c0msg.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c0msg.LIZJ);
    }

    public C0MSG(int i) {
        RectF rectF = new RectF();
        this.LIZ = 0.0f;
        this.LIZIZ = 0.0f;
        this.LIZJ = rectF;
    }
}
