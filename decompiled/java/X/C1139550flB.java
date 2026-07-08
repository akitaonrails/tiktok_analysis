package X;

import Y.ARunnableS117S0100000_17;
import Y.AfS186S0100000_17;
import android.content.Context;
import android.os.Looper;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.model.MinuteGameFinishParams;
import com.bytedance.android.livesdk.gift.model.MinuteGameFinishResponse;
import com.bytedance.android.livesdk.gift.model.MinuteGameRespondInviteParams;
import com.bytedance.android.livesdk.sticker.game.GameGiftStateChannel;
import com.bytedance.android.livesdk.sticker.game.IMinuteGameApi;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0flB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139550flB {
    public DataChannel LIZ;
    public C1136560fgM LIZJ;
    public long LJ;
    public C1151720g4o LJII;
    public EnumC1139760flW LIZIZ = EnumC1139760flW.IDLE;
    public final int LIZLLL = 2;
    public final Map<Long, C1139370fkt> LJFF = new LinkedHashMap();
    public final Set<Long> LJI = new LinkedHashSet();
    public final BPEAHandler LJIIIIZZ = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS117S0100000_17 LJIIIZ = new ARunnableS117S0100000_17(this, 294);
    public final List<InterfaceC1140600fms> LJIIJ = new ArrayList();

    public final boolean LIZIZ() {
        if (this.LIZIZ == EnumC1139760flW.WAITING) {
            LJII(EnumC1139760flW.RECOGNIZING, "first-frame received", this.LIZJ);
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("first-frame ignored, state=");
        sbLIZ.append(this.LIZIZ);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public final void LJI() {
        IMessageManager iMessageManager;
        C1151720g4o c1151720g4o = this.LJII;
        if (c1151720g4o == null) {
            return;
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(c1151720g4o);
        }
        this.LJII = null;
        LIZJ("stopObservingPowerUpGifts: unregistered IM gift listener");
    }

    public static void LIZJ(String str) {
        C20441214yg.LJIIIZ("GameGiftStateManager__ttlive_gift_render", str);
    }

    public static String LIZLLL(List list) {
        Object obj = null;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                String str = (String) next;
                if (str.length() > 0 && !a0.LJJIIZI(str, ".webp", false)) {
                    obj = next;
                    break;
                }
            }
            String str2 = (String) obj;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public final void LJ(int i) {
        long id;
        long jLongValue;
        Object c098200Yq;
        Long lValueOf;
        Room room;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        if (id == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("finish skipped: roomId == 0, finishReason=");
            sbLIZ.append(i);
            C20441214yg.LJ("GameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        Long lValueOf2 = Long.valueOf(this.LJ);
        if (lValueOf2.longValue() == 0 && 0 == 0) {
            C1136560fgM c1136560fgM = this.LIZJ;
            if (c1136560fgM != null && (lValueOf = Long.valueOf(c1136560fgM.LJJJJ)) != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = 0;
            }
        } else {
            jLongValue = lValueOf2.longValue();
        }
        if (jLongValue == 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("finish skipped: gameplayId == 0 (respond_invite never seeded activeGameplayId AND triggerMessage had no gameplayId), roomId=");
            sbLIZ2.append(id);
            sbLIZ2.append(", finishReason=");
            sbLIZ2.append(i);
            C20441214yg.LJ("GameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        MinuteGameFinishParams minuteGameFinishParams = new MinuteGameFinishParams();
        minuteGameFinishParams.gameplayId = jLongValue;
        minuteGameFinishParams.roomId = id;
        minuteGameFinishParams.finishReason = i;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("finish request: roomId=");
        sbLIZ3.append(id);
        sbLIZ3.append(", gameplayId=");
        sbLIZ3.append(jLongValue);
        sbLIZ3.append(", finishReason=");
        sbLIZ3.append(i);
        C20441214yg.LJIIIZ("GameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ3));
        try {
            C480460Ism.LIZ().getClass();
            c098200Yq = ((IMinuteGameApi) C480460Ism.LIZLLL(IMinuteGameApi.class)).finish(minuteGameFinishParams).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0fld
                @Override // X.C09JN
                public final void accept(Object obj) {
                    long j;
                    MinuteGameFinishResponse.Data data;
                    C1C7U.LIZ("GameGiftStateManager@fdb9.sendFinish$1$1");
                    MinuteGameFinishResponse minuteGameFinishResponse = (MinuteGameFinishResponse) obj;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("finish success: gameplayId=");
                    if (minuteGameFinishResponse != null && (data = minuteGameFinishResponse.data) != null) {
                        j = data.gameplayId;
                    } else {
                        j = 0;
                    }
                    sbLIZ4.append(j);
                    C20441214yg.LJIIIZ("GameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ4));
                    C1C7U.LIZIZ("GameGiftStateManager@fdb9.sendFinish$1$1");
                }
            }, new C09JN() { // from class: X.0Dgi
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GameGiftStateManager@fdb9.sendFinish$1$2");
                    Throwable th = (Throwable) obj;
                    List listLJJII = C09RB.LJJII(new C08LY(C09R4.LJ(AFwS232S0000000_4.get$arr$(268), th.getCause()), AnonymousClass0207.get$arr$(166)));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("finish failed: ");
                    sbLIZ4.append(th.getClass().getSimpleName());
                    sbLIZ4.append(" message=");
                    sbLIZ4.append(th.getMessage());
                    sbLIZ4.append(", causes=");
                    sbLIZ4.append(listLJJII);
                    C20441214yg.LJFF("GameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ4), th);
                    C1C7U.LIZIZ("GameGiftStateManager@fdb9.sendFinish$1$2");
                }
            });
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("GameGiftStateManager__ttlive_gift_render", "finish dispatch threw", thM5exceptionOrNullimpl);
        }
    }

    public final void LJFF(int i, int i2) {
        Room room;
        String str;
        Long lValueOf;
        Object c098200Yq;
        C1136560fgM c1136560fgM = this.LIZJ;
        if (c1136560fgM == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("respond_invite skipped: triggerMessage is null, response=");
            sbLIZ.append(i);
            C20441214yg.LJ("GameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        DataChannel dataChannel = this.LIZ;
        long id = 0;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            long id2 = room.getId();
            if (id2 != 0) {
                if (i == 1) {
                    str = "accept";
                } else {
                    str = "decline";
                }
                C145900h7.LIZ(i2, id2, c1136560fgM.LJIIL, str);
                MinuteGameRespondInviteParams minuteGameRespondInviteParams = new MinuteGameRespondInviteParams();
                minuteGameRespondInviteParams.roomId = id2;
                minuteGameRespondInviteParams.gameplayId = c1136560fgM.LJJJJ;
                minuteGameRespondInviteParams.response = i;
                minuteGameRespondInviteParams.rejectReason = i2;
                MinuteGameRespondInviteParams.GiftRecord giftRecord = new MinuteGameRespondInviteParams.GiftRecord();
                giftRecord.msgId = c1136560fgM.LJ;
                User user = c1136560fgM.LJIIJJI;
                if (user != null) {
                    id = user.getId();
                }
                giftRecord.senderId = id;
                giftRecord.giftId = c1136560fgM.LJIIL;
                minuteGameRespondInviteParams.triggerGiftRecord = giftRecord;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("respond_invite request: response=");
                sbLIZ2.append(i);
                sbLIZ2.append(", roomId=");
                sbLIZ2.append(id2);
                sbLIZ2.append(", gameplayId=");
                sbLIZ2.append(c1136560fgM.LJJJJ);
                sbLIZ2.append(", msgId=");
                sbLIZ2.append(c1136560fgM.LJ);
                sbLIZ2.append(", senderId=");
                User user2 = c1136560fgM.LJIIJJI;
                if (user2 != null) {
                    lValueOf = Long.valueOf(user2.getId());
                } else {
                    lValueOf = null;
                }
                sbLIZ2.append(lValueOf);
                sbLIZ2.append(", giftId=");
                sbLIZ2.append(c1136560fgM.LJIIL);
                sbLIZ2.append(", rejectReason=");
                sbLIZ2.append(i2);
                C20441214yg.LJIIIZ("GameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ2));
                try {
                    C480460Ism.LIZ().getClass();
                    c098200Yq = ((IMinuteGameApi) C480460Ism.LIZLLL(IMinuteGameApi.class)).respondInvite(minuteGameRespondInviteParams).LJIILIIL(new C0UO0()).LJJLL(new AfS186S0100000_17(this, 190), new C09JN() { // from class: X.0Dgj
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("GameGiftStateManager@fdb9.sendRespondInvite$1$2");
                            Throwable th = (Throwable) obj;
                            List listLJJII = C09RB.LJJII(new C08LY(C09R4.LJ(AFwS232S0000000_4.get$arr$(269), th.getCause()), AnonymousClass0207.get$arr$(167)));
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("respond_invite failed: ");
                            sbLIZ3.append(th.getClass().getSimpleName());
                            sbLIZ3.append(" message=");
                            sbLIZ3.append(th.getMessage());
                            sbLIZ3.append(", causes=");
                            sbLIZ3.append(listLJJII);
                            C20441214yg.LJFF("GameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ3), th);
                            C1C7U.LIZIZ("GameGiftStateManager@fdb9.sendRespondInvite$1$2");
                        }
                    });
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C20441214yg.LJFF("GameGiftStateManager__ttlive_gift_render", "respond_invite dispatch threw", thM5exceptionOrNullimpl);
                    return;
                }
                return;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("respond_invite skipped: roomId == 0, response=");
        sbLIZ3.append(i);
        C20441214yg.LJ("GameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LJII(EnumC1139760flW enumC1139760flW, String str, C1136560fgM c1136560fgM) {
        EnumC1139760flW enumC1139760flW2 = this.LIZIZ;
        if (enumC1139760flW2 == enumC1139760flW) {
            return;
        }
        this.LIZIZ = enumC1139760flW;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("state transition: ");
        sbLIZ.append(enumC1139760flW2);
        sbLIZ.append(" -> ");
        sbLIZ.append(enumC1139760flW);
        sbLIZ.append(" (");
        sbLIZ.append(str);
        sbLIZ.append(')');
        C20441214yg.LJIIIZ("GameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zW(GameGiftStateChannel.class, enumC1139760flW);
        }
        Iterator it2 = C13LP.LLIIII(this.LJIIJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1140600fms) it2.next()).LIZ(enumC1139760flW2, enumC1139760flW, c1136560fgM);
        }
    }

    public final void LIZ(final long j, LiveEffect liveEffect, final String str, final String str2) {
        boolean z;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("avatar download skipped: empty URL, uid=");
            sbLIZ.append(j);
            sbLIZ.append(", displayName=");
            sbLIZ.append(str);
            C20441214yg.LJIIL("GameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        Context contextLJII = C497740JfY.LJII();
        if (contextLJII == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("avatar download skipped: ResUtil.getContext() == null, uid=");
            sbLIZ2.append(j);
            C20441214yg.LJ("GameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (!this.LJI.add(Long.valueOf(j))) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("avatar download deduped: uid=");
            sbLIZ3.append(j);
            sbLIZ3.append(" already notified, displayName=");
            sbLIZ3.append(str);
            C20441214yg.LJIIIZ("GameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        final C1139620flI c1139620flI = new C1139620flI(j, liveEffect, str2, str);
        if (C1324570kZb.LJI(UriProtector.parse(str2))) {
            c1139620flI.invoke(C1324570kZb.LJFF(str2));
            return;
        }
        C1325710kbR c1325710kbRLIZIZ = C1325710kbR.LIZIZ(str2);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C1322200kVm.LIZ().LJIIZILJ(c1325710kbRLIZIZ, contextLJII).LIZJ(new C0HWE<Void>() { // from class: X.0flU
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                String simpleName;
                Throwable thLIZLLL = interfaceC1320200kSY.LIZLLL();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("avatar download failed: uid=");
                sbLIZ4.append(j);
                sbLIZ4.append(", displayName=");
                sbLIZ4.append(str);
                sbLIZ4.append(", url=");
                sbLIZ4.append(str2);
                sbLIZ4.append(", cause=");
                String message = null;
                if (thLIZLLL != null) {
                    simpleName = thLIZLLL.getClass().getSimpleName();
                } else {
                    simpleName = null;
                }
                sbLIZ4.append(simpleName);
                sbLIZ4.append(": ");
                if (thLIZLLL != null) {
                    message = thLIZLLL.getMessage();
                }
                sbLIZ4.append(message);
                C20441214yg.LJFF("GameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ4), thLIZLLL);
            }

            @Override // X.C0HWE
            public final void LJFF(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                String strLJFF = C1324570kZb.LJFF(str2);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("avatar download success: uid=");
                sbLIZ4.append(j);
                sbLIZ4.append(", displayName=");
                sbLIZ4.append(str);
                sbLIZ4.append(", elapsedMs=");
                sbLIZ4.append(jCurrentTimeMillis2);
                sbLIZ4.append(", url=");
                sbLIZ4.append(str2);
                sbLIZ4.append(", frescoPath=");
                sbLIZ4.append(strLJFF);
                C20441214yg.LJIIIZ("GameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ4));
                c1139620flI.invoke(strLJFF);
            }
        }, C822690WPb.LIZ());
    }
}
