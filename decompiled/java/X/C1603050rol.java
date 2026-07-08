package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1603050rol {
    public final Aweme LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1603050rol)) {
            return false;
        }
        C1603050rol c1603050rol = (C1603050rol) obj;
        return Intrinsics.LJFF(this.LIZ, c1603050rol.LIZ) && this.LIZIZ == c1603050rol.LIZIZ && this.LIZJ == c1603050rol.LIZJ;
    }

    public C1603050rol(int i, int i2, Aweme aweme) {
        this.LIZ = aweme;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
