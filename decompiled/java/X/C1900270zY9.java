package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0zY9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900270zY9 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(java.lang.String r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r6 = 0
            if (r0 == 0) goto L8
            return r6
        L8:
            r7.getClass()
            int r0 = r7.hashCode()
            r5 = 5
            r4 = 4
            r3 = 3
            r2 = 2
            r1 = 1
            switch(r0) {
                case -677145915: goto L18;
                case -186119313: goto L23;
                case 3322092: goto L2e;
                case 3599307: goto L37;
                case 104263205: goto L40;
                case 112202875: goto L49;
                case 1402633315: goto L52;
                case 1948294547: goto L5b;
                default: goto L17;
            }
        L17:
            return r6
        L18:
            java.lang.String r0 = "forward"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L17
            r0 = 19
            return r0
        L23:
            java.lang.String r0 = "bodydancelist"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L17
            r0 = 8
            return r0
        L2e:
            java.lang.String r0 = "live"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L17
            return r5
        L37:
            java.lang.String r0 = "user"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L17
            return r4
        L40:
            java.lang.String r0 = "music"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L17
            return r3
        L49:
            java.lang.String r0 = "video"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L17
            return r1
        L52:
            java.lang.String r0 = "challenge"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L17
            return r2
        L5b:
            java.lang.String r0 = "sticker_detail"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L17
            r0 = 17
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1900270zY9.LIZIZ(java.lang.String):int");
    }

    public static String LIZ(int i, String str) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 8) {
                                if (i != 9) {
                                    if (i != 17) {
                                        if (i != 23) {
                                            if (i != 31) {
                                                return "text";
                                            }
                                            return "live";
                                        }
                                        return "challenge";
                                    }
                                    return "sticker_detail";
                                }
                                return "shoot";
                            }
                            return "bodydance_detail";
                        }
                        return "live";
                    }
                    if (TextUtils.equals(C0XQ7.LJFF().getCurUserId(), str)) {
                        return "personal_homepage";
                    }
                    return "others_homepage";
                }
                return "music";
            }
            return "challenge";
        }
        return "video";
    }
}
