package X;

import Y.AfS3S1100100_15;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperCountDownEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperPlayOrderUpdateEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAigcWallpaperEnableSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import webcast.data.multi_guest_play.WallpaperContext;

/* JADX INFO: renamed from: X.0aXi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939000aXi {
    public static final C939000aXi LIZ = new C939000aXi();
    public static String LIZIZ;
    public static C19487111Lx LIZJ;
    public static Long LIZLLL;
    public static String LJ;
    public static Long LJFF;
    public static String LJI;
    public static boolean LJII;

    public static Map LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Long l = LIZLLL;
        if (l != null) {
            l.longValue();
            linkedHashMap.put("w_id", String.valueOf(LIZLLL));
        }
        String str = LJ;
        if (str != null) {
            linkedHashMap.put("bg_url", str);
        }
        String str2 = LJI;
        if (str2 != null) {
            linkedHashMap.put("p_lm_id", str2);
        }
        Long l2 = LJFF;
        if (l2 != null) {
            linkedHashMap.put("startTime", String.valueOf(l2.longValue()));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("generateAigcBizSei: ");
        sbLIZ.append(linkedHashMap);
        C20441214yg.LIZIZ("MultiGuestAigcWallpaperUtil", C2188811AlT.LIZIZ(sbLIZ));
        return linkedHashMap;
    }

    public static void LJFF() {
        C20441214yg.LIZIZ("MultiGuestAigcWallpaperUtil", "onDestroy");
        C19487111Lx c19487111Lx = LIZJ;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        LIZIZ = null;
        LIZJ = null;
        LIZLLL = null;
        LJ = null;
        LJI = null;
        LJFF = null;
    }

    public static boolean LJ() {
        if (C930540aK4.LJJIJ()) {
            C20441214yg.LJIIL("MultiGuestAigcWallpaperUtil", "aigc isLiveVoice");
            return false;
        }
        if (MultiGuestAigcWallpaperEnableSetting.INSTANCE.isEnable()) {
            return true;
        }
        C20441214yg.LJIIL("MultiGuestAigcWallpaperUtil", "not in aigc wallpaper exp group");
        return false;
    }

    public static void LIZIZ(DataChannel dataChannel) {
        String str;
        if (dataChannel != null) {
            str = (String) dataChannel.gg0(C956780b0O.class);
        } else {
            str = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DESTROY_MODE, remove aigc sei, put sharedBgSei, stickerId = ");
        sbLIZ.append(str);
        sbLIZ.append(" , sharedBg enable: ");
        sbLIZ.append(C936270aTJ.LIZJ(true));
        C20441214yg.LIZIZ("MultiGuestAigcWallpaperUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (str == null || !C936270aTJ.LIZJ(true)) {
            return;
        }
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("sticker_id", str);
        concurrentHashMap.put("feeds_adapt", "1");
        iInteractService.We1("shared_bg", concurrentHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LIZJ(long r10) {
        /*
            r0 = 300000(0x493e0, float:4.2039E-40)
            long r4 = (long) r0
            boolean r0 = X.C930540aK4.LJJIII()
            r8 = 0
            if (r0 != 0) goto L24
            long r6 = X.C01HA.LJIIIIZZ()
            long r1 = X.C158B.LIZ()
            long r1 = r1 + r6
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 <= 0) goto L30
            long r2 = -r6
            long r0 = X.C158B.LIZ()
            long r2 = r2 + r0
            long r2 = r2 - r10
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L26
        L24:
            r2 = 0
        L26:
            long r4 = r4 - r2
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r4 = r4 / r0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 < 0) goto L33
            return r4
        L30:
            r2 = 0
            goto L26
        L33:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939000aXi.LIZJ(long):long");
    }

    public static void LJI(List list) {
        Iterator it2;
        if (list != null && (it2 = list.iterator()) != null) {
            while (it2.hasNext()) {
                long j = ((WallpaperContext) it2.next()).userId;
                Long lLJIIZILJ = C930540aK4.LJIIZILJ();
                if (lLJIIZILJ != null && j == lLJIIZILJ.longValue()) {
                    it2.remove();
                    return;
                }
            }
        }
    }

    public static void LJII(DataChannel dataChannel, String str, String str2) {
        Long lLIZIZ;
        String strLJJIJL = str2;
        if (strLJJIJL == null) {
            C930480aJy c930480aJy = C930480aJy.LIZ;
            if (str != null) {
                lLIZIZ = C1946707jt.LIZIZ(str);
            } else {
                lLIZIZ = null;
            }
            c930480aJy.getClass();
            strLJJIJL = C930480aJy.LJJIJL(lLIZIZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeMaskCountDownView, myLinkMicId = ");
        sbLIZ.append(strLJJIJL);
        C20441214yg.LIZIZ("MultiGuestAigcWallpaperUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (strLJJIJL != null) {
            dataChannel.LC0(AigcWallpaperCountDownEvent.class, new C938120aWI(0L, 0L, strLJJIJL));
        }
        C19487111Lx c19487111Lx = LIZJ;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        LIZJ = null;
    }

    public static void LJIIIZ(long j, DataChannel dataChannel, String str, String str2) {
        String strLJJIJL;
        Long lLIZIZ;
        long jLIZJ = LIZJ(j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startTimeStamp = ");
        sbLIZ.append(j);
        sbLIZ.append(" , remainTimeSec = ");
        sbLIZ.append(jLIZJ);
        C20441214yg.LIZIZ("MultiGuestAigcWallpaperUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (jLIZJ <= 0) {
            return;
        }
        if (str2 == null) {
            C930480aJy c930480aJy = C930480aJy.LIZ;
            if (str != null) {
                lLIZIZ = C1946707jt.LIZIZ(str);
            } else {
                lLIZIZ = null;
            }
            c930480aJy.getClass();
            strLJJIJL = C930480aJy.LJJIJL(lLIZIZ);
        } else {
            strLJJIJL = str2;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startAigcPlayCountDown, myLinkMicId = ");
        sbLIZ2.append(strLJJIJL);
        C20441214yg.LIZIZ("MultiGuestAigcWallpaperUtil", C2188811AlT.LIZIZ(sbLIZ2));
        LIZJ = (C19487111Lx) new C11IW(C19490011Na.LIZLLL(1L, jLIZJ, 0L, 1L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJIII(new AfS3S1100100_15(jLIZJ, dataChannel, strLJJIJL, 3)).LJJIIJZLJL(new C987110bnJ(dataChannel, str2, 1)).LJJIIZ(new InterfaceC781210Ukh() { // from class: X.0aXo
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C20441214yg.LIZIZ("MultiGuestAigcWallpaperUtil", "countdown: doOnDispose");
            }
        })).LJIILL().LJIIZILJ();
    }

    public static void LJIIJ(DataChannel dataChannel, List list, List list2, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            LJI(arrayList);
        }
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                linkedHashMap.put(((WallpaperContext) obj).linkmicIdStr, Integer.valueOf(i2));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isGuest = ");
        sbLIZ.append(z);
        sbLIZ.append(" ,updateAigcPlayOrder: ");
        sbLIZ.append(linkedHashMap);
        C20441214yg.LIZIZ("MultiGuestAigcWallpaperUtil", C2188811AlT.LIZIZ(sbLIZ));
        dataChannel.LC0(AigcWallpaperPlayOrderUpdateEvent.class, linkedHashMap);
    }

    public static void LIZLLL(boolean z, Long l, String str, Long l2, Long l3, int i, DataChannel dataChannel) {
        C500260Jjc.LJJLIIIJJIZ(new C939010aXj(z, l, str, l3, l2, i, dataChannel));
    }
}
