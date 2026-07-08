package com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base;

import X.AnonymousClass0206;
import X.C01E9;
import X.C01EE;
import X.C01EG;
import X.C01FQ;
import X.C01FR;
import X.C020W;
import X.C020Y;
import X.C09JN;
import X.C11IW;
import X.C11NZ;
import X.C1701940uOG;
import X.C1AZW;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C299601Ec;
import X.C420901kN;
import X.C421101kP;
import X.C421401kS;
import X.C515001zY;
import X.C516201zk;
import X.C915980Zwa;
import X.C930940aKi;
import X.InterfaceC302601Fg;
import X.InterfaceC420801kM;
import X.InterfaceC421301kR;
import X.InterfaceC781210Ukh;
import X.InterfaceC954180awC;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.RemoveCountDownPlayMaskEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import webcast.data.multi_guest_play.CountdownUser;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseCountdownViewModel extends ViewModel {
    public DataChannel LL;
    public final C421401kS LLILLJJLI = new C421401kS();
    public final HashSet<String> LLILLL = new HashSet<>();
    public final MutableLiveData<C299601Ec> LLILZ = new MutableLiveData<>(null);
    public final MutableLiveData<C01E9> LLILZIL = new MutableLiveData<>(null);
    public final C421101kP LLILZLL = new C01FR() { // from class: X.01kP
        @Override // X.C01FR
        public final void LIZJ() {
        }

        @Override // X.C01FR
        public final void LIZLLL() {
        }

        @Override // X.C01FR
        public final void LIZIZ() {
            InterfaceC421301kR interfaceC421301kRLIZIZ;
            C1AZW c1azw = C1AZW.LIZ;
            String tag = this.LIZ.getTag();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("roomState = ");
            InterfaceC421301kR interfaceC421301kRLIZIZ2 = C01EG.LIZIZ();
            sbLIZ.append(interfaceC421301kRLIZIZ2 != null ? interfaceC421301kRLIZIZ2.LJIIIZ() : null);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1azw.getClass();
            C1AZW.LIZ(tag, strLIZIZ, null, null);
            InterfaceC421301kR interfaceC421301kRLIZIZ3 = C01EG.LIZIZ();
            if ((interfaceC421301kRLIZIZ3 != null ? interfaceC421301kRLIZIZ3.LJIIIZ() : null) != C01EB.FINISH || (interfaceC421301kRLIZIZ = C01EG.LIZIZ()) == null) {
                return;
            }
            interfaceC421301kRLIZIZ.LJJ();
        }

        @Override // X.C01FR
        public final void LIZ(C01FL c01fl) {
            C01EB c01ebLJIIIZ;
            InterfaceC421301kR interfaceC421301kRLIZIZ;
            List<C01E5> listLJIILLIIL;
            String str;
            C1AZW c1azw = C1AZW.LIZ;
            String tag = this.LIZ.getTag();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("roomState = ");
            InterfaceC421301kR interfaceC421301kRLIZIZ2 = C01EG.LIZIZ();
            C01EB c01ebLJIIIZ2 = null;
            if (interfaceC421301kRLIZIZ2 != null) {
                c01ebLJIIIZ = interfaceC421301kRLIZIZ2.LJIIIZ();
            } else {
                c01ebLJIIIZ = null;
            }
            sbLIZ.append(c01ebLJIIIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1azw.getClass();
            C1AZW.LIZ(tag, strLIZIZ, null, null);
            InterfaceC421301kR interfaceC421301kRLIZIZ3 = C01EG.LIZIZ();
            if (interfaceC421301kRLIZIZ3 != null) {
                c01ebLJIIIZ2 = interfaceC421301kRLIZIZ3.LJIIIZ();
            }
            if (c01ebLJIIIZ2 == C01EB.FINISH && (interfaceC421301kRLIZIZ = C01EG.LIZIZ()) != null && (listLJIILLIIL = interfaceC421301kRLIZIZ.LJIILLIIL()) != null) {
                ArrayList<String> arrayList = new ArrayList();
                Iterator<C01E5> it2 = listLJIILLIIL.iterator();
                while (it2.hasNext()) {
                    CountdownUser countdownUser = it2.next().LIZ.countdownUser;
                    if (countdownUser != null && (str = countdownUser.linkmicId) != null) {
                        arrayList.add(str);
                    }
                }
                BaseCountdownViewModel baseCountdownViewModel = this.LIZ;
                for (String str2 : arrayList) {
                    DataChannel dataChannel = baseCountdownViewModel.LL;
                    if (dataChannel != null) {
                        dataChannel.LC0(RemoveCountDownPlayMaskEvent.class, new C421201kQ(str2));
                    }
                }
            }
        }
    };
    public final C420901kN LLIZ = new C01EE() { // from class: X.01kN
        @Override // X.C01EE
        public final void LIZ(C01E9 c01e9) {
            this.LIZ.LLILZIL.setValue(c01e9);
        }

        @Override // X.C01EE
        public final void LIZIZ(C299601Ec c299601Ec) {
            this.LIZ.AQ2(c299601Ec);
        }

        @Override // X.C01EE
        public final void LIZJ(C299601Ec c299601Ec) {
            this.LIZ.BQ2(c299601Ec);
        }

        @Override // X.C01EE
        public final void LIZLLL(C299601Ec c299601Ec) {
            this.LIZ.zQ2(c299601Ec);
        }
    };

    public void CQ2(C299601Ec c299601Ec, String str) {
    }

    public abstract String getTag();

    public long xQ2(C299601Ec c299601Ec) {
        return 30L;
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

    public final long yQ2() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            return room.getId();
        }
        return 0L;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C1AZW.LJIIJ(12, getTag(), "onCleared", null, null);
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            interfaceC302601FgLIZ.LJIIIZ(this.LLILZLL);
        }
        super.onCleared();
        InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
        if (interfaceC421301kRLIZIZ != null) {
            interfaceC421301kRLIZIZ.LJIILL(this.LLIZ);
        }
        InterfaceC421301kR interfaceC421301kRLIZIZ2 = C01EG.LIZIZ();
        if (interfaceC421301kRLIZIZ2 != null) {
            interfaceC421301kRLIZIZ2.destroy();
        }
    }

    public static Long wQ2(String str) {
        InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
        if (interfaceC421301kRLIZIZ != null) {
            return interfaceC421301kRLIZIZ.LJIIZILJ(str);
        }
        return null;
    }

    public void AQ2(C299601Ec c299601Ec) {
        C1AZW.LJIIJ(12, getTag(), "viewModel call onStateIdle", null, null);
        String str = c299601Ec.LIZJ;
        InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
        if (interfaceC421301kRLIZIZ != null) {
            interfaceC421301kRLIZIZ.LJFF(str);
        }
        C421401kS c421401kS = this.LLILLJJLI;
        c421401kS.LIZIZ(c299601Ec.LIZJ);
        c421401kS.LIZ(c299601Ec.LIZJ);
        this.LLILLL.remove(c299601Ec.LIZJ);
        this.LLILZ.setValue(c299601Ec);
    }

    public void BQ2(C299601Ec c299601Ec) {
        C1AZW.LJIIJ(12, getTag(), "viewModel call onStateOnGoing", null, null);
        this.LLILLJJLI.LIZ(c299601Ec.LIZJ);
        Long lWQ2 = wQ2(c299601Ec.LIZJ);
        if (lWQ2 != null) {
            final long jLongValue = lWQ2.longValue();
            String tag = getTag();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("toStateOnGoing, remainTime = ");
            sbLIZ.append(jLongValue);
            C1AZW.LJIIJ(12, tag, C2188811AlT.LIZIZ(sbLIZ), null, null);
            if (jLongValue > 0) {
                final C421401kS c421401kS = this.LLILLJJLI;
                final String str = c299601Ec.LIZJ;
                final C020W c020w = new C020W(this, c299601Ec, 2);
                C020Y c020y = new C020Y(this, c299601Ec, 3);
                if (c421401kS.LIZ.containsKey(str)) {
                    C20441214yg.LIZIZ("TimerManager", "user has started timer");
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("start countdown timer, duration = ");
                    sbLIZ2.append(jLongValue);
                    sbLIZ2.append(", linkMicId = ");
                    sbLIZ2.append(str);
                    C20441214yg.LIZIZ("TimerManager", C2188811AlT.LIZIZ(sbLIZ2));
                    c421401kS.LIZ.put(str, new C11IW(C11NZ.LJJJJLL(0L, jLongValue + 1, 0L, 1L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIII(new C09JN() { // from class: X.01kO
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("TimerManager@b0e6.startTimer$disposable$1");
                            Long l = (Long) obj;
                            c421401kS.LIZJ.put(str, Long.valueOf(jLongValue - l.longValue()));
                            c020w.invoke(Long.valueOf(jLongValue - l.longValue()));
                            C1C7U.LIZIZ("TimerManager@b0e6.startTimer$disposable$1");
                        }
                    }).LJJIIJZLJL(new C515001zY(c020y, 2)).LJJIIZ(new InterfaceC781210Ukh() { // from class: X.01kg
                        @Override // X.InterfaceC781210Ukh
                        public final void run() {
                        }
                    })).LJIILL().LJIIZILJ());
                }
            } else {
                String str2 = c299601Ec.LIZJ;
                InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
                if (interfaceC421301kRLIZIZ != null) {
                    interfaceC421301kRLIZIZ.LJIILJJIL(str2);
                }
            }
            this.LLILZ.setValue(c299601Ec);
        }
    }

    public void vQ2(String str) {
        C1AZW.LJIIJ(12, getTag(), "clearCache", null, null);
        this.LLILLL.clear();
        C421401kS c421401kS = this.LLILLJJLI;
        c421401kS.getClass();
        C20441214yg.LIZIZ("TimerManager", "removeAllTimer");
        Iterator<Map.Entry<String, InterfaceC420801kM>> it2 = c421401kS.LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().dispose();
        }
        c421401kS.LIZ.clear();
        Iterator<Map.Entry<String, InterfaceC420801kM>> it3 = c421401kS.LIZIZ.entrySet().iterator();
        while (it3.hasNext()) {
            it3.next().getValue().dispose();
        }
        c421401kS.LIZIZ.clear();
        c421401kS.LIZJ.clear();
        InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
        if (interfaceC421301kRLIZIZ != null) {
            interfaceC421301kRLIZIZ.LJIILL(this.LLIZ);
        }
        InterfaceC421301kR interfaceC421301kRLIZIZ2 = C01EG.LIZIZ();
        if (interfaceC421301kRLIZIZ2 != null) {
            interfaceC421301kRLIZIZ2.clearCache();
        }
        this.LLILZ.setValue(null);
        this.LLILZIL.setValue(null);
    }

    public void zQ2(C299601Ec c299601Ec) {
        InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
        if (interfaceC421301kRLIZIZ != null && interfaceC421301kRLIZIZ.LJIILIIL(c299601Ec.LIZJ) != null) {
            C1AZW.LJIIJ(12, getTag(), "viewModel call onStateFinish", null, null);
            final C421401kS c421401kS = this.LLILLJJLI;
            final String str = c299601Ec.LIZJ;
            long jXQ2 = xQ2(c299601Ec);
            AnonymousClass0206 anonymousClass0206 = AnonymousClass0206.get$arr$(44);
            final C020Y c020y = new C020Y(this, c299601Ec, 2);
            if (c421401kS.LIZIZ.containsKey(str)) {
                InterfaceC420801kM interfaceC420801kM = c421401kS.LIZIZ.get(str);
                if (interfaceC420801kM != null) {
                    interfaceC420801kM.dispose();
                }
                c421401kS.LIZIZ.remove(str);
            }
            c421401kS.LIZIZ.put(str, new C11IW(C11NZ.LJJJJLL(0L, 1 + jXQ2, 0L, 1L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIII(new C516201zk(anonymousClass0206, 237)).LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.01kc
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    c421401kS.LIZ(str);
                    c020y.invoke();
                }
            }).LJJIIZ(new InterfaceC781210Ukh() { // from class: X.01kf
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                }
            })).LJIILL().LJIIZILJ());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startRemoveMaskUiTimer linkMicId = ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("TimerManager", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILZ.setValue(c299601Ec);
        }
    }
}
