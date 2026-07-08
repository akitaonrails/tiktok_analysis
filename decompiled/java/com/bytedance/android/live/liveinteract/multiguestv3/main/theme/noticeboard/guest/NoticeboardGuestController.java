package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest;

import X.AbstractC19484711Kz;
import X.AbstractC945630aiP;
import X.AnonymousClass0206;
import X.C001A;
import X.C01G7;
import X.C01GW;
import X.C09CT;
import X.C09JN;
import X.C11IW;
import X.C11JF;
import X.C11NJ;
import X.C11PQ;
import X.C11RK;
import X.C19322110iZ;
import X.C20441214yg;
import X.C2188811AlT;
import X.C462301r3;
import X.C462401r4;
import X.C462501r5;
import X.C500260Jjc;
import X.C776250Uch;
import X.C930540aK4;
import X.EnumC953640avK;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2174708fZ;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.NoticeboardGuestController;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS608S0100000_29;
import webcast.data.multi_guest_play.NoticeboardContent;
import webcast.im.NoticeboardMessage;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeboardGuestController extends AbstractC945630aiP {
    public static String LJIIL;
    public static Long LJIILIIL;
    public static final C11PQ<String> LJIILJJIL;
    public final C11NJ LIZIZ;
    public final ConcurrentHashMap<Long, EnumC953640avK> LIZJ;
    public final C462301r3 LIZLLL;
    public final C01GW LJ;
    public Long LJFF;
    public final C11RK<String> LJI;
    public String LJII;
    public C01G7 LJIIIIZZ;
    public long LJIIIZ;
    public volatile C11JF LJIIJ;
    public boolean LJIIJJI;

    public interface ImageXService {
        @InterfaceC1501160pAQ
        AbstractC19484711Kz<ImageMetaData> getImageMetaInfo(@InterfaceC2174708fZ String str);
    }

    static {
        C11PQ<String> c11pq = new C11PQ<>();
        c11pq.onNext("");
        LJIILJJIL = c11pq;
    }

    @Override // X.InterfaceC945610aiN
    public final void LIZ() {
        IMessageManager iMessageManager;
        C20441214yg.LJIIIZ("NoticeboardGuestController", "attach");
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.NOTICEBOARD_MESSAGE.getIntType(), this.LIZLLL);
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(ClickNoticeboardEvent.class, this, new AwS608S0100000_29(this, 18));
        }
        this.LIZIZ.LIZ(new C11IW(this.LJI.LJJIFFI().LJJIII(new C09JN() { // from class: X.0Zwh
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("NoticeboardGuestController@b397.reportNoticeboardGridMetricsIfNeeded$1");
                if (((String) obj).length() > 0) {
                    C946850akN.LIZIZ(EnumC919090a1b.SHOW);
                }
                C1C7U.LIZIZ("NoticeboardGuestController@b397.reportNoticeboardGridMetricsIfNeeded$1");
            }
        })).LJIILL().LJIIZILJ());
    }

    @Override // X.InterfaceC945610aiN
    public final void LJI() {
        IMessageManager iMessageManager;
        C20441214yg.LJIIIZ("NoticeboardGuestController", "detach");
        LJIIL = null;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(this.LIZLLL);
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
        Long l = this.LJFF;
        if (l != null) {
            C19322110iZ.LIZ(l.longValue());
        }
        LJIIIZ();
        this.LIZJ.clear();
        this.LIZIZ.LJ();
    }

    public final void LJIIIZ() {
        if (this.LJIIJ != null) {
            C11JF c11jf = this.LJIIJ;
            if (C500260Jjc.LJJIFFI(c11jf != null ? Boolean.valueOf(c11jf.isDisposed()) : null)) {
                C11JF c11jf2 = this.LJIIJ;
                if (c11jf2 != null) {
                    c11jf2.dispose();
                }
                this.LJIIJ = null;
            }
        }
    }

    public final void LJIIJ() {
        Long l = LJIILIIL;
        if (l == null) {
            this.LJI.onNext("");
        } else {
            this.LJI.onNext(String.valueOf(l.longValue()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01r3] */
    public NoticeboardGuestController(DataChannel dataChannel) {
        super(dataChannel);
        this.LIZIZ = new C11NJ();
        this.LIZJ = new ConcurrentHashMap<>();
        this.LIZLLL = new OnMessageListener() { // from class: X.01r3
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                NoticeboardMessage noticeboardMessage;
                String str;
                Long lValueOf;
                String str2;
                Long lValueOf2;
                Integer numValueOf = null;
                if ((iMessage instanceof NoticeboardMessage) && (noticeboardMessage = (NoticeboardMessage) iMessage) != null) {
                    NoticeboardGuestController noticeboardGuestController = this.LL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("NoticeboardMessage received messageId=");
                    sbLIZ.append(noticeboardMessage.getMessageId());
                    C20441214yg.LJIIIZ("NoticeboardGuestController", C2188811AlT.LIZIZ(sbLIZ));
                    if (noticeboardMessage.messageType == 3) {
                        NoticeboardContent noticeboardContent = noticeboardMessage.noticeboardContent;
                        if (noticeboardContent != null) {
                            noticeboardGuestController.LJIIJJI(noticeboardContent, "IM_review");
                        }
                        String str3 = NoticeboardGuestController.LJIIL;
                        NoticeboardContent noticeboardContent2 = noticeboardMessage.noticeboardContent;
                        if (noticeboardContent2 != null) {
                            str = noticeboardContent2.streamId;
                        } else {
                            str = null;
                        }
                        NoticeboardGuestController.LJIIL = str;
                        if (noticeboardContent2 != null) {
                            lValueOf = Long.valueOf(noticeboardContent2.noticeboardId);
                        } else {
                            lValueOf = null;
                        }
                        C462401r4.LIZ(lValueOf);
                        noticeboardGuestController.LJIIJ();
                        NoticeboardContent noticeboardContent3 = noticeboardMessage.noticeboardContent;
                        if (noticeboardContent3 != null) {
                            str2 = noticeboardContent3.passedMediaNodeId;
                        } else {
                            str2 = null;
                        }
                        noticeboardGuestController.LJII = str2;
                        noticeboardGuestController.LJIIIIZZ = null;
                        if (noticeboardContent3 != null) {
                            lValueOf2 = Long.valueOf(noticeboardContent3.noticeboardId);
                        } else {
                            lValueOf2 = null;
                        }
                        NoticeboardContent noticeboardContent4 = noticeboardMessage.noticeboardContent;
                        if (noticeboardContent4 != null) {
                            numValueOf = Integer.valueOf(noticeboardContent4.status);
                        }
                        if (lValueOf2 != null && numValueOf != null) {
                            NoticeboardGuestController.LJIILIIL(noticeboardGuestController, lValueOf2.longValue(), numValueOf.intValue());
                        }
                    }
                }
            }
        };
        this.LJ = C930540aK4.LJJIJIL(AnonymousClass0206.get$arr$(57));
        this.LJI = new C11RK<>();
        this.LJIIIZ = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(com.bytedance.android.livesdk.sei.SeiAppData r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L3
            return
        L3:
            java.util.List<com.bytedance.android.livesdk.sei.SeiRegion> r0 = r10.grids
            r8 = 0
            r5 = 0
            if (r0 == 0) goto L2f
            java.util.Iterator r7 = r0.iterator()
            r3 = 0
            r4 = r5
            r2 = r5
        L10:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r7.next()
            com.bytedance.android.livesdk.sei.SeiRegion r0 = (com.bytedance.android.livesdk.sei.SeiRegion) r0
            com.bytedance.android.livesdk.sei.SeiExtraInfo r0 = r0.extraInfo
            if (r0 == 0) goto L10
            com.bytedance.android.livesdk.sei.SeiNoticeboardInfo r6 = r0.noticeboardInfo
            if (r6 == 0) goto L10
            long r0 = r6.noticeboardId
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            java.lang.String r2 = r6.nodeId
            int r3 = r6.status
            goto L10
        L2f:
            r3 = 0
            r4 = r5
            r2 = r5
        L32:
            java.lang.Long r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.NoticeboardGuestController.LJIILIIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L77
            java.lang.String r0 = r9.LJII
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L77
            X.01GW r0 = r9.LJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8a
            if (r4 == 0) goto L69
            r4.longValue()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, X.0avK> r0 = r9.LIZJ
            java.lang.Object r0 = r0.get(r4)
            X.0avK r0 = (X.EnumC953640avK) r0
            if (r0 == 0) goto L69
            int r0 = r0.getValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 != 0) goto L6d
        L69:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
        L6d:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L77
            int r0 = r1.intValue()
            if (r3 == r0) goto L8a
        L77:
            X.C462401r4.LIZ(r4)
            r9.LJIIJ()
            r9.LJII = r2
            r9.LJIIIIZZ = r5
            if (r4 == 0) goto L8a
            long r0 = r4.longValue()
            LJIILIIL(r9, r0, r3)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.NoticeboardGuestController.LJIIL(com.bytedance.android.livesdk.sei.SeiAppData):void");
    }

    public static final class ImageMetaData {

        @C09CT("height")
        public final long height;

        @C09CT("width")
        public final long width;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ImageMetaData(width=");
            sbLIZ.append(this.width);
            sbLIZ.append(", height=");
            sbLIZ.append(this.height);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ImageMetaData(long j, long j2) {
            this.width = j;
            this.height = j2;
        }
    }

    public final void LJIIJJI(NoticeboardContent noticeboardContent, String str) {
        long j = noticeboardContent.version;
        if (j > 0 && j <= this.LJIIIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NoticeboardMessage received version check not pass, source=");
            sbLIZ.append(str);
            C20441214yg.LJIIIZ("NoticeboardGuestController", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LJIIIZ = j;
        LJIIL = noticeboardContent.streamId;
        C462401r4.LIZ(Long.valueOf(noticeboardContent.noticeboardId));
        LJIIJ();
        this.LJII = noticeboardContent.passedMediaNodeId;
        this.LJIIIIZZ = null;
        LJIILIIL(this, noticeboardContent.noticeboardId, noticeboardContent.status);
    }

    public static void LJIILIIL(NoticeboardGuestController noticeboardGuestController, long j, int i) {
        if (((Boolean) noticeboardGuestController.LJ.getValue()).booleanValue()) {
            EnumC953640avK enumC953640avK = noticeboardGuestController.LIZJ.get(Long.valueOf(j));
            if (enumC953640avK == null) {
                enumC953640avK = EnumC953640avK.UNKNOWN;
            }
            enumC953640avK.trans(i, noticeboardGuestController.LIZ, new C462501r5(noticeboardGuestController, j), null);
        }
    }
}
