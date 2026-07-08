package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;

/* JADX INFO: renamed from: X.0az2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955940az2 {
    public static final boolean LIZ(RivalExtraInfo rivalExtraInfo) {
        if (rivalExtraInfo == null || rivalExtraInfo.inviteBlockReason > 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(RivalExtraInfo rivalExtraInfo) {
        if (!LIZ(rivalExtraInfo)) {
            return false;
        }
        boolean zO1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1();
        if (rivalExtraInfo != null && rivalExtraInfo.showPlayType == 2 && zO1) {
            return true;
        }
        return !zO1;
    }

    public static final void LIZJ(RivalExtraInfo rivalExtraInfo, int i, int i2, C955590ayT c955590ayT) {
        if (rivalExtraInfo == null) {
            return;
        }
        rivalExtraInfo.detailBlockReason = i2;
        rivalExtraInfo.inviteBlockReason = i;
        if (c955590ayT != null) {
            c955590ayT.LJIJ = c955590ayT.LJ();
        }
    }
}
