package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import java.util.List;

/* JADX INFO: renamed from: X.0Sfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727150Sfh extends AbstractC727240Sfq<UserStory, Aweme> {
    public static final C727150Sfh LIZLLL = new C727150Sfh();

    @Override // X.AbstractC727240Sfq
    public final List LIZ(UserStory userStory, UserStory userStory2) {
        return userStory2.diffProperties(userStory);
    }

    @Override // X.AbstractC727240Sfq
    public final Object LIZJ(UserStory userStory, Aweme aweme) {
        return AwemeExtKt.getAuthorUid(aweme);
    }
}
