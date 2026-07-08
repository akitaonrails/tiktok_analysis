package X;

import Y.AObserverS227S0100000_25;
import Y.ARunnableS125S0100000_25;
import Y.AfS194S0100000_25;
import Y.AsS51S0100000_25;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0sn0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1640400sn0<DATA> implements InterfaceC1640870snl<DATA> {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final InterfaceC1640330smt<DATA> LIZJ;
    public final InterfaceC1640420sn2<DATA> LIZLLL;
    public final ViewGroup LJ;
    public final int LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final C1640060smS LJIIJ;
    public View LJIIJJI;
    public RecyclerView LJIIL;
    public InterfaceC1640430sn3<EnumC1641470soj> LJIILIIL;
    public AbstractC1640090smV<C1634100scq<DATA, EnumC1641420soe, Integer>> LJIILJJIL;
    public C1640380smy LJIILL;
    public Map<DATA, ? extends Pair<? extends EnumC1641420soe, Integer>> LJIILLIIL;
    public final C11RK LJIIZILJ;
    public final C11RK LJIJ;
    public final C11RK LJIJI;
    public final C11RK LJIJJ;
    public final C11RK LJIJJLI;
    public final C11RK LJIL;
    public final C11RK LJJ;
    public final C11RK LJJI;
    public final C11RK LJJIFFI;
    public final C11RK LJJII;
    public String LJJIII;
    public boolean LJJIIJ;
    public final C11NJ LJJIIJZLJL;
    public final AwS674S0100000_25 LJJIIZ;
    public final C01GW LJJIIZI;
    public boolean LJJIJ;
    public boolean LJJIJIIJI;
    public AwS569S0100000_25 LJJIJIIJIL;

    public abstract void LIZJ(RecyclerView.ViewHolder viewHolder, int i, DATA data, EnumC1641420soe enumC1641420soe, Integer num);

    public abstract RecyclerView.ViewHolder LJFF(ViewGroup viewGroup, int i, AwS674S0100000_25 awS674S0100000_25);

    @Override // X.InterfaceC1640870snl
    public void vw() {
        this.LJJIJIIJI = false;
        InterfaceC1640330smt<DATA> interfaceC1640330smt = this.LIZJ;
        if (interfaceC1640330smt != null) {
            interfaceC1640330smt.he().removeObservers(LJIIIZ());
            interfaceC1640330smt.LJJIJ().removeObservers(LJIIIZ());
            interfaceC1640330smt.getLoadMoreState().removeObservers(LJIIIZ());
        }
        InterfaceC1640420sn2<DATA> interfaceC1640420sn2 = this.LIZLLL;
        if (interfaceC1640420sn2 != null) {
            interfaceC1640420sn2.nN1().removeObservers(LJIIIZ());
            interfaceC1640420sn2.KI1().removeObservers(LJIIIZ());
            interfaceC1640420sn2.V60().removeObservers(LJIIIZ());
        }
        ((C1629670sVh) this.LJJIIZI.getValue()).LIZJ();
        if (this.LJJIIJZLJL.LLILLJJLI) {
            return;
        }
        this.LJJIIJZLJL.dispose();
    }

    public Function0<Integer> LJI() {
        return AFwS214S0000000_25.get$arr$(490);
    }

    public final View LJII() {
        View view = this.LJIIJJI;
        if (view != null) {
            return view;
        }
        return null;
    }

    public final AbstractC1640090smV<C1634100scq<DATA, EnumC1641420soe, Integer>> LJIIIIZZ() {
        AbstractC1640090smV<C1634100scq<DATA, EnumC1641420soe, Integer>> abstractC1640090smV = this.LJIILJJIL;
        if (abstractC1640090smV != null) {
            return abstractC1640090smV;
        }
        return null;
    }

    public final RecyclerView LJIIJJI() {
        RecyclerView recyclerView = this.LJIIL;
        if (recyclerView != null) {
            return recyclerView;
        }
        return null;
    }

    public void LJIILJJIL() {
        this.LJIIJJI = LJJII(this.LJ);
        RecyclerView recyclerViewLJJIIZ = LJJIIZ(LJII());
        Function1<? super RecyclerView, Unit> function1 = this.LJIIJ.LIZIZ;
        if (function1 != null) {
            function1.invoke(recyclerViewLJJIIZ);
        }
        this.LJIIL = recyclerViewLJJIIZ;
        C1636150sg9 c1636150sg9LJJIIJZLJL = LJJIIJZLJL(LJII());
        Function2<? super InterfaceC1640430sn3<EnumC1641470soj>, ? super Function0<Unit>, Unit> function2 = this.LJIIJ.LIZ;
        if (function2 != null) {
            function2.invoke(c1636150sg9LJJIIJZLJL, new AwS569S0100000_25(this, 906));
        }
        this.LJIILIIL = c1636150sg9LJJIIJZLJL;
        this.LJIILJJIL = LJJIII();
        LJIIJJI().setAdapter(LJJIFFI());
        C0DXR c0dxrLJJIIJ = LJJIIJ();
        if (c0dxrLJJIIJ != null) {
            LJIIJJI().addItemDecoration(c0dxrLJJIIJ);
        }
        C1640380smy c1640380smy = this.LJIILL;
        if (c1640380smy != null) {
            c1640380smy.LLILZIL = new C1640370smx(this);
        }
        LJIIJJI().addOnScrollListener(new AsS51S0100000_25(this, 4));
        LJIIJJI().addOnChildAttachStateChangeListener(new InterfaceC21676519sR(this) { // from class: X.0sn1
            public final /* synthetic */ AbstractC1640400sn0<DATA> LL;

            @Override // X.InterfaceC21676519sR
            public final void m3(View view) {
            }

            {
                this.LL = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC21676519sR
            public final void g5(View view) {
                int childAdapterPosition = this.LL.LJIIJJI().getChildAdapterPosition(view);
                C1634100scq c1634100scq = (C1634100scq) C13LP.LJJJLZIJ(this.LL.LJIILLIIL(childAdapterPosition), this.LL.LJIIIIZZ().getData());
                if (c1634100scq != null) {
                    this.LL.LJJI.onNext(new Pair(c1634100scq.LIZ, Integer.valueOf(childAdapterPosition + 1)));
                }
            }
        });
    }

    public final C19475711Hn LJIIZILJ() {
        return new C19475711Hn(this.LJJI.LJI(500L, TimeUnit.MILLISECONDS).LJJIL(new InterfaceC19483011Ki() { // from class: X.08Bp
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return !((List) obj).isEmpty();
            }
        }));
    }

    public final C19475711Hn LJIJJ() {
        C11RK c11rk = this.LJJII;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final C19475711Hn LJIJJLI() {
        C11RK c11rk = this.LJIJJLI;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final C19475711Hn LJIL() {
        C11RK c11rk = this.LJIJI;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final C19475711Hn LJJ() {
        C11RK c11rk = this.LJIJ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public void LJJI() {
        LinearLayoutManager linearLayoutManager;
        if (this.LJIIIIZZ && LJIILL(LJIIJJI())) {
            RecyclerView.LayoutManager layoutManager = LJIIJJI().getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int iLJIILLIIL = LJIILLIIL(linearLayoutManager.findFirstVisibleItemPosition());
            int iLJIILLIIL2 = LJIILLIIL(linearLayoutManager.findLastVisibleItemPosition());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BaseInfoStickerListView -> onVisibleDataUpdate -> first = ");
            sbLIZ.append(iLJIILLIIL);
            sbLIZ.append(", last = ");
            sbLIZ.append(iLJIILLIIL2);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (iLJIILLIIL < iLJIILLIIL2 && iLJIILLIIL <= iLJIILLIIL2) {
                int i = iLJIILLIIL;
                while (true) {
                    C1634100scq c1634100scq = (C1634100scq) C13LP.LJJJLZIJ(i, LJIIIIZZ().getData());
                    if (c1634100scq != null) {
                        arrayList.add(c1634100scq.LIZ);
                    }
                    if (i == iLJIILLIIL2) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.LJJ.onNext(new Pair(arrayList, Integer.valueOf(iLJIILLIIL)));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0smy, X.19ry<androidx.recyclerview.widget.RecyclerView$ViewHolder>] */
    public AbstractC21673619ry<RecyclerView.ViewHolder> LJJIFFI() {
        if (!this.LJII) {
            return LJIIIIZZ();
        }
        final AbstractC1640090smV<C1634100scq<DATA, EnumC1641420soe, Integer>> abstractC1640090smVLJIIIIZZ = LJIIIIZZ();
        ?? r1 = new AbstractC1640360smw(abstractC1640090smVLJIIIIZZ) { // from class: X.0smy
            @Override // X.AbstractC1640360smw
            public final RecyclerView.ViewHolder LLLII(ViewGroup viewGroup) {
                return this.LLILZLL.LJ(viewGroup);
            }

            @Override // X.AbstractC1640360smw
            public final void LLLI(RecyclerView.ViewHolder viewHolder, EnumC1641470soj enumC1641470soj) {
                this.LLILZLL.LIZIZ(viewHolder, enumC1641470soj);
            }
        };
        this.LJIILL = r1;
        return r1;
    }

    public AbstractC1640090smV<C1634100scq<DATA, EnumC1641420soe, Integer>> LJJIII() {
        return new AbstractC1640090smV<C1634100scq<DATA, EnumC1641420soe, Integer>>() { // from class: X.0smQ
            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                C1634100scq<DATA, EnumC1641420soe, Integer> c1634100scqLJJLIIIJJI = LJJLIIIJJI(i);
                this.LLILLJJLI.LIZJ(viewHolder, i, c1634100scqLJJLIIIJJI.LIZ, c1634100scqLJJLIIIJJI.LIZIZ, c1634100scqLJJLIIIJJI.LIZJ);
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                AbstractC1640400sn0<DATA> abstractC1640400sn0 = this.LLILLJJLI;
                RecyclerView.ViewHolder viewHolderLJFF = abstractC1640400sn0.LJFF(viewGroup, i, abstractC1640400sn0.LJJIIZ);
                Function1<? super RecyclerView.ViewHolder, Unit> function1 = this.LLILLJJLI.LJIIJ.LIZJ;
                if (function1 != null) {
                    function1.invoke(viewHolderLJFF);
                }
                if (viewHolderLJFF != null) {
                    try {
                        View view = viewHolderLJFF.itemView;
                        if (view != null) {
                            view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                viewHolderLJFF.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (viewHolderLJFF.itemView.getParent() != null) {
                        boolean zLIZ = true;
                        try {
                            SettingsManager.LIZLLL().getClass();
                            zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (zLIZ) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(viewHolderLJFF.getClass().getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) viewHolderLJFF.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(viewHolderLJFF.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = viewHolderLJFF.getClass().getName();
                return viewHolderLJFF;
            }
        };
    }

    @Override // X.InterfaceC1640870snl
    public final void loadData() {
        InterfaceC1640330smt<DATA> interfaceC1640330smt = this.LIZJ;
        if (interfaceC1640330smt != null) {
            interfaceC1640330smt.X1();
        }
        this.LJJIFFI.onNext(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // X.InterfaceC1640870snl
    public final void uw() {
        if (!this.LJJIJ || this.LJJIJIIJI) {
            return;
        }
        LJIILIIL(LJIIIZ());
    }

    @Override // X.InterfaceC1640870snl
    public C11NZ<C1634100scq<DATA, Integer, EnumC1641420soe>> ww() {
        C11RK c11rk = this.LJIIZILJ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1640870snl
    public C11NZ<Pair<List<DATA>, Integer>> xw() {
        C11RK c11rk = this.LJJ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final void LJIIL() {
        LJIILJJIL();
        if (this.LJJIJ || !this.LJIIIZ) {
            LJIILIIL(LJIIIZ());
        }
    }

    public C0DXR LJJIIJ() {
        if (C300240Bpm.LIZ()) {
            return new C1337790kuv(LJIIJ(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(12.0f))), LJI());
        }
        return null;
    }

    @Override // X.InterfaceC1640870snl
    public final void LLIZLLLIL() {
        AbstractC1640090smV<C1634100scq<DATA, EnumC1641420soe, Integer>> abstractC1640090smVLJIIIIZZ = LJIIIIZZ();
        if (abstractC1640090smVLJIIIIZZ != null) {
            ((ArrayList) abstractC1640090smVLJIIIIZZ.LL).clear();
            abstractC1640090smVLJIIIIZZ.notifyDataSetChanged();
        }
        InterfaceC1640330smt<DATA> interfaceC1640330smt = this.LIZJ;
        if (interfaceC1640330smt != null) {
            interfaceC1640330smt.LLIZLLLIL();
        }
    }

    @Override // X.InterfaceC1640870snl
    public final View yw() {
        return LJII();
    }

    public LifecycleOwner LJIIIZ() {
        return this.LIZIZ;
    }

    public int LJIIJ() {
        return this.LJFF;
    }

    public static boolean LJIILL(RecyclerView recyclerView) {
        int i;
        int i2;
        Rect rect = new Rect();
        recyclerView.getGlobalVisibleRect(rect);
        IntRange intRange = new IntRange(0, C497820Jfg.LIZIZ(recyclerView.getContext()));
        IntRange intRange2 = new IntRange(0, C497820Jfg.LIZ(recyclerView.getContext()) + C497820Jfg.LIZJ(recyclerView.getContext()));
        int i3 = intRange.LLILLJJLI;
        int i4 = rect.left;
        if (i4 < 0 || i4 > i3 || (i = rect.right) < 0 || i > i3) {
            return false;
        }
        int i5 = intRange2.LLILLJJLI;
        int i6 = rect.top;
        if (i6 < 0 || i6 > i5 || (i2 = rect.bottom) < 0 || i2 > i5) {
            return false;
        }
        return true;
    }

    public RecyclerView.ViewHolder LJ(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(this, 655);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EnumC1641470soj.LOADING, AFwS232S0000000_4.get$arr$(197));
        linkedHashMap.put(EnumC1641470soj.EMPTY, new AwS580S0100000_1((Function1) null, (Function1<? super String, Unit>) 544));
        linkedHashMap.put(EnumC1641470soj.ERROR, new AwS580S0100000_1(awS604S0100000_25, (Function1<? super String, Unit>) 545));
        C1636150sg9 c1636150sg9 = new C1636150sg9(context, linkedHashMap, EnumC1641470soj.NONE);
        C786410Ut5.q7(c1636150sg9, new RecyclerView.LayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.ait)));
        return new C1640180sme(c1636150sg9);
    }

    public void LJIILIIL(LifecycleOwner lifecycleOwner) {
        MutableLiveData mutableLiveDataV60;
        MutableLiveData mutableLiveDataKI1;
        MutableLiveData mutableLiveDataNN1;
        InterfaceC1640330smt<DATA> interfaceC1640330smt;
        LiveData<EnumC1641470soj> loadMoreState;
        LiveData<EnumC1641470soj> liveDataLJJIJ;
        LiveData<List<DATA>> liveDataHe;
        this.LJJIJIIJI = true;
        InterfaceC1640330smt<DATA> interfaceC1640330smt2 = this.LIZJ;
        if (interfaceC1640330smt2 != null && (liveDataHe = interfaceC1640330smt2.he()) != null) {
            liveDataHe.observe(lifecycleOwner, new AObserverS227S0100000_25(this, 100));
        }
        InterfaceC1640330smt<DATA> interfaceC1640330smt3 = this.LIZJ;
        if (interfaceC1640330smt3 != null && (liveDataLJJIJ = interfaceC1640330smt3.LJJIJ()) != null) {
            LiveData liveDataLIZ = C23113093v.LIZ(liveDataLJJIJ, C817503Hh.LL, AFwS266S0000000_25.get$arr$(494), AFwS266S0000000_25.get$arr$(495));
            if (liveDataLIZ != null) {
                liveDataLIZ.observe(lifecycleOwner, new AObserverS227S0100000_25(this, 101));
            }
        }
        if (this.LJII && (interfaceC1640330smt = this.LIZJ) != null && (loadMoreState = interfaceC1640330smt.getLoadMoreState()) != null) {
            loadMoreState.observe(lifecycleOwner, new AObserverS227S0100000_25(this, 102));
        }
        InterfaceC1640420sn2<DATA> interfaceC1640420sn2 = this.LIZLLL;
        if (interfaceC1640420sn2 != null && (mutableLiveDataNN1 = interfaceC1640420sn2.nN1()) != null) {
            mutableLiveDataNN1.observe(lifecycleOwner, new AObserverS227S0100000_25(this, 103));
        }
        InterfaceC1640420sn2<DATA> interfaceC1640420sn22 = this.LIZLLL;
        if (interfaceC1640420sn22 != null && (mutableLiveDataKI1 = interfaceC1640420sn22.KI1()) != null) {
            mutableLiveDataKI1.observe(lifecycleOwner, new AObserverS227S0100000_25(this, 104));
        }
        InterfaceC1640420sn2<DATA> interfaceC1640420sn23 = this.LIZLLL;
        if (interfaceC1640420sn23 != null && (mutableLiveDataV60 = interfaceC1640420sn23.V60()) != null) {
            mutableLiveDataV60.observe(lifecycleOwner, new AObserverS227S0100000_25(this, 105));
        }
    }

    public int LJIILLIIL(int i) {
        if (i >= LJIIIIZZ().getItemCount()) {
            if (LJIIIIZZ().getItemCount() == 0) {
                return 0;
            }
            return LJIIIIZZ().getItemCount() - 1;
        }
        return i;
    }

    public final void LJIJ(C11NZ<Boolean> c11nz) {
        this.LJJIIJZLJL.LIZ(c11nz.LJJLL(new AfS194S0100000_25(this, 138), new C09JN() { // from class: X.0NC8
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("BaseInfoStickerListView@2286.observePanelVisibleEvent$2");
                C1C7U.LIZIZ("BaseInfoStickerListView@2286.observePanelVisibleEvent$2");
            }
        }));
    }

    public final void LJIJI(C11NZ<EnumC1159880gHy> c11nz) {
        this.LJJIIJZLJL.LIZ(c11nz.LJJLJLI(new AfS194S0100000_25(this, 139)));
    }

    public View LJJII(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.fv7, viewGroup, this.LJI);
    }

    public C1636150sg9 LJJIIJZLJL(View view) {
        C1636150sg9 c1636150sg9 = new C1636150sg9(view.getContext(), C2097608Jq.LJIIIIZZ(new Pair(EnumC1641470soj.LOADING, AFwS252S0000000_16.get$arr$(541)), new Pair(EnumC1641470soj.EMPTY, AFwS252S0000000_16.get$arr$(542)), new Pair(EnumC1641470soj.ERROR, new AwS604S0100000_25(this, 660))), EnumC1641470soj.NONE);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        C786410Ut5.q7(c1636150sg9, layoutParams);
        ((ViewGroup) LJII()).addView(c1636150sg9);
        return c1636150sg9;
    }

    public RecyclerView LJJIIZ(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.w6_);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(LJIIJ(), 1, this.LIZ, false);
        recyclerView.setItemViewCacheSize(LJIIJ());
        recyclerView.setLayoutManager(gridLayoutManager);
        if (C300240Bpm.LIZ()) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(6.0f)));
            C426750GoL.LJIIL(recyclerView, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ), null, 26);
        }
        return recyclerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJJIIZI(List<? extends DATA> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (DATA data : list) {
            Pair<? extends EnumC1641420soe, Integer> pair = this.LJIILLIIL.get(data);
            if (pair == null) {
                pair = new Pair<>(EnumC1641420soe.UNKNOWN, 0);
            }
            arrayList.add(new C1634100scq(data, pair.getFirst(), pair.getSecond()));
        }
        List<C1634100scq<DATA, EnumC1641420soe, Integer>> data2 = LJIIIIZZ().getData();
        ArrayList arrayList2 = (ArrayList) data2;
        if (arrayList.size() >= arrayList2.size() && (!arrayList2.isEmpty())) {
            ArrayList<Pair> arrayList3 = (ArrayList) C13LP.LLIILII(data2, arrayList.subList(0, arrayList2.size()));
            if (!arrayList3.isEmpty()) {
                for (Pair pair2 : arrayList3) {
                    if (!LIZLLL(((C1634100scq) pair2.getFirst()).LIZ, ((C1634100scq) pair2.getSecond()).LIZ)) {
                        AbstractC1640090smV<C1634100scq<DATA, EnumC1641420soe, Integer>> abstractC1640090smVLJIIIIZZ = LJIIIIZZ();
                        abstractC1640090smVLJIIIIZZ.LLLFZ(arrayList);
                        abstractC1640090smVLJIIIIZZ.notifyDataSetChanged();
                        break;
                    }
                }
            }
            AbstractC1640090smV<C1634100scq<DATA, EnumC1641420soe, Integer>> abstractC1640090smVLJIIIIZZ2 = LJIIIIZZ();
            List listSubList = arrayList.subList(arrayList2.size(), arrayList.size());
            if (listSubList != null) {
                int size = ((ArrayList) abstractC1640090smVLJIIIIZZ2.LL).size();
                ((ArrayList) abstractC1640090smVLJIIIIZZ2.LL).addAll(listSubList);
                abstractC1640090smVLJIIIIZZ2.notifyItemRangeInserted(size, listSubList.size());
            } else {
                abstractC1640090smVLJIIIIZZ2.getClass();
            }
        } else {
            AbstractC1640090smV<C1634100scq<DATA, EnumC1641420soe, Integer>> abstractC1640090smVLJIIIIZZ3 = LJIIIIZZ();
            abstractC1640090smVLJIIIIZZ3.LLLFZ(arrayList);
            abstractC1640090smVLJIIIIZZ3.notifyDataSetChanged();
            break;
        }
        HandlerHook.viewPost(LJIIJJI(), new ARunnableS125S0100000_25(this, 83));
    }

    @Override // X.InterfaceC1640870snl
    public final void tw(StickerSetCategory stickerSetCategory) {
        InterfaceC1640330smt<DATA> interfaceC1640330smt = this.LIZJ;
        if (interfaceC1640330smt != null) {
            interfaceC1640330smt.tw(stickerSetCategory);
        }
    }

    public void LIZIZ(RecyclerView.ViewHolder viewHolder, EnumC1641470soj enumC1641470soj) {
        C1636150sg9 c1636150sg9;
        View view = viewHolder.itemView;
        if ((view instanceof C1636150sg9) && (c1636150sg9 = (C1636150sg9) view) != null) {
            c1636150sg9.setState(enumC1641470soj);
        }
    }

    public boolean LIZLLL(DATA data, DATA data2) {
        return Intrinsics.LJFF(data, data2);
    }

    public AbstractC1640400sn0(Context context, LifecycleOwner lifecycleOwner, InterfaceC1640330smt<DATA> interfaceC1640330smt, InterfaceC1640420sn2<DATA> interfaceC1640420sn2, ViewGroup viewGroup, int i, boolean z, boolean z2, boolean z3, boolean z4, Function1<? super C1640060smS, Unit> function1) {
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = interfaceC1640330smt;
        this.LIZLLL = interfaceC1640420sn2;
        this.LJ = viewGroup;
        this.LJFF = i;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = z4;
        C1640060smS c1640060smS = new C1640060smS(0);
        this.LJIIJ = c1640060smS;
        this.LJIILLIIL = C2097608Jq.LJ();
        C11RK c11rk = new C11RK();
        this.LJIIZILJ = c11rk;
        this.LJIJ = new C11RK();
        this.LJIJI = new C11RK();
        this.LJIJJ = new C11RK();
        this.LJIJJLI = new C11RK();
        this.LJIL = new C11RK();
        this.LJJ = new C11RK();
        this.LJJI = new C11RK();
        this.LJJIFFI = new C11RK();
        this.LJJII = new C11RK();
        this.LJJIII = "";
        this.LJJIIJZLJL = new C11NJ();
        this.LJJIIZ = new AwS674S0100000_25(this, 47);
        this.LJJIIZI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(this, 905));
        if (function1 != null) {
            function1.invoke(c1640060smS);
        }
        c11rk.LJLIL(800L, TimeUnit.MILLISECONDS).LJJLJLI(new AfS194S0100000_25(this, 137));
    }

    public /* synthetic */ AbstractC1640400sn0(Context context, LifecycleOwner lifecycleOwner, InterfaceC1640330smt interfaceC1640330smt, InterfaceC1640420sn2 interfaceC1640420sn2, ViewGroup viewGroup, int i, boolean z, boolean z2, boolean z3, boolean z4, Function1 function1, int i2) {
        this(context, lifecycleOwner, interfaceC1640330smt, interfaceC1640420sn2, viewGroup, i, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? true : z2, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? false : z4, (i2 & 1024) != 0 ? null : function1);
    }
}
