package X;

/* JADX INFO: renamed from: X.02ph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C708702ph {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:41:0x006c A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:13:0x0019, B:15:0x001f, B:17:0x0027, B:22:0x0030, B:24:0x003c, B:28:0x0045, B:30:0x0049, B:31:0x004d, B:33:0x0053, B:36:0x0063, B:38:0x0067, B:41:0x006c, B:42:0x006e, B:43:0x0071), top: B:56:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata r15, java.util.Set r16, com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata r17, boolean r18, boolean r19) {
        /*
            r14 = 0
            if (r15 != 0) goto L4
            return r14
        L4:
            java.util.List<com.ss.android.ugc.aweme.profile.model.StoryLiteMetadata> r1 = r15.storyLiteMetadata
            r13 = 1
            if (r1 == 0) goto L8e
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L8e
            if (r19 != 0) goto L12
            return r14
        L12:
            r7 = 2
            java.util.Iterator r12 = r1.iterator()     // Catch: java.lang.Throwable -> L77
            r11 = 0
            r10 = 0
        L19:
            boolean r0 = r12.hasNext()     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L71
            java.lang.Object r9 = r12.next()     // Catch: java.lang.Throwable -> L7b
            com.ss.android.ugc.aweme.profile.model.StoryLiteMetadata r9 = (com.ss.android.ugc.aweme.profile.model.StoryLiteMetadata) r9     // Catch: java.lang.Throwable -> L7b
            if (r18 == 0) goto L2c
            int r0 = r9.postType     // Catch: java.lang.Throwable -> L7b
            if (r0 != r7) goto L2c
            goto L19
        L2c:
            r2 = r16
            if (r2 == 0) goto L3c
            long r0 = r9.itemID     // Catch: java.lang.Throwable -> L7b
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L7b
            boolean r0 = r2.contains(r0)     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L19
        L3c:
            boolean r0 = r9.viewed     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L6e
            r8 = 0
            r0 = r17
            if (r0 == 0) goto L6c
            java.util.List<com.ss.android.ugc.aweme.profile.model.StoryLiteMetadata> r0 = r0.storyLiteMetadata     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L6c
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L7b
        L4d:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L63
            java.lang.Object r5 = r6.next()     // Catch: java.lang.Throwable -> L7b
            r0 = r5
            com.ss.android.ugc.aweme.profile.model.StoryLiteMetadata r0 = (com.ss.android.ugc.aweme.profile.model.StoryLiteMetadata) r0     // Catch: java.lang.Throwable -> L7b
            long r3 = r0.itemID     // Catch: java.lang.Throwable -> L7b
            long r1 = r9.itemID     // Catch: java.lang.Throwable -> L7b
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L4d
            r8 = r5
        L63:
            com.ss.android.ugc.aweme.profile.model.StoryLiteMetadata r8 = (com.ss.android.ugc.aweme.profile.model.StoryLiteMetadata) r8     // Catch: java.lang.Throwable -> L7b
            if (r8 == 0) goto L6c
            boolean r0 = r8.viewed     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L6c
            goto L6e
        L6c:
            int r10 = r10 + 1
        L6e:
            int r11 = r11 + 1
            goto L19
        L71:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L7b
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L7b
            goto L87
        L77:
            r1 = move-exception
            r11 = 0
            r10 = 0
            goto L7c
        L7b:
            r1 = move-exception
        L7c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L87:
            if (r11 != 0) goto L8a
            return r14
        L8a:
            if (r10 != 0) goto L8d
            return r7
        L8d:
            return r13
        L8e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C708702ph.LIZ(com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata, java.util.Set, com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata, boolean, boolean):int");
    }
}
