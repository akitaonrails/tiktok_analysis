package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CwV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C329890CwV implements InterfaceC329670Cw9 {
    public final String LIZIZ;
    public final Aweme LIZJ;
    public final Long LIZLLL;
    public final boolean LJ;
    public final UrlModel LJFF;
    public final String LJI;
    public final long LJII;
    public final long LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C329890CwV)) {
            return false;
        }
        C329890CwV c329890CwV = (C329890CwV) obj;
        return Intrinsics.LJFF(this.LIZIZ, c329890CwV.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c329890CwV.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c329890CwV.LIZLLL) && this.LJ == c329890CwV.LJ && Intrinsics.LJFF(this.LJFF, c329890CwV.LJFF) && Intrinsics.LJFF(this.LJI, c329890CwV.LJI) && this.LJII == c329890CwV.LJII && this.LJIIIIZZ == c329890CwV.LJIIIIZZ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31;
        Long l = this.LIZLLL;
        return ((((((((((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentItem(text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", keyMoment=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showSourceText=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", userAvatar=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", userName=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", diggCount=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", cid=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC329670Cw9
    public final Long LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC329670Cw9
    public final boolean LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC329670Cw9
    public final Aweme getAweme() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC329670Cw9
    public final String getText() {
        return this.LIZIZ;
    }

    public C329890CwV(String str, Aweme aweme, Long l, boolean z, UrlModel urlModel, String str2, long j, long j2) {
        this.LIZIZ = str;
        this.LIZJ = aweme;
        this.LIZLLL = l;
        this.LJ = z;
        this.LJFF = urlModel;
        this.LJI = str2;
        this.LJII = j;
        this.LJIIIIZZ = j2;
    }
}
