package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g7T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153370g7T implements InterfaceC1172200gbq {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ = 2;
    public final C13BV LIZLLL = C13BV.INSTANCE;
    public final String LJ = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1153370g7T)) {
            return false;
        }
        C1153370g7T c1153370g7T = (C1153370g7T) obj;
        return Intrinsics.LJFF(this.LIZ, c1153370g7T.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1153370g7T.LIZIZ) && this.LIZJ == c1153370g7T.LIZJ;
    }

    @Override // X.InterfaceC1172200gbq
    public final String getCoverUrl() {
        return "";
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoListHeaderItemModel(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", viewType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1172200gbq
    public final String LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1172200gbq
    public final List<String> getAvatarList() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1172200gbq
    public final int getViewType() {
        return this.LIZJ;
    }

    public C1153370g7T(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
