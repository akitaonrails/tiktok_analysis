package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NWN, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.tux.compose.internal.BasePopupKt$TopOrCenterPopup$3$1", f = "BasePopup.kt", l = {122, 125}, m = "invokeSuspend")
public final class C0NWN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ C05P0<C0NWP> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NWN(long j, boolean z, Function0<Unit> function0, C05P0<C0NWP> c05p0, InterfaceC1364105Vn<? super C0NWN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = function0;
        this.LLILZIL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NWN(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "BasePopupKt@4a7e.TopOrCenterPopup$3$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LL
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 == r2) goto L3b
            if (r0 != r4) goto L5d
            X.C155000ia.LIZIZ(r7)
        L16:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r6.LLILZ
            if (r0 == 0) goto L1d
            r0.invoke()
        L1d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L23:
            X.C155000ia.LIZIZ(r7)
            X.05P0<X.0NWP> r1 = r6.LLILZIL
            X.0NWP r0 = X.C0NWP.Show
            r1.setValue(r0)
            long r0 = r6.LLILLJJLI
            r6.LL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZJ(r0, r6)
            if (r0 != r3) goto L3e
            X.C1C7U.LIZIZ(r5)
            return r3
        L3b:
            X.C155000ia.LIZIZ(r7)
        L3e:
            X.05P0<X.0NWP> r1 = r6.LLILZIL
            X.0NWP r0 = X.C0NWP.Hide
            r1.setValue(r0)
            boolean r0 = r6.LLILLL
            if (r0 == 0) goto L16
            r1 = 500(0x1f4, float:7.0E-43)
            X.13Jk r0 = X.EnumC19990213Jk.MILLISECONDS
            long r0 = X.C19990313Jl.LJII(r1, r0)
            r6.LL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZJ(r0, r6)
            if (r0 != r3) goto L16
            X.C1C7U.LIZIZ(r5)
            return r3
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NWN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
