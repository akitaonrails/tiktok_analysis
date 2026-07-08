package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05IW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.widget.core.viewmodel.SearchWidgetManager$requestWidgetData$2", f = "SearchWidgetManager.kt", l = {}, m = "invokeSuspend")
public final class C05IW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05IW(InterfaceC1364105Vn<? super C05IW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05IW(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Type inference failed for: r0v16, types: [T] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "SearchWidgetManager@9dee.requestWidgetData$2"
            X.C1C7U.LIZ(r5)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r7)
            com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService r0 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJI()
            boolean r0 = r0.LJJIIZI()
            r4 = 3
            r2 = 0
            if (r0 == 0) goto L2f
            X.0QNM r0 = X.C0QNM.LIZ
            r0.getClass()
            X.05IY<com.ss.android.ugc.aweme.search.widget.core.model.SearchWidgetModel> r0 = X.C0QNM.LIZJ
            r0.getClass()
            r0.LIZ = r4
            r0.LIZIZ = r2
            X.05IY<com.ss.android.ugc.aweme.search.widget.core.model.SearchWidgetModel> r0 = X.C0QNM.LIZJ
            r0.LIZ = r4
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L2f:
            X.01GW r0 = X.C05IX.LIZ
            java.lang.Object r3 = r0.getValue()
            com.ss.android.ugc.aweme.search.widget.core.repo.ISearchWidgetApi r3 = (com.ss.android.ugc.aweme.search.widget.core.repo.ISearchWidgetApi) r3
            com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService r0 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJI()
            boolean r1 = r0.LJJIIZI()
            r0 = 1
            if (r1 == 0) goto L99
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L46:
            java.lang.String r0 = "widget_blank_page"
            X.0X9S r0 = r3.getSearchWidget(r0, r1)
            X.0X52 r3 = r0.execute()
            boolean r0 = r3.LIZJ()
            if (r0 == 0) goto L86
            T r1 = r3.LIZIZ
            com.ss.android.ugc.aweme.search.widget.core.model.SearchWidgetModel r1 = (com.ss.android.ugc.aweme.search.widget.core.model.SearchWidgetModel) r1
            int r0 = r1.status_code
            if (r0 != 0) goto L86
            java.lang.String r0 = r1.getFirstGuessWord()
            int r0 = r0.length()
            if (r0 <= 0) goto L86
            X.0QNM r0 = X.C0QNM.LIZ
            r0.getClass()
            X.05IY<com.ss.android.ugc.aweme.search.widget.core.model.SearchWidgetModel> r2 = X.C0QNM.LIZJ
            T r0 = r3.LIZIZ
            r2.getClass()
            r1 = 2
            if (r0 == 0) goto L78
            r4 = 2
        L78:
            r2.LIZ = r4
            r2.LIZIZ = r0
            X.05IY<com.ss.android.ugc.aweme.search.widget.core.model.SearchWidgetModel> r0 = X.C0QNM.LIZJ
            r0.LIZ = r1
        L80:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L86:
            X.0QNM r0 = X.C0QNM.LIZ
            r0.getClass()
            X.05IY<com.ss.android.ugc.aweme.search.widget.core.model.SearchWidgetModel> r0 = X.C0QNM.LIZJ
            r0.getClass()
            r0.LIZ = r4
            r0.LIZIZ = r2
            X.05IY<com.ss.android.ugc.aweme.search.widget.core.model.SearchWidgetModel> r0 = X.C0QNM.LIZJ
            r0.LIZ = r4
            goto L80
        L99:
            r1 = r2
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05IW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05IW(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
