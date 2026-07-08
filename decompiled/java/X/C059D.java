package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.059D, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.creationflow.publish.save.controll.EditorProPublishTask$runTaskAfterExtract$1", f = "EditorProPublishTask.kt", l = {96, 100}, m = "invokeSuspend")
public final class C059D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1456360o0A LLILLJJLI;
    public final /* synthetic */ Runnable LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C059D(InterfaceC1456360o0A interfaceC1456360o0A, Runnable runnable, InterfaceC1364105Vn<? super C059D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1456360o0A;
        this.LLILLL = runnable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C059D(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "EditorProPublishTask@f311.runTaskAfterExtract$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L43
            if (r0 != r4) goto L5d
            X.C155000ia.LIZIZ(r9)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r9)
            X.0o0A r0 = r8.LLILLJJLI
            boolean r0 = r0.LJ()
            if (r0 == 0) goto L2e
            java.lang.Runnable r0 = r8.LLILLL
            r0.run()
            goto L17
        L2e:
            X.1DFB r2 = X.C0PEM.LIZJ
            X.059E r1 = new X.059E
            X.0o0A r0 = r8.LLILLJJLI
            r1.<init>(r0, r5)
            r8.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r8, r2, r1)
            if (r0 != r6) goto L46
            X.C1C7U.LIZIZ(r7)
            return r6
        L43:
            X.C155000ia.LIZIZ(r9)
        L46:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.059C r1 = new X.059C
            java.lang.Runnable r0 = r8.LLILLL
            r1.<init>(r0, r5)
            r8.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r8, r2, r1)
            if (r0 != r6) goto L17
            X.C1C7U.LIZIZ(r7)
            return r6
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C059D.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
