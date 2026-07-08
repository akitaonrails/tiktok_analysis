package X;

import X.C0DYC;
import X.C0R44;
import X.C640750PBh;
import X.C641100PCq;
import X.C650630PfZ;
import X.C652750Piz;
import X.InterfaceC652740Piy;
import Y.AObserverS214S0100000_10;
import Y.AsS30S0200000_10;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import j27.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Piz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652750Piz {
    public static final /* synthetic */ int LJII = 0;
    public final RecyclerView LIZ;
    public final View LIZIZ;
    public final C1DWH LIZJ;
    public final LiveData<Integer> LIZLLL;
    public final s LJ;
    public SearchServiceCenter$AutoPlayAbility LJFF;
    public boolean LJI;

    public static final ArrayList<RecyclerView.ViewHolder> LIZ(C01GW<? extends ArrayList<RecyclerView.ViewHolder>> c01gw) {
        return c01gw.getValue();
    }

    public static Map LIZJ(List list) {
        C13DA c13da = new C13DA();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) it2.next();
            SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ = C641100PCq.LIZ(viewHolder);
            if (searchServiceCenter$AutoPlayAbilityLIZ != null) {
                final View detectView = searchServiceCenter$AutoPlayAbilityLIZ.getDetectView();
                final AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(viewHolder, 283);
                c13da.put(new InterfaceC652740Piy(detectView, awS554S0100000_10) { // from class: X.0Pfk
                    public final View LL;
                    public final Function0<Integer> LLILLJJLI;

                    @Override // X.InterfaceC652740Piy
                    public final boolean LIZJ() {
                        return true;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C650740Pfk)) {
                            return false;
                        }
                        C650740Pfk c650740Pfk = (C650740Pfk) obj;
                        return Intrinsics.LJFF(this.LL, c650740Pfk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c650740Pfk.LLILLJJLI);
                    }

                    public final int hashCode() {
                        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("CheckItemAbility(view=");
                        sbLIZ.append(this.LL);
                        sbLIZ.append(", positionFetcher=");
                        sbLIZ.append(this.LLILLJJLI);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC652740Piy
                    public final int getPosition() {
                        return this.LLILLJJLI.invoke().intValue();
                    }

                    @Override // X.InterfaceC652740Piy
                    public final View getView() {
                        return this.LL;
                    }

                    {
                        this.LL = detectView;
                        this.LLILLJJLI = awS554S0100000_10;
                    }
                }, searchServiceCenter$AutoPlayAbilityLIZ);
            }
        }
        return c13da.build();
    }

    public final void LIZIZ(SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2;
        if (!this.LJI) {
            this.LJFF = searchServiceCenter$AutoPlayAbility;
            return;
        }
        if (!Intrinsics.LJFF(this.LJFF, searchServiceCenter$AutoPlayAbility) && (searchServiceCenter$AutoPlayAbility2 = this.LJFF) != null) {
            searchServiceCenter$AutoPlayAbility2.LLZZZZ();
        }
        if (!searchServiceCenter$AutoPlayAbility.isPlaying()) {
            searchServiceCenter$AutoPlayAbility.J0();
        }
        this.LJFF = searchServiceCenter$AutoPlayAbility;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchNestedAutoplayLynxCardHelper$2] */
    public C652750Piz(C652720Piw c652720Piw, RecyclerView recyclerView, View view, C1DWH c1dwh, LiveData liveData, s sVar) {
        LiveData<Integer> liveData2;
        this.LIZ = recyclerView;
        this.LIZIZ = view;
        this.LIZJ = c1dwh;
        this.LIZLLL = liveData;
        this.LJ = sVar;
        final C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(720));
        SAFHelper sAFHelper = SAFHelper.LIZ;
        RecyclerView recyclerView2 = this.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(recyclerView2.getContext());
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(recyclerView2, c19egLIZIZ);
        if (lifecycleOwnerLJIJI != null && (liveData2 = this.LIZLLL) != null) {
            liveData2.observe(lifecycleOwnerLJIJI, new AObserverS214S0100000_10(this, 162));
        }
        c652720Piw.LIZ(new SearchServiceCenter$AutoPlayAbility() { // from class: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchNestedAutoplayLynxCardHelper$2
            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void Mu(C650630PfZ c650630PfZ) {
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final View Vt() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean mm() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void wp(C650630PfZ c650630PfZ) {
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void J0() {
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
                C652750Piz c652750Piz = this.LL;
                c652750Piz.LJI = true;
                s sVar2 = c652750Piz.LJ;
                if (sVar2 != null) {
                    C0DYC.LIZIZ(sVar2, "search_list_play_state", Boolean.TRUE);
                }
                C652750Piz c652750Piz2 = this.LL;
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2 = c652750Piz2.LJFF;
                if (searchServiceCenter$AutoPlayAbility2 != null) {
                    searchServiceCenter$AutoPlayAbility2.J0();
                    return;
                }
                ArrayList<RecyclerView.ViewHolder> arrayListLIZ = C652750Piz.LIZ(c01gwLIZIZ);
                c652750Piz2.getClass();
                Map mapLIZJ = C652750Piz.LIZJ(arrayListLIZ);
                C652750Piz c652750Piz3 = this.LL;
                InterfaceC652740Piy interfaceC652740PiyLIZIZ = c652750Piz3.LIZJ.LIZIZ(c652750Piz3.LIZ, 0, mapLIZJ.keySet());
                if (interfaceC652740PiyLIZIZ == null || (searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) mapLIZJ.get(interfaceC652740PiyLIZIZ)) == null) {
                    return;
                }
                this.LL.LIZIZ(searchServiceCenter$AutoPlayAbility);
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void LJJLIIIJLLLLLLLZ() {
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LL.LJFF;
                if (searchServiceCenter$AutoPlayAbility != null) {
                    searchServiceCenter$AutoPlayAbility.LJJLIIIJLLLLLLLZ();
                }
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void LLZZZZ() {
                C652750Piz c652750Piz = this.LL;
                c652750Piz.LJI = false;
                s sVar2 = c652750Piz.LJ;
                if (sVar2 != null) {
                    C0DYC.LIZIZ(sVar2, "search_list_play_state", Boolean.FALSE);
                }
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LL.LJFF;
                if (searchServiceCenter$AutoPlayAbility != null) {
                    searchServiceCenter$AutoPlayAbility.LLZZZZ();
                }
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean N1() {
                if (C652750Piz.LIZ(c01gwLIZIZ).isEmpty()) {
                    return true;
                }
                ArrayList<RecyclerView.ViewHolder> arrayListLIZ = C652750Piz.LIZ(c01gwLIZIZ);
                if (!(arrayListLIZ instanceof Collection) || !arrayListLIZ.isEmpty()) {
                    Iterator<RecyclerView.ViewHolder> it2 = arrayListLIZ.iterator();
                    while (it2.hasNext()) {
                        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ = C641100PCq.LIZ(it2.next());
                        if (searchServiceCenter$AutoPlayAbilityLIZ != null && searchServiceCenter$AutoPlayAbilityLIZ.N1()) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final View getDetectView() {
                return this.LL.LIZIZ;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean isPlaying() {
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LL.LJFF;
                if (searchServiceCenter$AutoPlayAbility != null) {
                    return searchServiceCenter$AutoPlayAbility.isPlaying();
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void kC0(int i) {
                C652750Piz c652750Piz = this.LL;
                ArrayList<RecyclerView.ViewHolder> arrayListLIZ = C652750Piz.LIZ(c01gwLIZIZ);
                c652750Piz.getClass();
                Map mapLIZJ = C652750Piz.LIZJ(arrayListLIZ);
                for (Object obj : mapLIZJ.keySet()) {
                    if (((InterfaceC652740Piy) obj).getPosition() == i) {
                        if (obj != null) {
                            C652750Piz c652750Piz2 = this.LL;
                            SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) mapLIZJ.get(obj);
                            if (searchServiceCenter$AutoPlayAbility != null) {
                                c652750Piz2.LIZIZ(searchServiceCenter$AutoPlayAbility);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void Ot0(C640750PBh c640750PBh, Function0<Unit> function0) {
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ;
                this.LL.LIZ.scrollToPosition(c640750PBh.LIZ);
                C652750Piz c652750Piz = this.LL;
                RecyclerView recyclerView3 = c652750Piz.LIZ;
                if (recyclerView3.isLaidOut() && !recyclerView3.isLayoutRequested()) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c652750Piz.LIZ.findViewHolderForAdapterPosition(c640750PBh.LIZ);
                    if (viewHolderFindViewHolderForAdapterPosition != null) {
                        searchServiceCenter$AutoPlayAbilityLIZ = C641100PCq.LIZ(viewHolderFindViewHolderForAdapterPosition);
                    } else {
                        searchServiceCenter$AutoPlayAbilityLIZ = null;
                    }
                    c652750Piz.LJFF = searchServiceCenter$AutoPlayAbilityLIZ;
                    if (searchServiceCenter$AutoPlayAbilityLIZ != null) {
                        C640750PBh c640750PBh2 = c640750PBh.LIZIZ;
                        if (c640750PBh2 != null) {
                            searchServiceCenter$AutoPlayAbilityLIZ.Ot0(c640750PBh2, function0);
                            return;
                        } else {
                            function0.invoke();
                            return;
                        }
                    }
                    return;
                }
                recyclerView3.addOnLayoutChangeListener(new C0R44(c652750Piz, c640750PBh, function0, 0));
            }
        });
        recyclerView.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0Pj0
            public final HashMap<View, RecyclerView.ViewHolder> LL = new HashMap<>();

            @Override // X.InterfaceC21676519sR
            public final void g5(View view2) {
                SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
                RecyclerView.ViewHolder childViewHolder = this.LLILLJJLI.LIZ.getChildViewHolder(view2);
                C652750Piz.LIZ(c01gwLIZIZ).add(childViewHolder);
                this.LL.put(view2, childViewHolder);
                final C652750Piz c652750Piz = this.LLILLJJLI;
                if (c652750Piz.LJI && c652750Piz.LJFF == null) {
                    RecyclerView recyclerView3 = c652750Piz.LIZ;
                    final C01GW<ArrayList<RecyclerView.ViewHolder>> c01gw = c01gwLIZIZ;
                    if (recyclerView3.isLaidOut() && !recyclerView3.isLayoutRequested()) {
                        if (c652750Piz.LJI && c652750Piz.LJFF == null) {
                            Map mapLIZJ = C652750Piz.LIZJ(C652750Piz.LIZ(c01gw));
                            InterfaceC652740Piy interfaceC652740PiyLIZIZ = c652750Piz.LIZJ.LIZIZ(c652750Piz.LIZ, 0, mapLIZJ.keySet());
                            if (interfaceC652740PiyLIZIZ != null && (searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) mapLIZJ.get(interfaceC652740PiyLIZIZ)) != null) {
                                c652750Piz.LIZIZ(searchServiceCenter$AutoPlayAbility);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    recyclerView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0Pj1
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2;
                            view3.removeOnLayoutChangeListener(this);
                            C652750Piz c652750Piz2 = c652750Piz;
                            if (c652750Piz2.LJI && c652750Piz2.LJFF == null) {
                                ArrayList<RecyclerView.ViewHolder> arrayListLIZ = C652750Piz.LIZ(c01gw);
                                c652750Piz2.getClass();
                                Map mapLIZJ2 = C652750Piz.LIZJ(arrayListLIZ);
                                C652750Piz c652750Piz3 = c652750Piz;
                                InterfaceC652740Piy interfaceC652740PiyLIZIZ2 = c652750Piz3.LIZJ.LIZIZ(c652750Piz3.LIZ, 0, mapLIZJ2.keySet());
                                if (interfaceC652740PiyLIZIZ2 != null && (searchServiceCenter$AutoPlayAbility2 = (SearchServiceCenter$AutoPlayAbility) mapLIZJ2.get(interfaceC652740PiyLIZIZ2)) != null) {
                                    c652750Piz.LIZIZ(searchServiceCenter$AutoPlayAbility2);
                                }
                            }
                        }
                    });
                }
            }

            @Override // X.InterfaceC21676519sR
            public final void m3(View view2) {
                RecyclerView.ViewHolder viewHolder = this.LL.get(view2);
                if (viewHolder != null) {
                    C652750Piz.LIZ(c01gwLIZIZ).remove(viewHolder);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                int childCount = this.LLILLJJLI.LIZ.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    g5(this.LLILLJJLI.LIZ.getChildAt(i));
                }
            }
        });
        recyclerView.addOnScrollListener(new AsS30S0200000_10(this, c01gwLIZIZ, 1));
        recyclerView.addOnAttachStateChangeListener(new C0R48(this, 20));
    }
}
