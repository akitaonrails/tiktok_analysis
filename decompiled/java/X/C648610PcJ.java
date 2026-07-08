package X;

import Y.ARunnableS102S0100000_2;
import Y.ARunnableS110S0100000_10;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.neo.SearchListAutoplayHelper$SearchListAutoplay$1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0PcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648610PcJ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIILJJIL;
    public final LifecycleOwner LIZ;
    public final RecyclerView LIZIZ;
    public final InterfaceC648680PcQ LIZJ;
    public final C640700PBc LIZLLL;
    public final InterfaceC648650PcN LJ;
    public final WeakReference<C648610PcJ> LJFF = new WeakReference<>(this);
    public final boolean LJI;
    public final C648600PcI LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public final TreeSet<C648640PcM> LJIIJ;
    public List<C648640PcM> LJIIJJI;
    public List<? extends InterfaceC650860Pfw> LJIIL;
    public volatile C09U0 LJIILIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C648610PcJ.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LJIILJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public static boolean LIZ(RecyclerView recyclerView) {
        int itemCount;
        int iIntValue;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (itemCount = layoutManager.getItemCount()) == 0) {
            return false;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            iIntValue = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        } else {
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                return false;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.LJJIII()];
            staggeredGridLayoutManager.LJIJJ(iArr);
            Integer numLJJJJJL = C13LQ.LJJJJJL(iArr);
            if (numLJJJJJL == null) {
                return false;
            }
            iIntValue = numLJJJJJL.intValue();
        }
        if (iIntValue == -1 || iIntValue < itemCount - 1) {
            return false;
        }
        return true;
    }

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
    public final void LIZIZ(boolean z, EnumC587050N0t enumC587050N0t) {
        List<InterfaceC650860Pfw> listLIZ;
        C648640PcM c648640PcM;
        InterfaceC648350Pbt interfaceC648350Pbt;
        C648640PcM c648640PcM2;
        InterfaceC648350Pbt interfaceC648350Pbt2;
        C648640PcM c648640PcM3;
        InterfaceC648350Pbt interfaceC648350Pbt3;
        int i;
        if (this.LJ.LIZ() && ((Number) C18118077s.LIZ.getValue()).intValue() == 1) {
            return;
        }
        if (C648670PcP.LIZ < 0) {
            C648670PcP.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_autoplay_fix_from_detail", true);
        }
        if (C648670PcP.LIZ != 1 && this.LIZIZ.getWindowVisibility() == 8) {
            return;
        }
        System.nanoTime();
        if (Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3())) {
            C664400Q4g c664400Q4g = new C664400Q4g();
            c664400Q4g.LIZJ = System.currentTimeMillis();
            List<C648640PcM> list = this.LJIIJJI;
            List<? extends InterfaceC650860Pfw> list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                HashMap map = new HashMap();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                int i2 = 0;
                for (C648640PcM c648640PcM4 : this.LJIIJ) {
                    arrayList.add(c648640PcM4);
                    hashSet.add(c648640PcM4.LLILZ);
                    int i3 = c648640PcM4.LLILLJJLI.LL;
                    if (i3 == 0) {
                        i2++;
                    }
                    hashSet2.add(new C650660Pfc(c648640PcM4.LLILZ, i2, i3));
                    C648640PcM c648640PcM5 = (C648640PcM) map.get(Integer.valueOf(c648640PcM4.LLILLL.getTop()));
                    if (c648640PcM5 != null) {
                        c648640PcM4.LLILZLL = c648640PcM5;
                        c648640PcM5.LLILZLL = c648640PcM4;
                    } else {
                        c648640PcM4.LLILZLL = null;
                        map.put(Integer.valueOf(c648640PcM4.LLILLL.getTop()), c648640PcM4);
                    }
                }
                this.LJIIJJI = arrayList;
                if (C648290Pbn.LIZ < 0) {
                    i = 1;
                    C648290Pbn.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_player_prepare_next_opt", true);
                } else {
                    i = 1;
                }
                if (C648290Pbn.LIZ == i) {
                    this.LIZLLL.LJFF(hashSet2);
                    list2 = arrayList;
                } else {
                    C588600N6s c588600N6s = this.LIZLLL.LL;
                    list2 = arrayList;
                    if (c588600N6s != null) {
                        c588600N6s.LIZ(new C588580N6q(hashSet));
                        list2 = arrayList;
                    }
                }
            }
            System.nanoTime();
            RecyclerView.LayoutManager layoutManager = this.LIZIZ.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
                int i4 = this.LJIIIZ;
                this.LJIIIZ = 0;
                if (!this.LIZIZ.canScrollVertically(-1)) {
                    c664400Q4g.LJIIJ = "first";
                    listLIZ = this.LIZJ.LIZ(EnumC648690PcR.HIT_TOP, this.LIZIZ, list2, 0);
                } else if (this.LJIIIIZZ >= 0) {
                    c664400Q4g.LJIIJ = "scroll";
                    listLIZ = this.LIZJ.LIZ(EnumC648690PcR.CONSUME_FROM_TOP_TO_BOTTOM, this.LIZIZ, list2, Math.abs(i4));
                } else {
                    c664400Q4g.LJIIJ = "scroll";
                    listLIZ = this.LIZJ.LIZ(EnumC648690PcR.CONSUME_FROM_BOTTOM_TO_TOP, this.LIZIZ, list2, Math.abs(i4));
                }
                if (listLIZ == null || listLIZ.isEmpty()) {
                    if (C0BYA.LIZ()) {
                        C640700PBc c640700PBc = this.LIZLLL;
                        C13BV c13bv = C13BV.INSTANCE;
                        c640700PBc.Q1(c13bv, null);
                        this.LJIIL = c13bv;
                        return;
                    }
                    if (listLIZ == null) {
                        return;
                    }
                }
                if (!listLIZ.isEmpty()) {
                    if (z && !Intrinsics.LJFF(listLIZ, this.LJIIL)) {
                        C640700PBc c640700PBc2 = this.LIZLLL;
                        C13BV c13bv2 = C13BV.INSTANCE;
                        c640700PBc2.Q1(c13bv2, null);
                        this.LJIIL = c13bv2;
                        return;
                    }
                    C587060N0u c587060N0u = new C587060N0u(enumC587050N0t, null, 2);
                    if (Intrinsics.LJFF(listLIZ, this.LJIIL) && (!(listLIZ instanceof Collection) || !listLIZ.isEmpty())) {
                        for (InterfaceC650860Pfw interfaceC650860Pfw : listLIZ) {
                            if ((interfaceC650860Pfw instanceof C648640PcM) && (c648640PcM2 = (C648640PcM) interfaceC650860Pfw) != null && (interfaceC648350Pbt2 = c648640PcM2.LLILZ) != null && interfaceC648350Pbt2.isPlaying()) {
                                if (C650550PfR.LIZ) {
                                    C13LP.LJJLIIIJ(listLIZ, ",", e3.e, e3.f, 0, null, AFwS241S0000000_10.get$arr$(201), 24);
                                }
                                if (C07G9.LIZIZ) {
                                    for (InterfaceC650860Pfw interfaceC650860Pfw2 : listLIZ) {
                                        if ((interfaceC650860Pfw2 instanceof C648640PcM) && (c648640PcM3 = (C648640PcM) interfaceC650860Pfw2) != null && (interfaceC648350Pbt3 = c648640PcM3.LLILZ) != null && interfaceC648350Pbt3.isPlaying()) {
                                            interfaceC648350Pbt3.LLZZZIL(c587060N0u);
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    this.LJIIL = listLIZ;
                    System.nanoTime();
                    Object objLJJJLL = C13LP.LJJJLL(listLIZ);
                    if ((objLJJJLL instanceof C648640PcM) && (c648640PcM = (C648640PcM) objLJJJLL) != null && (interfaceC648350Pbt = c648640PcM.LLILZ) != null) {
                        interfaceC648350Pbt.setPlayMetrics(c664400Q4g);
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
                    Iterator<InterfaceC650860Pfw> it2 = listLIZ.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((C648640PcM) it2.next()).LLILZ);
                    }
                    System.nanoTime();
                    if (!listLIZ.isEmpty()) {
                        Iterator<InterfaceC650860Pfw> it3 = listLIZ.iterator();
                        while (it3.hasNext()) {
                            if (it3.next().getPosition() == 0) {
                                this.LIZLLL.Q1(arrayList2, c587060N0u);
                                return;
                            }
                        }
                    }
                    int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
                    if (2 <= effectiveConnectionType && effectiveConnectionType < 5) {
                        C948503nH.LJ(this.LIZ, C23271099x.INSTANCE, new C1483405rM(this, arrayList2, c587060N0u, null));
                        return;
                    } else {
                        this.LIZLLL.Q1(arrayList2, c587060N0u);
                        return;
                    }
                }
                return;
            }
            return;
        }
        C664410Q4h.LIZIZ(EnumC654470Pll.COMMON, EnumC664420Q4i.AUTOPLAY, null, "checkLogic() is not called on main thread", C2097608Jq.LJ(), C2097608Jq.LJ(), "search");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0PcI, X.0foN] */
    public C648610PcJ(LifecycleOwner lifecycleOwner, RecyclerView recyclerView, InterfaceC648680PcQ interfaceC648680PcQ, C0PBV c0pbv, C639190P5h c639190P5h) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = recyclerView;
        this.LIZJ = interfaceC648680PcQ;
        this.LIZLLL = c0pbv;
        this.LJ = c639190P5h;
        this.LJI = ((Number) C271190Ak1.LIZ.getValue()).intValue() == 1;
        ?? r2 = new InterfaceC1141530foN() { // from class: X.0PcI
            @Override // X.InterfaceC1141530foN
            public final void mh2(C262100zr c262100zr) {
                RecyclerView recyclerView2;
                C648610PcJ c648610PcJ = this.LL.LJFF.get();
                if (c648610PcJ != null && (recyclerView2 = c648610PcJ.LIZIZ) != null) {
                    HandlerHook.viewPost(recyclerView2, new ARunnableS110S0100000_10(c648610PcJ, 55));
                }
            }
        };
        this.LJII = r2;
        lifecycleOwner.getLifecycle().addObserver(new SearchListAutoplayHelper$SearchListAutoplay$1(this));
        this.LJIIJ = new TreeSet<>();
        this.LJIIL = C13BV.INSTANCE;
        C1548820qPI.LIZLLL("js_event_ecom_card_chunk_response_event", r2);
        recyclerView.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0PcK
            public final HashMap<View, C648640PcM> LL = new HashMap<>();

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC21676519sR
            public final void g5(View view) {
                C21681919tJ c21681919tJ;
                InterfaceC648350Pbt interfaceC648350Pbt;
                long jNanoTime = System.nanoTime();
                RecyclerView.ViewHolder childViewHolder = this.LLILLJJLI.LIZIZ.getChildViewHolder(view);
                if (childViewHolder == 0) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = childViewHolder.itemView.getLayoutParams();
                if ((layoutParams instanceof C21681919tJ) && (c21681919tJ = (C21681919tJ) layoutParams) != null && (childViewHolder instanceof InterfaceC648350Pbt) && (interfaceC648350Pbt = (InterfaceC648350Pbt) childViewHolder) != null) {
                    if (C301440Bri.LIZ() && !interfaceC648350Pbt.L0()) {
                        return;
                    }
                    if (interfaceC648350Pbt instanceof InterfaceC648090PbT) {
                        ((InterfaceC648090PbT) interfaceC648350Pbt).LJLLLL(new AwS554S0100000_10(this.LLILLJJLI, 394));
                    }
                    if (this.LL.isEmpty() || this.LLILLJJLI.LJI) {
                        C648610PcJ c648610PcJ = this.LLILLJJLI;
                        if (!c648610PcJ.LJ.LIZ() && !c648610PcJ.LJI) {
                            HandlerHook.viewPost(c648610PcJ.LIZIZ, new ARunnableS102S0100000_2(c648610PcJ, 33));
                        } else {
                            c648610PcJ.LJ.LIZIZ(new AwS554S0100000_10(c648610PcJ, 395));
                        }
                    }
                    C648640PcM c648640PcM = new C648640PcM(childViewHolder, c21681919tJ, view, interfaceC648350Pbt);
                    this.LL.put(view, c648640PcM);
                    this.LLILLJJLI.LJIIJ.add(c648640PcM);
                    this.LLILLJJLI.LJIIJJI = null;
                    if (C650550PfR.LIZ) {
                        long jNanoTime2 = (System.nanoTime() - jNanoTime) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("view attached, pos:");
                        sbLIZ.append(c648640PcM.getPosition());
                        sbLIZ.append(", duration:");
                        sbLIZ.append(jNanoTime2);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            }

            @Override // X.InterfaceC21676519sR
            public final void m3(View view) {
                C648640PcM c648640PcMRemove = this.LL.remove(view);
                if (c648640PcMRemove == null) {
                    return;
                }
                this.LLILLJJLI.LJIIJ.remove(c648640PcMRemove);
                this.LLILLJJLI.LJIIJJI = null;
                InterfaceC648350Pbt interfaceC648350Pbt = c648640PcMRemove.LLILZ;
                if (interfaceC648350Pbt instanceof InterfaceC648090PbT) {
                    ((InterfaceC648090PbT) interfaceC648350Pbt).LJLLLL(null);
                }
            }
        });
        recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0PcL
            public long LL;
            public boolean LLILLJJLI = true;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView2, int i) {
                EnumC587050N0t enumC587050N0t;
                C650750Pfl c650750Pfl;
                C650770Pfn c650770Pfn;
                this.LLILLJJLI = true;
                if (i == 0) {
                    InterfaceC648680PcQ interfaceC648680PcQ2 = this.LLILLL.LIZJ;
                    if ((interfaceC648680PcQ2 instanceof C650750Pfl) && (c650750Pfl = (C650750Pfl) interfaceC648680PcQ2) != null) {
                        InterfaceC650760Pfm interfaceC650760PfmLIZIZ = c650750Pfl.LIZIZ();
                        if ((interfaceC650760PfmLIZIZ instanceof C650770Pfn) && (c650770Pfn = (C650770Pfn) interfaceC650760PfmLIZIZ) != null) {
                            c650770Pfn.LJII = new C648660PcO(EnumC587120N1a.STATE_IDLE, null);
                        }
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.LL > 16) {
                        this.LL = jCurrentTimeMillis;
                        C648610PcJ c648610PcJ = this.LLILLL;
                        if (c648610PcJ.LJIIIIZZ >= 0) {
                            enumC587050N0t = EnumC587050N0t.SCROLL_TO_BOTTOM;
                        } else {
                            enumC587050N0t = EnumC587050N0t.SCROLL_TO_TOP;
                        }
                        c648610PcJ.LIZIZ(false, enumC587050N0t);
                    }
                }
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView2, int i, int i2) {
                EnumC587050N0t enumC587050N0t;
                if (i2 == 0) {
                    return;
                }
                C0PBR.LIZJ();
                if (i2 > 0) {
                    enumC587050N0t = EnumC587050N0t.SCROLL_TO_BOTTOM;
                } else {
                    enumC587050N0t = EnumC587050N0t.SCROLL_TO_TOP;
                }
                boolean z = true;
                if (C0BYA.LIZ()) {
                    this.LLILLL.getClass();
                    boolean zLIZ = C648610PcJ.LIZ(recyclerView2);
                    C648610PcJ c648610PcJ = this.LLILLL;
                    c648610PcJ.LJIIIIZZ = i2;
                    c648610PcJ.LJIIIZ += i2;
                    if (zLIZ && Math.abs(i2) > 60) {
                        C648610PcJ c648610PcJ2 = this.LLILLL;
                        c648610PcJ2.LJIIIIZZ = 1;
                        c648610PcJ2.LJIIIZ = 1;
                        c648610PcJ2.LIZIZ(false, enumC587050N0t);
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.LL > 50) {
                        this.LL = jCurrentTimeMillis;
                        this.LLILLL.LIZIZ(false, enumC587050N0t);
                        return;
                    }
                    return;
                }
                C648610PcJ c648610PcJ3 = this.LLILLL;
                c648610PcJ3.LJIIIIZZ = i2;
                c648610PcJ3.LJIIIZ += i2;
                if (((Number) C271180Ak0.LIZ.getValue()).intValue() == 1) {
                    if (this.LLILLJJLI) {
                        this.LLILLJJLI = false;
                        return;
                    }
                    this.LLILLL.getClass();
                    if (C648610PcJ.LIZ(recyclerView2) && Math.abs(i2) > 60) {
                        C648610PcJ c648610PcJ4 = this.LLILLL;
                        c648610PcJ4.LJIIIIZZ = 1;
                        c648610PcJ4.LJIIIZ = 1;
                        c648610PcJ4.LIZIZ(false, enumC587050N0t);
                        return;
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (jCurrentTimeMillis2 - this.LL > 50) {
                        this.LL = jCurrentTimeMillis2;
                        if (Math.abs(this.LLILLL.LJIIIZ) <= 20) {
                            z = false;
                        }
                        this.LLILLL.LIZIZ(z, enumC587050N0t);
                        return;
                    }
                    return;
                }
                if (!this.LLILLJJLI && Math.abs(i2) <= 30) {
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    if (jCurrentTimeMillis3 - this.LL > 50) {
                        this.LL = jCurrentTimeMillis3;
                        this.LLILLL.LIZIZ(false, enumC587050N0t);
                        return;
                    }
                    return;
                }
                this.LLILLJJLI = false;
            }
        });
        new C13E8(3);
    }
}
