package X;

import Y.ACListenerS159S0100000_25;
import Y.AfS159S0200000_25;
import Y.AfS194S0100000_25;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.view.internal.main.FilterListViewSelectionViewModel;
import com.ss.android.ugc.aweme.filter.view.internal.main.FilterListViewStateViewModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.view.widget.ScrollCenterLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS347S0000000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0stc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644500stc implements InterfaceC1644040sss {
    public final ViewGroup LIZ;
    public final LifecycleOwner LIZIZ;
    public final Function0<InterfaceC1639870sm9> LIZJ;
    public final Function0<InterfaceC1452660nuC> LIZLLL;
    public ViewGroup LJ;
    public View LJFF;
    public InterfaceC1644620sto LJI;
    public InterfaceC1644690stv LJII;
    public InterfaceC1644710stx LJIIIIZZ;
    public InterfaceC1644640stq LJIIIZ;
    public InterfaceC1644700stw LJIIJ;
    public FilterBean LJIIJJI;
    public int LJIIL;
    public final C11RK LJIILIIL = new C11RK();
    public final C11RK LJIILJJIL = new C11RK();
    public final C11RK LJIILL = new C11RK();
    public final C1644520ste LJIILLIIL;
    public boolean LJIIZILJ;
    public final C01GW LJIJ;
    public AwS426S0200000_25 LJIJI;
    public final FilterListViewSelectionViewModel LJIJJ;
    public final C01GW LJIJJLI;

    @Override // X.InterfaceC1644040sss
    public final void l2() {
    }

    @Override // X.InterfaceC1644040sss
    public final void o2() {
    }

    public final InterfaceC1644620sto LJIILLIIL() {
        InterfaceC1644620sto interfaceC1644620sto = this.LJI;
        if (interfaceC1644620sto != null) {
            return interfaceC1644620sto;
        }
        return null;
    }

    @Override // X.InterfaceC1644040sss
    public final C11NZ<EnumC1159880gHy> W0() {
        InterfaceC1644640stq interfaceC1644640stq = this.LJIIIZ;
        if (interfaceC1644640stq == null) {
            interfaceC1644640stq = null;
        }
        return interfaceC1644640stq.W0();
    }

    @Override // X.InterfaceC1644040sss
    public final void hide() {
        if (this.LJIILLIIL.LJ) {
            InterfaceC1644640stq interfaceC1644640stq = this.LJIIIZ;
            if (interfaceC1644640stq == null) {
                interfaceC1644640stq = null;
            }
            interfaceC1644640stq.hide();
        } else {
            InterfaceC1644640stq interfaceC1644640stq2 = this.LJIIIZ;
            if (interfaceC1644640stq2 == null) {
                interfaceC1644640stq2 = null;
            }
            interfaceC1644640stq2.V0();
        }
        this.LJIJI = null;
        ((C1629670sVh) this.LJIJJLI.getValue()).LIZJ();
        ((C1629670sVh) this.LJIJ.getValue()).LIZJ();
    }

    @Override // X.InterfaceC1644040sss
    public final C19475711Hn k2() {
        C11RK c11rk = this.LJIILL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1644040sss
    public final void q2() {
    }

    @Override // X.InterfaceC1644000sso
    public final void LJIILJJIL(Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map) {
        Map.Entry entry;
        List list;
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sb = new StringBuilder("viki filter, FilterView.setCategoryFilterList -> ret -> filterTable=");
        Set<EffectCategoryResponse> setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
        Iterator<T> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((EffectCategoryResponse) it2.next()).getName());
        }
        sb.append(arrayList);
        sb.append(", filter.size=");
        Iterator<T> it3 = map.values().iterator();
        int i = 0;
        int size = 0;
        while (it3.hasNext()) {
            size += ((List) it3.next()).size();
        }
        sb.append(size);
        interfaceC1463990oCTLIZLLL.d(sb.toString());
        Iterator<T> it4 = map.values().iterator();
        int size2 = 0;
        while (it4.hasNext()) {
            size2 += ((List) it4.next()).size();
        }
        boolean z = true;
        if (size2 == 0) {
            C2281251EQx.LIZ.LJ("filter", true);
        }
        if (map.size() > 1) {
            z = false;
        }
        this.LJIIZILJ = z;
        if (z) {
            ((C1629670sVh) this.LJIJ.getValue()).LIZ();
        }
        if (C20510015Ni.LIZ.LJFF() && (entry = (Map.Entry) C13LP.LJJJLIIL(map.entrySet())) != null && (list = (List) entry.getValue()) != null) {
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    FilterBean filterBean = (FilterBean) obj;
                    if (i < 5) {
                        this.LIZJ.invoke().LJFF(filterBean);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        LJIILLIIL().LJIILJJIL(map);
    }

    @Override // X.InterfaceC1644040sss
    public final void LJJ(boolean z) {
        InterfaceC1644640stq interfaceC1644640stq = null;
        if (this.LJIILLIIL.LJ) {
            InterfaceC1644640stq interfaceC1644640stq2 = this.LJIIIZ;
            if (interfaceC1644640stq2 != null) {
                interfaceC1644640stq = interfaceC1644640stq2;
            }
            interfaceC1644640stq.show();
        } else {
            InterfaceC1644640stq interfaceC1644640stq3 = this.LJIIIZ;
            if (interfaceC1644640stq3 != null) {
                interfaceC1644640stq = interfaceC1644640stq3;
            }
            interfaceC1644640stq.Y0();
        }
        if (this.LJIIZILJ) {
            ((C1629670sVh) this.LJIJ.getValue()).LIZIZ();
        }
    }

    @Override // X.InterfaceC1644040sss
    public final void m2(FilterBean filterBean) {
        LJIILLIIL().LJIIJ(filterBean, false);
    }

    @Override // X.InterfaceC1644040sss
    public final void n2(float f) {
        if (this.LJIILLIIL.LJIIJ) {
            ViewGroup viewGroup = this.LJ;
            if (viewGroup == null) {
                viewGroup = null;
            }
            C786410Ut5.x5((TuxIconView) viewGroup.findViewById(R.id.kg8), f);
        }
    }

    @Override // X.InterfaceC1644040sss
    public final void p2(C1640210smh c1640210smh) {
        LJIILLIIL().LJI(c1640210smh, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5, types: [X.0smY] */
    /* JADX WARN: Type inference failed for: r15v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r24v0, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v17, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v23, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r6v35, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v40 */
    public C1644500stc(ViewGroup viewGroup, final C1644130st1 c1644130st1, Function0 function0, Function0 function02, final InterfaceC1640280smo interfaceC1640280smo, Function1 function1) {
        InterfaceC1644640stq interfaceC1644640stq;
        boolean z;
        InterfaceC1644700stw interfaceC1644700stw;
        InterfaceC1644620sto interfaceC1644620stoLJIILLIIL;
        AbstractC21674919sB abstractC21674919sB;
        Function1<? super C1643380sro, Unit> function12;
        C1643380sro c1643380sro;
        this.LIZ = viewGroup;
        this.LIZIZ = c1644130st1;
        this.LIZJ = function0;
        this.LIZLLL = function02;
        new C11RK();
        C11NJ c11nj = new C11NJ();
        final C1644520ste c1644520ste = new C1644520ste(0);
        this.LJIILLIIL = c1644520ste;
        C1698120uI6 c1698120uI6 = new C1698120uI6(this, 1);
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LJIJ = C452501pT.LIZ(enumC452301pR, new AwS569S0100000_25(this, 1004));
        final FilterListViewSelectionViewModel filterListViewSelectionViewModel = new FilterListViewSelectionViewModel(c1644130st1, function0, interfaceC1640280smo, null);
        this.LJIJJ = filterListViewSelectionViewModel;
        this.LJIJJLI = C452501pT.LIZ(enumC452301pR, new AwS569S0100000_25(this, 1001));
        if (function1 != null) {
            function1.invoke(c1644520ste);
        }
        AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(this, 740);
        if (!filterListViewSelectionViewModel.LLIZ.contains(awS604S0100000_25)) {
            filterListViewSelectionViewModel.LLIZ.add(awS604S0100000_25);
        }
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.vd, viewGroup, false);
        this.LJ = viewGroup2;
        C19733912Iv c19733912Iv = (C19733912Iv) viewGroup2.findViewById(R.id.hxm);
        if (c19733912Iv != null && (function12 = c1644520ste.LJFF.LIZ) != null && (c1643380sro = c19733912Iv.LL) != null) {
            function12.invoke(c1643380sro);
            c19733912Iv.setBackground(c1643380sro.LIZ());
            c19733912Iv.invalidate();
        }
        ViewGroup viewGroup3 = this.LJ;
        ?? r3 = (ViewGroup) (viewGroup3 != null ? viewGroup3 : null).findViewById(R.id.mfw);
        if (c1644520ste.LJIIJ) {
            ViewGroup viewGroup4 = this.LJ;
            TuxIconView tuxIconView = new TuxIconView((viewGroup4 == null ? null : viewGroup4).getContext(), null, 0, 6, null);
            tuxIconView.setId(R.id.kg8);
            tuxIconView.setIconRes(R.raw.icon_block);
            tuxIconView.setTintColorRes(R.attr.zk);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            layoutParams.addRule(15);
            C786410Ut5.M6(tuxIconView, layoutParams);
            C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            r3.addView(tuxIconView, 0);
            interfaceC1644640stq = null;
        } else {
            ViewGroup viewGroup5 = this.LJ;
            interfaceC1644640stq = null;
            C19736412Ju c19736412Ju = new C19736412Ju((viewGroup5 == null ? null : viewGroup5).getContext(), null, 6, 0);
            c19736412Ju.setId(R.id.kg8);
            c19736412Ju.setEnableTint(false);
            c19736412Ju.setImageDrawable(C19734012Iw.LIZLLL(C800330VaR.LIZIZ(c19736412Ju.getContext(), R.drawable.c3t), C446980Hfs.LIZ(c19736412Ju.getContext(), R.color.a0v)));
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            layoutParams2.addRule(15);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19736412Ju);
            c19736412Ju.setLayoutParams(layoutParams2);
            C426750GoL.LJIIIZ(c19736412Ju, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
            int visibility = c19736412Ju.getVisibility();
            c19736412Ju.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c19736412Ju);
            r3.addView(c19736412Ju, 0);
        }
        ViewGroup viewGroup6 = this.LJ;
        C19561611g6 c19561611g6 = (C19561611g6) (viewGroup6 == null ? interfaceC1644640stq : viewGroup6).findViewById(R.id.hyh);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(c19561611g6.getLayoutParams().width, c19561611g6.getLayoutParams().height);
        layoutParams3.addRule(1, R.id.kg8);
        layoutParams3.addRule(17, R.id.kg8);
        C786410Ut5.p7(c19561611g6, layoutParams3);
        ViewGroup viewGroup7 = this.LJ;
        viewGroup.addView(viewGroup7 == null ? interfaceC1644640stq : viewGroup7);
        ViewGroup viewGroup8 = this.LJ;
        ?? r6 = viewGroup8 == null ? interfaceC1644640stq : viewGroup8;
        View viewFindViewById = r6.findViewById(R.id.w4x);
        this.LJFF = viewFindViewById;
        InterfaceC1644640stq interfaceC1644640stqInvoke = c1644520ste.LJI.LJ.invoke(r6, viewFindViewById);
        this.LJIIIZ = interfaceC1644640stqInvoke;
        C11ON c11onLIZ = (interfaceC1644640stqInvoke == null ? interfaceC1644640stq : interfaceC1644640stqInvoke).LIZ();
        AfS194S0100000_25 afS194S0100000_25 = new AfS194S0100000_25(this, 196);
        C1701960uOI c1701960uOI = C19487811Me.LJ;
        c11nj.LIZ(c11onLIZ.LJJLL(afS194S0100000_25, c1701960uOI));
        ViewGroup viewGroup9 = this.LJ;
        ?? r15 = viewGroup9 == null ? interfaceC1644640stq : viewGroup9;
        final RecyclerView recyclerView = (RecyclerView) r15.findViewById(R.id.hyb);
        recyclerView.setLayoutManager(new ScrollCenterLayoutManager(r15.getContext()));
        final C19YA c19ya = (C19YA) r15.findViewById(R.id.hyh);
        c19ya.setTabMode(1);
        c19ya.setTabMargin(12);
        Function1<? super C19YA, Unit> function13 = c1644520ste.LJFF.LJ;
        if (function13 != null) {
            function13.invoke(c19ya);
        }
        if (C2281551ESb.LIZIZ.LIZIZ()) {
            AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
            if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
                abstractC21674919sB.LLIZ = false;
            }
        }
        if (!c1644520ste.LJFF.LIZIZ) {
            InterfaceC1644640stq interfaceC1644640stq2 = this.LJIIIZ;
            c11nj.LIZ((interfaceC1644640stq2 != null ? interfaceC1644640stq2 : interfaceC1644640stq).W0().LJJLL(new AfS159S0200000_25(recyclerView, this, 15), C09HN.LIZ));
        }
        final FilterListViewStateViewModel filterListViewStateViewModel = new FilterListViewStateViewModel(c1644130st1, function0);
        final C1640030smP c1640030smP = c1644520ste.LJFF.LJI;
        final ?? r14 = new C1640110smX(this, recyclerView, c1644130st1, filterListViewSelectionViewModel, filterListViewStateViewModel, c1640030smP, c1644520ste) { // from class: X.0smY
            {
                AFwS347S0000000_25 aFwS347S0000000_25 = C1640110smX.LJIILJJIL;
            }
        };
        this.LJI = new C1643970ssl(r14, c19ya, interfaceC1640280smo) { // from class: X.0ssq
            @Override // X.C1643970ssl
            public final void LJIJI(List<? extends EffectCategoryResponse> list) {
                C19YA c19ya2 = this.LIZIZ;
                int size = list.size() + this.LJ.size();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<? extends EffectCategoryResponse> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getName());
                }
                C1645610svP.LIZ(c19ya2, size, arrayList);
                super.LJIJI(list);
            }

            @Override // X.C1643970ssl
            public final C1642680sqg LJIIZILJ(Context context, EffectCategoryResponse effectCategoryResponse) {
                C1642680sqg c1642680sqgLJIIZILJ = super.LJIIZILJ(context, effectCategoryResponse);
                Function1<? super View, Unit> function14 = this.LJIIIZ.LJIILLIIL.LJFF.LJFF;
                if (function14 != null) {
                    function14.invoke(c1642680sqgLJIIZILJ);
                }
                return c1642680sqgLJIIZILJ;
            }
        };
        c11nj.LIZ(LJIILLIIL().LJIIJJI().LJJLL(new AfS194S0100000_25(this, 193), c1701960uOI));
        c11nj.LIZ(LJIILLIIL().LIZLLL().LJJLL(new AfS194S0100000_25(this, 194), c1701960uOI));
        c11nj.LIZ(LJIILLIIL().LIZ().LJJLL(new AfS194S0100000_25(this, 195), c1701960uOI));
        if (c1644520ste.LJIIIZ) {
            C786410Ut5.LJLZ(8, LJIILLIIL().LIZIZ());
            ViewGroup viewGroup10 = this.LJ;
            z = false;
            C786410Ut5.LJLLLLLL(0, (viewGroup10 == null ? null : viewGroup10).findViewById(R.id.txt_filter));
            ViewGroup viewGroup11 = this.LJ;
            View viewFindViewById2 = (viewGroup11 == null ? null : viewGroup11).findViewById(R.id.k0h);
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            C786410Ut5.I7(new ACListenerS159S0100000_25(this, 70), viewFindViewById2);
        } else {
            z = false;
        }
        ViewGroup viewGroup12 = this.LJ;
        View viewFindViewById3 = (viewGroup12 == null ? null : viewGroup12).findViewById(R.id.u0f);
        Function1<? super SeekBar, Unit> function14 = c1644520ste.LJFF.LIZLLL;
        if (function14 != null) {
            function14.invoke(viewFindViewById3);
        }
        InterfaceC1644690stv interfaceC1644690stvInvoke = c1644520ste.LJI.LIZ.invoke(viewFindViewById3);
        this.LJII = interfaceC1644690stvInvoke;
        interfaceC1644690stvInvoke = interfaceC1644690stvInvoke == null ? null : interfaceC1644690stvInvoke;
        if (c1644520ste.LIZ && ((((interfaceC1644620stoLJIILLIIL = LJIILLIIL()) != null && interfaceC1644620stoLJIILLIIL.LIZJ() != null) || c1644520ste.LJIIIZ) && this.LJIIJJI != null)) {
            z = true;
        }
        interfaceC1644690stvInvoke.setVisibility(z);
        if (c1644520ste.LIZ) {
            InterfaceC1644690stv interfaceC1644690stv = this.LJII;
            C786410Ut5.wb((interfaceC1644690stv == null ? null : interfaceC1644690stv).getSeekBar(), c1698120uI6);
        }
        ViewGroup viewGroup13 = this.LJ;
        InterfaceC1644710stx interfaceC1644710stxInvoke = c1644520ste.LJI.LIZLLL.invoke((viewGroup13 == null ? null : viewGroup13).findViewById(R.id.w7p));
        this.LJIIIIZZ = interfaceC1644710stxInvoke;
        if (c1644520ste.LIZLLL) {
            (interfaceC1644710stxInvoke == null ? null : interfaceC1644710stxInvoke).LIZ(new ACListenerS159S0100000_25(this, 69));
        }
        InterfaceC1644640stq interfaceC1644640stq3 = this.LJIIIZ;
        (interfaceC1644640stq3 == null ? null : interfaceC1644640stq3).V0();
        ViewGroup viewGroup14 = this.LJ;
        InterfaceC1644700stw interfaceC1644700stwInvoke = c1644520ste.LJI.LJFF.invoke((viewGroup14 == null ? null : viewGroup14).findViewById(R.id.hx9));
        this.LJIIJ = interfaceC1644700stwInvoke;
        if (interfaceC1644700stwInvoke == null) {
            interfaceC1644700stw = null;
        } else {
            interfaceC1644700stw = interfaceC1644700stwInvoke;
        }
        boolean z2 = c1644520ste.LJII;
        if (z2) {
            (interfaceC1644700stwInvoke == null ? null : interfaceC1644700stwInvoke).LIZ(new ACListenerS159S0100000_25(this, 68));
        }
        interfaceC1644700stw.setEnable(z2);
    }
}
