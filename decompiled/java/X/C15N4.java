package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.tcm.push.BCVideosInPushMsg;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.LinkedHashMap;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.15N4, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15N4 implements InterfaceC486470J5x {
    public static final C15N6 LLILLJJLI = new Object() { // from class: X.15N6
    };
    public static C15N4 LLILLL;
    public BCVideosInPushMsg LL;

    public C15N4() {
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        c2203431BLp.LJI(20164, 1, this);
        c2203431BLp.LJI(20047, 1, this);
    }

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        String uid;
        User currentUser;
        try {
            BCVideosInPushMsg bCVideosInPushMsg = (BCVideosInPushMsg) JsonParseUtils.LIZLLL(BCVideosInPushMsg.class, new String(wsChannelMsg.LIZ(), Charsets.UTF_8));
            this.LL = bCVideosInPushMsg;
            if (bCVideosInPushMsg != null) {
                InterfaceC1770740wBE interfaceC1770740wBE = (InterfaceC1770740wBE) C04PM.LIZ.LIZ();
                if (interfaceC1770740wBE != null && (currentUser = interfaceC1770740wBE.getCurrentUser()) != null) {
                    uid = currentUser.getUid();
                } else {
                    uid = null;
                }
                bCVideosInPushMsg.LIZ = uid;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("videoCounts", Integer.valueOf(bCVideosInPushMsg.newContentNum));
            long j = bCVideosInPushMsg.updateTime;
            new C1061730djf();
            C1548820qPI.LIZIZ(new C397901gf(j, C1061730djf.LIZLLL(linkedHashMap), "onBCVideoCountsChange"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
