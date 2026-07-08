package X;

import com.bytedance.android.livesdk.chatroom.interact.model.CohostHistoryResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.00xN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC246700xN implements InterfaceC248400xe {
    public final InterfaceC246900xP LIZ;
    public final InterfaceC950820aqm LIZIZ;
    public final List<C955670ayb> LIZJ = new ArrayList();
    public final Map<Long, Pair<Room, RivalExtraInfo>> LIZLLL = new LinkedHashMap();
    public boolean LJ = true;
    public C11JF LJFF = (C11JF) C784440Upu.LIZ().LJ(C257100z3.class).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C516201zk(this, 117));

    public abstract void LIZJ(CohostHistoryResponse.ResponseData responseData);

    public abstract void LIZLLL();

    @Override // X.InterfaceC248400xe
    public void release() {
        ((ArrayList) this.LIZJ).clear();
        ((LinkedHashMap) this.LIZLLL).clear();
        C11JF c11jf = this.LJFF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJFF = null;
        this.LJ = true;
    }

    @Override // X.InterfaceC248400xe
    public final boolean LJIIJJI() {
        return this.LJ;
    }

    @Override // X.InterfaceC248400xe
    public final List<C955670ayb> Y1() {
        return this.LIZJ;
    }

    public final void onEvent(C257100z3 c257100z3) {
        FollowPair followPair;
        if (c257100z3 != null && (followPair = c257100z3.LIZ) != null) {
            Pair pair = (Pair) ((LinkedHashMap) this.LIZLLL).get(Long.valueOf(followPair.LIZ));
            if (pair != null) {
                LJ(((Room) pair.getFirst()).getOwner().getId(), (Room) pair.getFirst(), (RivalExtraInfo) pair.getSecond());
            }
        }
    }

    public AbstractC246700xN(InterfaceC246900xP interfaceC246900xP, InterfaceC950820aqm interfaceC950820aqm) {
        this.LIZ = interfaceC246900xP;
        this.LIZIZ = interfaceC950820aqm;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    @Override // X.InterfaceC248400xe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.android.livesdk.chatroom.interact.model.CohostHistoryResponse.ResponseData r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC246700xN.LIZ(com.bytedance.android.livesdk.chatroom.interact.model.CohostHistoryResponse$ResponseData, boolean):void");
    }

    @Override // X.InterfaceC248400xe
    public final void LIZIZ(Throwable th, boolean z) {
        InterfaceC246900xP interfaceC246900xP = this.LIZ;
        if (interfaceC246900xP != null) {
            interfaceC246900xP.gM();
        }
    }

    public final void LJ(long j, Room room, RivalExtraInfo rivalExtraInfo) {
        boolean z;
        InterfaceC950820aqm interfaceC950820aqm;
        if (rivalExtraInfo == null || room == null) {
            return;
        }
        if (((LinkedHashMap) this.LIZLLL).get(Long.valueOf(j)) != null) {
            z = true;
        } else {
            z = false;
        }
        this.LIZLLL.put(Long.valueOf(j), new Pair<>(room, rivalExtraInfo));
        if (z && (interfaceC950820aqm = this.LIZIZ) != null) {
            interfaceC950820aqm.LJFF(j, room, rivalExtraInfo);
        }
    }
}
