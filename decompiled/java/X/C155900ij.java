package X;

import com.bytedance.android.livesdk.sticker.game.IMinuteGameApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00ij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C155900ij {
    public static final C155900ij LIZ = new C155900ij();

    public final void LIZ(long j) {
        Object c098200Yq;
        if (j == 0) {
            C20441214yg.LJIIL("GameGiftRoomActiveGuard__ttlive_gift_render", "cleanupIfActive skipped: roomId == 0");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cleanupIfActive: querying room_active_gameplay for roomId=");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("GameGiftRoomActiveGuard__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
        try {
            C480460Ism.LIZ().getClass();
            c098200Yq = ((IMinuteGameApi) C480460Ism.LIZLLL(IMinuteGameApi.class)).getRoomActiveGameplay(j).LJIILIIL(new C0UO0()).LJJLL(new C516401zm(j, this, 7), new C516301zl(j, 7));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("room_active_gameplay dispatch threw, roomId=");
            sbLIZ2.append(j);
            C20441214yg.LJFF("GameGiftRoomActiveGuard__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ2), thM5exceptionOrNullimpl);
        }
    }
}
