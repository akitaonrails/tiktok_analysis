package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.15WP, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15WP {
    public static final C15WP LIZ = new C15WP();

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.live.base.model.user.User LJ(com.ss.android.ugc.aweme.profile.model.User r7) {
        /*
            if (r7 != 0) goto L4
            r0 = 0
            return r0
        L4:
            X.15WP r0 = X.C15WP.LIZ
            r0.getClass()
            java.lang.String r1 = "getUid"
            java.lang.String r0 = "uid"
            java.lang.String r3 = LIZJ(r7, r1, r0)
            java.lang.String r1 = "getSecUid"
            java.lang.String r0 = "secUid"
            java.lang.String r2 = LIZJ(r7, r1, r0)
            boolean r0 = kotlin.text.a0.LJJJIL(r2)
            if (r0 == 0) goto L21
            java.lang.String r2 = "0"
        L21:
            com.bytedance.android.live.base.model.user.User r4 = new com.bytedance.android.live.base.model.user.User
            r4.<init>()
            java.lang.String r1 = "getNickname"
            java.lang.String r0 = "nickname"
            java.lang.String r0 = LIZJ(r7, r1, r0)
            r4.setNickName(r0)
            java.lang.String r1 = "getAvatarThumb"
            java.lang.String r0 = "avatarThumb"
            java.lang.Object r0 = LIZLLL(r7, r1, r0)
            com.bytedance.android.live.base.model.ImageModel r0 = LJFF(r0)
            r4.setAvatarThumb(r0)
            java.lang.String r1 = "getAvatarMedium"
            java.lang.String r0 = "avatarMedium"
            java.lang.Object r0 = LIZLLL(r7, r1, r0)
            com.bytedance.android.live.base.model.ImageModel r0 = LJFF(r0)
            r4.setAvatarMedium(r0)
            java.lang.String r1 = "getAvatarLarger"
            java.lang.String r0 = "avatarLarger"
            java.lang.Object r0 = LIZLLL(r7, r1, r0)
            com.bytedance.android.live.base.model.ImageModel r0 = LJFF(r0)
            r4.setAvatarLarge(r0)
            r4.setIdStr(r3)
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r3)
            r5 = 0
            if (r0 == 0) goto Lbe
            long r0 = r0.longValue()
        L6d:
            r4.setId(r0)
            r4.setSecUid(r2)
            java.lang.String r3 = "getFollowStatus"
            java.lang.String r2 = "followStatus"
            int r0 = LIZIZ(r7, r3, r2)
            r4.setFollowStatus(r0)
            java.lang.String r1 = "isAccuratePrivateAccount"
            java.lang.String r0 = "accuratePrivateAccount"
            boolean r0 = LIZ(r7, r1, r0)
            r4.setSecret(r0)
            int r3 = LIZIZ(r7, r3, r2)
            java.lang.String r1 = "getFollowerStatus"
            java.lang.String r0 = "followerStatus"
            int r2 = LIZIZ(r7, r1, r0)
            r1 = 1
            if (r3 == 0) goto Lb9
            if (r3 == r1) goto Lb1
            r0 = 2
            if (r3 == r0) goto Lb6
            r0 = 4
            if (r3 == r0) goto Lb1
        La0:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r4.followStatus = r0
            java.lang.String r1 = "isEnableSubscription"
            java.lang.String r0 = "enableSubscription"
            boolean r0 = LIZ(r7, r1, r0)
            com.bytedance.android.live.base.model.user.User.sSubPermission = r0
            return r4
        Lb1:
            if (r2 == r1) goto Lb6
            r5 = 1
            goto La0
        Lb6:
            r5 = 2
            goto La0
        Lb9:
            if (r2 != r1) goto La0
            r5 = 3
            goto La0
        Lbe:
            r0 = 0
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15WP.LJ(com.ss.android.ugc.aweme.profile.model.User):com.bytedance.android.live.base.model.user.User");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.bytedance.android.live.base.model.ImageModel] */
    public static ImageModel LJFF(Object obj) {
        ?? arrayList;
        String string;
        String string2;
        if (obj == null) {
            return null;
        }
        ?? imageModel = new ImageModel();
        LIZ.getClass();
        imageModel.width = LIZIZ(obj, "getWidth", "width");
        imageModel.height = LIZIZ(obj, "getHeight", "height");
        imageModel.setUri(LIZJ(obj, "getUri", "uri"));
        Object objLIZLLL = LIZLLL(obj, "getUrlList", "urlList");
        if (objLIZLLL instanceof List) {
            arrayList = new ArrayList();
            for (Object obj2 : (Iterable) objLIZLLL) {
                if (obj2 != null && (string2 = obj2.toString()) != null) {
                    arrayList.add(string2);
                }
            }
        } else if (objLIZLLL instanceof Object[]) {
            arrayList = new ArrayList();
            for (Object obj3 : (Object[]) objLIZLLL) {
                if (obj3 != null && (string = obj3.toString()) != null) {
                    arrayList.add(string);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        imageModel.setUrls(arrayList);
        return imageModel;
    }

    public static boolean LIZ(User user, String str, String str2) {
        Object objLIZLLL = LIZLLL(user, str, str2);
        if (objLIZLLL instanceof Boolean) {
            return ((Boolean) objLIZLLL).booleanValue();
        }
        if (objLIZLLL instanceof Number) {
            if (((Number) objLIZLLL).intValue() != 0) {
                return true;
            }
            return false;
        }
        if (objLIZLLL instanceof String) {
            if (u.LJIJI((String) objLIZLLL, "true", true) || Intrinsics.LJFF(objLIZLLL, "1")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int LIZIZ(Object obj, String str, String str2) {
        Object objLIZLLL = LIZLLL(obj, str, str2);
        if (objLIZLLL instanceof Integer) {
            return ((Number) objLIZLLL).intValue();
        }
        if (objLIZLLL instanceof Number) {
            return ((Number) objLIZLLL).intValue();
        }
        if (objLIZLLL instanceof String) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) objLIZLLL);
            if (numLJIIJJI != null) {
                return numLJIIJJI.intValue();
            }
            return 0;
        }
        if ((objLIZLLL instanceof Boolean) && ((Boolean) objLIZLLL).booleanValue()) {
            return 1;
        }
        return 0;
    }

    public static String LIZJ(Object obj, String str, String str2) {
        Object objLIZLLL = LIZLLL(obj, str, str2);
        if (objLIZLLL == null) {
            return "";
        }
        if (objLIZLLL instanceof CharSequence) {
            return objLIZLLL.toString();
        }
        return objLIZLLL.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZLLL(java.lang.Object r8, java.lang.String r9, java.lang.String r10) {
        /*
            r4 = 0
            if (r8 != 0) goto L4
            return r4
        L4:
            r5 = 0
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L49
            java.lang.reflect.Method[] r7 = r0.getMethods()     // Catch: java.lang.Throwable -> L49
            int r6 = r7.length     // Catch: java.lang.Throwable -> L49
            r2 = 0
        Lf:
            if (r2 >= r6) goto L32
            r3 = r7[r2]     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = r3.getName()     // Catch: java.lang.Throwable -> L49
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r9)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L28
            java.lang.Class[] r0 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L49
            int r0 = r0.length     // Catch: java.lang.Throwable -> L49
            r1 = 1
            if (r0 != 0) goto L26
            goto L2a
        L26:
            r0 = 0
            goto L2b
        L28:
            r1 = 0
            goto L2d
        L2a:
            r0 = 1
        L2b:
            if (r0 == 0) goto L28
        L2d:
            if (r1 != 0) goto L33
            int r2 = r2 + 1
            goto Lf
        L32:
            r3 = r4
        L33:
            if (r3 == 0) goto L36
            goto L38
        L36:
            r1 = r4
            goto L45
        L38:
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L49
            X.0WZX r1 = new X.0WZX     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUa0+UwS1JgeqUHCOIzvcyuFdDop3v+/kn90w=="
            r1.<init>(r0, r4)     // Catch: java.lang.Throwable -> L49
            java.lang.Object r1 = X.C2204961BRm.a0(r3, r8, r2, r1)     // Catch: java.lang.Throwable -> L49
        L45:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L49
            goto L55
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L55:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L5c
            r1 = r4
        L5c:
            if (r1 != 0) goto L9a
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L86
            java.lang.reflect.Field[] r3 = r0.getFields()     // Catch: java.lang.Throwable -> L86
            int r2 = r3.length     // Catch: java.lang.Throwable -> L86
        L67:
            if (r5 >= r2) goto L78
            r1 = r3[r5]     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = r1.getName()     // Catch: java.lang.Throwable -> L86
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r10)     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto L79
            int r5 = r5 + 1
            goto L67
        L78:
            r1 = r4
        L79:
            if (r1 == 0) goto L7c
            goto L7e
        L7c:
            r1 = r4
            goto L82
        L7e:
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L86
        L82:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L86
            goto L92
        L86:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L92:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L99
            return r1
        L99:
            return r4
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15WP.LIZLLL(java.lang.Object, java.lang.String, java.lang.String):java.lang.Object");
    }
}
