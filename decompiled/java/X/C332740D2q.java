package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0D2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332740D2q {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Aweme aweme) {
        String groupId;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "playlist_entrance_use_aid", true) == 1) {
            groupId = aweme.getAid();
        } else {
            groupId = aweme.getGroupId();
        }
        if (groupId == null) {
            return "";
        }
        return groupId;
    }
}
