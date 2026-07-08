package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.api.CohostGuestListChangeChannel;
import com.bytedance.android.live.liveinteract.api.HostWithGuestsModeChangeEvent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS30S0010000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.GuestUserInfo;
import webcast.im.CohostContent;
import webcast.im.ListChangeBizContent;

/* JADX INFO: renamed from: X.0ajM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946220ajM {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Function0<DataChannel> LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(223));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(222));

    public final Map<Long, GuestUserInfo> LIZIZ() {
        return (Map) this.LIZJ.getValue();
    }

    public final Map<Long, C936770aU7> LIZJ() {
        return (Map) this.LIZIZ.getValue();
    }

    public final List<C936770aU7> LIZ() {
        return C13LP.LLIIII(LIZJ().values());
    }

    public C946220ajM(AwS559S0100000_15 awS559S0100000_15) {
        this.LIZ = awS559S0100000_15;
    }

    public final void LIZLLL(List<C936770aU7> list) {
        long id;
        long jLongValue;
        DataChannel dataChannelInvoke;
        String str;
        boolean zLJJLIIIJJI = C915980Zwa.LJII().LJJLIIIJJI();
        C946240ajO.LIZ().LJIILLIIL("notifyGuestListChange", new AwS30S0010000_15(zLJJLIIIJJI, 3));
        DataChannelGlobal.LLILZ.FQ2(HostWithGuestsModeChangeEvent.class, Boolean.valueOf(zLJJLIIIJJI));
        if (!Intrinsics.LJFF(list, LIZ()) && (dataChannelInvoke = this.LIZ.invoke()) != null) {
            List listLIZ = C923470a8f.LIZ(LIZ());
            List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
            for (C954460awe c954460awe : listLLILZLL) {
                final long j = c954460awe.LJ;
                long j2 = c954460awe.LJFF;
                final String str2 = c954460awe.LJIIJJI;
                final String strLIZ = C946260ajQ.LIZ(c954460awe.LJIJJ);
                C754570Tip c754570Tip = c954460awe.LJIJJ;
                ImageModel imageModel = null;
                if (c754570Tip != null) {
                    imageModel = c754570Tip.LIZJ;
                    str = c754570Tip.LIZ;
                } else {
                    str = null;
                }
                final Long lValueOf = Long.valueOf(j2);
                final String str3 = str;
                final ImageModel imageModel2 = imageModel;
                arrayList.add(new C923380a8W(j, str2, lValueOf, strLIZ, imageModel2, str3) { // from class: X.0a8b
                });
            }
            C946240ajO.LIZ().LJIILLIIL("notifyGuestListChange", new AwS381S0200000_15(listLIZ, (List<C923440a8c>) arrayList, (List<C923430a8b>) 86));
            dataChannelInvoke.zW(CohostGuestListChangeChannel.class, new C923390a8X(listLIZ, arrayList));
        }
        Map<Long, C936770aU7> mapLIZJ = LIZJ();
        int size = C915980Zwa.LJII().LJJIIJZLJL().size();
        int size2 = C915980Zwa.LJII().LJJJJI(C950220apo.LIZLLL()).size();
        if (C946250ajP.LIZ > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jLIZ = C158B.LIZ();
            if (size > 0) {
                long j3 = C946250ajP.LIZIZ;
                if (j3 > 0) {
                    C946250ajP.LIZLLL += jElapsedRealtime - j3;
                }
                C946250ajP.LIZIZ = jElapsedRealtime;
                C946230ajN.LJI(jLIZ);
            } else {
                long j4 = C946250ajP.LIZIZ;
                if (j4 > 0) {
                    C946250ajP.LIZLLL += jElapsedRealtime - j4;
                }
                C946250ajP.LIZIZ = jElapsedRealtime;
                C946250ajP.LIZIZ = -1L;
                if (C946230ajN.LIZ > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("stopWatchGuest: now: ");
                    sbLIZ.append(jLIZ);
                    C20441214yg.LJIIIZ("MatchWithGuestTracking", C2188811AlT.LIZIZ(sbLIZ));
                    long j5 = C946230ajN.LIZLLL;
                    if (j5 > 0) {
                        C946230ajN.LJFF += jLIZ - j5;
                    }
                    C946230ajN.LIZLLL = -1L;
                }
            }
            if (size2 > 0) {
                long j6 = C946250ajP.LIZJ;
                if (j6 > 0) {
                    C946250ajP.LJ += jElapsedRealtime - j6;
                }
                C946250ajP.LIZJ = jElapsedRealtime;
                C946230ajN.LJII(jLIZ);
            } else {
                long j7 = C946250ajP.LIZJ;
                if (j7 > 0) {
                    C946250ajP.LJ += jElapsedRealtime - j7;
                }
                C946250ajP.LIZJ = jElapsedRealtime;
                C946250ajP.LIZJ = -1L;
                if (C946230ajN.LIZ > 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("stopWatchOwnGuest: now ");
                    sbLIZ2.append(jLIZ);
                    C20441214yg.LJIIIZ("MatchWithGuestTracking", C2188811AlT.LIZIZ(sbLIZ2));
                    long j8 = C946230ajN.LJ;
                    if (j8 > 0) {
                        C946230ajN.LJI += jLIZ - j8;
                    }
                    C946230ajN.LJ = -1L;
                }
            }
        }
        int size3 = C915980Zwa.LJII().LJJIIJZLJL().size();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        if (!C915980Zwa.LJII().LJJJJI(id).isEmpty()) {
            int i = C914820Zui.LIZJ;
            if (i >= size3) {
                size3 = i;
            }
            C914820Zui.LIZJ = size3;
        }
        for (C936770aU7 c936770aU7 : mapLIZJ.values()) {
            Long l = c936770aU7.LIZIZ;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (id != 0 && jLongValue == id) {
                C914820Zui.LIZIZ.put(Long.valueOf(c936770aU7.LIZ), c936770aU7);
            } else if (jLongValue != 0) {
                C914820Zui.LIZ.put(Long.valueOf(c936770aU7.LIZ), c936770aU7);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("updateGuestList, No RoomId, guest=");
                sbLIZ3.append(c936770aU7);
                C20441214yg.LJIIIZ("HostWithGuestTracking", C2188811AlT.LIZIZ(sbLIZ3));
                if (!C914820Zui.LIZIZ.containsKey(Long.valueOf(c936770aU7.LIZ))) {
                    C914820Zui.LIZ.put(Long.valueOf(c936770aU7.LIZ), c936770aU7);
                }
            }
            C946230ajN.LJ(c936770aU7);
            C946230ajN.LJFF(c936770aU7);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("updateGuestList, roomId = ");
        sbLIZ4.append(id);
        sbLIZ4.append(", ownAccumulatedGuestMap.size = ");
        sbLIZ4.append(C914820Zui.LIZIZ.size());
        sbLIZ4.append(", otherAnchorAccumulatedGuestMap.size = ");
        sbLIZ4.append(C914820Zui.LIZ.size());
        sbLIZ4.append("newGuestMap = ");
        sbLIZ4.append(mapLIZJ);
        C20441214yg.LJIIIZ("HostWithGuestTracking", C2188811AlT.LIZIZ(sbLIZ4));
    }

    public final void LJ(InterfaceC954180awC interfaceC954180awC, BusinessContent businessContent, String str) {
        Map<Long, GuestUserInfo> map;
        CohostContent cohostContent;
        ListChangeBizContent listChangeBizContent;
        if (businessContent != null && (cohostContent = businessContent.cohostContent) != null && (listChangeBizContent = cohostContent.listChangeBizContent) != null) {
            map = listChangeBizContent.guestUserInfos;
        } else {
            map = null;
        }
        LJFF(interfaceC954180awC, str, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029a A[PHI: r1
      0x029a: PHI (r1v19 java.lang.String) = (r1v17 java.lang.String), (r1v23 java.lang.String) binds: [B:131:0x0299, B:121:0x0263] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a2 A[PHI: r4
      0x02a2: PHI (r4v4 com.bytedance.android.live.base.model.ImageModel) = (r4v2 com.bytedance.android.live.base.model.ImageModel), (r4v6 com.bytedance.android.live.base.model.ImageModel) binds: [B:135:0x02a1, B:114:0x0255] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0292 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.InterfaceC954180awC r30, java.lang.String r31, java.util.Map r32) {
        /*
            Method dump skipped, instruction units count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C946220ajM.LJFF(X.0awC, java.lang.String, java.util.Map):void");
    }
}
