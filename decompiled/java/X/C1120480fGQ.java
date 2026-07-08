package X;

import android.graphics.drawable.Drawable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fGQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.promotion.EcommercePromotionManager$show$4$3$1$1$1", f = "EcommercePromotionManager.kt", l = {}, m = "invokeSuspend")
public final class C1120480fGQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Pair<String, Drawable> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1120480fGQ(Pair<String, ? extends Drawable> pair, InterfaceC1364105Vn<? super C1120480fGQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pair;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1120480fGQ(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:9:0x0067, B:10:0x006f, B:13:0x0092, B:12:0x0074, B:14:0x0095, B:15:0x0098, B:16:0x009b, B:17:0x009e, B:18:0x00a1, B:11:0x0072), top: B:21:0x0067 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "EcommercePromotionManager@9423.show$4$3$1$1$1"
            X.C1C7U.LIZ(r5)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r7)
            X.0fGU r4 = X.C20340514iR.LIZLLL()
            X.0f8z r3 = X.EnumC1115870f8z.ECOMMERCE
            X.0f96 r2 = new X.0f96
            X.0f98 r1 = new X.0f98
            kotlin.Pair<java.lang.String, android.graphics.drawable.Drawable> r0 = r6.LL
            java.lang.Object r0 = r0.getSecond()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r1.<init>(r0)
            kotlin.Pair<java.lang.String, android.graphics.drawable.Drawable> r0 = r6.LL
            java.lang.Object r0 = r0.getFirst()
            java.lang.String r0 = (java.lang.String) r0
            r2.<init>(r1, r0)
            com.ss.android.ugc.aweme.ecommercelive.audience.common.framework.settings.PromotionContainerConfig r0 = X.C1120510fGT.LIZ()
            long r0 = r0.duration
            X.0f99 r2 = r4.t5(r3, r2, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "show result: "
            r1.append(r0)
            boolean r0 = r2.LIZ
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            X.0f8w r0 = r2.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20340514iR.LJI(r0)
            boolean r0 = r2.LIZ
            if (r0 == 0) goto L63
            X.0fGR r0 = X.EnumC1120490fGR.DISPLAY
            X.C1120500fGS.LIZ(r0)
        L5d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L63:
            X.0f8w r0 = r2.LIZIZ
            if (r0 == 0) goto L72
            int[] r1 = X.C1115880f90.LIZ     // Catch: java.lang.Throwable -> La4
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> La4
            r0 = r1[r0]     // Catch: java.lang.Throwable -> La4
            switch(r0) {
                case 1: goto L92;
                case 2: goto L95;
                case 3: goto L98;
                case 4: goto L9b;
                case 5: goto L9e;
                case 6: goto La1;
                default: goto L72;
            }     // Catch: java.lang.Throwable -> La4
        L72:
            X.0fGR r0 = X.EnumC1120490fGR.FAIL_LIVE_CONTROL_NOT_PASS_OTHERS     // Catch: java.lang.Throwable -> La4
        L74:
            X.0pL7 r4 = X.C1507790pL7.LIZ     // Catch: java.lang.Throwable -> La4
            java.lang.String r3 = "tiktokec_rd_live_bottom_promotion_container_event"
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> La4
            r2.<init>()     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = "step"
            java.lang.String r0 = r0.getValue()     // Catch: java.lang.Throwable -> La4
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> La4
            r4.getClass()     // Catch: java.lang.Throwable -> La4
            X.C1507790pL7.LIZJ(r3, r2)     // Catch: java.lang.Throwable -> La4
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> La4
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> La4
            goto L5d
        L92:
            X.0fGR r0 = X.EnumC1120490fGR.FAIL_LIVE_CONTROL_NOT_PASS_NO_BEHAVIOR     // Catch: java.lang.Throwable -> La4
            goto L74
        L95:
            X.0fGR r0 = X.EnumC1120490fGR.FAIL_LIVE_CONTROL_NOT_PASS_MANUALLY_CLOSE     // Catch: java.lang.Throwable -> La4
            goto L74
        L98:
            X.0fGR r0 = X.EnumC1120490fGR.FAIL_LIVE_CONTROL_NOT_PASS_FREQUENCY     // Catch: java.lang.Throwable -> La4
            goto L74
        L9b:
            X.0fGR r0 = X.EnumC1120490fGR.FAIL_LIVE_CONTROL_NOT_PASS_CONFLICT     // Catch: java.lang.Throwable -> La4
            goto L74
        L9e:
            X.0fGR r0 = X.EnumC1120490fGR.FAIL_LIVE_CONTROL_NOT_PASS_BUSINESS_PRIORITY     // Catch: java.lang.Throwable -> La4
            goto L74
        La1:
            X.0fGR r0 = X.EnumC1120490fGR.FAIL_LIVE_CONTROL_NOT_PASS_TIME_OUT     // Catch: java.lang.Throwable -> La4
            goto L74
        La4:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1120480fGQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
