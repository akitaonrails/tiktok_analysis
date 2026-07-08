package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.models.RssArticle;
import com.ss.android.ugc.aweme.rss.feed.viewmodel.RssFeedViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS597S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0gQP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.rss.feed.viewmodel.RssFeedViewModel$downloadImagesWithFilePaths$1$2", f = "RssFeedViewModel.kt", l = {68}, m = "invokeSuspend")
public final class C1165110gQP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ RssFeedViewModel LLILZ;
    public final /* synthetic */ List<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165110gQP(RssFeedViewModel rssFeedViewModel, List<String> list, InterfaceC1364105Vn<? super C1165110gQP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = rssFeedViewModel;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1165110gQP c1165110gQP = new C1165110gQP(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1165110gQP.LLILLL = obj;
        return c1165110gQP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Integer numValueOf;
        C259800zU c259800zU;
        C259800zU c259800zU2;
        T t;
        C1C7U.LIZ("RssFeedViewModel@d57.downloadImagesWithFilePaths$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    c259800zU = this.LL;
                    c259800zU2 = (C259800zU) this.LLILLL;
                    C155000ia.LIZIZ(obj);
                    t = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                RssFeedViewModel rssFeedViewModel = this.LLILZ;
                List<String> list = this.LLILZIL;
                c259800zU = new C259800zU();
                System.currentTimeMillis();
                C1321590kUn c1321590kUn = rssFeedViewModel.LLILZIL;
                this.LLILLL = c259800zU;
                this.LL = c259800zU;
                this.LLILLJJLI = 1;
                Object objLIZ = c1321590kUn.LIZ(list, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("RssFeedViewModel@d57.downloadImagesWithFilePaths$1$2");
                    return objLJFF;
                }
                c259800zU2 = c259800zU;
                t = objLIZ;
            }
            c259800zU.element = t;
            System.currentTimeMillis();
            c098200Yq = (List) c259800zU2.element;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        RssFeedViewModel rssFeedViewModel2 = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            List list2 = (List) c098200Yq;
            rssFeedViewModel2.getClass();
            if (list2.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Downloaded 0 images for ");
                RssArticle rssArticle = rssFeedViewModel2.LLILZ;
                if (rssArticle != null) {
                    numValueOf = Integer.valueOf(rssArticle.guid);
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                Exception exc = new Exception(C2188811AlT.LIZIZ(sbLIZ));
                C1395020mPE.LIZ.getClass();
                C2344809Gs.LJI(exc);
                rssFeedViewModel2.setState(new AwS597S0100000_18((Throwable) exc, 28));
            } else {
                rssFeedViewModel2.setState(new AwS597S0100000_18(list2, (List<String>) 29));
            }
        }
        RssFeedViewModel rssFeedViewModel3 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            rssFeedViewModel3.getClass();
            C1395020mPE.LIZ.getClass();
            C2344809Gs.LJI(thM5exceptionOrNullimpl);
            rssFeedViewModel3.setState(new AwS597S0100000_18(thM5exceptionOrNullimpl, 28));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RssFeedViewModel@d57.downloadImagesWithFilePaths$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
