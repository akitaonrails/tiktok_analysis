package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.google.gson.n;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05yK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel$fetchLoadMoreData$responseMap$1", f = "LiveVerticalViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1526605yK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends Object>>, Object> {
    public final /* synthetic */ n LL;
    public final /* synthetic */ CompletionBlock<InterfaceC1476705qH> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1526605yK(n nVar, CompletionBlock<InterfaceC1476705qH> completionBlock, InterfaceC1364105Vn<? super C1526605yK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nVar;
        this.LLILLJJLI = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1526605yK(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "LiveVerticalViewModel@b55d.fetchLoadMoreData$responseMap$1"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r8)
            com.google.gson.n r4 = r7.LL
            r5 = 0
            com.google.gson.Gson r3 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L5d
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L5d
            r0.getClass()     // Catch: com.google.gson.s -> L5d
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L5d
            if (r0 == 0) goto L23
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L5d
            r0 = 1
            if (r1 != r0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L27
            goto L31
        L27:
            X.05yL r0 = new X.05yL     // Catch: com.google.gson.s -> L5d
            r0.<init>()     // Catch: com.google.gson.s -> L5d
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L5d
            goto L54
        L31:
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            X.13JX r1 = kotlin.reflect.KTypeProjection.LIZJ     // Catch: com.google.gson.s -> L5d
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L5d
            r1.getClass()     // Catch: com.google.gson.s -> L5d
            kotlin.reflect.KTypeProjection r1 = X.C13JX.LIZ(r0)     // Catch: com.google.gson.s -> L5d
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L5d
            kotlin.reflect.KTypeProjection r0 = X.C13JX.LIZ(r0)     // Catch: com.google.gson.s -> L5d
            X.13JW r0 = X.C13LE.LJIIIZ(r2, r1, r0)     // Catch: com.google.gson.s -> L5d
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L5d
        L54:
            java.lang.Object r4 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r3, r4, r0)     // Catch: com.google.gson.s -> L5d
            boolean r0 = r4 instanceof java.util.Map     // Catch: com.google.gson.s -> L5d
            if (r0 != 0) goto L64
            goto L63
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r4 = r5
            goto L64
        L63:
            r4 = r5
        L64:
            if (r4 != 0) goto L6f
            com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.05qH> r3 = r7.LLILLJJLI
            java.lang.String r2 = "response has wrong data struct"
            r1 = 4
            r0 = -5
            X.C2382909Vj.LIZ(r3, r0, r2, r5, r1)
        L6f:
            X.C1C7U.LIZIZ(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1526605yK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends Object>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
