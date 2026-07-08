package X;

import Y.ARunnableS25S0400000_17;
import com.bytedance.android.live.liveinteract.multiguestv3.RtcSeiReceivedChannel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fl4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139480fl4 implements C0UIY, InterfaceC1133090fal {
    public static final /* synthetic */ int LLILLL = 0;
    public boolean LL;
    public final C1139470fl3 LLILLJJLI = new C1139470fl3();

    @Override // X.InterfaceC1133090fal
    public final void LIZIZ(Object obj, InterfaceC1139780flY interfaceC1139780flY, C1136560fgM c1136560fgM) {
    }

    @Override // X.InterfaceC1133090fal
    public final void LJIIZILJ() {
        this.LL = true;
        C1139470fl3 c1139470fl3 = this.LLILLJJLI;
        c1139470fl3.getClass();
        c1139470fl3.LJI("stopAnimation", null);
        c1139470fl3.LLILLL = true;
        InterfaceC1138060fim interfaceC1138060fim = c1139470fl3.LLILZLL;
        if (interfaceC1138060fim != null) {
            interfaceC1138060fim.stop();
        }
        c1139470fl3.LJIIJ(200);
    }

    @Override // X.C0UIY
    public final void destroy() {
        this.LL = true;
        C1132970faZ.LIZIZ(EnumC1133020fae.STICKER_GIFT);
        C1136380fg4.LIZ.getClass();
        C1136380fg4.LIZ();
        C1139470fl3 c1139470fl3 = this.LLILLJJLI;
        c1139470fl3.LLILLL = true;
        c1139470fl3.LJIIJ(200);
        ((LinkedList) c1139470fl3.LLJ).clear();
        DataChannel dataChannel = c1139470fl3.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(c1139470fl3);
        }
        c1139470fl3.LLJI = null;
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
            C20441214yg.LJFF("gift_sticker_ttlive_gift_render", "setGiftAnimEngine error", thM5exceptionOrNullimpl);
        }
    }

    public C1139480fl4(DataChannel dataChannel) {
        setDataChannel(dataChannel);
    }

    @Override // X.InterfaceC1133090fal
    public final void LIZ(Function1<? super C1136560fgM, Boolean> function1) {
        Iterator<C1136560fgM> it2 = this.LLILLJJLI.LLJ.iterator();
        while (it2.hasNext() && !function1.invoke(it2.next()).booleanValue()) {
        }
    }

    @Override // X.C0UIY
    public final void setDataChannel(DataChannel dataChannel) {
        C1139470fl3 c1139470fl3 = this.LLILLJJLI;
        c1139470fl3.LLILLJJLI = dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(RtcSeiReceivedChannel.class, c1139470fl3, c1139470fl3.LLJIJIL);
        }
    }

    @Override // X.InterfaceC1133090fal
    public final void LIZJ(GiftMessage giftMessage, InterfaceC1139780flY interfaceC1139780flY, C1136560fgM c1136560fgM) {
        Long lValueOf;
        if (this.LL) {
            C20441214yg.LJ("gift_sticker_ttlive_gift_render", "handleGiftMessage return due to stop");
            return;
        }
        Gift gift = giftMessage.mGift;
        if (gift != null && 4 == gift.type) {
            ARunnableS25S0400000_17 aRunnableS25S0400000_17 = new ARunnableS25S0400000_17(interfaceC1139780flY, giftMessage, c1136560fgM, this, 1);
            C1136380fg4.LIZ.getClass();
            GiftMessage.InteractiveGiftInfo interactiveGiftInfo = giftMessage.interactiveGiftInfo;
            if (interactiveGiftInfo != null && (lValueOf = Long.valueOf(interactiveGiftInfo.crossScreenRole)) != null && lValueOf.longValue() == 2) {
                C1136380fg4.LIZJ(giftMessage.interactiveGiftInfo, giftMessage.multiGenerateMessage, aRunnableS25S0400000_17);
                return;
            } else {
                aRunnableS25S0400000_17.run();
                return;
            }
        }
        C20441214yg.LJ("gift_sticker_ttlive_gift_render", "handleGiftMessage return due to wrong gift type");
    }
}
