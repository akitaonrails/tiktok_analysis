package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Mo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageListScene$timerFlow$1", f = "Text2ImageListScene.kt", l = {161, 162}, m = "invokeSuspend")
public final class C321601Mo extends C09AX implements Function2<InterfaceC346701Wf<? super Integer>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C321601Mo(int i, InterfaceC1364105Vn<? super C321601Mo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C321601Mo c321601Mo = new C321601Mo(this.LLILZ, interfaceC1364105Vn);
        c321601Mo.LLILLL = obj;
        return c321601Mo;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004b -> B:7:0x001c). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "Text2ImageListScene@1b50.timerFlow$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L51
            if (r0 == r4) goto L36
            if (r0 != r5) goto L61
            int r3 = r8.LL
            java.lang.Object r2 = r8.LLILLL
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            X.C155000ia.LIZIZ(r9)
        L1c:
            int r3 = r3 + 1
        L1e:
            r0 = 100
            if (r3 >= r0) goto L5b
            java.lang.Integer r0 = X.C2286608xc.LJ(r3)
            r8.LLILLL = r2
            r8.LL = r3
            r8.LLILLJJLI = r4
            java.lang.Object r0 = r2.emit(r0, r8)
            if (r0 != r6) goto L3f
            X.C1C7U.LIZIZ(r7)
            return r6
        L36:
            int r3 = r8.LL
            java.lang.Object r2 = r8.LLILLL
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            X.C155000ia.LIZIZ(r9)
        L3f:
            r8.LLILLL = r2
            r8.LL = r3
            r8.LLILLJJLI = r5
            r0 = 400(0x190, double:1.976E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r8)
            if (r0 != r6) goto L1c
            X.C1C7U.LIZIZ(r7)
            return r6
        L51:
            X.C155000ia.LIZIZ(r9)
            java.lang.Object r2 = r8.LLILLL
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            int r3 = r8.LLILZ
            goto L1e
        L5b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321601Mo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Integer> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
