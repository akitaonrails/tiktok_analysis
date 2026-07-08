package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xWS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822340xWS extends AbstractC1781930wTH {
    public final ImageModel LL;
    public String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;
    public final String LLIZ;
    public final SMBVerificationInfo LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1822340xWS)) {
            return false;
        }
        C1822340xWS c1822340xWS = (C1822340xWS) obj;
        return Intrinsics.LJFF(this.LL, c1822340xWS.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1822340xWS.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1822340xWS.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1822340xWS.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1822340xWS.LLILZIL) && this.LLILZLL == c1822340xWS.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1822340xWS.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1822340xWS.LLIZLLLIL);
    }

    public final int hashCode() {
        ImageModel imageModel = this.LL;
        int iHashCode = (((((((((((((imageModel == null ? 0 : imageModel.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ.hashCode()) * 31;
        SMBVerificationInfo sMBVerificationInfo = this.LLIZLLLIL;
        return iHashCode + (sMBVerificationInfo != null ? sMBVerificationInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileHeader(avatar=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", bioContent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", email=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", phone=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showDMItem=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", dmSchema=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", verificationInfo=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1822340xWS(ImageModel imageModel, String str, String str2, String str3, String str4, boolean z, String str5, SMBVerificationInfo sMBVerificationInfo) {
        this.LL = imageModel;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = z;
        this.LLIZ = str5;
        this.LLIZLLLIL = sMBVerificationInfo;
    }
}
