package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZEA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.analytics.ActivityStatusDelegate$Companion$mobActivityStatusShow$1", f = "ActivityStatusDelegate.kt", l = {187}, m = "invokeSuspend")
public final class C0ZEA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0ZE7 LLILLJJLI;
    public final /* synthetic */ InterfaceC1493105sv LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZEA(C0ZE7 c0ze7, InterfaceC1493105sv interfaceC1493105sv, Map<String, String> map, InterfaceC1364105Vn<? super C0ZEA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ze7;
        this.LLILLL = interfaceC1493105sv;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZEA(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "ActivityStatusDelegate$Companion@6c9c.mobActivityStatusShow$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LL
            r2 = 1
            if (r0 == 0) goto L5a
            if (r0 != r2) goto L77
            X.C155000ia.LIZIZ(r6)
        L13:
            com.ss.android.ugc.aweme.im.common.model.BaseContact r6 = (com.ss.android.ugc.aweme.im.common.model.BaseContact) r6
        L15:
            X.0ZE7 r0 = r5.LLILLJJLI
            java.lang.String r3 = r0.LIZJ
            if (r3 == 0) goto L4b
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.LLILZ
            X.06QG r0 = com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature.LIZ
            com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature r0 = r0.LIZ()
            if (r0 == 0) goto L31
            java.lang.Integer r0 = r0.LJIIIIZZ(r6)
            if (r0 == 0) goto L31
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L33
        L31:
            java.lang.String r1 = "none"
        L33:
            java.lang.String r0 = "follow_status"
            r2.put(r0, r1)
            java.lang.Integer r0 = X.C1918307fJ.LIZIZ(r3)
            if (r0 == 0) goto L44
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L46
        L44:
            java.lang.String r1 = "0"
        L46:
            java.lang.String r0 = "to_user_setting"
            r2.put(r0, r1)
        L4b:
            X.05sv r2 = r5.LLILLL
            java.lang.String r1 = "activity_status_show"
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.LLILZ
            r2.sendEvent(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L5a:
            X.C155000ia.LIZIZ(r6)
            X.06QG r0 = com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature.LIZ
            com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature r1 = r0.LIZ()
            if (r1 == 0) goto L75
            X.0ZE7 r0 = r5.LLILLJJLI
            java.lang.String r0 = r0.LIZJ
            r5.LL = r2
            java.lang.Object r6 = r1.LJIIJJI(r0, r5)
            if (r6 != r3) goto L13
            X.C1C7U.LIZIZ(r4)
            return r3
        L75:
            r6 = 0
            goto L15
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZEA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
