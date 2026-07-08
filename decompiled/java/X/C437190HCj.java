package X;

import com.ss.android.ugc.ur.socialavatar.SocialAvatarResultResponse;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0HCj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437190HCj {
    public static final ConcurrentHashMap<String, C437200HCk> LIZ = new ConcurrentHashMap<>();
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ);

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.ur.socialavatar.SocialAvatarResultResponse LIZ(java.lang.String r6) {
        /*
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0HCk> r2 = X.C437190HCj.LIZ
            java.lang.Object r0 = r2.get(r6)
            X.0HCk r0 = (X.C437200HCk) r0
            r5 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r0.LIZ
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L11:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L1c
            return r5
        L1a:
            r1 = r5
            goto L11
        L1c:
            java.lang.Object r0 = r2.get(r6)
            X.0HCk r0 = (X.C437200HCk) r0
            if (r0 == 0) goto L4f
            com.ss.android.ugc.ur.socialavatar.SocialAvatarResultResponse r4 = r0.LIZIZ
            if (r4 == 0) goto L4f
            java.util.List<java.lang.String> r0 = r4.avatarUrls
            r3 = 1
            if (r0 == 0) goto L53
            java.util.Iterator r2 = r0.iterator()
        L31:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            if (r1 == 0) goto L31
            r0 = 593(0x251, float:8.31E-43)
            kotlin.jvm.internal.AFwS192S0000000_6 r0 = kotlin.jvm.internal.AFwS192S0000000_6.get$arr$(r0)
            boolean r0 = X.C1332130kln.LJI(r1, r0)
            if (r0 != r3) goto L31
        L4f:
            LIZIZ(r6, r5)
            return r5
        L53:
            java.util.List<java.lang.String> r0 = r4.animationUrls
            if (r0 == 0) goto L7a
            java.util.Iterator r2 = r0.iterator()
        L5b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            if (r1 == 0) goto L5b
            r0 = 593(0x251, float:8.31E-43)
            kotlin.jvm.internal.AFwS192S0000000_6 r0 = kotlin.jvm.internal.AFwS192S0000000_6.get$arr$(r0)
            boolean r0 = X.C1332130kln.LJI(r1, r0)
            if (r0 != r3) goto L5b
            goto L4f
        L7a:
            java.util.List<java.lang.String> r0 = r4.animationGifUrls
            if (r0 == 0) goto La1
            java.util.Iterator r2 = r0.iterator()
        L82:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            if (r1 == 0) goto L82
            r0 = 593(0x251, float:8.31E-43)
            kotlin.jvm.internal.AFwS192S0000000_6 r0 = kotlin.jvm.internal.AFwS192S0000000_6.get$arr$(r0)
            boolean r0 = X.C1332130kln.LJI(r1, r0)
            if (r0 != r3) goto L82
            goto L4f
        La1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C437190HCj.LIZ(java.lang.String):com.ss.android.ugc.ur.socialavatar.SocialAvatarResultResponse");
    }

    public static void LIZIZ(String str, SocialAvatarResultResponse socialAvatarResultResponse) {
        boolean z;
        ConcurrentHashMap<String, C437200HCk> concurrentHashMap = LIZ;
        if (socialAvatarResultResponse != null) {
            z = true;
        } else {
            z = false;
        }
        concurrentHashMap.put(str, new C437200HCk(z, socialAvatarResultResponse));
    }
}
