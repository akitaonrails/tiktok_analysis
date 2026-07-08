package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dynamic.card.preserve.data.DynamicCardPreserveDataMgr$notifyPreserveDataUpdate$2", f = "DynamicCardPreserveDataMgr.kt", l = {131}, m = "invokeSuspend")
public final class C2181908gj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2184008h4 LLILLJJLI;
    public final /* synthetic */ List<C2181808gi> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181908gj(C2184008h4 c2184008h4, List<C2181808gi> list, InterfaceC1364105Vn<? super C2181908gj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2184008h4;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2181908gj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.08gj for r8v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "DynamicCardPreserveDataMgr@a13.notifyPreserveDataUpdate$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LL
            r6 = 1
            if (r0 == 0) goto L19
            if (r0 != r6) goto L5a
            X.C155000ia.LIZIZ(r9)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L19:
            X.C155000ia.LIZIZ(r9)
            X.08h4 r0 = r8.LLILLJJLI
            X.05YC<java.util.Map<java.lang.String, X.08gi>> r4 = r0.LLIZ
            java.util.List<X.08gi> r2 = r8.LLILLL
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r2, r0)
            int r1 = X.C2097908Jt.LIZIZ(r0)
            r0 = 16
            if (r1 >= r0) goto L32
            r1 = 16
        L32:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L3b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.08gi r0 = (X.C2181808gi) r0
            java.lang.String r0 = r0.LIZ
            r3.put(r0, r1)
            goto L3b
        L4e:
            r8.LL = r6
            java.lang.Object r0 = r4.emit(r3, r8)
            if (r0 != r5) goto L13
            X.C1C7U.LIZIZ(r7)
            return r5
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2181908gj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
