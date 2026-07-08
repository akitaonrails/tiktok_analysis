package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.models.RssArticle;
import com.ss.android.ugc.aweme.rss.feed.viewmodel.RssFeedViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS597S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0gQO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.rss.feed.viewmodel.RssFeedViewModel$loadRssFeed$1$2", f = "RssFeedViewModel.kt", l = {46}, m = "invokeSuspend")
public final class C1165100gQO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ RssFeedViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165100gQO(RssFeedViewModel rssFeedViewModel, InterfaceC1364105Vn<? super C1165100gQO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = rssFeedViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1165100gQO c1165100gQO = new C1165100gQO(this.LLILLL, interfaceC1364105Vn);
        c1165100gQO.LLILLJJLI = obj;
        return c1165100gQO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("RssFeedViewModel@d57.loadRssFeed$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                RssFeedViewModel rssFeedViewModel = this.LLILLL;
                InterfaceC1165170gQV interfaceC1165170gQV = rssFeedViewModel.LLILLJJLI;
                String str = rssFeedViewModel.LLILLL;
                this.LL = 1;
                obj = interfaceC1165170gQV.LIZIZ(str, null, null, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("RssFeedViewModel@d57.loadRssFeed$1$2");
                    return objLJFF;
                }
            }
            c098200Yq = (List) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        RssFeedViewModel rssFeedViewModel2 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            List list = (List) c098200Yq;
            rssFeedViewModel2.getClass();
            rssFeedViewModel2.setState(new AwS597S0100000_18(list, (List<String>) 31));
            int size = list.size();
            int i2 = 0;
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((RssArticle) it2.next()).isPublished && (i2 = i2 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            C1395020mPE c1395020mPE = C1395020mPE.LIZ;
            String enterFrom = rssFeedViewModel2.LL.getEnterFrom();
            c1395020mPE.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
            c2344009Gk.LIZJ(size, "show_cnt");
            c2344009Gk.LIZJ(i2, "posted_cnt");
            C20684815ws.LJIILLIIL("article_list_show", c2344009Gk.LIZ);
        }
        RssFeedViewModel rssFeedViewModel3 = this.LLILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            rssFeedViewModel3.getClass();
            C1395020mPE.LIZ.getClass();
            C2344809Gs.LJI(thM5exceptionOrNullimpl);
            rssFeedViewModel3.setState(new AwS597S0100000_18(thM5exceptionOrNullimpl, 30));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RssFeedViewModel@d57.loadRssFeed$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
