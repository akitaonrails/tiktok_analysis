package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.image.brush.CommentImageBrushComponent$initResources$1", f = "CommentImageBrushComponent.kt", l = {338}, m = "invokeSuspend")
public final class C1705300uTg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C19678011ys LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705300uTg(C19678011ys c19678011ys, InterfaceC1364105Vn<? super C1705300uTg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c19678011ys;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1705300uTg(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "CommentImageBrushComponent@6483.initResources$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L5c
            if (r0 != r5) goto La8
            java.lang.Object r2 = r9.LL
            java.util.Map r2 = (java.util.Map) r2
            X.C155000ia.LIZIZ(r10)
        L17:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r0 = r10.booleanValue()
            if (r0 == 0) goto L34
            X.0uTd r0 = X.C1705250uTb.LIZ
            X.0uTZ r0 = X.C1705270uTd.LIZ()
            java.util.Map r2 = r0.LIZ()
            X.11ys r0 = r9.LLILLL
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r0.LLJLLL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.setValue(r0)
        L34:
            X.11ys r0 = r9.LLILLL
            r0.LLJJJ = r2
            java.lang.Object r0 = r0.T2()
            X.11yx r0 = (X.C19678511yx) r0
            X.11yw r1 = r0.LIZJ
            X.11yw r0 = X.EnumC19678411yw.NULL
            if (r1 != r0) goto L56
            X.11yw r3 = X.EnumC19678411yw.NORMAL_BRUSH
            X.11ys r2 = r9.LLILLL
            kotlin.jvm.internal.AwS392S0200000_26 r1 = new kotlin.jvm.internal.AwS392S0200000_26
            r0 = 7
            r1.<init>(r2, r3, r0)
            r2.i3(r1)
            X.11ys r0 = r9.LLILLL
            r0.N5(r3)
        L56:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L5c:
            X.C155000ia.LIZIZ(r10)
            X.11ys r0 = r9.LLILLL
            X.0uTb r6 = r0.LLJLIL
            r6.getClass()
            boolean r0 = X.C1705250uTb.LIZJ()
            if (r0 != 0) goto L7a
            X.03Hh r4 = X.C817503Hh.LL
            X.1DFB r3 = X.C0PEM.LIZJ
            X.08gl r2 = new X.08gl
            r1 = 0
            r2.<init>(r6, r1)
            r0 = 2
            X.C23250099c.LIZLLL(r4, r3, r1, r2, r0)
        L7a:
            X.0uTd r0 = X.C1705250uTb.LIZ
            X.0uTZ r0 = X.C1705270uTd.LIZ()
            java.util.Map r2 = r0.LIZ()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9c
            X.11ys r0 = r9.LLILLL
            X.0uTb r0 = r0.LLJLIL
            r9.LL = r2
            r9.LLILLJJLI = r5
            java.lang.Object r10 = r0.LIZ(r9)
            if (r10 != r7) goto L17
            X.C1C7U.LIZIZ(r8)
            return r7
        L9c:
            X.11ys r0 = r9.LLILLL
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r0.LLJLLL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.setValue(r0)
            goto L34
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1705300uTg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
