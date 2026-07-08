package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.093G, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C093G {
    public final Effect LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C093G)) {
            return false;
        }
        C093G c093g = (C093G) obj;
        return Intrinsics.LJFF(this.LIZ, c093g.LIZ) && this.LIZIZ == c093g.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public C093G(Effect effect, long j) {
        this.LIZ = effect;
        this.LIZIZ = j;
    }
}
