package X;

import android.os.Looper;
import com.bytedance.android.livesdk.game.common.datachannel.GameLiveFloatBallTipsUpdateEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0Ufz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778290Ufz implements InterfaceC777850UfH {
    public final DataChannel LL;
    public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
    public final AtomicLong LLILLL = new AtomicLong(0);
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(547));
    public final AtomicInteger LLILZIL = new AtomicInteger(0);
    public final C778300Ug0 LLILZLL = new C778300Ug0();

    @Override // X.InterfaceC777850UfH
    public final void LJII(AbstractC777950UfR abstractC777950UfR, EnumC778130Ufj enumC778130Ufj) {
    }

    public C778290Ufz(DataChannel dataChannel) {
        this.LL = dataChannel;
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LIZ(EnumC777480Ueg.LOW_PERFORMANCE, this);
        }
    }

    @Override // X.InterfaceC777850UfH
    public final void LJI(AbstractC777950UfR abstractC777950UfR) {
        if (abstractC777950UfR instanceof C778310Ug1) {
            EnumC778330Ug3 enumC778330Ug3 = ((C778310Ug1) abstractC777950UfR).LJ;
            this.LLILZLL.LIZ(enumC778330Ug3);
            LIZ(enumC778330Ug3, this.LL, ((Number) this.LLILZ.getValue()).longValue());
            if (enumC778330Ug3 != EnumC778330Ug3.LOW_DEVICE_TIP) {
                this.LLILZIL.getAndAdd(1);
                this.LLILLL.set(System.currentTimeMillis());
            }
        }
    }

    public static void LIZ(EnumC778330Ug3 enumC778330Ug3, DataChannel dataChannel, long j) {
        String str;
        int i = C778320Ug2.LIZIZ[enumC778330Ug3.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    str = "2";
                }
            } else {
                str = "1";
            }
        } else {
            str = "3";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_performance_window_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII(str, "type");
        c474500IjALIZ.LJJII("overlay", "position");
        c474500IjALIZ.LIZ();
    }

    public final void LIZIZ(EnumC778330Ug3 enumC778330Ug3, long j, boolean z) {
        int iOrdinal;
        String strLJIJI;
        if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LJII(new C778310Ug1(enumC778330Ug3));
            return;
        }
        this.LLILZLL.LIZ(enumC778330Ug3);
        int[] iArr = C778320Ug2.LIZIZ;
        int i = iArr[enumC778330Ug3.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        iOrdinal = EnumC778100Ufg.LIVE_TIP_SAVE_MODE_TIPS.ordinal();
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    iOrdinal = EnumC778100Ufg.LIVE_TIP_HIGH_TEMPERATURE_TIPS.ordinal();
                }
            } else {
                iOrdinal = EnumC778100Ufg.LIVE_TIP_LOW_BATTERY_TIPS.ordinal();
            }
        } else {
            iOrdinal = EnumC778100Ufg.LIVE_TIP_LOW_DEVICE_TIPS.ordinal();
        }
        int i2 = iArr[enumC778330Ug3.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        strLJIJI = C497740JfY.LJIJI(2131843104);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131843108);
                }
            } else {
                strLJIJI = C497740JfY.LJIJI(2131843102);
            }
        } else {
            strLJIJI = C497740JfY.LJIJI(2131843103);
        }
        this.LL.LC0(GameLiveFloatBallTipsUpdateEvent.class, new C777880UfK(iOrdinal, strLJIJI));
        LIZ(enumC778330Ug3, this.LL, j);
        if (z) {
            this.LLILZIL.getAndAdd(1);
            this.LLILLL.set(System.currentTimeMillis());
        }
    }
}
