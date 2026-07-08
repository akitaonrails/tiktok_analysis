package X;

import com.ss.android.ugc.aweme.portrait.customize.model.PortraitRecommendedItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tzw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686860tzw {
    public final InterfaceC1665500tRU<PortraitRecommendedItem> LIZ;
    public final C1686970u07 LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1686860tzw)) {
            return false;
        }
        C1686860tzw c1686860tzw = (C1686860tzw) obj;
        return Intrinsics.LJFF(this.LIZ, c1686860tzw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1686860tzw.LIZIZ) && this.LIZJ == c1686860tzw.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PortraitCustomizeData(recommendStyles=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", customizeText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enableGenerateButton=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1686860tzw(InterfaceC1665500tRU<PortraitRecommendedItem> interfaceC1665500tRU, C1686970u07 c1686970u07, boolean z) {
        this.LIZ = interfaceC1665500tRU;
        this.LIZIZ = c1686970u07;
        this.LIZJ = z;
    }
}
