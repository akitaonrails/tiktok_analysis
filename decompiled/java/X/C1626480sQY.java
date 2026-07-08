package X;

import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import Y.AfS194S0100000_25;
import Y.AkS486S0100000_25;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.als.h0;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.bytebench.PrefetchStrategy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0;
import com.ss.android.ugc.aweme.sticker.repository.TiktokStickerDataManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.ss.android.ugc.slideslip.model.SlideSlipLoadingController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS5S1202000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lnn.q;

/* JADX INFO: renamed from: X.0sQY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1626480sQY extends AbstractC2255721DQs<InterfaceC1626720sQw> implements InterfaceC1626720sQw, InterfaceC1626500sQa, InterfaceC1626510sQb {
    public static final C1626690sQt LLJJJIL = new Object() { // from class: X.0sQt
    };
    public static final int LLJJJJ = 8;
    public static final C01GW<Bundle> LLJJJJJIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(364));
    public final Scene LL;
    public final InterfaceC1626500sQa LLILLJJLI;
    public final InterfaceC1626510sQb LLILLL;
    public boolean LLJI;
    public int LLJILLL;
    public final boolean LLJJJ;
    public final InterfaceC1626720sQw LLILZ = this;
    public final C11NJ LLILZIL = new C11NJ();
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 731));
    public final C11PQ<InterfaceC1626470sQX> LLIZ = new C11PQ<>();
    public final C11PQ<InterfaceC1626470sQX> LLIZLLLIL = new C11PQ<>();
    public final C11PQ<Boolean> LLJ = new C11PQ<>();
    public final C11PQ<String> LLJIJIL = C11PQ.LJLLLLLL("hot");
    public final CopyOnWriteArrayList<InterfaceC1626470sQX> LLJILJIL = new CopyOnWriteArrayList<>();
    public final C557050Lt1 LLJILJILJ = new C557050Lt1(false);
    public final Map<String, Integer> LLJJ = new LinkedHashMap();
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(366));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 730));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(365));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 733));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 732));

    @Override // X.InterfaceC1626510sQb
    public C11NZ<AbstractC789580UyC> A0() {
        return this.LLILLL.A0();
    }

    @Override // X.InterfaceC1626510sQb
    public h0<Boolean> A3() {
        return this.LLILLL.A3();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<AbstractC1626950sRJ> C() {
        return this.LLILLL.C();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1650930t3z Cp() {
        return this.LLILLJJLI.Cp();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1623680sM2 Ep() {
        return this.LLILLJJLI.Ep();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1649820t2C Eq() {
        return this.LLILLJJLI.Eq();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC579050MnP Gp() {
        return this.LLILLJJLI.Gp();
    }

    @Override // X.InterfaceC1626500sQa
    public l0 Hq() {
        return this.LLILLJJLI.Hq();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<Boolean> I0() {
        return this.LLILLL.I0();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1448860no4 Ip() {
        return this.LLILLJJLI.Ip();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1625000sOA Iq() {
        return this.LLILLJJLI.Iq();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1646220swO Kp() {
        return this.LLILLJJLI.Kp();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<AbstractC1626710sQv> LJJJJJL() {
        return this.LLILLL.LJJJJJL();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<Boolean> LJJJJZI() {
        return this.LLILLL.LJJJJZI();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<EnumC995040c06> LJJLIIIJ() {
        return this.LLILLL.LJJLIIIJ();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<AbstractC789580UyC> LLILZ() {
        return this.LLILLL.LLILZ();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<AbstractC1626710sQv> LLJILJILJ() {
        return this.LLILLL.LLJILJILJ();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<AbstractC1626790sR3> LLLF() {
        return this.LLILLL.LLLF();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1650620t3U Lp() {
        return this.LLILLJJLI.Lp();
    }

    @Override // X.InterfaceC1626500sQa
    public q Mq() {
        return this.LLILLJJLI.Mq();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1648020szI Op() {
        return this.LLILLJJLI.Op();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<Boolean> P0() {
        return this.LLILLL.P0();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1628180sTI Pp() {
        return this.LLILLJJLI.Pp();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<AbstractC1626950sRJ> W() {
        return this.LLILLL.W();
    }

    @Override // X.InterfaceC1626500sQa
    public long Xp() {
        return this.LLILLJJLI.Xp();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1647520syU aq() {
        return this.LLILLJJLI.aq();
    }

    @Override // X.InterfaceC1626510sQb
    public h0<Boolean> bh() {
        return this.LLILLL.bh();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<Effect> d0() {
        return this.LLILLL.d0();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<Boolean> g1() {
        return this.LLILLL.g1();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1650230t2r getCameraApiComponent() {
        return this.LLILLJJLI.getCameraApiComponent();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1648510t05 getGestureApiComponent() {
        return this.LLILLJJLI.getGestureApiComponent();
    }

    @Override // X.InterfaceC1626500sQa
    public a getPlanCUIApiComponent() {
        return this.LLILLJJLI.getPlanCUIApiComponent();
    }

    @Override // X.InterfaceC1626500sQa
    public ShortVideoContext getShortVideoContext() {
        return this.LLILLJJLI.getShortVideoContext();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1638550sk1 gq() {
        return this.LLILLJJLI.gq();
    }

    @Override // X.InterfaceC1626510sQb
    public InterfaceC332260D0u<Collection<C1007420cK4>> i0() {
        return this.LLILLL.i0();
    }

    @Override // X.InterfaceC1626500sQa
    public e0 iq() {
        return this.LLILLJJLI.iq();
    }

    @Override // X.InterfaceC1626510sQb
    public C05YD<Collection<C1007420cK4>> j0() {
        return this.LLILLL.j0();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1625000sOA nq() {
        return this.LLILLJJLI.nq();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<AbstractC1626790sR3> o1() {
        return this.LLILLL.o1();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1625220sOW uq() {
        return this.LLILLJJLI.uq();
    }

    @Override // X.InterfaceC1626510sQb
    public h0<Boolean> wd() {
        return this.LLILLL.wd();
    }

    @Override // X.InterfaceC1626500sQa
    public q yq() {
        return this.LLILLJJLI.yq();
    }

    private final String T2() {
        return (String) this.LLJJI.getValue();
    }

    private final C1880707Yf c3() {
        return (C1880707Yf) this.LLILZLL.getValue();
    }

    private final C1626680sQs i3() {
        return (C1626680sQs) this.LLJJIJIL.getValue();
    }

    public final long H2() {
        return ((Number) this.LLJJIJI.getValue()).longValue();
    }

    public final SlideSlipLoadingController W2() {
        return (SlideSlipLoadingController) this.LLJJIII.getValue();
    }

    public final InterfaceC1625880sPa m3() {
        return (InterfaceC1625880sPa) this.LLJJIJIIJIL.getValue();
    }

    private final void Q3() {
        this.LLILZIL.LIZ(Z1(A0().LJJIL(new InterfaceC19483011Ki() { // from class: X.0sQi
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C0VJ6;
            }
        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0sQm
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return (AbstractC789580UyC) obj;
            }
        }).LJJII(new InterfaceC1627390sS1() { // from class: X.0sQd
            @Override // X.InterfaceC1627390sS1
            public final boolean test(Object obj, Object obj2) {
                C0VJ6 c0vj6 = (C0VJ6) obj2;
                if (Intrinsics.LJFF(C1629110sUn.LIZ(((C0VJ6) obj).LIZ).getEffectId(), C1629110sUn.LIZ(c0vj6.LIZ).getEffectId()) && !(c0vj6.LIZ instanceof C1629810sVv)) {
                    return true;
                }
                return false;
            }
        })).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 95)));
        C11NZ<R> c11nzLJLIIIL = W().LJJIL(new InterfaceC19483011Ki() { // from class: X.0sQO
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C1627010sRP;
            }
        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0sQg
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return ((C1627010sRP) ((AbstractC1626950sRJ) obj)).LIZ;
            }
        }).LJJJLZIJ(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0sSu
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Iterable iterable = (Iterable) obj;
                if (!C097T.LIZ()) {
                    Iterator it2 = C13LP.LL(iterable, 5).iterator();
                    while (it2.hasNext()) {
                        String str = (String) C13LP.LJJJLL(C1629110sUn.LIZ((InterfaceC1626470sQX) it2.next()).getIconUrl().getUrlList());
                        if (str != null && !str.isEmpty() && !C1324750kZt.LJIIZILJ(UriProtector.parse(str))) {
                            C1328130kfL.LJIILIIL().LJIIL().LJIIZILJ(C1325710kbR.LIZIZ(str), null);
                        }
                    }
                }
                return Unit.LIZ;
            }
        }).LJLIIIL(new AkS486S0100000_25(this, 5));
        C11RO c11ro = C11S5.LIZIZ;
        this.LLILZIL.LIZ(c11nzLJLIIIL.LJJJLZIJ(c11ro).LJJLJLI(new AfS194S0100000_25(this, 90)));
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_insert_head_enable_horizontal_carousel", true, false)) {
            this.LLILZIL.LIZ(A0().LJJIL(new InterfaceC19483011Ki() { // from class: X.0sQ9
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    return obj instanceof C789570UyB;
                }
            }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0sQk
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    return (AbstractC789580UyC) obj;
                }
            }).LJJJLZIJ(c11ro).LJJLJLI(new AfS194S0100000_25(this, 93)));
        }
        this.LLILZIL.LIZ(A0().LJJIL(new InterfaceC19483011Ki() { // from class: X.0sQN
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C789550Uy9;
            }
        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0sQl
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return (AbstractC789580UyC) obj;
            }
        }).LJJLJLI(new AfS194S0100000_25(this, 94)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e4() {
        yq().C0().LJII().LJIJJLI().observe(this, new AObserverS227S0100000_25(this, 77));
        yq().jW1().LJII(this, Lifecycle.State.CREATED, new AObjectS246S0100000_25(this, 683));
        this.LLILZIL.LIZ(this.LLIZ.LJJIFFI().LJJLJLI(new AfS194S0100000_25(this, 92)));
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ.LLIILII(), null, new C1626240sQA(this, null), 2);
        yq().C0().LJII().LJIILJJIL().observe(this, new AObserverS227S0100000_25(this, 78));
        yq().Lq0().observe(this, new AObserverS227S0100000_25(this, 80));
        C11ON c11onLJJJJZI = this.LLIZLLLIL.LJJJJZI(new AkS486S0100000_25(this, 9));
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        C1626260sQC c1626260sQC = C1626260sQC.LIZ;
        c13dvLIZIZ.add(c1626260sQC);
        c13dvLIZIZ.add(c3());
        C098D c098dLJJLIL = c11onLJJJJZI.LJJLIL(C13LP.LJJJJLI(C1697820uHc.LIZ(c13dvLIZIZ)));
        C19481711Jv c19481711JvLJIIL = new C11IE(this.LLIZ.LJJIL(new InterfaceC19483011Ki() { // from class: X.0sQD
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C1626190sQ5;
            }
        })).LJIIL(new InterfaceC1487280oo2() { // from class: X.0sQB
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return ((C1626190sQ5) ((InterfaceC1626470sQX) obj)).LIZ;
            }
        }).LJIIIZ(new C1698300uIO(this, 2)).LJIIL(new AkS486S0100000_25(this, 8));
        C11NZ c11nzLJJLIL = (c19481711JvLJIIL instanceof InterfaceC478520Ipe ? ((InterfaceC478520Ipe) c19481711JvLJIIL).LIZJ() : new C19481811Jw(c19481711JvLJIIL)).LJJLIL(new Pair(0, Collections.singletonList(c1626260sQC)));
        m3().LJIIJ(null, true, true, false).observe(this, new AObserverS227S0100000_25(this, 81));
        this.LLILZIL.LIZ(X1(A0().LJJIL(new InterfaceC19483011Ki() { // from class: X.0sQF
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C789600UyE;
            }
        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0sQj
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return (AbstractC789580UyC) obj;
            }
        }), this.LLJIJIL.LJJIFFI(), c11nzLJJLIL, c098dLJJLIL).LJJJLZIJ(C1701940uOG.LIZIZ()).LJLIIIL(new AkS486S0100000_25(this, 6)).LJJII(new InterfaceC1627390sS1() { // from class: X.0sQc
            @Override // X.InterfaceC1627390sS1
            public final boolean test(Object obj, Object obj2) {
                C443120HZe c443120HZe = (C443120HZe) obj;
                C443120HZe c443120HZe2 = (C443120HZe) obj2;
                List list = (List) c443120HZe.getFirst();
                boolean zBooleanValue = ((Boolean) c443120HZe.getThird()).booleanValue();
                List list2 = (List) c443120HZe2.getFirst();
                if (zBooleanValue == ((Boolean) c443120HZe2.getThird()).booleanValue() && list.size() == list2.size()) {
                    ArrayList<Pair> arrayList = (ArrayList) C13LP.LLIILII(list, list2);
                    if (!arrayList.isEmpty()) {
                        for (Pair pair : arrayList) {
                            if (!Intrinsics.LJFF(C1629110sUn.LIZ((InterfaceC1626470sQX) pair.getFirst()).getEffectId(), C1629110sUn.LIZ((InterfaceC1626470sQX) pair.getSecond()).getEffectId())) {
                            }
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            }
        }).LJJLJLI(new AfS194S0100000_25(this, 91)));
        if (C1630720sXO.LJFF) {
            getCameraApiComponent().qF1().observe(this, new AObserverS227S0100000_25(this, 76));
        } else {
            v3();
        }
    }

    private final void o4() {
        e4();
        Q3();
    }

    public final void o2() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZ, null, new C1626300sQG(this, null), 2);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        o4();
        A3().LIZ(this, new AObjectS246S0100000_25(this, 684));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLILZIL.dispose();
    }

    public final void v3() {
        LiveData<C991050btf> liveDataQR1;
        InterfaceC1448860no4 interfaceC1448860no4Ip = Ip();
        if (interfaceC1448860no4Ip == null || (liveDataQR1 = interfaceC1448860no4Ip.QR1()) == null) {
            return;
        }
        liveDataQR1.observe(this, new AObserverS227S0100000_25(this, 79));
    }

    public InterfaceC1626720sQw G2() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    private final C11NZ<C0VJ6> Z1(C11NZ<C0VJ6> c11nz) {
        if (H2() > 0) {
            AkS486S0100000_25 akS486S0100000_25 = new AkS486S0100000_25(this, 7);
            c11nz.getClass();
            return new C11N5(c11nz, akS486S0100000_25);
        }
        return c11nz;
    }

    private final void z4(InterfaceC1625180sOS<?> interfaceC1625180sOS) {
        String effect_id;
        if (interfaceC1625180sOS instanceof C1625440sOs) {
            C1625440sOs c1625440sOs = (C1625440sOs) interfaceC1625180sOS;
            Bundle bundle = c1625440sOs.LJ;
            if (bundle != null) {
                C786410Ut5.LJJJI("carousel_open", "1", bundle);
            }
            Effect effectLLILIL = yq().C0().LLILIL();
            if (effectLLILIL != null) {
                effect_id = effectLLILIL.getEffect_id();
            } else {
                effect_id = null;
            }
            if (Intrinsics.LJFF(effect_id, c1625440sOs.LIZ.getEffect_id())) {
                return;
            }
        }
        C1624010sMZ.LJIIIZ(yq(), interfaceC1625180sOS);
    }

    public final void E3(String str) {
        yq().DA1(false);
        yq().pp2(true, str);
    }

    public final void H3(int i) {
        InterfaceC1626470sQX interfaceC1626470sQX;
        if (((Boolean) PrefetchStrategy.LIZIZ.getValue()).booleanValue() && ((PrefetchStrategy.ShootHCPrefetchConfig) PrefetchStrategy.LIZ.getValue()).enablePrefetch) {
            int i2 = PrefetchStrategy.LIZLLL + i + 1;
            for (int i3 = i - PrefetchStrategy.LIZJ; i3 < i2; i3++) {
                if (i3 != i && (interfaceC1626470sQX = (InterfaceC1626470sQX) C13LP.LJJJLZIJ(i3, this.LLJILJIL)) != null) {
                    LLILZ().onNext(new C789560UyA(interfaceC1626470sQX));
                }
            }
        }
    }

    public final void O3(Effect effect) {
        C1624010sMZ.LIZLLL(yq(), Collections.singletonList(effect), true, false, null, false, null, null, null, 32760);
    }

    private final void F4(Function0<Unit> function0, C1625440sOs c1625440sOs) {
        Ep().Nc1(c1625440sOs, function0, AFwS214S0000000_25.get$arr$(422));
    }

    public final boolean B3(String str, int i) {
        if (!C297970Bm7.LIZ()) {
            return true;
        }
        Integer num = this.LLJJ.get(str);
        if (num == null) {
            this.LLJJ.put(str, Integer.valueOf(i));
            return true;
        }
        if (i > num.intValue()) {
            this.LLJJ.put(str, Integer.valueOf(i));
            return true;
        }
        if (i == 100) {
            this.LLJJ.remove(str);
            return true;
        }
        return false;
    }

    public final void q3(final InterfaceC1626470sQX interfaceC1626470sQX, int i) {
        Effect effectLIZ;
        Iterator<InterfaceC1626470sQX> it2 = this.LLJILJIL.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(C1629110sUn.LIZ(it2.next()).getEffectId(), C1629110sUn.LIZ(interfaceC1626470sQX).getEffectId())) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            final int iIntValue = numValueOf.intValue();
            if (this.LLJILLL != iIntValue) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handlePanelCurrentSelection effect already in list: ");
                sbLIZ.append(C1629110sUn.LIZ(interfaceC1626470sQX).getName());
                sbLIZ.append(" position: ");
                sbLIZ.append(iIntValue);
                sbLIZ.append(" currentPosition: ");
                sbLIZ.append(this.LLJILLL);
                C1628270sTR.LIZIZ("EffectSourceComponent", C2188811AlT.LIZIZ(sbLIZ));
                o1().onNext(new AbstractC1626790sR3(interfaceC1626470sQX, iIntValue) { // from class: X.0sR0
                    public final int LIZJ;
                    public final InterfaceC1626470sQX LIZLLL;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1626760sR0)) {
                            return false;
                        }
                        C1626760sR0 c1626760sR0 = (C1626760sR0) obj;
                        return this.LIZJ == c1626760sR0.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1626760sR0.LIZLLL);
                    }

                    public final int hashCode() {
                        return (this.LIZJ * 31) + this.LIZLLL.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("FromPanel(position=");
                        sbLIZ2.append(this.LIZJ);
                        sbLIZ2.append(", effect=");
                        sbLIZ2.append(this.LIZLLL);
                        sbLIZ2.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ2);
                    }

                    @Override // X.AbstractC1626790sR3
                    public final InterfaceC1626470sQX LIZ() {
                        return this.LIZLLL;
                    }

                    @Override // X.AbstractC1626790sR3
                    public final int LIZIZ() {
                        return this.LIZJ;
                    }

                    {
                        super(iIntValue, interfaceC1626470sQX);
                        this.LIZJ = iIntValue;
                        this.LIZLLL = interfaceC1626470sQX;
                    }
                });
                return;
            }
            return;
        }
        int i3 = i + 1;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handlePanelCurrentSelection effect not in list: ");
        sbLIZ2.append(C1629110sUn.LIZ(interfaceC1626470sQX).getName());
        sbLIZ2.append(" insert at: ");
        sbLIZ2.append(i3);
        C1628270sTR.LIZIZ("EffectSourceComponent", C2188811AlT.LIZIZ(sbLIZ2));
        String parent = C1629110sUn.LIZ(interfaceC1626470sQX).getParent();
        if (parent != null && !a0.LJJJIL(parent)) {
            C1628270sTR.LIZIZ("EffectSourceComponent", "handlePanelCurrentSelection skip child effect");
            return;
        }
        if (i3 > this.LLJILJIL.size()) {
            return;
        }
        this.LLJILJIL.add(i3, interfaceC1626470sQX);
        InterfaceC1626470sQX interfaceC1626470sQX2 = (InterfaceC1626470sQX) C13LP.LJJJLZIJ(1, this.LLJILJIL);
        if (interfaceC1626470sQX2 != null && (effectLIZ = C1629110sUn.LIZ(interfaceC1626470sQX2)) != null) {
            d0().onNext(effectLIZ);
        }
        C().onNext(new C1627010sRP(C13LP.LLIIII(this.LLJILJIL), i3, this.LLJILJILJ.LIZIZ()));
    }

    public final void w2(Effect effect, Function2<? super Integer, ? super InterfaceC1626470sQX, Unit> function2) {
        Iterator<InterfaceC1626470sQX> it2 = this.LLJILJIL.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(C1629110sUn.LIZ(it2.next()).getEffectId(), effect.getEffectId())) {
                if (i >= 0) {
                    function2.invoke(Integer.valueOf(i), this.LLJILJIL.get(i));
                    return;
                }
            } else {
                i++;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Effect not found in the list: ");
        sbLIZ.append(effect.getName());
        C1628270sTR.LIZIZ("EffectSourceComponent", C2188811AlT.LIZIZ(sbLIZ));
        o1().onNext(C1626780sR2.LIZJ);
    }

    public C1626480sQY(Scene scene, InterfaceC1626500sQa interfaceC1626500sQa, InterfaceC1626510sQb interfaceC1626510sQb) {
        this.LL = scene;
        this.LLILLJJLI = interfaceC1626500sQa;
        this.LLILLL = interfaceC1626510sQb;
        this.LLJJJ = C0AUU.LIZLLL() || C0AUU.LIZJ();
    }

    public final void W1(InterfaceC1626470sQX interfaceC1626470sQX, int i, EnumC1641450soh enumC1641450soh) {
        String str;
        TiktokStickerDataManager tiktokStickerDataManager;
        int iIntValue;
        String effectId;
        String str2;
        Effect effectLIZ;
        TiktokStickerDataManager tiktokStickerDataManager2;
        String effect_id = null;
        if (interfaceC1626470sQX instanceof InterfaceC1627120sRa) {
            this.LLJI = true;
            InterfaceC1624480sNK interfaceC1624480sNKC0 = yq().C0();
            if ((interfaceC1624480sNKC0 instanceof TiktokStickerDataManager) && (tiktokStickerDataManager2 = (TiktokStickerDataManager) interfaceC1624480sNKC0) != null) {
                tiktokStickerDataManager2.LLLIIL = null;
            }
            this.LLJILLL = i;
            LLJILJILJ().onNext(new C1626810sR5(i, interfaceC1626470sQX, 0));
            Integer numLJIIIIZZ = C23117093z.LJIIIIZZ(yq().C0());
            if (numLJIIIIZZ != null) {
                iIntValue = numLJIIIIZZ.intValue();
            } else {
                iIntValue = -1;
            }
            InterfaceC1627120sRa interfaceC1627120sRa = (InterfaceC1627120sRa) interfaceC1626470sQX;
            if (interfaceC1627120sRa != null && (effectLIZ = interfaceC1627120sRa.LIZ()) != null) {
                effectId = effectLIZ.getEffectId();
            } else {
                effectId = null;
            }
            Effect effectLLILIL = yq().C0().LLILIL();
            if (effectLLILIL != null) {
                effect_id = effectLLILIL.getEffect_id();
            }
            if (Intrinsics.LJFF(effect_id, effectId)) {
                return;
            }
            int i2 = iIntValue;
            Function0<Unit> awS5S1202000_25 = new AwS5S1202000_25(this, effectId, interfaceC1626470sQX, i2, i, 1);
            Effect effectLIZ2 = ((InterfaceC1627120sRa) interfaceC1626470sQX).LIZ();
            C1626680sQs c1626680sQsI3 = i3();
            Bundle bundle = new Bundle();
            int i3 = C1626550sQf.LIZ[enumC1641450soh.ordinal()];
            if (i3 != 1 && i3 == 2) {
                str2 = "slide";
            } else {
                str2 = "click";
            }
            C786410Ut5.LJJJI("click_method", str2, bundle);
            C786410Ut5.LJJJI("tab_type", "slide_bar", bundle);
            C786410Ut5.LJJJI("bundle_tab_name", "Trending", bundle);
            C786410Ut5.LJJJI("prop_tab_name", "Trending", bundle);
            C786410Ut5.LJJJI("prop_selected_from", "prop_carousel_trending", bundle);
            C786410Ut5.LJJJI("prop_launch_ui_point", "half_width_scroll_carousel", bundle);
            bundle.putBoolean("need_report_prop_click", false);
            C1625440sOs c1625440sOs = new C1625440sOs(effectLIZ2, i, EnumC1448980noG.UI_CLICK, null, bundle, c1626680sQsI3, null, i2, true, new C1625920sPe(false, false), "shoot_horizontal_carousel");
            if (this.LLJJJ) {
                F4(awS5S1202000_25, c1625440sOs);
                return;
            } else {
                awS5S1202000_25.invoke();
                z4(c1625440sOs);
                return;
            }
        }
        if (interfaceC1626470sQX instanceof C1629810sVv) {
            E3("click_more");
            return;
        }
        if (this.LLJILLL != 0) {
            this.LLJILLL = 0;
            InterfaceC1624480sNK interfaceC1624480sNKC02 = yq().C0();
            if ((interfaceC1624480sNKC02 instanceof TiktokStickerDataManager) && (tiktokStickerDataManager = (TiktokStickerDataManager) interfaceC1624480sNKC02) != null) {
                tiktokStickerDataManager.LLLIIL = null;
            }
            LLJILJILJ().onNext(C1626700sQu.LIZ);
            Bundle bundle2 = new Bundle();
            if (enumC1641450soh == EnumC1641450soh.CLICK) {
                str = "carousel_click_cancel";
            } else {
                str = "carousel_empty_prop";
            }
            C786410Ut5.LJJJI("action_type", str, bundle2);
            C786410Ut5.LJJJI("carousel_open", "1", bundle2);
            if (interfaceC1626470sQX instanceof C1626260sQC) {
                C786410Ut5.LJJJI("tab_key", "carousel", bundle2);
                C786410Ut5.LJJJI("tab_name", "carousel", bundle2);
            }
            z4(C1622820sKe.LIZ(null, bundle2, 5));
        }
    }

    private final <T1, T2, T3, T4> C11NZ<C1631600sYo<T1, T2, T3, T4>> X1(C11NZ<T1> c11nz, C11NZ<T2> c11nz2, C11NZ<T3> c11nz3, C11NZ<T4> c11nz4) {
        return C11NZ.LJIIL(c11nz, c11nz2, c11nz3, c11nz4, new InterfaceC941150abB() { // from class: X.0sQe
            @Override // X.InterfaceC941150abB
            public final Object LIZ(Object obj, Object obj2, Object obj3, Object obj4) {
                return new C1631600sYo(obj, obj2, obj3, obj4);
            }
        });
    }
}
