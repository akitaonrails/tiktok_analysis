package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0Q3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664130Q3f implements InterfaceC651110PgL {
    public final Aweme LIZ;

    @Override // X.InterfaceC651110PgL
    public final C0Q2Q<?> LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC651110PgL
    public final Bundle LIZ() {
        String aid;
        Bundle bundle = new Bundle();
        Aweme aweme = this.LIZ;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        C786410Ut5.LJJJI("group_id", aid, bundle);
        bundle.putBoolean("in_single_stack", true);
        C786410Ut5.LJJJI("search_from", "", bundle);
        C786410Ut5.LJJJI("enter_from", "", bundle);
        C786410Ut5.LJJJI("enter_method", "", bundle);
        C786410Ut5.LJJJI("keyword", "", bundle);
        bundle.putBoolean("set_hint_by_sug_word", true);
        bundle.putInt("back_flag", 0);
        Aweme aweme2 = this.LIZ;
        bundle.putBoolean("is_feed_liked", aweme2 != null ? aweme2.isLike() : false);
        Aweme aweme3 = this.LIZ;
        bundle.putBoolean("is_feed_collected", aweme3 != null ? AwemeExtKt.isCollected(aweme3) : false);
        Aweme aweme4 = this.LIZ;
        bundle.putBoolean("is_feed_comment_clicked", aweme4 != null ? AwemeBizExtKt.isCommentClicked(aweme4) : false);
        Aweme aweme5 = this.LIZ;
        bundle.putBoolean("is_feed_forward_clicked", aweme5 != null ? AwemeBizExtKt.isForwardClicked(aweme5) : false);
        C786410Ut5.LJJJI("extraLogParams", "", bundle);
        C786410Ut5.LJJJI("is_from_video", CardStruct.IStatusCode.DEFAULT, bundle);
        C786410Ut5.LJJJI("is_from_photo", CardStruct.IStatusCode.DEFAULT, bundle);
        C786410Ut5.LJJJI("is_from_comment", CardStruct.IStatusCode.DEFAULT, bundle);
        return bundle;
    }

    public C664130Q3f(Aweme aweme) {
        this.LIZ = aweme;
    }
}
