package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Hz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.sync.StorageSyncer$triggerFullUpdate$2", f = "StorageSyncer.kt", l = {49, BaseNotice.RECOMMEND_LIVE, BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C1328905Hz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1328905Hz(String str, boolean z, InterfaceC1364105Vn<? super C1328905Hz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1328905Hz(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "StorageSyncer@f38a.triggerFullUpdate$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L36
            if (r0 == r4) goto L49
            if (r0 != r5) goto L5c
            X.C155000ia.LIZIZ(r9)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r9)
            X.0951 r2 = X.C1328705Hx.LLILLL
            X.05I0 r1 = new X.05I0
            r0 = 0
            r1.<init>(r0)
            r8.LL = r3
            java.lang.Object r0 = X.C09IC.LJIJJ(r2, r8, r1)
            if (r0 != r6) goto L39
            X.C1C7U.LIZIZ(r7)
            return r6
        L36:
            X.C155000ia.LIZIZ(r9)
        L39:
            X.0W2X r1 = X.C816720W2c.LIZLLL
            java.lang.String r0 = r8.LLILLJJLI
            r8.LL = r4
            java.lang.Object r9 = r1.LIZ(r0, r8)
            if (r9 != r6) goto L4c
            X.C1C7U.LIZIZ(r7)
            return r6
        L49:
            X.C155000ia.LIZIZ(r9)
        L4c:
            X.0W2c r9 = (X.C816720W2c) r9
            boolean r0 = r8.LLILLL
            r8.LL = r5
            java.lang.Object r0 = r9.LJII(r0, r8)
            if (r0 != r6) goto L19
            X.C1C7U.LIZIZ(r7)
            return r6
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1328905Hz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
