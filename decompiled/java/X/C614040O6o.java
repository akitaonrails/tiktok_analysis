package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [D] */
/* JADX INFO: renamed from: X.0O6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.mota.runner.optimistic.OptimisticRunner$run$1", f = "OptimisticRunner.kt", l = {39, 42, 43}, m = "invokeSuspend")
public final class C614040O6o<D> extends C09AX implements Function2<InterfaceC346701Wf<? super C0O7A<D>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C613970O6h<D> LLILLL;
    public final /* synthetic */ C613980O6i LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C614040O6o(C613970O6h<D> c613970O6h, C613980O6i c613980O6i, InterfaceC1364105Vn<? super C614040O6o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c613970O6h;
        this.LLILZ = c613980O6i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C614040O6o c614040O6o = new C614040O6o(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c614040O6o.LLILLJJLI = obj;
        return c614040O6o;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "OptimisticRunner@daf6.run$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r11.LL
            r7 = 3
            r5 = 2
            r8 = 1
            r4 = 0
            if (r0 == 0) goto L20
            if (r0 == r8) goto L6a
            if (r0 == r5) goto L87
            if (r0 != r7) goto L9e
            X.C155000ia.LIZIZ(r12)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L20:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r3 = r11.LLILLJJLI
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            X.0O76 r9 = new X.0O76
            X.0O6h<D> r0 = r11.LLILLL
            r9.<init>(r0)
            X.0O8O r1 = r0.LIZIZ
            X.0O7J r0 = X.C0O8C.LIZJ
            X.0O8Q r0 = r1.LIZ(r0)
            X.0O8C r0 = (X.C0O8C) r0
            if (r0 == 0) goto L71
            D extends X.0O3E r2 = r0.LIZIZ
            if (r2 == 0) goto L71
            X.0O6h<D> r0 = r11.LLILLL
            X.0O8O r1 = r0.LIZIZ
            X.0O7G r0 = X.C0O8E.LIZIZ
            r1.LIZ(r0)
            r9.LIZIZ = r2
            X.0O7A r2 = r9.LIZ()
            X.0O6x r0 = X.EnumC614130O6x.Optimistic
            X.0O8I r1 = new X.0O8I
            r1.<init>(r0)
            X.0O8O r0 = r2.LIZJ
            X.0O8O r0 = r0.LIZJ(r1)
            r2.LIZJ = r0
            r11.LLILLJJLI = r3
            r11.LL = r8
            java.lang.Object r0 = r3.emit(r2, r11)
            if (r0 != r6) goto L71
            X.C1C7U.LIZIZ(r10)
            return r6
        L6a:
            java.lang.Object r3 = r11.LLILLJJLI
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            X.C155000ia.LIZIZ(r12)
        L71:
            X.0O6i r1 = r11.LLILZ
            X.0O6h<D> r0 = r11.LLILLL
            X.01Wa r0 = r1.LIZ(r0)
            r11.LLILLJJLI = r3
            r11.LL = r5
            java.lang.Object r12 = X.C09IC.LJJIJIIJI(r0, r11)
            if (r12 != r6) goto L8e
            X.C1C7U.LIZIZ(r10)
            return r6
        L87:
            java.lang.Object r3 = r11.LLILLJJLI
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            X.C155000ia.LIZIZ(r12)
        L8e:
            if (r12 == 0) goto L1a
            r11.LLILLJJLI = r4
            r11.LL = r7
            java.lang.Object r0 = r3.emit(r12, r11)
            if (r0 != r6) goto L1a
            X.C1C7U.LIZIZ(r10)
            return r6
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C614040O6o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
