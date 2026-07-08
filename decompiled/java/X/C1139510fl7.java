package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fl7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139510fl7 implements C0UIY, InterfaceC1133090fal {
    public boolean LL;
    public final C1139580flE LLILLJJLI;

    @Override // X.InterfaceC1133090fal
    public final void LIZIZ(Object obj, InterfaceC1139780flY interfaceC1139780flY, C1136560fgM c1136560fgM) {
    }

    @Override // X.InterfaceC1133090fal
    public final void LJIIZILJ() {
        this.LL = true;
        C1139580flE c1139580flE = this.LLILLJJLI;
        c1139580flE.getClass();
        c1139580flE.LJI("stopAnimation", null);
        c1139580flE.LLILLL = true;
        InterfaceC1138060fim interfaceC1138060fim = c1139580flE.LLILZLL;
        if (interfaceC1138060fim != null) {
            interfaceC1138060fim.stop();
        }
        c1139580flE.LJIIJ(200);
    }

    @Override // X.C0UIY
    public final void destroy() {
        this.LL = true;
        C1132970faZ.LIZIZ(EnumC1133020fae.MUSIC_GIFT);
        C1139580flE c1139580flE = this.LLILLJJLI;
        c1139580flE.LLILLL = true;
        c1139580flE.LJIIJ(200);
        ((LinkedList) c1139580flE.LLJ).clear();
        DataChannel dataChannel = c1139580flE.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(c1139580flE);
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
        return this.LLILLJJLI.LLILZIL;
    }

    @Override // X.C0UIY
    public final void start() {
        Object c098200Yq;
        try {
            C1132970faZ.LIZJ(EnumC1133020fae.MUSIC_GIFT, this);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("MusicGiftMessageHandler", "setGiftAnimEngine error for Music Gift", thM5exceptionOrNullimpl);
        }
    }

    public C1139510fl7(DataChannel dataChannel) {
        C1139580flE c1139580flE = new C1139580flE();
        this.LLILLJJLI = c1139580flE;
        c1139580flE.LLILLJJLI = dataChannel;
    }

    @Override // X.InterfaceC1133090fal
    public final void LIZ(Function1<? super C1136560fgM, Boolean> function1) {
        Iterator<C1136560fgM> it2 = this.LLILLJJLI.LLJ.iterator();
        while (it2.hasNext() && !function1.invoke(it2.next()).booleanValue()) {
        }
    }

    @Override // X.C0UIY
    public final void setDataChannel(DataChannel dataChannel) {
        this.LLILLJJLI.LLILLJJLI = dataChannel;
    }

    @Override // X.InterfaceC1133090fal
    public final void LIZJ(GiftMessage giftMessage, InterfaceC1139780flY interfaceC1139780flY, C1136560fgM c1136560fgM) {
        Gift gift;
        if (this.LL) {
            C20441214yg.LJ("MusicGiftMessageHandler", "handleGiftMessage return due to stop");
            return;
        }
        if (giftMessage != null && (gift = giftMessage.mGift) != null && gift.type == 22) {
            if (c1136560fgM == null && (c1136560fgM = C1136390fg5.LJFF(giftMessage, interfaceC1139780flY)) == null) {
                C20441214yg.LJ("MusicGiftMessageHandler", "handleGiftMessage error - effectMessage is null");
                C1136500fgG.LJFF(giftMessage);
                return;
            } else {
                if (this.LL) {
                    C20441214yg.LJ("MusicGiftMessageHandler", "handleGiftMessage ignore msg due to stop");
                    return;
                }
                c1136560fgM.LJJJIL = "effect_gift_music";
                C1139580flE c1139580flE = this.LLILLJJLI;
                if (!c1139580flE.LLILLL) {
                    c1136560fgM.LIZJ().LJIIIIZZ();
                    C1136580fgO.LIZ(c1139580flE.LLJ, c1136560fgM);
                    c1139580flE.LJIIZILJ();
                    return;
                }
                return;
            }
        }
        C20441214yg.LJ("MusicGiftMessageHandler", "handleGiftMessage return due to non-Music-gift message");
    }
}
