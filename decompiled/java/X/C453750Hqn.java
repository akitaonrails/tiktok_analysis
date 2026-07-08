package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics;
import java.util.Map;

/* JADX INFO: renamed from: X.0Hqn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453750Hqn {
    public static final int LIZ(C869590Y9l c869590Y9l) {
        long jLJII = C0YNP.LJII(c869590Y9l.getConversationId());
        if (jLJII > 0) {
            IMContactApi.LIZ.getClass();
            IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(String.valueOf(jLJII), null, "im_local_db");
            if (iMUserLJIIL != null) {
                return iMUserLJIIL.getFollowStatus();
            }
            return -1;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(X.C869590Y9l r3) {
        /*
            int r1 = r3.getMsgType()
            r0 = 5
            r2 = 0
            if (r1 == r0) goto L5b
            r0 = 1805(0x70d, float:2.53E-42)
            if (r1 != r0) goto L4c
            java.lang.Class<com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate> r0 = com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate.class
            com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r0 = X.C0Z2Z.LIZ(r3, r0)
            com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate r0 = (com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate) r0
            if (r0 == 0) goto L2c
            com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r0 = r0.baseRequestComponent
            if (r0 == 0) goto L2c
            com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent r0 = r0.queryData
            if (r0 == 0) goto L2c
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.extras
            if (r1 == 0) goto L2c
            java.lang.String r0 = "a:typing_reco_id"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L6a
        L2c:
            java.lang.Class<com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate> r0 = com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate.class
            com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r0 = X.C0Z2Z.LIZ(r3, r0)
            com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate r0 = (com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate) r0
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r0 = r0.baseRequestComponent
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent r0 = r0.queryData
            if (r0 == 0) goto L4c
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.extras
            if (r1 == 0) goto L4c
            java.lang.String r0 = "a:sticker_id"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L4a:
            if (r0 != 0) goto L6a
        L4c:
            java.util.Map r1 = r3.getLocalExt()
            if (r1 == 0) goto L5a
            java.lang.String r0 = "sticker_id"
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
        L5a:
            return r2
        L5b:
            java.lang.Class<com.ss.android.ugc.aweme.im.message.content.GifContent> r0 = com.ss.android.ugc.aweme.im.message.content.GifContent.class
            com.ss.android.ugc.aweme.im.message.content.BaseContent r0 = com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt.getOrParseJsonContent(r3, r0)
            com.ss.android.ugc.aweme.im.message.content.GifContent r0 = (com.ss.android.ugc.aweme.im.message.content.GifContent) r0
            if (r0 == 0) goto L4c
            java.lang.String r0 = r0.getStickerId()
            goto L4a
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C453750Hqn.LIZIZ(X.0Y9l):java.lang.String");
    }

    public static final String LIZJ(C869590Y9l c869590Y9l) {
        StickerTemplate stickerTemplate;
        BaseRequestComponent baseRequestComponent;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        String str;
        Integer numLJIIJJI;
        int msgType = c869590Y9l.getMsgType();
        if (msgType != 5) {
            if (msgType != 1805 || (stickerTemplate = (StickerTemplate) C0Z2Z.LIZ(c869590Y9l, StickerTemplate.class)) == null || (baseRequestComponent = stickerTemplate.baseRequestComponent) == null || (queryDataComponent = baseRequestComponent.queryData) == null || (map = queryDataComponent.extras) == null || (str = map.get("a:sticker_type")) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null) {
                return null;
            }
            int iIntValue = numLJIIJJI.intValue();
            IIMEmojiAnalytics.LIZ.getClass();
            IIMEmojiAnalytics iIMEmojiAnalyticsLIZ = C453520HqQ.LIZ();
            if (iIMEmojiAnalyticsLIZ == null) {
                return null;
            }
            return iIMEmojiAnalyticsLIZ.LIZ(Integer.valueOf(iIntValue));
        }
        Map<String, String> ext = c869590Y9l.getExt();
        if (ext == null) {
            return null;
        }
        return ext.get("a:src");
    }
}
