package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Bp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.bridge.DefaultGenAIBridge$cancelAndDeleteTask$1", f = "DefaultGenAIBridge.kt", l = {573, 577}, m = "invokeSuspend")
public final class C2331509Bp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public ICreationAsyncTaskManager LL;
    public int LLILLJJLI;
    public final /* synthetic */ EnumC2331909Bt LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2331509Bp(EnumC2331909Bt enumC2331909Bt, String str, InterfaceC1364105Vn<? super C2331509Bp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = enumC2331909Bt;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2331509Bp(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "DefaultGenAIBridge@a8d8.cancelAndDeleteTask$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r5 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L62
            if (r0 != r4) goto L6e
            X.C155000ia.LIZIZ(r9)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r9)
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r2 = X.C09BV.LIZ()
            if (r2 != 0) goto L2c
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L2c:
            X.09Bt r0 = r8.LLILLL
            int[] r1 = X.C2331809Bs.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r3) goto L52
            if (r0 != r4) goto L76
            java.lang.String r1 = r8.LLILZ
        L3c:
            if (r1 == 0) goto L17
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            if (r0 != 0) goto L17
            r8.LL = r5
            r8.LLILLJJLI = r4
            java.lang.Object r0 = r2.LJJI(r1, r8)
            if (r0 != r6) goto L17
            X.C1C7U.LIZIZ(r7)
            return r6
        L52:
            java.lang.String r0 = r8.LLILZ
            r8.LL = r2
            r8.LLILLJJLI = r3
            java.lang.Object r9 = r2.LJFF(r0, r8)
            if (r9 != r6) goto L67
            X.C1C7U.LIZIZ(r7)
            return r6
        L62:
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r2 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L67:
            X.0LSZ r9 = (X.C0LSZ) r9
            if (r9 == 0) goto L17
            java.lang.String r1 = r9.LJIIJ
            goto L3c
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L76:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2331509Bp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
