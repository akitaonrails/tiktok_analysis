package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.EffectRelatedApi;
import com.bytedance.android.live.effect.api.ModificationUploadRequest;
import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastBackgroundPhase2;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostWsMigrationSwitch;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import webcast.api.room.Modification;
import webcast.api.room.ModificationUploadReqMessage;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0UBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768300UBw implements C0UAM {
    public static final C768300UBw LIZ = new C768300UBw();
    public static final ConcurrentHashMap<Long, List<Modification>> LIZIZ = new ConcurrentHashMap<>();
    public static long LIZJ;
    public static String LIZLLL;
    public static Modification LJ;

    public static long LIZJ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            return room.getId();
        }
        return 0L;
    }

    public static final void LIZLLL() {
        LIZIZ.clear();
        LIZJ = 0L;
        LIZLLL = null;
    }

    public static Modification LIZ(C0UC1 c0uc1) {
        long j = c0uc1.LIZ;
        String str = c0uc1.LIZJ;
        if (str == null) {
            str = "";
        }
        String str2 = c0uc1.LIZIZ;
        String str3 = c0uc1.LIZLLL;
        long j2 = c0uc1.LJFF;
        String str4 = c0uc1.LJI;
        return new Modification(j, str, str2, 12L, Long.valueOf(j2), null, 0L, str3, null, null, null, c0uc1.LJIIIIZZ, c0uc1.LJII, null, str4, 0L, 0);
    }

    public static void LIZIZ(long j) {
        List<Modification> list = LIZIZ.get(Long.valueOf(j));
        if (list != null) {
            list.clear();
        }
    }

    public static void LJIILIIL(long j) {
        List<Modification> list = LIZIZ.get(Long.valueOf(j));
        if (list != null && (!list.isEmpty())) {
            LJIIJ(LIZJ(), list);
        }
    }

    public static void LJ(C768320UBy c768320UBy, boolean z) {
        Long lValueOf;
        if (c768320UBy == null) {
            return;
        }
        long j = c768320UBy.LIZ;
        String str = c768320UBy.LIZJ;
        if (str == null) {
            str = "";
        }
        String str2 = c768320UBy.LIZIZ;
        long j2 = c768320UBy.LJI;
        long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
        long j4 = j2 / j3;
        String str3 = null;
        if (z) {
            lValueOf = Long.valueOf(C158B.LIZ() / j3);
        } else {
            lValueOf = null;
        }
        long j5 = c768320UBy.LJFF;
        if (j5 == 1) {
            str3 = LIZLLL;
        }
        LJII(8L, new Modification(j, str, str2, 8L, Long.valueOf(j4), lValueOf, 0L, null, null, null, null, str3, c768320UBy.LIZLLL, null, null, j5, LiveBroadcastBackgroundPhase2.enable() ? 1 : 0));
    }

    public static void LJFF(C767140U7k c767140U7k, boolean z) {
        Long lValueOf;
        long j;
        if (c767140U7k == null) {
            return;
        }
        LiveEffect liveEffect = c767140U7k.LJI;
        long effectId = liveEffect.getEffectId();
        String name = liveEffect.getName();
        if (name == null) {
            name = "";
        }
        String str = c767140U7k.LIZIZ;
        long j2 = c767140U7k.LJII;
        long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
        Long lValueOf2 = Long.valueOf(j2 / j3);
        if (z) {
            lValueOf = Long.valueOf(C158B.LIZ() / j3);
        } else {
            lValueOf = null;
        }
        String strLJLL = liveEffect.LJLL();
        long j4 = 1;
        if (c767140U7k.LIZLLL == c767140U7k.LJ) {
            j = 1;
        } else {
            j = 2;
        }
        Long lValueOf3 = Long.valueOf(j);
        if (c767140U7k.LJIIIIZZ) {
            j4 = 2;
        }
        LJII(3L, new Modification(effectId, name, str, 3L, lValueOf2, lValueOf, 0L, strLJLL, lValueOf3, Long.valueOf(j4), Float.valueOf(c767140U7k.LIZJ), null, c767140U7k.LJIIIZ, null, null, 0L, 0));
    }

    public static final void LJI(String str, boolean z) {
        Modification modification;
        LIZLLL = str;
        String str2 = "";
        if (z) {
            Modification modification2 = LJ;
            if (modification2 != null) {
                if (str == null) {
                    str = "";
                }
                modification2.url = str;
                modification2.startTime = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                LJIIJ(LIZJ(), C1697810uHb.LJIILJJIL(modification2.LIZ()));
            }
            LJ = null;
            return;
        }
        List<Modification> list = LIZIZ.get(1L);
        if (list == null || list.size() < 1 || (modification = (Modification) ListProtector.get(list, 0)) == null) {
            return;
        }
        String str3 = LIZLLL;
        if (str3 != null) {
            str2 = str3;
        }
        modification.url = str2;
        ArrayList arrayList = new ArrayList();
        Modification modificationLIZ = modification.LIZ();
        modificationLIZ.subType = 1L;
        arrayList.add(modificationLIZ);
        LJIIJ(LIZJ(), arrayList);
    }

    public static void LJII(long j, Modification modification) {
        ConcurrentHashMap<Long, List<Modification>> concurrentHashMap = LIZIZ;
        if (!concurrentHashMap.containsKey(Long.valueOf(j))) {
            concurrentHashMap.put(Long.valueOf(j), new ArrayList());
        }
        List<Modification> list = concurrentHashMap.get(Long.valueOf(j));
        if (list != null) {
            list.add(modification);
        }
    }

    public static void LJIIJ(long j, List list) {
        boolean zLJI = MethodIDManager.LJI(202131);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("roomId: ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("LiveHostWs", C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (LiveHostWsMigrationSwitch.INSTANCE.isEnable()) {
            ModificationUploadReqMessage modificationUploadReqMessage = new ModificationUploadReqMessage();
            modificationUploadReqMessage.roomId = j;
            modificationUploadReqMessage.modifications = arrayList;
            byte[] bArrLJ = C1516000pYM.LJ(modificationUploadReqMessage);
            if (bArrLJ != null) {
                ((C1528270ps9) ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getLiveHostWsManager()).LIZLLL(new C1528300psC(bArrLJ, 6));
            }
        } else {
            ((EffectRelatedApi) C482260Ivg.LIZJ(EffectRelatedApi.class)).uploadEffectRelatedUseLog(new ModificationUploadRequest(j, arrayList)).LJL(C11S5.LIZ()).LJJLJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LJIIL(C0UC1 c0uc1, C0UC1 c0uc12) {
        if (c0uc1 == null && c0uc12 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (c0uc1 != null) {
            arrayList.add(LIZ(c0uc1));
        }
        if (c0uc12 != null) {
            Modification modificationLIZ = LIZ(c0uc12);
            modificationLIZ.endTime = C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            arrayList.add(modificationLIZ);
        }
        LJIIJ(LIZJ(), arrayList);
    }

    public static void LJIILJJIL(C0UC8 c0uc8, boolean z) {
        Long lValueOf;
        if (c0uc8 == null || C500260Jjc.LJJIJLIJ()) {
            return;
        }
        long j = c0uc8.LIZ;
        String str = c0uc8.LIZJ;
        if (str == null) {
            str = "";
        }
        String str2 = c0uc8.LIZIZ;
        long j2 = c0uc8.LJIILL;
        long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
        long j4 = j2 / j3;
        if (z) {
            lValueOf = Long.valueOf(C158B.LIZ() / j3);
        } else {
            lValueOf = null;
        }
        Modification modification = new Modification(j, str, str2, 1L, Long.valueOf(j4), lValueOf, 0L, null, null, null, null, null, null, Long.valueOf(j), null, 1L, 0);
        if (LIZJ() != 0) {
            LIZJ = LIZJ();
        }
        LJIIJ(LIZJ, C1697810uHb.LJIILJJIL(modification));
    }

    public static final void LJIILL(LiveEffect liveEffect, boolean z) {
        Long lValueOf;
        long j;
        if (liveEffect == null) {
            return;
        }
        long effectId = liveEffect.getEffectId();
        long effectId2 = liveEffect.getEffectId();
        String name = liveEffect.getName();
        String resourceId = liveEffect.getResourceId();
        long jLIZ = C158B.LIZ();
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        long j3 = jLIZ / j2;
        if (z) {
            lValueOf = Long.valueOf(C158B.LIZ() / j2);
        } else {
            lValueOf = null;
        }
        if (liveEffect.LJJJJLL()) {
            j = 1;
        } else {
            j = 0;
        }
        Modification modification = new Modification(effectId, name, resourceId, 1L, Long.valueOf(j3), lValueOf, 1L, null, null, null, null, null, null, Long.valueOf(effectId2), null, j, 0);
        if (LIZJ() != 0) {
            LIZJ = LIZJ();
        }
        if (liveEffect.LJJJJLL()) {
            LJ = modification;
        }
    }

    public static void LJIIIIZZ(C0UC8 c0uc8, boolean z, long j) {
        boolean z2;
        long j2;
        Modification modification;
        Long lValueOf;
        long j3;
        Long lValueOf2;
        if (c0uc8 == null) {
            return;
        }
        int i = c0uc8.LJIJJ;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (C500260Jjc.LJJJI(Boolean.valueOf(c0uc8.LJIILJJIL))) {
                j2 = 2;
            } else {
                j2 = 1;
            }
        } else if (i == 0) {
            j2 = 0;
        } else if (C500260Jjc.LJJJI(Boolean.valueOf(c0uc8.LJIILJJIL))) {
            j2 = 4;
        } else {
            j2 = 3;
        }
        String str = c0uc8.LJIIIZ;
        String str2 = "";
        if (str != null) {
            long j4 = CastLongProtector.parseLong(str);
            String str3 = c0uc8.LJIIJ;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = c0uc8.LJIIJJI;
            if (str4 != null) {
                str2 = str4;
            }
            long j5 = c0uc8.LJIILL;
            long j6 = LSPassThroughRecordSizeConfig.DEFAULT;
            Long lValueOf3 = Long.valueOf(j5 / j6);
            if (z) {
                lValueOf2 = Long.valueOf(C158B.LIZ() / j6);
            } else {
                lValueOf2 = null;
            }
            modification = new Modification(j4, str3, str2, 1L, lValueOf3, lValueOf2, j, c0uc8.LJ, null, Long.valueOf(j2), null, LIZLLL, c0uc8.LJFF, Long.valueOf(c0uc8.LIZ), null, c0uc8.LJIJI, 0);
        } else {
            long j7 = c0uc8.LIZ;
            String str5 = c0uc8.LIZJ;
            if (str5 != null) {
                str2 = str5;
            }
            String str6 = c0uc8.LIZIZ;
            long j8 = c0uc8.LJIILL;
            long j9 = LSPassThroughRecordSizeConfig.DEFAULT;
            Long lValueOf4 = Long.valueOf(j8 / j9);
            if (z) {
                lValueOf = Long.valueOf(C158B.LIZ() / j9);
            } else {
                lValueOf = null;
            }
            modification = new Modification(j7, str2, str6, 1L, lValueOf4, lValueOf, j, c0uc8.LJ, null, Long.valueOf(j2), null, LIZLLL, c0uc8.LJFF, null, null, c0uc8.LJIJI, 0);
        }
        if (j == 0) {
            j3 = 1;
        } else {
            j3 = 5;
        }
        LJII(j3, modification);
    }

    public static void LJIIIZ(LiveEffect liveEffect, Long l, String str) {
        long jLIZ;
        Long lValueOf;
        long effectId = liveEffect.getEffectId();
        String strLJJJJZI = liveEffect.LJJJJZI();
        if (strLJJJJZI == null) {
            strLJJJJZI = "";
        }
        String resourceId = liveEffect.getResourceId();
        if (l != null) {
            jLIZ = l.longValue();
        } else {
            jLIZ = C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        Long lValueOf2 = Long.valueOf(jLIZ);
        if (l != null) {
            lValueOf = Long.valueOf(C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        } else {
            lValueOf = null;
        }
        LJII(4L, new Modification(effectId, strLJJJJZI, resourceId, 4L, lValueOf2, lValueOf, 0L, null, null, 1L, null, null, str, null, null, 0L, 0));
    }

    public static void LJIIJJI(Long l, Long l2, Long l3, Long l4) {
        Modification modification;
        if (l != null) {
            l.longValue();
        }
        MusicSong musicSong = C763260Twq.LJ;
        if (musicSong != null) {
            modification = new Modification(musicSong.id, musicSong.title, "", 5L, l, l2, 0L, "", l3, l4, null, musicSong.previewUrl, ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), null, null, 0L, 0);
        } else {
            modification = null;
        }
        if (LIZJ() != 0) {
            LIZJ = LIZJ();
        }
        if (modification != null) {
            LJIIJ(LIZJ, C1697810uHb.LJIILJJIL(modification));
        }
    }

    public static void LJIILLIIL(Long l, String str, Long l2, Long l3, Long l4) {
        Modification modification;
        Accompaniment accompaniment;
        if (l != null) {
            l.longValue();
        }
        C0UBZ c0ubz = C0UBZ.LL;
        C768190UBl c768190UBl = C0UBZ.LLJJIJI;
        if (c768190UBl != null && (accompaniment = c768190UBl.accompaniment) != null) {
            modification = new Modification(accompaniment.id, accompaniment.title, "", 5L, l, l2, 0L, String.valueOf(C0UBZ.LLJJIII), l3, l4, null, accompaniment.url, str, null, null, 0L, 0);
        } else {
            modification = null;
        }
        if (LIZJ() != 0) {
            LIZJ = LIZJ();
        }
        if (modification != null) {
            LJIIJ(LIZJ, C1697810uHb.LJIILJJIL(modification));
        }
    }
}
