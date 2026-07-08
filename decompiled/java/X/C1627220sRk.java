package X;

import android.view.MotionEvent;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0sRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1627220sRk extends AbstractC2255721DQs<InterfaceC1627260sRo> implements InterfaceC1627260sRo, InterfaceC1626500sQa, InterfaceC1626510sQb {
    public static final int LLILLL = 8;
    public final InterfaceC1626500sQa LL;
    public final InterfaceC1626510sQb LLILLJJLI;

    @Override // X.InterfaceC1626510sQb
    public C11NZ<AbstractC789580UyC> A0() {
        return this.LLILLJJLI.A0();
    }

    @Override // X.InterfaceC1626510sQb
    public h0<Boolean> A3() {
        return this.LLILLJJLI.A3();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<AbstractC1626950sRJ> C() {
        return this.LLILLJJLI.C();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1650930t3z Cp() {
        return this.LL.Cp();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1623680sM2 Ep() {
        return this.LL.Ep();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1649820t2C Eq() {
        return this.LL.Eq();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC579050MnP Gp() {
        return this.LL.Gp();
    }

    @Override // X.InterfaceC1626500sQa
    public l0 Hq() {
        return this.LL.Hq();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<Boolean> I0() {
        return this.LLILLJJLI.I0();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1448860no4 Ip() {
        return this.LL.Ip();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1625000sOA Iq() {
        return this.LL.Iq();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1646220swO Kp() {
        return this.LL.Kp();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<AbstractC1626710sQv> LJJJJJL() {
        return this.LLILLJJLI.LJJJJJL();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<Boolean> LJJJJZI() {
        return this.LLILLJJLI.LJJJJZI();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<EnumC995040c06> LJJLIIIJ() {
        return this.LLILLJJLI.LJJLIIIJ();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<AbstractC789580UyC> LLILZ() {
        return this.LLILLJJLI.LLILZ();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<AbstractC1626710sQv> LLJILJILJ() {
        return this.LLILLJJLI.LLJILJILJ();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<AbstractC1626790sR3> LLLF() {
        return this.LLILLJJLI.LLLF();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1650620t3U Lp() {
        return this.LL.Lp();
    }

    @Override // X.InterfaceC1626500sQa
    public q Mq() {
        return this.LL.Mq();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1648020szI Op() {
        return this.LL.Op();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<Boolean> P0() {
        return this.LLILLJJLI.P0();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1628180sTI Pp() {
        return this.LL.Pp();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<AbstractC1626950sRJ> W() {
        return this.LLILLJJLI.W();
    }

    @Override // X.InterfaceC1626500sQa
    public long Xp() {
        return this.LL.Xp();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1647520syU aq() {
        return this.LL.aq();
    }

    @Override // X.InterfaceC1626510sQb
    public h0<Boolean> bh() {
        return this.LLILLJJLI.bh();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<Effect> d0() {
        return this.LLILLJJLI.d0();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<Boolean> g1() {
        return this.LLILLJJLI.g1();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1650230t2r getCameraApiComponent() {
        return this.LL.getCameraApiComponent();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1648510t05 getGestureApiComponent() {
        return this.LL.getGestureApiComponent();
    }

    @Override // X.InterfaceC1626500sQa
    public a getPlanCUIApiComponent() {
        return this.LL.getPlanCUIApiComponent();
    }

    @Override // X.InterfaceC1626500sQa
    public ShortVideoContext getShortVideoContext() {
        return this.LL.getShortVideoContext();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1638550sk1 gq() {
        return this.LL.gq();
    }

    @Override // X.InterfaceC1626510sQb
    public InterfaceC332260D0u<Collection<C1007420cK4>> i0() {
        return this.LLILLJJLI.i0();
    }

    @Override // X.InterfaceC1626500sQa
    public e0 iq() {
        return this.LL.iq();
    }

    @Override // X.InterfaceC1626510sQb
    public C05YD<Collection<C1007420cK4>> j0() {
        return this.LLILLJJLI.j0();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1625000sOA nq() {
        return this.LL.nq();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<AbstractC1626790sR3> o1() {
        return this.LLILLJJLI.o1();
    }

    public InterfaceC1627260sRo o2() {
        return this;
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1625220sOW uq() {
        return this.LL.uq();
    }

    public final Boolean w2(MotionEvent motionEvent) {
        return null;
    }

    @Override // X.InterfaceC1626510sQb
    public h0<Boolean> wd() {
        return this.LLILLJJLI.wd();
    }

    @Override // X.InterfaceC1626500sQa
    public q yq() {
        return this.LL.yq();
    }

    private final AbstractC21664519qV X1() {
        final e0 e0VarIq = iq();
        final InterfaceC1648510t05 gestureApiComponent = getGestureApiComponent();
        final q qVarYq = yq();
        final C1627240sRm c1627240sRm = new C1627240sRm(this);
        final C1627250sRn c1627250sRn = new C1627250sRn(this);
        return new AbstractC21664519qV(e0VarIq, gestureApiComponent, qVarYq, c1627240sRm, c1627250sRn) { // from class: X.0sRl
            public final e0 LL;
            public final InterfaceC1648510t05 LLILLJJLI;
            public final q LLILLL;
            public final Function2<MotionEvent, MotionEvent, Boolean> LLILZ;
            public final Function1<MotionEvent, Boolean> LLILZIL;

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                Boolean boolInvoke;
                Function1<MotionEvent, Boolean> function1 = this.LLILZIL;
                if (function1 != null && (boolInvoke = function1.invoke(motionEvent)) != null) {
                    return boolInvoke.booleanValue();
                }
                return this instanceof r1k.a;
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                AbstractC21664519qV abstractC21664519qVZk1;
                AbstractC21664519qV abstractC21664519qVZk12;
                AbstractC21664519qV abstractC21664519qVZk13;
                Effect effectLLILIL;
                if (motionEvent != null && motionEvent2 != null && C1627490sSB.LIZ().supportUpslideOpenPanel) {
                    if (this.LL.isRecording().LIZJ().booleanValue()) {
                        return false;
                    }
                    InterfaceC1648510t05 interfaceC1648510t05 = this.LLILLJJLI;
                    AbstractC21664519qV abstractC21664519qVZk14 = null;
                    if (interfaceC1648510t05 != null) {
                        abstractC21664519qVZk14 = interfaceC1648510t05.zk1(17);
                    }
                    if (abstractC21664519qVZk14 != null && abstractC21664519qVZk14.onFling(motionEvent, motionEvent2, f, f2)) {
                        return true;
                    }
                    InterfaceC1648510t05 interfaceC1648510t052 = this.LLILLJJLI;
                    if (interfaceC1648510t052 != null && (abstractC21664519qVZk13 = interfaceC1648510t052.zk1(1)) != null && abstractC21664519qVZk13.onFling(motionEvent, motionEvent2, f, f2)) {
                        q qVar = this.LLILLL;
                        if (qVar != null && (effectLLILIL = qVar.C0().LLILIL()) != null && (C1624200sMs.LJIIIIZZ(effectLLILIL) || C1624570sNT.LJIIJ(effectLLILIL) || C1624570sNT.LJIIZILJ(effectLLILIL) || C1624610sNX.LIZIZ(effectLLILIL) || C1624570sNT.LJFF(effectLLILIL))) {
                            return true;
                        }
                        this.LLILZ.invoke(motionEvent, motionEvent2);
                        return true;
                    }
                    InterfaceC1648510t05 interfaceC1648510t053 = this.LLILLJJLI;
                    if (interfaceC1648510t053 != null && (abstractC21664519qVZk12 = interfaceC1648510t053.zk1(6)) != null && abstractC21664519qVZk12.onFling(motionEvent, motionEvent2, f, f2)) {
                        return true;
                    }
                    InterfaceC1648510t05 interfaceC1648510t054 = this.LLILLJJLI;
                    if (interfaceC1648510t054 != null && (abstractC21664519qVZk1 = interfaceC1648510t054.zk1(16)) != null && abstractC21664519qVZk1.onFling(motionEvent, motionEvent2, f, f2)) {
                        return true;
                    }
                    return this.LLILZ.invoke(motionEvent, motionEvent2).booleanValue();
                }
                return this instanceof r1k.a;
            }

            {
                this.LL = e0VarIq;
                this.LLILLJJLI = gestureApiComponent;
                this.LLILLL = qVarYq;
                this.LLILZ = c1627240sRm;
                this.LLILZIL = c1627250sRn;
            }
        };
    }

    private final void G2() {
        InterfaceC1648510t05 gestureApiComponent;
        if ((!C539900LFk.LJIIIZ(getShortVideoContext()) || C1627490sSB.LIZ().supportUpslideOpenPanel) && (gestureApiComponent = getGestureApiComponent()) != null) {
            gestureApiComponent.xX0(X1(), 13);
        }
    }

    private final boolean H2() {
        return Intrinsics.LJFF(A3().LIZJ(), Boolean.TRUE);
    }

    private final boolean W1() {
        return !getCameraApiComponent().St2().getIsExposureSeekBarShowing();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        G2();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        o2();
        return this;
    }

    public C1627220sRk(InterfaceC1626500sQa interfaceC1626500sQa, InterfaceC1626510sQb interfaceC1626510sQb) {
        this.LL = interfaceC1626500sQa;
        this.LLILLJJLI = interfaceC1626510sQb;
    }

    public final boolean Z1(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (!W1() || motionEvent2.getY() >= motionEvent.getY() || Math.abs(motionEvent.getY() - motionEvent2.getY()) <= Math.abs(motionEvent.getX() - motionEvent2.getX()) || !H2() || Intrinsics.LJFF(yq().dN1().LJI(), Boolean.TRUE) || !C1627490sSB.LIZ().supportUpslideOpenPanel) {
            return false;
        }
        LLILZ().onNext(new C789550Uy9("carousal_swipe_up", false));
        return true;
    }
}
