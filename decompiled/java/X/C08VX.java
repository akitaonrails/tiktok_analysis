package X;

import java.io.InputStreamReader;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08VX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.pia.core.utils.StreamUtils$asSequence$1$1", f = "StreamUtils.kt", l = {39}, m = "invokeSuspend")
public final class C08VX extends C09AW implements Function2<AbstractC1421005hI<? super char[]>, InterfaceC1364105Vn<? super Unit>, Object> {
    public char[] LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ InputStreamReader LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08VX(int i, InputStreamReader inputStreamReader, InterfaceC1364105Vn<? super C08VX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = i;
        this.LLILZLL = inputStreamReader;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C08VX c08vx = new C08VX(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c08vx.LLILZ = obj;
        return c08vx;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:6:0x0019). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r6 = "StreamUtils@adcd.asSequence$1$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r4 = 1
            if (r0 == 0) goto L3b
            if (r0 != r4) goto L53
            char[] r3 = r7.LLILLJJLI
            java.lang.Object r2 = r7.LLILZ
            X.05hI r2 = (X.AbstractC1421005hI) r2
            X.C155000ia.LIZIZ(r8)
        L19:
            java.io.InputStreamReader r0 = r7.LLILZLL
            int r1 = r0.read(r3)
        L1f:
            r0 = -1
            if (r1 == r0) goto L4d
            int r0 = r3.length
            X.C1691430u7J.LIZ(r1, r0)
            r0 = 0
            char[] r0 = java.util.Arrays.copyOfRange(r3, r0, r1)
            r7.LLILZ = r2
            r7.LLILLJJLI = r3
            r7.LLILLL = r4
            java.lang.Object r0 = r2.LIZ(r0, r7)
            if (r0 != r5) goto L19
            X.C1C7U.LIZIZ(r6)
            return r5
        L3b:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r2 = r7.LLILZ
            X.05hI r2 = (X.AbstractC1421005hI) r2
            int r0 = r7.LLILZIL
            char[] r3 = new char[r0]
            java.io.InputStreamReader r0 = r7.LLILZLL
            int r1 = r0.read(r3)
            goto L1f
        L4d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08VX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1421005hI<? super char[]> abstractC1421005hI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1421005hI, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
