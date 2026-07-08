package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PbI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.core.communicate.delegate.LoadDelegate$loadPrePare$2", f = "LoadDelegate.kt", l = {}, m = "invokeSuspend")
public final class C647980PbI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C647810Pb1 LL;
    public final /* synthetic */ C259800zU<DynamicPatch> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C647980PbI(C647810Pb1 c647810Pb1, C259800zU<DynamicPatch> c259800zU, InterfaceC1364105Vn<? super C647980PbI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c647810Pb1;
        this.LLILLJJLI = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C647980PbI(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "LoadDelegate@f89b.loadPrePare$2"
            X.C1C7U.LIZ(r5)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r7)
            X.0Pb1 r2 = r6.LL
            X.0PbJ r1 = X.C647990PbJ.LIZ
            X.00zU<com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch> r0 = r6.LLILLJJLI
            T r0 = r0.element
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = (com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch) r0
            r1.getClass()
            int r0 = X.C647990PbJ.LIZ(r0)
            r2.LLILZIL = r0
            X.0Pb1 r3 = r6.LL
            X.00zU<com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch> r0 = r6.LLILLJJLI
            T r1 = r0.element
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r1 = (com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch) r1
            if (r1 == 0) goto L81
            java.lang.String r0 = r1.schema
            if (r0 == 0) goto L81
            int r0 = r0.length()
            if (r0 == 0) goto L81
            java.lang.String r0 = r1.getRawData()
            if (r0 == 0) goto L81
            int r0 = r0.length()
            if (r0 == 0) goto L81
            java.lang.String r0 = r1.schema
            android.net.Uri r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.String r0 = "channel"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)
            java.lang.String r0 = "bundle"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)
            if (r1 == 0) goto L81
            if (r0 == 0) goto L81
            X.0qX7 r0 = X.C1553670qX7.LIZ
            r0.getClass()
            java.lang.String r0 = X.C1553670qX7.LIZ()
            java.lang.Long r0 = X.C1552050qUV.LJIIL(r0, r1)
            if (r0 == 0) goto L81
            long r0 = r0.longValue()
        L67:
            r3.LLILZLL = r0
            X.0Pb1 r4 = r6.LL
            X.0Pb3 r0 = r4.LL
            X.0Pbr r3 = r0.LIZIZ
            Y.ARunnableS79S0200000_10 r2 = new Y.ARunnableS79S0200000_10
            X.00zU<com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch> r1 = r6.LLILLJJLI
            r0 = 71
            r2.<init>(r4, r1, r0)
            X.C0PPS.LIZ(r3, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L81:
            r0 = 0
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C647980PbI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
