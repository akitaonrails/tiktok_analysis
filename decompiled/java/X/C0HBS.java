package X;

import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HBS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils$fillOriginImage$1$1", f = "AnchorBizUtils.kt", l = {1999, 2013}, m = "invokeSuspend")
public final class C0HBS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ AnchorProductInfoModel LLILZ;
    public final /* synthetic */ C424610Gkt LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HBS(String str, boolean z, AnchorProductInfoModel anchorProductInfoModel, C424610Gkt c424610Gkt, InterfaceC1364105Vn<? super C0HBS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = anchorProductInfoModel;
        this.LLILZIL = c424610Gkt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HBS(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "AnchorBizUtils@b393.fillOriginImage$1$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r9.LL
            r6 = 2
            r3 = 1
            if (r0 == 0) goto L1c
            if (r0 == r3) goto L47
            if (r0 != r6) goto Lae
            X.C155000ia.LIZIZ(r10)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r10)
            X.0vTs r0 = X.C1743860vTs.LIZ
            java.lang.String r1 = r9.LLILLJJLI
            r0.getClass()
            android.util.LruCache<java.lang.String, X.05XL<kotlin.Unit>> r0 = X.C1743860vTs.LIZIZ
            java.lang.Object r1 = r0.get(r1)
            X.0957 r1 = (X.AnonymousClass0957) r1
            if (r1 == 0) goto L45
            boolean r0 = r1.isCompleted()
            if (r0 != 0) goto L45
            r0 = 1
        L37:
            if (r0 == 0) goto L4a
            r9.LL = r3
            java.lang.Object r0 = r1.LJLIIIL(r9)
            if (r0 != r5) goto L4a
            X.C1C7U.LIZIZ(r8)
            return r5
        L45:
            r0 = 0
            goto L37
        L47:
            X.C155000ia.LIZIZ(r10)
        L4a:
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r0 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            java.lang.String r1 = r9.LLILLJJLI
            r0.getClass()
            X.0kdB r0 = X.C1326790kdB.LIZ
            r0.getClass()
            boolean r0 = X.C1326790kdB.LIZJ(r1)
            r4 = 0
            if (r0 == 0) goto L6f
            java.lang.String r1 = X.C1326790kdB.LIZ(r1)
            android.graphics.drawable.BitmapDrawable r7 = new android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Exception -> L6b
            android.content.res.Resources r0 = X.C20642515q3.LJFF()     // Catch: java.lang.Exception -> L6b
            r7.<init>(r0, r1)     // Catch: java.lang.Exception -> L6b
            goto L70
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6f:
            r7 = r4
        L70:
            boolean r0 = r9.LLILLL
            if (r0 == 0) goto L9c
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r2 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r0 = r9.LLILZ
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo r1 = r0.extraData
            java.lang.Integer r0 = X.C2286608xc.LJ(r6)
            r2.getClass()
            java.lang.String r3 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJJJJJ(r1, r0)
        L85:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0HAR r1 = new X.0HAR
            X.0Gkt r0 = r9.LLILZIL
            r1.<init>(r7, r0, r3, r4)
            r9.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r9, r2, r1)
            if (r0 != r5) goto L16
            X.C1C7U.LIZIZ(r8)
            return r5
        L9c:
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r2 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r0 = r9.LLILZ
            com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo r1 = r0.extraData
            java.lang.Integer r0 = X.C2286608xc.LJ(r3)
            r2.getClass()
            java.lang.String r3 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJJJJJ(r1, r0)
            goto L85
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HBS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
