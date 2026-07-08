package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS137S0110000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262980iyG implements InterfaceC1904060zeG, InterfaceC724530SbT {
    public static final C1262840iy2 LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final C1262300ixA LL;
    public final String LLILLJJLI;
    public final C1263000iyI LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final AssemVMLazy LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public InterfaceC1263010iyJ LLJI;
    public final C01GW<C15EB> LLJIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0iy2] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1262980iyG.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/relation/usercard/vm/UserCardListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJIL = new Object() { // from class: X.0iy2
        };
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final UserCardListViewModel LIZ() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (UserCardListViewModel) assemVMLazy.getValue();
    }

    public final void LIZIZ() {
        UserCardListViewModel userCardListViewModelLIZ = LIZ();
        InterfaceC1263010iyJ interfaceC1263010iyJ = this.LLJI;
        if (interfaceC1263010iyJ == null) {
            interfaceC1263010iyJ = null;
        }
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJJZZI = interfaceC1263010iyJ.LJJZZI();
        userCardListViewModelLIZ.setListState(c20600815jKLJJZZI);
        C323720CmY<C1263190iyb> c323720CmY = userCardListViewModelLIZ.LLILLL;
        if (c323720CmY != null) {
            c323720CmY.LLILZLL = c20600815jKLJJZZI;
        }
        AssemViewModel.asyncSubscribe$default(LIZ(), new C2217381BqS() { // from class: X.0iyK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1263140iyW c1263140iyW = (C1263140iyW) obj;
                c1263140iyW.getClass();
                return C627260Oiy.LIZLLL(c1263140iyW);
            }
        }, null, null, null, new AwS598S0100000_19(this, 811), 14, null);
        AssemViewModel.asyncSubscribe$default(LIZ(), new C2217381BqS() { // from class: X.0iyL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1263140iyW c1263140iyW = (C1263140iyW) obj;
                c1263140iyW.getClass();
                return C627260Oiy.LIZJ(c1263140iyW);
            }
        }, null, new AwS598S0100000_19(this, 812), null, null, 26, null);
        C736680Sv4.LJIIIIZZ(this, LIZ(), new C2217381BqS() { // from class: X.0iyM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1263140iyW) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 285), 4);
        UserCardListViewModel userCardListViewModelLIZ2 = LIZ();
        selectSubscribe(userCardListViewModelLIZ2, new C2217381BqS() { // from class: X.0iyN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1263140iyW) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0iz8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1263140iyW) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0iyO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1263140iyW) obj).LLILLL);
            }
        }, C736820SvI.LIZIZ(userCardListViewModelLIZ2.usedInReusedScene), null, new C1266280j3a(this, 18));
        if (((Number) C0AJB.LIZ.getValue()).intValue() == 1) {
            C736680Sv4.LJIIIIZZ(this, LIZ(), new C2217381BqS() { // from class: X.0iz6
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1263140iyW) obj).LLILLJJLI;
                }
            }, null, new AwS633S0100000_19(this, 283), 6);
        } else {
            C736680Sv4.LJIIIIZZ(this, LIZ(), new C2217381BqS() { // from class: X.0iz7
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1263140iyW) obj).LLILLJJLI;
                }
            }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 284), 4);
        }
    }

    @Override // X.InterfaceC1904060zeG
    public final C20603715jn LLFII() {
        return (C20603715jn) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC1262810ixz
    public final AbstractC21673719rz getItemAnimator() {
        return this.LLJIJIL.getValue();
    }

    @Override // X.InterfaceC1904060zeG
    public final LifecycleOwner getLifecycleOwner() {
        return (LifecycleOwner) this.LLIZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1262810ixz
    public final void LLILLIZIL() {
        C1263140iyW c1263140iyW = (C1263140iyW) LIZ().getState();
        c1263140iyW.getClass();
        if ((C627260Oiy.LIZJ(c1263140iyW) instanceof C1623706Xj) || !c1263140iyW.LIZIZ() || (C627260Oiy.LIZLLL(c1263140iyW) instanceof C1623706Xj)) {
            return;
        }
        AssemSingleListViewModel.manualListLoadMore$default(LIZ(), null, 1, null);
    }

    @Override // X.InterfaceC1262810ixz
    public final void destroy() {
        LIZ().onCleared();
    }

    @Override // X.InterfaceC1262810ixz
    public final C1075800e6M getCurrentState() {
        return LIZ().xQ2().getState();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return getLifecycleOwner().getLifecycle();
    }

    @Override // X.InterfaceC1262810ixz
    public final void reset() {
        LIZ().reset();
    }

    @Override // X.InterfaceC1904060zeG
    public final C1262300ixA getConfig() {
        return this.LL;
    }

    @Override // X.InterfaceC1262810ixz
    public final void Eg(InterfaceC1261750iwH interfaceC1261750iwH) {
        LIZ().xQ2().Eg(interfaceC1261750iwH);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LJI(AbstractC1264080j02<C1261860iwS> abstractC1264080j02) {
        C01GW c01gw = C0AJB.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 2) {
            LIZIZ();
        }
        UserCardListViewModel userCardListViewModelLIZ = LIZ();
        C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
        String str = userCardListViewModelLIZ.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init ViewModel, value: ");
        sbLIZ.append(abstractC1264080j02);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1264320j0Q.getClass();
        C1264320j0Q.LIZLLL(str, strLIZIZ);
        C23250099c.LIZLLL(userCardListViewModelLIZ.getSingleThreadVMScope(), null, null, new C1263090iyR(userCardListViewModelLIZ, abstractC1264080j02, null), 3);
        this.LLILLL.LIZ(0, new AwS598S0100000_19(this, 813));
        if (((Number) c01gw.getValue()).intValue() != 2) {
            LIZ().runOnWorkThread(new AwS598S0100000_19(this, 815));
        }
    }

    @Override // X.InterfaceC1904060zeG
    public final void LJJLIIIJJIZ(InterfaceC1263010iyJ interfaceC1263010iyJ) {
        InterfaceC1263010iyJ interfaceC1263010iyJ2;
        this.LLJI = interfaceC1263010iyJ;
        if (interfaceC1263010iyJ == null) {
            interfaceC1263010iyJ2 = null;
        } else {
            interfaceC1263010iyJ2 = interfaceC1263010iyJ;
        }
        interfaceC1263010iyJ2.LLJJ(this.LLILZIL);
        C1263000iyI c1263000iyI = this.LLILLL;
        c1263000iyI.LIZ = interfaceC1263010iyJ;
        interfaceC1263010iyJ.LJJLIIIJLJLI(new AwS420S0200000_19(c1263000iyI, interfaceC1263010iyJ, 181));
    }

    @Override // X.InterfaceC1262810ixz
    public final void LJJLL(InterfaceC1262660ixk interfaceC1262660ixk) {
        ((CopyOnWriteArrayList) ((C1262650ixj) LIZ().yQ2().LJIIIZ().LJFF.getValue()).LIZIZ).add(interfaceC1262660ixk);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1262810ixz
    public final void LLFZ(boolean z) {
        C1263140iyW c1263140iyW = (C1263140iyW) LIZ().getState();
        c1263140iyW.getClass();
        if (c1263140iyW.getListState().LL instanceof C1623706Xj) {
            return;
        }
        C1263140iyW c1263140iyW2 = (C1263140iyW) LIZ().getState();
        c1263140iyW2.getClass();
        if (c1263140iyW2.getListState().LLILLJJLI instanceof C1623706Xj) {
            return;
        }
        UserCardListViewModel userCardListViewModelLIZ = LIZ();
        C1263080iyQ c1263080iyQYQ2 = userCardListViewModelLIZ.yQ2();
        c1263080iyQYQ2.LLJJI = false;
        c1263080iyQYQ2.LLJILLL = c1263080iyQYQ2.LJIIJJI();
        if (!z) {
            userCardListViewModelLIZ.manualListRefresh();
        } else {
            C23250099c.LIZLLL(userCardListViewModelLIZ.LLILZLL, null, null, new C1072490e11(userCardListViewModelLIZ, null), 3);
        }
    }

    @Override // X.InterfaceC1262810ixz
    public final void LLIIZ(RecyclerView recyclerView) {
        String type;
        String str;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        if ((recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView) != null) {
            viewOnAttachStateChangeListenerC20604515jv.setListConfig(LLFII());
        }
        C0XHY c0xhy = C0XHY.LIZ;
        C1261270ivV c1261270ivV = this.LL.trackerConfig;
        c0xhy.getClass();
        if (c1261270ivV.LJFF) {
            type = EnumC1260920iuw.POP_UP.getType();
        } else {
            type = EnumC1260920iuw.CARD.getType();
        }
        if (c1261270ivV.LJ.length() == 0) {
            str = "";
        } else if (Intrinsics.LJFF(c1261270ivV.LJ, C0XQ7.LJFF().getCurUserId())) {
            str = "self_";
        } else {
            str = "other_";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserCard_");
        sbLIZ.append(c1261270ivV.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(type);
        sbLIZ.append('_');
        sbLIZ.append(str);
        ((PerfMonitorService) ServiceManager.get().getService(PerfMonitorService.class)).LJ(recyclerView, C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL.LIZ(null, new AwS385S0200000_19(this, recyclerView, 125));
    }

    @Override // X.InterfaceC1262810ixz
    public final void LLL(Function1<? super C1261270ivV, C1261270ivV> function1) {
        C1261270ivV c1261270ivV = LIZ().LL.trackerConfig;
        C1261270ivV c1261270ivVInvoke = function1.invoke(c1261270ivV);
        if (Intrinsics.LJFF(c1261270ivVInvoke, c1261270ivV)) {
            return;
        }
        UserCardListViewModel userCardListViewModelLIZ = LIZ();
        C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
        String str = userCardListViewModelLIZ.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update tracker config: ");
        sbLIZ.append(c1261270ivVInvoke);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1264320j0Q.getClass();
        C1264320j0Q.LIZLLL(str, strLIZIZ);
        C1262300ixA c1262300ixA = userCardListViewModelLIZ.LL;
        userCardListViewModelLIZ.LL = c1262300ixA.copy(c1262300ixA.hostActivity, c1262300ixA.hostFragment, c1262300ixA.uiConfig, c1262300ixA.listConfig, c1261270ivVInvoke, c1262300ixA.apiConfig, c1262300ixA.arguments, c1262300ixA.onFail);
    }

    @Override // X.InterfaceC1262810ixz
    public final void ng(InterfaceC1261750iwH interfaceC1261750iwH) {
        LIZ().xQ2().ng(interfaceC1261750iwH);
    }

    public C1262980iyG(C1262300ixA c1262300ixA, boolean z) {
        AssemVMLazy assemVMLazy;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c1262300ixA.trackerConfig.LIZ);
        sbLIZ2.append('|');
        sbLIZ2.append(c1262300ixA.trackerConfig.LJII);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append("|UI");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1263000iyI c1263000iyI = new C1263000iyI();
        this.LL = c1262300ixA;
        this.LLILLJJLI = strLIZIZ;
        this.LLILLL = c1263000iyI;
        String string = UUID.randomUUID().toString();
        this.LLILZ = string;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("VAbility_");
        sbLIZ3.append(string);
        this.LLILZIL = C2188811AlT.LIZIZ(sbLIZ3);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this, 3173);
        AwS137S0110000_19 awS137S0110000_19 = new AwS137S0110000_19(this, z, 10);
        Fragment fragment = c1262300ixA.hostFragment;
        if (fragment != null) {
            InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(UserCardListViewModel.class);
            AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(744);
            if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), awS137S0110000_19, aFwS257S0000000_19, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
            } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS563S0100000_19, awS137S0110000_19, aFwS257S0000000_19, null, null, null);
            } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), awS137S0110000_19, aFwS257S0000000_19, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
            } else {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
        } else {
            C19EG c19eg = c1262300ixA.hostActivity;
            if (c19eg != null) {
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(UserCardListViewModel.class);
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(c19eg, c19719912DlLIZ2), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(c19eg), C724750Sbp.LJIIIZ(c19eg), awS137S0110000_19, AFwS257S0000000_19.get$arr$(745));
            } else {
                "relation user card not config any host!".toString();
                throw new IllegalStateException("relation user card not config any host!");
            }
        }
        this.LLILZLL = assemVMLazy;
        this.LLIZ = C447550Hgn.LJII(new AwS563S0100000_19(this, 3171));
        this.LLIZLLLIL = C447550Hgn.LJII(new AwS563S0100000_19(this, 3172));
        this.LLJ = C447550Hgn.LJII(new AwS563S0100000_19(this, 3174));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3170));
    }

    @Override // X.InterfaceC1262810ixz
    public final void LJJLIIIJILLIZJL(String str, String str2, List list) {
        UserCardListViewModel userCardListViewModelLIZ = LIZ();
        C23250099c.LIZLLL(userCardListViewModelLIZ.getSingleThreadVMScope(), null, null, new C1072470e0z(userCardListViewModelLIZ, list, str, str2, null), 3);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
