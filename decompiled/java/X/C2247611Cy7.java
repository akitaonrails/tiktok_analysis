package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMockAvatarConfigSetting;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multi_guest_social_data.Video;

/* JADX INFO: renamed from: X.1Cy7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247611Cy7 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushParam ( surfaceWith=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", surfaceHeight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(" )");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2247611Cy7(C773070UUf c773070UUf, int i, int i2, int i3, int i4) {
        int i5;
        Video video;
        Video video2;
        int i6 = 0;
        if ((i4 & 1) != 0) {
            LinkMicMockAvatarConfigSetting linkMicMockAvatarConfigSetting = LinkMicMockAvatarConfigSetting.INSTANCE;
            if (linkMicMockAvatarConfigSetting.getValue().surfaceWidth > 0) {
                i5 = linkMicMockAvatarConfigSetting.getValue().surfaceWidth;
            } else {
                Avatar avatar = c773070UUf.LIZ;
                if (avatar != null && (video2 = avatar.videoDynamic) != null) {
                    i5 = video2.width;
                } else {
                    i5 = 540;
                }
            }
        } else {
            i5 = 0;
        }
        if ((i4 & 2) != 0) {
            LinkMicMockAvatarConfigSetting linkMicMockAvatarConfigSetting2 = LinkMicMockAvatarConfigSetting.INSTANCE;
            if (linkMicMockAvatarConfigSetting2.getValue().surfaceHeight > 0) {
                i6 = linkMicMockAvatarConfigSetting2.getValue().surfaceHeight;
            } else {
                Avatar avatar2 = c773070UUf.LIZ;
                if (avatar2 != null && (video = avatar2.videoDynamic) != null) {
                    i6 = video.height;
                } else {
                    i6 = 720;
                }
            }
        }
        if ((i4 & 4) != 0) {
            LinkMicMockAvatarConfigSetting linkMicMockAvatarConfigSetting3 = LinkMicMockAvatarConfigSetting.INSTANCE;
            if (linkMicMockAvatarConfigSetting3.getValue().outputWidth > 0) {
                i = linkMicMockAvatarConfigSetting3.getValue().outputWidth;
            } else {
                i = 540;
            }
        }
        if ((i4 & 8) != 0) {
            LinkMicMockAvatarConfigSetting linkMicMockAvatarConfigSetting4 = LinkMicMockAvatarConfigSetting.INSTANCE;
            if (linkMicMockAvatarConfigSetting4.getValue().outputHeight > 0) {
                i2 = linkMicMockAvatarConfigSetting4.getValue().outputHeight;
            } else {
                i2 = 1024;
            }
        }
        i3 = (i4 & 16) != 0 ? 15 : i3;
        this.LIZ = i5;
        this.LIZIZ = i6;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
    }
}
