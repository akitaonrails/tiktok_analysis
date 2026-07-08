package X;

import com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u0X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem$Loading$2$1", f = "TakoAIVideoInputAssem.kt", l = {224, 224}, m = "invokeSuspend")
public final class C1687230u0X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05P0 LL;
    public int LLILLJJLI;
    public final /* synthetic */ TakoAIVideoInputAssem LLILLL;
    public final /* synthetic */ C05P0<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687230u0X(TakoAIVideoInputAssem takoAIVideoInputAssem, C05P0<String> c05p0, InterfaceC1364105Vn<? super C1687230u0X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = takoAIVideoInputAssem;
        this.LLILZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1687230u0X(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "TakoAIVideoInputAssem@6324.Loading$2$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 == r2) goto L4c
            if (r0 != r3) goto L67
            X.05P0 r1 = r6.LL
            X.C155000ia.LIZIZ(r7)
        L18:
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem.LLJJJ
            r1.setValue(r7)
        L1d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L23:
            X.C155000ia.LIZIZ(r7)
            X.05P0<java.lang.String> r1 = r6.LLILZ
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem.LLJJJ
            java.lang.Object r0 = r1.getValue()
            if (r0 != 0) goto L1d
            X.05P0<java.lang.String> r1 = r6.LLILZ
            com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem r0 = r6.LLILLL
            X.0u0c r0 = r0.bp()
            X.099G r0 = r0.LLILLIZIL()
            if (r0 == 0) goto L54
            r6.LL = r1
            r6.LLILLJJLI = r2
            java.lang.Object r7 = r0.LJLIIIL(r6)
            if (r7 != r4) goto L51
            X.C1C7U.LIZIZ(r5)
            return r4
        L4c:
            X.05P0 r1 = r6.LL
            X.C155000ia.LIZIZ(r7)
        L51:
            if (r7 == 0) goto L54
            goto L18
        L54:
            X.0XAj r0 = X.C844350XAj.LIZ
            r6.LL = r1
            r6.LLILLJJLI = r3
            r0.getClass()
            java.lang.Object r7 = X.C844350XAj.LIZJ(r6)
            if (r7 != r4) goto L18
            X.C1C7U.LIZIZ(r5)
            return r4
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1687230u0X.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
