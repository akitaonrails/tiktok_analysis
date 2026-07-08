package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g7U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153380g7U implements InterfaceC1172200gbq {
    public final List<String> LIZIZ;
    public final int LIZLLL;
    public final String LIZ = "";
    public final String LIZJ = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1153380g7U)) {
            return false;
        }
        C1153380g7U c1153380g7U = (C1153380g7U) obj;
        return Intrinsics.LJFF(this.LIZ, c1153380g7U.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1153380g7U.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1153380g7U.LIZJ) && this.LIZLLL == c1153380g7U.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoListItemModel(coverUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", avatarList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", date=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", viewType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1172200gbq
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1172200gbq
    public final List<String> getAvatarList() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1172200gbq
    public final String getCoverUrl() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1172200gbq
    public final int getViewType() {
        return this.LIZLLL;
    }

    public C1153380g7U(int i, C13BV c13bv) {
        this.LIZIZ = c13bv;
        this.LIZLLL = i;
    }
}
