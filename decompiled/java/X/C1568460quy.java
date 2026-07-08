package X;

import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0quy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.chunk.ExploreTopicFeedChunkProcessRequest$observeState$2$2", f = "ExploreTopicFeedChunkProcessRequest.kt", l = {141, 145, 152}, m = "invokeSuspend")
public final class C1568460quy extends C09AX implements Function2<ExploreTopicAwemeListResponse, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<ExploreTopicAwemeListResponse, Unit> LLILLL;
    public final /* synthetic */ C15TZ LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568460quy(C15TZ c15tz, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
        this.LLILZ = c15tz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1568460quy c1568460quy = new C1568460quy(this.LLILZ, interfaceC1364105Vn, this.LLILLL);
        c1568460quy.LLILLJJLI = obj;
        return c1568460quy;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "ExploreTopicFeedChunkProcessRequest@8a90.observeState$2$2"
            X.C1C7U.LIZ(r8)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r9.LL
            r7 = 3
            r6 = 2
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L31
            if (r0 == r5) goto L2d
            if (r0 == r6) goto L8b
            if (r0 != r7) goto Lb5
            X.C155000ia.LIZIZ(r10)
        L1a:
            X.15TZ r0 = r9.LLILZ
            X.0956 r0 = r0.LIZLLL
            if (r0 == 0) goto L23
            r0.LIZIZ(r4)
        L23:
            X.15TZ r0 = r9.LLILZ
            r0.LIZLLL = r4
        L27:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r10)
            goto L27
        L31:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r3 = r9.LLILLJJLI
            com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse r3 = (com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse) r3
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse, kotlin.Unit> r0 = r9.LLILLL
            r0.invoke(r3)
            X.08cD r0 = X.C2153908cD.LIZ
            boolean r0 = r3.LLILLJJLI
            if (r0 == 0) goto L9c
            X.15TZ r0 = r9.LLILZ
            java.util.concurrent.atomic.AtomicReference<X.0quz> r0 = r0.LIZ
            java.lang.Object r0 = r0.get()
            X.0quz r0 = (X.EnumC1568470quz) r0
            if (r0 == 0) goto L72
            int[] r1 = X.C1568480qv0.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 != r5) goto L72
            X.15TZ r0 = r9.LLILZ
            java.util.concurrent.atomic.AtomicReference<X.0quz> r1 = r0.LIZ
            X.0quz r0 = X.EnumC1568470quz.CHUNK_PROCESSING
            r1.set(r0)
            X.15TZ r0 = r9.LLILZ
            X.1DDr r0 = r0.LIZJ
            r9.LL = r5
            java.lang.Object r0 = r0.emit(r3, r9)
            if (r0 != r2) goto L27
            X.C1C7U.LIZIZ(r8)
            return r2
        L72:
            X.15TZ r0 = r9.LLILZ
            java.util.concurrent.atomic.AtomicReference<X.0quz> r1 = r0.LIZ
            X.0quz r0 = X.EnumC1568470quz.CHUNK_COMPLETE
            r1.set(r0)
            X.15TZ r0 = r9.LLILZ
            X.1DDr r0 = r0.LIZJ
            r9.LL = r6
            java.lang.Object r0 = r0.emit(r3, r9)
            if (r0 != r2) goto L8e
            X.C1C7U.LIZIZ(r8)
            return r2
        L8b:
            X.C155000ia.LIZIZ(r10)
        L8e:
            X.15TZ r0 = r9.LLILZ
            X.0956 r0 = r0.LIZLLL
            if (r0 == 0) goto L97
            r0.LIZIZ(r4)
        L97:
            X.15TZ r0 = r9.LLILZ
            r0.LIZLLL = r4
            goto L27
        L9c:
            X.15TZ r0 = r9.LLILZ
            java.util.concurrent.atomic.AtomicReference<X.0quz> r1 = r0.LIZ
            X.0quz r0 = X.EnumC1568470quz.CHUNK_COMPLETE
            r1.set(r0)
            X.15TZ r0 = r9.LLILZ
            X.1DDr r0 = r0.LIZJ
            r9.LL = r7
            java.lang.Object r0 = r0.emit(r3, r9)
            if (r0 != r2) goto L1a
            X.C1C7U.LIZIZ(r8)
            return r2
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1568460quy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ExploreTopicAwemeListResponse exploreTopicAwemeListResponse, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(exploreTopicAwemeListResponse, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
