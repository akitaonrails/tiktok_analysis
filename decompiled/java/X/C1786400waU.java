package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0waU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786400waU {
    public final Aweme LIZ;
    public final EnumC1782860wUm LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1786400waU)) {
            return false;
        }
        C1786400waU c1786400waU = (C1786400waU) obj;
        return Intrinsics.LJFF(this.LIZ, c1786400waU.LIZ) && this.LIZIZ == c1786400waU.LIZIZ;
    }

    public C1786400waU(Aweme aweme, EnumC1782860wUm enumC1782860wUm) {
        this.LIZ = aweme;
        this.LIZIZ = enumC1782860wUm;
    }

    public static C1786400waU LIZ(C1786400waU c1786400waU, EnumC1782860wUm enumC1782860wUm) {
        Aweme aweme = c1786400waU.LIZ;
        c1786400waU.getClass();
        return new C1786400waU(aweme, enumC1782860wUm);
    }
}
