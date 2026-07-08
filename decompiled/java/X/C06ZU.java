package X;

import com.ss.android.ugc.aweme.im.common.model.SendingBanMessage;
import okio.ByteString;

/* JADX INFO: renamed from: X.06ZU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06ZU {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r1 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(X.C869590Y9l r6) {
        /*
            X.06hF r1 = X.C1675506hF.LIZ
            java.util.Map r0 = r6.getLocalExt()
            r1.getClass()
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage r2 = X.C1675506hF.LIZ(r0)
            r5 = 1
            if (r2 == 0) goto L49
            int r1 = r2.getStatusCode()
            r0 = 7179(0x1c0b, float:1.006E-41)
            if (r1 == r0) goto L45
            int r1 = r2.getStatusCode()
            r0 = 7196(0x1c1c, float:1.0084E-41)
            if (r1 != r0) goto L49
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage$StatusMsg r0 = r2.getStatusMsg()
            if (r0 == 0) goto L49
            com.ss.android.ugc.aweme.im.message.content.SystemContent r0 = r0.getMsgContent()
            if (r0 == 0) goto L49
            com.ss.android.ugc.aweme.im.message.content.SystemContent$Key[] r4 = r0.getTemplate()
            if (r4 == 0) goto L49
            int r3 = r4.length
            r2 = 0
        L34:
            if (r2 >= r3) goto L49
            r1 = r4[r2]
            X.06hF r0 = X.C1675506hF.LIZ
            r0.getClass()
            boolean r0 = X.C1675506hF.LIZJ(r1)
            if (r0 == 0) goto L46
            if (r1 == 0) goto L49
        L45:
            return r5
        L46:
            int r2 = r2 + 1
            goto L34
        L49:
            java.util.Map r1 = r6.getExt()
            java.lang.String r0 = "a:moderation_result"
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L5e
            java.lang.String r0 = "3"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5e
            return r5
        L5e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06ZU.LIZ(X.0Y9l):boolean");
    }

    public static SendingBanMessage LIZJ(C869590Y9l c869590Y9l) {
        String strBase64;
        String uuid = c869590Y9l.getUuid();
        String strValueOf = String.valueOf(c869590Y9l.getMsgId());
        String strValueOf2 = String.valueOf(c869590Y9l.getMsgType());
        Long lValueOf = Long.valueOf(c869590Y9l.getSender());
        String content = c869590Y9l.getContent();
        ByteString contentPB = c869590Y9l.getContentPB();
        if (contentPB != null) {
            strBase64 = contentPB.base64();
        } else {
            strBase64 = null;
        }
        return new SendingBanMessage(uuid, strValueOf, strValueOf2, lValueOf, content, String.valueOf(strBase64), Boolean.valueOf(LIZ(c869590Y9l)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e A[Catch: all -> 0x013f, Exception -> 0x0142, TryCatch #9 {Exception -> 0x0142, all -> 0x013f, blocks: (B:63:0x011a, B:65:0x011e), top: B:114:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C869590Y9l r26, java.lang.String r27, java.util.List<? extends X.C869590Y9l> r28, com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage r29, java.lang.String r30, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> r31, X.InterfaceC1364105Vn<? super kotlin.Unit> r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06ZU.LIZIZ(X.0Y9l, java.lang.String, java.util.List, com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage, java.lang.String, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }
}
