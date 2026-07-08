package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05tb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMBotSharePostAnalysis$reportEnterDmSharePost$1", f = "IMBotSharePostAnalysis.kt", l = {}, m = "invokeSuspend")
public final class C1497305tb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1497305tb(String str, InterfaceC1364105Vn<? super C1497305tb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1497305tb(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "IMBotSharePostAnalysis@7954.reportEnterDmSharePost$1"
            X.C1C7U.LIZ(r8)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r10)
            java.lang.String r0 = r9.LL
            long r0 = X.C0YNP.LJII(r0)
            java.lang.Long r7 = X.C2286608xc.LJFF(r0)
            long r3 = r7.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r6 = 1
            r5 = 0
            if (r0 > 0) goto L25
            r0 = 0
            r4 = 0
            if (r0 == 0) goto L29
        L25:
            java.lang.String r4 = r7.toString()
        L29:
            X.054G r0 = X.C05O6.LIZ
            r0 = 5
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "chat"
            r2.<init>(r1, r0)
            r3[r5] = r2
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "attachment_button"
            r2.<init>(r1, r0)
            r3[r6] = r2
            java.lang.String r2 = r9.LL
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "conversation_id"
            r1.<init>(r0, r2)
            r0 = 2
            r3[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "to_user_id"
            r1.<init>(r0, r4)
            r0 = 3
            r3[r0] = r1
            java.lang.String r1 = r9.LL
            X.0YSQ r0 = X.InterfaceC876950Yaj.LIZ
            X.0Yaj r0 = X.C0YSQ.LIZIZ(r0)
            X.0Y8T r1 = r0.LIZ(r1)
            if (r1 == 0) goto L8f
            X.05vR r0 = X.C1508705vR.LL
            r0.getClass()
            java.lang.String r2 = X.C1508705vR.LIZIZ(r1)
        L71:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "chat_type"
            r1.<init>(r0, r2)
            r0 = 4
            r3[r0] = r1
            java.util.Map r1 = X.C2097608Jq.LJIIIIZZ(r3)
            X.0I0B r0 = X.C0I0B.LJFF
            r0.LIZIZ()
            java.lang.String r0 = "enter_dm_share_post"
            X.C20684815ws.LJIILLIIL(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L8f:
            java.lang.String r2 = "aiasst"
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1497305tb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
