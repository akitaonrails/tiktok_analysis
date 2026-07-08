package X;

/* JADX INFO: renamed from: X.13kr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20100713kr {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r5 = r2.authority;
        r4 = r2.packageName;
        r3 = r9.LIZ.LIZIZ(r8, r4);
        r2 = new java.util.ArrayList();
        r1 = r3.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (r7 >= r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        r2.add(r3[r7].toByteArray());
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        return new X.C20138813r0(r10, new X.C19968913Bf(r5, r4, "emojicompat-emoji-font", java.util.Collections.singletonList(r2)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C20138813r0 LIZ(android.content.Context r10) {
        /*
            X.13ku r9 = new X.13ku
            r9.<init>()
            android.content.pm.PackageManager r8 = r10.getPackageManager()
            java.lang.String r0 = "Package manager required to locate emoji font provider"
            X.C08IF.LIZLLL(r8, r0)
            X.13ks r2 = r9.LIZ
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "androidx.content.action.LOAD_EMOJI_FONT"
            r1.<init>(r0)
            java.util.List r0 = r2.LIZJ(r8, r1)
            java.util.Iterator r3 = r0.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            r6 = 0
            r7 = 0
            if (r0 == 0) goto L78
            java.lang.Object r1 = r3.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            X.13ks r0 = r9.LIZ
            android.content.pm.ProviderInfo r2 = r0.LIZ(r1)
            if (r2 == 0) goto L1f
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            if (r0 == 0) goto L1f
            int r0 = r0.flags
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L1f
            java.lang.String r5 = r2.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r4 = r2.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            X.13ks r0 = r9.LIZ     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            android.content.pm.Signature[] r3 = r0.LIZIZ(r8, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            r2.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            int r1 = r3.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
        L50:
            if (r7 >= r1) goto L5e
            r0 = r3[r7]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            byte[] r0 = r0.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            r2.add(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            int r7 = r7 + 1
            goto L50
        L5e:
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            X.13Bf r1 = new X.13Bf     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r0 = "emojicompat-emoji-font"
            r1.<init>(r5, r4, r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            X.13r0 r6 = new X.13r0
            r6.<init>(r10, r1)
            return r6
        L6f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r0, r1)
        L78:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20100713kr.LIZ(android.content.Context):X.13r0");
    }
}
