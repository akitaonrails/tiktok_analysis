package X;

import Y.AObserverS227S0100000_25;
import Y.ARunnableS2S0102000_6;
import Y.AsS0S0111000_25;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS347S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0smW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1640100smW implements InterfaceC1643980ssm {
    public static final AFwS347S0000000_25 LJIILL = AFwS347S0000000_25.get$arr$(24);
    public final RecyclerView LIZ;
    public final LifecycleOwner LIZIZ;
    public final InterfaceC1640170smd LIZJ;
    public final InterfaceC1640160smc LIZLLL;
    public final InterfaceC1631620sYq<InterfaceC1643980ssm, FilterBean, EnumC1641340soW, Unit> LJ;
    public final C1640000smM LJFF;
    public final C1644510std LJI;
    public final C1639960smI LJII;
    public final C1640140sma LJIIIIZZ;
    public Map<FilterBean, ? extends EnumC1641340soW> LJIIIZ;
    public FilterBean LJIIJ;
    public final C11RK LJIIJJI;
    public final C11RK LJIIL;
    public final C11RK LJIILIIL;
    public final AwS639S0100000_25 LJIILJJIL;

    @Override // X.InterfaceC1643980ssm
    public final C11NZ<FilterBean> LIZLLL() {
        C11RK c11rk = this.LJIIJJI;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1643980ssm
    public final C11NZ<FilterBean> LJFF() {
        C11RK c11rk = this.LJIILIIL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1643980ssm
    public final C11NZ<C1641660sp2<C1640210smh>> LJIIJJI() {
        C11RK c11rk = this.LJIIL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1643980ssm
    public final FilterBean LIZJ() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1643980ssm
    public final void LJ(FilterBean filterBean) {
        LJIIZILJ(filterBean, new AwS585S0100000_6(this, 346));
    }

    @Override // X.InterfaceC1643980ssm
    public final void LJIILIIL(FilterBean filterBean) {
        LJIIZILJ(filterBean, new AwS585S0100000_6(this, 345));
    }

    @Override // X.InterfaceC1644000sso
    public final void LJIILJJIL(Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = map.entrySet().iterator();
        int i = 0;
        while (it2.hasNext()) {
            int i2 = i + 1;
            arrayList.addAll((Collection) ((Map.Entry) it2.next()).getValue());
            if (i < map.size() - 1 && (!((Collection) r1.getValue()).isEmpty())) {
                arrayList2.add(new Pair(Integer.valueOf(arrayList.size() - 1), Unit.LIZ));
            }
            i = i2;
        }
        if (this.LJFF.LJI) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (u.LJIJI(((FilterBean) next).getEnName(), "normal", true)) {
                    if (next != null) {
                        arrayList.remove(next);
                        ListProtector.add(arrayList, 0, next);
                    }
                }
            }
        }
        C1639960smI c1639960smI = this.LJII;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (Object obj : arrayList) {
            EnumC1641340soW enumC1641340soW = this.LJIIIZ.get(obj);
            if (enumC1641340soW == null) {
                enumC1641340soW = EnumC1641340soW.FILTER_STATE_UNKNOWN;
            }
            arrayList3.add(new Pair(obj, enumC1641340soW));
        }
        c1639960smI.LLLFZ(arrayList3);
        LLLIL(arrayList2);
        InterfaceC1640160smc interfaceC1640160smc = this.LIZLLL;
        if (interfaceC1640160smc != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator<Map.Entry<EffectCategoryResponse, ? extends List<? extends FilterBean>>> it4 = map.entrySet().iterator();
            while (it4.hasNext()) {
                C19719612Di.LJJI(it4.next().getValue(), arrayList4);
            }
            interfaceC1640160smc.w21(arrayList4);
        }
    }

    public final void LJIJ(C1640210smh c1640210smh) {
        FilterBean filterBean = c1640210smh.LIZ;
        LJIILIIL(filterBean);
        FilterBean filterBean2 = this.LJIIJ;
        this.LJIIJ = filterBean;
        AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(this, 742);
        if (!C1638720skI.LIZIZ(filterBean, filterBean2)) {
            awS604S0100000_25.invoke(filterBean2);
            awS604S0100000_25.invoke(filterBean);
        }
        this.LJIIL.onNext(C1641650sp1.LIZ(c1640210smh));
    }

    public static void LJIILLIIL(C1640100smW c1640100smW, int i) {
        if (c1640100smW.LIZ.getWidth() == 0) {
            HandlerHook.viewPost(c1640100smW.LIZ, new ARunnableS2S0102000_6(c1640100smW, i, 0, 4));
        } else {
            c1640100smW.LIZ.scrollToPosition(i);
        }
    }

    @Override // X.InterfaceC1643980ssm
    public final void LJI(C1640210smh c1640210smh, boolean z) {
        LJIILIIL(c1640210smh.LIZ);
        InterfaceC1640170smd interfaceC1640170smd = this.LIZJ;
        if (interfaceC1640170smd != null) {
            if (z) {
                interfaceC1640170smd.Qm();
            }
            this.LIZJ.uA(c1640210smh);
            return;
        }
        LJIJ(c1640210smh);
    }

    @Override // X.InterfaceC1643980ssm
    public final void LJIIJ(FilterBean filterBean, boolean z) {
        LJI(new C1640210smh(filterBean, false, false, 14), z);
    }

    public final void LJIIZILJ(FilterBean filterBean, Function1<? super Integer, Unit> function1) {
        int iIntValue;
        int iFindFirstCompletelyVisibleItemPosition;
        int iFindLastCompletelyVisibleItemPosition;
        boolean z;
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2;
        if (filterBean != null) {
            Iterator it2 = ((ArrayList) getData()).iterator();
            boolean z2 = false;
            int i = 0;
            while (true) {
                String categoryKey = null;
                if (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    if (C1638720skI.LIZIZ(filterBean, (FilterBean) pair.getFirst())) {
                        FilterBean filterBean2 = (FilterBean) pair.getFirst();
                        C1644510std c1644510std = this.LJI;
                        if (c1644510std == null || !c1644510std.LJIIJ) {
                            break;
                        }
                        String categoryKey2 = filterBean.getCategoryKey();
                        if (filterBean2 != null) {
                            categoryKey = filterBean2.getCategoryKey();
                        }
                        if (Intrinsics.LJFF(categoryKey2, categoryKey)) {
                            break;
                        }
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() != -1) {
                iIntValue = numValueOf.intValue();
            } else {
                Iterator it3 = ((ArrayList) getData()).iterator();
                iIntValue = 0;
                while (it3.hasNext()) {
                    if (!C1638720skI.LIZJ(filterBean, (FilterBean) ((Pair) it3.next()).getFirst())) {
                        iIntValue++;
                    }
                }
                return;
            }
            if (iIntValue >= 0) {
                C1644510std c1644510std2 = this.LJI;
                if (c1644510std2 != null && c1644510std2.LJIIJJI) {
                    RecyclerView.LayoutManager layoutManager = this.LIZ.getLayoutManager();
                    if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager) != null) {
                        iFindFirstCompletelyVisibleItemPosition = linearLayoutManager2.findFirstCompletelyVisibleItemPosition();
                    } else {
                        iFindFirstCompletelyVisibleItemPosition = 0;
                    }
                    RecyclerView.LayoutManager layoutManager2 = this.LIZ.getLayoutManager();
                    if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager2) != null) {
                        iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                    } else {
                        iFindLastCompletelyVisibleItemPosition = 0;
                    }
                    if (iFindFirstCompletelyVisibleItemPosition == 0 && iIntValue <= iFindLastCompletelyVisibleItemPosition / 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    RecyclerView.LayoutManager layoutManager3 = this.LIZ.getLayoutManager();
                    if ((layoutManager3 instanceof LinearLayoutManager) && layoutManager3 != null && iFindLastCompletelyVisibleItemPosition + 1 == layoutManager3.getItemCount() && (getItemCount() - 1) - iIntValue <= (iFindLastCompletelyVisibleItemPosition - iFindFirstCompletelyVisibleItemPosition) / 2) {
                        z2 = true;
                    }
                    if (!z && !z2) {
                        function1.invoke(Integer.valueOf(LLLIIIIL(iIntValue)));
                        return;
                    }
                    return;
                }
                function1.invoke(Integer.valueOf(LLLIIIIL(iIntValue)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0smI] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0sma, X.19ry] */
    public C1640100smW(LifecycleOwner lifecycleOwner, RecyclerView recyclerView, C1640000smM c1640000smM, C1644510std c1644510std, C1644490stb c1644490stb, InterfaceC1640170smd interfaceC1640170smd, InterfaceC1640160smc interfaceC1640160smc, InterfaceC1631620sYq interfaceC1631620sYq) {
        MutableLiveData mutableLiveDataAM2;
        MutableLiveData mutableLiveDataCK0;
        C19517811Xs c19517811Xs;
        C19517811Xs c19517811Xs2;
        this.LIZ = recyclerView;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = interfaceC1640170smd;
        this.LIZLLL = interfaceC1640160smc;
        this.LJ = interfaceC1631620sYq;
        this.LJFF = c1640000smM;
        this.LJI = c1644510std;
        final ?? r0 = new AbstractC1640090smV<Pair<? extends FilterBean, ? extends EnumC1641340soW>>() { // from class: X.0smI
            /* JADX WARN: Removed duplicated region for block: B:45:0x0197  */
            /* JADX WARN: Type inference failed for: r14v0 */
            /* JADX WARN: Type inference failed for: r14v1 */
            /* JADX WARN: Type inference failed for: r14v2, types: [X.05Vn, X.099V, kotlin.coroutines.CoroutineContext] */
            /* JADX WARN: Type inference failed for: r14v3 */
            @Override // X.AbstractC21673619ry
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r19, int r20) {
                /*
                    Method dump skipped, instruction units count: 488
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1639960smI.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                boolean z;
                int iLIZIZ;
                C1640100smW c1640100smW = this.LLILLJJLI;
                AwS639S0100000_25 awS639S0100000_25 = c1640100smW.LJIILJJIL;
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f864u4, viewGroup, false);
                C1662870tNF c1662870tNFLIZ = C1641140soC.LIZ(viewTd.getContext(), c1640100smW.LJFF.LIZLLL, new AwS391S0200000_25(viewTd, c1640100smW, 328));
                C1644510std c1644510std2 = c1640100smW.LJI;
                if (c1644510std2 != null && c1644510std2.LJIIJ) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    iLIZIZ = (int) C11VU.LIZIZ(60.0f, viewTd.getContext());
                } else {
                    iLIZIZ = -2;
                }
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(iLIZIZ, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1662870tNFLIZ);
                c1662870tNFLIZ.setLayoutParams(layoutParams);
                c1662870tNFLIZ.setId(R.id.l2j);
                ((ViewGroup) viewTd.findViewById(R.id.l1p)).addView(c1662870tNFLIZ, 0);
                C1639970smJ c1639970smJ = new C1639970smJ(viewTd, c1640100smW.LJFF, awS639S0100000_25);
                try {
                    View view = c1639970smJ.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c1639970smJ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c1639970smJ.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C1639970smJ.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c1639970smJ.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c1639970smJ.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C1639970smJ.class.getName();
                return c1639970smJ;
            }
        };
        this.LJII = r0;
        ?? r4 = new AbstractC1640230smj<Unit>(r0) { // from class: X.0sma
            @Override // X.AbstractC1640230smj
            public final RecyclerView.ViewHolder LLLII(ViewGroup viewGroup) {
                this.LLILZ.getClass();
                return new C1640180sme(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.u3, viewGroup, false));
            }

            @Override // X.AbstractC1640230smj
            public final /* bridge */ /* synthetic */ void LLLI(RecyclerView.ViewHolder viewHolder, Unit unit) {
            }
        };
        this.LJIIIIZZ = r4;
        this.LJIIIZ = C2097608Jq.LJ();
        this.LJIIJJI = new C11RK();
        this.LJIIL = new C11RK();
        this.LJIILIIL = new C11RK();
        this.LJIILJJIL = new AwS639S0100000_25(this, 139);
        boolean z = recyclerView instanceof C19517811Xs;
        if (z && (c19517811Xs2 = (C19517811Xs) recyclerView) != null) {
            c19517811Xs2.setItemShowBorder(c1640000smM.LIZIZ);
        }
        Context context = recyclerView.getContext();
        if (context != null && z && (c19517811Xs = (C19517811Xs) recyclerView) != null) {
            c19517811Xs.setItemMargin((int) C11VU.LIZIZ(c1640000smM.LIZ, context));
        }
        recyclerView.setAdapter(r4);
        LifecycleOwner lifecycleOwner2 = this.LIZIZ;
        if (interfaceC1640160smc != null && (mutableLiveDataCK0 = interfaceC1640160smc.cK0()) != null) {
            mutableLiveDataCK0.observe(lifecycleOwner2, new AObserverS227S0100000_25(this, 120));
        }
        if (interfaceC1640170smd != null && (mutableLiveDataAM2 = interfaceC1640170smd.AM2()) != null) {
            mutableLiveDataAM2.observe(lifecycleOwner2, new AObserverS227S0100000_25(this, 121));
        }
        recyclerView.addOnScrollListener(new AsS0S0111000_25(this, 0));
    }
}
