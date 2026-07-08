package X;

import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PmH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C654790PmH extends C654720PmA<C654790PmH> {
    public String LJIJ;

    @Override // X.C0Q2Q, X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str;
        if (Intrinsics.LJFF(this.LIZLLL, "visual_search")) {
            String str2 = this.LJIJ;
            if (str2 == null || str2.length() <= 0) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                LJIIZILJ("recommend_reason", str2);
                str = "1";
            }
            LJIIZILJ("is_have_recommend_reason", str);
        }
    }

    public C654790PmH(C653660PkS c653660PkS) {
        super("feed_enter", c653660PkS);
        LJJIL();
    }

    public final void LJJJIL(Aweme aweme) {
        String type;
        VideoTag videoTag;
        if (aweme != null) {
            LJIIZILJ("author_id", AwemeExtKt.getAuthorUid(aweme));
            LJIL(aweme.getGroupId());
            LJIIZILJ("request_id", aweme.getRequestId());
            if (AwemeBizExtKt.getRank(aweme) != -1) {
                LJJIIZ(Integer.valueOf(AwemeBizExtKt.getRank(aweme)));
            }
            LJIIZILJ("aweme_id", aweme.getAid());
            Video video = aweme.getVideo();
            if (video != null && (videoTag = video.getVideoTag()) != null) {
                type = videoTag.getType();
            } else {
                type = null;
            }
            this.LJIJ = type;
        }
    }
}
