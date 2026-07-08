package X;

import com.ss.android.ugc.aweme.aiuikit.api.pages.creation.input.AiCreationCameoImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LgU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549280LgU implements InterfaceC549270LgT {
    public final String LIZ;
    public final AiCreationCameoImageModel LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C549280LgU)) {
            return false;
        }
        C549280LgU c549280LgU = (C549280LgU) obj;
        return Intrinsics.LJFF(this.LIZ, c549280LgU.LIZ) && Intrinsics.LJFF(this.LIZIZ, c549280LgU.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c549280LgU.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c549280LgU.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Integer num = this.LIZLLL;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Available(cameoId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cameoImage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", faceIdCreatedWay=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", activateFilter=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC549270LgT
    public final int LIZ() {
        return C549310LgX.LIZ(this);
    }

    public C549280LgU(String str, AiCreationCameoImageModel aiCreationCameoImageModel, String str2, Integer num) {
        this.LIZ = str;
        this.LIZIZ = aiCreationCameoImageModel;
        this.LIZJ = str2;
        this.LIZLLL = num;
    }
}
