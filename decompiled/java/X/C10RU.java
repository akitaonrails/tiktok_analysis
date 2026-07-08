package X;

import com.ss.android.ugc.aweme.assem.NewUserGuideAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10RU, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10RU extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ NewUserGuideAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10RU(NewUserGuideAssem newUserGuideAssem) {
        super(0);
        this.LL = newUserGuideAssem;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.assem.NewUserGuideAssem r0 = r3.LL
            X.01GW r0 = r0.LL
            java.lang.Object r1 = r0.getValue()
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 != 0) goto Lf
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        Lf:
            X.10R5 r0 = X.C10R5.LJIIIIZZ
            X.10R5 r0 = X.C10RS.LIZ()
            boolean r0 = r0.LIZ()
            if (r0 != 0) goto L2e
            android.content.Intent r0 = r1.getIntent()
            r2 = 0
            if (r0 == 0) goto L2f
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r0 = "from_new_user_journey"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 == 0) goto L2f
        L2e:
            r2 = 1
        L2f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10RU.invoke():java.lang.Object");
    }
}
