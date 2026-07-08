package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper$collectSharerState$1", f = "SharedVideoDeepLinkHelper.kt", l = {274, 282}, m = "invokeSuspend")
public final class C612540O0u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SharedVideoDeepLinkHelper LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ AnonymousClass0957<C189200o6<Aweme>> LLILZIL;
    public final /* synthetic */ Long LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C612540O0u(SharedVideoDeepLinkHelper sharedVideoDeepLinkHelper, boolean z, String str, AnonymousClass0957<? extends C189200o6<? extends Aweme>> anonymousClass0957, Long l, boolean z2, boolean z3, InterfaceC1364105Vn<? super C612540O0u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sharedVideoDeepLinkHelper;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = anonymousClass0957;
        this.LLILZLL = l;
        this.LLIZ = z2;
        this.LLIZLLLIL = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C612540O0u(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r9 = r21
            java.lang.String r8 = "SharedVideoDeepLinkHelper@a50d.collectSharerState$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            r6 = r20
            int r0 = r6.LL
            r7 = 2
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L2a
            if (r0 == r1) goto L42
            if (r0 != r7) goto L9a
            X.C155000ia.LIZIZ(r9)
        L1b:
            com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper r0 = r6.LLILLJJLI
            X.0956 r0 = r0.LLJIJIL
            if (r0 == 0) goto L24
            r0.LIZIZ(r4)
        L24:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r9)
            X.0O0t r2 = new X.0O0t
            com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper r0 = r6.LLILLJJLI
            r2.<init>(r0, r4)
            r6.LL = r1
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r9 = X.C099A.LIZJ(r0, r2, r6)
            if (r9 != r5) goto L45
            X.C1C7U.LIZIZ(r8)
            return r5
        L42:
            X.C155000ia.LIZIZ(r9)
        L45:
            X.0O0v r9 = (X.C612550O0v) r9
            X.1E8n r3 = X.C2276471E8n.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "collect sharerState: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r1 = "recommend_feed"
            java.lang.String r0 = "@LinkRelation_Video"
            r3.LIZIZ(r1, r0, r2)
            if (r9 == 0) goto L97
            X.0iCj r14 = r9.LIZ
            X.06Xk<com.ss.android.ugc.aweme.profile.model.User> r0 = r9.LIZIZ
            if (r0 == 0) goto L98
            java.lang.Object r12 = r0.LIZ()
            com.ss.android.ugc.aweme.profile.model.User r12 = (com.ss.android.ugc.aweme.profile.model.User) r12
        L6e:
            com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper r10 = r6.LLILLJJLI
            X.1DEx r3 = r10.LLILLJJLI
            X.0iEO r9 = new X.0iEO
            boolean r11 = r6.LLILLL
            java.lang.String r13 = r6.LLILZ
            X.0957<X.00o6<com.ss.android.ugc.aweme.feed.model.Aweme>> r15 = r6.LLILZIL
            java.lang.Long r2 = r6.LLILZLL
            boolean r1 = r6.LLIZ
            boolean r0 = r6.LLIZLLLIL
            r18 = r0
            r19 = r4
            r16 = r2
            r17 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r6.LL = r7
            java.lang.Object r0 = X.C23250099c.LJI(r6, r3, r9)
            if (r0 != r5) goto L1b
            X.C1C7U.LIZIZ(r8)
            return r5
        L97:
            r14 = r4
        L98:
            r12 = r4
            goto L6e
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C612540O0u.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
