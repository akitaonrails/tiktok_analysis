package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0y2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {382, 386}, m = "invokeSuspend")
public final class C1842350y2j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C20074513gd LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1842350y2j(C20074513gd c20074513gd, InterfaceC1364105Vn<? super C1842350y2j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20074513gd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1842350y2j(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0030 -> B:10:0x001a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004c -> B:7:0x0011). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LL
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L4f
            if (r0 == r4) goto L29
            if (r0 != r5) goto L53
            X.C155000ia.LIZIZ(r8)
        L11:
            X.13gd r0 = r7.LLILLJJLI
            X.0yGG r0 = r0.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L1a
            r0.LIZIZ()
        L1a:
            X.13gd r0 = r7.LLILLJJLI
            X.1DEK r0 = r0.LLJLLIL
            if (r0 == 0) goto L2c
            r7.LL = r4
            java.lang.Object r0 = r0.LJIILIIL(r7)
            if (r0 != r6) goto L2c
            return r6
        L29:
            X.C155000ia.LIZIZ(r8)
        L2c:
            X.13gd r0 = r7.LLILLJJLI
            X.0yGG r0 = r0.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L1a
            r0 = 382(0x17e, float:5.35E-43)
            kotlin.jvm.internal.AFwS269S0000000_27 r3 = kotlin.jvm.internal.AFwS269S0000000_27.get$arr$(r0)
            r7.LL = r5
            kotlin.coroutines.CoroutineContext r0 = r7.getContext()
            X.0xwj r2 = X.C1838620xwi.LIZ(r0)
            X.020f r1 = new X.020f
            r0 = 6
            r1.<init>(r3, r0)
            java.lang.Object r0 = r2.LJLZ(r7, r1)
            if (r0 != r6) goto L11
            return r6
        L4f:
            X.C155000ia.LIZIZ(r8)
            goto L1a
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1842350y2j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
