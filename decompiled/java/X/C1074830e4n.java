package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074830e4n implements Serializable {
    public final String contactName;
    public final String e164PhoneNumber;
    public final String nationalNumber;
    public final String phoneNumber;
    public final String photoUri;
    public final String regionCode;
    public final int regionCodeSource;
    public final String requestId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1074830e4n)) {
            return false;
        }
        C1074830e4n c1074830e4n = (C1074830e4n) obj;
        return Intrinsics.LJFF(this.contactName, c1074830e4n.contactName) && Intrinsics.LJFF(this.phoneNumber, c1074830e4n.phoneNumber) && Intrinsics.LJFF(this.nationalNumber, c1074830e4n.nationalNumber) && Intrinsics.LJFF(this.e164PhoneNumber, c1074830e4n.e164PhoneNumber) && Intrinsics.LJFF(this.photoUri, c1074830e4n.photoUri) && Intrinsics.LJFF(this.regionCode, c1074830e4n.regionCode) && this.regionCodeSource == c1074830e4n.regionCodeSource && Intrinsics.LJFF(this.requestId, c1074830e4n.requestId);
    }

    public int hashCode() {
        int iHashCode = ((((((this.contactName.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.nationalNumber.hashCode()) * 31) + this.e164PhoneNumber.hashCode()) * 31;
        String str = this.photoUri;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.regionCode;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.regionCodeSource) * 31;
        String str3 = this.requestId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContactBookFlatReadItem(contactName=");
        sbLIZ.append(this.contactName);
        sbLIZ.append(", phoneNumber=");
        sbLIZ.append(this.phoneNumber);
        sbLIZ.append(", nationalNumber=");
        sbLIZ.append(this.nationalNumber);
        sbLIZ.append(", e164PhoneNumber=");
        sbLIZ.append(this.e164PhoneNumber);
        sbLIZ.append(", photoUri=");
        sbLIZ.append(this.photoUri);
        sbLIZ.append(", regionCode=");
        sbLIZ.append(this.regionCode);
        sbLIZ.append(", regionCodeSource=");
        sbLIZ.append(this.regionCodeSource);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.requestId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1074830e4n(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        this.contactName = str;
        this.phoneNumber = str2;
        this.nationalNumber = str3;
        this.e164PhoneNumber = str4;
        this.photoUri = str5;
        this.regionCode = str6;
        this.regionCodeSource = i;
        this.requestId = str7;
    }
}
