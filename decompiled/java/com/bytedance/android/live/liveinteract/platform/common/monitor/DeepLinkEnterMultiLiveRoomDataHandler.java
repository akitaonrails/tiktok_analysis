package com.bytedance.android.live.liveinteract.platform.common.monitor;

import X.C0IL2;
import X.C1161920gLG;
import X.C500260Jjc;
import X.C766270U4b;
import X.C784440Upu;
import X.C924810aAp;
import X.C926240aD8;
import X.InterfaceC926550aDd;
import X.InterfaceC948500an2;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "DATA_MULTI_LIVE_DEEP_LINK_ENTER_ROOM")
public final class DeepLinkEnterMultiLiveRoomDataHandler implements InterfaceC926550aDd {
    public static final /* synthetic */ int LJI = 0;
    public String LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public int LIZLLL = -1;
    public boolean LJ = true;
    public int LJFF;

    public final String LIZIZ() {
        return 2 == this.LIZLLL ? this.LJ ? "from_activitypage_redirect" : "from_activitypage" : "";
    }

    public final void LIZJ() {
        if (this.LIZ == null) {
            return;
        }
        int i = 1;
        int i2 = this.LJFF + 1;
        this.LJFF = i2;
        if (this.LIZLLL == 0 && i2 == 1) {
            this.LIZIZ = true;
        } else {
            this.LIZ = null;
            this.LJFF = 0;
            i = -1;
            this.LIZLLL = -1;
        }
        this.LIZLLL = i;
    }

    @Override // X.InterfaceC926550aDd
    public final void LIZ(Room room) {
        LIZLLL(room, false, "1");
        LJFF(room);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(kotlin.jvm.functions.Function0<kotlin.Unit> r10) {
        /*
            r9 = this;
            java.lang.String r2 = r9.LIZ
            r6 = -1
            r5 = 0
            java.lang.String r1 = "1"
            r4 = 1
            r3 = 0
            if (r2 == 0) goto L6e
            boolean r0 = r9.LIZIZ
            if (r0 == 0) goto L79
            int r0 = r9.LIZLLL
            if (r0 != r4) goto L79
            boolean r0 = r9.LIZJ
            if (r0 != 0) goto L79
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
            if (r0 == 0) goto L79
            X.0INV r0 = X.C0IL2.LIZ
            com.bytedance.android.livesdkapi.session.EnterRoomLinkSession r0 = r0.LIZ()
            if (r0 == 0) goto L76
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r8 = r0.mEnterRoomConfig
            if (r8 == 0) goto L77
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r8.mRoomsData
            if (r0 == 0) goto L77
            java.lang.String r0 = r0.isFromMgTopLive
        L2e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto L5c
            X.0aEk r7 = new X.0aEk
            java.lang.String r1 = "hangout"
            java.lang.String r0 = "apply"
            r7.<init>(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r2 = r7.LIZJ
            if (r8 == 0) goto L49
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r8.mRoomsData
            if (r0 == 0) goto L49
            java.lang.String r1 = r0.enterMethod
            if (r1 != 0) goto L4b
        L49:
            java.lang.String r1 = ""
        L4b:
            java.lang.String r0 = "link_page_entrance"
            r2.put(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r2 = r7.LIZJ
            java.lang.String r1 = "guest_invite_type"
            java.lang.String r0 = "guest_apply_anchor"
            r2.put(r1, r0)
            r7.LIZ()
        L5c:
            java.lang.String r0 = r9.LIZ
            if (r0 == 0) goto L6b
            r9.LIZ = r5
            r9.LIZJ = r4
            int r0 = r9.LIZLLL
            if (r0 != r4) goto L6f
            r6 = 2
        L69:
            r9.LIZLLL = r6
        L6b:
            r10.invoke()
        L6e:
            return
        L6f:
            r9.LIZ = r5
            r9.LJFF = r3
            r9.LIZLLL = r6
            goto L69
        L76:
            r8 = r5
        L77:
            r0 = r5
            goto L2e
        L79:
            r9.LIZ = r5
            r9.LJFF = r3
            r9.LIZLLL = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.platform.common.monitor.DeepLinkEnterMultiLiveRoomDataHandler.LJ(kotlin.jvm.functions.Function0):void");
    }

    public final void LJFF(Room room) {
        EnterRoomLinkSession enterRoomLinkSessionLIZIZ;
        EnterRoomConfig enterRoomConfig;
        if (this.LIZ != null && (enterRoomLinkSessionLIZIZ = C0IL2.LIZ.LIZIZ()) != null && (enterRoomConfig = enterRoomLinkSessionLIZIZ.mEnterRoomConfig) != null) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            long j = roomsData.roomId;
            if ((!Intrinsics.LJFF(roomsData.isFromMgTopLive, "1") || ((room != null && room.getId() == j) || j <= 0)) && this.LIZLLL == -1 && Intrinsics.LJFF(this.LIZ, "1") && this.LIZ != null) {
                this.LIZLLL = 0;
                this.LJFF = 0;
                if (C924810aAp.LJ().LJIIIIZZ) {
                    C784440Upu.LIZ().LIZIZ(new C926240aD8());
                    return;
                }
                this.LIZ = null;
                this.LJFF = 0;
                this.LIZLLL = -1;
            }
        }
    }

    public final void LIZLLL(Room room, boolean z, String str) {
        if (room == null || str == null) {
            return;
        }
        if (!C500260Jjc.LJJJI(Boolean.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Io0(room)))) {
            if (!C924810aAp.LJ().LJIIIIZZ && Intrinsics.LJFF(str, "1")) {
                this.LIZ = null;
                C766270U4b.LIZLLL(2131854217);
                return;
            }
        } else if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            this.LIZ = null;
            return;
        }
        this.LIZLLL = -1;
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LJ = z;
        this.LIZ = str;
    }
}
