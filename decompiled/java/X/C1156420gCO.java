package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156420gCO<T> implements InterfaceC1172200gbq {
    public final T LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final Object LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156420gCO)) {
            return false;
        }
        C1156420gCO c1156420gCO = (C1156420gCO) obj;
        return Intrinsics.LJFF(this.LIZ, c1156420gCO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1156420gCO.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1156420gCO.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1156420gCO.LIZLLL) && this.LJ == c1156420gCO.LJ;
    }

    public final int hashCode() {
        T t = this.LIZ;
        return ((((((((t == null ? 0 : t.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoItemModelWithOriginal(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", avatarList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", date=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", viewType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1172200gbq
    public final String LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1172200gbq
    public final List<String> getAvatarList() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1172200gbq
    public final String getCoverUrl() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1172200gbq
    public final int getViewType() {
        return this.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1156420gCO(int i, Object obj, String str, String str2, List list) {
        this.LIZ = obj;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = str2;
        this.LJ = i;
        this.LJFF = obj;
    }
}
