package X;

import com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0njo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService$launchFeedback$2", f = "ScreenShotFeedbackService.kt", l = {}, m = "invokeSuspend")
public final class C1446220njo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ ScreenShotFeedbackService LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1446220njo(String str, String str2, ScreenShotFeedbackService screenShotFeedbackService, InterfaceC1364105Vn<? super C1446220njo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = screenShotFeedbackService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1446220njo c1446220njo = new C1446220njo(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1446220njo.LL = obj;
        return c1446220njo;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws org.json.JSONException {
        /*
            r8 = this;
            java.lang.String r7 = "ScreenShotFeedbackService@5b9a.launchFeedback$2"
            X.C1C7U.LIZ(r7)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r9)
            android.app.Activity r6 = com.ss.android.ugc.aweme.utils.ActivityStack.getValidTopActivity()
            boolean r0 = r6 instanceof X.C19EG
            r5 = 0
            if (r0 == 0) goto L96
            X.19EG r6 = (X.C19EG) r6
        L16:
            boolean r0 = X.C297720Bli.LIZ()
            if (r0 == 0) goto L87
            if (r6 == 0) goto L43
            X.0Q7z r3 = X.C1558360qeg.LJI(r6, r5)
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r0 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZJ(r3, r2)
            if (r1 == 0) goto L85
            java.lang.Class<com.ss.android.ugc.aweme.base.MainBusinessAbility> r0 = com.ss.android.ugc.aweme.base.MainBusinessAbility.class
            java.lang.Object r1 = r1.getAbility(r0)
        L36:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.base.MainBusinessAbility
            if (r0 != 0) goto L3b
            r1 = r5
        L3b:
            com.ss.android.ugc.aweme.base.MainBusinessAbility r1 = (com.ss.android.ugc.aweme.base.MainBusinessAbility) r1
        L3d:
            if (r1 == 0) goto L43
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r1.LJIIIIZZ()
        L43:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r3 = r8.LLILLJJLI
            java.lang.String r2 = r8.LLILLL
            java.lang.String r1 = "id"
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r4.put(r1, r0)
            if (r3 == 0) goto L5c
            java.lang.String r0 = "uri"
            r4.put(r0, r3)
        L5c:
            if (r2 == 0) goto L6f
            java.lang.String r0 = "url"
            r4.put(r0, r2)
            java.lang.String r0 = "preview"
            r4.put(r0, r2)
            java.lang.String r1 = "type"
            java.lang.String r0 = "image"
            r4.put(r1, r0)
        L6f:
            if (r6 == 0) goto L7f
            com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService r0 = r8.LLILZ
            r0.safelyDismissDialogIfNeed()
            r0.openFeedbackPage(r6, r4, r5)
        L79:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L7f:
            com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService r0 = r8.LLILZ
            r0.safelyDismissDialogIfNeed()
            goto L79
        L85:
            r1 = r5
            goto L36
        L87:
            if (r6 == 0) goto L43
            X.0Q7z r1 = X.C1558360qeg.LJI(r6, r5)
            java.lang.Class<com.ss.android.ugc.aweme.base.MainBusinessAbility> r0 = com.ss.android.ugc.aweme.base.MainBusinessAbility.class
            X.01wD r1 = X.C1558520qew.LIZ(r1, r0, r5)
            com.ss.android.ugc.aweme.base.MainBusinessAbility r1 = (com.ss.android.ugc.aweme.base.MainBusinessAbility) r1
            goto L3d
        L96:
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1446220njo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
