package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mk3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.ImageGroupWaveCompileTask$onTaskSuccess$1$1", f = "ImageGroupWaveCompileTask.kt", l = {675}, m = "invokeSuspend")
public final class C1407930mk3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1431100nLQ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407930mk3(C1431100nLQ c1431100nLQ, InterfaceC1364105Vn<? super C1407930mk3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1431100nLQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407930mk3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "ImageGroupWaveCompileTask@9fd4.onTaskSuccess$1$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 1
            if (r0 == 0) goto L19
            if (r0 != r3) goto L54
            X.C155000ia.LIZIZ(r7)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L19:
            X.C155000ia.LIZIZ(r7)
            X.0nLQ r0 = r6.LLILLJJLI
            boolean r0 = r0.LJJIFFI()
            r2 = 0
            if (r0 == 0) goto L3f
            X.0nZa r1 = X.C1439880nZa.LIZ
            X.0nLQ r0 = r6.LLILLJJLI
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LLJILJIL
            if (r0 != 0) goto L2e
            r0 = r2
        L2e:
            r1.getClass()
            boolean r0 = X.C1439880nZa.LIZLLL(r0)
            if (r0 != 0) goto L3f
            X.0nLQ r0 = r6.LLILLJJLI
            boolean r0 = r0.LJIJI()
            if (r0 == 0) goto L13
        L3f:
            X.140D r1 = X.C140D.LIZ
            X.0nLQ r0 = r6.LLILLJJLI
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LLJILJIL
            if (r0 == 0) goto L48
            r2 = r0
        L48:
            r6.LL = r3
            java.lang.Object r0 = r1.LJJJI(r2, r3, r6)
            if (r0 != r4) goto L13
            X.C1C7U.LIZIZ(r5)
            return r4
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1407930mk3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
