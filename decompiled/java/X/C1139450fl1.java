package X;

import Y.ARunnableS25S0400000_17;
import com.bytedance.android.live.liveinteract.multiguestv3.RtcSeiReceivedChannel;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS383S0200000_17;

/* JADX INFO: renamed from: X.0fl1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139450fl1 implements InterfaceC1135390feT {
    public boolean LL;
    public final C1139460fl2 LLILLJJLI = new C1139460fl2();

    @Override // X.InterfaceC1133090fal
    public final void LIZJ(GiftMessage giftMessage, InterfaceC1139780flY interfaceC1139780flY, C1136560fgM c1136560fgM) {
    }

    @Override // X.InterfaceC1133090fal
    public final void LJIIZILJ() {
        this.LL = true;
        C1139460fl2 c1139460fl2 = this.LLILLJJLI;
        c1139460fl2.getClass();
        c1139460fl2.LJI("stopAnimation", null);
        c1139460fl2.LLILLL = true;
        InterfaceC1138060fim interfaceC1138060fim = c1139460fl2.LLILZLL;
        if (interfaceC1138060fim != null) {
            interfaceC1138060fim.stop();
        }
        c1139460fl2.LJIIJ(200);
    }

    @Override // X.C0UIY
    public final void destroy() {
        this.LL = true;
        C1132970faZ.LIZIZ(EnumC1133020fae.STICKER_GIFT);
        C1136380fg4.LIZ.getClass();
        C1136380fg4.LIZ();
        C1139460fl2 c1139460fl2 = this.LLILLJJLI;
        c1139460fl2.LLILLL = true;
        c1139460fl2.LJIIJ(200);
        c1139460fl2.LLJ.LIZ();
        DataChannel dataChannel = c1139460fl2.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(c1139460fl2);
        }
        c1139460fl2.LLJI = null;
        C1136460fgC.LJI.clear();
    }

    @Override // X.C0UHE
    public final void onMessageReceived(int i, int i2, int i3, String str) {
    }

    @Override // X.InterfaceC1133090fal
    public final void release() {
    }

    @Override // X.InterfaceC1133090fal
    public final C1136560fgM LIZLLL() {
        return this.LLILLJJLI.LLILZIL;
    }

    @Override // X.C0UIY
    public final void start() {
        Object c098200Yq;
        try {
            C1132970faZ.LIZJ(EnumC1133020fae.STICKER_GIFT, this);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1133910fc5.LIZJ("GiftStickerMessageQueueManager", "setGiftAnimEngine error", thM5exceptionOrNullimpl);
        }
    }

    @Override // X.InterfaceC1135390feT
    public final C1139460fl2 LJII() {
        return this.LLILLJJLI;
    }

    public C1139450fl1(DataChannel dataChannel) {
        setDataChannel(dataChannel);
    }

    @Override // X.InterfaceC1133090fal
    public final void LIZ(Function1<? super C1136560fgM, Boolean> function1) {
        if (!LIZJ()) {
            LIZLLL(new AwS383S0200000_17(new C1140170fmB(0), (C1140170fmB) function1, (Function1<? super C1136560fgM, Boolean>) 66));
        }
    }

    @Override // X.C0UIY
    public final void setDataChannel(DataChannel dataChannel) {
        C1139460fl2 c1139460fl2 = this.LLILLJJLI;
        c1139460fl2.LLILLJJLI = dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(RtcSeiReceivedChannel.class, c1139460fl2, c1139460fl2.LLJIJIL);
        }
    }

    @Override // X.InterfaceC1133090fal
    public final void LIZIZ(Object obj, InterfaceC1139780flY interfaceC1139780flY, C1136560fgM c1136560fgM) {
        Long lValueOf;
        if (this.LL) {
            C1133910fc5.LIZJ("GiftStickerMessageQueueManager", "handleGiftMessage return due to stop", null);
            return;
        }
        if (!(obj instanceof InterfaceC1136020ffU)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleGiftMessage return due to stop, isNewMessage = ");
            sbLIZ.append(true);
            C1133910fc5.LIZJ("GiftStickerMessageQueueManager", C2188811AlT.LIZIZ(sbLIZ), null);
            return;
        }
        InterfaceC1136020ffU interfaceC1136020ffU = (InterfaceC1136020ffU) obj;
        if (interfaceC1136020ffU.LJIIIIZZ() != null && 4 == C1135870ffF.LJII(interfaceC1136020ffU)) {
            ARunnableS25S0400000_17 aRunnableS25S0400000_17 = new ARunnableS25S0400000_17(interfaceC1139780flY, obj, c1136560fgM, this, 3);
            C1136380fg4.LIZ.getClass();
            GiftMessage.InteractiveGiftInfo interactiveGiftInfoLJJIII = interfaceC1136020ffU.LJJIII();
            if (interactiveGiftInfoLJJIII != null && (lValueOf = Long.valueOf(interactiveGiftInfoLJJIII.crossScreenRole)) != null && lValueOf.longValue() == 2) {
                C1136380fg4.LIZJ(interfaceC1136020ffU.LJJIII(), interfaceC1136020ffU.LJIILJJIL(), aRunnableS25S0400000_17);
                return;
            } else {
                aRunnableS25S0400000_17.run();
                return;
            }
        }
        C1133910fc5.LIZJ("GiftStickerMessageQueueManager", "handleGiftMessage return due to wrong gift type", null);
    }
}
