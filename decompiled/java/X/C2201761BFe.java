package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.Avatars;
import com.ss.android.ugc.aweme.im.contacts.api.model.BlockInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BFe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201761BFe {
    public static long LJ;
    public static int LJFF;
    public static C09AJ<Object> LJI;
    public static C11JF LJII;
    public static final C2201761BFe LIZ = new C2201761BFe();
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(974));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(229));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(230));
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(228));

    public static void LIZIZ(int i, long j) {
        long jLIZIZ;
        C01GW c01gw = LIZLLL;
        if (((Number) c01gw.getValue()).longValue() == 0) {
            return;
        }
        IMHostApi.LIZ.getClass();
        IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
        if (iMHostApiLIZ != null) {
            jLIZIZ = iMHostApiLIZ.LIZIZ();
        } else {
            jLIZIZ = 0;
        }
        if (j < ((Number) c01gw.getValue()).longValue()) {
            LJFF++;
            if (LJ == 0) {
                LJ = jLIZIZ;
            }
            C09AJ<Object> c09aj = LJI;
            if (c09aj != null) {
                c09aj.onNext(new Object());
            }
            C1243290iSV.LIZIZ(C1243290iSV.LIZ, i, jLIZIZ - j, true);
            return;
        }
        if (LJFF > 0 && LJ > 0) {
            C1243290iSV.LIZ(C1243290iSV.LIZ, jLIZIZ - LJ, 1, LJFF);
            LJ = 0L;
        }
        C11JF c11jf = LJII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1243290iSV.LIZIZ(C1243290iSV.LIZ, i, jLIZIZ - j, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016c A[Catch: Exception -> 0x01e2, TryCatch #0 {Exception -> 0x01e2, blocks: (B:68:0x0149, B:73:0x0166, B:75:0x016c, B:79:0x0177, B:82:0x0189, B:84:0x018f, B:87:0x01a8, B:89:0x01b0, B:91:0x01b6, B:95:0x01c0, B:97:0x01c6, B:98:0x01ca, B:72:0x0163, B:81:0x0186, B:102:0x01de), top: B:108:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018f A[Catch: Exception -> 0x01e2, TryCatch #0 {Exception -> 0x01e2, blocks: (B:68:0x0149, B:73:0x0166, B:75:0x016c, B:79:0x0177, B:82:0x0189, B:84:0x018f, B:87:0x01a8, B:89:0x01b0, B:91:0x01b6, B:95:0x01c0, B:97:0x01c6, B:98:0x01ca, B:72:0x0163, B:81:0x0186, B:102:0x01de), top: B:108:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b0 A[Catch: Exception -> 0x01e2, TryCatch #0 {Exception -> 0x01e2, blocks: (B:68:0x0149, B:73:0x0166, B:75:0x016c, B:79:0x0177, B:82:0x0189, B:84:0x018f, B:87:0x01a8, B:89:0x01b0, B:91:0x01b6, B:95:0x01c0, B:97:0x01c6, B:98:0x01ca, B:72:0x0163, B:81:0x0186, B:102:0x01de), top: B:108:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.im.contacts.impl.model.IMContactEvent r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2201761BFe.LIZLLL(com.ss.android.ugc.aweme.im.contacts.impl.model.IMContactEvent, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C2201731BFb
            if (r0 == 0) goto L9a
            r7 = r12
            X.1BFb r7 = (X.C2201731BFb) r7
            int r2 = r7.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9a
            int r2 = r2 - r1
            r7.LLILZLL = r2
        L12:
            java.lang.Object r3 = r7.LLILZ
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZLL
            r8 = 3
            r2 = 2
            r1 = 1
            r5 = 0
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L48
            if (r0 == r2) goto L70
            if (r0 != r8) goto La1
            X.C155000ia.LIZIZ(r3)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r4 = r11.imUserBaseInfo
            if (r4 == 0) goto L29
            X.06pU r0 = X.C805480Vik.LIZIZ()
            r7.LL = r11
            r7.LLILLJJLI = r11
            r7.LLILLL = r4
            r7.LLILZLL = r1
            java.lang.Object r0 = r0.LJII(r4, r7)
            if (r0 != r6) goto L46
            return r6
        L46:
            r9 = r11
            goto L55
        L48:
            java.lang.Object r4 = r7.LLILLL
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r4 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo) r4
            java.lang.Object r11 = r7.LLILLJJLI
            com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo r11 = (com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo) r11
            com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo r9 = r7.LL
            X.C155000ia.LIZIZ(r3)
        L55:
            com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission r1 = r11.sharePermission
            if (r1 == 0) goto L6e
            X.1BHo r0 = X.C808290VnH.LIZ()
            r7.LL = r9
            r7.LLILLJJLI = r4
            r7.LLILLL = r1
            r7.LLILZLL = r2
            X.1BHn r0 = (X.C2202371BHn) r0
            java.lang.Object r0 = r0.LJIIIZ(r1, r7)
            if (r0 != r6) goto L7d
            return r6
        L6e:
            r3 = r5
            goto L81
        L70:
            java.lang.Object r1 = r7.LLILLL
            com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission r1 = (com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission) r1
            java.lang.Object r4 = r7.LLILLJJLI
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r4 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo) r4
            com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo r9 = r7.LL
            X.C155000ia.LIZIZ(r3)
        L7d:
            java.lang.Integer r3 = r1.getUserShareStatus()
        L81:
            X.1BFe r2 = X.C2201761BFe.LIZ
            long r0 = r4.getUserId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.LL = r9
            r7.LLILLJJLI = r5
            r7.LLILLL = r5
            r7.LLILZLL = r8
            java.lang.Object r0 = r2.LIZ(r0, r4, r3, r7)
            if (r0 != r6) goto L29
            return r6
        L9a:
            X.1BFb r7 = new X.1BFb
            r7.<init>(r10, r12)
            goto L12
        La1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2201761BFe.LJ(com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2201761BFe.LJII(com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(com.ss.android.ugc.aweme.im.contacts.impl.model.IMContactEvent r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2201761BFe.LJIIIIZZ(com.ss.android.ugc.aweme.im.contacts.impl.model.IMContactEvent, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r11, com.ss.android.ugc.aweme.im.contacts.impl.model.IMContactEvent r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C1BFY
            if (r0 == 0) goto L7a
            r4 = r13
            X.1BFY r4 = (X.C1BFY) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L12:
            java.lang.Object r1 = r4.LLILZ
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZLL
            r5 = 2
            r9 = 1
            if (r0 == 0) goto L28
            if (r0 == r9) goto L57
            if (r0 != r5) goto L80
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r6 = r12.base
            if (r6 == 0) goto L25
            long r7 = r11.getUpdateTime()
            long r1 = r6.getUpdateTime()
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L25
            long r0 = r6.getUpdateTime()
            r11.setUpdateTime(r0)
            X.06pU r0 = X.C805480Vik.LIZIZ()
            r4.LL = r11
            r4.LLILLJJLI = r6
            r4.LLILLL = r6
            r4.LLILZLL = r9
            java.lang.Object r0 = r0.LJIIL(r11, r4)
            if (r0 != r3) goto L55
            return r3
        L55:
            r0 = r6
            goto L60
        L57:
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r0 = r4.LLILLL
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r6 = r4.LLILLJJLI
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r11 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L60:
            X.1BFe r2 = X.C2201761BFe.LIZ
            long r0 = r0.getUserId()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r4.LL = r6
            r0 = 0
            r4.LLILLJJLI = r0
            r4.LLILLL = r0
            r4.LLILZLL = r5
            java.lang.Object r0 = r2.LIZ(r1, r11, r0, r4)
            if (r0 != r3) goto L25
            return r3
        L7a:
            X.1BFY r4 = new X.1BFY
            r4.<init>(r10, r13)
            goto L12
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2201761BFe.LIZJ(com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo, com.ss.android.ugc.aweme.im.contacts.impl.model.IMContactEvent, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r8, com.ss.android.ugc.aweme.im.contacts.impl.model.IMContactEvent r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C1BFV
            if (r0 == 0) goto Lb7
            r4 = r10
            X.1BFV r4 = (X.C1BFV) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb7
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 != r5) goto Lbe
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r6 = r9.base
            if (r6 == 0) goto L7d
            java.lang.Integer r0 = r6.getFollowStatus()
            r8.setFollowStatus(r0)
            int r0 = r6.getFollowerStatus()
            r8.setFollowerStatus(r0)
            java.lang.Integer r0 = r6.getMafStatus()
            r8.setMafStatus(r0)
            java.lang.String r0 = r6.getContactNickName()
            r8.setContactNickName(r0)
            com.ss.android.ugc.aweme.im.contacts.api.model.Avatars r0 = r6.getAvatars()
            r8.setAvatars(r0)
            java.lang.String r0 = r6.getUniqueId()
            r8.setUniqueId(r0)
            long r0 = r6.getUpdateTime()
            r8.setUpdateTime(r0)
            int r1 = r6.getFollowerStatus()
            java.lang.Integer r0 = r6.getFollowStatus()
            r2 = 0
            if (r0 == 0) goto Lb5
            int r0 = r0.intValue()
        L6c:
            int r1 = r1 + r0
            if (r1 <= 0) goto Lb3
            r1 = 1
        L70:
            com.ss.android.ugc.aweme.im.contacts.api.model.BlockInfo r0 = r6.getBlockInfo()
            if (r0 == 0) goto L93
            com.ss.android.ugc.aweme.im.contacts.api.model.BlockInfo r0 = r6.getBlockInfo()
            r8.setBlockInfo(r0)
        L7d:
            X.1BFe r6 = X.C2201761BFe.LIZ
            com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo r2 = new com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo
            com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission r1 = r9.sharePermission
            r0 = 0
            r2.<init>(r8, r1, r0)
            r4.getClass()
            r4.LLILLL = r5
            java.lang.Object r0 = r6.LJ(r2, r4)
            if (r0 != r3) goto L22
            return r3
        L93:
            if (r1 == 0) goto L7d
            com.ss.android.ugc.aweme.im.contacts.api.model.BlockInfo r0 = r8.getBlockInfo()
            if (r0 == 0) goto La8
            boolean r0 = r0.block
            if (r0 != r5) goto La8
        L9f:
            com.ss.android.ugc.aweme.im.contacts.api.model.BlockInfo r0 = new com.ss.android.ugc.aweme.im.contacts.api.model.BlockInfo
            r0.<init>(r2, r2)
            r8.setBlockInfo(r0)
            goto L7d
        La8:
            com.ss.android.ugc.aweme.im.contacts.api.model.BlockInfo r0 = r8.getBlockInfo()
            if (r0 == 0) goto L7d
            boolean r0 = r0.blockedBy
            if (r0 != r5) goto L7d
            goto L9f
        Lb3:
            r1 = 0
            goto L70
        Lb5:
            r0 = 0
            goto L6c
        Lb7:
            X.1BFV r4 = new X.1BFV
            r4.<init>(r7, r10)
            goto L12
        Lbe:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2201761BFe.LJI(com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo, com.ss.android.ugc.aweme.im.contacts.impl.model.IMContactEvent, X.05Vn):java.lang.Object");
    }

    public static Unit LJFF(IMUser iMUser, IMUserBaseInfo iMUserBaseInfo, Integer num, boolean z) {
        boolean z2;
        int iIntValue;
        UrlModel urlModel;
        UrlModel urlModel2;
        int iIntValue2;
        int iIntValue3;
        UrlModel urlModel3;
        UrlModel urlModel4 = null;
        if (iMUserBaseInfo != null) {
            if (!Intrinsics.LJFF(iMUser.getNickName(), iMUserBaseInfo.getNickName())) {
                iMUser.setNickName(iMUserBaseInfo.getNickName());
                z2 = true;
            } else {
                z2 = false;
            }
            if (!Intrinsics.LJFF(iMUser.getUniqueId(), iMUserBaseInfo.getUniqueId())) {
                iMUser.setUniqueId(iMUserBaseInfo.getUniqueId());
                z2 = true;
            }
            UrlModel avatarThumb = iMUser.getAvatarThumb();
            Avatars avatars = iMUserBaseInfo.getAvatars();
            if (avatars != null) {
                urlModel = avatars.avatarThumb;
            } else {
                urlModel = null;
            }
            if (!Intrinsics.LJFF(avatarThumb, urlModel)) {
                Avatars avatars2 = iMUserBaseInfo.getAvatars();
                if (avatars2 != null) {
                    urlModel3 = avatars2.avatarThumb;
                } else {
                    urlModel3 = null;
                }
                iMUser.setAvatarThumb(urlModel3);
                z2 = true;
            }
            UrlModel avatarMedium = iMUser.getAvatarMedium();
            Avatars avatars3 = iMUserBaseInfo.getAvatars();
            if (avatars3 != null) {
                urlModel2 = avatars3.avatarMedium;
            } else {
                urlModel2 = null;
            }
            if (!Intrinsics.LJFF(avatarMedium, urlModel2)) {
                Avatars avatars4 = iMUserBaseInfo.getAvatars();
                if (avatars4 != null) {
                    urlModel4 = avatars4.avatarMedium;
                }
                iMUser.setAvatarMedium(urlModel4);
                z2 = true;
            }
            Integer followStatus = iMUserBaseInfo.getFollowStatus();
            if (followStatus != null && followStatus.intValue() > EnumC1240560iO6.UNKNOWN.getStatus() && iMUser.getFollowStatus() != (iIntValue3 = followStatus.intValue())) {
                iMUser.setFollowStatus(iIntValue3);
                z2 = true;
            }
            Integer numLJ = C2286608xc.LJ(iMUserBaseInfo.getFollowerStatus());
            if (numLJ.intValue() > EnumC1240560iO6.UNKNOWN.getStatus() && iMUser.getFollowerStatus() != (iIntValue2 = numLJ.intValue())) {
                iMUser.setFollowerStatus(iIntValue2);
                z2 = true;
            }
            BlockInfo blockInfo = iMUserBaseInfo.getBlockInfo();
            if (blockInfo != null) {
                boolean zIsBlock = iMUser.isBlock();
                boolean z3 = blockInfo.block;
                if (zIsBlock != z3) {
                    iMUser.setBlock(z3);
                    z2 = true;
                }
                boolean zIsBlocked = iMUser.isBlocked();
                boolean z4 = blockInfo.blockedBy;
                if (zIsBlocked != z4) {
                    iMUser.setBlocked(z4);
                    z2 = true;
                }
            }
        } else {
            z2 = false;
        }
        if (num != null && num.intValue() > 0 && iMUser.getShareStatus() != (iIntValue = num.intValue())) {
            iMUser.setShareStatus(iIntValue);
            String uid = iMUser.getUid();
            if (uid != null && uid.length() > 0) {
                LIZ.getClass();
                IShareStatusKeva iShareStatusKeva = (IShareStatusKeva) LJIIIZ.getValue();
                if (iShareStatusKeva != null) {
                    iShareStatusKeva.LIZ(C2286608xc.LJ(iIntValue), uid);
                }
            }
        } else {
            if (z2) {
            }
            return Unit.LIZ;
        }
        if (z) {
            C1336205Ku.LIZ(false).getImMafService().LIZ(iMUser);
        } else {
            C1336205Ku.LIZ(false).getImUserService().LJIILIIL(iMUser);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r8, com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r9, java.lang.Integer r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C1BFZ
            if (r0 == 0) goto L80
            r5 = r11
            X.1BFZ r5 = (X.C1BFZ) r5
            int r2 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r5.LLILZLL = r2
        L12:
            java.lang.Object r1 = r5.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZLL
            r6 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L29
            if (r0 == r2) goto L4e
            if (r0 != r3) goto L86
            X.C155000ia.LIZIZ(r1)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.im.service.IIMService r0 = X.C1336205Ku.LIZ(r6)
            X.0zm6 r0 = r0.getImMafService()
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r1 = r0.LIZIZ(r8)
            if (r1 == 0) goto L5b
            X.1BFe r0 = X.C2201761BFe.LIZ
            r5.LL = r8
            r5.LLILLJJLI = r9
            r5.LLILLL = r10
            r5.LLILZLL = r2
            r0.getClass()
            kotlin.Unit r0 = LJFF(r1, r9, r10, r2)
            if (r0 != r4) goto L5b
            return r4
        L4e:
            java.lang.Object r10 = r5.LLILLL
            java.lang.Integer r10 = (java.lang.Integer) r10
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo r9 = r5.LLILLJJLI
            java.lang.Object r8 = r5.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r1)
        L5b:
            X.01GW r0 = X.C2201761BFe.LJIIIIZZ
            java.lang.Object r1 = r0.getValue()
            X.06mp r1 = (X.InterfaceC1710106mp) r1
            r2 = 0
            java.lang.String r0 = "im_local_db"
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r1 = r1.LIZLLL(r8, r2, r0)
            if (r1 == 0) goto L26
            X.1BFe r0 = X.C2201761BFe.LIZ
            r5.LL = r2
            r5.LLILLJJLI = r2
            r5.LLILLL = r2
            r5.LLILZLL = r3
            r0.getClass()
            kotlin.Unit r0 = LJFF(r1, r9, r10, r6)
            if (r0 != r4) goto L26
            return r4
        L80:
            X.1BFZ r5 = new X.1BFZ
            r5.<init>(r7, r11)
            goto L12
        L86:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2201761BFe.LIZ(java.lang.String, com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo, java.lang.Integer, X.05Vn):java.lang.Object");
    }
}
