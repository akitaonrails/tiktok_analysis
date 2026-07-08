package X;

import com.ss.android.ugc.aweme.explore.api.ExploreTopicFeedRequestOverride;
import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;

/* JADX INFO: renamed from: X.15TT, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15TT implements C15TN {
    public ExploreTopicAwemeListResponse LL;
    public final /* synthetic */ C15TU LLILLJJLI;

    public C15TT(C15TU c15tu) {
        this.LLILLJJLI = c15tu;
    }

    @Override // X.C15TN
    public final Object c(C15TH c15th, long j, String str, String str2, ExploreTopicFeedRequestOverride exploreTopicFeedRequestOverride, Function0 function0, InterfaceC497601wk interfaceC497601wk, Function1 function1, AbstractC23140094w abstractC23140094w) {
        boolean z;
        EnumC1841880y1y enumC1841880y1y;
        this.LLILLJJLI.LLILLJJLI.add(C2286608xc.LJFF(j));
        C15TZ c15tz = this.LLILLJJLI.LL;
        c15tz.getClass();
        C2153908cD c2153908cD = C2153908cD.LIZ;
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(458);
        c2153908cD.getClass();
        C2153908cD.LIZIZ("explore_topic_feed_chunk_process_request", aFwS221S0000000_31);
        c15tz.LIZ.set(EnumC1568470quz.INIT);
        AnonymousClass0956 anonymousClass0956 = c15tz.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c15tz.LIZIZ = null;
        c15tz.LIZLLL = null;
        if (C288840BTu.LIZ() && c15th == C15TH.LOAD_MORE) {
            z = false;
        } else {
            z = true;
        }
        if (c15th == C15TH.SERVER_UG) {
            enumC1841880y1y = EnumC1841880y1y.PREFETCH;
        } else {
            enumC1841880y1y = EnumC1841880y1y.FALLBACK;
        }
        C15TU c15tu = this.LLILLJJLI;
        return c15tu.LL.LIZ(c15th, j, str, exploreTopicFeedRequestOverride, function0, interfaceC497601wk, AFwS221S0000000_31.get$arr$(540), new C15TS(c15tu, this, z, str2, j, enumC1841880y1y, function1), AFwS276S0000000_31.get$arr$(354), abstractC23140094w);
    }
}
