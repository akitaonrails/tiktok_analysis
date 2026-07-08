package com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common;

import X.AbstractC19484711Kz;
import X.AnonymousClass0206;
import X.C01FQ;
import X.C01FR;
import X.C01GW;
import X.C01H9;
import X.C01HA;
import X.C020Y;
import X.C11NJ;
import X.C11QI;
import X.C19487111Lx;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C303501Fp;
import X.C304301Fx;
import X.C452501pT;
import X.C500260Jjc;
import X.C516201zk;
import X.C5183020f;
import X.C915980Zwa;
import X.C930930aKh;
import X.C930940aKi;
import X.InterfaceC302601Fg;
import X.InterfaceC954180awC;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseLiveShowViewModel extends ViewModel {
    public final MutableLiveData<Integer> LL = new MutableLiveData<>(0);
    public final MutableLiveData<C01H9> LLILLJJLI = new MutableLiveData<>(null);
    public final MutableLiveData<C303501Fp> LLILLL = new MutableLiveData<>(null);
    public final MutableLiveData<ShowConfig> LLILZ;
    public final MutableLiveData<ShowContent> LLILZIL;
    public C19487111Lx LLILZLL;
    public final C304301Fx LLIZ;
    public final C01GW LLIZLLLIL;
    public final long LLJ;
    public DataChannel LLJI;
    public LifecycleOwner LLJIJIL;

    public void wQ2() {
    }

    public void xQ2(int i) {
    }

    public void yQ2(int i) {
    }

    public final void DQ2() {
        if (this.LLILZLL == null) {
            return;
        }
        C20441214yg.LIZIZ("BaseLiveShowViewModel", "disposeAnimationStateCalibration");
        C19487111Lx c19487111Lx = this.LLILZLL;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LLILZLL = null;
    }

    public final C11NJ EQ2() {
        return (C11NJ) this.LLIZLLLIL.getValue();
    }

    public final long getChannelId() {
        String strU3;
        Long lLJIILIIL;
        long jLongValue = 0;
        try {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (strU3 = interfaceC954180awCLLJLL.U3()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strU3)) != null) {
                jLongValue = lLJIILIIL.longValue();
                return jLongValue;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jLongValue;
    }

    public final void vQ2() {
        int value = MultiGuestLiveShowAnimationStateBackUpSetting.INSTANCE.getValue();
        if (value <= 0) {
            return;
        }
        C20441214yg.LIZIZ("BaseLiveShowViewModel", "start checkAnimationStateAfterLiveShowEnd");
        this.LLILZLL = (C19487111Lx) new C11QI(AbstractC19484711Kz.LJIJJLI(1).LJIIIIZZ(value, TimeUnit.SECONDS).LJIIIZ(new C516201zk(this, 52))).LJIILL().LJIIZILJ();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.01Fx] */
    public BaseLiveShowViewModel() {
        ShowConfig showConfig = new ShowConfig();
        showConfig.durationPerGuest = 300L;
        showConfig.allowOpenMicFreely = MultiGuestLiveShowConfigSetting.INSTANCE.isAllowOpenMic();
        showConfig.transitionDurationOfConfig = 0L;
        this.LLILZ = new MutableLiveData<>(showConfig);
        this.LLILZIL = new MutableLiveData<>(null);
        this.LLIZ = new C01FR() { // from class: X.01Fx
            @Override // X.C01FR
            public final void LIZIZ() {
                C500260Jjc.LJJLIIIJJIZ(new C5182020e(this.LIZ, 60));
            }

            @Override // X.C01FR
            public final void LIZJ() {
                C500260Jjc.LJJLIIIJJIZ(new C5182020e(this.LIZ, 59));
            }

            @Override // X.C01FR
            public final void LIZLLL() {
                C500260Jjc.LJJLIIIJJIZ(new C5182020e(this.LIZ, 58));
            }

            @Override // X.C01FR
            public final void LIZ(C01FL c01fl) {
                C500260Jjc.LJJLIIIJJIZ(new C020Y(this.LIZ, c01fl, 14));
            }
        };
        this.LLIZLLLIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(50));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        this.LLJ = (room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) ? 0L : room.getId();
    }

    public static long FQ2() {
        Long lLJII;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ == null || (lLJII = interfaceC302601FgLIZ.LJII()) == null) {
            return 0L;
        }
        return lLJII.longValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            interfaceC302601FgLIZ.LJIIIZ(this.LLIZ);
        }
        EQ2().LJ();
        InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
        if (interfaceC302601FgLIZ2 != null) {
            interfaceC302601FgLIZ2.LLD(false);
        }
    }

    public void onInit() {
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            interfaceC302601FgLIZ.LJFF(this.LLIZ);
        }
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LLJIJIL, LiveShowNextGuestEvent.class, new C5183020f(this, 57));
            dataChannel.BQ2(this.LLJIJIL, LiveShowContentChangedEvent.class, new C5183020f(this, 58));
            dataChannel.BQ2(this.LLJIJIL, LiveShowTransitionStartEvent.class, new C5183020f(this, 59));
        }
    }

    public final void BQ2(ShowConfig showConfig) {
        if (!C01HA.LJFF(showConfig, this.LLILZ.getValue())) {
            this.LLILZ.setValue(showConfig);
        }
    }

    public final void CQ2(C303501Fp c303501Fp) {
        C500260Jjc.LJJLIIIJJIZ(new C020Y(this, c303501Fp, 13));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update showingUser: ");
        sbLIZ.append(c303501Fp);
        C20441214yg.LIZIZ("remain time test", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void zQ2(String str) {
        DQ2();
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            interfaceC302601FgLIZ.LIZLLL(str);
        }
    }

    public final void AQ2(List<ShowListUser> list, List<ShowListUser> list2, boolean z) {
        C01H9 c01h9LIZ = C01HA.LIZ(list, list2, z);
        if (!C01HA.LJ(this.LLILLJJLI.getValue(), c01h9LIZ)) {
            C500260Jjc.LJJLIIIJJIZ(new C020Y(this, c01h9LIZ, 12));
        }
    }
}
