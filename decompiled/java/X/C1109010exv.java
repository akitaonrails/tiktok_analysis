package X;

import Y.ARunnableS1S0100200_17;
import Y.AfS186S0100000_17;
import android.os.Looper;
import android.util.LongSparseArray;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.pin.api.PinApi;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.NewPinMessage;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdkapi.depend.model.live.PinInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0exv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109010exv {
    public static final C1109010exv LIZ = new C1109010exv();
    public static final LongSparseArray<DataChannel> LIZIZ = new LongSparseArray<>();
    public static final LongSparseArray<Integer> LIZJ = new LongSparseArray<>();
    public static final LongSparseArray<C1109020exw> LIZLLL = new LongSparseArray<>();
    public static final LongSparseArray<PinMessage> LJ = new LongSparseArray<>();
    public static final LongSparseArray<C1109020exw> LJFF = new LongSparseArray<>();
    public static final LongSparseArray<List<InterfaceC1109100ey4>> LJI = new LongSparseArray<>();
    public static final LongSparseArray<List<InterfaceC420801kM>> LJII = new LongSparseArray<>();
    public static final LongSparseArray<OnMessageListener> LJIIIIZZ = new LongSparseArray<>();
    public static final BPEAHandler LJIIIZ = new BPEAHandler(Looper.getMainLooper());
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(336));
    public static final C01GW LJIIJJI = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(16));
    public static final boolean LJIIL = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();

    public static PinMessage LIZ(NewPinMessage newPinMessage) {
        PinMessage pinMessage = new PinMessage();
        String str = newPinMessage.method;
        pinMessage.method = str;
        pinMessage.pinTime = newPinMessage.pinTime;
        pinMessage.operator = newPinMessage.operator;
        pinMessage.action = newPinMessage.action;
        pinMessage.displayDuration = newPinMessage.displayDuration;
        pinMessage.pinId = newPinMessage.pinMsgId;
        pinMessage.baseMessage = newPinMessage.baseMessage;
        C001A c001a = C001A.ROOM;
        if (Intrinsics.LJFF(str, c001a.wsMethod)) {
            RoomMessage roomMessage = new RoomMessage();
            roomMessage.type = c001a;
            roomMessage.baseMessage = newPinMessage.baseMessage;
            roomMessage.content = newPinMessage.content;
            pinMessage.LL = roomMessage;
        }
        return pinMessage;
    }

    public static C1109020exw LIZJ(long j) {
        return LIZLLL.get(j);
    }

    public static boolean LIZLLL(Room room) {
        PinInfo pinInfo = room.getPinInfo();
        if (pinInfo != null && pinInfo.pinEnabled && !room.isScreenshot && !C781520UlC.LJFF(room)) {
            return true;
        }
        return false;
    }

    public static User LJ(AbstractC1136060ffY abstractC1136060ffY) {
        String str;
        LikeMessage likeMessage;
        GiftMessage giftMessage;
        MemberMessage memberMessage;
        SocialMessage socialMessage;
        ChatMessage chatMessage;
        C001A messageType;
        if (abstractC1136060ffY != null && (messageType = abstractC1136060ffY.getMessageType()) != null) {
            str = messageType.wsMethod;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, C001A.CHAT.wsMethod)) {
            if (!(abstractC1136060ffY instanceof ChatMessage) || (chatMessage = (ChatMessage) abstractC1136060ffY) == null) {
                return null;
            }
            return chatMessage.userInfo;
        }
        if (Intrinsics.LJFF(str, C001A.SOCIAL.wsMethod)) {
            if (!(abstractC1136060ffY instanceof SocialMessage) || (socialMessage = (SocialMessage) abstractC1136060ffY) == null) {
                return null;
            }
            return socialMessage.user;
        }
        if (Intrinsics.LJFF(str, C001A.MEMBER.wsMethod)) {
            if (!(abstractC1136060ffY instanceof MemberMessage) || (memberMessage = (MemberMessage) abstractC1136060ffY) == null) {
                return null;
            }
            return memberMessage.user;
        }
        if (Intrinsics.LJFF(str, C001A.GIFT.wsMethod)) {
            if (!(abstractC1136060ffY instanceof GiftMessage) || (giftMessage = (GiftMessage) abstractC1136060ffY) == null) {
                return null;
            }
            return giftMessage.fromUser;
        }
        if (!Intrinsics.LJFF(str, C001A.LIKE.wsMethod) || !(abstractC1136060ffY instanceof LikeMessage) || (likeMessage = (LikeMessage) abstractC1136060ffY) == null) {
            return null;
        }
        return likeMessage.user;
    }

    public static void LJII(C1109020exw c1109020exw) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on pinned + ");
        sbLIZ.append(c1109020exw);
        C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        List<InterfaceC1109100ey4> list = LJI.get(c1109020exw.LIZ);
        if (list != null) {
            Iterator<InterfaceC1109100ey4> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().Rm0(c1109020exw);
            }
        }
    }

    public static void LJIIIZ(C1109020exw c1109020exw) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("count down + ");
        sbLIZ.append(c1109020exw);
        C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        List<InterfaceC1109100ey4> list = LJI.get(c1109020exw.LIZ);
        if (list != null) {
            Iterator<InterfaceC1109100ey4> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().KH1(c1109020exw);
            }
        }
    }

    public static void LJIIJ(C1109020exw c1109020exw) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on unpin + ");
        sbLIZ.append(c1109020exw);
        C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        List<InterfaceC1109100ey4> list = LJI.get(c1109020exw.LIZ);
        if (list != null) {
            Iterator<InterfaceC1109100ey4> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().m21(c1109020exw);
            }
        }
    }

    public static void LJIIJJI(long j) {
        List<InterfaceC1109100ey4> list = LJI.get(j);
        if (list != null) {
            for (InterfaceC1109100ey4 interfaceC1109100ey4 : list) {
                LIZ.getClass();
                C1109020exw c1109020exwLIZJ = LIZJ(j);
                if (c1109020exwLIZJ != null) {
                    boolean z = c1109020exwLIZJ.LJ;
                    boolean zLJIIZILJ = LJIIZILJ(j, c1109020exwLIZJ.LJI);
                    c1109020exwLIZJ.LJ = zLJIIZILJ;
                    if (z != zLJIIZILJ) {
                        interfaceC1109100ey4.OD2(c1109020exwLIZJ);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("permission changed + ");
                        sbLIZ.append(c1109020exwLIZJ);
                        C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
        }
    }

    public static void LJIIL(C1109020exw c1109020exw) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pin failed + ");
        sbLIZ.append(c1109020exw);
        C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        List<InterfaceC1109100ey4> list = LJI.get(c1109020exw.LIZ);
        if (list != null) {
            Iterator<InterfaceC1109100ey4> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().ja2(c1109020exw);
            }
        }
    }

    public static void LJIILIIL(C1109020exw c1109020exw) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("under review + ");
        sbLIZ.append(c1109020exw);
        C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        List<InterfaceC1109100ey4> list = LJI.get(c1109020exw.LIZ);
        if (list != null) {
            Iterator<InterfaceC1109100ey4> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().Yu0(c1109020exw);
            }
        }
    }

    public static boolean LJI(C1109020exw c1109020exw, EnumC1108030ewL enumC1108030ewL) {
        if (Intrinsics.LJFF(LIZJ(c1109020exw.LIZ), c1109020exw)) {
            LJIIIZ.removeCallbacksAndMessages(c1109020exw);
            LJIIIIZZ(c1109020exw, enumC1108030ewL, null);
            LIZLLL.remove(c1109020exw.LIZ);
            LJFF.remove(c1109020exw.LIZ);
            return true;
        }
        return false;
    }

    public static void LJIILJJIL(int i, long j) {
        int iIntValue;
        Boolean boolValueOf;
        int iIntValue2;
        LongSparseArray<Integer> longSparseArray = LIZJ;
        Integer num = longSparseArray.get(j);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        longSparseArray.put(j, Integer.valueOf(iIntValue & (~i)));
        DataChannel dataChannel = LIZIZ.get(j);
        Boolean boolValueOf2 = null;
        if (dataChannel != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel));
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJJI(boolValueOf)) {
            if (dataChannel != null) {
                boolValueOf2 = Boolean.valueOf(C01C5.LIZ(dataChannel));
            }
            if (!C500260Jjc.LJJJI(boolValueOf2)) {
                return;
            }
        }
        String strValueOf = String.valueOf(i);
        Integer num2 = longSparseArray.get(j);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        C472890IgZ.LIZIZ(iIntValue2, j, strValueOf, true);
    }

    public static boolean LJIIZILJ(long j, PinMessage pinMessage) {
        DataChannel dataChannel;
        Long lValueOf;
        if (pinMessage == null || (dataChannel = LIZIZ.get(j)) == null) {
            return false;
        }
        if (!C500260Jjc.LJIIZILJ(dataChannel)) {
            LIZ.getClass();
            if (!((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hw0()) {
                if (dataChannel.gg0(RoomUserChannel.class) == null) {
                    return false;
                }
                User user = (User) dataChannel.gg0(RoomUserChannel.class);
                Long lValueOf2 = null;
                if (user != null) {
                    lValueOf = Long.valueOf(user.getId());
                } else {
                    lValueOf = null;
                }
                User user2 = pinMessage.operator;
                if (user2 != null) {
                    lValueOf2 = Long.valueOf(user2.getId());
                }
                if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void LJIJ(long j, PinMessage pinMessage) {
        C1109020exw c1109020exwLIZJ;
        PinMessage pinMessage2;
        long messageId;
        if (pinMessage != null && (c1109020exwLIZJ = LIZJ(j)) != null && (pinMessage2 = c1109020exwLIZJ.LJI) != null && pinMessage2.pinId == pinMessage.pinId) {
            LIZ.getClass();
            LJIIJ(c1109020exwLIZJ);
            C480460Ism.LIZ().getClass();
            PinApi pinApi = (PinApi) C480460Ism.LIZLLL(PinApi.class);
            AbstractC1136060ffY abstractC1136060ffYLIZ = C004F.LIZ(pinMessage);
            if (abstractC1136060ffYLIZ != null) {
                messageId = abstractC1136060ffYLIZ.getMessageId();
            } else {
                messageId = 0;
            }
            long messageId2 = pinMessage.getMessageId();
            String str = pinMessage.method;
            if (str == null) {
                str = "";
            }
            pinApi.unpin(j, messageId, messageId2, str).LJIILIIL(new C0UO0()).LJJLL(new AfS186S0100000_17(c1109020exwLIZJ, 9), new AfS186S0100000_17(c1109020exwLIZJ, 10));
        }
    }

    public static void LIZIZ(long j, long j2, C1109020exw c1109020exw) {
        if (j2 > 0) {
            c1109020exw.LJII = j2;
            LJIIIZ(c1109020exw);
            C08D5.LIZIZ(LJIIIZ, new ARunnableS1S0100200_17(j, j2, c1109020exw, 1), c1109020exw, j2 % 1000);
        } else {
            c1109020exw.LJII = 0L;
            LJI(c1109020exw, EnumC1108030ewL.TIME_OUT);
        }
    }

    public static void LJFF(C1109010exv c1109010exv, final long j, C1109020exw c1109020exw) {
        AbstractC1136060ffY abstractC1136060ffYLIZ;
        long j2;
        long j3;
        long jLIZJ;
        CommonMessageData commonMessageData;
        PinMessage pinMessage;
        PinMessage pinMessage2;
        c1109010exv.getClass();
        c1109020exw.LIZJ = false;
        c1109020exw.LIZLLL = false;
        PinMessage pinMessage3 = c1109020exw.LJI;
        if (pinMessage3 != null) {
            int i = pinMessage3.action;
            AbstractC1136060ffY abstractC1136060ffY = null;
            if (i == 1) {
                if (pinMessage3.displayDuration > 0 && C963140bAe.LIZIZ() - pinMessage3.pinTime > TimeUnit.SECONDS.toMillis(pinMessage3.displayDuration)) {
                    return;
                }
                C1109030exx c1109030exx = C1109030exx.LIZ;
                if (C1109030exx.LIZ(new InterfaceC1109210eyF(j) { // from class: X.0eyA
                    @Override // X.InterfaceC1109210eyF
                    public final boolean LIZ(InterfaceC1109140ey8 interfaceC1109140ey8) {
                        return interfaceC1109140ey8.LJIILIIL();
                    }
                }) != null || (abstractC1136060ffYLIZ = C004F.LIZ(pinMessage3)) == null) {
                    return;
                }
                C1109010exv c1109010exv2 = LIZ;
                c1109010exv2.getClass();
                C1109020exw c1109020exwLIZJ = LIZJ(j);
                if (c1109020exwLIZJ != null && (pinMessage2 = c1109020exwLIZJ.LJI) != null && pinMessage3.pinId == pinMessage2.pinId) {
                    return;
                }
                long j4 = pinMessage3.pinTime;
                C1109020exw c1109020exwLIZJ2 = LIZJ(j);
                if (c1109020exwLIZJ2 != null && (pinMessage = c1109020exwLIZJ2.LJI) != null) {
                    j2 = pinMessage.pinTime;
                } else {
                    j2 = 0;
                }
                if (j4 <= j2) {
                    return;
                }
                long j5 = pinMessage3.pinTime;
                LongSparseArray<PinMessage> longSparseArray = LJ;
                PinMessage pinMessage4 = longSparseArray.get(j);
                if (pinMessage4 != null) {
                    j3 = pinMessage4.pinTime;
                } else {
                    j3 = 0;
                }
                if (j5 <= j3 && pinMessage3.pinId == longSparseArray.get(j).pinId) {
                    longSparseArray.remove(j);
                    return;
                }
                LongSparseArray<C1109020exw> longSparseArray2 = LJFF;
                if (!Intrinsics.LJFF(c1109020exw, longSparseArray2.get(j))) {
                    EnumC1108030ewL enumC1108030ewL = EnumC1108030ewL.REPLACE;
                    C1109020exw c1109020exw2 = longSparseArray2.get(j);
                    if (c1109020exw2 != null) {
                        c1109010exv2.getClass();
                        LJIIIIZZ(c1109020exw2, enumC1108030ewL, null);
                    }
                    longSparseArray2.remove(j);
                }
                C1109020exw c1109020exwLIZJ3 = LIZJ(j);
                if (c1109020exwLIZJ3 != null) {
                    LJI(c1109020exwLIZJ3, EnumC1108030ewL.REPLACE);
                }
                LIZLLL.put(j, c1109020exw);
                Integer num = LIZJ.get(j);
                if (num != null && num.intValue() == 0) {
                    long j6 = pinMessage3.displayDuration;
                    if (j6 < 0) {
                        jLIZJ = -1;
                    } else {
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        jLIZJ = C419990GdR.LIZJ(timeUnit.toMillis(j6) - (C963140bAe.LIZIZ() - pinMessage3.pinTime), 0L, timeUnit.toMillis(pinMessage3.displayDuration));
                    }
                    c1109020exw.LIZIZ = pinMessage3.operator;
                    c1109020exw.LJ = LJIIZILJ(j, pinMessage3);
                    AbstractC1136060ffY abstractC1136060ffY2 = c1109020exw.LJFF;
                    if (abstractC1136060ffY2 != null && (commonMessageData = abstractC1136060ffY2.baseMessage) != null) {
                        commonMessageData.messageId = abstractC1136060ffYLIZ.getMessageId();
                    }
                    c1109020exw.LJII = jLIZJ;
                    LJII(c1109020exw);
                    if (jLIZJ == -1) {
                        return;
                    }
                    LIZIZ(j, jLIZJ, c1109020exw);
                    return;
                }
                LJIILL(j, 0, EnumC1108030ewL.NULL);
                return;
            }
            if (i != 2) {
                return;
            }
            C1109010exv c1109010exv3 = LIZ;
            long j7 = c1109020exw.LIZ;
            c1109010exv3.getClass();
            if (Intrinsics.LJFF(LIZJ(j7), c1109020exw)) {
                C1109020exw c1109020exwLIZJ4 = LIZJ(c1109020exw.LIZ);
                if (c1109020exwLIZJ4 != null) {
                    abstractC1136060ffY = c1109020exwLIZJ4.LJFF;
                }
                c1109020exw.LJFF = abstractC1136060ffY;
            }
            if (LJI(c1109020exw, EnumC1108030ewL.CANCEL)) {
                return;
            }
            LJ.put(j, pinMessage3);
        }
    }

    public static void LJIIIIZZ(C1109020exw c1109020exw, EnumC1108030ewL enumC1108030ewL, Object obj) {
        c1109020exw.LJIIIIZZ = enumC1108030ewL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on unpinned + ");
        sbLIZ.append(c1109020exw);
        C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        List<InterfaceC1109100ey4> list = LJI.get(c1109020exw.LIZ);
        if (list != null) {
            Iterator<InterfaceC1109100ey4> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().AG(c1109020exw, obj);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILL(long r5, int r7, X.EnumC1108030ewL r8) {
        /*
            android.util.LongSparseArray<java.lang.Integer> r4 = X.C1109010exv.LIZJ
            java.lang.Object r0 = r4.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L5d
            int r0 = r0.intValue()
        Le:
            r0 = r0 | r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.put(r5, r0)
            android.util.LongSparseArray<com.bytedance.ies.sdk.datachannel.DataChannel> r0 = X.C1109010exv.LIZIZ
            java.lang.Object r1 = r0.get(r5)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = (com.bytedance.ies.sdk.datachannel.DataChannel) r1
            r3 = 0
            if (r1 == 0) goto L5b
            boolean r0 = X.C500260Jjc.LJIIZILJ(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L29:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto L3f
            if (r1 == 0) goto L59
            boolean r0 = X.C01C5.LIZ(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L39:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L53
        L3f:
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.Object r0 = r4.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 0
            if (r0 == 0) goto L57
            int r0 = r0.intValue()
        L50:
            X.C472890IgZ.LIZIZ(r0, r5, r2, r1)
        L53:
            LJIJI(r5, r8, r3)
            return
        L57:
            r0 = 0
            goto L50
        L59:
            r0 = r3
            goto L39
        L5b:
            r0 = r3
            goto L29
        L5d:
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1109010exv.LJIILL(long, int, X.0ewL):void");
    }

    public static void LJIILLIIL(long j, long j2, C1109020exw c1109020exw) {
        if (j2 > 0) {
            c1109020exw.LJII = j2;
            LJIIIZ(c1109020exw);
            C08D5.LIZIZ(LJIIIZ, new ARunnableS1S0100200_17(j, j2, c1109020exw, 2), c1109020exw, 1000L);
        } else {
            c1109020exw.LJII = 0L;
            LJI(c1109020exw, EnumC1108030ewL.TIME_OUT);
        }
    }

    public static Pair LJIJI(long j, EnumC1108030ewL enumC1108030ewL, Object obj) {
        LongSparseArray<C1109020exw> longSparseArray = LJFF;
        C1109020exw c1109020exw = longSparseArray.get(j);
        C1109020exw c1109020exw2 = null;
        if (c1109020exw != null) {
            LIZ.getClass();
            LJIIIIZZ(c1109020exw, enumC1108030ewL, obj);
        } else {
            c1109020exw = null;
        }
        longSparseArray.remove(j);
        C1109020exw c1109020exwLIZJ = LIZJ(j);
        if (c1109020exwLIZJ != null) {
            DataChannel dataChannel = LIZIZ.get(j);
            if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
                C1109010exv c1109010exv = LIZ;
                PinMessage pinMessage = c1109020exwLIZJ.LJI;
                c1109010exv.getClass();
                LJIJ(j, pinMessage);
            }
            LIZ.getClass();
            LJI(c1109020exwLIZJ, enumC1108030ewL);
            c1109020exw2 = c1109020exwLIZJ;
        }
        return new Pair(c1109020exw, c1109020exw2);
    }
}
