package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {428}, m = "invokeSuspend")
public final class C1394205cy extends C09AX implements Function2<Function1<? super C1394605d2, ? extends Unit>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C259800zU<AbstractC1394705d3> LLILZ;
    public final /* synthetic */ AbstractC20074613ge LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1394205cy(C259800zU<AbstractC1394705d3> c259800zU, AbstractC20074613ge abstractC20074613ge, InterfaceC1364105Vn<? super C1394205cy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c259800zU;
        this.LLILZIL = abstractC20074613ge;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1394205cy c1394205cy = new C1394205cy(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1394205cy.LLILLL = obj;
        return c1394205cy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0032 -> B:6:0x0014). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003e -> B:6:0x0014). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L41
            if (r0 != r3) goto L4c
            X.00zU r2 = r5.LL
            java.lang.Object r0 = r5.LLILLL
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            X.C155000ia.LIZIZ(r6)
        L14:
            r2.element = r6
        L16:
            X.00zU<X.05d3> r1 = r5.LLILZ
            T r2 = r1.element
            boolean r1 = r2 instanceof X.C1394905d5
            if (r1 != 0) goto L49
            boolean r1 = r2 instanceof X.C1395005d6
            if (r1 != 0) goto L49
            boolean r1 = r2 instanceof X.C1394605d2
            r6 = 0
            if (r1 == 0) goto L2c
            if (r2 == 0) goto L2c
            r0.invoke(r2)
        L2c:
            X.00zU<X.05d3> r2 = r5.LLILZ
            X.13ge r1 = r5.LLILZIL
            X.095E<X.05d3> r1 = r1.LLJJJ
            if (r1 == 0) goto L14
            r5.LLILLL = r0
            r5.LL = r2
            r5.LLILLJJLI = r3
            java.lang.Object r6 = r1.LJIILIIL(r5)
            if (r6 != r4) goto L14
            return r4
        L41:
            X.C155000ia.LIZIZ(r6)
            java.lang.Object r0 = r5.LLILLL
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            goto L16
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1394205cy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Function1<? super C1394605d2, ? extends Unit> function1, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(function1, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
