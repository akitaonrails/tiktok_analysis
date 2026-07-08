package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0S77, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S77 {
    public static boolean LIZ(Aweme aweme) {
        if (aweme == null || !AwemeSaaSExtKt.isForwardAweme(aweme) || !TextUtils.isEmpty(aweme.getDesc())) {
            return false;
        }
        if (!C086I.LIZIZ(aweme.getTextExtra())) {
            Iterator<TextExtraStruct> it2 = aweme.getTextExtra().iterator();
            while (it2.hasNext()) {
                if (it2.next().getType() == 4) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }
}
