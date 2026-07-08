package X;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C650940Pg4 implements Serializable {
    public final String enterCommentId;
    public final Map<String, String> extraLogParams;
    public Boolean isFromOutside;
    public String isFromPhoto;

    public C650940Pg4() {
        this(null, "", Boolean.FALSE, "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C650940Pg4)) {
            return false;
        }
        C650940Pg4 c650940Pg4 = (C650940Pg4) obj;
        return Intrinsics.LJFF(this.extraLogParams, c650940Pg4.extraLogParams) && Intrinsics.LJFF(this.enterCommentId, c650940Pg4.enterCommentId) && Intrinsics.LJFF(this.isFromOutside, c650940Pg4.isFromOutside) && Intrinsics.LJFF(this.isFromPhoto, c650940Pg4.isFromPhoto);
    }

    public int hashCode() {
        Map<String, String> map = this.extraLogParams;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.enterCommentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isFromOutside;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.isFromPhoto;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchEventModel(extraLogParams=");
        sbLIZ.append(this.extraLogParams);
        sbLIZ.append(", enterCommentId=");
        sbLIZ.append(this.enterCommentId);
        sbLIZ.append(", isFromOutside=");
        sbLIZ.append(this.isFromOutside);
        sbLIZ.append(", isFromPhoto=");
        sbLIZ.append(this.isFromPhoto);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isFromOutside() {
        return this.isFromOutside;
    }

    public final String isFromPhoto() {
        return this.isFromPhoto;
    }

    public final void setFromOutside(Boolean bool) {
        this.isFromOutside = bool;
    }

    public final void setFromPhoto(String str) {
        this.isFromPhoto = str;
    }

    public C650940Pg4(Map<String, String> map, String str, Boolean bool, String str2) {
        this.extraLogParams = map;
        this.enterCommentId = str;
        this.isFromOutside = bool;
        this.isFromPhoto = str2;
    }
}
