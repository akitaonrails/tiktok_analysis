package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19w3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21698919w3 implements Serializable {
    public String authorId;
    public Integer awemeType;
    public String bizParams;
    public final String componentKey;
    public final String componentType;
    public String enterFrom;
    public final String enterMethod;
    public String groupId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21698919w3)) {
            return false;
        }
        C21698919w3 c21698919w3 = (C21698919w3) obj;
        return Intrinsics.LJFF(this.groupId, c21698919w3.groupId) && Intrinsics.LJFF(this.authorId, c21698919w3.authorId) && Intrinsics.LJFF(this.enterFrom, c21698919w3.enterFrom) && Intrinsics.LJFF(this.awemeType, c21698919w3.awemeType) && Intrinsics.LJFF(this.enterMethod, c21698919w3.enterMethod) && Intrinsics.LJFF(this.componentKey, c21698919w3.componentKey) && Intrinsics.LJFF(this.componentType, c21698919w3.componentType);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlexibleSheetMobParams(groupId=");
        sbLIZ.append(this.groupId);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.authorId);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.awemeType);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", componentKey=");
        sbLIZ.append(this.componentKey);
        sbLIZ.append(", componentType=");
        sbLIZ.append(this.componentType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setAwemeType(Integer num) {
        this.awemeType = num;
    }

    public final void setBizParams(String str) {
        this.bizParams = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public C21698919w3(String str, String str2, String str3, Integer num, String str4, String str5, String str6) {
        this.groupId = str;
        this.authorId = str2;
        this.enterFrom = str3;
        this.awemeType = num;
        this.enterMethod = str4;
        this.componentKey = str5;
        this.componentType = str6;
    }
}
