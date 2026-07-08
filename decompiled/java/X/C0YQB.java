package X;

import com.bytedance.im.core.proto.MediaUploadConfig;

/* JADX INFO: renamed from: X.0YQB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YQB {
    public static final C0YQG LIZ(MediaUploadConfig mediaUploadConfig) {
        return new C0YQG(mediaUploadConfig.resource_space, mediaUploadConfig.host, new C874210YRf(mediaUploadConfig.access_key, mediaUploadConfig.session_token, mediaUploadConfig.secret_access_key, mediaUploadConfig.expiry_time.toString(), mediaUploadConfig.current_time.toString()));
    }
}
