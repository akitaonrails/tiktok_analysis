package X;

import com.bytedance.android.live.liveinteract.match.business.event.BattleInvitingTimeLeftChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Usg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786160Usg implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public static final void run$0(C786160Usg c786160Usg) {
        DataChannel dataChannel = (DataChannel) c786160Usg.l0;
        if (dataChannel != null) {
            dataChannel.zW(BattleInvitingTimeLeftChannel.class, 0L);
        }
        Function0 function0 = (Function0) c786160Usg.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void run$1(C786160Usg c786160Usg) {
        DataChannel dataChannel = (DataChannel) c786160Usg.l0;
        if (dataChannel != null) {
            dataChannel.zW(BattleInvitingTimeLeftChannel.class, 0L);
        }
        Function0 function0 = (Function0) c786160Usg.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void run$2(C786160Usg c786160Usg) {
        CopyOnWriteArrayList<InterfaceC755910Tkz> copyOnWriteArrayList = C755900Tky.LLILLJJLI.get((EnumC755930Tl1) c786160Usg.l0);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove((InterfaceC755910Tkz) c786160Usg.l1);
        }
    }

    public static final void run$3(C786160Usg c786160Usg) {
        DataChannel dataChannel = (DataChannel) c786160Usg.l0;
        if (dataChannel != null) {
            dataChannel.zW(BattleInvitingTimeLeftChannel.class, 0L);
        }
        Function0 function0 = (Function0) c786160Usg.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void run$4(C786160Usg c786160Usg) {
        DataChannel dataChannel = (DataChannel) c786160Usg.l0;
        if (dataChannel != null) {
            dataChannel.zW(BattleInvitingTimeLeftChannel.class, 0L);
        }
        Function0 function0 = (Function0) c786160Usg.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void run$5(C786160Usg c786160Usg) {
        InterfaceC773540UWa interfaceC773540UWa;
        InterfaceC773540UWa interfaceC773540UWa2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startEndSpeedTestCountDown complete, origin -> ");
        sbLIZ.append((EnumC783720Uok) c786160Usg.l0);
        C20441214yg.LIZIZ("StreamQualityCenterImpl", C2188811AlT.LIZIZ(sbLIZ));
        EnumC783720Uok enumC783720Uok = (EnumC783720Uok) c786160Usg.l0;
        if (enumC783720Uok == EnumC783720Uok.AUTO) {
            C2250031D4v c2250031D4v = (C2250031D4v) c786160Usg.l1;
            if (c2250031D4v.LJIIJJI == EnumC776530Ud9.AUTO_TEST_RUNNING && (interfaceC773540UWa2 = c2250031D4v.LJFF) != null) {
                interfaceC773540UWa2.LIZJ(C776550UdB.LJIILL);
            }
            ((C2250031D4v) c786160Usg.l1).LJIILJJIL("time_out", "time_out");
            return;
        }
        if (enumC783720Uok == EnumC783720Uok.MANUAL) {
            C2250031D4v c2250031D4v2 = (C2250031D4v) c786160Usg.l1;
            if (c2250031D4v2.LJIIJJI == EnumC776530Ud9.MANUAL_TEST_RUNNING && (interfaceC773540UWa = c2250031D4v2.LJI) != null) {
                interfaceC773540UWa.LIZJ(C776550UdB.LJIILL);
            }
            ((C2250031D4v) c786160Usg.l1).LJIILLIIL("time_out");
        }
    }

    public C786160Usg(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
