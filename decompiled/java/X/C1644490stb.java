package X;

import Y.ACListenerS159S0100000_25;
import Y.AfS159S0200000_25;
import Y.AfS194S0100000_25;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatImageView;
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
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS347S0000000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0stb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644490stb implements InterfaceC1644040sss {
    public final ViewGroup LIZ;
    public final LifecycleOwner LIZIZ;
    public final Function0<InterfaceC1639870sm9> LIZJ;
    public final Function0<InterfaceC1452660nuC> LIZLLL;
    public final InterfaceC1640220smi LJ;
    public ViewGroup LJFF;
    public InterfaceC1644620sto LJI;
    public InterfaceC1644690stv LJII;
    public InterfaceC1644650str LJIIIIZZ;
    public InterfaceC1644680stu LJIIIZ;
    public InterfaceC1644710stx LJIIJ;
    public InterfaceC1644640stq LJIIJJI;
    public InterfaceC1644700stw LJIIL;
    public FilterBean LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public final C11RK LJIILLIIL;
    public final C11RK LJIIZILJ;
    public final C11RK LJIJ;
    public final C11RK LJIJI;
    public final C1644510std LJIJJ;
    public boolean LJIJJLI;
    public final C01GW LJIL;
    public AwS426S0200000_25 LJJ;
    public final FilterListViewSelectionViewModel LJJI;
    public final C01GW LJJIFFI;

    @Override // X.InterfaceC1644040sss
    public final void l2() {
        LJIJI(false);
    }

    @Override // X.InterfaceC1644040sss
    public final void o2() {
        LJIJI(true);
    }

    public final InterfaceC1644620sto LJIILLIIL() {
        InterfaceC1644620sto interfaceC1644620sto = this.LJI;
        if (interfaceC1644620sto != null) {
            return interfaceC1644620sto;
        }
        return null;
    }

    public final C19475711Hn LJIIZILJ() {
        C11RK c11rk = this.LJIIZILJ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1644040sss
    public final C11NZ<EnumC1159880gHy> W0() {
        InterfaceC1644640stq interfaceC1644640stq = this.LJIIJJI;
        if (interfaceC1644640stq == null) {
            interfaceC1644640stq = null;
        }
        return interfaceC1644640stq.W0();
    }

    @Override // X.InterfaceC1644040sss
    public final void hide() {
        if (this.LJIJJ.LJ) {
            InterfaceC1644640stq interfaceC1644640stq = this.LJIIJJI;
            if (interfaceC1644640stq == null) {
                interfaceC1644640stq = null;
            }
            interfaceC1644640stq.hide();
        } else {
            InterfaceC1644640stq interfaceC1644640stq2 = this.LJIIJJI;
            if (interfaceC1644640stq2 == null) {
                interfaceC1644640stq2 = null;
            }
            interfaceC1644640stq2.V0();
        }
        this.LJJ = null;
        ((C1629670sVh) this.LJJIFFI.getValue()).LIZJ();
        ((C1629670sVh) this.LJIL.getValue()).LIZJ();
    }

    @Override // X.InterfaceC1644040sss
    public final C19475711Hn k2() {
        C11RK c11rk = this.LJIJ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1644040sss
    public final void q2() {
        if (!this.LJIJJ.LIZJ || this.LJI == null || this.LJIIIZ == null) {
            return;
        }
        C19YA c19yaLIZIZ = LJIILLIIL().LIZIZ();
        if ((c19yaLIZIZ instanceof C19YA) && c19yaLIZIZ != null) {
            c19yaLIZIZ.setScrollPosition(c19yaLIZIZ.getTabCount() - 1, 0.0f, false, false);
        }
        InterfaceC1644680stu interfaceC1644680stu = this.LJIIIZ;
        (interfaceC1644680stu != null ? interfaceC1644680stu : null).LIZJ();
    }

    public final C11NZ<C1641660sp2<C1640210smh>> LJIJ() {
        InterfaceC1644620sto interfaceC1644620stoLJIILLIIL = LJIILLIIL();
        if (interfaceC1644620stoLJIILLIIL != null) {
            return interfaceC1644620stoLJIILLIIL.LJIIJJI();
        }
        return null;
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
        this.LJIJJLI = z;
        if (z) {
            ((C1629670sVh) this.LJIL.getValue()).LIZ();
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

    public final void LJIJI(boolean z) {
        if (this.LJIJJ.LIZIZ && this.LJIILL != z) {
            this.LJIILL = z;
            InterfaceC1644650str interfaceC1644650str = this.LJIIIIZZ;
            if (interfaceC1644650str == null) {
                interfaceC1644650str = null;
            }
            interfaceC1644650str.LIZ(z);
            if (!this.LJIILL) {
                m2(null);
            }
            LJIILLIIL().LJIIIIZZ(this.LJIILL);
            this.LJIJI.onNext(Boolean.valueOf(!this.LJIILL));
        }
    }

    @Override // X.InterfaceC1644040sss
    public final void LJJ(boolean z) {
        InterfaceC1644700stw interfaceC1644700stw = this.LJIIL;
        InterfaceC1644640stq interfaceC1644640stq = null;
        if (interfaceC1644700stw == null) {
            interfaceC1644700stw = null;
        }
        interfaceC1644700stw.setEnable(z);
        if (this.LJIJJ.LJ) {
            InterfaceC1644640stq interfaceC1644640stq2 = this.LJIIJJI;
            if (interfaceC1644640stq2 != null) {
                interfaceC1644640stq = interfaceC1644640stq2;
            }
            interfaceC1644640stq.show();
        } else {
            InterfaceC1644640stq interfaceC1644640stq3 = this.LJIIJJI;
            if (interfaceC1644640stq3 != null) {
                interfaceC1644640stq = interfaceC1644640stq3;
            }
            interfaceC1644640stq.Y0();
        }
        if (this.LJIJJLI) {
            ((C1629670sVh) this.LJIL.getValue()).LIZIZ();
        }
    }

    @Override // X.InterfaceC1644040sss
    public final void m2(FilterBean filterBean) {
        p2(new C1640210smh(filterBean, false, false, 14));
    }

    @Override // X.InterfaceC1644040sss
    public final void n2(float f) {
        if (this.LJIJJ.LJIIIZ) {
            ViewGroup viewGroup = this.LJFF;
            if (viewGroup == null) {
                viewGroup = null;
            }
            C786410Ut5.a5((AppCompatImageView) viewGroup.findViewById(R.id.kg8), f);
        }
    }

    @Override // X.InterfaceC1644040sss
    public final void p2(C1640210smh c1640210smh) {
        LJIILLIIL().LJI(c1640210smh, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v8, types: [X.0smb] */
    /* JADX WARN: Type inference failed for: r26v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0<? extends X.0sm9>, kotlin.jvm.functions.Function0<X.0sm9>] */
    /* JADX WARN: Type inference failed for: r27v0, types: [kotlin.jvm.functions.Function0<? extends X.0nuC>, kotlin.jvm.functions.Function0<X.0nuC>] */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v28, types: [X.0stq] */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v98 */
    public C1644490stb(ViewGroup viewGroup, final LifecycleOwner lifecycleOwner, Function0<? extends InterfaceC1639870sm9> function0, Function0<? extends InterfaceC1452660nuC> function02, final InterfaceC1640280smo interfaceC1640280smo, InterfaceC1640220smi interfaceC1640220smi, Function1<? super C1644510std, Unit> function1) {
        ViewGroup viewGroup2;
        InterfaceC1644700stw interfaceC1644700stw;
        Function1<? super View, Unit> function12;
        InterfaceC1644620sto interfaceC1644620stoLJIILLIIL;
        AbstractC21674919sB abstractC21674919sB;
        Function1<? super C1643380sro, Unit> function13;
        C1643380sro c1643380sro;
        this.LIZ = viewGroup;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = function0;
        this.LIZLLL = function02;
        this.LJ = interfaceC1640220smi;
        this.LJIILLIIL = new C11RK();
        this.LJIIZILJ = new C11RK();
        this.LJIJ = new C11RK();
        this.LJIJI = new C11RK();
        C11NJ c11nj = new C11NJ();
        final C1644510std c1644510std = new C1644510std(0);
        this.LJIJJ = c1644510std;
        C1698120uI6 c1698120uI6 = new C1698120uI6(this, 0);
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LJIL = C452501pT.LIZ(enumC452301pR, new AwS569S0100000_25(this, 1006));
        final FilterListViewSelectionViewModel filterListViewSelectionViewModel = new FilterListViewSelectionViewModel(lifecycleOwner, function0, interfaceC1640280smo, interfaceC1640220smi);
        this.LJJI = filterListViewSelectionViewModel;
        this.LJJIFFI = C452501pT.LIZ(enumC452301pR, new AwS569S0100000_25(this, 1005));
        if (function1 != null) {
            function1.invoke(c1644510std);
        }
        AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(this, 741);
        if (!filterListViewSelectionViewModel.LLIZ.contains(awS604S0100000_25)) {
            filterListViewSelectionViewModel.LLIZ.add(awS604S0100000_25);
        }
        ViewGroup viewGroup3 = (ViewGroup) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ux, viewGroup, false);
        this.LJFF = viewGroup3;
        C19733912Iv c19733912Iv = (C19733912Iv) viewGroup3.findViewById(R.id.hxm);
        if (c19733912Iv != null && (function13 = c1644510std.LJFF.LIZ) != null && (c1643380sro = c19733912Iv.LL) != null) {
            function13.invoke(c1643380sro);
            c19733912Iv.setBackground(c1643380sro.LIZ());
            c19733912Iv.invalidate();
        }
        ViewGroup viewGroup4 = this.LJFF;
        ?? r3 = (ViewGroup) (viewGroup4 == null ? null : viewGroup4).findViewById(R.id.mfw);
        if (c1644510std.LJIIIZ) {
            ViewGroup viewGroup5 = this.LJFF;
            TuxIconView tuxIconView = new TuxIconView(new C1361400lX0((viewGroup5 == null ? null : viewGroup5).getContext(), R.style.y0), null, 0, 6, null);
            tuxIconView.setId(R.id.kg8);
            tuxIconView.setIconRes(R.raw.icon_block);
            tuxIconView.setTintColorRes(R.attr.a1k);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            layoutParams.addRule(15);
            C786410Ut5.M6(tuxIconView, layoutParams);
            C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            r3.addView(tuxIconView, 0);
            viewGroup2 = null;
        } else {
            ViewGroup viewGroup6 = this.LJFF;
            viewGroup2 = null;
            C19736412Ju c19736412Ju = new C19736412Ju((viewGroup6 == null ? null : viewGroup6).getContext(), null, 6, 0);
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
        ViewGroup viewGroup7 = this.LJFF;
        C19561611g6 c19561611g6 = (C19561611g6) (viewGroup7 == null ? viewGroup2 : viewGroup7).findViewById(R.id.hyh);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(c19561611g6.getLayoutParams().width, c19561611g6.getLayoutParams().height);
        layoutParams3.addRule(1, R.id.kg8);
        layoutParams3.addRule(17, R.id.kg8);
        C786410Ut5.p7(c19561611g6, layoutParams3);
        ViewGroup viewGroup8 = this.LJFF;
        viewGroup.addView(viewGroup8 == null ? viewGroup2 : viewGroup8);
        ViewGroup viewGroup9 = this.LJFF;
        viewGroup9 = viewGroup9 == null ? viewGroup2 : viewGroup9;
        InterfaceC1644640stq interfaceC1644640stqInvoke = c1644510std.LJI.LJ.invoke(viewGroup9, viewGroup9.findViewById(R.id.w4x));
        this.LJIIJJI = interfaceC1644640stqInvoke;
        C11ON c11onLIZ = (interfaceC1644640stqInvoke == null ? viewGroup2 : interfaceC1644640stqInvoke).LIZ();
        AfS194S0100000_25 afS194S0100000_25 = new AfS194S0100000_25(this, 186);
        C1701960uOI c1701960uOI = C19487811Me.LJ;
        c11nj.LIZ(c11onLIZ.LJJLL(afS194S0100000_25, c1701960uOI));
        ViewGroup viewGroup10 = this.LJFF;
        viewGroup2 = viewGroup10 != null ? viewGroup10 : viewGroup2;
        final RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.hyb);
        recyclerView.setLayoutManager(new ScrollCenterLayoutManager(viewGroup2.getContext()));
        final C19YA c19ya = (C19YA) viewGroup2.findViewById(R.id.hyh);
        c19ya.setTabMode(1);
        if (c1644510std.LJIIJ) {
            c19ya.setTabMargin(4);
        } else {
            c19ya.setTabMargin(12);
        }
        Function1<? super C19YA, Unit> function14 = c1644510std.LJFF.LJ;
        if (function14 != null) {
            function14.invoke(c19ya);
        }
        if (C2281551ESb.LIZIZ.LIZIZ()) {
            AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
            if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
                abstractC21674919sB.LLIZ = false;
            }
        }
        if (!c1644510std.LJFF.LIZIZ) {
            InterfaceC1644640stq interfaceC1644640stq = this.LJIIJJI;
            c11nj.LIZ((interfaceC1644640stq == null ? null : interfaceC1644640stq).W0().LJJLL(new AfS159S0200000_25(recyclerView, this, 14), C09HN.LIZ));
        }
        final FilterListViewStateViewModel filterListViewStateViewModel = new FilterListViewStateViewModel(lifecycleOwner, function0);
        final C1640000smM c1640000smM = c1644510std.LJFF.LJI;
        boolean z = false;
        final ?? r14 = new C1640100smW(this, recyclerView, lifecycleOwner, filterListViewSelectionViewModel, filterListViewStateViewModel, c1640000smM, c1644510std) { // from class: X.0smb
            {
                AFwS347S0000000_25 aFwS347S0000000_25 = C1640100smW.LJIILL;
            }
        };
        this.LJI = new C1643970ssl(r14, c19ya, interfaceC1640280smo) { // from class: X.0ssr
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
                Function1<? super View, Unit> function15 = this.LJIIIZ.LJIJJ.LJFF.LJFF;
                if (function15 != null) {
                    function15.invoke(c1642680sqgLJIIZILJ);
                }
                return c1642680sqgLJIIZILJ;
            }
        };
        c11nj.LIZ(LJIILLIIL().LJIIJJI().LJJLL(new AfS194S0100000_25(this, 197), c1701960uOI));
        c11nj.LIZ(LJIILLIIL().LIZLLL().LJJLL(new AfS194S0100000_25(this, 198), c1701960uOI));
        c11nj.LIZ(LJIILLIIL().LIZ().LJJLL(new AfS194S0100000_25(this, 199), c1701960uOI));
        c11nj.LIZ(LJIILLIIL().LJII().LJJLL(new AfS194S0100000_25(this, 200), c1701960uOI));
        ViewGroup viewGroup11 = this.LJFF;
        View viewFindViewById = (viewGroup11 == null ? null : viewGroup11).findViewById(R.id.u0f);
        Function1<? super SeekBar, Unit> function15 = c1644510std.LJFF.LIZLLL;
        if (function15 != null) {
            function15.invoke(viewFindViewById);
        }
        InterfaceC1644690stv interfaceC1644690stvInvoke = c1644510std.LJI.LIZ.invoke(viewFindViewById);
        this.LJII = interfaceC1644690stvInvoke;
        interfaceC1644690stvInvoke = interfaceC1644690stvInvoke == null ? null : interfaceC1644690stvInvoke;
        if (c1644510std.LIZ && (interfaceC1644620stoLJIILLIIL = LJIILLIIL()) != null && interfaceC1644620stoLJIILLIIL.LIZJ() != null && this.LJIILIIL != null) {
            z = true;
        }
        interfaceC1644690stvInvoke.setVisibility(z);
        if (c1644510std.LIZ) {
            InterfaceC1644690stv interfaceC1644690stv = this.LJII;
            C786410Ut5.wb((interfaceC1644690stv == null ? null : interfaceC1644690stv).getSeekBar(), c1698120uI6);
        }
        ViewGroup viewGroup12 = this.LJFF;
        viewGroup12 = viewGroup12 == null ? null : viewGroup12;
        InterfaceC1644650str interfaceC1644650strInvoke = c1644510std.LJI.LIZIZ.invoke(viewGroup12.findViewById(R.id.kg8), viewGroup12.findViewById(R.id.wyx));
        this.LJIIIIZZ = interfaceC1644650strInvoke;
        (interfaceC1644650strInvoke == null ? null : interfaceC1644650strInvoke).setEnable(c1644510std.LIZIZ);
        if (c1644510std.LIZIZ) {
            InterfaceC1644650str interfaceC1644650str = this.LJIIIIZZ;
            (interfaceC1644650str == null ? null : interfaceC1644650str).LIZIZ(new ACListenerS159S0100000_25(this, 72));
            ViewGroup viewGroup13 = this.LJFF;
            C1652270t69.LIZIZ(48.0f, 48.0f, (viewGroup13 == null ? null : viewGroup13).findViewById(R.id.kg8));
            ViewGroup viewGroup14 = this.LJFF;
            View viewFindViewById2 = (viewGroup14 == null ? null : viewGroup14).findViewById(R.id.wyx);
            if (viewFindViewById2 != null && (function12 = c1644510std.LJFF.LJII) != null) {
                function12.invoke(viewFindViewById2);
            }
        }
        InterfaceC1644680stu interfaceC1644680stuInvoke = c1644510std.LJI.LIZJ.invoke(viewGroup.getContext(), LJIILLIIL());
        this.LJIIIZ = interfaceC1644680stuInvoke;
        if (c1644510std.LIZJ) {
            (interfaceC1644680stuInvoke == null ? null : interfaceC1644680stuInvoke).LIZ();
            InterfaceC1644680stu interfaceC1644680stu = this.LJIIIZ;
            (interfaceC1644680stu == null ? null : interfaceC1644680stu).LIZIZ(new ACListenerS159S0100000_25(this, 73));
        }
        ViewGroup viewGroup15 = this.LJFF;
        InterfaceC1644710stx interfaceC1644710stxInvoke = c1644510std.LJI.LIZLLL.invoke((viewGroup15 == null ? null : viewGroup15).findViewById(R.id.w7p));
        this.LJIIJ = interfaceC1644710stxInvoke;
        if (c1644510std.LIZLLL) {
            (interfaceC1644710stxInvoke == null ? null : interfaceC1644710stxInvoke).LIZ(new ACListenerS159S0100000_25(this, 74));
        }
        InterfaceC1644640stq interfaceC1644640stq2 = this.LJIIJJI;
        (interfaceC1644640stq2 == null ? null : interfaceC1644640stq2).V0();
        ViewGroup viewGroup16 = this.LJFF;
        InterfaceC1644700stw interfaceC1644700stwInvoke = c1644510std.LJI.LJFF.invoke((viewGroup16 == null ? null : viewGroup16).findViewById(R.id.hx9));
        this.LJIIL = interfaceC1644700stwInvoke;
        if (interfaceC1644700stwInvoke == null) {
            interfaceC1644700stw = null;
        } else {
            interfaceC1644700stw = interfaceC1644700stwInvoke;
        }
        boolean z2 = c1644510std.LJII;
        if (z2) {
            (interfaceC1644700stwInvoke == null ? null : interfaceC1644700stwInvoke).LIZ(new ACListenerS159S0100000_25(this, 71));
        }
        interfaceC1644700stw.setEnable(z2);
    }

    public /* synthetic */ C1644490stb(ViewGroup viewGroup, LifecycleOwner lifecycleOwner, Function0 function0, Function0 function02, InterfaceC1640280smo interfaceC1640280smo, Function1 function1, int i) {
        this(viewGroup, lifecycleOwner, (Function0<? extends InterfaceC1639870sm9>) function0, (Function0<? extends InterfaceC1452660nuC>) ((i & 8) != 0 ? AFwS214S0000000_25.get$arr$(532) : function02), (i & 16) != 0 ? null : interfaceC1640280smo, (InterfaceC1640220smi) null, (Function1<? super C1644510std, Unit>) ((i & 64) == 0 ? function1 : null));
    }
}
