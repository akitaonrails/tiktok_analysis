package X;

import com.ss.android.ugc.aweme.component.guide.InfoCollectGuideModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ulj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716490ulj implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL = CardStruct.IStatusCode.DEFAULT;
    public final String LLILZ = null;
    public final String LLILZIL = "default";
    public final InfoCollectGuideModel LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1716490ulj)) {
            return false;
        }
        C1716490ulj c1716490ulj = (C1716490ulj) obj;
        return Intrinsics.LJFF(this.LL, c1716490ulj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1716490ulj.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1716490ulj.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1716490ulj.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1716490ulj.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1716490ulj.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1716490ulj.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1716490ulj.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        String str = this.LLILZ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31;
        InfoCollectGuideModel infoCollectGuideModel = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (infoCollectGuideModel == null ? 0 : infoCollectGuideModel.hashCode())) * 31;
        String str2 = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLIZLLLIL;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuideSource(scene=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", needCallback=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", theme=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", guideContent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", realEnterFrom=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", session=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1716490ulj(String str, String str2, InfoCollectGuideModel infoCollectGuideModel, String str3, String str4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILZLL = infoCollectGuideModel;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
    }
}
