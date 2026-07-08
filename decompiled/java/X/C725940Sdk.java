package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sdk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725940Sdk implements C15W0 {
    public final Aweme LIZ;
    public final Integer LIZIZ;
    public final String LIZJ;
    public final String LIZLLL = "dislike_reason_submit";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C725940Sdk)) {
            return false;
        }
        C725940Sdk c725940Sdk = (C725940Sdk) obj;
        return Intrinsics.LJFF(this.LIZ, c725940Sdk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c725940Sdk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c725940Sdk.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LIZJ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DislikeUserET(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", modelSource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showCommentNumber=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C15W0
    public final Map<String, String> LIZ() {
        String aid = this.LIZ.getAid();
        aid.toString();
        return C2097608Jq.LJIIIIZZ(new Pair("enter_from", "homepage_explore"), new Pair("group_id", aid), new Pair("author_id", AwemeExtKt.getAuthorUid(this.LIZ)), new Pair("aweme_type", String.valueOf(this.LIZ.getAwemeType())), new Pair("pic_cnt", String.valueOf(C0S7E.LIZ(this.LIZ))), new Pair("log_pb", this.LIZ.getLogPbString()), new Pair("request_id", C735370Ssx.LJIJJ(this.LIZ)), new Pair("reason_id", Collections.singletonList("1").toString()), new Pair("enter_method", "long_press"), new Pair("model_source", String.valueOf(this.LIZIZ)), new Pair("show_comment_number", String.valueOf(this.LIZJ)));
    }

    @Override // X.C15W0
    public final String getEventName() {
        return this.LIZLLL;
    }

    public C725940Sdk(Aweme aweme, Integer num, String str) {
        this.LIZ = aweme;
        this.LIZIZ = num;
        this.LIZJ = str;
    }
}
