package X;

import com.ss.android.ugc.aweme.avatar.AvatarComponentView;

/* JADX INFO: renamed from: X.0ryo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609280ryo {
    public static final C1608740rxw LIZ(AvatarComponentView avatarComponentView) {
        int avatarSizePx;
        int containerWidthPx;
        int containerHeightPx = 0;
        if (avatarComponentView != null) {
            avatarSizePx = avatarComponentView.getAvatarSizePx();
            containerWidthPx = avatarComponentView.getContainerWidthPx();
            containerHeightPx = avatarComponentView.getContainerHeightPx();
        } else {
            avatarSizePx = 0;
            containerWidthPx = 0;
        }
        return new C1608740rxw(avatarSizePx, containerWidthPx, containerHeightPx);
    }
}
