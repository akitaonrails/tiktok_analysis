package X;

import Y.AfS176S0100000_7;
import Y.AfS83S0101000_17;
import android.os.CountDownTimer;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.live.poll.PollApi;
import com.bytedance.android.live.publicscreen.api.WarningInfoVisibilityEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS254S0000000_17;

/* JADX INFO: renamed from: X.0eO6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086800eO6 {
    public static CountDownTimerC1086810eO7 LIZIZ;
    public static boolean LIZJ;
    public static long LIZLLL;
    public static int LJ;
    public static DataChannel LJI;
    public static final C1086800eO6 LIZ = new C1086800eO6();
    public static final HashSet<InterfaceC1086820eO8> LJFF = new HashSet<>();

    public static void LIZIZ(InterfaceC1086820eO8 interfaceC1086820eO8) {
        LJFF.remove(interfaceC1086820eO8);
    }

    public final void LIZ(int i, Function1<? super Boolean, Unit> function1) {
        long jLongValue;
        Long l;
        Long l2;
        if (!LIZJ) {
            return;
        }
        LIZJ = false;
        DataChannel dataChannel = LJI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        Iterator<InterfaceC1086820eO8> it2 = LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL();
        }
        DataChannel dataChannel2 = LJI;
        long jLongValue2 = 0;
        if (dataChannel2 != null && (l2 = (Long) dataChannel2.gg0(C751340Tdc.class)) != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        DataChannel dataChannel3 = LJI;
        if (dataChannel3 != null && (l = (Long) dataChannel3.gg0(C1086780eO4.class)) != null) {
            jLongValue2 = l.longValue();
        }
        ((PollApi) C482260Ivg.LIZJ(PollApi.class)).endPoll(jLongValue, jLongValue2, i).LJIILIIL(new C0UO0()).LJJLL(new AfS83S0101000_17(i, function1, 0), new AfS176S0100000_7(function1, 219));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0eO7, android.os.CountDownTimer] */
    public final void LIZJ(final long j, DataChannel dataChannel, EnumC1086920eOI enumC1086920eOI) {
        if (C500260Jjc.LJIJI(dataChannel)) {
            return;
        }
        LJI = dataChannel;
        CountDownTimerC1086810eO7 countDownTimerC1086810eO7 = LIZIZ;
        if (countDownTimerC1086810eO7 != null) {
            countDownTimerC1086810eO7.cancel();
        }
        C1086830eO9.LIZ = enumC1086920eOI;
        ?? r0 = new CountDownTimer(j) { // from class: X.0eO7
            @Override // android.os.CountDownTimer
            public final void onFinish() {
                C1086800eO6.LIZ.LIZ(0, null);
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j2) {
                C1086800eO6.LIZLLL = j2;
                Iterator<InterfaceC1086820eO8> it2 = C1086800eO6.LJFF.iterator();
                while (it2.hasNext()) {
                    it2.next().LJJI(j2);
                }
            }
        };
        LIZIZ = r0;
        r0.start();
        LIZJ = true;
        LJ++;
        dataChannel.CQ2(WarningInfoVisibilityEvent.class, this, AFwS254S0000000_17.get$arr$(149));
        dataChannel.CQ2(BroadcastEndShowEvent.class, this, AFwS254S0000000_17.get$arr$(150));
    }
}
