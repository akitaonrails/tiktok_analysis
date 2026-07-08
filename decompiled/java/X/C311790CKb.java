package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311790CKb extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C311790CKb(String str) {
        super(0);
        this.LL = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r5 = this;
            boolean r0 = X.C0CKZ.LJFF
            r4 = 0
            if (r0 != 0) goto L30
            X.0CKZ r0 = X.C0CKZ.LIZLLL
            r0.getClass()
            X.01GW r2 = X.C0CKZ.LJ
            java.lang.Object r1 = r2.getValue()
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r0 = r5.LL
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L30
            java.lang.Object r1 = r2.getValue()
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r0 = r5.LL
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L9f
            int r0 = r0.intValue()
        L2e:
            X.C0CKZ.LJI = r0
        L30:
            X.0CKZ r3 = X.C0CKZ.LIZLLL
            java.lang.String r1 = r5.LL
            r3.getClass()
            X.0CJC r0 = new X.0CJC
            r0.<init>(r3, r1)
            r3.LIZ(r0)
            java.lang.String r1 = "ab_settings_migrate_inject_ab_response"
            java.lang.String r0 = r5.LL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4c
            r3.LJII()
        L4c:
            java.lang.String r1 = "ab_common_request_save_config_data"
            java.lang.String r0 = r5.LL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L94
            java.lang.Boolean r0 = X.C1514430pVp.LIZLLL()
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "is_first_launch"
            if (r0 == 0) goto L97
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.LIZLLL(r0, r1)
            X.10Um r2 = X.C19254610Um.LIZIZ
            int r1 = r2.LJJIJIIJI()
            r0 = 3
            if (r1 == r0) goto L7d
            X.10R5 r0 = X.C10R5.LJIIIIZZ
            X.10R5 r0 = X.C10RS.LIZ()
            boolean r0 = r0.LIZ
            if (r0 == 0) goto L7e
        L7d:
            r4 = 1
        L7e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "is_nuj_finished"
            r3.LIZLLL(r1, r0)
            int r0 = r2.LJJIJIIJI()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_in_nuj_process"
            r3.LIZLLL(r1, r0)
        L94:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L97:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3.LIZLLL(r0, r1)
            goto L94
        L9f:
            r0 = 0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C311790CKb.invoke():java.lang.Object");
    }
}
