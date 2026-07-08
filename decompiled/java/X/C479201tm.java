package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.typewriter.StreamAlphaSpanInstance$startLoop$1", f = "StreamAlphaSpanInstance.kt", l = {77}, m = "invokeSuspend")
public final class C479201tm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1859380yUC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C479201tm(C1859380yUC c1859380yUC, InterfaceC1364105Vn<? super C479201tm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1859380yUC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C479201tm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0081 -> B:6:0x0013). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "StreamAlphaSpanInstance@e77d.startLoop$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LL
            r2 = 1
            if (r0 == 0) goto L68
            if (r0 != r2) goto L87
            X.C155000ia.LIZIZ(r11)
        L13:
            X.0yUC r8 = r10.LLILLJJLI
            long r4 = r8.LJII
            double r0 = (double) r4
            r6 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r6 = r6 / r0
            long r4 = r8.LIZ
            double r0 = (double) r4
            double r6 = r6 * r0
            int r5 = (int) r6
            if (r5 >= r2) goto L26
            r5 = 1
        L26:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r8.LJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L32:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + r5
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            r1.setValue(r0)
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 255(0xff, float:3.57E-43)
            if (r1 < r0) goto L32
            r4.remove()
            goto L32
        L62:
            X.0yUC r0 = r10.LLILLJJLI
            r0.LIZ()
            goto L6b
        L68:
            X.C155000ia.LIZIZ(r11)
        L6b:
            X.0yUC r0 = r10.LLILLJJLI
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.LJ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L8f
            X.0yUC r0 = r10.LLILLJJLI
            long r0 = r0.LIZ
            r10.LL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r10)
            if (r0 != r3) goto L13
            X.C1C7U.LIZIZ(r9)
            return r3
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C479201tm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
