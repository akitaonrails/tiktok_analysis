package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.im.message.template.card.BusinessNativeCardTemplate;
import com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard;

/* JADX INFO: renamed from: X.0ZNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898770ZNr {
    public final C869590Y9l LIZ;

    public final long LIZ() {
        return this.LIZ.getMsgId();
    }

    public final int LIZIZ() {
        return this.LIZ.getMsgType();
    }

    public final IcAigcCommonMessageCard LIZJ() {
        String str;
        BusinessNativeCardTemplate businessNativeCardTemplate;
        if (((Boolean) C268490Aff.LIZ.getValue()).booleanValue()) {
            return LIZLLL();
        }
        Object localCache = this.LIZ.getLocalCache(4353);
        if (!(localCache instanceof BusinessNativeCardTemplate) || (businessNativeCardTemplate = (BusinessNativeCardTemplate) localCache) == null || (str = businessNativeCardTemplate.businessNativeInfo) == null) {
            try {
                BusinessNativeCardTemplate businessNativeCardTemplate2 = (BusinessNativeCardTemplate) C0Z2Z.LIZ(this.LIZ, BusinessNativeCardTemplate.class);
                str = businessNativeCardTemplate2 != null ? businessNativeCardTemplate2.businessNativeInfo : null;
                this.LIZ.putLocalCache(4353, businessNativeCardTemplate2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return (IcAigcCommonMessageCard) new Gson().LJII(str, IcAigcCommonMessageCard.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045 A[PHI: r2
      0x0045: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:19:0x0043, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard LIZLLL() {
        /*
            r6 = this;
            X.0Y9l r0 = r6.LIZ
            r3 = 4354(0x1102, float:6.101E-42)
            java.lang.Object r1 = r0.getLocalCache(r3)
            boolean r0 = r1 instanceof com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard
            r5 = 0
            if (r0 == 0) goto L12
            com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard r1 = (com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard) r1
            if (r1 == 0) goto L12
            return r1
        L12:
            X.0Y9l r0 = r6.LIZ
            r4 = 4353(0x1101, float:6.1E-42)
            java.lang.Object r1 = r0.getLocalCache(r4)
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.message.template.card.BusinessNativeCardTemplate
            if (r0 == 0) goto L26
            com.ss.android.ugc.aweme.im.message.template.card.BusinessNativeCardTemplate r1 = (com.ss.android.ugc.aweme.im.message.template.card.BusinessNativeCardTemplate) r1
            if (r1 == 0) goto L26
            java.lang.String r2 = r1.businessNativeInfo
            if (r2 != 0) goto L45
        L26:
            X.0Y9l r0 = r6.LIZ
            int r1 = r0.getMsgType()
            r0 = 2001(0x7d1, float:2.804E-42)
            if (r1 != r0) goto L66
            X.0Y9l r1 = r6.LIZ
            java.lang.Class<com.ss.android.ugc.aweme.im.message.template.card.BusinessNativeCardTemplate> r0 = com.ss.android.ugc.aweme.im.message.template.card.BusinessNativeCardTemplate.class
            com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r1 = X.C0Z2Z.LIZ(r1, r0)
            com.ss.android.ugc.aweme.im.message.template.card.BusinessNativeCardTemplate r1 = (com.ss.android.ugc.aweme.im.message.template.card.BusinessNativeCardTemplate) r1
            if (r1 == 0) goto L4c
            java.lang.String r2 = r1.businessNativeInfo
        L3e:
            X.0Y9l r0 = r6.LIZ
            r0.putLocalCache(r4, r1)
            if (r2 == 0) goto L66
        L45:
            int r0 = r2.length()
            if (r0 == 0) goto L66
            goto L4e
        L4c:
            r2 = r5
            goto L3e
        L4e:
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L61
            r1.<init>()     // Catch: java.lang.Exception -> L61
            java.lang.Class<com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard> r0 = com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard.class
            java.lang.Object r1 = r1.LJII(r2, r0)     // Catch: java.lang.Exception -> L61
            com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard r1 = (com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard) r1     // Catch: java.lang.Exception -> L61
            X.0Y9l r0 = r6.LIZ     // Catch: java.lang.Exception -> L61
            r0.putLocalCache(r3, r1)     // Catch: java.lang.Exception -> L61
            return r1
        L61:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r5
        L66:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C898770ZNr.LIZLLL():com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard");
    }

    public final String LJ() {
        return this.LIZ.getUuid();
    }

    public C898770ZNr(C869590Y9l c869590Y9l) {
        this.LIZ = c869590Y9l;
    }
}
