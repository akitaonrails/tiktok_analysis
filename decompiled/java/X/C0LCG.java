package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LCG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C0LCG extends C2217421BqW implements Function1<InnerPushMessage, Boolean> {
    public C0LCG(C0LCF c0lcf) {
        super(1, c0lcf, C0LCF.class, "shouldBlockShow", "shouldBlockShow(Lcom/ss/android/ugc/aweme/innerpush/api/model/InnerPushMessage;)Z", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r8 = (com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage) r8
            java.lang.Object r2 = r7.receiver
            X.0LCF r2 = (X.C0LCF) r2
            r2.getClass()
            X.0LCM r6 = X.C0LCM.LIZIZ
            java.lang.String r5 = "TextImageInnerPush"
            java.lang.String r0 = "shouldBlockShow call"
            X.C201955140j.LIZLLL(r6, r5, r0)
            X.0LCN r0 = X.C0LCF.LJIILIIL(r8)
            r4 = 1
            if (r0 == 0) goto L50
            java.lang.String r1 = r0.LIZ
            if (r1 == 0) goto L50
            java.util.Map<java.lang.String, X.0LCH> r0 = r2.LL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r3 = r0.get(r1)
            X.0LCH r3 = (X.C0LCH) r3
            r2 = 0
            if (r3 == 0) goto L55
            X.0LaT r1 = r3.LIZ
        L2c:
            X.0LaT r0 = X.EnumC545550LaT.FAILED
            if (r1 == r0) goto L38
            if (r3 == 0) goto L34
            X.0LaT r2 = r3.LIZ
        L34:
            X.0LaT r0 = X.EnumC545550LaT.COMPLETE
            if (r2 != r0) goto L3d
        L38:
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r0 = r3.LIZIZ
            if (r0 == 0) goto L3d
            r4 = 0
        L3d:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "shouldBlockShow="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZLLL(r6, r5, r0)
        L50:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L55:
            r1 = r2
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LCG.invoke(java.lang.Object):java.lang.Object");
    }
}
