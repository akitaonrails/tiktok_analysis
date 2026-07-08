package X;

/* JADX INFO: renamed from: X.0YxT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891050YxT {
    public static final EnumC889640YvC LIZ = EnumC889640YvC.SettingPersistentExtFieldID_AlertTone;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super java.util.List<java.lang.String>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C2198008jK
            if (r0 == 0) goto L68
            r5 = r8
            X.08jK r5 = (X.C2198008jK) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 1
            if (r0 == 0) goto L35
            if (r0 != r4) goto L6e
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.im.push.api.alerttone.model.IMAudioResourceResponse r1 = (com.ss.android.ugc.aweme.im.push.api.alerttone.model.IMAudioResourceResponse) r1
            if (r1 == 0) goto L76
            java.util.List<com.ss.android.ugc.aweme.im.push.api.alerttone.model.IMAudioResourceResponseEntry> r0 = r1.results
            if (r0 == 0) goto L76
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.im.push.api.alerttone.model.IMAudioResourceResponseEntry r0 = (com.ss.android.ugc.aweme.im.push.api.alerttone.model.IMAudioResourceResponseEntry) r0
            if (r0 == 0) goto L76
            java.util.List<java.lang.String> r0 = r0.resourceUrls
            return r0
        L35:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.im.push.api.alerttone.model.IMAudioResourceBodyEntry[] r3 = new com.ss.android.ugc.aweme.im.push.api.alerttone.model.IMAudioResourceBodyEntry[r4]
            com.ss.android.ugc.aweme.im.push.api.alerttone.model.IMAudioResourceBodyEntry r2 = new com.ss.android.ugc.aweme.im.push.api.alerttone.model.IMAudioResourceBodyEntry
            r0 = 2
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            X.0YxY r0 = X.EnumC891100YxY.IN_APP_TONE
            java.lang.String r0 = r0.getAlertId()
            r2.<init>(r1, r0)
            r0 = 0
            r3[r0] = r2
            java.util.List r0 = X.C1697810uHb.LJIILJJIL(r3)
            com.ss.android.ugc.aweme.im.push.api.alerttone.model.IMAudioResourceBody r1 = new com.ss.android.ugc.aweme.im.push.api.alerttone.model.IMAudioResourceBody
            r1.<init>(r0)
            X.0YxU r0 = com.ss.android.ugc.aweme.im.push.impl.alerttone.net.IMAlertToneNetAPI.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.push.impl.alerttone.net.IMAlertToneNetAPI r0 = X.C891060YxU.LIZIZ
            if (r0 == 0) goto L76
            r5.LLILLL = r4
            java.lang.Object r1 = r0.getAudioResourceUrl(r1, r5)
            if (r1 != r6) goto L22
            return r6
        L68:
            X.08jK r5 = new X.08jK
            r5.<init>(r7, r8)
            goto L12
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L76:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C891050YxT.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.EnumC2198508jP r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.push.api.alerttone.model.GetAlertToneResponse> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C2197708jH
            if (r0 == 0) goto L9f
            r5 = r9
            X.08jH r5 = (X.C2197708jH) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9f
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r3 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 1
            if (r0 == 0) goto L52
            if (r0 != r4) goto Lae
            X.C155000ia.LIZIZ(r3)
        L22:
            com.ss.android.ugc.aweme.im.push.api.alerttone.model.GetAlertToneResponse r3 = (com.ss.android.ugc.aweme.im.push.api.alerttone.model.GetAlertToneResponse) r3
            java.util.List<com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem> r0 = r3.alertToneInfo
            if (r0 == 0) goto L2f
            int r0 = r0.size()
            X.C2286608xc.LJ(r0)
        L2f:
            java.util.List<com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem> r0 = r3.alertToneInfo
            if (r0 == 0) goto Lad
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L3c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem r0 = (com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem) r0
            java.util.List<com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem> r0 = r0.alertToneValueItems
            if (r0 != 0) goto L4e
            X.13BV r0 = X.C13BV.INSTANCE
        L4e:
            X.C19719612Di.LJJI(r0, r2)
            goto L3c
        L52:
            X.C155000ia.LIZIZ(r3)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[AlertTone] fetchFromNetwork: scene="
            r1.append(r0)
            r3 = 0
            if (r8 == 0) goto L9d
            int r0 = r8.getValue()
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
        L69:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            X.0YxU r1 = com.ss.android.ugc.aweme.im.push.impl.alerttone.net.IMAlertToneNetAPI.LIZ
            if (r8 == 0) goto L9b
            int r0 = r8.getValue()
            java.lang.Integer r2 = X.C2286608xc.LJ(r0)
        L7b:
            r5.LLILLL = r4
            r1.getClass()
            com.ss.android.ugc.aweme.im.push.impl.alerttone.net.IMAlertToneNetAPI r1 = X.C891060YxU.LIZIZ
            if (r1 == 0) goto Lb6
            X.0YxS r0 = com.ss.android.ugc.aweme.im.push.impl.alerttone.impl.MessageAlertToneService.LJ
            r0.getClass()
            boolean r0 = X.C891040YxS.LIZ()
            if (r0 == 0) goto L96
            java.lang.Object r3 = r1.getAlertToneConfig(r2, r3, r5)
        L93:
            if (r3 != r6) goto L22
            return r6
        L96:
            java.lang.Object r3 = r1.getBusinessAlert(r5)
            goto L93
        L9b:
            r2 = r3
            goto L7b
        L9d:
            r0 = r3
            goto L69
        L9f:
            X.08jH r5 = new X.08jH
            r5.<init>(r7, r9)
            goto L12
        La6:
            int r0 = r2.size()
            X.C2286608xc.LJ(r0)
        Lad:
            return r3
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "IMAlertToneNetAPI not available"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C891050YxT.LIZ(X.08jP, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r7, X.InterfaceC1364105Vn<? super java.lang.String> r8) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C891050YxT.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r6, X.InterfaceC1364105Vn<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C2197908jJ
            if (r0 == 0) goto L41
            r4 = r7
            X.08jJ r4 = (X.C2197908jJ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 != r2) goto L49
            X.C155000ia.LIZIZ(r1)
        L22:
            X.0YvF r1 = (X.C889670YvF) r1
            if (r1 == 0) goto L47
            X.0Yxb r0 = r1.persistent_ext
            if (r0 == 0) goto L47
            X.0Yxe r0 = r0.alert_tone
            if (r0 == 0) goto L47
            java.lang.Integer r0 = r0.alert_tone_value
            return r0
        L31:
            X.C155000ia.LIZIZ(r1)
            X.0Yv7 r1 = X.C889590Yv7.LIZ
            X.0YvC r0 = X.C891050YxT.LIZ
            r4.LLILLL = r2
            java.lang.Object r1 = r1.LIZIZ(r0, r6, r4)
            if (r1 != r3) goto L22
            return r3
        L41:
            X.08jJ r4 = new X.08jJ
            r4.<init>(r5, r7)
            goto L12
        L47:
            r0 = 0
            return r0
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C891050YxT.LIZLLL(java.lang.String, X.05Vn):java.lang.Object");
    }
}
