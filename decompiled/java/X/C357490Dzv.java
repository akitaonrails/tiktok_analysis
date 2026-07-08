package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dzv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.TemplateMagicApplyTask$I2VUpdateProgressCallbackWrapper$onStart$1", f = "TemplateMagicApplyTask.kt", l = {348}, m = "invokeSuspend")
public final class C357490Dzv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C357450Dzr LLILLL;
    public final /* synthetic */ C357500Dzw LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C357490Dzv(C357450Dzr c357450Dzr, C357500Dzw c357500Dzw, InterfaceC1364105Vn<? super C357490Dzv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c357450Dzr;
        this.LLILZ = c357500Dzw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C357490Dzv c357490Dzv = new C357490Dzv(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c357490Dzv.LLILLJJLI = obj;
        return c357490Dzv;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007a -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "TemplateMagicApplyTask$I2VUpdateProgressCallbackWrapper@41f4.onStart$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r9.LL
            r3 = 1
            if (r0 == 0) goto L55
            if (r0 != r3) goto L80
            java.lang.Object r2 = r9.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.C155000ia.LIZIZ(r10)
        L17:
            X.0Dzw r7 = r9.LLILZ
            X.0Dzr r0 = r9.LLILLL
            float r0 = r0.LJIIJJI
            float r6 = r7.LIZIZ
            float r6 = r6 + r0
            float r1 = (float) r3
            X.0Dzr r0 = r7.LJ
            float r0 = r0.LJIIJJI
            float r1 = r1 - r0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L30
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L30:
            X.0M8t r5 = X.C563650M8t.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Template_Consume: I2VUpdateProgressCallback lastProgress="
            r1.append(r0)
            float r0 = r7.LIZIZ
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "TemplateMagicApplyTask"
            X.C201955140j.LIZLLL(r5, r0, r1)
            r7.LIZIZ = r6
            kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> r1 = r7.LIZ
            java.lang.Float r0 = java.lang.Float.valueOf(r6)
            r1.invoke(r0)
            goto L5c
        L55:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r2 = r9.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
        L5c:
            boolean r0 = X.C2296808zG.LJI(r2)
            if (r0 == 0) goto L8e
            X.0Dzr r0 = r9.LLILLL
            X.0Dzu r1 = r0.LJII
            X.0Dzu r0 = X.EnumC357480Dzu.CANCELED
            if (r1 == r0) goto L88
            X.0Dzw r0 = r9.LLILZ
            boolean r0 = r0.LIZJ
            if (r0 != 0) goto L88
            r9.LLILLJJLI = r2
            r9.LL = r3
            r0 = 400(0x190, double:1.976E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r9)
            if (r0 != r4) goto L17
            X.C1C7U.LIZIZ(r8)
            return r4
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L88:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L8e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357490Dzv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
