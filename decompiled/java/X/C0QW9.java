package X;

import Y.ACallableS178S0300000_10;
import Y.AObserverS214S0100000_10;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.ab.ECSearchJatoConfig;
import com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QW9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0QW9 implements InterfaceC671440QVi {
    public final C0QWG LL;
    public final Function0<ISearchBarAbility> LLILLJJLI;
    public final Function0<IPageSearchSubPageAbility> LLILLL;
    public final Function0<IPageSearchSubPageAbility> LLILZ;
    public final Function0<IPageSearchSubPageAbility> LLILZIL;
    public final List<C0QUT> LLILZLL;
    public IPageSearchSubPageAbility LLJIJIL;
    public IPageSearchSubPageAbility LLJILJIL;
    public boolean LLJILLL;
    public final Map<C0QUT, Function2<SearchResultParam, View, Unit>> LLJJ;
    public final Map<C0QUT, Function0<Boolean>> LLJJI;
    public final Map<C0QUT, Function1<C0QWD, Unit>> LLJJIII;
    public final AwS589S0100000_10 LLJJIJI;
    public final Map<C0QUT, Function1<SearchResultParam, Unit>> LLJJIJIIJIL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1113));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1114));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1115));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1112));
    public final List<C0QPH> LLJILJILJ = new ArrayList();

    @Override // X.InterfaceC671440QVi
    public final void F5() {
        C0QWE.LIZ.getClass();
        if (((ECSearchJatoConfig) C0QWE.LIZJ.getValue()).enableJatoOptimize) {
            ((IOptimizerHelperService) ServiceManager.get().getService(IOptimizerHelperService.class)).LJII(0L, 2, 8, 4, 1);
        }
    }

    public final ISearchBarAbility LIZJ() {
        return (ISearchBarAbility) this.LLIZ.getValue();
    }

    public final IPageSearchSubPageAbility LIZLLL() {
        return (IPageSearchSubPageAbility) this.LLIZLLLIL.getValue();
    }

    public final IPageSearchSubPageAbility LJ() {
        return (IPageSearchSubPageAbility) this.LLJ.getValue();
    }

    public final boolean LJFF() {
        int i = this.LL.Cg().LIZIZ;
        if (i == 3) {
            return false;
        }
        if (this.LLJILLL || i == 2) {
            return true;
        }
        if (i == 1) {
            return false;
        }
        if (i == 0) {
            return this.LL.Bd();
        }
        return true;
    }

    @Override // X.InterfaceC671440QVi
    public final boolean X6() {
        C0QUT c0qutZs2;
        Function0<Boolean> function0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("operatorBack() curPage = ");
        IPageSearchSubPageAbility iPageSearchSubPageAbility = this.LLJILJIL;
        sbLIZ.append(iPageSearchSubPageAbility != null ? iPageSearchSubPageAbility.Zs2() : null);
        sbLIZ.append(", isPassSuggestState=");
        sbLIZ.append(this.LLJILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        IPageSearchSubPageAbility iPageSearchSubPageAbility2 = this.LLJILJIL;
        if (iPageSearchSubPageAbility2 == null || (c0qutZs2 = iPageSearchSubPageAbility2.Zs2()) == null || (function0 = LIZ().get(c0qutZs2)) == null) {
            return false;
        }
        return function0.invoke().booleanValue();
    }

    public Map<C0QUT, Function0<Boolean>> LIZ() {
        return this.LLJJI;
    }

    public Map<C0QUT, Function1<C0QWD, Unit>> LIZIZ() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC671440QVi
    public final IPageSearchSubPageAbility x8() {
        return this.LLJILJIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, java.lang.String] */
    @Override // X.InterfaceC671440QVi
    public void LLIILII(SearchResultParam searchResultParam) {
        C0QUT c0qutZs2;
        C0QUT c0qutZs22;
        Function1 function1;
        int i;
        boolean z;
        C0QWE.LIZ.getClass();
        C01GW c01gw = C0QWE.LIZJ;
        if (((ECSearchJatoConfig) c01gw.getValue()).enableJatoOptimize) {
            ((IOptimizerHelperService) ServiceManager.get().getService(IOptimizerHelperService.class)).LJII(((ECSearchJatoConfig) c01gw.getValue()).jatoDuration, 2, 4, 1);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("operatorSearch callback stateType = ");
        IPageSearchSubPageAbility iPageSearchSubPageAbility = this.LLJILJIL;
        if (iPageSearchSubPageAbility != null) {
            c0qutZs2 = iPageSearchSubPageAbility.Zs2();
        } else {
            c0qutZs2 = null;
        }
        sbLIZ.append(c0qutZs2);
        C2188811AlT.LIZIZ(sbLIZ);
        C0QPB c0qpbLLJILJIL = this.LL.LLJILJIL();
        if (c0qpbLLJILJIL != null) {
            C0QNP c0qnp = C0QNP.LIZ;
            ECSearchEntranceData eCSearchEntranceData = c0qpbLLJILJIL.LL;
            c0qnp.getClass();
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = searchResultParam.getKeyword();
            if (!TextUtils.isEmpty(searchResultParam.getRealSearchWord())) {
                c259800zU.element = searchResultParam.getRealSearchWord();
            }
            String str = (String) c259800zU.element;
            if (!TextUtils.isEmpty(str)) {
                if (str != null) {
                    int length = str.length() - 1;
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 <= length) {
                        if (!z2) {
                            i = i2;
                        } else {
                            i = length;
                        }
                        if (Intrinsics.LJI(str.charAt(i), 32) <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z2) {
                            if (!z) {
                                z2 = true;
                            } else {
                                i2++;
                            }
                        } else if (!z) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    if (!TextUtils.isEmpty(str.subSequence(i2, length + 1).toString())) {
                        C15O7.LIZIZ(new ACallableS178S0300000_10(searchResultParam, c259800zU, eCSearchEntranceData, 0), C15O7.LJI, null);
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        IPageSearchSubPageAbility iPageSearchSubPageAbility2 = this.LLJILJIL;
        if (iPageSearchSubPageAbility2 != null && (c0qutZs22 = iPageSearchSubPageAbility2.Zs2()) != null && (function1 = (Function1) ((LinkedHashMap) this.LLJJIJIIJIL).get(c0qutZs22)) != null) {
            function1.invoke(searchResultParam);
            if (Unit.LIZ != null) {
                return;
            }
        }
        this.LLJJIJI.invoke(searchResultParam);
    }

    @Override // X.InterfaceC671440QVi
    public final boolean m9(C0QUT c0qut) {
        if (c0qut == null) {
            return false;
        }
        int i = C0QWB.LIZ[c0qut.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            LJI(LJ(), C0QWA.RETURN, null);
            LIZJ().O6("");
            LIZJ().rc2(true, false);
        } else {
            LJI(LIZLLL(), C0QWA.RETURN, null);
            LIZJ().rc2(true, false);
        }
        return true;
    }

    @Override // X.InterfaceC671440QVi
    public final InterfaceC420801kM oz(final C0QPH c0qph) {
        ((ArrayList) this.LLJILJILJ).add(c0qph);
        return new InterfaceC420801kM() { // from class: X.0QWF
            @Override // X.InterfaceC420801kM
            public final void dispose() {
                ((ArrayList) this.LL.LLJILJILJ).remove(c0qph);
            }

            @Override // X.InterfaceC420801kM
            public final boolean isDisposed() {
                return !((ArrayList) this.LL.LLJILJILJ).contains(c0qph);
            }
        };
    }

    public final void LJI(IPageSearchSubPageAbility iPageSearchSubPageAbility, C0QWA c0qwa, SearchResultParam searchResultParam) {
        C0QUT c0qutZs2;
        C0QUT c0qutZs22;
        C0QUT c0qutZs23;
        IPageSearchSubPageAbility iPageSearchSubPageAbility2 = this.LLJILJIL;
        if (iPageSearchSubPageAbility2 != null) {
            c0qutZs2 = iPageSearchSubPageAbility2.Zs2();
        } else {
            c0qutZs2 = null;
        }
        if (c0qutZs2 == iPageSearchSubPageAbility.Zs2()) {
            return;
        }
        IPageSearchSubPageAbility iPageSearchSubPageAbility3 = this.LLJILJIL;
        this.LLJIJIL = iPageSearchSubPageAbility3;
        this.LLJILJIL = iPageSearchSubPageAbility;
        if (iPageSearchSubPageAbility3 != null) {
            iPageSearchSubPageAbility3.hide();
        }
        for (C0QPH c0qph : (ArrayList) this.LLJILJILJ) {
            IPageSearchSubPageAbility iPageSearchSubPageAbility4 = this.LLJIJIL;
            if (iPageSearchSubPageAbility4 != null) {
                c0qutZs23 = iPageSearchSubPageAbility4.Zs2();
            } else {
                c0qutZs23 = null;
            }
            c0qph.q8(c0qutZs23, iPageSearchSubPageAbility.Zs2(), searchResultParam);
        }
        int i = C670890QTf.LIZ;
        C670890QTf.LIZIZ = EnumC670900QTg.IDLE;
        C670890QTf.LIZJ.clear();
        iPageSearchSubPageAbility.XE1(c0qwa);
        if (iPageSearchSubPageAbility.Zs2() == C0QUT.SUGGEST) {
            this.LLJILLL = true;
        }
        for (C0QPH c0qph2 : (ArrayList) this.LLJILJILJ) {
            IPageSearchSubPageAbility iPageSearchSubPageAbility5 = this.LLJIJIL;
            if (iPageSearchSubPageAbility5 != null) {
                c0qutZs22 = iPageSearchSubPageAbility5.Zs2();
            } else {
                c0qutZs22 = null;
            }
            c0qph2.pc(c0qutZs22, iPageSearchSubPageAbility.Zs2());
        }
    }

    @Override // X.InterfaceC671440QVi
    public final void aM(C0QUT c0qut, SearchResultParam searchResultParam, View view) {
        Function2 function2 = (Function2) ((LinkedHashMap) this.LLJJ).get(c0qut);
        if (function2 != null) {
            function2.invoke(searchResultParam, view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0QW9(C0QWG c0qwg, Function0<? extends ISearchBarAbility> function0, Function0<? extends IPageSearchSubPageAbility> function02, Function0<? extends IPageSearchSubPageAbility> function03, Function0<? extends IPageSearchSubPageAbility> function04, List<? extends C0QUT> list) {
        Object objLIZLLL;
        this.LL = c0qwg;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
        this.LLILZ = function03;
        this.LLILZIL = function04;
        this.LLILZLL = list;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            int i = C0QWB.LIZ[((C0QUT) it2.next()).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        objLIZLLL = this.LLJI.getValue();
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    objLIZLLL = LJ();
                }
            } else {
                objLIZLLL = LIZLLL();
            }
            ((ArrayList) this.LLJILJILJ).add(objLIZLLL);
        }
        LIZJ().h02().observe(this.LL.getLifecycleOwner(), new AObserverS214S0100000_10(this, 129));
        ((ArrayList) this.LLJILJILJ).add(LIZJ());
        ((ArrayList) this.LLJILJILJ).add(this.LL);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0QUT c0qut = C0QUT.SUG;
        linkedHashMap.put(c0qut, new AwS624S0100000_10(this, 115));
        C0QUT c0qut2 = C0QUT.SUGGEST;
        linkedHashMap.put(c0qut2, new AwS624S0100000_10(this, 116));
        C0QUT c0qut3 = C0QUT.RESULT;
        linkedHashMap.put(c0qut3, new AwS624S0100000_10(this, 117));
        this.LLJJ = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(c0qut, new AwS554S0100000_10(this, 1110));
        linkedHashMap2.put(c0qut2, AFwS196S0000000_10.get$arr$(579));
        linkedHashMap2.put(c0qut3, new AwS554S0100000_10(this, 1111));
        this.LLJJI = linkedHashMap2;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(c0qut, new AwS589S0100000_10(this, 520));
        linkedHashMap3.put(c0qut2, new AwS589S0100000_10(this, 521));
        linkedHashMap3.put(c0qut3, new AwS589S0100000_10(this, 522));
        this.LLJJIII = linkedHashMap3;
        this.LLJJIJI = new AwS589S0100000_10(this, 519);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (C0QUT c0qut4 : this.LLILZLL) {
            if (c0qut4 != C0QUT.RESULT) {
                linkedHashMap4.put(c0qut4, this.LLJJIJI);
            } else {
                linkedHashMap4.put(c0qut4, new AwS589S0100000_10(this, 523));
            }
        }
        this.LLJJIJIIJIL = linkedHashMap4;
    }
}
