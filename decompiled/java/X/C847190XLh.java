package X;

import com.orbu.core.TTKOrbu;
import com.orbu.core.adapter.TTKGeckoRequest;
import com.orbu.core.adapter.TTKResponse;
import com.orbu.core.adapter.TTKResponseKt;

/* JADX INFO: renamed from: X.0XLh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847190XLh {
    public static int LIZ(String str) {
        TTKResponse tTKResponseShouldInterceptTTKRequest = TTKOrbu.INSTANCE.shouldInterceptTTKRequest(new TTKGeckoRequest(str));
        if (tTKResponseShouldInterceptTTKRequest == null || !TTKResponseKt.isBlock(tTKResponseShouldInterceptTTKRequest)) {
            return 0;
        }
        return tTKResponseShouldInterceptTTKRequest.getStatusCode();
    }
}
