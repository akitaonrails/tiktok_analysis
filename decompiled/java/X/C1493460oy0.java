package X;

import android.text.TextUtils;
import com.bytedance.ttnet.TTNetInit;

/* JADX INFO: renamed from: X.0oy0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493460oy0 {
    public static String LIZ() {
        TTNetInit.getTTNetDepend().LJIIJJI();
        if (TextUtils.isEmpty(".tiktokv.com")) {
            throw new IllegalArgumentException("hostSuffix is not init !!!");
        }
        return ".tiktokv.com";
    }
}
