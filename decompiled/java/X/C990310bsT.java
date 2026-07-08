package X;

import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0bsT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990310bsT {
    public static final LinkedHashMap<String, LinkData> LIZ = new LinkedHashMap<>(12, 0.75f, true);

    public static LinkData LIZ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.getLinkAdData() == null && AwemeExtKt.getNeedPreloadAdLink(aweme)) {
            aweme.setLinkAdData(LIZ.get(aweme.getAid()));
        }
        return aweme.getLinkAdData();
    }
}
