package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ZV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.markdown.stream.SearchStreamAlphaSpanHandler$loop$1", f = "SearchStreamAlphaSpanHandler.kt", l = {39}, m = "invokeSuspend")
public final class C08ZV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C08ZX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08ZV(C08ZX c08zx, InterfaceC1364105Vn<? super C08ZV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c08zx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08ZV(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a2 -> B:6:0x0013). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "SearchStreamAlphaSpanHandler@cf83.loop$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LL
            r2 = 1
            if (r0 == 0) goto L8b
            if (r0 != r2) goto Lb3
            X.C155000ia.LIZIZ(r11)
        L13:
            X.08ZX r0 = r10.LLILLJJLI
            X.08ZW r8 = r0.LIZJ
            if (r8 == 0) goto La8
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r8.LIZIZ
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La8
            X.08ZX r6 = r10.LLILLJJLI
            long r4 = r6.LIZIZ
            double r0 = (double) r4
            r4 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r4 = r4 / r0
            X.01GW r0 = r6.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r6 = r0.longValue()
            double r0 = (double) r6
            double r4 = r4 * r0
            int r6 = (int) r4
            if (r6 >= r2) goto L3e
            r6 = 1
        L3e:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r8.LIZIZ
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L48:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r4 = r5.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 255(0xff, float:3.57E-43)
            if (r1 < r0) goto L65
            r5.remove()
        L65:
            java.lang.Object r1 = r4.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 + r6
            if (r1 >= r0) goto L7d
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + r6
        L7d:
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            r4.setValue(r0)
            goto L48
        L85:
            X.08ZX r0 = r10.LLILLJJLI
            r0.LIZIZ()
            goto L8e
        L8b:
            X.C155000ia.LIZIZ(r11)
        L8e:
            X.08ZX r0 = r10.LLILLJJLI
            X.01GW r0 = r0.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r10.LL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r10)
            if (r0 != r3) goto L13
            X.C1C7U.LIZIZ(r9)
            return r3
        La8:
            X.08ZX r1 = r10.LLILLJJLI
            r0 = 0
            r1.LJFF = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        Lb3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08ZV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
