package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: renamed from: X.0ILv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465130ILv implements C0IXD {
    public static final String LIZLLL = C465130ILv.class.getSimpleName();
    public static volatile C465130ILv LJ;
    public final Map<String, C0IEB> LIZIZ = new HashMap();
    public final Queue<C0IEB> LIZJ = new LinkedList();

    public static C465130ILv LIZIZ() {
        if (LJ == null) {
            synchronized (C465130ILv.class) {
                try {
                    if (LJ == null) {
                        LJ = new C465130ILv();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public static void LJFF(int i) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_pre_player_state");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "state");
        c474500IjALIZ.LIZ();
    }

    public final C0IEB LIZJ(String str) {
        return (C0IEB) ((HashMap) this.LIZIZ).get(str);
    }

    public final C0IEB LIZLLL(String str) {
        if (((HashMap) this.LIZIZ).containsKey(str)) {
            return (C0IEB) ((HashMap) this.LIZIZ).get(str);
        }
        return null;
    }

    public final void LJI(C0IEB c0ieb) {
        Iterator it2 = ((HashMap) this.LIZIZ).entrySet().iterator();
        while (it2.hasNext()) {
            C0IEB c0ieb2 = (C0IEB) ((Map.Entry) it2.next()).getValue();
            if (c0ieb2 != null) {
                if (c0ieb == null || !TextUtils.equals(c0ieb2.getPlayerTag(), c0ieb.getPlayerTag())) {
                    if (c0ieb2.isPullParallel()) {
                    }
                }
            }
            c0ieb2.stop(true);
            c0ieb2.release();
            it2.remove();
        }
    }

    public final C0IEB LIZ(C0IMA c0ima, Context context, String str, String str2, String str3, String str4, StreamUrlExtra.SrConfig srConfig, LiveMode liveMode, long j, boolean z) {
        C0IEB roomPlayer2;
        C786410Ut5.N3(context);
        C465140ILw c465140ILw = new C465140ILw();
        c465140ILw.LIZ = str3;
        if (!TextUtils.isEmpty(str3)) {
            c465140ILw.LJII = 1;
        }
        c465140ILw.LIZIZ = str4;
        c465140ILw.LIZJ = str;
        if (c465140ILw.LJII == 0 && !TextUtils.isEmpty(str)) {
            c465140ILw.LJII = 2;
        }
        c465140ILw.LIZLLL = str2;
        c465140ILw.LJ = liveMode;
        c465140ILw.LJFF = srConfig;
        c465140ILw.LJI = j;
        if (!this.LIZJ.isEmpty() && (roomPlayer2 = (C0IEB) ((LinkedList) this.LIZJ).poll()) != null) {
            roomPlayer2.setIsPreparePlayer(z);
            roomPlayer2.initialize(c0ima, c465140ILw);
        } else {
            roomPlayer2 = new RoomPlayer2(c0ima, c465140ILw, z);
        }
        ((HashMap) this.LIZIZ).put(roomPlayer2.getPlayerTag(), roomPlayer2);
        if (roomPlayer2.getIsPreparePlayer()) {
            LJFF(0);
        }
        String str5 = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createRoomPlayer -> playerTag: ");
        sbLIZ.append(roomPlayer2.getPlayerTag());
        C827750WdZ.LIZ(str5, C2188811AlT.LIZIZ(sbLIZ));
        return roomPlayer2;
    }

    public final C0IEB LJ(C0IMA c0ima, Context context, String str, String str2, String str3, String str4, StreamUrlExtra.SrConfig srConfig, LiveMode liveMode, boolean z, String str5, String str6, long j, boolean z2, Integer num, String str7, boolean z3) {
        if (context != null) {
            if (!C2093608Ic.LJ(str) || !C2093608Ic.LJ(str3)) {
                String str8 = LIZLLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("with stream data, pre warm up, roomId: ");
                sbLIZ.append(C0IM9.LIZ(c0ima));
                C20441214yg.LJIIIZ(str8, C2188811AlT.LIZIZ(sbLIZ));
                C465050ILn.LJ(C0IM9.LIZ(c0ima), "live_room_player_create");
                C0IEB c0iebLIZ = LIZ(c0ima, context, str, str2, str3, str4, srConfig, liveMode, j, false);
                c0iebLIZ.setReusePlayer(z, str5, z2);
                c0iebLIZ.setEnterRoomScene(str6);
                c0iebLIZ.setEnterMethodSubtag(str7, false);
                ((C0IXA) c0iebLIZ.getLogger()).LJIIIIZZ = z3;
                if (num == null) {
                    c0iebLIZ.setIsPrivate(0L);
                } else {
                    c0iebLIZ.setIsPrivate(Long.valueOf(num.longValue()));
                }
                c0iebLIZ.warmUp();
                return c0iebLIZ;
            }
            return null;
        }
        return null;
    }
}
