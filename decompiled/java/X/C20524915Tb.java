package X;

import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreCardInsertResultStruct;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS168S0101000_31;
import kotlin.jvm.internal.AwS43S0001000_31;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS59S0010000_16;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15Tb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20524915Tb implements InterfaceC1575410r6B {
    public final /* synthetic */ C15TX LL;

    public C20524915Tb(C15TX c15tx) {
        this.LL = c15tx;
    }

    @Override // X.InterfaceC1575410r6B
    public final Object LJJJJLL(boolean z, boolean z2, Aweme aweme, Integer num, int i, Function0<C15VE> function0, ExploreFeedRequestOverride exploreFeedRequestOverride, Function1<? super ExploreAwemeList, Unit> function1, InterfaceC1364105Vn<? super ExploreAwemeList> interfaceC1364105Vn) {
        C20524815Ta c20524815Ta = C20524815Ta.LIZ;
        C2153908cD c2153908cD = C2153908cD.LIZ;
        AwS59S0010000_16 awS59S0010000_16 = new AwS59S0010000_16(z, 2);
        c2153908cD.getClass();
        C2153908cD.LIZIZ("explore_main_topic_chunk_process_request", awS59S0010000_16);
        C20524815Ta.LIZIZ.set(EnumC1568420quu.INIT);
        AnonymousClass0956 anonymousClass0956 = C20524815Ta.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C20524815Ta.LIZJ = null;
        C20524815Ta.LJ = null;
        C259800zU c259800zU = new C259800zU();
        C15TX c15tx = this.LL;
        return c20524815Ta.LIZ(z, z2, num, i, function0, c15tx.LLILLL, exploreFeedRequestOverride, new AwS168S0101000_31(i, c15tx, 5), new C20525115Td(this.LL, z, aweme, z2, i, c259800zU, function1), new AwS43S0001000_31(i, 4), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1575410r6B
    public final Object b(final boolean z, final boolean z2, final Aweme aweme, Integer num, final int i, Function0<C15VE> function0, ExploreFeedRequestOverride exploreFeedRequestOverride, final Function1<? super ExploreAwemeList, Unit> function1, InterfaceC1364105Vn<? super ExploreAwemeList> interfaceC1364105Vn) {
        boolean zLJI = MethodIDManager.LJI(137961);
        final C15TX c15tx = this.LL;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C11NZ<ExploreAwemeList> c11nzLIZJ = C15UV.LIZ.LIZJ(z, z2, C276670Asr.LIZ(z), num, i, function0, c15tx.LLILLL, exploreFeedRequestOverride);
        if (c11nzLIZJ != null) {
            c11nzLIZJ.LIZIZ(new InterfaceC626120Oh8<ExploreAwemeList>() { // from class: X.15Tc
                public InterfaceC420801kM LL;
                public ExploreAwemeList LLILLJJLI;

                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                    ExploreAwemeList exploreAwemeList;
                    C2153908cD c2153908cD = C2153908cD.LIZ;
                    if (c2252611DEt.isActive() && (exploreAwemeList = this.LLILLJJLI) != null) {
                        InterfaceC20236714Gf<ExploreAwemeList> interfaceC20236714Gf = c2252611DEt;
                        C189200o6.m2constructorimpl(exploreAwemeList);
                        interfaceC20236714Gf.resumeWith(exploreAwemeList);
                    }
                    if (i == EnumC1568370qup.NO_PREFETCH.getValue()) {
                        C15UV.LIZ.LJ();
                    }
                    InterfaceC420801kM interfaceC420801kM = this.LL;
                    if (interfaceC420801kM != null) {
                        interfaceC420801kM.dispose();
                    }
                }

                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) {
                    InterfaceC20236714Gf<ExploreAwemeList> interfaceC20236714Gf = c2252611DEt;
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf.resumeWith(c098200Yq);
                    C2153908cD c2153908cD = C2153908cD.LIZ;
                    AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(th, 1885);
                    c2153908cD.getClass();
                    C2153908cD.LIZ("ExploreFeedChunk_log", awS568S0100000_24);
                }

                @Override // X.InterfaceC626120Oh8
                public final void onNext(ExploreAwemeList exploreAwemeList) {
                    List<ExploreCardInsertResultStruct> list;
                    List<ExplorePostItem> list2;
                    ExploreAwemeList exploreAwemeList2 = exploreAwemeList;
                    if (c2252611DEt.isActive()) {
                        C15TX c15tx2 = c15tx;
                        boolean z3 = z;
                        Aweme aweme2 = aweme;
                        boolean z4 = z2;
                        int i2 = i;
                        c15tx2.getClass();
                        C15TX.LIZ(exploreAwemeList2, z3, aweme2, z4, i2, true);
                        this.LLILLJJLI = exploreAwemeList2;
                        InterfaceC20236714Gf<ExploreAwemeList> interfaceC20236714Gf = c2252611DEt;
                        C189200o6.m2constructorimpl(exploreAwemeList2);
                        interfaceC20236714Gf.resumeWith(exploreAwemeList2);
                        if (z) {
                            Keva keva = C15UA.LIZ;
                            if (keva.getInt("is_first_refresh", 0) == 1) {
                                keva.storeString("request_id", exploreAwemeList2.getRequestId());
                                keva.storeInt("is_first_refresh", 0);
                            }
                        }
                        C2153908cD c2153908cD = C2153908cD.LIZ;
                        return;
                    }
                    if (exploreAwemeList2.LL) {
                        return;
                    }
                    C15TX c15tx3 = c15tx;
                    boolean z5 = z;
                    Aweme aweme3 = aweme;
                    boolean z6 = z2;
                    int i3 = i;
                    C15TX c15tx4 = C15TX.LLILZLL;
                    c15tx3.getClass();
                    C15TX.LIZ(exploreAwemeList2, z5, aweme3, z6, i3, false);
                    C2153908cD c2153908cD2 = C2153908cD.LIZ;
                    function1.invoke(exploreAwemeList2);
                    ExploreAwemeList exploreAwemeList3 = new ExploreAwemeList();
                    ArrayList arrayList = new ArrayList();
                    ExploreAwemeList exploreAwemeList4 = this.LLILLJJLI;
                    if (exploreAwemeList4 != null && (list2 = exploreAwemeList4.items) != null) {
                        arrayList.addAll(list2);
                    }
                    List<ExplorePostItem> list3 = exploreAwemeList2.items;
                    if (list3 != null) {
                        arrayList.addAll(list3);
                    }
                    exploreAwemeList3.items = arrayList;
                    ArrayList arrayList2 = new ArrayList();
                    ExploreAwemeList exploreAwemeList5 = this.LLILLJJLI;
                    if (exploreAwemeList5 != null && (list = exploreAwemeList5.cards) != null) {
                        arrayList2.addAll(list);
                    }
                    List<ExploreCardInsertResultStruct> list4 = exploreAwemeList2.cards;
                    if (list4 != null) {
                        arrayList2.addAll(list4);
                    }
                    exploreAwemeList3.cards = arrayList2;
                    exploreAwemeList3.hasMore = exploreAwemeList2.hasMore;
                    exploreAwemeList3.setRequestId(exploreAwemeList2.getRequestId());
                    exploreAwemeList3.logPb = exploreAwemeList2.logPb;
                    exploreAwemeList3.LLILZ = exploreAwemeList2.LLILZ;
                    exploreAwemeList3.preloadInfo = exploreAwemeList2.preloadInfo;
                    C15TX c15tx5 = c15tx;
                    boolean z7 = z;
                    int i4 = i;
                    c15tx5.getClass();
                    if (!z7) {
                        return;
                    }
                    if (i4 != EnumC1568370qup.NO_PREFETCH.getValue() && c15tx5.LLILLJJLI) {
                        return;
                    }
                    C15T8.LL.getClass();
                    C15T8.LIZ(i4, exploreAwemeList3);
                    C20524315Sv.LL.getClass();
                    C20524315Sv.LJI(exploreAwemeList3);
                }

                @Override // X.InterfaceC626120Oh8
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    this.LL = interfaceC420801kM;
                    c2252611DEt.LJJII(new AwS610S0100000_31(interfaceC420801kM, 543));
                    if (i == EnumC1568370qup.NO_PREFETCH.getValue()) {
                        c15tx.LLILLJJLI = true;
                    }
                }
            });
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return objLJIJ;
    }
}
