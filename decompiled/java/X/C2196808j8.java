package X;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;

/* JADX INFO: renamed from: X.08j8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "tiktok.compose.scopedviewmodel.ViewModelStoreOwnerViewModel$AttachedComposable$1$invokeSuspend$$inlined$flatMapLatest$1", f = "ScopedViewModelExt.kt", l = {193}, m = "invokeSuspend")
public final class C2196808j8 extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Lifecycle.Event>, Lifecycle, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;

    public C2196808j8(InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Lifecycle.Event> interfaceC346701Wf, Lifecycle lifecycle, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C2196808j8 c2196808j8 = new C2196808j8(interfaceC1364105Vn);
        c2196808j8.LLILLJJLI = interfaceC346701Wf;
        c2196808j8.LLILLL = lifecycle;
        return c2196808j8.invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LL
            r4 = 1
            if (r0 == 0) goto L11
            if (r0 != r4) goto L3f
            X.C155000ia.LIZIZ(r7)
        Le:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L11:
            X.C155000ia.LIZIZ(r7)
            X.01Wf r3 = r6.LLILLJJLI
            java.lang.Object r2 = r6.LLILLL
            androidx.lifecycle.Lifecycle r2 = (androidx.lifecycle.Lifecycle) r2
            if (r2 == 0) goto L34
            X.08jp r1 = new X.08jp
            r0 = 0
            r1.<init>(r2, r0)
            kotlinx.coroutines.flow.b r1 = X.C09IC.LJ(r1)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r0 = r0.LLIILII()
            X.01Wa r0 = X.C09IC.LJIL(r1, r0)
            if (r0 != 0) goto L36
        L34:
            X.05wz r0 = X.C1518305wz.LL
        L36:
            r6.LL = r4
            java.lang.Object r0 = X.C09IC.LJIILLIIL(r6, r0, r3)
            if (r0 != r5) goto Le
            return r5
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2196808j8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
