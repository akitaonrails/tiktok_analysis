package X;

import android.os.Looper;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubCustomizedLevelGiftSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eBM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078900eBM implements InterfaceC1095000ebK {
    public final DataChannel LIZ;
    public Gift LIZIZ;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper(), new C1151670g4j(this, 6));

    @Override // X.InterfaceC1095000ebK
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC1095000ebK
    public final void onRelease() {
        this.LIZIZ = null;
        this.LIZJ.removeMessages(4);
    }

    public final boolean LIZLLL() {
        Boolean bool;
        boolean zBooleanValue = false;
        if (!FansClubCustomizedLevelGiftSetting.INSTANCE.getValue().enable) {
            return false;
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        }
        return !zBooleanValue;
    }

    public final boolean LJ() {
        C1095140ebY c1095140ebY;
        long jObtainMinMemberLevel = FansClubCustomizedLevelGiftSetting.INSTANCE.obtainMinMemberLevel();
        DataChannel dataChannel = this.LIZ;
        return ((dataChannel == null || (c1095140ebY = (C1095140ebY) dataChannel.gg0(FansClubChannel.class)) == null) ? 0L : c1095140ebY.LIZ) >= jObtainMinMemberLevel;
    }

    public final Gift LJFF() {
        FansClubCustomizedLevelGiftSetting.LiveFansCustomizedLevelGiftConfig value;
        FansClubCustomizedLevelGiftSetting fansClubCustomizedLevelGiftSetting = FansClubCustomizedLevelGiftSetting.INSTANCE;
        if (fansClubCustomizedLevelGiftSetting != null && (value = fansClubCustomizedLevelGiftSetting.getValue()) != null) {
            Gift giftFindGiftById = GiftService.LLILLJJLI.findGiftById(value.giftId);
            if (giftFindGiftById != null && giftFindGiftById.isDisplayedOnPanel) {
                this.LIZIZ = giftFindGiftById;
            }
        }
        return this.LIZIZ;
    }

    public final String LJI() {
        String str;
        String strOptString;
        Map<Long, String> map;
        Gift gift = this.LIZIZ;
        if (gift == null || (map = gift.bizExtra) == null || (str = map.get(1L)) == null) {
            str = "";
        }
        try {
            strOptString = new JSONObject(str).optString("version_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strOptString = "";
        }
        return strOptString != null ? strOptString : "";
    }

    @Override // X.InterfaceC1095000ebK
    public final void LIZ() {
        if (LIZLLL()) {
            C786410Ut5.LJLJJI(7, FansClubCustomizedLevelGiftSetting.INSTANCE.obtainDetectionTime(), this.LIZJ);
        }
    }

    public C1078900eBM(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final boolean LIZJ(String str) {
        long ownerUserId;
        Room room;
        try {
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                ownerUserId = room.getOwnerUserId();
            } else {
                ownerUserId = 0;
            }
            String strValueOf = String.valueOf(ownerUserId);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strValueOf);
            sbLIZ.append('@');
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            List<String> listLIZ = InterfaceC1094160eZy.U1.LIZ();
            if (listLIZ != null) {
                return listLIZ.contains(strLIZIZ);
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[PHI: r1
      0x0017: PHI (r1v8 java.lang.String) = (r1v0 java.lang.String), (r1v9 java.lang.String) binds: [B:9:0x0015, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.lang.String r9) {
        /*
            r8 = this;
            com.bytedance.android.livesdk.model.Gift r6 = r8.LIZIZ
            if (r6 == 0) goto Lbc
            com.bytedance.android.livesdk.livesetting.level.FansClubCustomizedLevelGiftSetting r7 = com.bytedance.android.livesdk.livesetting.level.FansClubCustomizedLevelGiftSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.level.FansClubCustomizedLevelGiftSetting$LiveFansCustomizedLevelGiftConfig r0 = r7.getValue()
            com.bytedance.android.livesdk.livesetting.level.FansClubCustomizedLevelGiftSetting$LiveFansBubbleStarlingKey r0 = r0.bubbleContent
            java.lang.String r2 = ""
            if (r0 == 0) goto L14
            java.lang.String r1 = r0.pattern
            if (r1 != 0) goto L17
        L14:
            r1 = r2
            if (r0 == 0) goto L1c
        L17:
            java.lang.String r0 = r0.key
            if (r0 == 0) goto L1c
            r2 = r0
        L1c:
            com.bytedance.android.livesdk.model.message.common.Text r5 = new com.bytedance.android.livesdk.model.message.common.Text
            r5.<init>()
            r5.key = r2
            r5.defaultPattern = r1
            com.bytedance.android.livesdk.model.message.common.TextFormat r1 = new com.bytedance.android.livesdk.model.message.common.TextFormat
            r1.<init>()
            java.lang.String r0 = "#ffffff"
            r1.color = r0
            r0 = 400(0x190, float:5.6E-43)
            r1.weight = r0
            r0 = 0
            r1.italic = r0
            r5.defaultFormat = r1
            X.13BV r0 = X.C13BV.INSTANCE
            r5.pieces = r0
            java.lang.String r0 = r5.key
            if (r0 == 0) goto Lbc
            boolean r1 = X.C500260Jjc.LJJIIZ(r0)
            r0 = 1
            if (r1 != r0) goto Lbc
            X.0Upu r4 = X.C784440Upu.LIZ()
            X.0fCf r3 = new X.0fCf
            long r0 = r6.id
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            com.bytedance.android.live.base.model.ImageModel r1 = r6.image
            r0 = 3
            r3.<init>(r2, r1, r5, r0)
            r4.LIZIZ(r3)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r8.LIZ     // Catch: java.lang.Exception -> Lb8
            if (r1 == 0) goto L92
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.gg0(r0)     // Catch: java.lang.Exception -> Lb8
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0     // Catch: java.lang.Exception -> Lb8
            if (r0 == 0) goto L92
            long r0 = r0.getOwnerUserId()     // Catch: java.lang.Exception -> Lb8
        L6d:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Lb8
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> Lb8
            r1.append(r0)     // Catch: java.lang.Exception -> Lb8
            r0 = 64
            r1.append(r0)     // Catch: java.lang.Exception -> Lb8
            r1.append(r9)     // Catch: java.lang.Exception -> Lb8
            java.lang.String r5 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> Lb8
            X.0JT6<java.util.List<java.lang.String>> r4 = X.InterfaceC1094160eZy.U1     // Catch: java.lang.Exception -> Lb8
            java.lang.Object r3 = r4.LIZ()     // Catch: java.lang.Exception -> Lb8
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Exception -> Lb8
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb8
            r2.<init>()     // Catch: java.lang.Exception -> Lb8
            goto L95
        L92:
            r0 = 0
            goto L6d
        L95:
            if (r3 == 0) goto Lac
            com.bytedance.android.livesdk.livesetting.level.FansClubCustomizedLevelGiftSetting$LiveFansCustomizedLevelGiftConfig r0 = r7.getValue()     // Catch: java.lang.Exception -> Lb8
            int r1 = r0.cacheSize     // Catch: java.lang.Exception -> Lb8
            int r0 = r3.size()     // Catch: java.lang.Exception -> Lb8
            if (r0 < r1) goto Lb3
            int r0 = r1 / 2
            java.util.List r0 = X.C13LP.LLD(r0, r3)     // Catch: java.lang.Exception -> Lb8
            r2.addAll(r0)     // Catch: java.lang.Exception -> Lb8
        Lac:
            r2.add(r5)     // Catch: java.lang.Exception -> Lb8
            r4.LIZJ(r2)     // Catch: java.lang.Exception -> Lb8
            goto Lb7
        Lb3:
            r2.addAll(r3)     // Catch: java.lang.Exception -> Lb8
            goto Lac
        Lb7:
            return
        Lb8:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1078900eBM.LJII(java.lang.String):void");
    }
}
