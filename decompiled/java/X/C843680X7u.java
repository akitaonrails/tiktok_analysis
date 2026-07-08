package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import kotlin.jvm.internal.AFwS247S0000000_13;

/* JADX INFO: renamed from: X.0X7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C843680X7u {
    public static void LIZ() {
        Forest forestLIZ = C0T1N.LIZ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.channel = "tiktok_webview_hook";
        requestParams.bundle = "hook.js";
        requestParams.needLocalFile = Boolean.FALSE;
        requestParams.loadToMemory = true;
        forestLIZ.fetchResourceAsync("", requestParams, AFwS247S0000000_13.get$arr$(20));
    }
}
