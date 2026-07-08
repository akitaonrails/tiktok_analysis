package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0flR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1139710flR extends AbstractC1140590fmr {
    public final boolean LIZ;
    public final Room LIZIZ;
    public final InterfaceC1136810fgl LIZJ;
    public final C1138600fje LIZLLL;
    public final AssetsModel LJ;
    public final C1135280feI LJFF;

    @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
    public final void LIZLLL(EnumC1138990fkH enumC1138990fkH) {
        long ownerUserId;
        long jLongValue;
        long id;
        long jLongValue2;
        Room room = this.LIZIZ;
        boolean z = this.LIZ;
        Long lValueOf = Long.valueOf(this.LJFF.LJFF);
        if (z) {
            long jLongValue3 = 0;
            if (room != null) {
                ownerUserId = room.getOwnerUserId();
            } else {
                ownerUserId = 0;
            }
            String strLIZIZ = C501590Jll.LIZIZ(String.valueOf(ownerUserId));
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            C760160Trq c760160TrqLIZ = C759970TrX.LIZ("ttlive_broadcast_action_all");
            c760160TrqLIZ.LJII("action", "play_gift");
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = 0;
            }
            c760160TrqLIZ.LJI(Long.valueOf(jLongValue), "action_id");
            c760160TrqLIZ.LJII("user_id", strLIZIZ);
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            c760160TrqLIZ.LJI(Long.valueOf(id), "room_id");
            c760160TrqLIZ.LJIIIZ();
            if (lValueOf != null) {
                jLongValue2 = lValueOf.longValue();
            } else {
                jLongValue2 = 0;
            }
            C0UOQ.LJ.put("video_gift_id", String.valueOf(jLongValue2));
            C1276840jKc c1276840jKc = C1276840jKc.LIZ;
            if (lValueOf != null) {
                jLongValue3 = lValueOf.longValue();
            }
            c1276840jKc.getClass();
            C1276840jKc.LJJJJ(jLongValue3);
        }
        C1EOY c1eoy = C1EOY.LIZ;
        long j = this.LJFF.LJFF;
        boolean z2 = this.LIZ;
        C1300480jwk c1300480jwkLIZIZ = c1eoy.LIZIZ("gift_play");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LJIIJ = j;
            c1300480jwkLIZIZ.LJIIIIZZ = z2;
            c1300480jwkLIZIZ.LIZJ(null);
        }
    }

    @Override // X.AbstractC1140590fmr, X.InterfaceC1140870fnJ
    public final void LJIIIIZZ(EnumC1138990fkH enumC1138990fkH) {
        HashMap<String, Long> map;
        Long l;
        if (this.LJFF.LJIILLIIL) {
            C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
            C1135280feI c1135280feI = this.LJFF;
            c784440UpuLIZ.LIZIZ(new C1140660fmy(c1135280feI.LJIIL, c1135280feI.LJIIIZ));
        }
        C1138600fje c1138600fje = this.LIZLLL;
        Boolean boolValueOf = null;
        if (c1138600fje != null && (map = c1138600fje.LJIILJJIL) != null && (l = map.get("sendTs")) != null) {
            C1138600fje c1138600fje2 = this.LIZLLL;
            if (c1138600fje2 != null) {
                boolValueOf = Boolean.valueOf(c1138600fje2.LIZLLL);
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                LinkedList<AbstractC1143340frI> linkedList = C1143330frH.LIZ;
                C1143330frH.LIZ(new C1143490frX(System.currentTimeMillis() - l.longValue()));
            } else {
                if (!this.LIZ) {
                    return;
                }
                LinkedList<AbstractC1143340frI> linkedList2 = C1143330frH.LIZ;
                C1143330frH.LIZ(new C1143420frQ(C158B.LIZ() - l.longValue()));
            }
        }
    }

    public C1139710flR(boolean z, Room room, InterfaceC1136810fgl interfaceC1136810fgl, C1138600fje c1138600fje, AssetsModel assetsModel, C1135280feI c1135280feI) {
        this.LIZ = z;
        this.LIZIZ = room;
        this.LIZJ = interfaceC1136810fgl;
        this.LIZLLL = c1138600fje;
        this.LJ = assetsModel;
        this.LJFF = c1135280feI;
    }
}
