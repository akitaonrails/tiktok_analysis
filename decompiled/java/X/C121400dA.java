package X;

import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00dA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C121400dA {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final List<String> LJI;
    public final GiftGalleryBadgeInfo LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121400dA)) {
            return false;
        }
        C121400dA c121400dA = (C121400dA) obj;
        return this.LIZ == c121400dA.LIZ && this.LIZIZ == c121400dA.LIZIZ && this.LIZJ == c121400dA.LIZJ && Intrinsics.LJFF(this.LIZLLL, c121400dA.LIZLLL) && Intrinsics.LJFF(this.LJ, c121400dA.LJ) && Intrinsics.LJFF(this.LJFF, c121400dA.LJFF) && Intrinsics.LJFF(this.LJI, c121400dA.LJI) && Intrinsics.LJFF(this.LJII, c121400dA.LJII);
    }

    public final int hashCode() {
        return (((((((((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickMatchUserPayload(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", displayId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", avatarUrls=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", badge=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", this.LIZ);
        jSONObject.put("channel_id", this.LIZIZ);
        jSONObject.put("user_id", this.LIZJ);
        jSONObject.put("display_id", this.LIZLLL);
        jSONObject.put("sec_uid", this.LJ);
        jSONObject.put("nickname", this.LJFF);
        jSONObject.put("avatar_urls", new JSONArray((Collection) this.LJI));
        jSONObject.put("badge", new JSONObject(GsonProtectorUtils.toJson(C293501Bt.LIZ(), this.LJII)));
        return jSONObject;
    }

    public C121400dA(long j, long j2, long j3, String str, String str2, String str3, List<String> list, GiftGalleryBadgeInfo giftGalleryBadgeInfo) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = list;
        this.LJII = giftGalleryBadgeInfo;
    }
}
