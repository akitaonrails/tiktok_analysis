package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.AcShopCatalogRequestDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.VariantOptionDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.network.AcShopCatalogApiService;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D1E, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D1E implements InterfaceC331650CzL {
    public final AcShopCatalogApiService LIZ = (AcShopCatalogApiService) C334130D7z.LJIIIZ.getValue();

    @Override // X.InterfaceC331650CzL
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.InterfaceC331650CzL
    public final boolean LJ() {
        return false;
    }

    @Override // X.InterfaceC331650CzL
    public final boolean LJFF() {
        return false;
    }

    public static AcShopCatalogRequestDto LJI(String str, String str2, Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new VariantOptionDto(a0.LJJJJZ("option.", (String) entry.getKey()), (String) entry.getValue()));
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        return new AcShopCatalogRequestDto(str, str2, arrayList, C2097908Jt.LIZJ(new Pair("currency", C0D48.LIZ())));
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
            boolean r0 = r10 instanceof X.C0D1G
            if (r0 == 0) goto L3d
            r4 = r10
            X.0D1G r4 = (X.C0D1G) r4
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
            X.0D1F r5 = new X.0D1F
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r4.LLILLL = r1
            java.lang.Object r3 = X.C23250099c.LJI(r4, r0, r5)
            if (r3 != r2) goto L22
            return r2
        L3d:
            X.0D1G r4 = new X.0D1G
            r4.<init>(r6, r10)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D1E.LIZIZ(java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC331650CzL
    public final Object LIZJ(String str, String str2, Map<String, String> map, InterfaceC1364105Vn<? super C189200o6<UniversalProductDto>> interfaceC1364105Vn) {
        return C0D1B.LIZIZ(this, str, str2, map, interfaceC1364105Vn);
    }
}
