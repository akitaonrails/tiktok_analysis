package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.BackFromDetailProvider;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C654980Pma extends AbstractC652420PiS implements InterfaceC644520PPu {
    public static final /* synthetic */ int LLJJJJ = 0;
    public final InterfaceC641090PCp LLIZLLLIL;
    public final C652990PjN LLJ;
    public final RecyclerView LLJI;
    public final InterfaceC653420Pk4 LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public InterfaceC653430Pk5 LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public List<? extends Aweme> LLJJIJIL;
    public final C01GW LLJJJ;
    public final C653130Pjb LLJJJIL;

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return 1;
    }

    public final LinkedHashMap<String, Pair<Aweme, Integer>> LLLIIIIL() {
        return (LinkedHashMap) this.LLJILJIL.getValue();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        if (this.LLJJIJIL.size() != 1) {
            return this.LLJJIJIL.size();
        }
        return 1;
    }

    @Override // X.AbstractC656440Pow
    public final List<Aweme> LLLFZ() {
        return this.LLJJIJIL;
    }

    public final void LLLIILIL(List<? extends Aweme> list) {
        Integer numValueOf;
        for (Aweme aweme : list) {
            if (aweme.getAid() != null && !LLLIIIIL().containsKey(aweme.getAid())) {
                LLLIIIIL().put(aweme.getAid(), new Pair<>(aweme, Integer.valueOf(((AtomicInteger) this.LLJILJILJ.getValue()).getAndIncrement())));
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeToFullMap, totalSize: ");
        LinkedHashMap<String, Pair<Aweme, Integer>> linkedHashMapLLLIIIIL = LLLIIIIL();
        if (linkedHashMapLLLIIIIL != null) {
            numValueOf = Integer.valueOf(linkedHashMapLLLIIIIL.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", lastIndex: ");
        sbLIZ.append(((AtomicInteger) this.LLJILJILJ.getValue()).get());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC644520PPu
    public final boolean sq(String str) {
        return LLLIIIIL().containsKey(str);
    }

    @Override // X.InterfaceC644520PPu
    public final void x(String str) {
        Pair<Aweme, Integer> pair;
        Aweme next;
        InterfaceC648720PcU interfaceC648720PcU;
        if (this.LLJJIJIL.size() > 1 && (pair = LLLIIIIL().get(str)) != null) {
            int iIntValue = pair.getSecond().intValue();
            int i = this.LLJILLL;
            int i2 = 0;
            if (iIntValue > this.LLJJ || i > iIntValue) {
                int i3 = (iIntValue - 10) + 1;
                if (i3 < 0) {
                    iIntValue = Math.min(9, LLLIIIIL().size() - 1);
                    i3 = 0;
                }
                LLLI(C652230Pi9.LIZ(i3, iIntValue + 1, C09RB.LJJII(new C08LY(new C1939607ik(LLLIIIIL().values()), AFwS241S0000000_10.get$arr$(227)))), null, null, false, null);
            }
            int i4 = -1;
            for (Aweme aweme : this.LLJJIJIL) {
                int i5 = i2 + 1;
                if (i2 >= 0) {
                    if (Intrinsics.LJFF(aweme.getAid(), str)) {
                        i4 = i2;
                    }
                    i2 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            Iterator<? extends Aweme> it2 = this.LLJJIJIL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getAid(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Aweme aweme2 = next;
            InterfaceC653430Pk5 interfaceC653430Pk5 = this.LLJJIJI;
            if (interfaceC653430Pk5 != null) {
                interfaceC653430Pk5.LIZ();
            }
            RecyclerView.LayoutManager layoutManager = this.LLJI.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
                if (C301200BrK.LIZ()) {
                    BackFromDetailProvider.ISearchLiveExitLocatorAbility iSearchLiveExitLocatorAbility = (BackFromDetailProvider.ISearchLiveExitLocatorAbility) C1558520qew.LIZ(C1558360qeg.LJ(this.LLJI, null), BackFromDetailProvider.ISearchLiveExitLocatorAbility.class, null);
                    if (iSearchLiveExitLocatorAbility != null) {
                        iSearchLiveExitLocatorAbility.ut2(i4);
                    }
                } else {
                    C652630Pin c652630PinLIZIZ = C653830Pkj.LIZIZ(this.LLJI);
                    if (c652630PinLIZIZ != null && (interfaceC648720PcU = c652630PinLIZIZ.LL) != null) {
                        interfaceC648720PcU.LIZLLL(i4, null);
                    }
                }
            }
            C0PUV.LIZIZ(aweme2, this.LLJI, this.LLILZIL, EnumC645610PTz.SEARCH_LIVE_FEED, false, false);
            this.LLJIJIL.LIZ(aweme2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x094e  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r40, int r41) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C654980Pma.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|(1:4)|5|(2:21|(1:23)(2:45|46))(11:(0)|20|47|24|(1:26)|29|49|30|(4:32|51|33|(3:35|38|(1:40)))|43|44)|10|(1:14)|15|(1:19)|20|47|24|(0)|29|49|30|(0)|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C2081408Dk.LIZ(r0);
        X.C2344809Gs.LIZ(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:24:0x0075, B:26:0x0079), top: B:47:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r9, int r10) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C654980Pma.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    @Override // X.InterfaceC644520PPu
    public final void rq(SearchLiveList searchLiveList, List<? extends Aweme> list, boolean z) {
        LLLIILIL(list);
        C654590Plx c654590Plx = this.LLILZLL;
        if (c654590Plx != null) {
            Collection<Pair<Aweme, Integer>> collectionValues = LLLIIIIL().values();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Pair) it2.next()).getFirst());
            }
            c654590Plx.LIZJ = arrayList;
        }
        C654590Plx c654590Plx2 = this.LLILZLL;
        if (c654590Plx2 != null) {
            c654590Plx2.LIZLLL = searchLiveList.cursor;
        }
    }

    @Override // X.AbstractC652420PiS
    public final void LLLI(List<? extends Aweme> list, SearchCardInfo searchCardInfo, Long l, boolean z, String str) {
        int iIntValue;
        long jLongValue;
        if (z) {
            this.LLILZLL = null;
            LLLIIIIL().clear();
            ((AtomicInteger) this.LLJILJILJ.getValue()).set(0);
        }
        this.LLJJIJIL = list;
        if (LLLIIIIL().isEmpty()) {
            LLLIILIL(list);
        }
        Pair<Aweme, Integer> pair = LLLIIIIL().get(((Aweme) ListProtector.get(list, 0)).getAid());
        int iIntValue2 = -1;
        if (pair != null) {
            iIntValue = pair.getSecond().intValue();
        } else {
            iIntValue = -1;
        }
        this.LLJILLL = iIntValue;
        Pair<Aweme, Integer> pair2 = LLLIIIIL().get(((Aweme) ListProtector.get(list, list.size() - 1)).getAid());
        if (pair2 != null) {
            iIntValue2 = pair2.getSecond().intValue();
        }
        this.LLJJ = iIntValue2;
        ((ArrayList) this.LLIZ).clear();
        Iterator<? extends Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            ((ArrayList) this.LLIZ).add(new C655440PnK(it2.next()));
        }
        if (this.LLILZLL == null) {
            C653660PkS c653660PkS = this.LLILZIL;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            this.LLILZLL = new C654590Plx(searchCardInfo, c653660PkS, list, jLongValue, str);
        }
        notifyDataSetChanged();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0PjO, X.0Pjb] */
    public C654980Pma(InterfaceC641090PCp interfaceC641090PCp, C652990PjN c652990PjN, final RecyclerView recyclerView, int i, String str, C652210Pi7 c652210Pi7) {
        super(recyclerView);
        this.LLIZLLLIL = interfaceC641090PCp;
        this.LLJ = c652990PjN;
        this.LLJI = recyclerView;
        this.LLJIJIL = c652210Pi7;
        this.LLJILJIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(208));
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(287));
        this.LLJJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 501));
        this.LLJJIII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 511));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 512));
        this.LLJJIJIL = new ArrayList();
        this.LLJJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 510));
        ?? r0 = new InterfaceC653000PjO(recyclerView) { // from class: X.0Pjb
            public final View LIZ;
            public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(605));
            public final Rect LIZJ = new Rect(0, 0, 0, 0);
            public final Rect LIZLLL = new Rect(0, 0, 0, 0);
            public int LJ;

            @Override // X.InterfaceC653000PjO
            public final int getOrientation() {
                return this.LJ;
            }

            {
                this.LIZ = recyclerView;
            }

            public static final boolean LJI(Rect rect) {
                if (rect.right > rect.left && rect.bottom > rect.top) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC653000PjO
            public final void LIZ(int i2) {
                this.LJ = i2;
            }

            @Override // X.InterfaceC653000PjO
            public final boolean LIZIZ(Rect rect) {
                float f;
                int i2;
                int i3;
                if (!LJI(rect)) {
                    return false;
                }
                if (this.LJ == 0) {
                    f = rect.top + ((rect.bottom - r1) / 2.0f);
                    Rect rect2 = this.LIZJ;
                    i2 = rect2.top;
                    i3 = rect2.bottom;
                } else {
                    f = rect.left + ((rect.right - r1) / 2.0f);
                    Rect rect3 = this.LIZJ;
                    i2 = rect3.left;
                    i3 = rect3.right;
                }
                if (f < i2 || f > i3) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:45:0x01a1  */
            @Override // X.InterfaceC653000PjO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.AbstractC653010PjP LIZJ(java.util.Collection<? extends X.AbstractC653010PjP> r14) {
                /*
                    Method dump skipped, instruction units count: 477
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C653130Pjb.LIZJ(java.util.Collection):X.0PjP");
            }

            @Override // X.InterfaceC653000PjO
            public final boolean LIZLLL(Rect rect) {
                float f;
                int i2;
                int i3;
                if (!LJI(rect)) {
                    return false;
                }
                if (this.LJ == 0) {
                    f = this.LIZJ.top + ((r0.bottom - r1) / 2.0f);
                    i2 = rect.top;
                    i3 = rect.bottom;
                } else {
                    f = this.LIZJ.left + ((r0.right - r1) / 2.0f);
                    i2 = rect.left;
                    i3 = rect.right;
                }
                if (f < i2 || f > i3) {
                    return false;
                }
                return true;
            }

            public static final boolean LJFF(AbstractC653010PjP abstractC653010PjP, int i2) {
                if (abstractC653010PjP == null || abstractC653010PjP.LIZ == i2) {
                    return false;
                }
                abstractC653010PjP.LIZ = i2;
                return true;
            }

            public final float LJ(Rect rect, float f) {
                int i2;
                int i3;
                if (this.LJ == 0) {
                    i2 = rect.top;
                    i3 = rect.bottom;
                } else {
                    i2 = rect.left;
                    i3 = rect.right;
                }
                float f2 = i2;
                if (f2 <= f && i3 >= f) {
                    return 0.0f;
                }
                if (f2 > f) {
                    return f2 - f;
                }
                return f - i3;
            }
        };
        c652990PjN.LJII = r0;
        this.LLJJJIL = r0;
    }
}
