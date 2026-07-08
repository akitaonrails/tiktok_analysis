package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.AwS176S0101000_9;

/* JADX INFO: renamed from: X.0PBJ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PBJ implements InterfaceC640580PAq {
    public final C0NMX LIZ;
    public final C0PN8 LIZIZ;
    public final C645130PSd LIZJ;
    public final RecyclerView LIZLLL;
    public final CopyOnWriteArraySet<Integer> LJ = new CopyOnWriteArraySet<>();
    public final ConcurrentLinkedQueue<C0PBK> LJFF = new ConcurrentLinkedQueue<>();

    @Override // X.InterfaceC640580PAq
    public final List<SearchMixFeed> LIZJ(List<? extends SearchMixFeed> list) {
        C0PBK c0pbkPeek;
        List<SearchMixFeed> first;
        List<SearchMixFeed> arrayList = new ArrayList<>(list);
        while (this.LJFF.peek() != null && (c0pbkPeek = this.LJFF.peek()) != null) {
            Iterator<SearchMixFeed> it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().retrieveIncrementalId() == c0pbkPeek.LIZ.retrieveIncrementalId()) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() >= 0 && 1 != 0) {
                int iIntValue = numValueOf.intValue();
                C0PBJ c0pbj = c0pbkPeek.LIZJ;
                Pair<List<SearchMixFeed>, SearchMixFeed> pairLIZIZ = c0pbj.LIZ.LIZIZ(arrayList, new AwS176S0101000_9(iIntValue, c0pbj, 4));
                first = pairLIZIZ.getFirst();
                SearchMixFeed second = pairLIZIZ.getSecond();
                if (second == null) {
                    break;
                }
                c0pbkPeek.LIZIZ.LJIIZILJ(second);
                if (first == null) {
                    return arrayList;
                }
            } else {
                first = arrayList;
            }
            this.LJFF.poll();
            arrayList = first;
        }
        return arrayList;
    }

    @Override // X.InterfaceC640580PAq
    public final SearchMixFeed LIZLLL(SearchMixFeed searchMixFeed) {
        Iterator<SearchMixFeed> it2 = this.LIZIZ.getItems().iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().retrieveIncrementalId() == searchMixFeed.retrieveIncrementalId()) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() >= 0) {
            z = true;
        }
        if (!z) {
            return null;
        }
        Pair<List<SearchMixFeed>, SearchMixFeed> pairLIZIZ = this.LIZ.LIZIZ(this.LIZIZ.getItems(), new AwS176S0101000_9(numValueOf.intValue(), this, 3));
        List<SearchMixFeed> first = pairLIZIZ.getFirst();
        SearchMixFeed second = pairLIZIZ.getSecond();
        if (second == null) {
            return null;
        }
        this.LIZIZ.LJIL(first);
        C0PFZ c0pfz = C0PFZ.LIZ;
        List<SearchMixFeed> items = this.LIZIZ.getItems();
        c0pfz.getClass();
        this.LIZJ.LLLLZLLIL(new ArrayList(C0PFZ.LIZJ(items)));
        return second;
    }

    @Override // X.InterfaceC640580PAq
    public final AnonymousClass0957 LJ(C0PFL c0pfl) {
        C099F c099fLIZIZ = C090F.LIZIZ();
        this.LJFF.add(new C0PBK(this, c0pfl, c099fLIZIZ));
        return c099fLIZIZ;
    }

    public C0PBJ(C0NMX c0nmx, C0PN8 c0pn8, C645130PSd c645130PSd, RecyclerView recyclerView) {
        this.LIZ = c0nmx;
        this.LIZIZ = c0pn8;
        this.LIZJ = c645130PSd;
        this.LIZLLL = recyclerView;
        recyclerView.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0PBI
            @Override // X.InterfaceC21676519sR
            public final void m3(View view) {
            }

            @Override // X.InterfaceC21676519sR
            public final void g5(View view) {
                C0PVB c0pvb;
                AbstractC683590Qrd abstractC683590Qrd;
                List data;
                SearchMixFeed searchMixFeed;
                RecyclerView.ViewHolder childViewHolder = this.LL.LIZLLL.getChildViewHolder(view);
                if (childViewHolder != null) {
                    Integer numValueOf = Integer.valueOf(childViewHolder.getBindingAdapterPosition());
                    if (numValueOf.intValue() >= 0) {
                        String desc = null;
                        if (1 != 0) {
                            int iIntValue = numValueOf.intValue();
                            AbstractC21673619ry adapter = this.LL.LIZLLL.getAdapter();
                            if ((adapter instanceof C0PVB) && (c0pvb = (C0PVB) adapter) != null) {
                                AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry = c0pvb.LL;
                                if ((abstractC21673619ry instanceof C645130PSd) && (abstractC683590Qrd = (AbstractC683590Qrd) abstractC21673619ry) != null && (data = abstractC683590Qrd.getData()) != null && (searchMixFeed = (SearchMixFeed) C13LP.LJJJLZIJ(iIntValue - ((ArrayList) c0pvb.LLLI()).size(), data)) != null) {
                                    this.LL.LJ.add(Integer.valueOf(searchMixFeed.retrieveIncrementalId()));
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Exposed: [");
                                    sbLIZ.append(searchMixFeed.retrieveIncrementalId());
                                    sbLIZ.append("] ");
                                    Aweme aweme = searchMixFeed.getAweme();
                                    if (aweme != null) {
                                        desc = aweme.getDesc();
                                    }
                                    sbLIZ.append(desc);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                }
                            }
                        }
                    }
                }
            }
        });
    }
}
