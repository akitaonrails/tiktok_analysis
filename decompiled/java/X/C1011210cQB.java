package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.commercialize.navigate.ICommerceNavigateService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cQB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011210cQB implements InterfaceC656120PoQ {
    public Aweme LL;
    public InterfaceC1011510cQf LLILLJJLI;
    public final SearchAdEventLogger LLILLL = new SearchAdEventLogger();
    public long LLILZ;

    @Override // X.C0PPF
    public final void onDestroy() {
    }

    @Override // X.C0PPF
    public final void bind() {
        this.LLILLL.withContext(this.LL);
    }

    @Override // X.C0PPF
    public final void onViewAttachedToWindow() {
        SearchAdEventLogger searchAdEventLogger = this.LLILLL;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd((InterfaceC1023400cjq) C1009980cOC.LLI.getValue());
        this.LLILZ = System.currentTimeMillis();
    }

    @Override // X.C0PPF
    public final void onViewDetachedFromWindow() {
        SearchAdEventLogger searchAdEventLogger = this.LLILLL;
        C1009980cOC c1009980cOC = C1009980cOC.LIZ;
        c1009980cOC.getClass();
        searchAdEventLogger.logAd((InterfaceC1023400cjq) C1009980cOC.LLIFFJFJJ.getValue());
        if (C1010120cOQ.LJJJJ(this.LL)) {
            SearchAdEventLogger searchAdEventLogger2 = this.LLILLL;
            c1009980cOC.getClass();
            searchAdEventLogger2.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LLII.getValue(), new AwS595S0100000_16(this, 21));
        }
    }

    @Override // X.C0Q70
    public final <T extends InterfaceC656540Pp6> void LIZJ(T t) {
        if (t instanceof InterfaceC1011510cQf) {
            InterfaceC1011510cQf interfaceC1011510cQf = (InterfaceC1011510cQf) t;
            this.LL = interfaceC1011510cQf.getAweme();
            this.LLILLJJLI = interfaceC1011510cQf;
        }
    }

    @Override // X.InterfaceC656120PoQ
    public final void Q1(C0Q1G c0q1g) {
        ICommerceNavigateService iCommerceNavigateServiceW2;
        String aid;
        int i = C0Q1K.LIZ[c0q1g.ordinal()];
        if (i != 1) {
            if (i == 2) {
                SearchAdEventLogger searchAdEventLogger = this.LLILLL;
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger.logAd((InterfaceC1023400cjq) C1009980cOC.LLIIIZ.getValue());
            }
        } else {
            SearchAdEventLogger searchAdEventLogger2 = this.LLILLL;
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger2.logAd((InterfaceC1023400cjq) C1009980cOC.LLIIIILZ.getValue());
        }
        Context context = null;
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService != null && (iCommerceNavigateServiceW2 = iCommerceService.w2()) != null) {
            InterfaceC1011510cQf interfaceC1011510cQf = this.LLILLJJLI;
            String requestId = null;
            if (interfaceC1011510cQf != null) {
                context = interfaceC1011510cQf.getContext();
            }
            Aweme aweme = this.LL;
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            Aweme aweme2 = this.LL;
            if (aweme2 != null) {
                requestId = aweme2.getRequestId();
            }
            iCommerceNavigateServiceW2.LIZ(context, aweme, new C1027520cqU("result_ad", "button", aid, requestId, AFwS252S0000000_16.get$arr$(12)));
        }
    }
}
