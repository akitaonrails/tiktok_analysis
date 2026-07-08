package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.ab.EcMobSpliceCheckNetworkInterceptConfigV2;
import com.ss.android.ugc.aweme.ecommerce.ab.EcMobSpliceCheckNetworkInterceptSetting;
import com.ss.android.ugc.aweme.ecommerce.arch.CarePageData;
import com.ss.android.ugc.aweme.ecommerce.arch.ECMultiChunkOptConfigModel;
import com.ss.android.ugc.aweme.ecommerce.arch.EComSearchBffResp;
import com.ss.android.ugc.aweme.ecommerce.arch.LogPbBean;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageNilText;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import com.ss.android.ugc.aweme.ecommerce.arch.PendantLayer;
import com.ss.android.ugc.aweme.ecommerce.arch.SearchBffItem;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomApiLifecycleManager;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS150S0101000_10;
import kotlin.jvm.internal.AwS48S0001000_3;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.AwS659S0100000_10;
import kotlin.jvm.internal.AwS93S0210000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC677500Qho extends AbstractC677860QiO {
    public final MixShopSearchBizVM LIZ;
    public final C677400Qhe LIZIZ;
    public final InterfaceC1631620sYq<C1422405hW, C677410Qhf, Integer, Unit> LIZJ;
    public final Function2<C1422405hW, Integer, Unit> LIZLLL;
    public final List<InterfaceC677820QiK> LJ;
    public C676800Qgg LJFF;
    public C08YL LJI;
    public C677790QiH LJII;
    public C677610Qhz LJIIIIZZ;

    public AbstractC677500Qho() {
        throw null;
    }

    public abstract C15O7<C1515820pY4<n>> LJ(List<C080U> list, C675150Qe1 c675150Qe1);

    public abstract Map<String, String> LJIIIIZZ(C675150Qe1 c675150Qe1);

    public abstract Map<String, Object> LJIIIZ(C675150Qe1 c675150Qe1);

    public abstract String LJIIJ();

    public abstract EnumC675160Qe2 LJIIJJI();

    public abstract void LJIIL(n nVar, C1422405hW c1422405hW, C675150Qe1 c675150Qe1, boolean z);

    public abstract n LJIIZILJ(Map map, Map map2);

    public abstract Object LJIJ(Context context, C675270QeD c675270QeD, C677540Qhs c677540Qhs, MixPageViewModel mixPageViewModel, InterfaceC346701Wf<? super AbstractC677910QiT<C1422405hW>> interfaceC346701Wf, InterfaceC1364105Vn<? super C1422405hW> interfaceC1364105Vn);

    public static List LJII(List list) {
        AbstractC677870QiP abstractC677870QiP;
        String str;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            if (2 <= size) {
                size = 2;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC677840QiM abstractC677840QiM = (AbstractC677840QiM) it2.next();
                if (arrayList.size() >= size) {
                    break;
                }
                AbstractC677870QiP abstractC677870QiP2 = abstractC677840QiM.LL;
                if (abstractC677870QiP2 != null && abstractC677870QiP2.LIZ == EnumC677880QiQ.BFF_TECH_TYPE_LYNX.getValue() && (abstractC677870QiP = abstractC677840QiM.LL) != null && (str = abstractC677870QiP.LIZJ) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static void LIZLLL(C1422405hW c1422405hW, MixPageViewModel mixPageViewModel) {
        Integer numValueOf;
        List<? extends AbstractC677840QiM> list = c1422405hW.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (AbstractC677840QiM abstractC677840QiM : list) {
            AbstractC677870QiP abstractC677870QiP = abstractC677840QiM.LL;
            if (abstractC677870QiP == null || (numValueOf = Integer.valueOf(abstractC677870QiP.LIZIZ)) == null || (numValueOf.intValue() != 10 && numValueOf.intValue() != 9 && numValueOf.intValue() != 8 && numValueOf.intValue() != 2 && numValueOf.intValue() != 11 && numValueOf.intValue() != 12 && numValueOf.intValue() != 13 && numValueOf.intValue() != 1003 && numValueOf.intValue() != 35)) {
                arrayList.add(abstractC677840QiM);
            }
        }
        if (arrayList.size() < 8) {
            mixPageViewModel.LLJILJIL.postValue(1);
        }
    }

    public static void LJIILJJIL(MixPageViewModel mixPageViewModel, long j) {
        n nVar = new n();
        nVar.LJJIII(Long.valueOf(j), "duration");
        nVar.LJJIIJ("search_id", "");
        mixPageViewModel.wQ2(nVar, "page_search");
    }

    public final void LJIILIIL(C675270QeD c675270QeD, MixPageViewModel mixPageViewModel) {
        this.LJFF = new C676800Qgg(this.LIZ, c675270QeD, LJIIJJI(), mixPageViewModel);
        this.LJI = new C08YL(LJIIJ(), !(this instanceof C675110Qdx));
        this.LJII = new C677790QiH(this.LIZ);
        ArrayList arrayList = new ArrayList();
        C676800Qgg c676800Qgg = this.LJFF;
        if (c676800Qgg != null) {
            arrayList.add(c676800Qgg);
        }
        C08YL c08yl = this.LJI;
        if (c08yl != null) {
            arrayList.add(c08yl);
        }
        C677790QiH c677790QiH = this.LJII;
        if (c677790QiH != null) {
            arrayList.add(c677790QiH);
        }
        arrayList.addAll(this.LJ);
        this.LJIIIIZZ = new C677610Qhz(arrayList);
    }

    public final void LJI(final C677540Qhs c677540Qhs, final MixPageViewModel mixPageViewModel, final C675270QeD c675270QeD) {
        if (((Boolean) C0AAC.LIZ.getValue()).booleanValue() || this.LJFF == null) {
            LJIILIIL(c675270QeD, mixPageViewModel);
        }
        final C675150Qe1 c675150Qe1 = (C675150Qe1) c675270QeD;
        List<C080U> list = c675150Qe1.LJI;
        MixShopSearchBizVM mixShopSearchBizVM = this.LIZ;
        mixShopSearchBizVM.LLILZ = c675150Qe1;
        mixShopSearchBizVM.LLJILJIL = false;
        mixShopSearchBizVM.LLJLIL = 0;
        mixShopSearchBizVM.LLJLILLLLZIIL = 0;
        mixShopSearchBizVM.LLJLL = -1;
        mixShopSearchBizVM.LLJLLIL = -1;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        C15O7<C1515820pY4<n>> c15o7LJ = LJ(list, c675150Qe1);
        if (c15o7LJ == null) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            AFwS196S0000000_10 aFwS196S0000000_10 = AFwS196S0000000_10.get$arr$(503);
            c2341109Fh.getClass();
            C2341109Fh.LIZLLL(aFwS196S0000000_10);
            new Throwable("Failed to create fetch task");
            mixPageViewModel.xQ2(new C677320QhW(11));
            InterfaceC1631620sYq<C1422405hW, C677410Qhf, Integer, Unit> interfaceC1631620sYq = this.LIZJ;
            if (interfaceC1631620sYq != null) {
                interfaceC1631620sYq.invoke(null, new C677410Qhf(1005, new Throwable("Failed to create fetch task")), Integer.valueOf(c675270QeD.LIZJ));
                return;
            }
            return;
        }
        C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
        AFwS196S0000000_10 aFwS196S0000000_102 = AFwS196S0000000_10.get$arr$(504);
        c2341109Fh2.getClass();
        C2341109Fh.LIZLLL(aFwS196S0000000_102);
        C2341109Fh.LIZIZ(new AwS554S0100000_10(c675150Qe1, 1015));
        C674850QdX c674850QdX = c675150Qe1.LJII;
        if (c674850QdX != null) {
            C2341109Fh.LIZIZ(new AwS554S0100000_10(c674850QdX, 1016));
        }
        c15o7LJ.LJI(new InterfaceC2385309Wh() { // from class: X.0Qht
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C099G c099g;
                C099G c099g2;
                String message;
                C1C7U.LIZ("BaseMixRefreshRepo@8c91.doWorkPrivate$5");
                final C013C c013c = new C013C();
                c013c.element = true;
                C1515820pY4 c1515820pY4 = (C1515820pY4) c15o7.LJIIL();
                if (c1515820pY4 == null) {
                    Throwable th = new Throwable("Response null error");
                    if (c15o7.LJIIJJI() != null && (message = c15o7.LJIIJJI().getMessage()) != null && message.length() > 0) {
                        th = new Throwable(String.valueOf(c15o7.LJIIJJI().getMessage()));
                    }
                    C2341109Fh c2341109Fh3 = C2341109Fh.LIZ;
                    AFwS196S0000000_10 aFwS196S0000000_103 = AFwS196S0000000_10.get$arr$(506);
                    c2341109Fh3.getClass();
                    C2341109Fh.LIZLLL(aFwS196S0000000_103);
                    mixPageViewModel.xQ2(new C677320QhW(11));
                    InterfaceC1631620sYq<C1422405hW, C677410Qhf, Integer, Unit> interfaceC1631620sYq2 = this.LIZJ;
                    if (interfaceC1631620sYq2 != null) {
                        interfaceC1631620sYq2.invoke(null, new C677410Qhf(1002, th), null);
                    }
                } else {
                    C2341109Fh c2341109Fh4 = C2341109Fh.LIZ;
                    AFwS196S0000000_10 aFwS196S0000000_104 = AFwS196S0000000_10.get$arr$(507);
                    c2341109Fh4.getClass();
                    C2341109Fh.LIZIZ(aFwS196S0000000_104);
                    C1422705hZ.LIZ.getClass();
                    if (C1422705hZ.LIZIZ.enable == 1) {
                        AbstractC677500Qho abstractC677500Qho = this;
                        C677540Qhs c677540Qhs2 = c677540Qhs;
                        abstractC677500Qho.getClass();
                        C1422805ha c1422805ha = C1422805ha.LIZ;
                        c1422805ha.getClass();
                        if (!C1422805ha.LJ && ((c099g = C1422805ha.LJFF) == null || !c099g.isActive())) {
                            synchronized (c1422805ha) {
                                try {
                                    if (!C1422805ha.LJ && ((c099g2 = C1422805ha.LJFF) == null || !c099g2.isActive())) {
                                        C1422805ha.LJFF = C23250099c.LIZIZ(C1422805ha.LIZJ, null, null, new C1422505hX(c677540Qhs2, null), 3);
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    throw th2;
                                }
                            }
                        }
                    }
                    final C238400w2 c238400w2 = new C238400w2();
                    final C118300cf c118300cf2 = c118300cf;
                    final C675150Qe1 c675150Qe12 = c675150Qe1;
                    final MixPageViewModel mixPageViewModel2 = mixPageViewModel;
                    final AbstractC677500Qho abstractC677500Qho2 = this;
                    final C675270QeD c675270QeD2 = c675270QeD;
                    final C677540Qhs c677540Qhs3 = c677540Qhs;
                    final long j = jCurrentTimeMillis;
                    c1515820pY4.LIZLLL(new C0POE<n>() { // from class: X.0Qhr
                        public n LIZ;

                        @Override // X.C0POE
                        public final void onComplete() {
                            Object c098200Yq;
                            EcMobSpliceCheckNetworkInterceptConfigV2.InterceptConfig interceptConfigLIZ;
                            n nVar;
                            C677830QiL c677830QiL = mixPageViewModel2.getState().LL;
                            C1396605dM c1396605dM = mixPageViewModel2.LLILZ;
                            if (c1396605dM == null) {
                                c1396605dM = null;
                            }
                            boolean z = !c1396605dM.LIZLLL.LIZIZ.isEmpty();
                            C2341109Fh c2341109Fh5 = C2341109Fh.LIZ;
                            AwS93S0210000_10 awS93S0210000_10 = new AwS93S0210000_10(c118300cf2, c677830QiL, z, 1);
                            c2341109Fh5.getClass();
                            C2341109Fh.LIZIZ(awS93S0210000_10);
                            mixPageViewModel2.LLJILJIL.postValue(1);
                            try {
                                c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_mix_disable_uistate_fallback", true, false));
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                c098200Yq = new C098200Yq(th3);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = null;
                            }
                            Boolean bool = (Boolean) c098200Yq;
                            if (bool == null || !bool.booleanValue()) {
                                AbstractC677500Qho abstractC677500Qho3 = abstractC677500Qho2;
                                MixPageViewModel mixPageViewModel3 = mixPageViewModel2;
                                int i = c118300cf2.element;
                                abstractC677500Qho3.getClass();
                                C677830QiL c677830QiL2 = mixPageViewModel3.getState().LL;
                                if (c677830QiL2 instanceof C678010Qid) {
                                    C2341109Fh c2341109Fh6 = C2341109Fh.LIZ;
                                    AFwS196S0000000_10 aFwS196S0000000_105 = AFwS196S0000000_10.get$arr$(496);
                                    c2341109Fh6.getClass();
                                    C2341109Fh.LIZIZ(aFwS196S0000000_105);
                                } else if (c677830QiL2 instanceof C677980Qia) {
                                    C2341109Fh c2341109Fh7 = C2341109Fh.LIZ;
                                    AFwS196S0000000_10 aFwS196S0000000_106 = AFwS196S0000000_10.get$arr$(497);
                                    c2341109Fh7.getClass();
                                    C2341109Fh.LIZIZ(aFwS196S0000000_106);
                                } else if (c677830QiL2 instanceof C677320QhW) {
                                    C2341109Fh c2341109Fh8 = C2341109Fh.LIZ;
                                    AFwS196S0000000_10 aFwS196S0000000_107 = AFwS196S0000000_10.get$arr$(498);
                                    c2341109Fh8.getClass();
                                    C2341109Fh.LIZIZ(aFwS196S0000000_107);
                                } else if (c677830QiL2 instanceof C677300QhU) {
                                    C2341109Fh c2341109Fh9 = C2341109Fh.LIZ;
                                    AFwS196S0000000_10 aFwS196S0000000_108 = AFwS196S0000000_10.get$arr$(499);
                                    c2341109Fh9.getClass();
                                    C2341109Fh.LIZIZ(aFwS196S0000000_108);
                                } else if (c677830QiL2 instanceof C677310QhV) {
                                    C2341109Fh c2341109Fh10 = C2341109Fh.LIZ;
                                    AFwS196S0000000_10 aFwS196S0000000_109 = AFwS196S0000000_10.get$arr$(500);
                                    c2341109Fh10.getClass();
                                    C2341109Fh.LIZIZ(aFwS196S0000000_109);
                                } else if (c677830QiL2 instanceof C677900QiS) {
                                    C2341109Fh c2341109Fh11 = C2341109Fh.LIZ;
                                    AFwS196S0000000_10 aFwS196S0000000_1010 = AFwS196S0000000_10.get$arr$(501);
                                    c2341109Fh11.getClass();
                                    C2341109Fh.LIZIZ(aFwS196S0000000_1010);
                                } else if ((c677830QiL2 instanceof C677340QhY) || (c677830QiL2 instanceof C678000Qic) || (c677830QiL2 instanceof C677350QhZ)) {
                                    if (i < 0) {
                                        C2341109Fh c2341109Fh12 = C2341109Fh.LIZ;
                                        C020B c020b = new C020B(i, 10);
                                        c2341109Fh12.getClass();
                                        C2341109Fh.LJIIIIZZ(c020b);
                                        mixPageViewModel3.xQ2(new C677320QhW(12));
                                    } else if (c677830QiL2 instanceof C678000Qic) {
                                        C2341109Fh c2341109Fh13 = C2341109Fh.LIZ;
                                        AwS48S0001000_3 awS48S0001000_3 = new AwS48S0001000_3(i, 4);
                                        c2341109Fh13.getClass();
                                        C2341109Fh.LJIIIIZZ(awS48S0001000_3);
                                        mixPageViewModel3.xQ2(C678010Qid.LIZ);
                                    } else {
                                        C2341109Fh c2341109Fh14 = C2341109Fh.LIZ;
                                        AwS150S0101000_10 awS150S0101000_10 = new AwS150S0101000_10(c677830QiL2, i, 8);
                                        c2341109Fh14.getClass();
                                        C2341109Fh.LJIIIIZZ(awS150S0101000_10);
                                        mixPageViewModel3.xQ2(C678010Qid.LIZ);
                                    }
                                } else if (i >= 0) {
                                    C2341109Fh c2341109Fh15 = C2341109Fh.LIZ;
                                    AwS150S0101000_10 awS150S0101000_102 = new AwS150S0101000_10(c677830QiL2, i, 7);
                                    c2341109Fh15.getClass();
                                    C2341109Fh.LJIIIIZZ(awS150S0101000_102);
                                    mixPageViewModel3.xQ2(C678010Qid.LIZ);
                                } else {
                                    C2341109Fh c2341109Fh16 = C2341109Fh.LIZ;
                                    AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(c677830QiL2, 1014);
                                    c2341109Fh16.getClass();
                                    C2341109Fh.LJIIIIZZ(awS554S0100000_10);
                                }
                            } else {
                                C2341109Fh c2341109Fh17 = C2341109Fh.LIZ;
                                AFwS196S0000000_10 aFwS196S0000000_1011 = AFwS196S0000000_10.get$arr$(508);
                                c2341109Fh17.getClass();
                                C2341109Fh.LIZIZ(aFwS196S0000000_1011);
                            }
                            abstractC677500Qho2.LJIILL(mixPageViewModel2, null, c238400w2.element);
                            C677610Qhz c677610Qhz = abstractC677500Qho2.LJIIIIZZ;
                            if (c677610Qhz != null) {
                                c677610Qhz.LJ(c118300cf2.element, this.LIZ);
                            }
                            EcMobSpliceCheckNetworkInterceptSetting.LIZ.getClass();
                            if (!((Boolean) C0BP5.LIZ.getValue()).booleanValue() || !((EcMobSpliceCheckNetworkInterceptSetting.InterceptSetting) EcMobSpliceCheckNetworkInterceptSetting.LIZJ.getValue()).enable || (interceptConfigLIZ = EcMobSpliceCheckNetworkInterceptConfigV2.LIZ(abstractC677500Qho2.LJIIJ())) == null || (nVar = this.LIZ) == null) {
                                return;
                            }
                            C080S.LIZ(interceptConfigLIZ, null, nVar);
                        }

                        @Override // X.C0POE
                        public final void onFailed(Throwable th3) {
                            C2341109Fh c2341109Fh5 = C2341109Fh.LIZ;
                            AFwS196S0000000_10 aFwS196S0000000_105 = AFwS196S0000000_10.get$arr$(509);
                            c2341109Fh5.getClass();
                            C2341109Fh.LIZLLL(aFwS196S0000000_105);
                            mixPageViewModel2.xQ2(new C677320QhW(11));
                            C2341109Fh.LIZLLL(new AwS554S0100000_10(th3, 1017));
                            C677610Qhz c677610Qhz = abstractC677500Qho2.LJIIIIZZ;
                            if (c677610Qhz != null) {
                                c677610Qhz.onFailed(th3);
                            }
                            InterfaceC1631620sYq<C1422405hW, C677410Qhf, Integer, Unit> interfaceC1631620sYq3 = abstractC677500Qho2.LIZJ;
                            if (interfaceC1631620sYq3 != null) {
                                if (th3 == null) {
                                    th3 = new Throwable("receive chunk error");
                                }
                                interfaceC1631620sYq3.invoke(null, new C677410Qhf(1004, th3), null);
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r14v0 */
                        /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r14v3 */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // X.C0POE
                        public final void onNext(n nVar) throws Throwable {
                            boolean z;
                            C677410Qhf c677410Qhf;
                            ?? r14;
                            boolean z2;
                            Integer num;
                            PendantLayer pendantLayer;
                            SearchBffItem searchBffItem;
                            n nVar2;
                            CarePageData carePageData;
                            n nVar3;
                            MixPageNilText mixPageNilText;
                            n nVar4;
                            Integer numValueOf;
                            InterfaceC1631620sYq<C1422405hW, C677410Qhf, Integer, Unit> interfaceC1631620sYq3;
                            n nVar5 = nVar;
                            C2341109Fh c2341109Fh5 = C2341109Fh.LIZ;
                            C5182020e c5182020e = new C5182020e(c118300cf2, 289);
                            c2341109Fh5.getClass();
                            C2341109Fh.LIZIZ(c5182020e);
                            this.LIZ = nVar5;
                            if (nVar5 == null) {
                                C2341109Fh.LJIIIIZZ(AFwS196S0000000_10.get$arr$(510));
                                return;
                            }
                            C675150Qe1 c675150Qe13 = c675150Qe12;
                            MixPageViewModel mixPageViewModel3 = mixPageViewModel2;
                            AbstractC677500Qho abstractC677500Qho3 = abstractC677500Qho2;
                            C675270QeD c675270QeD3 = c675270QeD2;
                            C118300cf c118300cf3 = c118300cf2;
                            C677540Qhs c677540Qhs4 = c677540Qhs3;
                            C013C c013c2 = c013c;
                            long j2 = j;
                            C238400w2 c238400w22 = c238400w2;
                            if (c675150Qe13.LJIIIIZZ.length() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            String strLJIL = null;
                            if (z && !Intrinsics.LJFF(c675150Qe13.LJIIIIZZ, mixPageViewModel3.LL)) {
                                C2341109Fh.LIZ("BaseMixRefreshRepo: pageSourceChanged: doWorkPrivate");
                                if (!C132600ey.LIZ() || (interfaceC1631620sYq3 = abstractC677500Qho3.LIZJ) == null) {
                                    return;
                                }
                                interfaceC1631620sYq3.invoke(null, new C677410Qhf(1006, new Throwable("page source changed")), Integer.valueOf(c675270QeD3.LIZJ));
                                return;
                            }
                            c118300cf3.element++;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            try {
                                k kVarLJJIIZ = nVar5.LJJIIZ("chunk_meta").LJIILIIL().LJJIIZ("chunk_name");
                                if (kVarLJJIIZ != null) {
                                    strLJIL = kVarLJJIIZ.LJIL();
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C2341109Fh c2341109Fh6 = C2341109Fh.LIZ;
                                AFwS196S0000000_10 aFwS196S0000000_105 = AFwS196S0000000_10.get$arr$(521);
                                c2341109Fh6.getClass();
                                C2341109Fh.LIZIZ(aFwS196S0000000_105);
                            }
                            if (Intrinsics.LJFF(strLJIL, "chunk_product_1_pre_images")) {
                                C08YL c08yl = abstractC677500Qho3.LJI;
                                if (c08yl == null) {
                                    return;
                                }
                                Integer num2 = ((C675150Qe1) c675270QeD3).LJFF.rootEnterFromType;
                                String str = c675150Qe13.LJFF.keyword;
                                if (C678580QjY.LIZIZ.length == 0) {
                                    return;
                                }
                                EcomApiLifecycleManager ecomApiLifecycleManager = EcomApiLifecycleManager.LIZ;
                                C1DFB c1dfb = C0PEM.LIZJ;
                                C08WG c08wg = new C08WG(nVar5, c08yl, "chunk_product_1_pre_images", num2, str, null);
                                ecomApiLifecycleManager.getClass();
                                EcomApiLifecycleManager.LJIIL(str, c1dfb, c08wg);
                                return;
                            }
                            C1422705hZ.LIZ.getClass();
                            ECMultiChunkOptConfigModel eCMultiChunkOptConfigModel = C1422705hZ.LIZIZ;
                            if (eCMultiChunkOptConfigModel.enable == 1 && Intrinsics.LJFF(strLJIL, "chunk_filter")) {
                                abstractC677500Qho3.getClass();
                                C1422805ha c1422805ha2 = C1422805ha.LIZ;
                                C985103tB c985103tB = new C985103tB(abstractC677500Qho3);
                                c1422805ha2.getClass();
                                C23250099c.LIZLLL(C1422805ha.LIZJ, null, null, new C1422605hY(c985103tB, nVar5, c677540Qhs4, null), 3);
                            }
                            abstractC677500Qho3.LIZ.xQ2(nVar5);
                            C677610Qhz c677610Qhz = abstractC677500Qho3.LJIIIIZZ;
                            if (c677610Qhz != null) {
                                c677610Qhz.LIZ(c118300cf3.element, nVar5, c013c2.element);
                            }
                            try {
                                C1422405hW c1422405hWLIZIZ = c677540Qhs4.LIZIZ(nVar5, c675270QeD3);
                                if (eCMultiChunkOptConfigModel.enable == 1 && c013c2.element && Intrinsics.LJFF(strLJIL, "chunk_product_1")) {
                                    c677410Qhf = null;
                                    c1422405hWLIZIZ = (C1422405hW) C23250099c.LJ(C23271099x.INSTANCE, new C1422305hV(abstractC677500Qho3, c677540Qhs4, c1422405hWLIZIZ, null));
                                } else {
                                    c677410Qhf = null;
                                }
                                C677610Qhz c677610Qhz2 = abstractC677500Qho3.LJIIIIZZ;
                                if (c677610Qhz2 != null) {
                                    c677610Qhz2.LIZIZ(nVar5, c1422405hWLIZIZ, c118300cf3.element, c013c2.element);
                                }
                                C677610Qhz c677610Qhz3 = abstractC677500Qho3.LJIIIIZZ;
                                if (c677610Qhz3 != null) {
                                    r14 = 0;
                                    c677610Qhz3.LIZJ(nVar5, c1422405hWLIZIZ, c118300cf3.element, c013c2.element, jCurrentTimeMillis2, j2);
                                } else {
                                    r14 = 0;
                                }
                                InterfaceC1631620sYq<C1422405hW, C677410Qhf, Integer, Unit> interfaceC1631620sYq4 = abstractC677500Qho3.LIZJ;
                                if (interfaceC1631620sYq4 != null) {
                                    C675270QeD c675270QeD4 = c1422405hWLIZIZ.LJI;
                                    if (c675270QeD4 != null) {
                                        numValueOf = Integer.valueOf(c675270QeD4.LIZJ);
                                    } else {
                                        numValueOf = c677410Qhf;
                                    }
                                    interfaceC1631620sYq4.invoke(c1422405hWLIZIZ, c677410Qhf, numValueOf);
                                }
                                C678510QjR c678510QjR = abstractC677500Qho3.LIZ.LLJL;
                                if (c678510QjR != null) {
                                    c678510QjR.LIZJ(c1422405hWLIZIZ.LIZIZ);
                                }
                                if (c013c2.element) {
                                    c238400w22.element = jCurrentTimeMillis2 - j2;
                                    z2 = true;
                                    abstractC677500Qho3.LIZ.LLJLIL = 1;
                                    Function2<C1422405hW, Integer, Unit> function2 = abstractC677500Qho3.LIZLLL;
                                    if (function2 != null) {
                                        function2.invoke(c1422405hWLIZIZ, Integer.valueOf((int) r14));
                                    }
                                } else {
                                    z2 = true;
                                }
                                MixShopSearchBizVM mixShopSearchBizVM2 = abstractC677500Qho3.LIZ;
                                mixShopSearchBizVM2.LLJIJIL = z2;
                                LogPbBean logPbBean = c1422405hWLIZIZ.LJII;
                                if (logPbBean != null) {
                                    mixShopSearchBizVM2.LLIZ.postValue(logPbBean);
                                    abstractC677500Qho3.LIZ.LLJ.postValue(logPbBean);
                                    n nVar6 = new n();
                                    nVar6.LJJIFFI("log_pb", logPbBean.toJsonObject());
                                    Boolean bool = Boolean.TRUE;
                                    nVar6.LJJII(bool, "isFirstRequest");
                                    nVar6.LJJII(bool, "isFirstEnterPageSearch");
                                    mixPageViewModel3.wQ2(nVar6, "page_data");
                                }
                                EComSearchBffResp eComSearchBffResp = c1422405hWLIZIZ.LIZ;
                                if (eComSearchBffResp != null && (nVar4 = eComSearchBffResp.globalDoodleConfig) != null) {
                                    abstractC677500Qho3.LIZ.LLIZLLLIL.postValue(nVar4);
                                    abstractC677500Qho3.LIZ.LLJI.postValue(nVar4);
                                    mixPageViewModel3.wQ2(nVar4, "global_doodle_config");
                                }
                                abstractC677500Qho3.LJIIL(nVar5, c1422405hWLIZIZ, (C675150Qe1) c675270QeD3, c013c2.element);
                                EComSearchBffResp eComSearchBffResp2 = c1422405hWLIZIZ.LIZ;
                                if (eComSearchBffResp2 != null) {
                                    num = eComSearchBffResp2.pageState;
                                } else {
                                    num = c677410Qhf;
                                }
                                int value = EnumC677810QiJ.PAGE_STATE_NO_RESULT.getValue();
                                if (num != 0 && num.intValue() == value) {
                                    mixPageViewModel3.xQ2(C677980Qia.LIZ);
                                    AbstractC677500Qho.LJIILJJIL(mixPageViewModel3, c238400w22.element);
                                    return;
                                }
                                int value2 = EnumC677810QiJ.PAGE_STATE_PROHIBIT.getValue();
                                if (num != 0 && num.intValue() == value2) {
                                    EComSearchBffResp eComSearchBffResp3 = c1422405hWLIZIZ.LIZ;
                                    if (eComSearchBffResp3 != null) {
                                        MixPageNilText mixPageNilText2 = eComSearchBffResp3.searchNilText;
                                        nVar3 = eComSearchBffResp3.globalDoodleConfig;
                                        mixPageNilText = mixPageNilText2;
                                    } else {
                                        nVar3 = c677410Qhf;
                                        mixPageNilText = c677410Qhf;
                                    }
                                    mixPageViewModel3.xQ2(new C677310QhV(mixPageNilText, nVar3));
                                    AbstractC677500Qho.LJIILJJIL(mixPageViewModel3, c238400w22.element);
                                    return;
                                }
                                int value3 = EnumC677810QiJ.PAGE_STATE_CARE.getValue();
                                if (num != 0 && num.intValue() == value3) {
                                    EComSearchBffResp eComSearchBffResp4 = c1422405hWLIZIZ.LIZ;
                                    if (eComSearchBffResp4 != null) {
                                        CarePageData carePageData2 = eComSearchBffResp4.carePageData;
                                        nVar2 = eComSearchBffResp4.globalDoodleConfig;
                                        carePageData = carePageData2;
                                    } else {
                                        nVar2 = c677410Qhf;
                                        carePageData = c677410Qhf;
                                    }
                                    mixPageViewModel3.xQ2(new C677900QiS(carePageData, nVar2));
                                    AbstractC677500Qho.LJIILJJIL(mixPageViewModel3, c238400w22.element);
                                    return;
                                }
                                EComSearchBffResp eComSearchBffResp5 = c1422405hWLIZIZ.LIZ;
                                if (eComSearchBffResp5 != null && (pendantLayer = eComSearchBffResp5.pendantLayer) != null && (searchBffItem = pendantLayer.popup) != null) {
                                    mixPageViewModel3.wQ2(searchBffItem, "pop_up");
                                }
                                if (!c013c2.element) {
                                    C23250099c.LJ(C23271099x.INSTANCE, new C677520Qhq(abstractC677500Qho3, nVar5, c1422405hWLIZIZ, strLJIL, c675150Qe13, mixPageViewModel3, c118300cf3, jCurrentTimeMillis2, j2, null));
                                    return;
                                }
                                c013c2.element = r14;
                                if (!c1422405hWLIZIZ.LIZJ.isEmpty() && !c1422405hWLIZIZ.LIZIZ.isEmpty()) {
                                    Integer num3 = c675150Qe13.LJFF.rootEnterFromType;
                                    C08YL c08yl2 = abstractC677500Qho3.LJI;
                                    if (c08yl2 != null) {
                                        C675270QeD c675270QeD5 = c1422405hWLIZIZ.LJI;
                                        String str2 = c677410Qhf;
                                        if (c675270QeD5 instanceof C675150Qe1) {
                                            C675150Qe1 c675150Qe14 = (C675150Qe1) c675270QeD5;
                                            str2 = c677410Qhf;
                                            if (c675150Qe14 != null) {
                                                C674800QdS c674800QdS = c675150Qe14.LJFF;
                                                str2 = c677410Qhf;
                                                if (c674800QdS != null) {
                                                    str2 = c674800QdS.keyword;
                                                }
                                            }
                                        }
                                        if (C678580QjY.LIZIZ.length != 0 && C07P7.LIZ(c1422405hWLIZIZ)) {
                                            EcomApiLifecycleManager ecomApiLifecycleManager2 = EcomApiLifecycleManager.LIZ;
                                            C1DFB c1dfb2 = C0PEM.LIZJ;
                                            C08WE c08we = new C08WE(nVar5, c08yl2, strLJIL, num3, str2, null);
                                            ecomApiLifecycleManager2.getClass();
                                            EcomApiLifecycleManager.LJIIL(str2, c1dfb2, c08we);
                                        }
                                        if (c08yl2.LIZIZ) {
                                            EcomApiLifecycleManager ecomApiLifecycleManager3 = EcomApiLifecycleManager.LIZ;
                                            C1DFB c1dfb3 = C0PEM.LIZJ;
                                            C08WH c08wh = new C08WH(nVar5, c08yl2, str2, null);
                                            ecomApiLifecycleManager3.getClass();
                                            EcomApiLifecycleManager.LJIIL(str2, c1dfb3, c08wh);
                                        }
                                    }
                                    C23250099c.LJ(C23271099x.INSTANCE, new C677580Qhw(c1422405hWLIZIZ, mixPageViewModel3, c118300cf3, abstractC677500Qho3, jCurrentTimeMillis2, j2, null));
                                    return;
                                }
                                mixPageViewModel3.xQ2(C677980Qia.LIZ);
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                C2341109Fh c2341109Fh7 = C2341109Fh.LIZ;
                                C5182020e c5182020e2 = new C5182020e(e2, 290);
                                c2341109Fh7.getClass();
                                C2341109Fh.LIZLLL(c5182020e2);
                                mixPageViewModel3.xQ2(new C677320QhW(11));
                                InterfaceC1631620sYq<C1422405hW, C677410Qhf, Integer, Unit> interfaceC1631620sYq5 = abstractC677500Qho3.LIZJ;
                                if (interfaceC1631620sYq5 == null) {
                                    return;
                                }
                                interfaceC1631620sYq5.invoke(null, new C677410Qhf(1005, e2), Integer.valueOf(c675270QeD3.LIZJ));
                            }
                        }
                    });
                    C2341109Fh.LIZIZ(AFwS196S0000000_10.get$arr$(495));
                }
                C1C7U.LIZIZ("BaseMixRefreshRepo@8c91.doWorkPrivate$5");
                return c15o7;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel r10, X.C1422405hW r11, long r12) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC677500Qho.LJIILL(com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel, X.05hW, long):void");
    }

    public AbstractC677500Qho(MixShopSearchBizVM mixShopSearchBizVM, C677400Qhe c677400Qhe, AwS659S0100000_10 awS659S0100000_10, AwS624S0100000_10 awS624S0100000_10) {
        C13BV c13bv = C13BV.INSTANCE;
        this.LIZ = mixShopSearchBizVM;
        this.LIZIZ = c677400Qhe;
        this.LIZJ = awS659S0100000_10;
        this.LIZLLL = awS624S0100000_10;
        this.LJ = c13bv;
    }

    @Override // X.AbstractC677860QiO
    public final C095D LIZIZ(Context context, C677540Qhs c677540Qhs, MixPageViewModel mixPageViewModel, C675270QeD c675270QeD) {
        return new C095D(new C675910QfF(context, c677540Qhs, mixPageViewModel, c675270QeD, this, null));
    }

    @Override // X.AbstractC677860QiO
    public final void LIZJ(Context context, C677540Qhs c677540Qhs, MixPageViewModel mixPageViewModel, C675150Qe1 c675150Qe1) {
        LJI(c677540Qhs, mixPageViewModel, c675150Qe1);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0293 A[Catch: Exception -> 0x029b, TRY_LEAVE, TryCatch #2 {Exception -> 0x029b, blocks: (B:85:0x01ff, B:87:0x0207, B:89:0x0213, B:91:0x0217, B:93:0x021d, B:95:0x0229, B:97:0x022d, B:118:0x0293, B:99:0x023d, B:101:0x0243, B:103:0x024f, B:105:0x0253, B:107:0x0263, B:115:0x0288, B:109:0x0269, B:111:0x0275, B:113:0x0279), top: B:341:0x01ff, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x01ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x052d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:377:? A[LOOP:4: B:243:0x0504->B:377:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(X.C675270QeD r18, X.C677540Qhs r19, com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel r20, X.InterfaceC1364105Vn<? super X.C1422405hW> r21) {
        /*
            Method dump skipped, instruction units count: 1630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC677500Qho.LJIILLIIL(X.0QeD, X.0Qhs, com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C675270QeD r8, X.C677540Qhs r9, com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel r10, X.InterfaceC346701Wf<? super X.AbstractC677910QiT<X.C1422405hW>> r11, X.InterfaceC1364105Vn<? super X.C1422405hW> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof X.C677690Qi7
            if (r0 == 0) goto L2d
            r4 = r12
            X.0Qi7 r4 = (X.C677690Qi7) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILZ
            r5 = 3
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L33
            if (r2 == r0) goto L41
            if (r2 == r1) goto L7c
            if (r2 == r5) goto L7c
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.0Qi7 r4 = new X.0Qi7
            r4.<init>(r7, r12)
            goto L12
        L33:
            X.C155000ia.LIZIZ(r6)
            r4.LL = r11
            r4.LLILZ = r0
            java.lang.Object r6 = r7.LJIILLIIL(r8, r9, r10, r4)
            if (r6 != r3) goto L48
            return r3
        L41:
            java.lang.Object r11 = r4.LL
            X.01Wf r11 = (X.InterfaceC346701Wf) r11
            X.C155000ia.LIZIZ(r6)
        L48:
            r2 = r6
            X.05hW r2 = (X.C1422405hW) r2
            if (r2 == 0) goto L67
            java.util.List<? extends X.0QiM> r0 = r2.LIZIZ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L67
            X.0QiE r0 = new X.0QiE
            r0.<init>(r2)
            r4.LL = r2
            r4.LLILZ = r1
            java.lang.Object r0 = r11.emit(r0, r4)
            if (r0 != r3) goto L81
            return r3
        L67:
            X.0QiF r1 = new X.0QiF
            X.0Qgd r0 = new X.0Qgd
            r0.<init>()
            r1.<init>(r0)
            r4.LL = r2
            r4.LLILZ = r5
            java.lang.Object r0 = r11.emit(r1, r4)
            if (r0 != r3) goto L81
            return r3
        L7c:
            java.lang.Object r2 = r4.LL
            X.C155000ia.LIZIZ(r6)
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC677500Qho.LJFF(X.0QeD, X.0Qhs, com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel, X.01Wf, X.05Vn):java.lang.Object");
    }
}
