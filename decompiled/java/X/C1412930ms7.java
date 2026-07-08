package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ms7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.VideoMixEditingMaterialComponent$startFakeProgress$1", f = "VideoMixEditingMaterialComponent.kt", l = {578}, m = "invokeSuspend")
public final class C1412930ms7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1413530mt5 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1412930ms7(C1413530mt5 c1413530mt5, InterfaceC1364105Vn<? super C1412930ms7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1413530mt5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1412930ms7(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027 A[PHI: r3
      0x0027: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:14:0x0045, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003f -> B:6:0x0015). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "VideoMixEditingMaterialComponent@1cfb.startFakeProgress$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L45
            if (r0 != r4) goto L50
            int r3 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L15:
            X.0mt5 r2 = r7.LLILLL
            kotlin.jvm.internal.AwS35S0001000_22 r1 = new kotlin.jvm.internal.AwS35S0001000_22
            r0 = 15
            r1.<init>(r3, r0)
            r2.i3(r1)
            int r3 = r3 + 1
            r0 = 100
            if (r3 >= r0) goto L4a
        L27:
            X.0mt5 r0 = r7.LLILLL
            java.lang.Object r0 = r0.T2()
            X.0mtf r0 = (X.C1413890mtf) r0
            boolean r0 = r0.LJIILLIIL
            if (r0 != 0) goto L4a
            X.0mt5 r0 = r7.LLILLL
            long r0 = r0.LLLIIII
            r7.LL = r3
            r7.LLILLJJLI = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r5) goto L15
            X.C1C7U.LIZIZ(r6)
            return r5
        L45:
            X.C155000ia.LIZIZ(r8)
            r3 = 0
            goto L27
        L4a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1412930ms7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
