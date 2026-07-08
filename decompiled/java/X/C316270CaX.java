package X;

import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CaX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel$unloggedInLoad$2", f = "AIPortraitTabViewModel.kt", l = {630, 631}, m = "invokeSuspend")
public final class C316270CaX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIPortraitTabViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316270CaX(AIPortraitTabViewModel aIPortraitTabViewModel, InterfaceC1364105Vn<? super C316270CaX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aIPortraitTabViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C316270CaX c316270CaX = new C316270CaX(this.LLILLL, interfaceC1364105Vn);
        c316270CaX.LLILLJJLI = obj;
        return c316270CaX;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r9 = r21
            java.lang.String r10 = "AIPortraitTabViewModel@fa0d.unloggedInLoad$2"
            X.C1C7U.LIZ(r10)
            java.lang.Object r8 = X.C099R.LJFF()
            r7 = r20
            int r0 = r7.LL
            r4 = 20
            r14 = 0
            r6 = 2
            r3 = 0
            r5 = 1
            if (r0 == 0) goto L62
            if (r0 == r5) goto L87
            if (r0 != r6) goto L9f
            java.lang.Object r2 = r7.LLILLJJLI
            com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse r2 = (com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse) r2
            X.C155000ia.LIZIZ(r9)
        L22:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            if (r2 == 0) goto L52
            java.util.List<com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem> r13 = r2.styles
            if (r13 != 0) goto L2c
            X.13BV r13 = X.C13BV.INSTANCE
        L2c:
            com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel r0 = r7.LLILLL
            X.1DDq r1 = r0.LLJI
            X.0MWm r11 = new X.0MWm
            r12 = 0
            if (r9 == 0) goto L39
            X.0tRU r14 = X.C1687430u0r.LIZ(r9)
        L39:
            r15 = 0
            java.lang.Boolean r0 = r2.hasMore
            if (r0 == 0) goto L58
            boolean r3 = r0.booleanValue()
        L42:
            java.lang.Integer r0 = r2.cursor
            r16 = r15
            r19 = r15
            r17 = r3
            r18 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r1.setValue(r11)
        L52:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L58:
            if (r13 == 0) goto L42
            int r0 = r13.size()
            if (r0 != r4) goto L42
            r3 = 1
            goto L42
        L62:
            X.C155000ia.LIZIZ(r9)
            java.lang.Object r2 = r7.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.0CZL r1 = new X.0CZL
            com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel r0 = r7.LLILLL
            r1.<init>(r0, r14)
            r0 = 3
            X.099G r0 = X.C23250099c.LIZIZ(r2, r14, r14, r1, r0)
            com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel r1 = r7.LLILLL
            X.0u0A r1 = r1.LL
            r7.LLILLJJLI = r0
            r7.LL = r5
            java.lang.Object r9 = r1.LIZLLL(r3, r4, r7)
            if (r9 != r8) goto L8e
            X.C1C7U.LIZIZ(r10)
            return r8
        L87:
            java.lang.Object r0 = r7.LLILLJJLI
            X.0957 r0 = (X.AnonymousClass0957) r0
            X.C155000ia.LIZIZ(r9)
        L8e:
            r2 = r9
            com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse r2 = (com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse) r2
            r7.LLILLJJLI = r2
            r7.LL = r6
            java.lang.Object r9 = r0.LJLIIIL(r7)
            if (r9 != r8) goto L22
            X.C1C7U.LIZIZ(r10)
            return r8
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C316270CaX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
