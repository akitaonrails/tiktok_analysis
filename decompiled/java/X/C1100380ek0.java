package X;

import android.content.Context;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.impl.revenue.portal.model.EnvelopPortal4FEModelSender;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.envelope.PortalListResponse;

/* JADX INFO: renamed from: X.0ek0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100380ek0 extends AbstractC1100450ek7 {
    public static final /* synthetic */ int LLJJIJIL = 0;
    public final DataChannel LLIZ;
    public final LifecycleOwner LLIZLLLIL;
    public final boolean LLJ;
    public final Set<Integer> LLJI;
    public boolean LLJIJIL;
    public final String LLJILJIL;
    public final ArrayList<Object> LLJILJILJ;
    public final List<Long> LLJILLL;
    public final ReentrantLock LLJJ;
    public boolean LLJJI;
    public String LLJJIII;
    public final C1151790g4v LLJJIJI;
    public final C1151720g4o LLJJIJIIJIL;

    @Override // X.AbstractC1100450ek7
    public final void LJJIIZ() {
        Boolean bool;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        IMessageManager iMessageManager;
        this.LLJILJILJ.clear();
        this.LLJJI = false;
        C1548820qPI.LIZLLL("LIVE_PORTAL_CREATE", this.LLJJIJI);
        C1548820qPI.LIZLLL("LIVE_PORTAL_CLOSE_ALL", this.LLJJIJI);
        C1548820qPI.LIZLLL("EVENT_OPEN_PORTAL_DETAIL", this.LLJJIJI);
        DataChannel dataChannel = this.LLIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.ENVELOPE_PORTAL_MESSAGE.getIntType(), this.LLJJIJIIJIL);
        }
        boolean zLJI = MethodIDManager.LJI(137871);
        ArrayList arrayList = new ArrayList();
        C11NJ c11nj = new C11NJ();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        DataChannel dataChannel2 = this.LLIZ;
        long jLIZIZ = C1078580eAq.LIZIZ(20, dataChannel2 != null ? C500260Jjc.LJJLIIIIJ(dataChannel2) : null, dataChannel2);
        boolean zLJJJJI = LJJJJI();
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            map.put("room_id", idStr);
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        map.put("is_anchor", zLJJJJI ? "1" : CardStruct.IStatusCode.DEFAULT);
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_portal_list_request");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIIJJI("live");
        if (BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        } else {
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        }
        if (SlardarSampleSetting.INSTANCE.isReport("ttlive_portal_list_request", 0.1d)) {
            C1CC2.LIZLLL("ttlive_portal_list_request", map, new HashMap(), new HashMap());
        }
        if (jLIZIZ > 0) {
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C090T(jLIZIZ, jElapsedRealtime, this, arrayList, c11nj, null), 2);
        } else {
            LJJJIL(arrayList, c11nj);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        DataChannel dataChannel3 = this.LLIZ;
        this.LLJIJIL = (dataChannel3 == null || (bool = (Boolean) dataChannel3.gg0(C0TZM.class)) == null) ? true : bool.booleanValue();
    }

    public final boolean LJJJJI() {
        Boolean bool;
        DataChannel dataChannel = this.LLIZ;
        if (dataChannel == null || (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // X.AbstractC1100450ek7
    public final void LJJIZ() {
        IMessageManager iMessageManager;
        super.LJJIZ();
        this.LLJILJILJ.clear();
        this.LLJJI = true;
        C1548820qPI.LJIIIIZZ("LIVE_PORTAL_CREATE", this.LLJJIJI);
        C1548820qPI.LJIIIIZZ("LIVE_PORTAL_CLOSE_ALL", this.LLJJIJI);
        C1548820qPI.LJIIIIZZ("EVENT_OPEN_PORTAL_DETAIL", this.LLJJIJI);
        DataChannel dataChannel = this.LLIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(C001A.ENVELOPE_PORTAL_MESSAGE.getIntType(), this.LLJJIJIIJIL);
        }
        this.LLJILLL.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJIL(java.util.List<com.bytedance.android.livesdk.model.EnvelopePortalMessage.PortalInfo> r13, X.C11NJ r14) {
        /*
            r12 = this;
            r0 = 202481(0x316f1, float:2.83736E-40)
            boolean r5 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            long r7 = android.os.SystemClock.elapsedRealtime()
            com.bytedance.android.livesdk.livesetting.roomfunction.LiveShortTouchApiMergeSetting r0 = com.bytedance.android.livesdk.livesetting.roomfunction.LiveShortTouchApiMergeSetting.INSTANCE
            boolean r0 = r0.enable()
            r10 = r13
            r9 = r12
            if (r0 == 0) goto L45
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r9.LLIZ
            if (r1 == 0) goto L45
            boolean r0 = r9.LLJ
            if (r0 != 0) goto L45
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.PortalListResponseData> r0 = com.bytedance.android.livesdk.dataChannel.PortalListResponseData.class
            java.lang.Object r2 = r1.gg0(r0)
            kotlin.Pair r2 = (kotlin.Pair) r2
            if (r2 == 0) goto L45
            java.lang.Object r0 = r2.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != r0) goto L45
            java.lang.Object r0 = r2.getSecond()
            webcast.api.envelope.PortalListResponse$ResponseData r0 = (webcast.api.envelope.PortalListResponse.ResponseData) r0
            if (r0 == 0) goto L3f
            LJJJJ(r10, r9, r0)
        L3f:
            if (r5 == 0) goto L44
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L44:
            return
        L45:
            com.bytedance.android.live.network.combine.exp.LiveCombineRequestExp r0 = com.bytedance.android.live.network.combine.exp.LiveCombineRequestExp.INSTANCE
            java.lang.String r3 = "/webcast/portal/list/"
            boolean r0 = r0.enableForRequest(r3)
            if (r0 == 0) goto L80
            X.0JeY<X.0Jd7> r2 = X.C497120JeY.LJIIZILJ
            kotlin.jvm.internal.AwS551S0100000_7 r1 = new kotlin.jvm.internal.AwS551S0100000_7
            r0 = 794(0x31a, float:1.113E-42)
            r1.<init>(r9, r0)
            X.11JN r0 = r2.LIZIZ(r3, r1)
            X.11Ha r1 = new X.11Ha
            r1.<init>(r0)
        L61:
            X.0UO0 r0 = new X.0UO0
            r0.<init>()
            X.11Kz r1 = r1.LJFF(r0)
            Y.AfS2S0200100_7 r6 = new Y.AfS2S0200100_7
            r11 = 14
            r6.<init>(r7, r9, r10, r11)
            X.090U<T> r0 = new X.C09JN() { // from class: X.090U
                static {
                    /*
                        X.090U r0 = new X.090U
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.090U<T>) X.090U.LL X.090U
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C090U.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C090U.<init>():void");
                }

                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(java.lang.Object r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "PortalLeaf@b89.getPortalList$3"
                        X.C1C7U.LIZ(r0)
                        X.C1C7U.LIZIZ(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C090U.accept(java.lang.Object):void");
                }
            }
            X.01kM r0 = r1.LJJIIZ(r6, r0)
            r14.LIZ(r0)
        L7a:
            if (r5 == 0) goto L7f
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L7f:
            return
        L80:
            X.0Ism r1 = X.C480460Ism.LIZ()
            java.lang.Class<com.bytedance.android.livesdk.impl.revenue.portal.request.PortalApi> r0 = com.bytedance.android.livesdk.impl.revenue.portal.request.PortalApi.class
            r1.getClass()
            java.lang.Object r4 = X.C480460Ism.LIZLLL(r0)
            com.bytedance.android.livesdk.impl.revenue.portal.request.PortalApi r4 = (com.bytedance.android.livesdk.impl.revenue.portal.request.PortalApi) r4
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r9.LLIZ
            long r2 = X.C500260Jjc.LJJLIIIJ(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r9.LLIZ
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C500260Jjc.LJJLIIIIJ(r0)
            if (r0 == 0) goto La8
            long r0 = r0.getOwnerUserId()
        La1:
            X.11Kz r1 = r4.getPortalList(r2, r0)
            if (r1 == 0) goto L7a
            goto L61
        La8:
            r0 = 0
            goto La1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1100380ek0.LJJJIL(java.util.List, X.11NJ):void");
    }

    public static final void LJJJJ(List<EnvelopePortalMessage.PortalInfo> list, C1100380ek0 c1100380ek0, PortalListResponse.ResponseData responseData) {
        ImageModel cover;
        Room room;
        List<PortalListResponse.PortalInfo> list2;
        if (responseData != null && (list2 = responseData.portal) != null) {
            for (PortalListResponse.PortalInfo portalInfo : list2) {
                if (Intrinsics.LJFF(String.valueOf(UserService.getInstance().user().getCurrentUserId()), portalInfo.senderId)) {
                    EnvelopePortalMessage.PortalInfo portalInfo2 = new EnvelopePortalMessage.PortalInfo();
                    portalInfo2.id = portalInfo.id;
                    portalInfo2.senderId = portalInfo.senderId;
                    portalInfo2.portalDiamonds = portalInfo.portalDiamonds;
                    portalInfo2.transCount = portalInfo.transCount;
                    portalInfo2.ddlSecond = portalInfo.ddlSecond;
                    portalInfo2.envelopeDiamonds = portalInfo.envelopeDiamonds;
                    portalInfo2.sendAtSecond = portalInfo.sendAtSecond;
                    portalInfo2.senderAvatar = portalInfo.senderAvatar;
                    portalInfo2.senderDisplayId = portalInfo.senderDisplayId;
                    portalInfo2.touchCount = portalInfo.touchCount;
                    portalInfo2.senderEnigmaInfo = portalInfo.senderEnigmaInfo;
                    list.add(portalInfo2);
                }
            }
        }
        if (!list.isEmpty()) {
            DataChannel dataChannel = c1100380ek0.LLIZ;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                cover = room.getCover();
            } else {
                cover = null;
            }
            EnvelopPortal4FEModelSender envelopPortal4FEModelSender = new EnvelopPortal4FEModelSender();
            envelopPortal4FEModelSender.portalInfos.addAll(list);
            envelopPortal4FEModelSender.dataFrom = "api";
            LJJJJIZL(c1100380ek0, envelopPortal4FEModelSender, cover, 2, 1, null, 48);
        }
    }

    public C1100380ek0(Context context, DataChannel dataChannel, LifecycleOwner lifecycleOwner, boolean z) {
        super(context, EnumC995440c0k.PORTAL_LEAF.getZIndex());
        this.LLIZ = dataChannel;
        this.LLIZLLLIL = lifecycleOwner;
        this.LLJ = z;
        this.LLJI = new LinkedHashSet();
        this.LLJIJIL = true;
        this.LLJILJIL = "portal_door";
        this.LLJILJILJ = new ArrayList<>();
        this.LLJILLL = C1697810uHb.LJIILJJIL(20L);
        this.LLJJ = new ReentrantLock();
        this.LLJJIJI = new C1151790g4v(this, 7);
        this.LLJJIJIIJIL = new C1151720g4o(this, 25);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
    
        r3 = "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fshort_touch_people%2Ftemplate.js";
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b3, code lost:
    
        r2 = "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fshort_touch_portal%2Ftemplate.js";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0357  */
    /* JADX WARN: Type inference failed for: r2v38, types: [T, android.animation.Animator, android.animation.ValueAnimator] */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, X.0jpS, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJJIZL(final X.C1100380ek0 r32, final X.InterfaceC2365009Om r33, com.bytedance.android.live.base.model.ImageModel r34, int r35, int r36, com.bytedance.android.livesdk.model.EnvelopePortalMessage r37, int r38) {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1100380ek0.LJJJJIZL(X.0ek0, X.09Om, com.bytedance.android.live.base.model.ImageModel, int, int, com.bytedance.android.livesdk.model.EnvelopePortalMessage, int):void");
    }
}
