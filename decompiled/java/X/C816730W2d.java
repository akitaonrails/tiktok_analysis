package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0W2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.api.StorageApiService$asFlow$1", f = "StorageApi.kt", l = {48, BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C816730W2d extends C09AX implements Function2<InterfaceC346701Wf<? super LocalListResponse>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C816880W2s LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C816880W2s LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C816730W2d(C816880W2s c816880W2s, int i, InterfaceC1364105Vn<? super C816730W2d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c816880W2s;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C816730W2d c816730W2d = new C816730W2d(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c816730W2d.LLILLL = obj;
        return c816730W2d;
    }

    /* JADX WARN: Path cross not found for [B:15:0x0044, B:22:0x006b], limit reached: 35 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0065 -> B:7:0x001d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "StorageApiService@850a.asFlow$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r10.LLILLJJLI
            r7 = 0
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L6d
            if (r0 == r5) goto L33
            if (r0 != r6) goto L92
            X.0W2s r1 = r10.LL
            java.lang.Object r4 = r10.LLILLL
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            X.C155000ia.LIZIZ(r11)
        L1d:
            if (r1 == 0) goto L8c
            X.0W2t r2 = X.C816890W2t.LIZIZ
            int r0 = r10.LLILZIL
            r10.LLILLL = r4
            r10.LL = r1
            r10.LLILLJJLI = r5
            java.lang.Object r11 = r2.LIZIZ(r1, r0, r7, r10)
            if (r11 != r8) goto L3c
            X.C1C7U.LIZIZ(r9)
            return r8
        L33:
            X.0W2s r1 = r10.LL
            java.lang.Object r4 = r10.LLILLL
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            X.C155000ia.LIZIZ(r11)
        L3c:
            com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse r11 = (com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse) r11
            boolean r0 = r11.getHasMore()
            if (r0 == 0) goto L6b
            java.lang.String r0 = r11.getNextPageToken()
            int r0 = r0.length()
            if (r0 <= 0) goto L6b
            java.lang.String r3 = r11.getNextPageToken()
            java.util.List<X.0W2p> r2 = r1.LIZ
            int r0 = r1.LIZIZ
            X.0W2s r1 = new X.0W2s
            r1.<init>(r2, r0, r3)
        L5b:
            r10.LLILLL = r4
            r10.LL = r1
            r10.LLILLJJLI = r6
            java.lang.Object r0 = r4.emit(r11, r10)
            if (r0 != r8) goto L1d
            X.C1C7U.LIZIZ(r9)
            return r8
        L6b:
            r1 = 0
            goto L5b
        L6d:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r4 = r10.LLILLL
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            X.0W2s r0 = r10.LLILZ
            java.util.List<X.0W2p> r0 = r0.LIZ
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9a
            X.0W2s r1 = r10.LLILZ
            int r0 = r1.LIZIZ
            if (r0 > 0) goto L1d
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "count can not be less than 0"
            r1.<init>(r0)
            throw r1
        L8c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "types can not be empty"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C816730W2d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super LocalListResponse> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
