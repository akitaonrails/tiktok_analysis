package com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record;

import X.C20441214yg;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C920350a3d;
import X.C924810aAp;
import X.C930540aK4;
import X.C930940aKi;
import X.C933350aOb;
import X.C941700ac4;
import X.InterfaceC1294060jmO;
import X.InterfaceC924740aAi;
import X.InterfaceC926960aEI;
import X.InterfaceC948500an2;
import com.bytedance.android.live.liveinteract.multiguestv3.AigcWallpaperStatus;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "PLAY_RECORD_MANAGER")
@InterfaceC1294060jmO
public final class PlayRecordManager implements InterfaceC924740aAi {
    public static final C920350a3d LIZLLL = new C920350a3d();
    public final DataChannel LIZ;
    public final Map<String, C933350aOb> LIZIZ = new LinkedHashMap();
    public final Map<String, C933350aOb> LIZJ = new LinkedHashMap();

    @Override // X.InterfaceC924740aAi
    public final void LIZJ() {
        C20441214yg.LIZIZ("PlayRecordManager", "startGuestPlayRecords copy data from all to guest role");
        for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
            if (((LinkedHashMap) this.LIZJ).get(entry.getKey()) == null) {
                LinkMicAbilityManager.LJIIIZ.getClass();
                InterfaceC926960aEI interfaceC926960aEILIZJ = C941700ac4.LIZJ();
                if (C500260Jjc.LJJJI(interfaceC926960aEILIZJ != null ? Boolean.valueOf(interfaceC926960aEILIZJ.LJIJI((String) entry.getKey())) : null)) {
                    this.LIZJ.put((String) entry.getKey(), new C933350aOb(0));
                }
            }
            C933350aOb c933350aOb = (C933350aOb) ((LinkedHashMap) this.LIZJ).get(entry.getKey());
            if (c933350aOb != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                c933350aOb.LIZIZ = 0L;
                if (!c933350aOb.LIZJ) {
                    jCurrentTimeMillis = 0;
                }
                c933350aOb.LIZ = jCurrentTimeMillis;
            }
            C933350aOb c933350aOb2 = (C933350aOb) ((LinkedHashMap) this.LIZIZ).get(entry.getKey());
            if (C500260Jjc.LJJJI(c933350aOb2 != null ? Boolean.valueOf(c933350aOb2.LIZJ) : null)) {
                C933350aOb c933350aOb3 = (C933350aOb) ((LinkedHashMap) this.LIZJ).get(entry.getKey());
                if (c933350aOb3 != null) {
                    c933350aOb3.LIZ = System.currentTimeMillis();
                    c933350aOb3.LIZJ = true;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("startGuestPlayRecords copy data from all to guest role, name=");
                sbLIZ.append((String) entry.getKey());
                sbLIZ.append(",start=");
                C933350aOb c933350aOb4 = (C933350aOb) ((LinkedHashMap) this.LIZJ).get(entry.getKey());
                sbLIZ.append(c933350aOb4 != null ? Long.valueOf(c933350aOb4.LIZ) : null);
                sbLIZ.append(", totalDuration=");
                C933350aOb c933350aOb5 = (C933350aOb) ((LinkedHashMap) this.LIZJ).get(entry.getKey());
                sbLIZ.append(c933350aOb5 != null ? Long.valueOf(c933350aOb5.LIZIZ) : null);
                C20441214yg.LIZIZ("PlayRecordManager", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // X.InterfaceC924740aAi
    public final void LIZLLL() {
        C20441214yg.LIZIZ("PlayRecordManager", "resetGuestPlayRecords");
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Map.Entry entry : ((LinkedHashMap) this.LIZJ).entrySet()) {
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC926960aEI interfaceC926960aEILIZJ = C941700ac4.LIZJ();
            if (C500260Jjc.LJJJI(interfaceC926960aEILIZJ != null ? Boolean.valueOf(interfaceC926960aEILIZJ.LJIJI((String) entry.getKey())) : null)) {
                C933350aOb c933350aOb = (C933350aOb) entry.getValue();
                c933350aOb.LIZIZ = 0L;
                c933350aOb.LIZ = c933350aOb.LIZJ ? jCurrentTimeMillis : 0L;
            }
        }
    }

    @Override // X.InterfaceC924740aAi
    public final void LJ() {
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // X.InterfaceC924740aAi
    public final Map<String, Long> LJFF() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC926960aEI interfaceC926960aEILIZJ = C941700ac4.LIZJ();
            if (C500260Jjc.LJJJI(interfaceC926960aEILIZJ != null ? Boolean.valueOf(interfaceC926960aEILIZJ.LJIJI((String) entry.getKey())) : null)) {
                C933350aOb c933350aOb = (C933350aOb) entry.getValue();
                if (c933350aOb.LIZJ) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    c933350aOb.LIZIZ += jCurrentTimeMillis - c933350aOb.LIZ;
                    c933350aOb.LIZ = jCurrentTimeMillis;
                }
                linkedHashMap.put(entry.getKey(), Long.valueOf(((C933350aOb) entry.getValue()).LIZIZ));
            }
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC924740aAi
    public final Map<String, Long> LJI() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) this.LIZJ).entrySet()) {
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC926960aEI interfaceC926960aEILIZJ = C941700ac4.LIZJ();
            if (C500260Jjc.LJJJI(interfaceC926960aEILIZJ != null ? Boolean.valueOf(interfaceC926960aEILIZJ.LJIJI((String) entry.getKey())) : null)) {
                C933350aOb c933350aOb = (C933350aOb) entry.getValue();
                if (c933350aOb.LIZJ) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    c933350aOb.LIZIZ += jCurrentTimeMillis - c933350aOb.LIZ;
                    c933350aOb.LIZ = jCurrentTimeMillis;
                }
                linkedHashMap.put(entry.getKey(), Long.valueOf(((C933350aOb) entry.getValue()).LIZIZ));
            }
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC924740aAi
    public final void LJII() {
        C20441214yg.LIZIZ("PlayRecordManager", "resetAllPlayRecords");
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC926960aEI interfaceC926960aEILIZJ = C941700ac4.LIZJ();
            if (C500260Jjc.LJJJI(interfaceC926960aEILIZJ != null ? Boolean.valueOf(interfaceC926960aEILIZJ.LJIJI((String) entry.getKey())) : null)) {
                C933350aOb c933350aOb = (C933350aOb) entry.getValue();
                c933350aOb.LIZIZ = 0L;
                c933350aOb.LIZ = c933350aOb.LIZJ ? jCurrentTimeMillis : 0L;
            }
        }
    }

    @Override // X.InterfaceC924740aAi
    public final void LJIIIIZZ() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission;
        MultiLiveUserSettings multiLiveUserSettings2;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission2;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.CQ2(AigcWallpaperStatus.class, this, new AwS594S0100000_15(this, 146));
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        long j = (room == null || (multiLiveUserSettings2 = room.multiLiveUserSettings) == null || (multiLiveUserApplySettings2 = multiLiveUserSettings2.multiLiveUserApplySettings) == null || (multiLiveUserApplyPermission2 = multiLiveUserApplySettings2.multiLiveUserApplyPermission) == null) ? 0L : multiLiveUserApplyPermission2.applierSortGiftScoreThreshold;
        if (j > 0) {
            LIZ("gift_threshold_link");
        } else {
            LIZIZ("gift_threshold_link");
        }
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        long j2 = (room2 == null || (multiLiveUserSettings = room2.multiLiveUserSettings) == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) == null) ? 0L : multiLiveUserApplyPermission.applierSortSetting;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("giftPriority ");
        sbLIZ.append(j2);
        sbLIZ.append(" , giftScoreThreshold ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("PlayRecordManager", C2188811AlT.LIZIZ(sbLIZ));
        if (j2 > 0) {
            LIZ("gift_priority_link");
        } else {
            LIZIZ("gift_priority_link");
        }
        if (PlayRecordConfigSetting.INSTANCE.firstCheckGift()) {
            C924810aAp c924810aApLJ = C924810aAp.LJ();
            if (c924810aApLJ != null && (multiLiveAnchorPanelSettings2 = c924810aApLJ.LJJIII) != null) {
                multiLiveAnchorPanelSettings2.applierSortGiftScoreThreshold = j;
            }
            C924810aAp c924810aApLJ2 = C924810aAp.LJ();
            if (c924810aApLJ2 == null || (multiLiveAnchorPanelSettings = c924810aApLJ2.LJJIII) == null) {
                return;
            }
            multiLiveAnchorPanelSettings.applierSortSetting = (int) j2;
        }
    }

    public PlayRecordManager(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // X.InterfaceC924740aAi
    public final void LIZ(String str) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Long lValueOf;
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC926960aEI interfaceC926960aEILIZJ = C941700ac4.LIZJ();
        Long lValueOf2 = null;
        if (interfaceC926960aEILIZJ != null) {
            boolValueOf = Boolean.valueOf(interfaceC926960aEILIZJ.LJIJI(str));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start record invalidate ability ");
            sbLIZ.append(str);
            C20441214yg.LJIIL("PlayRecordManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (((LinkedHashMap) this.LIZIZ).get(str) == null) {
            this.LIZIZ.put(str, new C933350aOb(0));
        }
        C933350aOb c933350aOb = (C933350aOb) ((LinkedHashMap) this.LIZIZ).get(str);
        if (c933350aOb != null) {
            boolValueOf2 = Boolean.valueOf(c933350aOb.LIZJ);
        } else {
            boolValueOf2 = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf2)) {
            if (c933350aOb != null) {
                c933350aOb.LIZ = System.currentTimeMillis();
                c933350aOb.LIZJ = true;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start record: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", ");
            if (c933350aOb != null) {
                lValueOf = Long.valueOf(c933350aOb.LIZ);
            } else {
                lValueOf = null;
            }
            sbLIZ2.append(lValueOf);
            C20441214yg.LIZIZ("PlayRecordManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (((LinkedHashMap) this.LIZJ).get(str) == null) {
            this.LIZJ.put(str, new C933350aOb(0));
        }
        C933350aOb c933350aOb2 = (C933350aOb) ((LinkedHashMap) this.LIZJ).get(str);
        if (c933350aOb2 != null) {
            boolValueOf3 = Boolean.valueOf(c933350aOb2.LIZJ);
        } else {
            boolValueOf3 = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf3) && C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI())) {
            if (c933350aOb2 != null) {
                c933350aOb2.LIZ = System.currentTimeMillis();
                c933350aOb2.LIZJ = true;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("start guest record: ");
            sbLIZ3.append(str);
            sbLIZ3.append(", ");
            if (c933350aOb != null) {
                lValueOf2 = Long.valueOf(c933350aOb.LIZ);
            }
            sbLIZ3.append(lValueOf2);
            C20441214yg.LIZIZ("PlayRecordManager", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    @Override // X.InterfaceC924740aAi
    public final void LIZIZ(String str) {
        Boolean boolValueOf;
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC926960aEI interfaceC926960aEILIZJ = C941700ac4.LIZJ();
        if (interfaceC926960aEILIZJ != null) {
            boolValueOf = Boolean.valueOf(interfaceC926960aEILIZJ.LJIJI(str));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("endRecord invalidate ability ");
            sbLIZ.append(str);
            C20441214yg.LJIIL("PlayRecordManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C933350aOb c933350aOb = (C933350aOb) ((LinkedHashMap) this.LIZIZ).get(str);
        if (c933350aOb == null) {
            return;
        }
        if (c933350aOb.LIZJ) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c933350aOb.LIZIZ += jCurrentTimeMillis - c933350aOb.LIZ;
            c933350aOb.LIZ = jCurrentTimeMillis;
            c933350aOb.LIZJ = false;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("end record: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", ");
            sbLIZ2.append(Long.valueOf(c933350aOb.LIZIZ));
            C20441214yg.LIZIZ("PlayRecordManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C933350aOb c933350aOb2 = (C933350aOb) ((LinkedHashMap) this.LIZJ).get(str);
        if (c933350aOb2 != null && c933350aOb2.LIZJ && C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI())) {
            if (c933350aOb2.LIZJ) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                c933350aOb2.LIZIZ += jCurrentTimeMillis2 - c933350aOb2.LIZ;
                c933350aOb2.LIZ = jCurrentTimeMillis2;
                c933350aOb2.LIZJ = false;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("end record guest: ");
            sbLIZ3.append(str);
            sbLIZ3.append(", ");
            sbLIZ3.append(Long.valueOf(c933350aOb.LIZIZ));
            C20441214yg.LIZIZ("PlayRecordManager", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }
}
