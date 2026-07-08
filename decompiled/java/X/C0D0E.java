package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.SupplementVariant;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.PriceAmountDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.PriceRangeDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.RecommendApiRequestDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0D0E, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D0E {
    public static final C332030Czx LJ = new C332030Czx();
    public static volatile C0D0E LJFF;
    public final InterfaceC332020Czw LIZ;
    public final C0D05 LIZIZ;
    public final InterfaceC331650CzL LIZJ;
    public final InterfaceC331650CzL LIZLLL;

    public C0D0E(C332000Czu c332000Czu) {
        C0D12 c0d12 = new C0D12();
        C0D1E c0d1e = new C0D1E();
        C0D16 c0d16 = new C0D16(0);
        this.LIZ = c332000Czu;
        this.LIZIZ = c0d12;
        this.LIZJ = c0d1e;
        this.LIZLLL = c0d16;
    }

    public static UcpRecommendationItem LJIIIZ(UcpRecommendationItem ucpRecommendationItem, UniversalProductDto universalProductDto) {
        Double dValueOf;
        List<SupplementVariant> list;
        PriceAmountDto priceAmountDto;
        Long l;
        String strLIZLLL = C332790D2v.LIZLLL(universalProductDto);
        PriceRangeDto priceRangeDto = universalProductDto.priceRange;
        if (priceRangeDto != null && (priceAmountDto = priceRangeDto.min) != null && (l = priceAmountDto.amount) != null) {
            dValueOf = Double.valueOf(l.longValue() / 100.0d);
        } else {
            dValueOf = ucpRecommendationItem.currentPrice;
        }
        PdpSupplementData pdpSupplementData = ucpRecommendationItem.pdpSupplementData;
        Double d = null;
        if (pdpSupplementData != null && (list = pdpSupplementData.variants) != null && !list.isEmpty() && dValueOf != null) {
            C08QT c08qt = new C08QT(C09RB.LJIJI(new C1939607ik(list), AFwS232S0000000_4.get$arr$(173)));
            if (c08qt.hasNext()) {
                double dDoubleValue = ((Number) c08qt.next()).doubleValue();
                while (c08qt.hasNext()) {
                    dDoubleValue = Math.max(dDoubleValue, ((Number) c08qt.next()).doubleValue());
                }
                Double dValueOf2 = Double.valueOf(dDoubleValue);
                if (dValueOf2 != null && dValueOf2.doubleValue() > dValueOf.doubleValue()) {
                    d = dValueOf2;
                }
            }
        }
        String title = universalProductDto.title;
        if (title == null) {
            title = ucpRecommendationItem.getTitle();
        }
        return ucpRecommendationItem.copy(ucpRecommendationItem._protocolType, ucpRecommendationItem._id, ucpRecommendationItem._productId, ucpRecommendationItem._tiktokSpuId, ucpRecommendationItem.tiktokSpuName, ucpRecommendationItem.tiktokSpuImage, ucpRecommendationItem._tiktokShopId, ucpRecommendationItem.tiktokShopName, ucpRecommendationItem.shopDomain, ucpRecommendationItem.url, ucpRecommendationItem.channelName, title, strLIZLLL, dValueOf, d, ucpRecommendationItem.rating, ucpRecommendationItem.reviewCount, ucpRecommendationItem.tag, ucpRecommendationItem.promotionLabel, ucpRecommendationItem.source, ucpRecommendationItem.pdpSupplementData);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.RecommendApiRequestDto r6, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.RecommendApiResponseDto>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C0D07
            if (r0 == 0) goto L3f
            r4 = r7
            X.0D07 r4 = (X.C0D07) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L55
            X.C155000ia.LIZIZ(r2)
        L22:
            X.00o6 r2 = (X.C189200o6) r2
            if (r2 == 0) goto L45
            java.lang.Object r0 = r2.m10unboximpl()
            return r0
        L2b:
            X.C155000ia.LIZIZ(r2)
            X.0Czy r2 = new X.0Czy
            r0 = 0
            r2.<init>(r5, r6, r0)
            r4.LLILLL = r1
            r0 = 12000(0x2ee0, double:5.929E-320)
            java.lang.Object r2 = X.C099A.LIZJ(r0, r2, r4)
            if (r2 != r3) goto L22
            return r3
        L3f:
            X.0D07 r4 = new X.0D07
            r4.<init>(r5, r7)
            goto L12
        L45:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r0 = "Recommend API request timed out (12s)"
            r1.<init>(r0)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D0E.LIZIZ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.RecommendApiRequestDto, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem r38, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem> r39) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D0E.LIZJ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem r7, X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0D06
            if (r0 == 0) goto L3d
            r5 = r8
            X.0D06 r5 = (X.C0D06) r5
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
            X.0D02 r1 = new X.0D02
            r0 = 0
            r1.<init>(r6, r7, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L3d:
            X.0D06 r5 = new X.0D06
            r5.<init>(r6, r8)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D0E.LIZLLL(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem> r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0D0C
            if (r0 == 0) goto L6c
            r6 = r9
            X.0D0C r6 = (X.C0D0C) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L40
            if (r0 != r4) goto L80
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem r8 = r6.LL
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r1 = r1.m10unboximpl()
        L2a:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r1)
            if (r0 == 0) goto L72
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L37
            r1 = 0
        L37:
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto r1 = (com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto) r1
            if (r1 == 0) goto L3f
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem r8 = LJIIIZ(r8, r1)
        L3f:
            return r8
        L40:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r3 = r8.shopDomain
            if (r3 == 0) goto L88
            boolean r0 = kotlin.text.a0.LJJJIL(r3)
            if (r0 != 0) goto L88
            java.lang.String r0 = r8.getProductId()
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto L88
            X.0CzL r2 = r7.LIZJ
            java.lang.String r1 = r8.getProductId()
            java.util.Map r0 = X.C2097608Jq.LJ()
            r6.LL = r8
            r6.LLILZ = r4
            java.lang.Object r1 = r2.LIZIZ(r3, r1, r0, r6)
            if (r1 != r5) goto L2a
            return r5
        L6c:
            X.0D0C r6 = new X.0D0C
            r6.<init>(r7, r9)
            goto L12
        L72:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r1 != 0) goto L7f
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r0 = "Unknown server-proxy UCP fetch error"
            r1.<init>(r0)
        L7f:
            throw r1
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L88:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D0E.LJ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem r15, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem> r16) throws java.lang.Exception {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C0D0D
            if (r0 == 0) goto L7f
            r13 = r3
            X.0D0D r13 = (X.C0D0D) r13
            int r2 = r13.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7f
            int r2 = r2 - r1
            r13.LLILZ = r2
        L14:
            java.lang.Object r1 = r13.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r13.LLILZ
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L43
            if (r0 != r6) goto L93
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem r15 = r13.LL
            X.C155000ia.LIZIZ(r1)
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r1 = r1.m10unboximpl()
        L2d:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r1)
            if (r0 == 0) goto L85
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L3a
            r3 = r1
        L3a:
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto r3 = (com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto) r3
            if (r3 == 0) goto L42
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem r15 = LJIIIZ(r15, r3)
        L42:
            return r15
        L43:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r5 = r15.shopDomain
            if (r5 == 0) goto L9b
            boolean r0 = kotlin.text.a0.LJJJIL(r5)
            if (r0 != 0) goto L9b
            java.lang.String r0 = r15.getProductId()
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto L9b
            X.062l r7 = X.C15433062l.LIZ
            java.lang.String r8 = "/api/v1/ucp/product"
            java.lang.String r2 = r15.getProductId()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "id"
            r1.<init>(r0, r2)
            java.util.Map r9 = X.C2097908Jt.LIZJ(r1)
            X.0D04 r12 = new X.0D04
            r12.<init>(r14, r5, r15, r3)
            r13.LL = r15
            r13.LLILZ = r6
            r10 = 12000(0x2ee0, double:5.929E-320)
            java.lang.Object r1 = r7.LIZLLL(r8, r9, r10, r12, r13)
            if (r1 != r4) goto L2d
            return r4
        L7f:
            X.0D0D r13 = new X.0D0D
            r13.<init>(r14, r3)
            goto L14
        L85:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r1 != 0) goto L92
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r0 = "Unknown UCP fetch error"
            r1.<init>(r0)
        L92:
            throw r1
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9b:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D0E.LJFF(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem>>> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C0D09
            if (r0 == 0) goto L3d
            r5 = r9
            X.0D09 r5 = (X.C0D09) r5
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
            X.0D01 r1 = new X.0D01
            r0 = 0
            r1.<init>(r6, r8, r7, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L3d:
            X.0D09 r5 = new X.0D09
            r5.<init>(r6, r9)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D0E.LJII(java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b3 A[PHI: r3
      0x03b3: PHI (r3v10 java.lang.Integer) = (r3v9 java.lang.Integer), (r3v21 java.lang.Integer), (r3v23 java.lang.Integer), (r3v25 java.lang.Integer) binds: [B:120:0x0229, B:124:0x0233, B:126:0x023b, B:128:0x0243] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0382 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v134 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object[], java.util.List[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.RecommendApiRequestDto r62, java.lang.String r63, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem>>> r64) {
        /*
            Method dump skipped, instruction units count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D0E.LJIIIIZZ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto.RecommendApiRequestDto, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static RecommendApiRequestDto LIZ(String str, String str2, String str3, Map map) {
        int iIntValue;
        int iIntValue2;
        Object c098200Yq;
        boolean z;
        Integer numLJIIJJI;
        String str4 = str3;
        String str5 = str2;
        String str6 = (String) map.get("protocol_type");
        if (str6 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str6)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        String str7 = (String) map.get("ac_ad_type");
        if (str7 == null || !(!a0.LJJJIL(str7))) {
            str7 = "1";
        }
        Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(str7);
        if (numLJIIJJI2 != null) {
            iIntValue2 = numLJIIJJI2.intValue();
        } else {
            iIntValue2 = 1;
        }
        String str8 = "";
        if (C0D0H.LIZ(str7)) {
            if (str5 == null) {
                str5 = "";
            }
            if (str4 == null) {
                str4 = "";
            }
            String str9 = (String) map.get("web_url");
            if (str9 == null || !(!a0.LJJJIL(str9))) {
                String str10 = (String) map.get("open_loop_ucp_params");
                if (str10 == null || !(!a0.LJJJIL(str10))) {
                    str9 = "";
                } else {
                    try {
                        JSONObject jSONObjectOptJSONObject = new JSONObject(str10).optJSONObject("page");
                        if (jSONObjectOptJSONObject == null || (c098200Yq = jSONObjectOptJSONObject.optString("url")) == null) {
                            c098200Yq = "";
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = "";
                    }
                    str9 = (String) c098200Yq;
                }
            }
            String str11 = (String) map.get("adv_id");
            if (str11 == null) {
                str11 = "";
            }
            String str12 = (String) map.get("creative_id");
            if (str12 != null) {
                str8 = str12;
            }
            String str13 = (String) map.get("pid");
            if (!Intrinsics.LJFF(str7, "3") && !Intrinsics.LJFF(str7, "6")) {
                z = false;
            } else {
                z = true;
            }
            String str14 = CardStruct.IStatusCode.DEFAULT;
            if (!z || str13 == null || !(!a0.LJJJIL(str13))) {
                str13 = CardStruct.IStatusCode.DEFAULT;
            }
            String str15 = (String) map.get("product_platform_id");
            if ((Intrinsics.LJFF(str7, "3") || Intrinsics.LJFF(str7, "6")) && str15 != null && (!a0.LJJJIL(str15))) {
                str14 = str15;
            }
            return new RecommendApiRequestDto(str5, str4, str9, str11, str8, str13, str14, Integer.valueOf(iIntValue2), str, Integer.valueOf(iIntValue));
        }
        if (str5 == null) {
            str5 = "";
        }
        if (str4 != null) {
            str8 = str4;
        }
        return new RecommendApiRequestDto(str5, str8, null, null, null, null, null, 1, str, Integer.valueOf(iIntValue));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem>>> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof X.C0D08
            if (r0 == 0) goto L3d
            r4 = r11
            X.0D08 r4 = (X.C0D08) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L43
            X.C155000ia.LIZIZ(r3)
        L22:
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.0D00 r5 = new X.0D00
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.LLILLL = r1
            java.lang.Object r3 = X.C23250099c.LJI(r4, r0, r5)
            if (r3 != r2) goto L22
            return r2
        L3d:
            X.0D08 r4 = new X.0D08
            r4.<init>(r6, r11)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D0E.LJI(java.lang.String, java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }
}
