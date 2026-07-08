package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* JADX INFO: renamed from: X.0IVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467660IVo {
    public Room LIZ;
    public long LIZIZ;
    public List<Long> LIZJ = C13BV.INSTANCE;
    public volatile boolean LIZLLL;
    public C19487111Lx LJ;

    public final void LIZ() {
        if (this.LIZLLL) {
            this.LIZLLL = false;
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).oZ0(this.LIZJ, this.LIZIZ, this.LIZ);
            C19487111Lx c19487111Lx = this.LJ;
            if (c19487111Lx != null) {
                c19487111Lx.dispose();
            }
            this.LJ = null;
            this.LIZIZ = 0L;
            this.LIZJ = C13BV.INSTANCE;
        }
    }

    public final void LIZIZ(DataChannel dataChannel) {
        if (this.LIZLLL) {
            return;
        }
        C19487111Lx c19487111Lx = this.LJ;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LJ = null;
        this.LIZLLL = true;
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).lX1(this.LIZIZ, dataChannel, this.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.util.List<java.lang.Long>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.android.livesdkapi.depend.model.live.Room r10, com.bytedance.ies.sdk.datachannel.DataChannel r11) {
        /*
            r9 = this;
            com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostAudienceWatchEventReportMigrate r0 = com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostAudienceWatchEventReportMigrate.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto La9
            if (r10 == 0) goto La9
            r9.LIZ = r10
            com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo r0 = r10.getLinkMicInfo()
            r7 = 0
            if (r0 == 0) goto L4f
            com.bytedance.android.livesdkapi.depend.model.live.ChannelInfo r0 = r0.channelInfo
            if (r0 == 0) goto L4f
            long r2 = r0.groupChannelId
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L4f
        L1e:
            com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings r0 = r10.multiLiveUserSettings
            if (r0 == 0) goto L5b
            com.bytedance.android.livesdk.model.linksetting.CoHost r0 = r0.coHost
            if (r0 == 0) goto L5b
            java.util.List<com.bytedance.android.livesdk.model.linksetting.LinkmicUser> r1 = r0.linkedUsers
            if (r1 == 0) goto L5b
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r6.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        L39:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r4.next()
            com.bytedance.android.livesdk.model.linksetting.LinkmicUser r0 = (com.bytedance.android.livesdk.model.linksetting.LinkmicUser) r0
            long r0 = r0.userId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.add(r0)
            goto L39
        L4f:
            com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo r0 = r10.getLinkMicInfo()
            if (r0 == 0) goto L58
            long r2 = r0.channelId
            goto L1e
        L58:
            r2 = 0
            goto L1e
        L5b:
            X.13BV r6 = X.C13BV.INSTANCE
        L5d:
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            java.lang.String r5 = "_linkedUidListSize_is_"
            java.lang.String r4 = "onLivePlayReport_channelId_is_"
            if (r0 <= 0) goto L8b
            int r1 = r6.size()
            r0 = 1
            if (r1 <= r0) goto L8b
            r9.LIZIZ = r2
            r9.LIZJ = r6
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r4)
            r1.append(r2)
            r1.append(r5)
            int r0 = r6.size()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            r9.LIZIZ(r11)
            return
        L8b:
            boolean r0 = r9.LIZLLL
            if (r0 == 0) goto La9
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r4)
            r1.append(r2)
            r1.append(r5)
            int r0 = r6.size()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            r9.LIZ()
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C467660IVo.LIZJ(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
