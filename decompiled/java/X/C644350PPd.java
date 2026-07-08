package X;

import com.ss.android.ugc.aweme.search.detail.edm.viewmodel.SearchEDMVideoDetailSharedVM;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.detail.edm.viewmodel.SearchEDMVideoDetailSharedVM$requestSearchFeedList$resultList$1", f = "SearchEDMVideoDetailSharedVM.kt", l = {}, m = "invokeSuspend")
public final class C644350PPd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C209500rN>>, Object> {
    public final /* synthetic */ SearchRequestParam LL;
    public final /* synthetic */ SearchEDMVideoDetailSharedVM LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C644350PPd(SearchRequestParam searchRequestParam, SearchEDMVideoDetailSharedVM searchEDMVideoDetailSharedVM, long j, InterfaceC1364105Vn<? super C644350PPd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchRequestParam;
        this.LLILLJJLI = searchEDMVideoDetailSharedVM;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C644350PPd(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b5 A[PHI: r12
      0x02b5: PHI (r12v4 java.lang.String) = (r12v3 java.lang.String), (r12v8 java.lang.String) binds: [B:119:0x02b1, B:43:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02bb A[PHI: r12 r13
      0x02bb: PHI (r12v5 java.lang.String) = (r12v4 java.lang.String), (r12v7 java.lang.String) binds: [B:122:0x02b7, B:46:0x0144] A[DONT_GENERATE, DONT_INLINE]
      0x02bb: PHI (r13v2 java.lang.String) = (r13v1 java.lang.String), (r13v4 java.lang.String) binds: [B:122:0x02b7, B:46:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019c  */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.13BV] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r56) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C644350PPd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C209500rN>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
