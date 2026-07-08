package X;

import Y.ARunnableS110S0100000_10;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673760Qbm extends AbstractC21673619ry<RecyclerView.ViewHolder> implements InterfaceC673850Qbv {
    public final C673810Qbr LLILLL;
    public HashMap<String, Object> LLILZIL;
    public final ArrayList<SearchHistory> LL = new ArrayList<>();
    public List<? extends SearchHistory> LLILLJJLI = C13BV.INSTANCE;
    public String LLILZ = "";

    public final void LLLFZ() {
        C673820Qbs c673820Qbs = this.LLILLL.LIZJ;
        if (c673820Qbs.LIZIZ < 4) {
            int i = 4 - c673820Qbs.LIZIZ;
            for (int i2 = 0; i2 < i; i2++) {
                C823050WQl.LIZLLL().execute(new ARunnableS110S0100000_10(c673820Qbs, 191));
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C673760Qbm(RecyclerView recyclerView) {
        this.LLILLL = new C673810Qbr(recyclerView, this);
    }

    @Override // X.InterfaceC673850Qbv
    public final C673750Qbl LJJLI(ViewGroup viewGroup) {
        View viewLIZIZ;
        int i = C673750Qbl.LLJILJILJ;
        System.currentTimeMillis();
        C275120AqM.LIZ.getClass();
        if (C275120AqM.LIZ()) {
            viewLIZIZ = C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.bow, viewGroup, false);
        } else {
            viewLIZIZ = C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.bov, viewGroup, false);
        }
        C673750Qbl c673750Qbl = new C673750Qbl(viewLIZIZ);
        System.currentTimeMillis();
        return c673750Qbl;
    }

    @Override // X.InterfaceC673850Qbv
    public final C673770Qbn LLJLIL(ViewGroup viewGroup) {
        int i = C673770Qbn.LLIZ;
        System.currentTimeMillis();
        C673770Qbn c673770Qbn = new C673770Qbn(C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.box, viewGroup, false));
        System.currentTimeMillis();
        return c673770Qbn;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return ((SearchHistory) ListProtector.get(this.LL, i)).LIZ;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        if (viewHolder instanceof C673750Qbl) {
            C673750Qbl c673750Qbl = (C673750Qbl) viewHolder;
            SearchHistory searchHistory = (SearchHistory) C13LP.LJJJLZIJ(i, this.LL);
            String str2 = this.LLILZ;
            c673750Qbl.LLILLL = this.LLILZIL;
            c673750Qbl.LLILZ = i;
            c673750Qbl.LL = searchHistory;
            c673750Qbl.LLILLJJLI = str2;
            c673750Qbl.LLILZIL = c673750Qbl.LLILZIL;
            TuxTextView tuxTextView = c673750Qbl.LLIZ;
            if (tuxTextView != null) {
                SearchHistory searchHistory2 = c673750Qbl.LL;
                if (searchHistory2 == null || (str = searchHistory2.keyword) == null) {
                    str = "";
                }
                tuxTextView.setText(new SpannableString(str));
            }
            C275120AqM.LIZ.getClass();
            if (C275120AqM.LIZ()) {
                if (!c673750Qbl.LLILZLL) {
                    c673750Qbl.LLILZLL = true;
                    HandlerHook.viewPost(c673750Qbl.itemView, new ARunnableS110S0100000_10(c673750Qbl, 190));
                    return;
                }
                return;
            }
            if (c673750Qbl.LLILZLL) {
                return;
            }
            c673750Qbl.LLILZLL = true;
            HandlerHook.viewPost(c673750Qbl.itemView, new ARunnableS110S0100000_10(c673750Qbl, 189));
            return;
        }
        if (viewHolder instanceof C673770Qbn) {
            C673770Qbn c673770Qbn = (C673770Qbn) viewHolder;
            List<? extends SearchHistory> list = this.LLILLJJLI;
            c673770Qbn.LLILLJJLI = this.LLILZIL;
            c673770Qbn.LL.clear();
            c673770Qbn.LL.addAll(list);
            TuxTextView tuxTextView2 = c673770Qbn.LLILZ;
            if (tuxTextView2 == null) {
                return;
            }
            tuxTextView2.setText(C20642515q3.LJI(2131847140));
            return;
        }
        if (!(viewHolder instanceof C673780Qbo)) {
            return;
        }
        C673780Qbo c673780Qbo = (C673780Qbo) viewHolder;
        ArrayList<SearchHistory> arrayList = this.LL;
        c673780Qbo.LLILLJJLI = this.LLILZIL;
        c673780Qbo.LL.clear();
        c673780Qbo.LL.addAll(arrayList);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLIZ = null;
        boolean zLIZ = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    C673810Qbr c673810Qbr = this.LLILLL;
                    c673810Qbr.getClass();
                    System.currentTimeMillis();
                    C673820Qbs c673820Qbs = c673810Qbr.LIZJ;
                    if (!c673820Qbs.LIZ.isEmpty()) {
                        viewHolderLIZ = c673820Qbs.LIZ.poll();
                    }
                    if (viewHolderLIZ == null) {
                        viewHolderLIZ = c673810Qbr.LIZJ.LIZ();
                    }
                    System.currentTimeMillis();
                } else {
                    int i2 = C673780Qbo.LLILZIL;
                    viewHolderLIZ = new C673780Qbo(C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.bou, viewGroup, false));
                }
            } else {
                C673810Qbr c673810Qbr2 = this.LLILLL;
                c673810Qbr2.getClass();
                System.currentTimeMillis();
                C673830Qbt c673830Qbt = c673810Qbr2.LIZLLL;
                if (!c673830Qbt.LIZ.isEmpty()) {
                    viewHolderLIZ = c673830Qbt.LIZ.poll();
                }
                if (viewHolderLIZ == null) {
                    viewHolderLIZ = c673810Qbr2.LIZLLL.LIZ();
                }
                System.currentTimeMillis();
            }
        } else {
            C673810Qbr c673810Qbr3 = this.LLILLL;
            c673810Qbr3.getClass();
            System.currentTimeMillis();
            C673820Qbs c673820Qbs2 = c673810Qbr3.LIZJ;
            if (!c673820Qbs2.LIZ.isEmpty()) {
                viewHolderLIZ = c673820Qbs2.LIZ.poll();
            }
            if (viewHolderLIZ == null) {
                viewHolderLIZ = c673810Qbr3.LIZJ.LIZ();
            }
            System.currentTimeMillis();
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

    public final void LLLI(String str, HashMap map, List list) {
        this.LLILZIL = map;
        this.LLILLJJLI = list;
        this.LLILZ = str;
        List listLL = C13LP.LL(list, 20);
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        jSONObject.put("action_type", "show");
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("search_history", jSONObject);
        this.LL.clear();
        this.LL.addAll(C13LP.LL(listLL, 4));
        if (listLL.size() > 4) {
            ArrayList<SearchHistory> arrayList = this.LL;
            SearchHistory searchHistory = new SearchHistory();
            searchHistory.LIZ = 1;
            arrayList.add(searchHistory);
        }
        notifyDataSetChanged();
    }

    public static void LLLII(C673760Qbm c673760Qbm, boolean z, SearchHistory searchHistory, boolean z2, int i) {
        if ((i & 2) != 0) {
            searchHistory = null;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if (searchHistory != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c673760Qbm.LLILLJJLI);
            arrayList.remove(searchHistory);
            c673760Qbm.LLILLJJLI = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<? extends SearchHistory> it2 = c673760Qbm.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().keyword);
        }
        HashMap<String, Object> map = c673760Qbm.LLILZIL;
        if (map != null) {
            map.put("show_history_word_list", C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62));
        }
        List listLL = C13LP.LL(c673760Qbm.LLILLJJLI, 20);
        if (searchHistory != null && c673760Qbm.LL.contains(searchHistory)) {
            int iIndexOf = c673760Qbm.LL.indexOf(searchHistory);
            c673760Qbm.LL.remove(searchHistory);
            c673760Qbm.notifyItemRemoved(iIndexOf);
            if (!z) {
                ArrayList<SearchHistory> arrayList3 = c673760Qbm.LL;
                ArrayList arrayList4 = new ArrayList();
                for (SearchHistory searchHistory2 : arrayList3) {
                    int i2 = searchHistory2.LIZ;
                    if (i2 == 0 || i2 == -1) {
                        arrayList4.add(searchHistory2);
                    }
                }
                if (arrayList4.size() < 4) {
                    if (listLL.size() > 4) {
                        ListProtector.add(c673760Qbm.LL, 3, ListProtector.get(listLL, 3));
                        c673760Qbm.notifyItemInserted(3);
                        return;
                    }
                    if (listLL.size() == 4) {
                        ListProtector.add(c673760Qbm.LL, 3, ListProtector.get(listLL, 3));
                        c673760Qbm.notifyItemInserted(3);
                        SearchHistory searchHistory3 = new SearchHistory();
                        searchHistory3.LIZ = 1;
                        if (!c673760Qbm.LL.contains(searchHistory3)) {
                            return;
                        }
                        int iIndexOf2 = c673760Qbm.LL.indexOf(searchHistory3);
                        c673760Qbm.LL.remove(searchHistory3);
                        c673760Qbm.notifyItemRemoved(iIndexOf2);
                        return;
                    }
                    SearchHistory searchHistory4 = new SearchHistory();
                    searchHistory4.LIZ = 1;
                    if (!c673760Qbm.LL.contains(searchHistory4)) {
                        return;
                    }
                    int iIndexOf3 = c673760Qbm.LL.indexOf(searchHistory4);
                    c673760Qbm.LL.remove(searchHistory4);
                    c673760Qbm.notifyItemRemoved(iIndexOf3);
                    return;
                }
                return;
            }
            if (listLL.size() == 20) {
                c673760Qbm.LL.add((SearchHistory) ListProtector.get(listLL, listLL.size() - 1));
                c673760Qbm.notifyItemInserted(19);
            }
            if (listLL.isEmpty() || listLL.size() <= 4) {
                SearchHistory searchHistory5 = new SearchHistory();
                searchHistory5.LIZ = 2;
                if (c673760Qbm.LL.contains(searchHistory5)) {
                    int iIndexOf4 = c673760Qbm.LL.indexOf(searchHistory5);
                    c673760Qbm.LL.remove(searchHistory5);
                    c673760Qbm.notifyItemRemoved(iIndexOf4);
                    return;
                }
                return;
            }
            return;
        }
        if (z2) {
            ArrayList<SearchHistory> arrayList5 = c673760Qbm.LL;
            List<SearchHistory> listSubList = arrayList5.subList(0, arrayList5.size() - 1);
            if (listLL.size() >= listSubList.size() && Intrinsics.LJFF(listLL.subList(0, listSubList.size()), listSubList)) {
                SearchHistory searchHistory6 = new SearchHistory();
                searchHistory6.LIZ = 1;
                if (c673760Qbm.LL.contains(searchHistory6)) {
                    int iIndexOf5 = c673760Qbm.LL.indexOf(searchHistory6);
                    c673760Qbm.LL.remove(searchHistory6);
                    c673760Qbm.notifyItemRemoved(iIndexOf5);
                }
                int size = c673760Qbm.LL.size();
                c673760Qbm.LL.addAll(listLL.subList(size, listLL.size()));
                if ((!listLL.isEmpty()) && listLL.size() > 4) {
                    ArrayList<SearchHistory> arrayList6 = c673760Qbm.LL;
                    SearchHistory searchHistory7 = new SearchHistory();
                    searchHistory7.LIZ = 2;
                    arrayList6.add(searchHistory7);
                }
                c673760Qbm.notifyItemRangeInserted(size, c673760Qbm.LL.size() - size);
            }
        }
    }
}
