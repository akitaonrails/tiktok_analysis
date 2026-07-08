package X;

/* JADX INFO: renamed from: X.0mfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404950mfF {
    public static final int LIZ() {
        return LIZIZ(EnumC1434770nRL.COMPILE);
    }

    public static final int LIZJ() {
        return LIZIZ(EnumC1434770nRL.UPLOAD);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(X.EnumC1434770nRL r6) {
        /*
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.wavepublish.monitor.callback.PublishTimeoutConfigModel> r1 = com.ss.android.ugc.aweme.wavepublish.monitor.callback.PublishTimeoutConfigModel.class
            java.lang.String r0 = "studio_publish_timeout_config"
            r5 = 0
            java.lang.Object r0 = r2.LJIIIIZZ(r0, r1, r5)
            com.ss.android.ugc.aweme.wavepublish.monitor.callback.PublishTimeoutConfigModel r0 = (com.ss.android.ugc.aweme.wavepublish.monitor.callback.PublishTimeoutConfigModel) r0
            if (r0 == 0) goto L5b
            java.util.List<com.ss.android.ugc.aweme.wavepublish.monitor.callback.PublishNodeTimeout> r0 = r0.nodes
            if (r0 == 0) goto L5b
            java.util.Iterator r4 = r0.iterator()
        L19:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r3 = r4.next()
            r0 = r3
            com.ss.android.ugc.aweme.wavepublish.monitor.callback.PublishNodeTimeout r0 = (com.ss.android.ugc.aweme.wavepublish.monitor.callback.PublishNodeTimeout) r0
            java.lang.String r0 = r0.nodeName
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r0.toLowerCase(r2)
            java.lang.String r0 = r6.name()
            java.lang.String r0 = r0.toLowerCase(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L19
            r5 = r3
        L3d:
            com.ss.android.ugc.aweme.wavepublish.monitor.callback.PublishNodeTimeout r5 = (com.ss.android.ugc.aweme.wavepublish.monitor.callback.PublishNodeTimeout) r5
            if (r5 == 0) goto L5b
            int r3 = r5.timeoutSetting
        L43:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0nYH r0 = r0.getPublishService()
            X.0nVl r2 = r0.LJJLIIIJ()
            kotlin.jvm.internal.AwS161S0101000_22 r1 = new kotlin.jvm.internal.AwS161S0101000_22
            r0 = 7
            r1.<init>(r6, r3, r0)
            java.lang.String r0 = "timeoutSetting"
            r2.LIZLLL(r0, r1)
            return r3
        L5b:
            r3 = -1
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1404950mfF.LIZIZ(X.0nRL):int");
    }
}
