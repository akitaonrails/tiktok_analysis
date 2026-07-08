package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0adn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942770adn extends AbstractC942990ae9 {
    public final C942820ads LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C942770adn) && Intrinsics.LJFF(this.LIZ, ((C942770adn) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplyWallpaperSuccess(wallpaperData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C942770adn(C942820ads c942820ads) {
        this.LIZ = c942820ads;
    }
}
