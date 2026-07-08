package X;

import Y.ARunnableS117S0100000_17;
import Y.ARunnableS86S0200000_17;
import android.os.Looper;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficDropMessageAnchorSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficDropMessageConfig;
import com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficDropMessageSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficDropMessageViewerSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficOutputMessageDelaySetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftMsgBufferControlOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fbO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133480fbO {
    public final C1133490fbP LIZ = new C1133490fbP();
    public final C1133490fbP LIZIZ = new C1133490fbP();
    public boolean LIZJ;
    public final BPEAHandler LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public Function1<? super GiftMessage, Unit> LJI;
    public final ARunnableS117S0100000_17 LJII;

    public C1133480fbO() {
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LIZLLL = bPEAHandler;
        this.LJFF = true;
        ARunnableS117S0100000_17 aRunnableS117S0100000_17 = new ARunnableS117S0100000_17(this, 250);
        this.LJII = aRunnableS117S0100000_17;
        GiftHighTrafficOutputMessageDelaySetting giftHighTrafficOutputMessageDelaySetting = GiftHighTrafficOutputMessageDelaySetting.INSTANCE;
        if (!giftHighTrafficOutputMessageDelaySetting.enable()) {
            this.LJFF = true;
        } else {
            this.LJFF = false;
            C786410Ut5.LJLIIL(giftHighTrafficOutputMessageDelaySetting.getDelayInterval(), bPEAHandler, aRunnableS117S0100000_17);
        }
    }

    public static GiftHighTrafficDropMessageConfig LIZ(boolean z) {
        if (GiftMsgBufferControlOptSetting.INSTANCE.isConfigByRole()) {
            if (z) {
                return GiftHighTrafficDropMessageAnchorSetting.INSTANCE.getConfig();
            }
            return GiftHighTrafficDropMessageViewerSetting.INSTANCE.getConfig();
        }
        return GiftHighTrafficDropMessageSetting.INSTANCE.getConfig();
    }

    public final void LIZIZ(Function1<? super GiftMessage, Unit> function1) {
        GiftMessage giftMessageLIZLLL;
        User user;
        Long lValueOf;
        Gift gift;
        User user2;
        Long lValueOf2;
        Gift gift2;
        if (function1 == null) {
            return;
        }
        boolean z = false;
        if (!this.LIZ.LIZIZ().LIZIZ().isEmpty() || !this.LIZIZ.LIZIZ().LIZIZ().isEmpty()) {
            int i = LIZ(this.LJ).insertSmallGiftNum;
            int iLIZJ = this.LIZ.LIZJ();
            if (i > iLIZJ) {
                i = iLIZJ;
            }
            if (i < 1) {
                i = 1;
            }
            int i2 = LIZ(this.LJ).insertBigGiftNum;
            int iLIZJ2 = this.LIZIZ.LIZJ();
            if (i2 > iLIZJ2) {
                i2 = iLIZJ2;
            }
            if (i2 < 1) {
                i2 = 1;
            }
            if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled()) {
                ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline();
            }
            int i3 = 0;
            while (true) {
                Integer numValueOf = null;
                if (i3 >= i) {
                    break;
                }
                C1133490fbP c1133490fbP = this.LIZ;
                c1133490fbP.getClass();
                try {
                    giftMessageLIZLLL = c1133490fbP.LIZIZ().LIZLLL(false);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                    giftMessageLIZLLL = null;
                }
                if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled()) {
                    if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("poll gift -> ");
                        if (giftMessageLIZLLL != null) {
                            user2 = giftMessageLIZLLL.fromUser;
                        } else {
                            user2 = null;
                        }
                        sbLIZ.append(C0KVU.LIZ(user2));
                        sbLIZ.append(" / ");
                        if (giftMessageLIZLLL != null && (gift2 = giftMessageLIZLLL.mGift) != null) {
                            lValueOf2 = Long.valueOf(gift2.id);
                        } else {
                            lValueOf2 = null;
                        }
                        sbLIZ.append(lValueOf2);
                        sbLIZ.append(" / ");
                        if (giftMessageLIZLLL != null) {
                            numValueOf = Integer.valueOf(giftMessageLIZLLL.comboCount);
                        }
                        sbLIZ.append(numValueOf);
                        Logger.i("Haha", C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("poll gift -> ");
                    if (giftMessageLIZLLL != null) {
                        user = giftMessageLIZLLL.fromUser;
                    } else {
                        user = null;
                    }
                    sbLIZ2.append(C0KVU.LIZ(user));
                    sbLIZ2.append(" / ");
                    if (giftMessageLIZLLL != null && (gift = giftMessageLIZLLL.mGift) != null) {
                        lValueOf = Long.valueOf(gift.id);
                    } else {
                        lValueOf = null;
                    }
                    sbLIZ2.append(lValueOf);
                    sbLIZ2.append(" / ");
                    if (giftMessageLIZLLL != null) {
                        numValueOf = Integer.valueOf(giftMessageLIZLLL.comboCount);
                    }
                    sbLIZ2.append(numValueOf);
                    Logger.i("Haha", C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (giftMessageLIZLLL != null) {
                    function1.invoke(giftMessageLIZLLL);
                }
                i3++;
            }
            int i4 = 0;
            do {
                C1133490fbP c1133490fbP2 = this.LIZIZ;
                c1133490fbP2.getClass();
                try {
                    GiftMessage giftMessageLIZLLL2 = c1133490fbP2.LIZIZ().LIZLLL(false);
                    if (giftMessageLIZLLL2 != null) {
                        function1.invoke(giftMessageLIZLLL2);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1AF0.LJ(th2);
                }
                i4++;
            } while (i4 < i2);
            C786410Ut5.LJLIIL(LIZ(this.LJ).insertInterval, this.LIZLLL, new ARunnableS86S0200000_17(this, function1, 73));
            z = true;
        }
        this.LIZJ = z;
    }
}
