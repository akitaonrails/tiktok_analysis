package X;

import Y.AObserverS227S0100000_25;
import Y.AsS0S0111000_25;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
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
import kotlin.text.u;

/* JADX INFO: renamed from: X.0smX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1640110smX implements InterfaceC1643980ssm {
    public static final AFwS347S0000000_25 LJIILJJIL = AFwS347S0000000_25.get$arr$(25);
    public final RecyclerView LIZ;
    public final LifecycleOwner LIZIZ;
    public final InterfaceC1640170smd LIZJ;
    public final InterfaceC1640160smc LIZLLL;
    public final InterfaceC1631620sYq<InterfaceC1643980ssm, FilterBean, EnumC1641340soW, Unit> LJ;
    public final C1640030smP LJFF;
    public final C1640010smN LJI;
    public final C1640130smZ LJII;
    public Map<FilterBean, ? extends EnumC1641340soW> LJIIIIZZ;
    public FilterBean LJIIIZ;
    public final C11RK LJIIJ;
    public final C11RK LJIIJJI;
    public final C11RK LJIIL;
    public final AwS639S0100000_25 LJIILIIL;

    @Override // X.InterfaceC1643980ssm
    public final C11NZ<FilterBean> LIZLLL() {
        C11RK c11rk = this.LJIIJ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1643980ssm
    public final C11NZ<FilterBean> LJFF() {
        C11RK c11rk = this.LJIIL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1643980ssm
    public final C11NZ<C1641660sp2<C1640210smh>> LJIIJJI() {
        C11RK c11rk = this.LJIIJJI;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1643980ssm
    public final FilterBean LIZJ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1643980ssm
    public final void LJ(FilterBean filterBean) {
        LJIILLIIL(filterBean, new AwS585S0100000_6(this, 363));
    }

    @Override // X.InterfaceC1643980ssm
    public final void LJIILIIL(FilterBean filterBean) {
        LJIILLIIL(filterBean, new AwS585S0100000_6(this, 362));
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
        C1640010smN c1640010smN = this.LJI;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (Object obj : arrayList) {
            EnumC1641340soW enumC1641340soW = this.LJIIIIZZ.get(obj);
            if (enumC1641340soW == null) {
                enumC1641340soW = EnumC1641340soW.FILTER_STATE_UNKNOWN;
            }
            arrayList3.add(new Pair(obj, enumC1641340soW));
        }
        c1640010smN.LLLFZ(arrayList3);
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

    public final void LJIIZILJ(C1640210smh c1640210smh) {
        FilterBean filterBean = c1640210smh.LIZ;
        LJIILIIL(filterBean);
        FilterBean filterBean2 = this.LJIIIZ;
        if (filterBean2 == null && filterBean == null) {
            return;
        }
        this.LJIIIZ = filterBean;
        AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(this, 759);
        if (!C1638720skI.LIZIZ(filterBean, filterBean2)) {
            awS604S0100000_25.invoke(filterBean2);
            awS604S0100000_25.invoke(filterBean);
        }
        this.LJIIJJI.onNext(C1641650sp1.LIZ(c1640210smh));
    }

    @Override // X.InterfaceC1643980ssm
    public final void LJI(C1640210smh c1640210smh, boolean z) {
        LJIILIIL(c1640210smh.LIZ);
        InterfaceC1640170smd interfaceC1640170smd = this.LIZJ;
        if (interfaceC1640170smd != null) {
            interfaceC1640170smd.uA(c1640210smh);
        } else {
            LJIIZILJ(c1640210smh);
        }
    }

    @Override // X.InterfaceC1643980ssm
    public final void LJIIJ(FilterBean filterBean, boolean z) {
        LJI(new C1640210smh(filterBean, false, false, 14), z);
    }

    public final void LJIILLIIL(FilterBean filterBean, Function1<? super Integer, Unit> function1) {
        if (filterBean != null) {
            Iterator it2 = ((ArrayList) getData()).iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (C1638720skI.LIZIZ(filterBean, (FilterBean) ((Pair) it2.next()).getFirst())) {
                    if (i >= 0) {
                        function1.invoke(Integer.valueOf(LLLIIIIL(i)));
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0smN] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0smZ, X.19ry] */
    public C1640110smX(LifecycleOwner lifecycleOwner, RecyclerView recyclerView, InterfaceC1640170smd interfaceC1640170smd, InterfaceC1640160smc interfaceC1640160smc, C1644520ste c1644520ste, C1644500stc c1644500stc, C1640030smP c1640030smP, InterfaceC1631620sYq interfaceC1631620sYq) {
        MutableLiveData mutableLiveDataAM2;
        MutableLiveData mutableLiveDataCK0;
        C19517811Xs c19517811Xs;
        C19517811Xs c19517811Xs2;
        this.LIZ = recyclerView;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = interfaceC1640170smd;
        this.LIZLLL = interfaceC1640160smc;
        this.LJ = interfaceC1631620sYq;
        this.LJFF = c1640030smP;
        final ?? r0 = new AbstractC1640090smV<Pair<? extends FilterBean, ? extends EnumC1641340soW>>() { // from class: X.0smN
            /* JADX WARN: Removed duplicated region for block: B:39:0x016b  */
            @Override // X.AbstractC21673619ry
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r17, int r18) {
                /*
                    Method dump skipped, instruction units count: 404
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1640010smN.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                C1640110smX c1640110smX = this.LLILLJJLI;
                AwS639S0100000_25 awS639S0100000_25 = c1640110smX.LJIILIIL;
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f864u4, viewGroup, false);
                C1662870tNF c1662870tNFLIZ = C1641140soC.LIZ(viewTd.getContext(), c1640110smX.LJFF.LIZLLL, new AwS391S0200000_25(viewTd, c1640110smX, 332));
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1662870tNFLIZ);
                c1662870tNFLIZ.setLayoutParams(layoutParams);
                c1662870tNFLIZ.setId(R.id.l2j);
                ((ViewGroup) viewTd.findViewById(R.id.l1p)).addView(c1662870tNFLIZ, 0);
                C1640020smO c1640020smO = new C1640020smO(viewTd, c1640110smX.LJFF, awS639S0100000_25);
                try {
                    View view = c1640020smO.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c1640020smO.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c1640020smO.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C1640020smO.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c1640020smO.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c1640020smO.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C1640020smO.class.getName();
                return c1640020smO;
            }
        };
        this.LJI = r0;
        ?? r4 = new AbstractC1640230smj<Unit>(r0) { // from class: X.0smZ
            @Override // X.AbstractC1640230smj
            public final RecyclerView.ViewHolder LLLII(ViewGroup viewGroup) {
                this.LLILZ.getClass();
                return new C1640180sme(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.u3, viewGroup, false));
            }

            @Override // X.AbstractC1640230smj
            public final /* bridge */ /* synthetic */ void LLLI(RecyclerView.ViewHolder viewHolder, Unit unit) {
            }
        };
        this.LJII = r4;
        this.LJIIIIZZ = C2097608Jq.LJ();
        this.LJIIJ = new C11RK();
        this.LJIIJJI = new C11RK();
        this.LJIIL = new C11RK();
        this.LJIILIIL = new AwS639S0100000_25(this, 142);
        boolean z = recyclerView instanceof C19517811Xs;
        if (z && (c19517811Xs2 = (C19517811Xs) recyclerView) != null) {
            c19517811Xs2.setItemShowBorder(c1640030smP.LIZIZ);
        }
        Context context = recyclerView.getContext();
        if (context != null && z && (c19517811Xs = (C19517811Xs) recyclerView) != null) {
            c19517811Xs.setItemMargin((int) C11VU.LIZIZ(c1640030smP.LIZ, context));
        }
        recyclerView.setAdapter(r4);
        LifecycleOwner lifecycleOwner2 = this.LIZIZ;
        if (interfaceC1640160smc != null && (mutableLiveDataCK0 = interfaceC1640160smc.cK0()) != null) {
            mutableLiveDataCK0.observe(lifecycleOwner2, new AObserverS227S0100000_25(this, 125));
        }
        if (interfaceC1640170smd != null && (mutableLiveDataAM2 = interfaceC1640170smd.AM2()) != null) {
            mutableLiveDataAM2.observe(lifecycleOwner2, new AObserverS227S0100000_25(this, 126));
        }
        recyclerView.addOnScrollListener(new AsS0S0111000_25(this, 1));
    }
}
