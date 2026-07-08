package X;

import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rzQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609660rzQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(AvatarComponentView avatarComponentView, C03IT c03it, C1609770rzb c1609770rzb, Function1 function1) {
        C427660Gpo.LJIIJJI(avatarComponentView.getAvatar(), c03it, false, null, "ImageBind", false, avatarComponentView.getConfig().LIZ.LJII, null, new C1609690rzT(avatarComponentView.getConfig().LIZ.LJIIIZ, c1609770rzb, function1, avatarComponentView), false, avatarComponentView.getConfig().LIZ.LJIILJJIL, 342);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(X.C1609730rzX r5, X.C1609730rzX r6, com.ss.android.ugc.aweme.base.model.UrlModel r7, X.EnumC1609700rzU r8, boolean r9) {
        /*
            r3 = 0
            if (r6 == 0) goto L11
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.LIZ
        L5:
            r4 = 1
            if (r0 == 0) goto L13
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 == 0) goto L13
            return r4
        L11:
            r0 = r3
            goto L5
        L13:
            if (r7 == 0) goto L34
            java.lang.String r2 = r7.getUri()
        L19:
            if (r6 == 0) goto L32
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r6.LIZ
            if (r0 == 0) goto L32
            java.lang.String r1 = r0.getUri()
        L23:
            if (r9 == 0) goto L36
            if (r6 == 0) goto L30
            X.0rzU r0 = r6.LIZIZ
        L29:
            boolean r0 = X.C135000fM.LIZ(r1, r0, r2, r8)
            if (r0 == 0) goto L36
            return r4
        L30:
            r0 = r3
            goto L29
        L32:
            r1 = r3
            goto L23
        L34:
            r2 = r3
            goto L19
        L36:
            if (r5 == 0) goto L56
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r5.LIZIZ()
            if (r0 == 0) goto L49
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r5.LIZIZ()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 == 0) goto L4b
            return r4
        L49:
            if (r5 == 0) goto L56
        L4b:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r5.LIZIZ()
            if (r0 == 0) goto L56
            java.lang.String r0 = r0.getUri()
            goto L57
        L56:
            r0 = r3
        L57:
            if (r5 == 0) goto L5d
            X.0rzU r3 = r5.LIZ()
        L5d:
            boolean r0 = X.C135000fM.LIZ(r0, r3, r2, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1609660rzQ.LIZJ(X.0rzX, X.0rzX, com.ss.android.ugc.aweme.base.model.UrlModel, X.0rzU, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C1609730rzX r11, X.C1609730rzX r12, com.ss.android.ugc.aweme.avatar.AvatarComponentView r13, java.lang.Object r14, boolean r15, boolean r16) {
        /*
            X.0rxx r0 = r13.getConfig()
            r5 = 0
            if (r0 == 0) goto L89
            X.0rz0 r2 = r0.LIZ
            if (r2 == 0) goto L8a
            X.0rz8 r6 = r2.LIZJ
            X.0rz4 r3 = r2.LIZLLL
        Lf:
            boolean r4 = r14 instanceof com.ss.android.ugc.aweme.profile.model.User
            if (r4 == 0) goto L6b
            r1 = r14
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.ss.android.ugc.aweme.profile.model.User) r1
            if (r3 != 0) goto L1d
            X.0rz3 r3 = new X.0rz3
            r3.<init>()
        L1d:
            boolean r0 = r3 instanceof X.C1609430rz3
            if (r0 == 0) goto L5e
            kotlin.Pair r0 = X.C1609670rzR.LIZ(r1, r6)
            if (r0 != 0) goto L29
            kotlin.Pair r0 = X.C1609670rzR.LIZ
        L29:
            java.lang.Object r8 = r0.getFirst()
            com.ss.android.ugc.aweme.base.model.UrlModel r8 = (com.ss.android.ugc.aweme.base.model.UrlModel) r8
            java.lang.Object r7 = r0.getSecond()
            X.0rzU r7 = (X.EnumC1609700rzU) r7
            java.lang.System.currentTimeMillis()
            X.0rxx r0 = r13.getConfig()
            X.0rz0 r0 = r0.LIZ
            X.0rzc r6 = r0.LJIIIZ
            X.03IT r3 = new X.03IT
            if (r8 == 0) goto L5c
            java.util.List r0 = r8.getUrlList()
        L48:
            r3.<init>(r0)
            r1 = 1
            if (r15 != 0) goto L8d
            r0 = r16
            boolean r0 = LIZJ(r11, r12, r8, r7, r0)
            if (r0 == 0) goto L8d
            if (r6 == 0) goto L5b
            r6.y1(r1)
        L5b:
            return
        L5c:
            r0 = r5
            goto L48
        L5e:
            boolean r0 = r3 instanceof X.C1609380ryy
            if (r0 == 0) goto Lb3
            kotlin.Pair r0 = X.C1609670rzR.LIZ(r1, r6)
            if (r0 != 0) goto L29
            kotlin.Pair r0 = X.C1609670rzR.LIZ
            goto L29
        L6b:
            boolean r0 = r14 instanceof java.util.List
            if (r0 == 0) goto L86
            r0 = r14
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = X.C1609650rzP.LJFF(r0)
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r3.<init>()
            r3.setUrlList(r0)
            X.0rzU r1 = X.EnumC1609700rzU.AVATAR_300
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r1)
            goto L29
        L86:
            kotlin.Pair r0 = X.C1609670rzR.LIZ
            goto L29
        L89:
            r2 = r5
        L8a:
            r6 = r5
            r3 = r5
            goto Lf
        L8d:
            if (r12 == 0) goto L9f
            if (r4 == 0) goto L99
            com.ss.android.ugc.aweme.profile.model.User r14 = (com.ss.android.ugc.aweme.profile.model.User) r14
            if (r14 == 0) goto L99
            java.lang.String r5 = r14.getUid()
        L99:
            r12.LIZJ = r5
            r12.LIZ = r8
            r12.LIZIZ = r7
        L9f:
            X.0rzb r5 = new X.0rzb
            r6 = 0
            r9 = 0
            r10 = 51
            r5.<init>(r6, r7, r8, r9, r10)
            kotlin.jvm.internal.AwS233S0300000_24 r1 = new kotlin.jvm.internal.AwS233S0300000_24
            r0 = 9
            r1.<init>(r2, r11, r12, r0)
            LIZ(r13, r3, r5, r1)
            return
        Lb3:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1609660rzQ.LIZIZ(X.0rzX, X.0rzX, com.ss.android.ugc.aweme.avatar.AvatarComponentView, java.lang.Object, boolean, boolean):void");
    }
}
