package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.map2.AddressMapDetailViewModel2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vXz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.map2.AddressMapDetailViewModel2$requestMapDetail$1", f = "AddressMapDetailViewModel2.kt", l = {113}, m = "invokeSuspend")
public final class C1746410vXz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AddressMapDetailViewModel2 LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746410vXz(AddressMapDetailViewModel2 addressMapDetailViewModel2, Integer num, boolean z, InterfaceC1364105Vn<? super C1746410vXz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = addressMapDetailViewModel2;
        this.LLILLL = num;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1746410vXz(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[Catch: Exception -> 0x00a0, PHI: r0
      0x003c: PHI (r0v8 java.lang.Integer) = (r0v7 java.lang.Integer), (r0v19 java.lang.Integer) binds: [B:10:0x002c, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00a0, blocks: (B:22:0x006c, B:23:0x006f, B:25:0x007b, B:27:0x007f, B:29:0x0085, B:30:0x0087, B:31:0x0096, B:9:0x0028, B:11:0x002e, B:13:0x0034, B:18:0x0040, B:17:0x003c), top: B:36:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r4 = "AddressMapDetailViewModel2@4ad0.requestMapDetail$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r11.LL
            r7 = 0
            r1 = 1
            if (r0 == 0) goto L1a
            if (r0 != r1) goto L12
            goto L6c
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C155000ia.LIZIZ(r12)
            com.ss.android.ugc.aweme.ecommerce.base.address.map2.AddressMapDetailViewModel2 r3 = r11.LLILLJJLI
            r0 = 709(0x2c5, float:9.94E-43)
            kotlin.jvm.internal.AFwS268S0000000_26 r0 = kotlin.jvm.internal.AFwS268S0000000_26.get$arr$(r0)
            r3.setState(r0)
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressMapRequest r5 = new com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressMapRequest     // Catch: java.lang.Exception -> La0
            java.lang.Integer r0 = r11.LLILLL     // Catch: java.lang.Exception -> La0
            if (r0 != 0) goto L3c
            com.ss.android.ugc.aweme.ecommerce.base.address.map2.AddressMapDetailViewModel2 r0 = r11.LLILLJJLI     // Catch: java.lang.Exception -> La0
            com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter$AddressMapDetailEnterParams r0 = r0.LL     // Catch: java.lang.Exception -> La0
            if (r0 == 0) goto L37
            java.lang.Integer r0 = r0.scene     // Catch: java.lang.Exception -> La0
            goto L38
        L37:
            r0 = r7
        L38:
            if (r0 != 0) goto L3c
            r0 = 0
            goto L40
        L3c:
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> La0
        L40:
            java.lang.Integer r6 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> La0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressSearchParam r9 = new com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressSearchParam     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = "address"
            r9.<init>(r0)     // Catch: java.lang.Exception -> La0
            java.lang.String r10 = X.C1747870vaL.LIZ     // Catch: java.lang.Exception -> La0
            r8 = r7
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> La0
            X.03sT r0 = com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi.LIZ     // Catch: java.lang.Exception -> La0
            r11.LL = r1     // Catch: java.lang.Exception -> La0
            r0.getClass()     // Catch: java.lang.Exception -> La0
            X.01K1 r1 = X.C980703sT.LIZIZ     // Catch: java.lang.Exception -> La0
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> La0
            com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi) r0     // Catch: java.lang.Exception -> La0
            java.lang.Object r12 = r0.st(r5, r11)     // Catch: java.lang.Exception -> La0
            if (r12 != r2) goto L6f
            X.C1C7U.LIZIZ(r4)
            return r2
        L6c:
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Exception -> La0
        L6f:
            com.ss.android.ugc.aweme.ecommerce.base.address.map2.AddressMapDetailViewModel2 r3 = r11.LLILLJJLI     // Catch: java.lang.Exception -> La0
            boolean r2 = r11.LLILZ     // Catch: java.lang.Exception -> La0
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r12 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r12     // Catch: java.lang.Exception -> La0
            boolean r0 = r12.isCodeOK()     // Catch: java.lang.Exception -> La0
            if (r0 == 0) goto L96
            T r1 = r12.data     // Catch: java.lang.Exception -> La0
            if (r1 == 0) goto L96
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressMapResponseData r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressMapResponseData) r1     // Catch: java.lang.Exception -> La0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r1.address     // Catch: java.lang.Exception -> La0
            if (r0 == 0) goto L87
            r3.LLILLJJLI = r0     // Catch: java.lang.Exception -> La0
        L87:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r0 = r1.inputItemData     // Catch: java.lang.Exception -> La0
            r3.LLILLL = r0     // Catch: java.lang.Exception -> La0
            kotlin.jvm.internal.AwS112S0110000_26 r1 = new kotlin.jvm.internal.AwS112S0110000_26     // Catch: java.lang.Exception -> La0
            r0 = 16
            r1.<init>(r3, r2, r0)     // Catch: java.lang.Exception -> La0
            r3.setState(r1)     // Catch: java.lang.Exception -> La0
            goto Lb4
        L96:
            r0 = 710(0x2c6, float:9.95E-43)
            kotlin.jvm.internal.AFwS268S0000000_26 r0 = kotlin.jvm.internal.AFwS268S0000000_26.get$arr$(r0)     // Catch: java.lang.Exception -> La0
            r3.setState(r0)     // Catch: java.lang.Exception -> La0
            goto Lb4
        La0:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            com.ss.android.ugc.aweme.ecommerce.base.address.map2.AddressMapDetailViewModel2 r1 = r11.LLILLJJLI
            r0 = 711(0x2c7, float:9.96E-43)
            kotlin.jvm.internal.AFwS268S0000000_26 r0 = kotlin.jvm.internal.AFwS268S0000000_26.get$arr$(r0)
            r1.setState(r0)
            X.03xw r0 = X.EnumC1014603xw.ERR20004
            X.C1019103yf.LIZ(r0, r2, r7)
        Lb4:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1746410vXz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
