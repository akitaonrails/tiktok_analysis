package X;

import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0UKs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770600UKs {
    public static final void LIZ(Uri.Builder builder) {
        if (SecondPageCodeCacheABSetting.INSTANCE.isMatch()) {
            builder.appendQueryParameter("enable_code_cache", "1");
        } else {
            builder.appendQueryParameter("enable_code_cache", CardStruct.IStatusCode.DEFAULT);
        }
    }
}
