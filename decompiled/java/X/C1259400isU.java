package X;

import Y.ACListenerS154S0100000_19;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: renamed from: X.0isU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1259400isU extends RecyclerView.ViewHolder {
    public final View LL;
    public final C19EG LLILLJJLI;

    public static UrlModel I5(Aweme aweme) {
        Video video;
        if (aweme == null || !AwemeExtKt.isSharedStoryVisible(aweme) || AwemeExtKt.isCommentPostInvisible(aweme) || AwemeExtKt.isProhibited(aweme) || (video = aweme.getVideo()) == null) {
            return null;
        }
        return video.getCover();
    }

    public C1259400isU(View view, C19EG c19eg) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = c19eg;
        C786410Ut5.I7(new ACListenerS154S0100000_19(this, 210), view);
        C428150Gqb.LIZ(view, EnumC428940Grs.STRONG_MASK, 0.0f);
    }
}
