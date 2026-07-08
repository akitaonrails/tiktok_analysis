package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.UcpOptionDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ACPGetProductsArgumentsDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ACPGetProductsCatalogDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ACPGetProductsContextDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ACPGetProductsRequestDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.RemoteImageDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantOptionDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.network.ACPProductApiService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D16, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D16 implements InterfaceC331650CzL {
    public static final Map<String, String> LIZIZ = C2097908Jt.LIZJ(new Pair("Content-Type", "application/json"));
    public final ACPProductApiService LIZ = (ACPProductApiService) C334130D7z.LJIIIIZZ.getValue();

    @Override // X.InterfaceC331650CzL
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.InterfaceC331650CzL
    public final boolean LJ() {
        return true;
    }

    @Override // X.InterfaceC331650CzL
    public final boolean LJFF() {
        return false;
    }

    public C0D16(int i) {
    }

    public static UniversalProductDto LJIIIIZZ(n nVar) {
        String str;
        List<VariantOptionDto> list;
        List<UcpOptionDto> list2;
        List<VariantDto> list3;
        List<RemoteImageDto> list4;
        UniversalProductDto universalProductDto = (UniversalProductDto) C051K.LIZ(UniversalProductDto.class, nVar);
        if (universalProductDto == null) {
            return null;
        }
        String str2 = universalProductDto.id;
        if ((str2 == null || a0.LJJJIL(str2)) && (((str = universalProductDto.title) == null || a0.LJJJIL(str)) && universalProductDto.priceRange == null && (((list = universalProductDto.selected) == null || list.isEmpty()) && (((list2 = universalProductDto.options) == null || list2.isEmpty()) && (((list3 = universalProductDto.variants) == null || list3.isEmpty()) && ((list4 = universalProductDto.media) == null || list4.isEmpty())))))) {
            return null;
        }
        return universalProductDto;
    }

    public static ACPGetProductsRequestDto LJI(String str, Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new VariantOptionDto(a0.LJJJJZ("option.", (String) entry.getKey()), (String) entry.getValue()));
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        return new ACPGetProductsRequestDto("get_product", new ACPGetProductsArgumentsDto(new ACPGetProductsCatalogDto(str, new ACPGetProductsContextDto(C0D48.LIZ()), arrayList)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto LJII(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto r19, java.lang.String r20, java.util.Map r21) {
        /*
            r13 = r19
            java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantOptionDto> r3 = r13.selected
            r2 = 0
            if (r3 == 0) goto L53
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L53
        Lf:
            java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantDto> r1 = r13.variants
            if (r1 == 0) goto L96
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r4 = r1.next()
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantDto r4 = (com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantDto) r4
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantEligibleDto r0 = r4.eligible
            if (r0 == 0) goto L36
            java.lang.Boolean r0 = r0.nativeCheckout
            if (r0 != 0) goto L4f
        L36:
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantEligibleDto r12 = new com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantEligibleDto
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r12.<init>(r0)
            java.lang.String r5 = r4.id
            java.lang.String r6 = r4.title
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantDescriptionDto r7 = r4.description
            java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantOptionDto> r8 = r4.options
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantAvailabilityDto r9 = r4.availability
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.PriceAmountDto r10 = r4.price
            java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.RemoteImageDto> r11 = r4.media
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantDto r4 = r4.copy(r5, r6, r7, r8, r9, r10, r11, r12)
        L4f:
            r2.add(r4)
            goto L22
        L53:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = r21.size()
            r3.<init>(r0)
            java.util.Set r0 = r21.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L64:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r5 = r0.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r0.getValue()
            java.lang.String r4 = (java.lang.String) r4
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantOptionDto r1 = new com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantOptionDto
            java.lang.String r0 = "option."
            java.lang.String r0 = kotlin.text.a0.LJJJJZ(r0, r5)
            r1.<init>(r0, r4)
            r3.add(r1)
            goto L64
        L8b:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto Lf
            r3 = r2
            goto Lf
        L96:
            java.lang.String r14 = r13.id
            if (r14 == 0) goto Lbd
            boolean r0 = kotlin.text.a0.LJJJIL(r14)
            r0 = r0 ^ 1
            if (r0 == 0) goto Lbd
        La2:
            java.lang.String r15 = r13.title
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ProductDescriptionDto r5 = r13.description
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.PriceRangeDto r4 = r13.priceRange
            java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.RemoteImageDto> r1 = r13.media
            java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.api.model.UcpOptionDto> r0 = r13.options
            r18 = r1
            r19 = r3
            r20 = r0
            r21 = r2
            r16 = r5
            r17 = r4
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto r0 = r13.copy(r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        Lbd:
            r14 = r20
            goto La2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D16.LJII(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto, java.lang.String, java.util.Map):com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto");
    }

    @Override // X.InterfaceC331650CzL
    public final Object LIZ(String str, String str2, Map<String, String> map, InterfaceC1364105Vn<? super C189200o6<UniversalProductDto>> interfaceC1364105Vn) {
        return C0D1B.LIZ(this, str, str2, map, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // X.InterfaceC331650CzL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto>> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C0D18
            if (r0 == 0) goto L3d
            r5 = r10
            X.0D18 r5 = (X.C0D18) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L43
            X.C155000ia.LIZIZ(r1)
        L22:
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0D17 r1 = new X.0D17
            r0 = 0
            r1.<init>(r8, r6, r9, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L3d:
            X.0D18 r5 = new X.0D18
            r5.<init>(r6, r10)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D16.LIZIZ(java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC331650CzL
    public final Object LIZJ(String str, String str2, Map<String, String> map, InterfaceC1364105Vn<? super C189200o6<UniversalProductDto>> interfaceC1364105Vn) {
        return C0D1B.LIZIZ(this, str, str2, map, interfaceC1364105Vn);
    }
}
