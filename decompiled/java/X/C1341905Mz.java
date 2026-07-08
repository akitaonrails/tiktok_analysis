package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Mz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdAndElementViewModel$onPrepared$1$1", f = "IdAndElementViewModel.kt", l = {242}, m = "invokeSuspend")
public final class C1341905Mz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ Map<Integer, Map<String, C05YD<InterfaceC439080HJq>>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1341905Mz(Map<Integer, ? extends Map<String, ? extends C05YD<? extends InterfaceC439080HJq>>> map, InterfaceC1364105Vn<? super C1341905Mz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1341905Mz(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0056 -> B:6:0x001b). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "IdAndElementViewModel@a6fe.onPrepared$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r4 = 1
            if (r0 == 0) goto L43
            if (r0 != r4) goto L6b
            java.lang.Object r0 = r8.LLILLJJLI
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r6 = r8.LL
            java.util.Iterator r6 = (java.util.Iterator) r6
            X.C155000ia.LIZIZ(r9)
        L1b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getValue()
            X.01Wa r3 = (X.InterfaceC346201Wa) r3
            X.05My r2 = new X.05My
            r1 = 0
            r2.<init>(r1)
            r8.LL = r6
            r8.LLILLJJLI = r0
            r8.LLILLL = r4
            java.lang.Object r1 = X.C09IC.LJIJ(r3, r8, r2)
            if (r1 != r5) goto L1b
            X.C1C7U.LIZIZ(r7)
            return r5
        L43:
            X.C155000ia.LIZIZ(r9)
            java.util.Map<java.lang.Integer, java.util.Map<java.lang.String, X.05YD<X.0HJq>>> r0 = r8.LLILZ
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L50:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            goto L1b
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L73:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1341905Mz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
