package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEnableRoomSharePanelFilterSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.01Z2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01Z2 {
    public static final ConcurrentHashMap<Long, Set<String>> LIZ = new ConcurrentHashMap<>();
    public static volatile List<Long> LIZIZ = C13BV.INSTANCE;
    public static final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public static volatile AnonymousClass0956 LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ() {
        /*
            boolean r0 = X.C930540aK4.LJJIJ()
            if (r0 != 0) goto L29
            boolean r0 = X.C930540aK4.LJJIIZI()
            r2 = 0
            if (r0 == 0) goto L2a
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            X.0awC r0 = r0.LLJLL()
            if (r0 == 0) goto L2a
            java.util.List r0 = r0.LIZLLL()
            if (r0 == 0) goto L2a
            java.util.List r0 = X.C948780anU.LIZ(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L2a
        L29:
            r2 = 1
        L2a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isInLinkMic, "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "MultiGuestShareFilterManager"
            X.C20441214yg.LIZIZ(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01Z2.LIZ():boolean");
    }

    public static void LIZJ() {
        IHostShare iHostShare;
        if (MultiGuestEnableRoomSharePanelFilterSetting.enable()) {
            C20441214yg.LIZIZ("MultiGuestShareFilterManager", "refresh");
            List<Long> internalShareSortedUids = LIZIZ;
            if (internalShareSortedUids.isEmpty() && ((iHostShare = (IHostShare) C1161920gLG.LIZJ(IHostShare.class)) == null || (internalShareSortedUids = iHostShare.getInternalShareSortedUids()) == null)) {
                internalShareSortedUids = C13BV.INSTANCE;
            }
            LIZLLL(internalShareSortedUids, true);
        }
    }

    public static void LIZIZ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLeaveRoom, anchorId = ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("MultiGuestShareFilterManager", C2188811AlT.LIZIZ(sbLIZ));
        AnonymousClass0956 anonymousClass0956 = LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LIZLLL = null;
        LIZIZ = C13BV.INSTANCE;
        LIZ.remove(Long.valueOf(j));
    }

    public static void LIZLLL(List list, boolean z) {
        if (!LIZ() && !z) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestFilter, ");
        sbLIZ.append(list);
        C20441214yg.LIZIZ("MultiGuestShareFilterManager", C2188811AlT.LIZIZ(sbLIZ));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        if (roomLJJLI != null) {
            long ownerUserId = roomLJJLI.getOwnerUserId();
            if (list.isEmpty()) {
                return;
            }
            AnonymousClass0956 anonymousClass0956 = LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            LIZLLL = C23250099c.LIZLLL(LIZJ, null, null, new C01JI(ownerUserId, list, null), 3);
        }
    }
}
