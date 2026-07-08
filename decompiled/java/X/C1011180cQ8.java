package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.commercialize.navigate.ICommerceNavigateService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.AwS67S1000000_16;

/* JADX INFO: renamed from: X.0cQ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011180cQ8 implements InterfaceC656040PoI {
    public Aweme LL;
    public InterfaceC1011380cQS LLILLJJLI;
    public C0Q18 LLILLL;
    public final SearchAdEventLogger LLILZ = new SearchAdEventLogger();
    public long LLILZIL;

    @Override // X.C0PPF
    public final void onDestroy() {
        C0Q18 c0q18 = this.LLILLL;
        if (c0q18 != null) {
            c0q18.onDestroy();
        }
    }

    @Override // X.C0PPF
    public final void onViewAttachedToWindow() {
        C0Q18 c0q18 = this.LLILLL;
        if (c0q18 != null) {
            c0q18.onViewAttachedToWindow();
        }
        SearchAdEventLogger searchAdEventLogger = this.LLILZ;
        if (searchAdEventLogger != null) {
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger.logAd((InterfaceC1023400cjq) C1009980cOC.LJLLILLLL.getValue());
        }
        this.LLILZIL = System.currentTimeMillis();
    }

    @Override // X.C0PPF
    public final void onViewDetachedFromWindow() {
        SearchAdEventLogger searchAdEventLogger;
        C0Q18 c0q18 = this.LLILLL;
        if (c0q18 != null) {
            c0q18.onViewDetachedFromWindow();
        }
        SearchAdEventLogger searchAdEventLogger2 = this.LLILZ;
        if (searchAdEventLogger2 != null) {
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger2.logAd((InterfaceC1023400cjq) C1009980cOC.LJLLLL.getValue());
        }
        if (!C1010120cOQ.LJJJJ(this.LL) || (searchAdEventLogger = this.LLILZ) == null) {
            return;
        }
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LJZI.getValue(), new AwS595S0100000_16(this, 382));
    }

    @Override // X.C0PPF
    public final void bind() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind main aweme aid: ");
        Aweme aweme = this.LL;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZ.withContext(this.LL);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        Aweme aweme2 = this.LL;
        sbLIZ2.append(aweme2 != null ? aweme2.getAid() : null);
        sbLIZ2.append(hashCode());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        C0Q18 c0q18LIZIZ = interfaceC657510PqfLIZLLL != null ? interfaceC657510PqfLIZLLL.LIZIZ(this.LL, strLIZIZ, true, false) : null;
        this.LLILLL = c0q18LIZIZ;
        if (c0q18LIZIZ != null) {
            Aweme aweme3 = this.LL;
            InterfaceC1011380cQS interfaceC1011380cQS = this.LLILLJJLI;
            c0q18LIZIZ.Jt2(new C1010460cOy(aweme3, interfaceC1011380cQS != null ? interfaceC1011380cQS.getContext() : null, new C1009920cO6(this.LL, this.LLILZ, new AwS630S0100000_16(this, 100)), new InterfaceC1003440cDe() { // from class: X.0cQK
                @Override // X.InterfaceC1003440cDe
                public final View LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC1003440cDe
                public final void LIZJ(View view, Integer num, Integer num2) {
                }

                @Override // X.InterfaceC1003440cDe
                public final boolean LIZLLL() {
                    return true;
                }

                @Override // X.InterfaceC1003440cDe
                public final void LJFF(String str) {
                }

                @Override // X.InterfaceC1003440cDe
                public final void LJI(View view) {
                }

                @Override // X.InterfaceC1003440cDe
                public final Function0<Unit> LJII() {
                    return AFwS204S0000000_16.get$arr$(156);
                }

                @Override // X.InterfaceC1003440cDe
                public final void LJ(View view) {
                    InterfaceC1631620sYq<Aweme, String, View, Unit> interfaceC1631620sYqLIZ;
                    InterfaceC1011380cQS interfaceC1011380cQS2 = this.LIZ.LLILLJJLI;
                    if (interfaceC1011380cQS2 != null && (interfaceC1631620sYqLIZ = interfaceC1011380cQS2.LIZ()) != null) {
                        interfaceC1631620sYqLIZ.invoke(this.LIZ.LL, "ads", view);
                    }
                }
            }, null, null, 48));
        }
        C0Q18 c0q18 = this.LLILLL;
        if (c0q18 != null) {
            c0q18.bind();
        }
    }

    @Override // X.InterfaceC656040PoI
    public final C0Q18 LIZ() {
        return this.LLILLL;
    }

    @Override // X.C0Q70
    public final <T extends InterfaceC656540Pp6> void LIZJ(T t) {
        if (t instanceof InterfaceC1011380cQS) {
            InterfaceC1011380cQS interfaceC1011380cQS = (InterfaceC1011380cQS) t;
            this.LL = interfaceC1011380cQS.getAweme();
            this.LLILLJJLI = interfaceC1011380cQS;
        }
    }

    @Override // X.InterfaceC656040PoI
    public final void LJI(String str) {
        SearchAdEventLogger searchAdEventLogger = this.LLILZ;
        if (searchAdEventLogger != null) {
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LJZ.getValue(), new AwS67S1000000_16(str, 37));
        }
    }

    @Override // X.InterfaceC656040PoI
    public final void Q1(C0Q1G c0q1g) {
        ICommerceNavigateService iCommerceNavigateServiceW2;
        String aid;
        int i = C0Q1L.LIZ[c0q1g.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    SearchAdEventLogger searchAdEventLogger = this.LLILZ;
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd(C1009980cOC.LJIIL);
                }
            } else {
                SearchAdEventLogger searchAdEventLogger2 = this.LLILZ;
                if (searchAdEventLogger2 != null) {
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger2.logAd((InterfaceC1023400cjq) C1009980cOC.LJLZ.getValue());
                }
            }
        } else {
            SearchAdEventLogger searchAdEventLogger3 = this.LLILZ;
            if (searchAdEventLogger3 != null) {
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger3.logAd((InterfaceC1023400cjq) C1009980cOC.LJLLLLLL.getValue());
            }
        }
        Context context = null;
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService != null && (iCommerceNavigateServiceW2 = iCommerceService.w2()) != null) {
            InterfaceC1011380cQS interfaceC1011380cQS = this.LLILLJJLI;
            String requestId = null;
            if (interfaceC1011380cQS != null) {
                context = interfaceC1011380cQS.getContext();
            }
            Aweme aweme = this.LL;
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            Aweme aweme2 = this.LL;
            if (aweme2 != null) {
                requestId = aweme2.getRequestId();
            }
            iCommerceNavigateServiceW2.LIZ(context, aweme, new C1027520cqU("result_ad", "button", aid, requestId, AFwS241S0000000_10.get$arr$(551)));
        }
    }
}
