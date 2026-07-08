package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.0bRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973710bRh {
    public static final void LIZ(Map<String, String> map) {
        String str;
        if (C915980Zwa.LIZLLL().L6()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_enlarge_mode", str);
    }
}
