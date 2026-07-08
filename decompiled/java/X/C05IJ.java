package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05IJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.autoplay.core.utils.ECContentAutoPlayHandler$startTimer$1", f = "ECContentAutoPlayHandler.kt", l = {249}, m = "invokeSuspend")
public final class C05IJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C678590QjZ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05IJ(C678590QjZ c678590QjZ, InterfaceC1364105Vn<? super C05IJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c678590QjZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05IJ c05ij = new C05IJ(this.LLILLL, interfaceC1364105Vn);
        c05ij.LLILLJJLI = obj;
        return c05ij;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "ECContentAutoPlayHandler@3d8a.startTimer$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L42
            java.lang.Object r0 = r6.LLILLJJLI
            X.01wk r0 = (X.InterfaceC497601wk) r0
            X.C155000ia.LIZIZ(r7)
        L17:
            X.0QjZ r1 = r6.LLILLL
            r1.LJIIJ()
        L1c:
            boolean r1 = X.C2296808zG.LJI(r0)
            if (r1 == 0) goto L3c
            X.0QjZ r1 = r6.LLILLL
            long r1 = r1.LJIIIZ
            r6.LLILLJJLI = r0
            r6.LL = r3
            java.lang.Object r1 = X.AnonymousClass0958.LIZIZ(r1, r6)
            if (r1 != r4) goto L17
            X.C1C7U.LIZIZ(r5)
            return r4
        L34:
            X.C155000ia.LIZIZ(r7)
            java.lang.Object r0 = r6.LLILLJJLI
            X.01wk r0 = (X.InterfaceC497601wk) r0
            goto L1c
        L3c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L42:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05IJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
