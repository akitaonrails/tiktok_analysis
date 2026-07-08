package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764950TzZ extends AbstractC764660Tz6 {
    public final int LIZ;
    public final String LIZIZ;
    public final List<C0U22> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C764950TzZ)) {
            return false;
        }
        C764950TzZ c764950TzZ = (C764950TzZ) obj;
        return this.LIZ == c764950TzZ.LIZ && Intrinsics.LJFF(this.LIZIZ, c764950TzZ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c764950TzZ.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateSearchList(categoryId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", keyword=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", songList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C764950TzZ(int i, String str, List<C0U22> list) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = list;
    }
}
