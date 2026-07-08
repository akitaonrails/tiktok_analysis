package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.ViewObjectWrapper;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ZE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder$bindProductDynamicAnchorOnCover$1", f = "SearchVideoHolder.kt", l = {2529}, m = "invokeSuspend")
public final class C08ZE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ SearchVideoHolder LLILZIL;
    public final /* synthetic */ AnchorCommonStruct LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08ZE(Aweme aweme, String str, SearchVideoHolder searchVideoHolder, AnchorCommonStruct anchorCommonStruct, InterfaceC1364105Vn<? super C08ZE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aweme;
        this.LLILZ = str;
        this.LLILZIL = searchVideoHolder;
        this.LLILZLL = anchorCommonStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C08ZE c08ze = new C08ZE(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c08ze.LLILLJJLI = obj;
        return c08ze;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("SearchVideoHolder@6f53.bindProductDynamicAnchorOnCover$1");
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
            String str = this.LLILZ;
            try {
                C1227904rF.LIZ.getClass();
                c098200Yq = (ViewObjectWrapper) C1227904rF.LIZIZ(str, ViewObjectWrapper.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            ViewObjectWrapper viewObjectWrapper = (ViewObjectWrapper) c098200Yq;
            if (viewObjectWrapper == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SearchVideoHolder@6f53.bindProductDynamicAnchorOnCover$1");
                return unit;
            }
            String aid = this.LLILLL.getAid();
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C659380Ptg c659380Ptg = new C659380Ptg(this.LLILZIL, aid, this.LLILZLL, viewObjectWrapper, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c659380Ptg) == objLJFF) {
                C1C7U.LIZIZ("SearchVideoHolder@6f53.bindProductDynamicAnchorOnCover$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchVideoHolder@6f53.bindProductDynamicAnchorOnCover$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
