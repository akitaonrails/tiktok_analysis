package X;

import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xWT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822350xWT implements InterfaceC1782150wTd {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final SMBVerificationInfo LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1822350xWT)) {
            return false;
        }
        C1822350xWT c1822350xWT = (C1822350xWT) obj;
        return Intrinsics.LJFF(this.LIZ, c1822350xWT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1822350xWT.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1822350xWT.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1822350xWT.LIZLLL) && Intrinsics.LJFF(this.LJ, c1822350xWT.LJ);
    }

    @Override // X.InterfaceC1782150wTd
    public final String getDesc() {
        throw null;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        SMBVerificationInfo sMBVerificationInfo = this.LJ;
        return iHashCode + (sMBVerificationInfo == null ? 0 : sMBVerificationInfo.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsServiceBioHeaderItem(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", email=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", phone=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", verificationInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1782150wTd
    public final String getTitle() {
        return this.LIZ;
    }

    public C1822350xWT(String str, String str2, String str3, String str4, SMBVerificationInfo sMBVerificationInfo) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = sMBVerificationInfo;
    }
}
