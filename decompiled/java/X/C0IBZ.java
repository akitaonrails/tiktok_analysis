package X;

/* JADX INFO: renamed from: X.0IBZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IBZ {
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C462350IBd LIZ(X.C869590Y9l r12) {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.im.message.template.card.ShareRepostCardTemplate> r0 = com.ss.android.ugc.aweme.im.message.template.card.ShareRepostCardTemplate.class
            com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r5 = X.C0Z2Z.LIZ(r12, r0)
            com.ss.android.ugc.aweme.im.message.template.card.ShareRepostCardTemplate r5 = (com.ss.android.ugc.aweme.im.message.template.card.ShareRepostCardTemplate) r5
            r8 = 0
            if (r5 == 0) goto La1
            com.ss.android.ugc.aweme.im.message.template.component.ShareRepostComponent r0 = r5.shareRepost
            if (r0 == 0) goto La1
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r0 = r0.repostText
            if (r0 == 0) goto La1
            java.lang.String r3 = r0.text
        L15:
            java.lang.String r9 = ""
            if (r3 != 0) goto L1a
            r3 = r9
        L1a:
            int r0 = r3.length()
            r6 = 0
            r4 = 1
            if (r0 == 0) goto L9f
            X.06QX r2 = com.ss.android.ugc.aweme.im.saas.host.api.feature.repost.RepostFeature.LIZ
            r2.getClass()
            X.0y0g<com.ss.android.ugc.aweme.im.saas.host.api.feature.repost.RepostFeature> r1 = X.C06QX.LIZJ
            X.1Bqa<java.lang.Object>[] r0 = X.C06QX.LIZIZ
            r0 = r0[r6]
            java.lang.Object r0 = r1.getValue(r2, r0)
            com.ss.android.ugc.aweme.im.saas.host.api.feature.repost.RepostFeature r0 = (com.ss.android.ugc.aweme.im.saas.host.api.feature.repost.RepostFeature) r0
            if (r0 == 0) goto L9f
            boolean r0 = r0.LIZ()
            if (r0 != r4) goto L9f
        L3b:
            X.0IBe r7 = new X.0IBe
            if (r5 == 0) goto L9c
            com.ss.android.ugc.aweme.im.message.template.component.ShareRepostComponent r0 = r5.shareRepost
            if (r0 == 0) goto L9c
            com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent r0 = r0.repostUserInfo
            if (r0 == 0) goto L9c
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r0 = r0.avatar
            if (r0 == 0) goto L9c
            java.util.List<java.lang.String> r0 = r0.urls
            if (r0 == 0) goto L9c
            com.ss.android.ugc.aweme.base.model.UrlModel r8 = X.C0I3J.LIZ(r0)
        L53:
            com.ss.android.ugc.aweme.im.message.template.component.ShareRepostComponent r0 = r5.shareRepost
            if (r0 == 0) goto L64
            com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent r0 = r0.repostUserInfo
            if (r0 == 0) goto L64
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r0 = r0.nickname
            if (r0 == 0) goto L64
            java.lang.String r0 = r0.text
            if (r0 == 0) goto L64
            r9 = r0
        L64:
            if (r4 == 0) goto L98
            r10 = 2131100625(0x7f0603d1, float:1.7813637E38)
        L69:
            if (r4 == 0) goto L95
            r11 = 71
        L6d:
            if (r4 == 0) goto L90
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L75:
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r12 = X.C814420VxA.LIZIZ(r0)
            r7.<init>(r8, r9, r10, r11, r12)
            if (r4 == 0) goto L8d
            X.0IBa r1 = new X.0IBa
            r1.<init>(r3)
        L87:
            X.0IBd r0 = new X.0IBd
            r0.<init>(r7, r1)
            return r0
        L8d:
            X.0IBc r1 = X.C462340IBc.LIZ
            goto L87
        L90:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L75
        L95:
            r11 = 101(0x65, float:1.42E-43)
            goto L6d
        L98:
            r10 = 2131100622(0x7f0603ce, float:1.781363E38)
            goto L69
        L9c:
            if (r5 == 0) goto L64
            goto L53
        L9f:
            r4 = 0
            goto L3b
        La1:
            r3 = r8
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IBZ.LIZ(X.0Y9l):X.0IBd");
    }
}
