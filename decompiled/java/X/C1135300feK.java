package X;

import Y.ARunnableS117S0100000_17;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficDropMessageAnchorSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficDropMessageConfig;
import com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficDropMessageSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficDropMessageViewerSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficOutputMessageDelaySetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftMsgBufferControlOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftReceivingRefactorSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.LinkedList;
import java.util.TreeMap;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0feK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135300feK {
    public final InterfaceC1132530fZr LIZ;
    public final InterfaceC1135400feU LIZIZ;
    public final InterfaceC1135310feL LIZJ;
    public final BPEAHandler LIZLLL;
    public boolean LJ;
    public volatile boolean LJFF;
    public volatile boolean LJI;
    public final C1136340fg0 LJII;
    public boolean LJIIIIZZ;
    public final ARunnableS117S0100000_17 LJIIIZ;
    public final ARunnableS117S0100000_17 LJIIJ;

    public final boolean LIZ() {
        return (this.LJFF || this.LJI || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground()) ? false : true;
    }

    public final int LIZLLL() {
        C1131090fXX c1131090fXXLIZ;
        C1133250fb1 c1133250fb1;
        InterfaceC1135380feS interfaceC1135380feSLIZ;
        C1139530fl9 c1139530fl9LJII;
        InterfaceC1132530fZr interfaceC1132530fZr = this.LIZ;
        if (interfaceC1132530fZr == null || (c1131090fXXLIZ = interfaceC1132530fZr.LIZ()) == null || (c1133250fb1 = c1131090fXXLIZ.LIZJ) == null || (interfaceC1135380feSLIZ = c1133250fb1.LIZ()) == null || (c1139530fl9LJII = interfaceC1135380feSLIZ.LJII()) == null) {
            return 0;
        }
        return (int) c1139530fl9LJII.LLJ.LJIIJJI();
    }

    public final int LJ() {
        C1131090fXX c1131090fXXLIZ;
        C1133250fb1 c1133250fb1;
        InterfaceC1135390feT interfaceC1135390feTLIZIZ;
        C1139460fl2 c1139460fl2LJII;
        InterfaceC1132530fZr interfaceC1132530fZr = this.LIZ;
        if (interfaceC1132530fZr == null || (c1131090fXXLIZ = interfaceC1132530fZr.LIZ()) == null || (c1133250fb1 = c1131090fXXLIZ.LIZJ) == null || (interfaceC1135390feTLIZIZ = c1133250fb1.LIZIZ()) == null || (c1139460fl2LJII = interfaceC1135390feTLIZIZ.LJII()) == null) {
            return 0;
        }
        return (int) c1139460fl2LJII.LLJ.LJIIJJI();
    }

    public final int LJFF() {
        C1131090fXX c1131090fXXLIZ;
        C1133250fb1 c1133250fb1;
        C1135920ffK c1135920ffK;
        C1136100ffc c1136100ffcLJIJJ;
        C1136350fg1 c1136350fg1;
        InterfaceC1132530fZr interfaceC1132530fZr = this.LIZ;
        return (int) ((interfaceC1132530fZr == null || (c1131090fXXLIZ = interfaceC1132530fZr.LIZ()) == null || (c1133250fb1 = c1131090fXXLIZ.LIZJ) == null || (c1135920ffK = c1133250fb1.LIZJ) == null || (c1136100ffcLJIJJ = c1135920ffK.LJIJJ()) == null || (c1136350fg1 = c1136100ffcLJIJJ.LIZIZ) == null) ? 0L : c1136350fg1.LJIIJJI());
    }

    public final int LJI() {
        C1131090fXX c1131090fXXLIZ;
        C1133250fb1 c1133250fb1;
        C1135920ffK c1135920ffK;
        C1136100ffc c1136100ffcLJIJJ;
        C1136350fg1 c1136350fg1;
        InterfaceC1132530fZr interfaceC1132530fZr = this.LIZ;
        return (int) ((interfaceC1132530fZr == null || (c1131090fXXLIZ = interfaceC1132530fZr.LIZ()) == null || (c1133250fb1 = c1131090fXXLIZ.LIZJ) == null || (c1135920ffK = c1133250fb1.LIZJ) == null || (c1136100ffcLJIJJ = c1135920ffK.LJIJJ()) == null || (c1136350fg1 = c1136100ffcLJIJJ.LIZ) == null) ? 0L : c1136350fg1.LJIIJJI());
    }

    public final void LJII() {
        if (!LIZ()) {
            this.LJIIIIZZ = false;
            return;
        }
        if (LIZJ()) {
            this.LJIIIIZZ = false;
            if (C1133910fc5.LIZ()) {
                C1133910fc5.LJ("GiftQueueTrafficController_OUT", "gift buffer is empty, stop polling");
                return;
            }
            return;
        }
        this.LJIIIIZZ = true;
        InterfaceC1132530fZr interfaceC1132530fZr = this.LIZ;
        GiftHighTrafficDropMessageConfig giftHighTrafficDropMessageConfigLIZJ = LIZJ(C500260Jjc.LJIIZILJ(interfaceC1132530fZr != null ? interfaceC1132530fZr.o3() : null));
        int i = giftHighTrafficDropMessageConfigLIZJ.insertSmallGiftNum + giftHighTrafficDropMessageConfigLIZJ.insertBigGiftNum;
        int i2 = i >= 1 ? i : 1;
        if (C1133910fc5.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("poll ");
            sbLIZ.append(i2);
            sbLIZ.append(" msg from giftBuffer, remaining=");
            sbLIZ.append((int) LJIIJJI());
            C1133910fc5.LJ("GiftQueueTrafficController_OUT", C2188811AlT.LIZIZ(sbLIZ));
        }
        int i3 = 0;
        while (LIZ()) {
            InterfaceC1136020ffU interfaceC1136020ffULJII = LJII(null);
            if (interfaceC1136020ffULJII != null) {
                if (C1133910fc5.LIZ()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("poll gift -> ");
                    InterfaceC1136800fgk interfaceC1136800fgkLJIILL = interfaceC1136020ffULJII.LJIILL();
                    sbLIZ2.append(interfaceC1136800fgkLJIILL != null ? interfaceC1136800fgkLJIILL.LJFF() : null);
                    sbLIZ2.append(" / ");
                    InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffULJII.LJIIIIZZ();
                    sbLIZ2.append(interfaceC1136160ffiLJIIIIZZ != null ? Long.valueOf(interfaceC1136160ffiLJIIIIZZ.getId()) : null);
                    sbLIZ2.append(" / ");
                    sbLIZ2.append(interfaceC1136020ffULJII.getRepeatCount());
                    C1133910fc5.LJ("GiftQueueTrafficController", C2188811AlT.LIZIZ(sbLIZ2));
                }
                this.LIZIZ.LIZJ(interfaceC1136020ffULJII);
            }
            i3++;
            if (i3 >= i2) {
                if (C1133910fc5.LIZ()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("polled batch, remaining=");
                    sbLIZ3.append((int) LJIIJJI());
                    sbLIZ3.append(", schedule next poll");
                    C1133910fc5.LJ("GiftQueueTrafficController_OUT", C2188811AlT.LIZIZ(sbLIZ3));
                }
                long jInsertionInterval = LiveGiftReceivingRefactorSetting.INSTANCE.insertionInterval();
                InterfaceC1135310feL interfaceC1135310feL = this.LIZJ;
                if (interfaceC1135310feL != null) {
                    interfaceC1135310feL.LIZLLL(jInsertionInterval, "GiftQueueTrafficController.pollBuffer", new AwS561S0100000_17(this, 437));
                    return;
                } else {
                    C786410Ut5.LJLIIL(jInsertionInterval, this.LIZLLL, this.LJIIJ);
                    return;
                }
            }
        }
        this.LJIIIIZZ = false;
    }

    public static GiftHighTrafficDropMessageConfig LIZJ(boolean z) {
        if (GiftMsgBufferControlOptSetting.INSTANCE.isConfigByRole()) {
            if (z) {
                return GiftHighTrafficDropMessageAnchorSetting.INSTANCE.getConfig();
            }
            return GiftHighTrafficDropMessageViewerSetting.INSTANCE.getConfig();
        }
        return GiftHighTrafficDropMessageSetting.INSTANCE.getConfig();
    }

    public final void LIZIZ(String str) {
        InterfaceC1135310feL interfaceC1135310feL = this.LIZJ;
        if (interfaceC1135310feL != null && !interfaceC1135310feL.LIZJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GiftQueueTrafficController.clearGiftBufferQueue, source=");
            sbLIZ.append(str);
            interfaceC1135310feL.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), new AwS561S0100000_17(this, 436));
            return;
        }
        LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0fg0] */
    public C1135300feK(InterfaceC1132530fZr interfaceC1132530fZr, InterfaceC1135400feU interfaceC1135400feU) {
        InterfaceC1135310feL interfaceC1135310feLLIZIZ;
        this.LIZ = interfaceC1132530fZr;
        this.LIZIZ = interfaceC1135400feU;
        if (interfaceC1132530fZr != null) {
            interfaceC1135310feLLIZIZ = interfaceC1132530fZr.LIZIZ();
        } else {
            interfaceC1135310feLLIZIZ = null;
        }
        this.LIZJ = interfaceC1135310feLLIZIZ;
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LIZLLL = bPEAHandler;
        this.LJ = true;
        this.LJII = new AbstractC1139490fl5<InterfaceC1136020ffU>() { // from class: X.0fg0
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.AbstractC1139490fl5
            public final boolean LJI(InterfaceC1136020ffU interfaceC1136020ffU) {
                InterfaceC1136020ffU interfaceC1136020ffU2 = interfaceC1136020ffU;
                InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU2.LJIIIIZZ();
                int iLIZIZ = C1135870ffF.LIZIZ(interfaceC1136020ffU2);
                if (interfaceC1136160ffiLJIIIIZZ != null && iLIZIZ >= 0) {
                    if (iLIZIZ < LiveGiftReceivingRefactorSetting.INSTANCE.lowPriceThreshold()) {
                        iLIZIZ = 1;
                    }
                    LinkedList linkedList = (LinkedList) this.LIZJ.get(Integer.valueOf(iLIZIZ));
                    if (linkedList == null) {
                        TreeMap<Integer, LinkedList<DATA>> treeMap = this.LIZJ;
                        Integer numValueOf = Integer.valueOf(iLIZIZ);
                        LinkedList linkedList2 = new LinkedList();
                        linkedList2.add(interfaceC1136020ffU2);
                        treeMap.put(numValueOf, (LinkedList<DATA>) linkedList2);
                        return true;
                    }
                    linkedList.add(interfaceC1136020ffU2);
                    return true;
                }
                C1133910fc5.LJ("GiftBucketQueueBuffer", "offer, gift == null || gift.diamondCount < 0");
                return false;
            }
        };
        ARunnableS117S0100000_17 aRunnableS117S0100000_17 = new ARunnableS117S0100000_17(this, 199);
        this.LJIIIZ = aRunnableS117S0100000_17;
        this.LJIIJ = new ARunnableS117S0100000_17(this, 200);
        GiftHighTrafficOutputMessageDelaySetting giftHighTrafficOutputMessageDelaySetting = GiftHighTrafficOutputMessageDelaySetting.INSTANCE;
        if (giftHighTrafficOutputMessageDelaySetting.enable()) {
            this.LJ = false;
            if (interfaceC1135310feLLIZIZ != null) {
                interfaceC1135310feLLIZIZ.LIZLLL(giftHighTrafficOutputMessageDelaySetting.getDelayInterval(), "GiftQueueTrafficController", new AwS561S0100000_17(this, 435));
            } else {
                C786410Ut5.LJLIIL(giftHighTrafficOutputMessageDelaySetting.getDelayInterval(), bPEAHandler, aRunnableS117S0100000_17);
            }
        } else {
            this.LJ = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftMessageBufferController init: canPollMsgNow ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", delayInterval ");
        sbLIZ.append(giftHighTrafficOutputMessageDelaySetting.getDelayInterval());
        C1133910fc5.LIZLLL("GiftQueueTrafficController", C2188811AlT.LIZIZ(sbLIZ));
    }
}
