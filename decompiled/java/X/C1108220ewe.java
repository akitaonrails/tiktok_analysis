package X;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.Handler;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetMinLoadSettingV2;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ewe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108220ewe {
    public final LifecycleOwner LIZ;
    public final Room LIZIZ;
    public final Context LIZJ;
    public final DataChannel LIZLLL;
    public Function1<? super C1108330ewp, Unit> LJ;
    public Function0<Unit> LJFF;
    public InterfaceC1078140eA8 LJI;
    public CountDownTimerC1108320ewo LJIIIIZZ;
    public InterfaceC1108270ewj LJIIJ;
    public final List<InterfaceC1108270ewj> LJII = new ArrayList();
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new C587620N2y());
    public final C0KXT LJIIJJI = new Runnable() { // from class: X.0KXT
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            r3.LJ(r1);
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r5 = this;
                java.lang.String r4 = "CardSceneStrategyManager@a63c.delayShow$1"
                X.C1C7U.LIZ(r4)
                X.0ewe r3 = r5.LL     // Catch: java.lang.Throwable -> L25
                java.util.List<X.0ewj> r0 = r3.LJII     // Catch: java.lang.Throwable -> L25
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L25
                java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L25
            Lf:
                boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L25
                if (r0 == 0) goto L30
                java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L25
                X.0ewj r1 = (X.InterfaceC1108270ewj) r1     // Catch: java.lang.Throwable -> L25
                boolean r0 = r1.LIZIZ()     // Catch: java.lang.Throwable -> L25
                if (r0 == 0) goto Lf
                r3.LJ(r1)     // Catch: java.lang.Throwable -> L25
                goto L30
            L25:
                r1 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                boolean r0 = X.C2179971ATj.LIZ(r1)
                if (r0 != 0) goto L30
                throw r1
            L30:
                X.C1C7U.LIZIZ(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C0KXT.run():void");
        }
    };

    public final void LIZJ() {
        ((ArrayList) this.LJII).add(new C0KXL(this.LIZIZ, this.LIZJ, this, this.LIZLLL));
        ((ArrayList) this.LJII).add(new C0KXR(this.LIZIZ, this.LIZJ, this, this.LIZLLL));
        ArrayList arrayList = (ArrayList) this.LJII;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new Comparator() { // from class: X.0ewg
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1108270ewj) t2).LIZJ()), Integer.valueOf(((InterfaceC1108270ewj) t).LIZJ()));
                }
            });
        }
        Iterator it2 = ((ArrayList) this.LJII).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1108270ewj) it2.next()).LJ();
        }
        Iterator<T> it3 = C519440KYs.LIZ.iterator();
        while (it3.hasNext()) {
            Class cls = (Class) it3.next();
            DataChannel dataChannel = this.LIZLLL;
            if (dataChannel != null) {
                dataChannel.BQ2(this.LIZ, cls, new C1108290ewl(this));
            }
        }
        DataChannel dataChannel2 = this.LIZLLL;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this.LIZ, MultiLiveRTCLayoutChannel.class, new C1108250ewh(this));
        }
        for (InterfaceC1108270ewj interfaceC1108270ewj : (ArrayList) this.LJII) {
            if (interfaceC1108270ewj.LIZIZ()) {
                LJ(interfaceC1108270ewj);
                return;
            }
        }
    }

    public final void LIZLLL() {
        Iterator it2 = ((ArrayList) this.LJII).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1108270ewj) it2.next()).onUnload();
        }
        this.LJI = null;
        this.LJIIJ = null;
        ((ArrayList) this.LJII).clear();
        CountDownTimerC1108320ewo countDownTimerC1108320ewo = this.LJIIIIZZ;
        if (countDownTimerC1108320ewo != null) {
            countDownTimerC1108320ewo.cancel();
        }
        this.LJIIIIZZ = null;
        ((Handler) this.LJIIIZ.getValue()).removeCallbacksAndMessages(null);
    }

    public final void LIZ(boolean z) {
        if (z) {
            InterfaceC1108270ewj interfaceC1108270ewj = this.LJIIJ;
            if (interfaceC1108270ewj != null) {
                LIZIZ(interfaceC1108270ewj);
            }
            ((Handler) this.LJIIIZ.getValue()).removeCallbacks(this.LJIIJJI);
            Iterator it2 = ((ArrayList) this.LJII).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1108270ewj) it2.next()).LIZLLL();
            }
            return;
        }
        Iterator it3 = ((ArrayList) this.LJII).iterator();
        while (it3.hasNext()) {
            ((InterfaceC1108270ewj) it3.next()).LIZLLL();
        }
        if (this.LJIIJ == null) {
            C786410Ut5.LJLIIL(30000L, (Handler) this.LJIIIZ.getValue(), this.LJIIJJI);
        }
    }

    public final void LIZIZ(InterfaceC1108270ewj interfaceC1108270ewj) {
        InterfaceC1108270ewj interfaceC1108270ewj2 = this.LJIIJ;
        if (interfaceC1108270ewj2 != null) {
            if (interfaceC1108270ewj != null && !Intrinsics.LJFF(interfaceC1108270ewj, interfaceC1108270ewj2)) {
                return;
            }
            Function0<Unit> function0 = this.LJFF;
            if (function0 != null) {
                function0.invoke();
            }
            InterfaceC1108270ewj interfaceC1108270ewj3 = this.LJIIJ;
            if (interfaceC1108270ewj3 != null) {
                interfaceC1108270ewj3.onHide();
            }
            this.LJIIJ = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0ewo, android.os.CountDownTimer] */
    public final void LJ(final InterfaceC1108270ewj interfaceC1108270ewj) {
        EnumC918970a1P enumC918970a1P;
        if (!interfaceC1108270ewj.LIZIZ()) {
            return;
        }
        DataChannel dataChannel = this.LIZLLL;
        Set<Class<? extends Channel<Boolean>>> set = C519440KYs.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(set, 10));
        Iterator<T> it2 = set.iterator();
        while (true) {
            Object objGg0 = null;
            if (!it2.hasNext()) {
                break;
            }
            Class cls = (Class) it2.next();
            if (dataChannel != null) {
                objGg0 = dataChannel.gg0(cls);
            }
            arrayList.add(objGg0);
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(it3.next(), Boolean.TRUE)) {
                    return;
                }
            }
        }
        if (dataChannel != null) {
            C1081600eFi c1081600eFi = (C1081600eFi) dataChannel.gg0(MultiLiveRTCLayoutChannel.class);
            if (c1081600eFi != null && (((enumC918970a1P = c1081600eFi.LIZ) == EnumC918970a1P.FLOATING && c1081600eFi.LIZIZ > 0) || enumC918970a1P == EnumC918970a1P.FLOATING_FIX)) {
                return;
            }
            C1088240eQQ c1088240eQQ = (C1088240eQQ) dataChannel.gg0(LivePinCardVisibilityChannel.class);
            if (c1088240eQQ != null && c1088240eQQ.LIZIZ) {
                return;
            }
        }
        if (Intrinsics.LJFF(this.LJIIJ, interfaceC1108270ewj)) {
            return;
        }
        if (LiveWidgetMinLoadSettingV2.INSTANCE.enableSubCommonGuideCard()) {
            InterfaceC1078140eA8 interfaceC1078140eA8 = this.LJI;
            if (interfaceC1078140eA8 != null) {
                ((C1078130eA7) interfaceC1078140eA8).LIZ.LIZ(interfaceC1108270ewj.LIZ(), this);
            }
            this.LJI = null;
        }
        InterfaceC1108270ewj interfaceC1108270ewj2 = this.LJIIJ;
        if (interfaceC1108270ewj2 != null) {
            interfaceC1108270ewj2.onHide();
        }
        this.LJIIJ = interfaceC1108270ewj;
        Function1<? super C1108330ewp, Unit> function1 = this.LJ;
        if (function1 != null) {
            function1.invoke(interfaceC1108270ewj.LIZ());
        }
        interfaceC1108270ewj.onShow();
        ?? r0 = new CountDownTimer() { // from class: X.0ewo
            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                C1108220ewe c1108220ewe = this.LIZ;
                c1108220ewe.LJIIIIZZ = null;
                c1108220ewe.LIZIZ(interfaceC1108270ewj);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(30000L, 1000L);
            }
        };
        this.LJIIIIZZ = r0;
        r0.start();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0KXT] */
    public C1108220ewe(LifecycleOwner lifecycleOwner, Room room, Context context, DataChannel dataChannel, C1108230ewf c1108230ewf, C1108310ewn c1108310ewn, InterfaceC1078140eA8 interfaceC1078140eA8) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = room;
        this.LIZJ = context;
        this.LIZLLL = dataChannel;
        this.LJ = c1108230ewf;
        this.LJFF = c1108310ewn;
        this.LJI = interfaceC1078140eA8;
    }
}
