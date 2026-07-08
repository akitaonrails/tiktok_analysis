package X;

import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;

/* JADX INFO: renamed from: X.166t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207217166t {
    public static final void LIZ(LiveSubMediaModel liveSubMediaModel, LiveSubMediaModel liveSubMediaModel2) {
        if (liveSubMediaModel2 == null) {
            return;
        }
        liveSubMediaModel.setFileLocalUriPath(liveSubMediaModel2.getFileLocalUriPath());
        liveSubMediaModel.setWidth(liveSubMediaModel2.getWidth());
        liveSubMediaModel.setHeight(liveSubMediaModel2.getHeight());
        liveSubMediaModel.setFileName(liveSubMediaModel2.getFileName());
        liveSubMediaModel.setWithTextSticker(liveSubMediaModel2.getWithTextSticker());
    }
}
