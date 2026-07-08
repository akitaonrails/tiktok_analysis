package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.model.SecondaryEffectInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139420fky implements C0UIY, InterfaceC1133090fal {
    public DataChannel LL;
    public boolean LLILLJJLI;
    public final C1139540flA LLILLL = new C1139540flA();

    @Override // X.InterfaceC1133090fal
    public final void LIZIZ(Object obj, InterfaceC1139780flY interfaceC1139780flY, C1136560fgM c1136560fgM) {
    }

    @Override // X.InterfaceC1133090fal
    public final void LJIIZILJ() {
        this.LLILLJJLI = true;
        C1139540flA c1139540flA = this.LLILLL;
        c1139540flA.getClass();
        c1139540flA.LJI("stopAnimation", null);
        c1139540flA.LLILLL = true;
        InterfaceC1138060fim interfaceC1138060fim = c1139540flA.LLILZLL;
        if (interfaceC1138060fim != null) {
            interfaceC1138060fim.stop();
        }
        c1139540flA.LJIIJ(200);
    }

    @Override // X.C0UIY
    public final void destroy() {
        this.LLILLJJLI = true;
        C1132970faZ.LIZIZ(EnumC1133020fae.INTERACTIVE_GAME_GIFT);
        C1139540flA c1139540flA = this.LLILLL;
        c1139540flA.LLILLL = true;
        c1139540flA.LJIIJ(200);
        ((LinkedList) c1139540flA.LLJ).clear();
        C1139550flB c1139550flB = c1139540flA.LLJILJIL;
        c1139550flB.LIZ = null;
        ((ArrayList) c1139550flB.LJIIJ).clear();
        DataChannel dataChannel = c1139540flA.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(c1139540flA);
        }
    }

    @Override // X.C0UHE
    public final void onMessageReceived(int i, int i2, int i3, String str) {
    }

    @Override // X.InterfaceC1133090fal
    public final void release() {
    }

    @Override // X.InterfaceC1133090fal
    public final C1136560fgM LIZLLL() {
        return this.LLILLL.LLILZIL;
    }

    @Override // X.C0UIY
    public final void start() {
        Object c098200Yq;
        try {
            C1132970faZ.LIZJ(EnumC1133020fae.INTERACTIVE_GAME_GIFT, this);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("GameGiftMessageHandler", "setGiftAnimEngine error for Game Gift", thM5exceptionOrNullimpl);
        }
    }

    public C1139420fky(DataChannel dataChannel) {
        this.LL = dataChannel;
        setDataChannel(this.LL);
    }

    @Override // X.InterfaceC1133090fal
    public final void LIZ(Function1<? super C1136560fgM, Boolean> function1) {
        Iterator<C1136560fgM> it2 = this.LLILLL.LLJ.iterator();
        while (it2.hasNext() && !function1.invoke(it2.next()).booleanValue()) {
        }
    }

    @Override // X.C0UIY
    public final void setDataChannel(DataChannel dataChannel) {
        this.LL = dataChannel;
        C1139540flA c1139540flA = this.LLILLL;
        c1139540flA.LLILLJJLI = dataChannel;
        c1139540flA.LLJILJIL.LIZ = dataChannel;
    }

    @Override // X.InterfaceC1133090fal
    public final void LIZJ(GiftMessage giftMessage, InterfaceC1139780flY interfaceC1139780flY, C1136560fgM c1136560fgM) {
        Gift gift;
        Room room;
        long j;
        long j2;
        long id;
        C1136560fgM c1136560fgMLJFF = c1136560fgM;
        if (this.LLILLJJLI) {
            C20441214yg.LJ("GameGiftMessageHandler", "handleGiftMessage return due to stop");
            return;
        }
        if (giftMessage != null && (gift = giftMessage.mGift) != null && gift.type == 21) {
            if (!this.LLILLL.LLJILJIL.LIZIZ.isInGaming() && !C1128450fTH.LIZLLL.kg2()) {
                if (c1136560fgMLJFF == null && (c1136560fgMLJFF = C1136390fg5.LJFF(giftMessage, interfaceC1139780flY)) == null) {
                    C20441214yg.LJ("GameGiftMessageHandler", "handleGiftMessage error - effectMessage is null");
                    C1136500fgG.LJFF(giftMessage);
                    return;
                } else {
                    if (this.LLILLJJLI) {
                        C20441214yg.LJ("GameGiftMessageHandler", "handleGiftMessage ignore msg due to stop");
                        return;
                    }
                    c1136560fgMLJFF.LJJJIL = "effect_gift_game";
                    C1139540flA c1139540flA = this.LLILLL;
                    if (!c1139540flA.LLILLL) {
                        c1136560fgMLJFF.LIZJ().LJIIIIZZ();
                        C1136580fgO.LIZ(c1139540flA.LLJ, c1136560fgMLJFF);
                        c1139540flA.LJIIZILJ();
                        return;
                    }
                    return;
                }
            }
            C1139540flA c1139540flA2 = this.LLILLL;
            DataChannel dataChannel = c1139540flA2.LLILLJJLI;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && room.getId() != 0) {
                SecondaryEffectInfo secondaryEffectInfo = giftMessage.secondaryEffectInfo;
                if (secondaryEffectInfo != null) {
                    j = secondaryEffectInfo.minuteGameGameplayId;
                } else {
                    j = 0;
                }
                CommonMessageData commonMessageData = giftMessage.baseMessage;
                if (commonMessageData != null) {
                    j2 = commonMessageData.messageId;
                } else {
                    j2 = 0;
                }
                User user = giftMessage.fromUser;
                if (user != null) {
                    id = user.getId();
                } else {
                    id = 0;
                }
                c1139540flA2.LJIJ(j, j2, id, giftMessage.giftId, "rejectGameBeforeEnqueue");
                return;
            }
            C20441214yg.LJ("gift_game__ttlive_gift_render", "respond_invite skipped: roomId == 0, response=reject");
            return;
        }
        C20441214yg.LJ("GameGiftMessageHandler", "handleGiftMessage return due to non-game-gift message");
    }
}
