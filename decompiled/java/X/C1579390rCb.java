package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.service.MiniDramaAccountService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rCb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1579390rCb {
    public boolean LIZ = true;
    public Boolean LIZIZ;
    public Boolean LIZJ;

    public final boolean LIZ() {
        String curUserId;
        if (!this.LIZ) {
            return false;
        }
        Boolean bool = this.LIZIZ;
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.LJFF(bool, bool2) || !Intrinsics.LJFF(this.LIZJ, bool2)) {
            return false;
        }
        MiniDramaAccountService.LIZ.getClass();
        MiniDramaAccountService miniDramaAccountServiceLIZ = C1578660rBQ.LIZ();
        if (miniDramaAccountServiceLIZ == null || (curUserId = miniDramaAccountServiceLIZ.getCurUserId()) == null || !C1573840r3e.LIZ(curUserId)) {
            return false;
        }
        MiniDramaAccountService miniDramaAccountServiceLIZ2 = C1578660rBQ.LIZ();
        return !Intrinsics.LJFF(miniDramaAccountServiceLIZ2 != null ? miniDramaAccountServiceLIZ2.getCurUserId() : null, CardStruct.IStatusCode.DEFAULT);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FirstShowSkylightCondition(canFirstOpen=");
        sbLIZ.append(LIZ());
        sbLIZ.append(", isWaitingFirstOpen=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFirstFrameReady=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isGuideFinished=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
