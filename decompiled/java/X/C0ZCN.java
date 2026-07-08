package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZCN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZCN implements InterfaceC714750S1x {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LJ;
    public final String LJFF;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LIZLLL = CardStruct.IStatusCode.DEFAULT;
    public final Boolean LJI = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZCN)) {
            return false;
        }
        C0ZCN c0zcn = (C0ZCN) obj;
        return Intrinsics.LJFF(this.LIZ, c0zcn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0zcn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0zcn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0zcn.LIZLLL) && Intrinsics.LJFF(this.LJ, c0zcn.LJ) && Intrinsics.LJFF(this.LJFF, c0zcn.LJFF) && Intrinsics.LJFF(this.LJI, c0zcn.LJI) && Intrinsics.LJFF(this.LJII, c0zcn.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0zcn.LJIIIIZZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str2 = this.LJ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJFF;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.LJI;
        return ((((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostScene(withRecommendation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isRepostQuickReply=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isRepostAiEmoji=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isShortenPath=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", repostMentionCnt=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", repostMentionType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isAlsoRecommend=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", repostType=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC714750S1x
    public final Map<String, String> LIZ() {
        C13DA c13da = new C13DA();
        LIZIZ("with_recommendation", this.LIZ, c13da);
        LIZIZ("is_shorten_path", this.LIZLLL, c13da);
        LIZIZ("is_repost_quick_reply", this.LIZIZ, c13da);
        LIZIZ("is_repost_ai_emoji", this.LIZJ, c13da);
        LIZIZ("repost_mention_cnt", this.LJ, c13da);
        LIZIZ("repost_mention_type", this.LJFF, c13da);
        Boolean bool = this.LJI;
        LIZIZ("is_also_recommend", String.valueOf(bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null), c13da);
        LIZIZ("tab_name", this.LJII, c13da);
        LIZIZ("repost_type", this.LJIIIIZZ, c13da);
        return c13da.build();
    }

    public static void LIZIZ(String str, String str2, C13DA c13da) {
        if (str2 != null) {
            c13da.put(str, str2);
        }
    }

    public C0ZCN(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
    }
}
