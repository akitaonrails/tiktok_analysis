package com.bytedance.android.live.livepullstream;

import X.C0IEB;
import X.C0IF5;
import X.C0IL2;
import X.C0IM0;
import X.C0IM1;
import X.C0IM2;
import X.C0IM9;
import X.C0IMA;
import X.C0INV;
import X.C0UYH;
import X.C0UZJ;
import X.C1161920gLG;
import X.C1286680jaU;
import X.C1508650pMV;
import X.C19EG;
import X.C1APP;
import X.C20856616jU;
import X.C2188811AlT;
import X.C464010IHn;
import X.C465130ILv;
import X.C465140ILw;
import X.C465150ILx;
import X.C465160ILy;
import X.C479320Iqw;
import X.C480680It8;
import X.C786410Ut5;
import X.C827750WdZ;
import X.InterfaceC1502380pCO;
import X.InterfaceC1699460uKG;
import X.InterfaceC463820IGu;
import X.InterfaceC465170ILz;
import X.InterfaceC480510Isr;
import X.InterfaceC480570Isx;
import X.InterfaceC780290UjD;
import X.InterfaceC784360Upm;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class PullStreamService implements IPullStreamService {
    public C479320Iqw LL;

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final synchronized C0IM1 XZ0() {
        if (this.LL == null) {
            this.LL = new C479320Iqw();
        }
        return this.LL;
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final synchronized void v42() {
        String playerTag;
        C479320Iqw c479320Iqw = this.LL;
        if (c479320Iqw != null) {
            InterfaceC480510Isr interfaceC480510Isr = c479320Iqw.LIZ;
            if (interfaceC480510Isr != null && ((playerTag = c479320Iqw.LIZIZ) != null || (playerTag = interfaceC480510Isr.getPlayerTag()) != null)) {
                c479320Iqw.LIZ(interfaceC480510Isr, playerTag);
            }
            this.LL = null;
        }
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final String IG0() {
        return ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isInMusicallyRegion() ? "musically_live" : "tiktok_live";
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final int TJ1() {
        try {
            InterfaceC480510Isr interfaceC480510IsrLIZIZ = C480680It8.LJ.LIZIZ(C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag);
            if (interfaceC480510IsrLIZIZ != null) {
                return interfaceC480510IsrLIZIZ.isWidevineDrmStream() ? 1 : 0;
            }
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final C1286680jaU JE() {
        C465160ILy.LIZ().getClass();
        return (C1286680jaU) C1APP.LIZIZ(C1286680jaU.class);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final C465130ILv Qt1() {
        return C465130ILv.LIZIZ();
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final InterfaceC1699460uKG Wr1() {
        C465160ILy.LIZ().getClass();
        return (InterfaceC1699460uKG) C1APP.LIZIZ(InterfaceC1699460uKG.class);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final InterfaceC480510Isr Xj1() {
        C465160ILy.LIZ().getClass();
        return (InterfaceC480510Isr) C1APP.LIZIZ(InterfaceC480510Isr.class);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final InterfaceC780290UjD ZC0() {
        C465160ILy.LIZ().getClass();
        return (InterfaceC780290UjD) C1APP.LIZIZ(InterfaceC780290UjD.class);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final InterfaceC784360Upm fY1() {
        C465160ILy.LIZ().getClass();
        return (InterfaceC784360Upm) C1APP.LIZIZ(InterfaceC784360Upm.class);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final JSONObject hj() {
        return C1508650pMV.LIZ();
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final InterfaceC1502380pCO jA1() {
        C465160ILy.LIZ().getClass();
        return (InterfaceC1502380pCO) C1APP.LIZIZ(InterfaceC1502380pCO.class);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final C0UZJ rC0() {
        C465160ILy.LIZ().getClass();
        return (C0UZJ) C1APP.LIZIZ(C0UZJ.class);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final void zg1() {
        Iterator it2 = ((HashMap) C465130ILv.LIZIZ().LIZIZ).entrySet().iterator();
        while (it2.hasNext()) {
            C0IEB c0ieb = (C0IEB) ((Map.Entry) it2.next()).getValue();
            if (c0ieb.getPlayerTag() != null && c0ieb.getPlayerTag().contains("prepare")) {
                c0ieb.release();
                it2.remove();
            }
        }
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final C480680It8 YY() {
        return C480680It8.LJ;
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final C0IM1 bp1() {
        return this.LL;
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final void R92(String str) {
        C0IEB c0iebLIZJ;
        String playerTag;
        C465130ILv c465130ILvLIZIZ = C465130ILv.LIZIZ();
        c465130ILvLIZIZ.getClass();
        String str2 = C465130ILv.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recycle() -> playerTag=");
        sbLIZ.append(str);
        C827750WdZ.LIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && (c0iebLIZJ = c465130ILvLIZIZ.LIZJ(str)) != null && (playerTag = c0iebLIZJ.getPlayerTag()) != null) {
            c0iebLIZJ.release();
            ((HashMap) c465130ILvLIZIZ.LIZIZ).remove(playerTag);
            ((LinkedList) c465130ILvLIZIZ.LIZJ).offer(c0iebLIZJ);
        }
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final void cy1(String str) {
        C0IM0.LIZ = str;
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final String fG2(C0IM2 c0im2) {
        C465130ILv c465130ILvLIZIZ = C465130ILv.LIZIZ();
        c465130ILvLIZIZ.getClass();
        C0IEB c0iebLIZJ = c465130ILvLIZIZ.LIZJ(c0im2.LJIIIIZZ);
        if (c0iebLIZJ != null) {
            if (c0iebLIZJ.getIsPreparePlayer() && !c0iebLIZJ.getPlayerHasLogPrePlayerHitCache()) {
                c0iebLIZJ.setPlayerHashLogPrePlayerHitCache(true);
                C465130ILv.LJFF(1);
            }
            c0iebLIZJ.preparePlayerWithConfig(c0im2, true);
            return c0iebLIZJ.getPlayerTag();
        }
        C0IEB c0iebLIZ = c465130ILvLIZIZ.LIZ(new C0IMA("", Long.valueOf(c0im2.LJIIIZ), false, ""), c0im2.LJII, "", "", c0im2.LJI, c0im2.LJFF, c0im2.LJ, c0im2.LIZLLL, 0L, true);
        c0iebLIZ.preparePlayerWithConfig(c0im2, false);
        return c0iebLIZ.getPlayerTag();
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final void sW1(InterfaceC465170ILz interfaceC465170ILz) {
        CopyOnWriteArrayList<InterfaceC465170ILz> copyOnWriteArrayList = C465150ILx.LIZJ;
        if (!copyOnWriteArrayList.contains(interfaceC465170ILz)) {
            copyOnWriteArrayList.add(interfaceC465170ILz);
            for (Map.Entry<String, Boolean> entry : C465150ILx.LIZIZ.entrySet()) {
                interfaceC465170ILz.LIZ(entry.getKey(), true, entry.getValue().booleanValue(), false);
            }
            for (Map.Entry<String, Boolean> entry2 : C465150ILx.LIZ.entrySet()) {
                interfaceC465170ILz.LIZ(entry2.getKey(), true, entry2.getValue().booleanValue(), true);
            }
        }
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final void t11(String str) {
        C465130ILv c465130ILvLIZIZ = C465130ILv.LIZIZ();
        if (str == null) {
            c465130ILvLIZIZ.getClass();
            return;
        }
        C0IEB c0iebLIZJ = c465130ILvLIZIZ.LIZJ(str);
        if (c0iebLIZJ == null) {
            return;
        }
        c0iebLIZJ.stop(false);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final void bindSurface(C0IF5 c0if5, String str) {
        C465130ILv.LIZIZ().LIZJ(str).bindSurface(c0if5, str);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final C0IEB iB0(Context context, Room room) {
        String str;
        long j;
        int secret;
        boolean zIsForcedLowLatency;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("warmUp -> roomId=");
        sbLIZ.append(room.getId());
        C827750WdZ.LIZ("PullStreamService", C2188811AlT.LIZIZ(sbLIZ));
        C465130ILv c465130ILvLIZIZ = C465130ILv.LIZIZ();
        c465130ILvLIZIZ.getClass();
        C0INV c0inv = C0IL2.LIZ;
        String str2 = c0inv.LIZ().mEnterRoomConfig.mRoomsData.enterRoomScene;
        try {
            str = c0inv.LIZ().mEnterRoomConfig.mRoomsData.enterMethodSubtag;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            str = null;
        }
        if (room.getStreamUrl() != null) {
            j = room.getStreamUrl().streamDelayMs;
        } else {
            j = 0;
        }
        if (room.getOwner() != null) {
            secret = room.getOwner().getSecret();
        } else {
            secret = 1;
        }
        if (room.getOptions() != null) {
            zIsForcedLowLatency = room.isForcedLowLatency();
        } else {
            zIsForcedLowLatency = false;
        }
        return c465130ILvLIZIZ.LJ(new C0IMA("", Long.valueOf(room.getId()), zIsForcedLowLatency, room.logId), context, room.buildPullUrl(), room.getSdkParams(), room.getMultiStreamData(), room.getMultiStreamDefaultQualitySdkKey(), room.getStreamUrlExtraSafely().srConfig, room.getStreamType(), false, null, str2, j, false, Integer.valueOf(secret), str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0IEB dv1(X.C0IMA r27, com.bytedance.android.livesdkapi.session.EnterRoomConfig r28, android.content.Context r29) {
        /*
            r26 = this;
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "warmUp -> roomId="
            r2.append(r0)
            r9 = r27
            long r0 = X.C0IM9.LIZ(r9)
            r2.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)
            java.lang.String r0 = "PullStreamService"
            X.C827750WdZ.LIZ(r0, r1)
            X.0ILv r8 = X.C465130ILv.LIZIZ()
            r8.getClass()
            r3 = r28
            if (r3 != 0) goto L28
            r0 = 0
            return r0
        L28:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$StreamData r1 = r3.mStreamData
            boolean r0 = r1.isMultiStreamMode
            r10 = r29
            if (r0 == 0) goto L58
            if (r10 == 0) goto L45
            android.content.res.Resources r0 = r10.getResources()     // Catch: java.lang.Exception -> L41
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Exception -> L41
            int r1 = r0.orientation     // Catch: java.lang.Exception -> L41
            r0 = 2
            if (r0 != r1) goto L45
            r2 = 1
            goto L46
        L41:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L45:
            r2 = 0
        L46:
            com.bytedance.android.livesdk.livesetting.watchlive.TtliveSwapMultiStreamDataSetting r0 = com.bytedance.android.livesdk.livesetting.watchlive.TtliveSwapMultiStreamDataSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto La6
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$StreamData r1 = r3.mStreamData
            boolean r0 = r1.isHorizontalStream
            if (r2 == 0) goto La3
            if (r0 != 0) goto L58
        L56:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$StreamData r1 = r3.mSubStreamData
        L58:
            java.lang.String r11 = r1.pullStreamUrl
            java.lang.String r2 = r1.pullStreamData
            java.lang.String r13 = r1.sharePullStreamData
            boolean r0 = X.C2093608Ic.LJ(r13)
            if (r0 == 0) goto L65
            r13 = r2
        L65:
            r17 = r0 ^ 1
            java.lang.String r14 = r1.pullDefaultResolution
            int r0 = r1.streamType
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r16 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.valueOf(r0)
            java.lang.String r12 = r1.pullSDKParam
            boolean r4 = r1.extraStreamSREnable
            boolean r2 = r1.extraStreamSRAntiAlias
            int r0 = r1.extraStreamSRStrength
            com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra$SrConfig r15 = new com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra$SrConfig
            r15.<init>(r4, r2, r0)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r2 = r3.mRoomsData
            java.lang.String r7 = r2.warmUpPlayerTag
            java.lang.String r6 = r2.enterRoomScene
            java.lang.String r5 = r2.enterMethodSubtag
            long r0 = r1.captionStreamDelayMs
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$FeedCoverData r4 = r3.mFeedCoverData
            boolean r4 = r4.enterPreviewSmooth
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r3 = r3.mLogData
            boolean r3 = r3.optSearchWarmUpDuration
            java.lang.Integer r2 = r2.isSecret
            r20 = r0
            r22 = r4
            r23 = r2
            r24 = r5
            r25 = r3
            r18 = r7
            r19 = r6
            X.0IEB r0 = r8.LJ(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25)
            return r0
        La3:
            if (r0 != 0) goto L56
            goto L58
        La6:
            if (r2 == 0) goto Lab
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$StreamData r1 = r3.mStreamData
            goto L58
        Lab:
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$StreamData r1 = r3.mSubStreamData
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.livepullstream.PullStreamService.dv1(X.0IMA, com.bytedance.android.livesdkapi.session.EnterRoomConfig, android.content.Context):X.0IEB");
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final RoomPlayer2 sh0(C0IMA c0ima, String str, String str2, LiveMode liveMode, StreamUrlExtra.SrConfig srConfig, C20856616jU c20856616jU, C0UYH c0uyh, C19EG c19eg, long j) {
        C786410Ut5.N3(c19eg);
        C465140ILw c465140ILw = new C465140ILw();
        c465140ILw.LIZ = str;
        if (!TextUtils.isEmpty(str)) {
            c465140ILw.LJII = 1;
        }
        c465140ILw.LIZIZ = str2;
        c465140ILw.LJ = liveMode;
        c465140ILw.LJFF = srConfig;
        c465140ILw.LJI = j;
        return new RoomPlayer2(c0ima, c465140ILw, c20856616jU, c0uyh);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final String Si2(C0IMA c0ima, Context context, String str, String str2, String str3, String str4, StreamUrlExtra.SrConfig srConfig, LiveMode liveMode, String str5, long j) {
        C465130ILv c465130ILvLIZIZ = C465130ILv.LIZIZ();
        C0IEB c0iebLIZJ = c465130ILvLIZIZ.LIZJ(str5);
        if (c0iebLIZJ != null) {
            if (c0iebLIZJ.getIsPreparePlayer() && !c0iebLIZJ.getPlayerHasLogPrePlayerHitCache()) {
                c0iebLIZJ.setPlayerHashLogPrePlayerHitCache(true);
                C465130ILv.LJFF(1);
            }
            return c0iebLIZJ.getPlayerTag();
        }
        C0IEB c0iebLIZ = c465130ILvLIZIZ.LIZ(c0ima, context, str, str2, str3, str4, srConfig, liveMode, j, true);
        c0iebLIZ.preparePlayer(c0ima);
        return c0iebLIZ.getPlayerTag();
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final C0IEB SM0(C0IMA c0ima, String str, String str2, LiveMode liveMode, StreamUrlExtra.SrConfig srConfig, InterfaceC463820IGu interfaceC463820IGu, InterfaceC480570Isx interfaceC480570Isx, Context context, String str3, long j, boolean z) {
        long jLIZ = C0IM9.LIZ(c0ima);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ensureRoomPlayer -> roomId=");
        sbLIZ.append(jLIZ);
        sbLIZ.append(", playerTag=");
        sbLIZ.append(str3);
        C827750WdZ.LIZ("PullStreamService", C2188811AlT.LIZIZ(sbLIZ));
        C465130ILv c465130ILvLIZIZ = C465130ILv.LIZIZ();
        C0IEB c0iebLIZJ = c465130ILvLIZIZ.LIZJ(str3);
        if (c0iebLIZJ != null) {
            c0iebLIZJ.attach(context, interfaceC463820IGu, interfaceC480570Isx, z);
            if (c0iebLIZJ.getIsPreparePlayer() && !c0iebLIZJ.getPlayerHasLogPrePlayerHitCache()) {
                c0iebLIZJ.setPlayerHashLogPrePlayerHitCache(true);
                C465130ILv.LJFF(1);
            }
            return c0iebLIZJ;
        }
        C0IEB c0iebLIZ = c465130ILvLIZIZ.LIZ(c0ima, context, null, null, str, str2, srConfig, liveMode, j, false);
        c0iebLIZ.attach(context, interfaceC463820IGu, interfaceC480570Isx, false);
        return c0iebLIZ;
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final C0IEB na0(C0IMA c0ima, String str, LiveMode liveMode, StreamUrlExtra.SrConfig srConfig, InterfaceC463820IGu interfaceC463820IGu, C464010IHn c464010IHn, Context context, String str2, String str3, long j, boolean z) {
        long jLIZ = C0IM9.LIZ(c0ima);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ensureRoomPlayer -> roomId=");
        sbLIZ.append(jLIZ);
        sbLIZ.append(", playerTag=");
        sbLIZ.append(str3);
        C827750WdZ.LIZ("PullStreamService", C2188811AlT.LIZIZ(sbLIZ));
        C465130ILv c465130ILvLIZIZ = C465130ILv.LIZIZ();
        C0IEB c0iebLIZJ = c465130ILvLIZIZ.LIZJ(str3);
        if (c0iebLIZJ != null) {
            c0iebLIZJ.attach(context, interfaceC463820IGu, c464010IHn, z);
            if (c0iebLIZJ.getIsPreparePlayer() && !c0iebLIZJ.getPlayerHasLogPrePlayerHitCache()) {
                c0iebLIZJ.setPlayerHashLogPrePlayerHitCache(true);
                C465130ILv.LJFF(1);
            }
            return c0iebLIZJ;
        }
        C0IEB c0iebLIZ = c465130ILvLIZIZ.LIZ(c0ima, context, str, str2, null, null, srConfig, liveMode, j, false);
        c0iebLIZ.attach(context, interfaceC463820IGu, c464010IHn, false);
        return c0iebLIZ;
    }
}
