package X;

import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.model.SugExtraInfo$confirmQueryLang$1", f = "SugExtraInfo.kt", l = {272}, m = "invokeSuspend")
public final class C313850CRz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ SugExtraInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C313850CRz(SugExtraInfo sugExtraInfo, InterfaceC1364105Vn<? super C313850CRz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = sugExtraInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313850CRz(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003a -> B:6:0x0016). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "SugExtraInfo@f114.confirmQueryLang$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L40
            if (r0 != r3) goto L50
            int r2 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L16:
            int r2 = r2 + 1
        L18:
            com.ss.android.ugc.aweme.search.model.SugExtraInfo r0 = r7.LLILLL
            boolean r0 = r0.isMiniChunk()
            if (r0 == 0) goto L45
            com.ss.android.ugc.aweme.search.model.SugExtraInfo r0 = r7.LLILLL
            java.lang.String r0 = r0.getConfirmQueryLang()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L45
            r0 = 10
            if (r2 >= r0) goto L45
            r7.LL = r2
            r7.LLILLJJLI = r3
            r0 = 100
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r5) goto L16
            X.C1C7U.LIZIZ(r6)
            return r5
        L40:
            X.C155000ia.LIZIZ(r8)
            r2 = 0
            goto L18
        L45:
            com.ss.android.ugc.aweme.search.model.SugExtraInfo r0 = r7.LLILLL
            r0.setMiniChunk(r4)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313850CRz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
