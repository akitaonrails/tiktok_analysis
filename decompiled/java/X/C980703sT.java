package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressAssociation;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressSku;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CheckShippingAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.GetShippingAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveAddressOption;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.03sT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C980703sT {
    public static final /* synthetic */ C980703sT LIZ = new C980703sT();
    public static final C01K1 LIZIZ;

    static {
        InterfaceC859903Xp interfaceC859903XpCreateBuilder = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/");
        interfaceC859903XpCreateBuilder.LIZ(new GecNetInterceptor());
        LIZIZ = interfaceC859903XpCreateBuilder.build();
    }

    public static C11NZ LIZJ(GetShippingAddressRequest getShippingAddressRequest) {
        if (getShippingAddressRequest == null) {
            return ((AddressApi) LIZIZ.create(AddressApi.class)).ft();
        }
        return ((AddressApi) LIZIZ.create(AddressApi.class)).ot(getShippingAddressRequest);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingAddressSelectRequest r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingAddressSelectResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C981003sW
            if (r0 == 0) goto L20
            r5 = r8
            X.03sW r5 = (X.C981003sW) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L44
        L20:
            X.03sW r5 = new X.03sW
            r5.<init>(r6, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            X.01K1 r1 = X.C980703sT.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4a
            com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi) r0     // Catch: java.lang.Exception -> L4a
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L4a
            java.lang.Object r4 = r0.rt(r7, r5)     // Catch: java.lang.Exception -> L4a
            if (r4 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L4a
        L47:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingAddressSelectResponse r4 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingAddressSelectResponse) r4     // Catch: java.lang.Exception -> L4a
            return r4
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r1 = r0.toString()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingAddressSelectResponse r4 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingAddressSelectResponse
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.<init>(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C980703sT.LJII(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingAddressSelectRequest, X.05Vn):java.lang.Object");
    }

    public static Object LIZIZ(Address address, Integer num, Integer num2, InterfaceC1364105Vn interfaceC1364105Vn) {
        return ((AddressApi) LIZIZ.create(AddressApi.class)).tt(new CheckShippingAddressRequest(address, num, num2, C1747870vaL.LIZ), interfaceC1364105Vn);
    }

    public static Object LJFF(Address address, int i, boolean z, Integer num, AddressSku addressSku, EnumC962003pS enumC962003pS, InterfaceC1364105Vn interfaceC1364105Vn) {
        Integer numLJ;
        if (enumC962003pS != null) {
            numLJ = C2286608xc.LJ(enumC962003pS.ordinal());
        } else {
            numLJ = null;
        }
        return ((AddressApi) LIZIZ.create(AddressApi.class)).ht(new SaveRequest(address, C2286608xc.LJ(i), num, new SaveAddressOption(z, numLJ), C1747870vaL.LIZ, addressSku, null), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r17, java.lang.Integer r18, java.lang.Integer r19, java.lang.Integer r20, java.lang.String r21, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r22, com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemOption r23, com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddressParam r24, X.InterfaceC1364105Vn r25) {
        /*
            r16 = this;
            r3 = r25
            boolean r0 = r3 instanceof X.C980903sV
            if (r0 == 0) goto L26
            r5 = r3
            X.03sV r5 = (X.C980903sV) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r5.LLILZ = r2
        L14:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L3d
            if (r0 != r3) goto L35
            java.lang.Object r2 = r5.LL
            java.util.HashMap r2 = (java.util.HashMap) r2
            goto L2e
        L26:
            X.03sV r5 = new X.03sV
            r0 = r16
            r5.<init>(r0, r3)
            goto L14
        L2e:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L32
            goto L34
        L32:
            r1 = move-exception
            goto L7b
        L34:
            return r1
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3d:
            X.C155000ia.LIZIZ(r1)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1 = r21
            if (r1 == 0) goto L4e
            java.lang.String r0 = "scene"
            r2.put(r0, r1)
        L4e:
            X.01K1 r1 = X.C980703sT.LIZIZ     // Catch: java.lang.Exception -> L7a
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L7a
            com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi) r0     // Catch: java.lang.Exception -> L7a
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemRequest r6 = new com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemRequest     // Catch: java.lang.Exception -> L7a
            r9 = 0
            java.lang.String r12 = X.C1747870vaL.LIZ     // Catch: java.lang.Exception -> L7a
            r15 = r24
            r14 = r23
            r13 = r22
            r11 = r20
            r10 = r19
            r8 = r18
            r7 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L7a
            r5.LL = r2     // Catch: java.lang.Exception -> L7a
            r5.LLILZ = r3     // Catch: java.lang.Exception -> L7a
            java.lang.Object r1 = r0.getInputItems(r6, r2, r5)     // Catch: java.lang.Exception -> L7a
            if (r1 != r4) goto L79
            return r4
        L79:
            return r1
        L7a:
            r1 = move-exception
        L7b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.03xw r0 = X.EnumC1014603xw.ERR20002
            X.C1019103yf.LIZ(r0, r1, r2)
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = new com.ss.android.ugc.aweme.ecommerce.api.model.Response
            r2 = 0
            r1 = -99999999(0xfffffffffa0a1f01, float:-1.7929145E35)
            r3 = r2
            r4 = r2
            r5 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C980703sT.LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemOption, com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddressParam, X.05Vn):java.lang.Object");
    }

    public static Object LIZ(C980703sT c980703sT, Integer num, String str, String str2, Boolean bool, String str3, Address address, AddressAssociation addressAssociation, Integer num2, Boolean bool2, InterfaceC1364105Vn interfaceC1364105Vn, int i) {
        Integer num3 = num2;
        AddressAssociation addressAssociation2 = addressAssociation;
        String str4 = str3;
        Boolean bool3 = bool;
        Boolean bool4 = null;
        if ((i & 8) != 0) {
            bool3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            addressAssociation2 = null;
        }
        if ((i & 128) != 0) {
            num3 = null;
        }
        if ((i & 256) == 0) {
            bool4 = bool2;
        }
        c980703sT.getClass();
        return ((AddressApi) LIZIZ.create(AddressApi.class)).nt(new ChangeOrderShippingAddressRequest(num, str, str2, bool3, str4, address, C1747870vaL.LIZ, addressAssociation2, num3, bool4), interfaceC1364105Vn);
    }
}
