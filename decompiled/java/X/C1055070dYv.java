package X;

import android.os.Build;
import android.os.Bundle;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.CommentReviewTabFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1055070dYv extends C09AY implements Function0<Aweme> {
    public final /* synthetic */ CommentReviewTabFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1055070dYv(CommentReviewTabFragment commentReviewTabFragment) {
        super(0);
        this.LL = commentReviewTabFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.feed.model.Aweme, java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function0
    public final Aweme invoke() {
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = this.LL.getArguments();
            if (arguments != null) {
                return arguments.getSerializable("reviews_host_aweme", Aweme.class);
            }
            return null;
        }
        Bundle arguments2 = this.LL.getArguments();
        ?? serializable = arguments2 != null ? arguments2.getSerializable("reviews_host_aweme") : 0;
        if (serializable instanceof Aweme) {
            return serializable;
        }
        return null;
    }
}
