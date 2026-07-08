package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tpr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", l = {371}, m = "invokeSuspend")
public final class C1680610tpr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1686700tzg LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1680610tpr(C1686700tzg c1686700tzg, InterfaceC1364105Vn<? super C1680610tpr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1686700tzg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1680610tpr c1680610tpr = new C1680610tpr(this.LLILLL, interfaceC1364105Vn);
        c1680610tpr.LLILLJJLI = obj;
        return c1680610tpr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0012, code lost:
    
        if (r3.LJJLIL() == r6) goto L17;
     */
    /* JADX WARN: Path cross not found for [B:8:0x0026, B:10:0x002a], limit reached: 25 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r9.LL
            r5 = 1
            if (r0 == 0) goto L5d
            if (r0 != r5) goto L68
            java.lang.Object r0 = r9.LLILLJJLI
            X.01wk r0 = (X.InterfaceC497601wk) r0
            X.C155000ia.LIZIZ(r10)
        L12:
            X.0tzg r8 = r9.LLILLL
            int[] r2 = r8.LLJJLIIIJLLLLLLLZ
            r7 = 0
            r4 = r2[r7]
            r3 = r2[r5]
            android.view.View r1 = r8.LLJILJIL
            r1.getLocationOnScreen(r2)
            int[] r2 = r8.LLJJLIIIJLLLLLLLZ
            r1 = r2[r7]
            if (r4 != r1) goto L2a
            r1 = r2[r5]
            if (r3 == r1) goto L2d
        L2a:
            r8.LJIIL()
        L2d:
            boolean r1 = X.C2296808zG.LJI(r0)
            if (r1 == 0) goto L65
            r1 = 503(0x1f7, float:7.05E-43)
            kotlin.jvm.internal.AFwS266S0000000_25 r4 = kotlin.jvm.internal.AFwS266S0000000_25.get$arr$(r1)
            r9.LLILLJJLI = r0
            r9.LL = r5
            kotlin.coroutines.CoroutineContext r2 = r9.getContext()
            X.0tpu r1 = X.InterfaceC1680630tpt.LJ
            kotlin.coroutines.CoroutineContext$Element r3 = r2.get(r1)
            X.0tpt r3 = (X.InterfaceC1680630tpt) r3
            if (r3 != 0) goto L52
            java.lang.Object r1 = X.C1838620xwi.LIZIZ(r9, r4)
        L4f:
            if (r1 != r6) goto L12
            return r6
        L52:
            X.05R4 r2 = new X.05R4
            r1 = 0
            r2.<init>(r4, r1)
            java.lang.Object r1 = r3.LJJLIL()
            goto L4f
        L5d:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r0 = r9.LLILLJJLI
            X.01wk r0 = (X.InterfaceC497601wk) r0
            goto L2d
        L65:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1680610tpr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
