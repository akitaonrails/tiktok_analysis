package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0Co9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C324710Co9 {
    public static boolean LIZ(Aweme aweme) {
        return TextUtils.equals(C0XQ7.LJFF().getCurUserId(), AwemeExtKt.getAuthorUid(aweme));
    }
}
