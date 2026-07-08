package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bottomtab.BottomTabCustomDotHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NKU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.bottomtab.BottomTabCustomDotHandler$tryToShowCustomIcon$1$1", f = "BottomTabCustomDotHandler.kt", l = {117, 118, 124, 125}, m = "invokeSuspend")
public final class C0NKU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BottomTabCustomDotHandler LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NKU(BottomTabCustomDotHandler bottomTabCustomDotHandler, Bitmap bitmap, String str, InterfaceC1364105Vn<? super C0NKU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bottomTabCustomDotHandler;
        this.LLILLL = bitmap;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NKU(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "BottomTabCustomDotHandler@3c8b.tryToShowCustomIcon$1$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r10.LL
            r7 = 0
            r5 = 4
            r4 = 3
            r8 = 2
            r0 = 1
            if (r1 == 0) goto L23
            if (r1 == r0) goto L34
            if (r1 == r8) goto L54
            if (r1 == r4) goto L65
            if (r1 != r5) goto L87
            X.C155000ia.LIZIZ(r11)
        L1d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L23:
            X.C155000ia.LIZIZ(r11)
            r10.LL = r0
            r0 = 400(0x190, double:1.976E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r10)
            if (r0 != r6) goto L37
            X.C1C7U.LIZIZ(r9)
            return r6
        L34:
            X.C155000ia.LIZIZ(r11)
        L37:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r3 = r0.LLIILII()
            X.0NKW r2 = new X.0NKW
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bottomtab.BottomTabCustomDotHandler r1 = r10.LLILLJJLI
            android.graphics.Bitmap r0 = r10.LLILLL
            r2.<init>(r1, r0, r7)
            r10.LL = r8
            java.lang.Object r0 = X.C23250099c.LJI(r10, r3, r2)
            if (r0 != r6) goto L57
            X.C1C7U.LIZIZ(r9)
            return r6
        L54:
            X.C155000ia.LIZIZ(r11)
        L57:
            r10.LL = r4
            r0 = 2400(0x960, double:1.186E-320)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r10)
            if (r0 != r6) goto L68
            X.C1C7U.LIZIZ(r9)
            return r6
        L65:
            X.C155000ia.LIZIZ(r11)
        L68:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08pq r4 = r0.LLIILII()
            X.0NKV r3 = new X.0NKV
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bottomtab.BottomTabCustomDotHandler r2 = r10.LLILLJJLI
            android.graphics.Bitmap r1 = r10.LLILLL
            java.lang.String r0 = r10.LLILZ
            r3.<init>(r2, r1, r0, r7)
            r10.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r10, r4, r3)
            if (r0 != r6) goto L1d
            X.C1C7U.LIZIZ(r9)
            return r6
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NKU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
