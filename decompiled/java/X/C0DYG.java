package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DYG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.core.viewmodel.SearchLynxAwemeListRepoViewModel$RepoImpl$doLoadMore$2", f = "SearchLynxAwemeListRepoViewModel.kt", l = {159}, m = "invokeSuspend")
public final class C0DYG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends List<? extends Aweme>, ? extends Boolean>>, Object> {
    public int LL;
    public final /* synthetic */ C0DYH LLILLJJLI;
    public final /* synthetic */ HashMap<String, String> LLILLL;
    public final /* synthetic */ C0DYF LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DYG(C0DYH c0dyh, HashMap<String, String> map, C0DYF c0dyf, InterfaceC1364105Vn<? super C0DYG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0dyh;
        this.LLILLL = map;
        this.LLILZ = c0dyf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DYG(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[PHI: r2
      0x0052: PHI (r2v2 java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>) = 
      (r2v1 java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>)
      (r2v4 java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>)
      (r2v4 java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>)
      (r2v4 java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>)
     binds: [B:10:0x0032, B:12:0x0042, B:14:0x0048, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "SearchLynxAwemeListRepoViewModel$RepoImpl@a2b7.doLoadMore$2"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LL
            r4 = 1
            if (r0 == 0) goto L62
            if (r0 != r4) goto L7b
            X.C155000ia.LIZIZ(r7)
        L13:
            java.lang.String r7 = (java.lang.String) r7
            X.04rF r1 = X.C1227904rF.LIZ
            X.0DYI r0 = new X.0DYI
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            r1.getClass()
            java.lang.Object r3 = X.C1227904rF.LIZJ(r7, r0)
            com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData r3 = (com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData) r3
            X.0DYF r1 = r6.LLILZ
            r2 = 0
            if (r3 == 0) goto L60
            java.lang.Long r0 = r3.newCursor
        L30:
            r1.LIZJ = r0
            if (r3 == 0) goto L52
            java.util.List r2 = r3.LJ()
            java.lang.Boolean r1 = r3.hasMore
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L52
            java.util.List r0 = r3.LJ()
            if (r0 == 0) goto L52
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L53
        L52:
            r4 = 0
        L53:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            X.C1C7U.LIZIZ(r5)
            return r0
        L60:
            r0 = r2
            goto L30
        L62:
            X.C155000ia.LIZIZ(r7)
            com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew$RealApi r2 = com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew.LIZ()
            X.0DYH r0 = r6.LLILLJJLI
            java.lang.String r1 = r0.LIZ
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r6.LLILLL
            r6.LL = r4
            java.lang.Object r7 = r2.commonHorizontalLodMore(r1, r0, r6)
            if (r7 != r3) goto L13
            X.C1C7U.LIZIZ(r5)
            return r3
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DYG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends List<? extends Aweme>, ? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
