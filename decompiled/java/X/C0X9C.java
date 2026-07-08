package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0X9C, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X9C extends C09AY implements Function2<String, Function1<? super C189200o6<? extends Pair<? extends String, ? extends String>>, ? extends Unit>, Unit> {
    public final /* synthetic */ C1546840qM6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0X9C(C1546840qM6 c1546840qM6) {
        super(2);
        this.LL = c1546840qM6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Function1<? super C189200o6<? extends Pair<? extends String, ? extends String>>, ? extends Unit> function1) {
        final String str2 = str;
        final Function1<? super C189200o6<? extends Pair<? extends String, ? extends String>>, ? extends Unit> function12 = function1;
        final C1546840qM6 c1546840qM6 = this.LL;
        c1546840qM6.LIZIZ.submit(new Runnable() { // from class: X.0X9B
            public final void LIZ() {
                Object c098200Yq;
                byte[] bArrLJIIIZ;
                Forest forest = c1546840qM6.LIZ;
                String str3 = str2;
                Integer num = null;
                RequestParams requestParams = new RequestParams(null, 1, null);
                requestParams.onlyOnline = true;
                C1533910q1F c1533910q1FCreateSyncRequest = forest.createSyncRequest(str3, requestParams);
                if (c1533910q1FCreateSyncRequest == null) {
                    Function1<C189200o6<Pair<String, String>>, Unit> function13 = function12;
                    C098200Yq c098200Yq2 = new C098200Yq(new RuntimeException("Create sync request failed!"));
                    C189200o6.m2constructorimpl(c098200Yq2);
                    function13.invoke(C189200o6.m1boximpl(c098200Yq2));
                    return;
                }
                try {
                    c098200Yq = c1533910q1FCreateSyncRequest.LIZIZ();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Function1<C189200o6<Pair<String, String>>, Unit> function14 = function12;
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C098200Yq c098200Yq3 = new C098200Yq(thM5exceptionOrNullimpl);
                    C189200o6.m2constructorimpl(c098200Yq3);
                    function14.invoke(C189200o6.m1boximpl(c098200Yq3));
                    return;
                }
                C1533790q13 c1533790q13 = (C1533790q13) c098200Yq;
                if (c1533790q13 == null || (bArrLJIIIZ = c1533790q13.LJIIIZ()) == null) {
                    Function1<C189200o6<Pair<String, String>>, Unit> function15 = function12;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("request res error!code=");
                    if (c1533790q13 != null && c1533790q13.LIZLLL != null) {
                        num = 0;
                    }
                    sbLIZ.append(num);
                    C098200Yq c098200Yq4 = new C098200Yq(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
                    C189200o6.m2constructorimpl(c098200Yq4);
                    function15.invoke(C189200o6.m1boximpl(c098200Yq4));
                    return;
                }
                String str4 = new String(bArrLJIIIZ, Charsets.UTF_8);
                if (a0.LJJJIL(str4)) {
                    Function1<C189200o6<Pair<String, String>>, Unit> function16 = function12;
                    C098200Yq c098200Yq5 = new C098200Yq(new RuntimeException("Response is blank!"));
                    C189200o6.m2constructorimpl(c098200Yq5);
                    function16.invoke(C189200o6.m1boximpl(c098200Yq5));
                    return;
                }
                Function1<C189200o6<Pair<String, String>>, Unit> function17 = function12;
                Pair pair = new Pair(str2, str4);
                C189200o6.m2constructorimpl(pair);
                function17.invoke(C189200o6.m1boximpl(pair));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("I18nResFetcher@fd07.fetcher$1$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("I18nResFetcher@fd07.fetcher$1$1");
            }
        });
        return Unit.LIZ;
    }
}
