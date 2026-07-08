package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D4T, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D4T implements Serializable {
    public final String avatarUrl;
    public final String content;
    public final String date;
    public final String id;
    public final List<String> imageUrls;
    public final Float rating;
    public final String starDisplay;
    public final String userName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D4T)) {
            return false;
        }
        C0D4T c0d4t = (C0D4T) obj;
        return Intrinsics.LJFF(this.id, c0d4t.id) && Intrinsics.LJFF(this.avatarUrl, c0d4t.avatarUrl) && Intrinsics.LJFF(this.userName, c0d4t.userName) && Intrinsics.LJFF(this.rating, c0d4t.rating) && Intrinsics.LJFF(this.starDisplay, c0d4t.starDisplay) && Intrinsics.LJFF(this.date, c0d4t.date) && Intrinsics.LJFF(this.content, c0d4t.content) && Intrinsics.LJFF(this.imageUrls, c0d4t.imageUrls);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.avatarUrl.hashCode()) * 31;
        String str = this.userName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.rating;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.starDisplay;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.date;
        return ((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.content.hashCode()) * 31) + this.imageUrls.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpReviewState(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", avatarUrl=");
        sbLIZ.append(this.avatarUrl);
        sbLIZ.append(", userName=");
        sbLIZ.append(this.userName);
        sbLIZ.append(", rating=");
        sbLIZ.append(this.rating);
        sbLIZ.append(", starDisplay=");
        sbLIZ.append(this.starDisplay);
        sbLIZ.append(", date=");
        sbLIZ.append(this.date);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", imageUrls=");
        sbLIZ.append(this.imageUrls);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D4T(String str, String str2, String str3, Float f, String str4, String str5, String str6, List<String> list) {
        this.id = str;
        this.avatarUrl = str2;
        this.userName = str3;
        this.rating = f;
        this.starDisplay = str4;
        this.date = str5;
        this.content = str6;
        this.imageUrls = list;
    }
}
