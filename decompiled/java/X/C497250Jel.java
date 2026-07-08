package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.api.EmoteUploadInfo;

/* JADX INFO: renamed from: X.0Jel, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497250Jel {
    public static final boolean LIZ(EmoteModel emoteModel, long j) {
        EmoteUploadInfo emoteUploadInfo = emoteModel.emoteUploadInfo;
        if (emoteUploadInfo != null && emoteUploadInfo.userId != j && emoteModel.createTime != 0) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(EmoteModel emoteModel, long j) {
        EmoteUploadInfo emoteUploadInfo = emoteModel.emoteUploadInfo;
        if (emoteUploadInfo != null && emoteUploadInfo.userId == j && emoteModel.createTime != 0) {
            return true;
        }
        return false;
    }
}
