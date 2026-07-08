package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Lva, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C558640Lva extends C2217421BqW implements Function1<C570700MZw, Boolean> {
    public static final C558640Lva LL = new C558640Lva();

    public C558640Lva() {
        super(1, C570700MZw.class, "isAsyncTemplateDraftPending", "isAsyncTemplateDraftPending()Z", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(X.C570700MZw r4) {
        /*
            r3 = this;
            X.0MZw r4 = (X.C570700MZw) r4
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r0 = r4.LIZ
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.LIZ
            if (r0 == 0) goto L3c
            java.lang.Integer r0 = r0.asyncStatus
            if (r0 == 0) goto L3c
            int r2 = r0.intValue()
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r0 = r4.LIZ
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.LIZ
            if (r0 == 0) goto L3c
            java.lang.String r1 = r0.asyncSource
            if (r1 == 0) goto L3c
            com.ss.android.ugc.aweme.aigc.asynctask.Source r0 = com.ss.android.ugc.aweme.aigc.asynctask.Source.TEMPLATE
            java.lang.String r0 = r0.getSource()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3c
            X.0LaT r0 = X.EnumC545550LaT.PROCESSING
            int r0 = r0.ordinal()
            if (r2 == r0) goto L36
            X.0LaT r0 = X.EnumC545550LaT.FAILED
            int r0 = r0.ordinal()
            if (r2 != r0) goto L3c
        L36:
            r0 = 1
        L37:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L3c:
            r0 = 0
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C558640Lva.invoke(java.lang.Object):java.lang.Object");
    }
}
