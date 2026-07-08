package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0sR8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1626840sR8 extends AbstractC2255721DQs<InterfaceC1626890sRD> implements InterfaceC1626890sRD, InterfaceC379610EuV, InterfaceC1626500sQa, InterfaceC1626510sQb {
    public static final C1626850sR9 LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final InterfaceC1626500sQa LL;
    public final InterfaceC1626510sQb LLILLJJLI;
    public final C1DRG LLILLL;
    public final InterfaceC1626890sRD LLILZ = this;
    public final String LLILZIL;
    public boolean LLILZLL;
    public final List<String> LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0sR9] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1626840sR8.class, "mobApi", "getMobApi()Lcom/ss/android/ugc/slideslip/SlideSlipMobApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJ = new Object() { // from class: X.0sR9
        };
        LLJIJIL = 8;
    }

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

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1625220sOW uq() {
        return this.LL.uq();
    }

    @Override // X.InterfaceC1626510sQb
    public h0<Boolean> wd() {
        return this.LLILLJJLI.wd();
    }

    @Override // X.InterfaceC1626500sQa
    public q yq() {
        return this.LL.yq();
    }

    public final InterfaceC1626880sRC Z1() {
        return (InterfaceC1626880sRC) this.LLIZLLLIL.getValue(this, LLJI[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C1626860sRA c1626860sRA = new C1626860sRA(this, null);
        C23250099c.LIZJ(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZ, C099V.DEFAULT, c1626860sRA);
    }

    public InterfaceC1626890sRD X1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public final boolean W1(String str) {
        if (this.LLILZLL && Intrinsics.LJFF(str, this.LLILZIL)) {
            this.LLILZLL = false;
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1626890sRD
    public void fd1(Collection<? extends InterfaceC1626470sQX> collection, Iterable<Integer> iterable) {
        C1007410cK3 c1007410cK3 = new C1007410cK3(C13LP.LLIIII(collection), this, iterable, null);
        C23250099c.LIZJ(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZ, C099V.DEFAULT, c1007410cK3);
    }

    public C1626840sR8(InterfaceC1626500sQa interfaceC1626500sQa, InterfaceC1626510sQb interfaceC1626510sQb, C1DRG c1drg) {
        boolean z;
        this.LL = interfaceC1626500sQa;
        this.LLILLJJLI = interfaceC1626510sQb;
        this.LLILLL = c1drg;
        String str = getShortVideoContext().creativeModel.feedPropPinModel.effectId;
        this.LLILZIL = str;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZLL = z;
        this.LLIZ = new ArrayList();
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1626880sRC.class, null);
    }
}
