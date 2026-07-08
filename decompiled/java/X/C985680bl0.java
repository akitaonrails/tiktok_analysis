package X;

import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageAtmosphereSetting;

/* JADX INFO: renamed from: X.0bl0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985680bl0 {
    public static Uri LIZ(Uri uri) {
        if (LiveCoHostTakeTheStageAtmosphereSetting.INSTANCE.isEnable()) {
            return C500260Jjc.LJJJZ(uri, "roma_url_query", "extend_duration=1");
        }
        return C500260Jjc.LJJJZ(uri, "roma_url_query", "extend_duration=0");
    }
}
