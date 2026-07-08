package X;

import Y.ARunnableS21S1100000_16;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.liveinteract.multimatch.virtualticket.event.BattleShowVirtualTicketCrossRoomClaimTipChannel;
import com.bytedance.android.livesdkapi.depend.model.live.match.VirtualTicketEnvelopeInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0erA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104820erA {
    public WeakReference<DataChannel> LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public C1104830erB LJ;
    public Runnable LJFF;
    public boolean LJI;
    public boolean LJII;
    public final Set<Long> LIZ = new HashSet();
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(224));

    public static void LJ() {
        C20337914i1<Map<Long, Integer>> c20337914i1 = InterfaceC1104970erP.P2;
        Map<Long, Integer> mapLIZIZ = c20337914i1.LIZIZ();
        Integer num = mapLIZIZ.get(Long.valueOf(C930540aK4.LJIIL()));
        if (num == null || num.intValue() <= 0) {
            HashMap map = new HashMap(mapLIZIZ);
            map.put(Long.valueOf(C930540aK4.LJIIL()), 1);
            c20337914i1.LJFF(map);
        }
    }

    public final void LIZ() {
        Runnable runnable = this.LJFF;
        if (runnable != null) {
            ((Handler) this.LJIIIIZZ.getValue()).removeCallbacks(runnable);
        }
        this.LJFF = null;
    }

    public final void LIZJ() {
        DataChannel dataChannel;
        LIZ();
        this.LJII = false;
        C1104830erB c1104830erB = this.LJ;
        if (c1104830erB == null) {
            return;
        }
        this.LJ = null;
        WeakReference<DataChannel> weakReference = this.LIZIZ;
        if (weakReference == null || (dataChannel = weakReference.get()) == null) {
            return;
        }
        dataChannel.zW(BattleShowVirtualTicketCrossRoomClaimTipChannel.class, c1104830erB);
        Long lValueOf = Long.valueOf(c1104830erB.LIZLLL);
        Long lValueOf2 = Long.valueOf(c1104830erB.LJ);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_match_virtual_tickets_guide_show");
        c474500IjALIZ.LJJIIZI(C500460Jjw.LIZ(lValueOf, lValueOf2, "opponent_claim"));
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        C20337914i1<Map<Long, Integer>> c20337914i1 = InterfaceC1104970erP.O2;
        HashMap map = new HashMap(c20337914i1.LIZIZ());
        Long lValueOf3 = Long.valueOf(C930540aK4.LJIIL());
        Integer num = (Integer) map.get(Long.valueOf(C930540aK4.LJIIL()));
        map.put(lValueOf3, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        c20337914i1.LJFF(map);
    }

    public static Integer LIZIZ(VirtualTicketEnvelopeInfo virtualTicketEnvelopeInfo) {
        long j = virtualTicketEnvelopeInfo.sendTimeSec;
        if (j > 10000000000L) {
            j /= 1000;
        }
        long j2 = 0;
        if (j > 0 && virtualTicketEnvelopeInfo.displaySeconds > 0) {
            long jLIZ = ((j + virtualTicketEnvelopeInfo.displaySeconds) + virtualTicketEnvelopeInfo.rushSeconds) - (C158B.LIZ() / 1000);
            if (jLIZ >= 0) {
                j2 = jLIZ;
                if (j2 > 2147483647L) {
                    j2 = 2147483647L;
                }
            }
            return Integer.valueOf((int) j2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe A[PHI: r1
      0x00fe: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String) binds: [B:70:0x00fc, B:66:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.bytedance.android.livesdkapi.depend.model.live.match.VirtualTicketEnvelopeInfo r23) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1104820erA.LIZLLL(com.bytedance.android.livesdkapi.depend.model.live.match.VirtualTicketEnvelopeInfo):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.bytedance.android.livesdkapi.depend.model.live.match.VirtualTicketEnvelopeInfo r42) {
        /*
            r41 = this;
            r11 = r42
            long r6 = r11.toAnchorId
            r19 = 0
            int r0 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r0 > 0) goto L12
            java.lang.String r1 = "VirtualTicketCrossRoomGuide"
            java.lang.String r0 = "renderCrossRoomTreasureIcon: missing toAnchorId"
            X.C20441214yg.LJIIL(r1, r0)
            return
        L12:
            r15 = r41
            java.lang.ref.WeakReference<com.bytedance.ies.sdk.datachannel.DataChannel> r0 = r15.LIZIZ
            if (r0 == 0) goto L8b
            java.lang.Object r10 = r0.get()
            com.bytedance.ies.sdk.datachannel.DataChannel r10 = (com.bytedance.ies.sdk.datachannel.DataChannel) r10
            if (r10 == 0) goto L8b
            java.lang.Integer r1 = LIZIZ(r11)
            if (r1 == 0) goto Lb4
            int r0 = r1.intValue()
            if (r0 <= 0) goto Lb8
            int r9 = r1.intValue()
        L30:
            if (r9 <= 0) goto Lb8
            long r12 = r11.envelopeId
            long r4 = r11.toRoomId
            X.0ePj r8 = new X.0ePj
            com.bytedance.android.live.base.model.ImageModel r14 = r11.envelopeIcon
            long r2 = r11.sendTimeSec
            r16 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            r17 = 1000(0x3e8, double:4.94E-321)
            if (r0 <= 0) goto L49
            long r2 = r2 / r17
        L49:
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 <= 0) goto Lac
            long r0 = r11.displaySeconds
            int r16 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r16 <= 0) goto Lac
            long r2 = r2 + r0
            long r0 = r11.rushSeconds
        L56:
            long r2 = r2 + r0
            X.0er9 r32 = new X.0er9
            r33 = r15
            r34 = r11
            r35 = r4
            r37 = r12
            r39 = r6
            r32.<init>(r33, r34, r35, r37, r39)
            r30 = r4
            r25 = r9
            r26 = r2
            r28 = r12
            r21 = r8
            r22 = r6
            r24 = r14
            r21.<init>(r22, r24, r25, r26, r28, r30, r32)
            java.util.Set<java.lang.Long> r0 = X.C1104800er8.LIZ
            long r2 = r11.envelopeId
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 > 0) goto L8c
            java.lang.String r1 = "VirtualTicketCrossRoomIconTracker"
            java.lang.String r0 = "reportIconShow skipped: invalid envelope"
            X.C20441214yg.LJIIL(r1, r0)
        L86:
            java.lang.Class<com.bytedance.android.live.liveinteract.multimatch.virtualticket.event.VirtualTicketCrossRoomIconAttachChannel> r0 = com.bytedance.android.live.liveinteract.multimatch.virtualticket.event.VirtualTicketCrossRoomIconAttachChannel.class
            r10.zW(r0, r8)
        L8b:
            return
        L8c:
            java.util.Set<java.lang.Long> r1 = X.C1104800er8.LIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            boolean r0 = r1.add(r0)
            if (r0 == 0) goto L86
            java.lang.String r0 = "livesdk_match_virtual_tickets_icon_show"
            X.0IjA r1 = X.C0IJT.LIZ(r0)
            java.util.HashMap r0 = X.C1104800er8.LIZ(r11)
            r1.LJJIIZI(r0)
            r1.LJIL()
            r1.LIZ()
            goto L86
        Lac:
            long r2 = X.C158B.LIZ()
            long r2 = r2 / r17
            long r0 = (long) r9
            goto L56
        Lb4:
            r9 = 30
            goto L30
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1104820erA.LJI(com.bytedance.android.livesdkapi.depend.model.live.match.VirtualTicketEnvelopeInfo):void");
    }

    public final void LJII(String str) {
        LIZ();
        long j = this.LIZLLL;
        if (j > 0) {
            long jElapsedRealtime = (j + 3160) - SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= 0 && jElapsedRealtime > 0) {
                ARunnableS21S1100000_16 aRunnableS21S1100000_16 = new ARunnableS21S1100000_16(this, str, 7);
                this.LJFF = aRunnableS21S1100000_16;
                C786410Ut5.LJLIIL(jElapsedRealtime, (Handler) this.LJIIIIZZ.getValue(), aRunnableS21S1100000_16);
                return;
            }
        }
        LIZJ();
    }

    public static void LJFF(Context context, long j, long j2, long j3) {
        long jLongValue;
        String str;
        Object c098200Yq;
        ILiveMatchService iLiveMatchServiceLJFF = C915980Zwa.LJFF();
        Long lLJIIZILJ = C930540aK4.LJIIZILJ();
        if (lLJIIZILJ != null) {
            jLongValue = lLJIIZILJ.longValue();
        } else {
            jLongValue = 0;
        }
        int i = 1;
        boolean z = !iLiveMatchServiceLJFF.hI0(jLongValue, j3);
        if (C930540aK4.LIZJ()) {
            i = 0;
        } else if (C930540aK4.LJFF()) {
            i = 2;
        }
        Uri.Builder builderAppendQueryParameter = UriProtector.parse("aweme://roma_redirect/?spark_page=treasure_box_guide_virtual").buildUpon().appendQueryParameter("type", "go-claim").appendQueryParameter("target_room_id", String.valueOf(j));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        String string = builderAppendQueryParameter.appendQueryParameter("is_opponent", str).appendQueryParameter("user_type", String.valueOf(i)).appendQueryParameter("envelope_id", String.valueOf(j2)).appendQueryParameter("redpacket_anchor_id", String.valueOf(j3)).build().toString();
        if (context == null) {
            context = C497740JfY.LJII();
        }
        if (context == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("openLynxGoClaimPopup: no context envelope=");
            sbLIZ.append(j2);
            C20441214yg.LJ("VirtualTicketCrossRoomGuide", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        try {
            c098200Yq = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, string, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("openLynxGoClaimPopup failed envelope=");
            sbLIZ2.append(j2);
            C20441214yg.LJFF("VirtualTicketCrossRoomGuide", C2188811AlT.LIZIZ(sbLIZ2), thM5exceptionOrNullimpl);
        }
    }
}
