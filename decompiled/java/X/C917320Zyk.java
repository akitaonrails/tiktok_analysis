package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Zyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917320Zyk {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        if (multiGuestDataHolder == null || (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder.LIZIZ()) == null) {
            multiLiveAnchorPanelSettingsLIZIZ = C924810aAp.LJ().LJJIII;
        }
        if (!(multiLiveAnchorPanelSettingsLIZIZ != null && multiLiveAnchorPanelSettingsLIZIZ.allowViewerReq == 3)) {
            if (multiLiveAnchorPanelSettingsLIZIZ != null) {
            }
            return new Pair("err", "err");
        }
        if (multiLiveAnchorPanelSettingsLIZIZ.onlyAllowFollowerReq == 4) {
            return new Pair("on", "on");
        }
        if (multiLiveAnchorPanelSettingsLIZIZ.allowViewerReq == 3 && multiLiveAnchorPanelSettingsLIZIZ.onlyAllowFollowerReq == 3) {
            return new Pair("off", "on");
        }
        if (multiLiveAnchorPanelSettingsLIZIZ.allowViewerReq == 4 && multiLiveAnchorPanelSettingsLIZIZ.onlyAllowFollowerReq == 4) {
            return new Pair("on", "on");
        }
        return new Pair("err", "err");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.EnumC918790a17 r8) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C917320Zyk.LIZIZ(X.0a17):void");
    }
}
