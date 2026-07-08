package X;

/* JADX INFO: renamed from: X.0Nzd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612110Nzd {
    public static final C612110Nzd LIZ = new C612110Nzd();

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r4 = 0
            if (r5 != 0) goto L4
            return r4
        L4:
            com.ss.android.ugc.aweme.music.model.Music r1 = r5.getMusic()
            r3 = 1
            if (r1 == 0) goto L62
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r1.getCoverThumb()
            if (r0 == 0) goto L62
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getCoverThumb()
            java.lang.String r0 = r1.getUri()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L41
            java.util.List r1 = r1.getUrlList()
            if (r1 == 0) goto L62
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L62
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2f
        L41:
            com.ss.android.ugc.aweme.music.model.Music r0 = r5.getMusic()
            if (r0 == 0) goto L60
            java.lang.String r0 = r0.getOwnerId()
        L4b:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L5f
            X.0C64 r2 = X.C0C64.LJIILLIIL()
            java.lang.String r1 = "remove_music_cover_black_circle"
            r0 = 31744(0x7c00, float:4.4483E-41)
            boolean r0 = r2.LJIIIZ(r0, r1, r3, r4)
            if (r0 == 0) goto L62
        L5f:
            return r3
        L60:
            r0 = 0
            goto L4b
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C612110Nzd.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static void LIZJ(String str, String str2, String str3, String str4, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("action_type", str2);
        if (str3 == null) {
            str3 = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", str4);
        if (str5 == null) {
            str5 = "";
        }
        c2344009Gk.LJIIIIZZ("music_id", str5);
        C20684815ws.LJIILLIIL("music_cover_capsule", c2344009Gk.LIZ);
    }
}
