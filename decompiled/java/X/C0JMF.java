package X;

import com.bytedance.android.livesdkapi.host.IHostSubscription;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0JMF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JMF {
    public static final C0JMF LIZ = new C0JMF();

    public static String LIZLLL(String str) {
        String strLIZIZ;
        String strRj;
        if (str == null) {
            return "";
        }
        if (u.LJJIIJZLJL(str, "ttlive", false)) {
            strLIZIZ = str;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttlive_");
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C1124870fNV.LIZJ().getClass();
        String strLIZIZ2 = C1124870fNV.LIZIZ(strLIZIZ);
        IHostSubscription iHostSubscription = (IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class);
        if (iHostSubscription != null) {
            strRj = iHostSubscription.Rj(str);
        } else {
            strRj = null;
        }
        if (strLIZIZ2 == null) {
            if (strRj == null) {
                return "";
            }
            return strRj;
        }
        return strLIZIZ2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(com.bytedance.android.livesdk.chatroom.api.SubPinCard r4, java.lang.String r5) {
        /*
            com.bytedance.android.livesdk.chatroom.api.SubPinCard$Text r0 = r4.desc
            r3 = 0
            if (r0 == 0) goto L42
            int r0 = r0.type
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        Lb:
            r1 = 1
            if (r2 == 0) goto L3f
            int r0 = r2.intValue()
            if (r0 != r1) goto L26
            com.bytedance.android.livesdk.chatroom.api.SubPinCard$Text r0 = r4.desc
            if (r0 == 0) goto L25
            java.lang.String r1 = r0.content
        L1a:
            if (r1 == 0) goto L25
        L1c:
            int r0 = r1.length()
            if (r0 != 0) goto L44
            r1 = r5
            if (r5 != 0) goto L44
        L25:
            return r5
        L26:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L3f
            X.0fNV r1 = X.C1124870fNV.LIZJ()
            com.bytedance.android.livesdk.chatroom.api.SubPinCard$Text r0 = r4.desc
            if (r0 == 0) goto L37
            java.lang.String r3 = r0.content
        L37:
            r1.getClass()
            java.lang.String r1 = X.C1124870fNV.LIZIZ(r3)
            goto L1a
        L3f:
            java.lang.String r1 = ""
            goto L1c
        L42:
            r2 = r3
            goto Lb
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JMF.LIZIZ(com.bytedance.android.livesdk.chatroom.api.SubPinCard, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(com.bytedance.android.livesdk.chatroom.api.SubPinCard r4, java.lang.String r5) {
        /*
            com.bytedance.android.livesdk.chatroom.api.SubPinCard$Text r0 = r4.title
            r3 = 0
            if (r0 == 0) goto L42
            int r0 = r0.type
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        Lb:
            r1 = 1
            if (r2 == 0) goto L3f
            int r0 = r2.intValue()
            if (r0 != r1) goto L26
            com.bytedance.android.livesdk.chatroom.api.SubPinCard$Text r0 = r4.title
            if (r0 == 0) goto L25
            java.lang.String r1 = r0.content
        L1a:
            if (r1 == 0) goto L25
        L1c:
            int r0 = r1.length()
            if (r0 != 0) goto L44
            r1 = r5
            if (r5 != 0) goto L44
        L25:
            return r5
        L26:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L3f
            X.0fNV r1 = X.C1124870fNV.LIZJ()
            com.bytedance.android.livesdk.chatroom.api.SubPinCard$Text r0 = r4.title
            if (r0 == 0) goto L37
            java.lang.String r3 = r0.content
        L37:
            r1.getClass()
            java.lang.String r1 = X.C1124870fNV.LIZIZ(r3)
            goto L1a
        L3f:
            java.lang.String r1 = ""
            goto L1c
        L42:
            r2 = r3
            goto Lb
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JMF.LIZJ(com.bytedance.android.livesdk.chatroom.api.SubPinCard, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(X.C0JMF r14, java.lang.String r15, com.bytedance.android.livesdkapi.depend.model.live.Room r16) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JMF.LIZ(X.0JMF, java.lang.String, com.bytedance.android.livesdkapi.depend.model.live.Room):java.lang.String");
    }
}
