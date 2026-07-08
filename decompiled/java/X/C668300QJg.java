package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.config.SearchMusicHistoryOptConfig;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QJg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668300QJg extends AbstractC21673619ry<RecyclerView.ViewHolder> implements C0QJT {
    public final C0QJO LLILZLL;
    public boolean LLIZLLLIL;
    public String LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final ArrayList<SearchHistory> LL = new ArrayList<>();
    public List<? extends SearchHistory> LLILLJJLI = C13BV.INSTANCE;
    public String LLILLL = "";
    public String LLILZ = "";
    public String LLILZIL = "";
    public String LLIZ = "";

    public final int LLLI() {
        return ((Number) this.LLJIJIL.getValue()).intValue();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.C0QJT
    public final C668320QJi LLIIIJ(ViewGroup viewGroup) {
        int i = C668320QJi.LLILZLL;
        System.currentTimeMillis();
        C650520PfO c650520PfO = C650520PfO.LIZ;
        Context context = viewGroup.getContext();
        c650520PfO.getClass();
        C668320QJi c668320QJi = new C668320QJi(C650520PfO.LIZIZ(context, R.layout.exl, viewGroup, false));
        System.currentTimeMillis();
        return c668320QJi;
    }

    @Override // X.C0QJT
    public final C668330QJj LLJILLL(ViewGroup viewGroup) {
        int i = C668330QJj.LLJJI;
        return C0QK2.LIZ(viewGroup);
    }

    @Override // X.C0QJT
    public final C668360QJm LLJJIJIL(ViewGroup viewGroup) {
        int i = C668360QJm.LLJJJ;
        System.currentTimeMillis();
        C650520PfO c650520PfO = C650520PfO.LIZ;
        Context context = viewGroup.getContext();
        c650520PfO.getClass();
        C668360QJm c668360QJm = new C668360QJm(C650520PfO.LIZIZ(context, R.layout.exj, viewGroup, false));
        System.currentTimeMillis();
        return c668360QJm;
    }

    @Override // X.C0QJT
    public final C668420QJs LLJJLIIIJLLLLLLLZ(ViewGroup viewGroup) {
        int i = C668420QJs.LLIZLLLIL;
        System.currentTimeMillis();
        C650520PfO c650520PfO = C650520PfO.LIZ;
        Context context = viewGroup.getContext();
        c650520PfO.getClass();
        C668420QJs c668420QJs = new C668420QJs(C650520PfO.LIZIZ(context, R.layout.exm, viewGroup, false));
        System.currentTimeMillis();
        return c668420QJs;
    }

    @Override // X.C0QJT
    public final C668340QJk LLJLLL(ViewGroup viewGroup) {
        int i = C668340QJk.LLJJ;
        System.currentTimeMillis();
        C650520PfO c650520PfO = C650520PfO.LIZ;
        Context context = viewGroup.getContext();
        c650520PfO.getClass();
        C668340QJk c668340QJk = new C668340QJk(C650520PfO.LIZIZ(context, R.layout.exk, viewGroup, false));
        System.currentTimeMillis();
        return c668340QJk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLFZ(boolean z) {
        if (!this.LLIZLLLIL && this.LLIZ.length() == 0 && C0QPQ.LIZIZ()) {
            for (IndexedValue indexedValue : C13LP.LJLJJLL(C13LP.LLIIL(C13LP.LL(this.LLILLJJLI, 20)))) {
                int i = indexedValue.LIZ;
                SearchHistory searchHistory = (SearchHistory) indexedValue.LIZIZ;
                if (C123100dR.LIZ(searchHistory.musicId)) {
                    if (z || i < LLLI()) {
                        String str = searchHistory.musicId;
                        if (str == null) {
                            str = "";
                        }
                        this.LLIZ = str;
                        this.LLIZLLLIL = true;
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (C123100dR.LIZ(this.LLIZ) && Intrinsics.LJFF(this.LLIZ, ((SearchHistory) ListProtector.get(this.LL, i)).musicId)) {
            return 5;
        }
        return ((SearchHistory) ListProtector.get(this.LL, i)).LIZ;
    }

    public C668300QJg(RecyclerView recyclerView, C0QJO c0qjo) {
        this.LLJI = C452501pT.LIZIZ(new AwS554S0100000_10(recyclerView, 1053));
        this.LLILZLL = (!C0BR9.LIZ() || c0qjo == null) ? new C0QJO(recyclerView, this) : c0qjo;
        this.LLJIJIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(560));
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x029c A[PHI: r8
      0x029c: PHI (r8v9 java.lang.String) = (r8v6 java.lang.String), (r8v10 java.lang.String) binds: [B:119:0x029a, B:117:0x0297] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a6 A[PHI: r8
      0x02a6: PHI (r8v7 java.lang.String) = (r8v6 java.lang.String), (r8v9 java.lang.String), (r8v9 java.lang.String) binds: [B:119:0x029a, B:121:0x02a0, B:123:0x02a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c2 A[PHI: r11
      0x02c2: PHI (r11v4 java.lang.String) = (r11v2 java.lang.String), (r11v5 java.lang.String) binds: [B:132:0x02c0, B:130:0x02bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03cc  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C668300QJg.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLIZ;
        boolean zLIZ = true;
        if (i != 0) {
            int i2 = 0;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                viewHolderLIZ = this.LLILZLL.LIZ();
                            } else {
                                C0QJO c0qjo = this.LLILZLL;
                                c0qjo.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                viewHolderLIZ = c0qjo.LJI.LIZIZ();
                                if (viewHolderLIZ == null) {
                                    viewHolderLIZ = c0qjo.LJI.LIZ();
                                } else {
                                    i2 = 1;
                                }
                                C01V2.LIZ(i2, "viewholder", System.currentTimeMillis() - jCurrentTimeMillis, "musicExpandViewHolderAsync");
                            }
                        } else {
                            C0QJO c0qjo2 = this.LLILZLL;
                            c0qjo2.getClass();
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            viewHolderLIZ = c0qjo2.LJFF.LIZIZ();
                            if (viewHolderLIZ == null) {
                                viewHolderLIZ = c0qjo2.LJFF.LIZ();
                            } else {
                                i2 = 1;
                            }
                            C01V2.LIZ(i2, "viewholder", System.currentTimeMillis() - jCurrentTimeMillis2, "interestViewHolder");
                        }
                    } else {
                        C0QJO c0qjo3 = this.LLILZLL;
                        c0qjo3.getClass();
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        viewHolderLIZ = c0qjo3.LJ.LIZIZ();
                        if (viewHolderLIZ == null) {
                            viewHolderLIZ = c0qjo3.LJ.LIZ();
                        } else {
                            i2 = 1;
                        }
                        C01V2.LIZ(i2, "viewholder", System.currentTimeMillis() - jCurrentTimeMillis3, "hisTitleViewHolder");
                    }
                } else {
                    int i3 = C668440QJu.LLILZLL;
                    C650520PfO c650520PfO = C650520PfO.LIZ;
                    Context context = viewGroup.getContext();
                    c650520PfO.getClass();
                    viewHolderLIZ = new C668440QJu(C650520PfO.LIZIZ(context, R.layout.exi, viewGroup, false));
                }
            } else {
                C0QJO c0qjo4 = this.LLILZLL;
                c0qjo4.getClass();
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                viewHolderLIZ = c0qjo4.LIZLLL.LIZIZ();
                if (viewHolderLIZ == null) {
                    viewHolderLIZ = c0qjo4.LIZLLL.LIZ();
                } else {
                    i2 = 1;
                }
                C01V2.LIZ(i2, "viewholder", System.currentTimeMillis() - jCurrentTimeMillis4, "hisViewAllViewHolder");
            }
        } else {
            viewHolderLIZ = this.LLILZLL.LIZ();
        }
        if (viewHolderLIZ != null) {
            try {
                View view = viewHolderLIZ.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        viewHolderLIZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLIZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLIZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLIZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLIZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLIZ.getClass().getName();
        return viewHolderLIZ;
    }

    public static void LLLII(C668300QJg c668300QJg, boolean z, SearchHistory searchHistory, boolean z2, List list, int i) {
        if ((i & 2) != 0) {
            searchHistory = null;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            list = C13BV.INSTANCE;
        }
        if (searchHistory != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c668300QJg.LLILLJJLI);
            arrayList.remove(searchHistory);
            c668300QJg.LLILLJJLI = arrayList;
        }
        List listLL = C13LP.LL(c668300QJg.LLILLJJLI, 20);
        if (searchHistory != null && c668300QJg.LL.contains(searchHistory)) {
            int iIndexOf = c668300QJg.LL.indexOf(searchHistory);
            c668300QJg.LL.remove(searchHistory);
            c668300QJg.notifyItemRemoved(iIndexOf);
            if (C293280BeY.LIZ) {
                if (!z) {
                    ArrayList<SearchHistory> arrayList2 = c668300QJg.LL;
                    ArrayList arrayList3 = new ArrayList();
                    for (SearchHistory searchHistory2 : arrayList2) {
                        int i2 = searchHistory2.LIZ;
                        if (i2 == 0 || i2 == -1) {
                            arrayList3.add(searchHistory2);
                        }
                    }
                    if (arrayList3.size() < c668300QJg.LLLI()) {
                        if (listLL.size() > c668300QJg.LLLI()) {
                            ListProtector.add(c668300QJg.LL, c668300QJg.LLLI() - 1, ListProtector.get(listLL, c668300QJg.LLLI() - 1));
                            c668300QJg.LLLFZ(false);
                            c668300QJg.notifyItemInserted(c668300QJg.LLLI() - 1);
                            return;
                        }
                        if (listLL.size() == c668300QJg.LLLI()) {
                            ListProtector.add(c668300QJg.LL, c668300QJg.LLLI() - 1, ListProtector.get(listLL, c668300QJg.LLLI() - 1));
                            c668300QJg.LLLFZ(false);
                            c668300QJg.notifyItemInserted(c668300QJg.LLLI() - 1);
                            SearchHistory searchHistory3 = new SearchHistory();
                            searchHistory3.LIZ = 1;
                            if (!c668300QJg.LL.contains(searchHistory3)) {
                                return;
                            }
                            int iIndexOf2 = c668300QJg.LL.indexOf(searchHistory3);
                            c668300QJg.LL.remove(searchHistory3);
                            c668300QJg.notifyItemRemoved(iIndexOf2);
                            return;
                        }
                        SearchHistory searchHistory4 = new SearchHistory();
                        searchHistory4.LIZ = 1;
                        if (!c668300QJg.LL.contains(searchHistory4)) {
                            return;
                        }
                        int iIndexOf3 = c668300QJg.LL.indexOf(searchHistory4);
                        c668300QJg.LL.remove(searchHistory4);
                        c668300QJg.notifyItemRemoved(iIndexOf3);
                        return;
                    }
                    return;
                }
                if (listLL.size() == 20) {
                    SearchHistory searchHistory5 = new SearchHistory();
                    searchHistory5.LIZ = 3;
                    int iIndexOf4 = c668300QJg.LL.indexOf(searchHistory5);
                    if (c668300QJg.LL.contains(searchHistory5)) {
                        ListProtector.add(c668300QJg.LL, iIndexOf4, ListProtector.get(listLL, listLL.size() - 1));
                        c668300QJg.LLLFZ(true);
                        c668300QJg.notifyItemInserted(iIndexOf4);
                    } else {
                        c668300QJg.LL.add((SearchHistory) ListProtector.get(listLL, listLL.size() - 1));
                        c668300QJg.LLLFZ(true);
                        c668300QJg.notifyItemInserted(19);
                    }
                }
                if (listLL.isEmpty() || listLL.size() <= c668300QJg.LLLI()) {
                    SearchHistory searchHistory6 = new SearchHistory();
                    searchHistory6.LIZ = 2;
                    if (c668300QJg.LL.contains(searchHistory6)) {
                        int iIndexOf5 = c668300QJg.LL.indexOf(searchHistory6);
                        c668300QJg.LL.remove(searchHistory6);
                        c668300QJg.notifyItemRemoved(iIndexOf5);
                        return;
                    }
                    return;
                }
                return;
            }
            if (listLL.size() == 20) {
                c668300QJg.LL.add((SearchHistory) ListProtector.get(listLL, listLL.size() - 1));
                c668300QJg.notifyItemInserted(C1697810uHb.LJIIJ(c668300QJg.LL));
            }
            if (listLL.isEmpty()) {
                SearchHistory searchHistory7 = new SearchHistory();
                searchHistory7.LIZ = 3;
                if (c668300QJg.LL.contains(searchHistory7)) {
                    int iIndexOf6 = c668300QJg.LL.indexOf(searchHistory7);
                    c668300QJg.LL.remove(searchHistory7);
                    c668300QJg.notifyItemRemoved(iIndexOf6);
                    return;
                }
                return;
            }
            return;
        }
        if (C293280BeY.LIZ && z2) {
            ArrayList<SearchHistory> arrayList4 = c668300QJg.LL;
            List<SearchHistory> listSubList = arrayList4.subList(0, arrayList4.size() - 1);
            if (listLL.size() >= listSubList.size() && Intrinsics.LJFF(listLL.subList(0, listSubList.size()), listSubList)) {
                SearchHistory searchHistory8 = new SearchHistory();
                searchHistory8.LIZ = 1;
                if (c668300QJg.LL.contains(searchHistory8)) {
                    int iIndexOf7 = c668300QJg.LL.indexOf(searchHistory8);
                    c668300QJg.LL.remove(searchHistory8);
                    c668300QJg.notifyItemRemoved(iIndexOf7);
                }
                int size = c668300QJg.LL.size();
                C0QKB.LIZ.getClass();
                if (((SearchMusicHistoryOptConfig) C0QKB.LIZJ.getValue()).isMusicHistoryUnderExpand == 1 && (!list.isEmpty())) {
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.addAll(c668300QJg.LLILLJJLI);
                    if (size <= c668300QJg.LLILLJJLI.size()) {
                        arrayList5.addAll(size, list);
                    }
                    c668300QJg.LLILLJJLI = arrayList5;
                    c668300QJg.LL.addAll(list);
                }
                c668300QJg.LL.addAll(listLL.subList(size, listLL.size()));
                if ((!listLL.isEmpty()) && listLL.size() > c668300QJg.LLLI()) {
                    ArrayList<SearchHistory> arrayList6 = c668300QJg.LL;
                    SearchHistory searchHistory9 = new SearchHistory();
                    searchHistory9.LIZ = 2;
                    arrayList6.add(searchHistory9);
                }
                c668300QJg.LLLFZ(true);
                c668300QJg.notifyItemRangeInserted(size, c668300QJg.LL.size() - size);
            }
        }
    }
}
