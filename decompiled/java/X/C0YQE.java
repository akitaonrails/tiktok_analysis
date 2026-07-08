package X;

import com.bytedance.im.core.proto.MediaUploadConfig;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPreloadTTLSetting;

/* JADX INFO: renamed from: X.0YQE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YQE {
    public static final boolean LIZ(MediaUploadConfig mediaUploadConfig) {
        if (System.currentTimeMillis() + ((long) FriendsTabPreloadTTLSetting.DEFAULT) > mediaUploadConfig.expiry_time.longValue()) {
            return true;
        }
        return false;
    }
}
