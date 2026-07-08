package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0z8I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.activitycenter.acfeeds.ACFeedsBridgeModel$deleteData$3$1", f = "ACFeedsBridgeModel.kt", l = {211}, m = "invokeSuspend")
public final class C1884240z8I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1884220z8G LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884240z8I(C1884220z8G c1884220z8G, List<String> list, InterfaceC1364105Vn<? super C1884240z8I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1884220z8G;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1884240z8I(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r3 = "ACFeedsBridgeModel@97aa.deleteData$3$1"
            X.C1C7U.LIZ(r3)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LL
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L3d
            X.C155000ia.LIZIZ(r11)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r3)
            return r0
        L19:
            X.C155000ia.LIZIZ(r11)
            X.0z8G r4 = r10.LLILLJJLI
            java.util.List<java.lang.String> r5 = r10.LLILLL
            X.0z8L r0 = r4.LLIZLLLIL
            if (r0 == 0) goto L3b
            boolean r6 = r0.LIZJ
            java.lang.String r7 = r0.LIZIZ
            if (r7 != 0) goto L2c
        L2a:
            java.lang.String r7 = ""
        L2c:
            java.lang.String r8 = r4.LLILZIL
            r10.LL = r1
            r9 = 0
            java.lang.Object r0 = r4.LJIILJJIL(r5, r6, r7, r8, r9, r10)
            if (r0 != r2) goto L13
            X.C1C7U.LIZIZ(r3)
            return r2
        L3b:
            r6 = 0
            goto L2a
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1884240z8I.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
