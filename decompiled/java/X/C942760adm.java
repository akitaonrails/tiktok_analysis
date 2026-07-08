package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.WallpaperContext;

/* JADX INFO: renamed from: X.0adm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942760adm extends AbstractC942990ae9 {
    public final List<WallpaperContext> LIZ;
    public final List<WallpaperContext> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C942760adm)) {
            return false;
        }
        C942760adm c942760adm = (C942760adm) obj;
        return Intrinsics.LJFF(this.LIZ, c942760adm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c942760adm.LIZIZ);
    }

    public final int hashCode() {
        List<WallpaperContext> list = this.LIZ;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<WallpaperContext> list2 = this.LIZIZ;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchPlayerSuccess(finishedList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", playList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C942760adm(List<WallpaperContext> list, List<WallpaperContext> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
