package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgDataTransfer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w86, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2$updateUIShowToServer$1$1", f = "CustomDotVMV2.kt", l = {717, 721}, m = "invokeSuspend")
public final class C1768800w86 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ReachCfgDataTransfer LLILLJJLI;
    public final /* synthetic */ CustomDotVMV2 LLILLL;
    public final /* synthetic */ EnumC1768880w8E LLILZ;
    public final /* synthetic */ ReachCfgDataTransfer LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768800w86(ReachCfgDataTransfer reachCfgDataTransfer, CustomDotVMV2 customDotVMV2, EnumC1768880w8E enumC1768880w8E, ReachCfgDataTransfer reachCfgDataTransfer2, InterfaceC1364105Vn<? super C1768800w86> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = reachCfgDataTransfer;
        this.LLILLL = customDotVMV2;
        this.LLILZ = enumC1768880w8E;
        this.LLILZIL = reachCfgDataTransfer2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1768800w86(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "CustomDotVMV2@ba3d.updateUIShowToServer$1$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r9.LL
            r6 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L54
            if (r0 == r3) goto L8d
            if (r0 != r4) goto Laf
            X.C155000ia.LIZIZ(r10)
        L17:
            X.0w7i r7 = X.C1768560w7i.LIZ
            X.0w7j r6 = X.EnumC1768570w7j.UPDATE_FREQUENCY
            X.0w8M r5 = X.EnumC1768960w8M.UPDATE_SHOW
            kotlin.Pair[] r4 = new kotlin.Pair[r4]
            X.0w8E r0 = r9.LLILZ
            java.lang.String r2 = r0.getValue()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "type"
            r1.<init>(r0, r2)
            r0 = 0
            r4[r0] = r1
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgDataTransfer r0 = r9.LLILZIL
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData r0 = r0.reachCfgData
            if (r0 == 0) goto L39
            java.lang.String r2 = r0.diversionId
            if (r2 != 0) goto L3b
        L39:
            java.lang.String r2 = ""
        L3b:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "diversion_id"
            r1.<init>(r0, r2)
            r4[r3] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r4)
            r7.getClass()
            X.C1768560w7i.LJ(r6, r5, r3, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L54:
            X.C155000ia.LIZIZ(r10)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgDataTransfer r0 = r9.LLILLJJLI
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg r0 = r0.reachCfg
            if (r0 == 0) goto L69
            boolean r0 = r7.add(r0)
            java.lang.Boolean.valueOf(r0)
        L69:
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotUpdateParamsV2 r2 = new com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotUpdateParamsV2
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2 r0 = r9.LLILLL
            int r1 = r0.LL
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgDataTransfer r0 = r9.LLILLJJLI
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponseV2 r0 = r0.response
            java.lang.String r0 = r0.bringBackInfo
            r2.<init>(r3, r1, r7, r0)
            X.0w83 r1 = new X.0w83
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2 r0 = r9.LLILLL
            r1.<init>(r0, r2, r6)
            r9.LL = r3
            java.lang.String r0 = "mall"
            java.lang.Object r0 = X.C2381909Uz.LIZJ(r0, r6, r9, r1)
            if (r0 != r5) goto L90
            X.C1C7U.LIZIZ(r8)
            return r5
        L8d:
            X.C155000ia.LIZIZ(r10)
        L90:
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgDataTransfer r0 = r9.LLILLJJLI
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData r0 = r0.reachCfgData
            if (r0 == 0) goto L17
            com.google.gson.n r2 = r0.algoInfo
            if (r2 == 0) goto L17
            com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2 r0 = r9.LLILLL
            X.0w81 r1 = new X.0w81
            r1.<init>(r0, r2, r6)
            r9.LL = r4
            java.lang.String r0 = "shop_tab_reach"
            java.lang.Object r0 = X.C2381909Uz.LIZJ(r0, r6, r9, r1)
            if (r0 != r5) goto L17
            X.C1C7U.LIZIZ(r8)
            return r5
        Laf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1768800w86.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
