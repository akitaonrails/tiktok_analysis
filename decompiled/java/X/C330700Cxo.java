package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cxo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell$refreshViewerInsightCache$1", f = "StoryInboxCell.kt", l = {1313}, m = "invokeSuspend")
public final class C330700Cxo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ StoryInboxCell LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330700Cxo(String str, Aweme aweme, int i, StoryInboxCell storyInboxCell, InterfaceC1364105Vn<? super C330700Cxo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = aweme;
        this.LLILZIL = i;
        this.LLILZLL = storyInboxCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C330700Cxo c330700Cxo = new C330700Cxo(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c330700Cxo.LLILLJJLI = obj;
        return c330700Cxo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("StoryInboxCell@cf72.refreshViewerInsightCache$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLL;
            Aweme aweme = this.LLILZ;
            try {
                C330620Cxg.LIZ.LJI();
                c098200Yq = new C330690Cxn().LL.O(str, aweme, 0L, 0L, null, null, false);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C330710Cxp c330710Cxp = new C330710Cxp(this.LLILZIL, this.LLILZLL, (InterfaceC330550CxZ) c098200Yq, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c330710Cxp) == objLJFF) {
                C1C7U.LIZIZ("StoryInboxCell@cf72.refreshViewerInsightCache$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryInboxCell@cf72.refreshViewerInsightCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
