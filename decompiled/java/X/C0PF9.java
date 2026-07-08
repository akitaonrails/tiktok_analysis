package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenterImplKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PF9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0PF9 extends C645130PSd {
    public final RecyclerView LLLFF;
    public final RecyclerView.LayoutManager LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final List<ISearchCardProtocol<InterfaceC594520NTm>> LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C0PFM LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;

    public final C0PFK LLLZLL() {
        return (C0PFK) this.LLLFZ.getValue();
    }

    @Override // X.C645130PSd
    public final int LLLLLIL(int i) {
        C0PF7 c0pf7 = (C0PF7) ((HashMap) this.LLLIIL.getValue()).get(Integer.valueOf(i));
        if (c0pf7 != null) {
            return c0pf7.LJFF();
        }
        return -1;
    }

    @Override // X.C645130PSd, X.AbstractC438050HFr
    public int getBasicItemViewType(int i) {
        InterfaceC594520NTm interfaceC594520NTm;
        Integer numValueOf;
        int iLIZLLL;
        C0PFN c0pfn;
        List<T> list = this.mmItems;
        if (list != 0 && (interfaceC594520NTm = (SearchMixFeed) C13LP.LJJJLZIJ(i, list)) != null) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC594520NTm.class);
            InterfaceC594520NTm interfaceC594520NTmLIZ = null;
            if ((interfaceC594520NTm instanceof C0PFN) && (c0pfn = (C0PFN) interfaceC594520NTm) != null) {
                interfaceC594520NTmLIZ = c0pfn.LIZ();
            }
            if (c19719912DlLIZ.LIZIZ(interfaceC594520NTmLIZ) && interfaceC594520NTmLIZ != null) {
                interfaceC594520NTm = interfaceC594520NTmLIZ;
            }
            if (C0PU8.LJFF() && (interfaceC594520NTm instanceof C0PU4)) {
                String str = ((DynamicPatch) ((C0PU4) interfaceC594520NTm).LLILZLL.getValue()).schema;
                if (C647970PbH.LIZJ(str)) {
                    C649470Pdh.LIZ.getClass();
                    iLIZLLL = C649470Pdh.LIZLLL(str);
                } else {
                    iLIZLLL = 15;
                }
                numValueOf = Integer.valueOf(iLIZLLL);
            } else {
                ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolLJFF = C0PH8.LJFF(interfaceC594520NTm, C0NMY.GENERAL_SEARCH, C651290Pgd.LIZLLL(), false);
                if (iSearchCardProtocolLJFF != null) {
                    numValueOf = (Integer) ((Map) this.LLLIIII.getValue()).get(iSearchCardProtocolLJFF);
                }
            }
            if (numValueOf != null) {
                numValueOf.intValue();
                return numValueOf.intValue();
            }
        }
        return super.getBasicItemViewType(i);
    }

    @Override // X.C645130PSd, X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof SearchCardViewHolder) {
            SearchCardViewHolder searchCardViewHolder = (SearchCardViewHolder) viewHolder;
            searchCardViewHolder.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onViewRecycled: ");
            sbLIZ.append(searchCardViewHolder);
            C2344809Gs.LJFF("AssemList_SearchCardVH", C2188811AlT.LIZIZ(sbLIZ));
            searchCardViewHolder.wY0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed] */
    /* JADX WARN: Type inference failed for: r22v0, types: [X.0PF9, X.0PSd, X.0Qrd] */
    /* JADX WARN: Type inference failed for: r23v0, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0NTm] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder] */
    @Override // X.C645130PSd, X.C0PT0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJJJI(androidx.recyclerview.widget.RecyclerView.ViewHolder r23, int r24) {
        /*
            r22 = this;
            r6 = r23
            r5 = r24
            r7 = r22
            super.LJJJJI(r6, r5)
            boolean r0 = r6 instanceof com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder
            if (r0 == 0) goto Lb6
            java.util.List<T> r0 = r7.mmItems
            if (r0 == 0) goto Lbc
            java.lang.Object r11 = X.C13LP.LJJJLZIJ(r5, r0)
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r11 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r11
            if (r11 == 0) goto Lbc
            java.lang.Class<X.0NTm> r0 = X.InterfaceC594520NTm.class
            X.12Dl r1 = X.C13LE.LIZ(r0)
            boolean r0 = r11 instanceof X.C0PFN
            if (r0 == 0) goto Lb9
            r0 = r11
            X.0PFN r0 = (X.C0PFN) r0
            if (r0 == 0) goto Lb9
            X.0NTm r4 = r0.LIZ()
        L2c:
            boolean r0 = r1.LIZIZ(r4)
            if (r0 == 0) goto L34
            if (r4 != 0) goto L35
        L34:
            r4 = r11
        L35:
            r0 = r6
            X.0RyY r0 = (X.InterfaceC713360RyY) r0
            X.0Q7z r3 = X.C1558420qem.LIZIZ(r0)
            X.0PkS r2 = r7.LLLLLLZ(r5, r11)
            android.view.View r0 = r6.itemView
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r1 = X.C0Q3E.LIZ(r0)
            if (r1 == 0) goto L74
            java.lang.String r13 = r2.LJIIIIZZ
            java.lang.String r12 = r2.LJIIJJI
            int r10 = r2.LJIILL
            java.lang.String r16 = r11.getProviderDocIdStr()
            java.lang.Integer r9 = r11.universalRank
            X.0PL2 r8 = r11.insertType
            int r19 = r11.retrieveIncrementalId()
            androidx.recyclerview.widget.RecyclerView r0 = r7.LL
            boolean r0 = r0 instanceof X.C0PPX
            X.0PWy r11 = new X.0PWy
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            r21 = 3072(0xc00, float:4.305E-42)
            r20 = r0
            r18 = r8
            r17 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.fe(r11)
        L74:
            android.view.View r8 = r6.itemView
            r1 = 2131389748(0x7f0a6d34, float:1.8400048E38)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.setTag(r1, r0)
            if (r3 == 0) goto L8c
            X.0PFR r8 = new X.0PFR
            r8.<init>(r2)
            java.lang.Class<X.0PFR> r1 = X.C0PFR.class
            java.lang.String r0 = "source_default_key"
            X.C1554960qZC.LIZ(r3, r8, r1, r0)
        L8c:
            boolean r0 = X.C650240Pew.LIZ()
            if (r0 == 0) goto Lb7
            androidx.recyclerview.widget.RecyclerView r0 = r7.LLLFF
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.getLayoutManager()
            boolean r0 = r1 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto Lb7
            androidx.recyclerview.widget.GridLayoutManager r1 = (androidx.recyclerview.widget.GridLayoutManager) r1
            if (r1 == 0) goto Lb7
            X.195h r2 = r1.LLIZ
            int r1 = r1.LLILLJJLI
            int r0 = r6.getBindingAdapterPosition()
            int r0 = r2.LJ(r0, r1)
            if (r0 != 0) goto Lb7
            r1 = 1
        Laf:
            com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder r6 = (com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder) r6
            com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel r0 = r7.LLJJI
            r6.I5(r5, r4, r0, r1)
        Lb6:
            return
        Lb7:
            r1 = 0
            goto Laf
        Lb9:
            r4 = 0
            goto L2c
        Lbc:
            X.0PFJ r4 = new X.0PFJ
            r4.<init>()
            goto L8c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PF9.LJJJJI(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.C645130PSd, X.C0PT0
    public RecyclerView.ViewHolder LJLIIIL(int i, ViewGroup viewGroup) {
        boolean z;
        SearchCardViewHolder searchCardViewHolderLIZ;
        ISearchCardProtocol<InterfaceC594520NTm> protocol;
        Class<?> cls;
        int i2;
        String strLIZIZ;
        if ((C0BDI.LIZ() & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0PFA c0pfa = this.LLJJIJI;
            C0PF7 c0pf7 = (C0PF7) ((HashMap) this.LLLIIL.getValue()).get(Integer.valueOf(i));
            if (c0pf7 != null && (protocol = c0pf7.getProtocol()) != null && (cls = protocol.getClass()) != null) {
                C0PFI c0pfi = c0pfa.LJII.get(cls);
                if (c0pfi != null) {
                    String simpleName = cls.getSimpleName();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    RecyclerView.ViewHolder viewHolderLIZIZ = c0pfi.LIZIZ();
                    if (viewHolderLIZIZ == null) {
                        viewHolderLIZIZ = c0pfi.LIZ();
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (c0pfa.LIZIZ.LLIIJLIL().length() > 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c0pfa.LIZIZ.LLIIJLIL());
                        sbLIZ.append("_viewholder");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        strLIZIZ = "viewholder";
                    }
                    C01V2.LIZ(i2, strLIZIZ, jCurrentTimeMillis2, simpleName);
                    if (viewHolderLIZIZ != null) {
                        return viewHolderLIZIZ;
                    }
                }
            } else {
                c0pfa.getClass();
            }
        }
        C0PF7 c0pf72 = (C0PF7) ((HashMap) this.LLLIIL.getValue()).get(Integer.valueOf(i));
        if (c0pf72 == null || (searchCardViewHolderLIZ = c0pf72.LIZ(null, viewGroup)) == null) {
            return super.LJLIIIL(i, viewGroup);
        }
        return searchCardViewHolderLIZ;
    }

    @Override // X.C645130PSd, X.C0PFE
    public final RecyclerView.ViewHolder LLJJIII(ViewGroup viewGroup, Class<?> cls) {
        Integer num;
        Class<?> cls2;
        ISearchCardProtocol<InterfaceC594520NTm> protocol;
        C0PKD.LIZIZ.getClass();
        for (Object obj : C0PKD.LIZ()) {
            if (Intrinsics.LJFF(obj.getClass(), cls)) {
                if (obj == null || (num = (Integer) ((Map) this.LLLIIII.getValue()).get(obj)) == null) {
                    return null;
                }
                C0PF7 c0pf7 = (C0PF7) ((HashMap) this.LLLIIL.getValue()).get(Integer.valueOf(num.intValue()));
                if (c0pf7 != null && (protocol = c0pf7.getProtocol()) != null) {
                    cls2 = protocol.getClass();
                } else {
                    cls2 = null;
                }
                if (!Intrinsics.LJFF(cls2, cls)) {
                    return null;
                }
                return c0pf7.LIZ(null, viewGroup);
            }
        }
        return null;
    }

    public final boolean LLLZLZ(InterfaceC594520NTm interfaceC594520NTm, int i, C0PL2 c0pl2) {
        SearchMixFeed searchMixFeed;
        SearchMixFeed searchMixFeed2;
        SearchMixFeed c0pfl;
        int iIntValue;
        Integer numValueOf;
        int iIntValue2;
        List<SearchMixFeed> listLIZJ;
        List<SearchMixFeed> listLIZJ2;
        List<SearchMixFeed> listLIZJ3;
        Integer num;
        List<T> list = this.mmItems;
        if (list != 0 && i >= 0 && i <= list.size()) {
            List<T> list2 = this.mmItems;
            Integer numValueOf2 = null;
            if (list2 != 0) {
                searchMixFeed = (SearchMixFeed) C13LP.LJJJLZIJ(i - 1, list2);
            } else {
                searchMixFeed = null;
            }
            List<T> list3 = this.mmItems;
            if (list3 != 0) {
                searchMixFeed2 = (SearchMixFeed) C13LP.LJJJLZIJ(i, list3);
            } else {
                searchMixFeed2 = null;
            }
            if (!(interfaceC594520NTm instanceof SearchMixFeed) || (c0pfl = (SearchMixFeed) interfaceC594520NTm) == null) {
                c0pfl = new C0PFL(interfaceC594520NTm);
            }
            List<T> list4 = this.mmItems;
            if (list4 != 0) {
                ListProtector.add(list4, i, c0pfl);
            }
            if (searchMixFeed2 != null && (num = searchMixFeed2.universalRank) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = i;
            }
            C0PFX.LIZIZ(c0pfl, iIntValue, c0pl2);
            C0PFK c0pfkLLLZLL = LLLZLL();
            if (c0pfkLLLZLL != null && (listLIZJ3 = c0pfkLLLZLL.LIZJ()) != null) {
                numValueOf = Integer.valueOf(listLIZJ3.indexOf(searchMixFeed));
            } else {
                numValueOf = null;
            }
            C0PFK c0pfkLLLZLL2 = LLLZLL();
            if (c0pfkLLLZLL2 != null && (listLIZJ2 = c0pfkLLLZLL2.LIZJ()) != null) {
                numValueOf2 = Integer.valueOf(listLIZJ2.indexOf(searchMixFeed2));
            }
            int size = -1;
            if (numValueOf != null && numValueOf.intValue() != -1) {
                numValueOf2 = Integer.valueOf(numValueOf.intValue() + 1);
            }
            if (numValueOf2 != null) {
                iIntValue2 = numValueOf2.intValue();
            } else {
                iIntValue2 = i;
            }
            C0PFK c0pfkLLLZLL3 = LLLZLL();
            if (c0pfkLLLZLL3 != null && (listLIZJ = c0pfkLLLZLL3.LIZJ()) != null) {
                size = listLIZJ.size();
            }
            if (iIntValue2 <= size && iIntValue2 >= 0) {
                C0PFK c0pfkLLLZLL4 = LLLZLL();
                if (c0pfkLLLZLL4 != null) {
                    c0pfkLLLZLL4.LIZIZ(i, iIntValue2, c0pfl, searchMixFeed, searchMixFeed2);
                }
                notifyItemInserted(i);
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean LLLZZ(SearchMixFeed searchMixFeed, int i, C0PL2 c0pl2) {
        SearchMixFeed searchMixFeed2;
        SearchMixFeed searchMixFeed3;
        int iIntValue;
        Integer numValueOf;
        int iIntValue2;
        List<SearchMixFeed> listLIZJ;
        List<SearchMixFeed> listLIZJ2;
        List<SearchMixFeed> listLIZJ3;
        Integer num;
        List<T> list = this.mmItems;
        if (list != 0 && i >= 0 && i <= list.size()) {
            List<T> list2 = this.mmItems;
            Integer numValueOf2 = null;
            if (list2 != 0) {
                searchMixFeed2 = (SearchMixFeed) C13LP.LJJJLZIJ(i - 1, list2);
            } else {
                searchMixFeed2 = null;
            }
            List<T> list3 = this.mmItems;
            if (list3 != 0) {
                searchMixFeed3 = (SearchMixFeed) C13LP.LJJJLZIJ(i, list3);
            } else {
                searchMixFeed3 = null;
            }
            List<T> list4 = this.mmItems;
            if (list4 != 0) {
                ListProtector.add(list4, i, searchMixFeed);
            }
            if (searchMixFeed3 != null && (num = searchMixFeed3.universalRank) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = i;
            }
            C0PFX.LIZIZ(searchMixFeed, iIntValue, c0pl2);
            C0PFK c0pfkLLLZLL = LLLZLL();
            if (c0pfkLLLZLL != null && (listLIZJ3 = c0pfkLLLZLL.LIZJ()) != null) {
                numValueOf = Integer.valueOf(listLIZJ3.indexOf(searchMixFeed2));
            } else {
                numValueOf = null;
            }
            C0PFK c0pfkLLLZLL2 = LLLZLL();
            if (c0pfkLLLZLL2 != null && (listLIZJ2 = c0pfkLLLZLL2.LIZJ()) != null) {
                numValueOf2 = Integer.valueOf(listLIZJ2.indexOf(searchMixFeed3));
            }
            int size = -1;
            if (numValueOf != null && numValueOf.intValue() != -1) {
                numValueOf2 = Integer.valueOf(numValueOf.intValue() + 1);
            }
            if (numValueOf2 != null) {
                iIntValue2 = numValueOf2.intValue();
            } else {
                iIntValue2 = i;
            }
            C0PFK c0pfkLLLZLL3 = LLLZLL();
            if (c0pfkLLLZLL3 != null && (listLIZJ = c0pfkLLLZLL3.LIZJ()) != null) {
                size = listLIZJ.size();
            }
            if (iIntValue2 <= size && iIntValue2 >= 0) {
                C0PFK c0pfkLLLZLL4 = LLLZLL();
                if (c0pfkLLLZLL4 != null) {
                    c0pfkLLLZLL4.LIZIZ(i, iIntValue2, searchMixFeed, searchMixFeed2, searchMixFeed3);
                }
                notifyItemInserted(i);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C645130PSd
    public final void LLLZ(long j, long j2, Aweme aweme, String str, boolean z) {
        if (this.LLLIIIL.LIZIZ(j, j2, aweme, z)) {
            return;
        }
        super.LLLZ(j, j2, aweme, str, z);
    }

    public C0PF9(C0PDT c0pdt, Fragment fragment, RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager, InterfaceC641090PCp interfaceC641090PCp, InterfaceC659300PtY interfaceC659300PtY, C0P6P c0p6p, InterfaceC643430PLp interfaceC643430PLp) {
        GridLayoutManager gridLayoutManager;
        super(recyclerView, interfaceC641090PCp, interfaceC659300PtY, c0p6p, fragment, interfaceC643430PLp);
        this.LLLFF = recyclerView;
        this.LLLFFI = layoutManager;
        if (!(this.LL instanceof C0PPX)) {
            SearchServiceCenterImplKt.LIZLLL(fragment, fragment, c0pdt, new AwS589S0100000_10(this, 632));
            if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
                SearchServiceCenterImplKt.LIZJ(fragment, this, gridLayoutManager);
            }
            SearchServiceCenterImplKt.LIZIZ(fragment, recyclerView, layoutManager);
        }
        this.LLLFZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1278));
        this.LLLI = C452501pT.LIZIZ(new AwS411S0200000_10(fragment, this, 112));
        this.LLLII = C0PH8.LIZJ(C0NMY.GENERAL_SEARCH);
        this.LLLIIII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1280));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1277));
        this.LLLIIIIL = c01gwLIZIZ;
        this.LLLIIIL = SearchServiceCenterImplKt.LJ(fragment, (ArrayList) c01gwLIZIZ.getValue());
        this.LLLIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1281));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1279));
    }
}
