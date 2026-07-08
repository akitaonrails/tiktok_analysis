package X;

import com.ss.android.ugc.aweme.creative.model.declaration.DeclarationPayload;

/* JADX INFO: renamed from: X.0n4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420730n4h {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.creative.model.declaration.DeclarationPayload LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5) {
        /*
            r4 = 0
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel     // Catch: java.lang.Throwable -> L34
            com.ss.android.ugc.aweme.creative.model.declaration.DeclarationModel r0 = r0.declarationModel     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L32
            java.util.List<com.ss.android.ugc.aweme.creative.model.declaration.DeclarationInfoStruct> r0 = r0.infoList     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L32
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L34
        Lf:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L30
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L34
            r0 = r2
            com.ss.android.ugc.aweme.creative.model.declaration.DeclarationInfoStruct r0 = (com.ss.android.ugc.aweme.creative.model.declaration.DeclarationInfoStruct) r0     // Catch: java.lang.Throwable -> L34
            int r1 = r0.option     // Catch: java.lang.Throwable -> L34
            com.ss.android.ugc.aweme.feed.model.DeclarationOption r0 = com.ss.android.ugc.aweme.feed.model.DeclarationOption.DATE_LOC     // Catch: java.lang.Throwable -> L34
            int r0 = r0.getServerValue()     // Catch: java.lang.Throwable -> L34
            if (r1 != r0) goto Lf
        L26:
            com.ss.android.ugc.aweme.creative.model.declaration.DeclarationInfoStruct r2 = (com.ss.android.ugc.aweme.creative.model.declaration.DeclarationInfoStruct) r2     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L32
            com.ss.android.ugc.aweme.creative.model.declaration.DeclarationPayload r1 = r2.payload     // Catch: java.lang.Throwable -> L34
        L2c:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L34
            goto L40
        L30:
            r2 = r4
            goto L26
        L32:
            r1 = r4
            goto L2c
        L34:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L40:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L47
            r4 = r1
        L47:
            com.ss.android.ugc.aweme.creative.model.declaration.DeclarationPayload r4 = (com.ss.android.ugc.aweme.creative.model.declaration.DeclarationPayload) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1420730n4h.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):com.ss.android.ugc.aweme.creative.model.declaration.DeclarationPayload");
    }

    public static final boolean LIZIZ(DeclarationPayload declarationPayload) {
        Long l = declarationPayload.createTime;
        if (l != null && l.longValue() > 0) {
            return true;
        }
        return false;
    }
}
