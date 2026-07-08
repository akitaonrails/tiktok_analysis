package X;

import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sT6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628060sT6 implements InterfaceC1627890sSp {
    public final String LIZ;
    public final C1668880tWw LIZIZ;
    public final String LIZJ;
    public final UrlModel LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1628060sT6)) {
            return false;
        }
        C1628060sT6 c1628060sT6 = (C1628060sT6) obj;
        return Intrinsics.LJFF(this.LIZ, c1628060sT6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1628060sT6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1628060sT6.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1628060sT6.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C1668880tWw c1668880tWw = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (c1668880tWw == null ? 0 : c1668880tWw.hashCode())) * 31) + this.LIZJ.hashCode()) * 31;
        UrlModel urlModel = this.LIZLLL;
        return iHashCode2 + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UriItem(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", badge=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", urlModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1627890sSp
    public final String getId() {
        return this.LIZJ;
    }

    public C1628060sT6(String str, C1668880tWw c1668880tWw, String str2, UrlModel urlModel) {
        this.LIZ = str;
        this.LIZIZ = c1668880tWw;
        this.LIZJ = str2;
        this.LIZLLL = urlModel;
    }
}
