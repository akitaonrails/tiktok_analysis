package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tlJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {172, 193}, m = "invokeSuspend")
public final class C1677790tlJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C817403Hg LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C05P0<C05P1<Long>> LLILZ;
    public final /* synthetic */ C1677780tlI LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1677790tlJ(C05P0<C05P1<Long>> c05p0, C1677780tlI c1677780tlI, InterfaceC1364105Vn<? super C1677790tlJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c05p0;
        this.LLILZIL = c1677780tlI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1677790tlJ c1677790tlJ = new C1677790tlJ(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1677790tlJ.LLILLL = obj;
        return c1677790tlJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003d -> B:7:0x0017). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005a -> B:7:0x0017). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r12.LLILLJJLI
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L5d
            if (r0 == r3) goto L2f
            if (r0 != r4) goto L6e
            X.03Hg r9 = r12.LL
            java.lang.Object r10 = r12.LLILLL
            X.01wk r10 = (X.InterfaceC497601wk) r10
            X.C155000ia.LIZIZ(r13)
        L17:
            kotlin.jvm.internal.AwS120S0400000_25 r6 = new kotlin.jvm.internal.AwS120S0400000_25
            X.05P0<X.05P1<java.lang.Long>> r7 = r12.LLILZ
            X.0tlI r8 = r12.LLILZIL
            r11 = 23
            r6.<init>(r7, r8, r9, r10, r11)
            r12.LLILLL = r10
            r12.LL = r9
            r12.LLILLJJLI = r3
            java.lang.Object r0 = X.C1680620tps.LIZ(r12, r6)
            if (r0 != r5) goto L38
            return r5
        L2f:
            X.03Hg r9 = r12.LL
            java.lang.Object r10 = r12.LLILLL
            X.01wk r10 = (X.InterfaceC497601wk) r10
            X.C155000ia.LIZIZ(r13)
        L38:
            float r1 = r9.element
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L17
            kotlin.jvm.internal.AwS569S0100000_25 r1 = new kotlin.jvm.internal.AwS569S0100000_25
            r0 = 792(0x318, float:1.11E-42)
            r1.<init>(r10, r0)
            X.095D r2 = X.C20028913Yh.LJIIIZ(r1)
            X.01jr r1 = new X.01jr
            r0 = 0
            r1.<init>(r0)
            r12.LLILLL = r10
            r12.LL = r9
            r12.LLILLJJLI = r4
            java.lang.Object r0 = X.C09IC.LJIJ(r2, r12, r1)
            if (r0 != r5) goto L17
            return r5
        L5d:
            X.C155000ia.LIZIZ(r13)
            java.lang.Object r10 = r12.LLILLL
            X.01wk r10 = (X.InterfaceC497601wk) r10
            X.03Hg r9 = new X.03Hg
            r9.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.element = r0
            goto L17
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1677790tlJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
