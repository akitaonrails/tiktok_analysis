package X;

import com.ss.android.ugc.aweme.avatar.AvatarComponentView;

/* JADX INFO: renamed from: X.0rvc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607300rvc {
    public static final AbstractC1153360g7S LIZ(C429270GsP c429270GsP) {
        if (c429270GsP == null) {
            return new C1153340g7Q(0);
        }
        if (C429260GsO.LIZ[c429270GsP.LIZ.ordinal()] == 1) {
            return new C1153350g7R(0);
        }
        return new C1153340g7Q(0);
    }

    public static final boolean LIZIZ(AvatarComponentView avatarComponentView) {
        return avatarComponentView.getCurrentActiveBusiness().get(EnumC1607270rvZ.ACTIVE) instanceof C1153350g7R;
    }
}
