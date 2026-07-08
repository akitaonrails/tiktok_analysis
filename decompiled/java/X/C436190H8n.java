package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0H8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436190H8n {
    public static final String LIZIZ(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public static final String LIZ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        return aweme.getAid();
    }
}
