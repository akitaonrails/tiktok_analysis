package com.bytedance.android.live.liveinteract.multiguestv3.main.ability.component.fanticket.model;

import X.AbstractC19484711Kz;
import X.AbstractC941590abt;
import X.C0IMT;
import X.C11QI;
import X.C1697810uHb;
import X.C19487111Lx;
import X.C305601Gk;
import X.C320901Mh;
import X.C356901a3;
import X.C755510TkL;
import X.C915980Zwa;
import X.C924790aAn;
import X.C941610abv;
import X.C941620abw;
import X.C941630abx;
import X.C941640aby;
import X.C941660ac0;
import X.C941780acC;
import X.C941790acD;
import X.C941800acE;
import X.InterfaceC937900aVw;
import X.InterfaceC941650abz;
import X.InterfaceC954180awC;
import Y.AfS184S0100000_15;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.component.fanticket.model.FanTicketModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.component.fanticket.sei.TicketWriterHelper;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.component.fanticket.util.MultiGuestFanTicketFetchDelayTimeSetting;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.android.livesdk.model.message.UserPlayInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class FanTicketModel {
    public final DataChannel LIZ;
    public final CopyOnWriteArrayList<InterfaceC941650abz> LIZIZ = new CopyOnWriteArrayList<>();
    public final C941630abx LIZJ;
    public final C941660ac0 LIZLLL;
    public final C941640aby LJ;
    public C19487111Lx LJFF;
    public final TicketWriterHelper LJI;
    public final C941610abv LJII;
    public final List<AbstractC941590abt> LJIIIIZZ;

    public final void LIZIZ() {
        C320901Mh.LIZ("FanTicketModel", "onDestroy");
        C924790aAn.LIZLLL().LIZJ(this.LJII);
        Iterator<AbstractC941590abt> it2 = this.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().onDestroy();
        }
        C19487111Lx c19487111Lx = this.LJFF;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LJFF = null;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.SX0(C755510TkL.class, Boolean.TRUE);
        }
        TicketWriterHelper ticketWriterHelper = this.LJI;
        if (ticketWriterHelper.LIZJ != null) {
            ticketWriterHelper.LJIIJJI("component");
        }
    }

    public final void LIZ() {
        if (C320901Mh.LIZJ()) {
            long value = MultiGuestFanTicketFetchDelayTimeSetting.INSTANCE.getValue();
            if (value <= 0) {
                return;
            }
            this.LJFF = (C19487111Lx) new C11QI(AbstractC19484711Kz.LJIJJLI(1).LJIIIIZZ(value, TimeUnit.SECONDS).LJIIIZ(new AfS184S0100000_15(this, 23))).LJIILL().LJIIZILJ();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.android.live.liveinteract.multiguestv3.main.ability.component.fanticket.model.FanTicketModel$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        public AnonymousClass1() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            FanTicketModel.this.LIZIZ();
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }

    public final void LIZJ(FanTicketRoomNoticeContent fanTicketRoomNoticeContent) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        if (this.LJI == null) {
            return;
        }
        if (this.LJFF != null) {
            C320901Mh.LIZ("FanTicketModel", "onTicketContentUpdated, dispose imCalibration");
            C19487111Lx c19487111Lx = this.LJFF;
            if (c19487111Lx != null) {
                c19487111Lx.dispose();
            }
            this.LJFF = null;
        }
        if (C320901Mh.LIZIZ()) {
            if (this.LIZJ.LIZ.size() > 1) {
                C320901Mh.LIZ("FanTicketModel", "onTicketContentUpdated, and totalFanTicketMap size > 1");
                TicketWriterHelper ticketWriterHelper = this.LJI;
                if (ticketWriterHelper.LIZJ == null) {
                    ticketWriterHelper.LIZ(new C305601Gk() { // from class: X.0acH
                        {
                            super("component");
                        }

                        @Override // X.C305601Gk
                        public final long LIZIZ(UserFanTicket userFanTicket) {
                            if (this.LIZIZ.LIZJ.LJFF == 2) {
                                UserPlayInfo userPlayInfo = userFanTicket.playInfo;
                                if (userPlayInfo != null) {
                                    return userPlayInfo.score;
                                }
                                return 0L;
                            }
                            return userFanTicket.fanTicket;
                        }
                    });
                }
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("score_type", String.valueOf(this.LIZJ.LJFF));
                    interfaceC954180awCLLJLL.LJJIIZI("fan_ticket", linkedHashMap, true);
                }
            } else {
                TicketWriterHelper ticketWriterHelper2 = this.LJI;
                if (ticketWriterHelper2.LIZJ != null) {
                    ticketWriterHelper2.LJIIJJI("component");
                }
                InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL2 != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL2.LLIIJLIL()) != null) {
                    interfaceC937900aVwLLIIJLIL.LJIILL("fan_ticket");
                }
            }
            this.LJI.LIZIZ(fanTicketRoomNoticeContent);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0abv] */
    public FanTicketModel(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        Lifecycle lifecycle;
        this.LIZ = dataChannel;
        C941630abx c941630abx = new C941630abx();
        this.LIZJ = c941630abx;
        C941660ac0 c941660ac0 = new C941660ac0(dataChannel, c941630abx, new C941780acC(this), new AwS559S0100000_15(this, 161));
        this.LIZLLL = c941660ac0;
        C941640aby c941640aby = new C941640aby(dataChannel, c941630abx, new C941800acE(this), new AwS559S0100000_15(this, 163), new AwS559S0100000_15(this, 164));
        this.LJ = c941640aby;
        this.LJI = new TicketWriterHelper(dataChannel);
        this.LJII = new C0IMT() { // from class: X.0abv
            @Override // X.C0IMT
            public final void onChanged(Object obj) {
                Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
                if (num != null && num.intValue() == 0 && this.LL.LIZJ.LJI != this.LL.LIZJ.LJFF) {
                    C941630abx c941630abx2 = this.LL.LIZJ;
                    c941630abx2.LJI = c941630abx2.LJFF;
                    FanTicketModel fanTicketModel = this.LL;
                    Iterator<InterfaceC941650abz> it2 = fanTicketModel.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZLLL(fanTicketModel.LIZJ.LJI);
                    }
                }
            }
        };
        this.LJIIIIZZ = C1697810uHb.LJIIJJI(c941660ac0, new C941620abw(dataChannel, c941630abx, new C941790acD(this), new AwS559S0100000_15(this, 162)), c941640aby);
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new AnonymousClass1());
        }
        C924790aAn.LIZLLL().LIZ(this.LJII);
    }
}
