package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vIF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1736650vIF extends AbstractC1736670vIH {
    public final String LIZ;
    public final String LIZIZ;
    public final List<C1737770vK3> LIZJ;
    public final String LIZLLL;
    public final MobileEffect LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1736650vIF)) {
            return false;
        }
        C1736650vIF c1736650vIF = (C1736650vIF) obj;
        return Intrinsics.LJFF(this.LIZ, c1736650vIF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1736650vIF.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1736650vIF.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1736650vIF.LIZLLL) && Intrinsics.LJFF(this.LJ, c1736650vIF.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        MobileEffect mobileEffect = this.LJ;
        return iHashCode2 + (mobileEffect != null ? mobileEffect.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishSuccess(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", effectId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconPath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", draftId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mobileEffect=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1736650vIF(String str, String str2, List<C1737770vK3> list, String str3, MobileEffect mobileEffect) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
        this.LIZLLL = str3;
        this.LJ = mobileEffect;
    }
}
