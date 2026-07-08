package X;

import com.ss.android.ugc.aweme.sidebar.model.SideBarRootComponentConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rEJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580450rEJ extends AbstractC1580460rEK {
    public final SideBarRootComponentConfig LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1580450rEJ) && Intrinsics.LJFF(this.LIZ, ((C1580450rEJ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loaded(config=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1580450rEJ(SideBarRootComponentConfig sideBarRootComponentConfig) {
        this.LIZ = sideBarRootComponentConfig;
    }
}
