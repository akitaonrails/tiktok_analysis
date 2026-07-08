package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0T1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740250T1z {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C20096413kA c20096413kA, Context context, Aweme aweme) {
        User author;
        int size;
        if (context == null || aweme == null || (author = aweme.getAuthor()) == null) {
            return;
        }
        String nickname = author.getNickname();
        if (AwemeExtKt.isPhotoMode(aweme) && C1EE2.LIZIZ.LIZIZ()) {
            Resources resources = context.getResources();
            if (aweme.getImageInfos() != null) {
                size = aweme.getImageInfos().size();
            } else {
                size = 3;
            }
            String quantityString = resources.getQuantityString(2131755045, size, nickname);
            c20096413kA.getClass();
            C20096413kA.LIZIZ(100L, context, quantityString, true);
        }
    }
}
