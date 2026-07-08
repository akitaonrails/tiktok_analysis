package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Obw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622900Obw implements C0OKS {
    public final /* synthetic */ C0ONX LL;

    public C622900Obw(C0ONX c0onx) {
        this.LL = c0onx;
    }

    @Override // X.C0OKS
    public final Pair<String, Long> LLZILL(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            return new Pair<>(((Keva) this.LL.LLILLJJLI.getValue()).getString(C786410Ut5.j4("text_draft_%s", Arrays.copyOf(new Object[]{str}, 1)), null), Long.valueOf(((Keva) this.LL.LLILLJJLI.getValue()).getLong(C786410Ut5.j4("text_draft_create_time_%s", Arrays.copyOf(new Object[]{str}, 1)), 0L)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getTextDraft() - bulletinId = ");
            sbLIZ.append(str);
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJLZ(java.util.List<java.lang.String> r14, X.InterfaceC1364105Vn<? super java.lang.Boolean> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C622970Oc3
            if (r0 == 0) goto L21
            r4 = r15
            X.0Oc3 r4 = (X.C622970Oc3) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r9 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L27
            goto L61
        L21:
            X.0Oc3 r4 = new X.0Oc3
            r4.<init>(r13, r15)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            r5 = r14
            if (r5 == 0) goto L46
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L46
            r0 = 0
        L3f:
            if (r0 == 0) goto L48
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            return r0
        L46:
            r0 = 1
            goto L3f
        L48:
            java.lang.String r6 = ","
            r7 = 0
            r12 = 62
            r8 = r7
            r10 = r7
            r11 = r7
            java.lang.String r1 = X.C13LP.LJJLIIIJ(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L6b
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r0 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L6b
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L6b
            java.lang.Object r1 = r0.exposeBulletinItems(r1, r4)     // Catch: java.lang.Exception -> L6b
            if (r1 != r3) goto L64
            return r3
        L61:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L6b
        L64:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinExposeResponse r1 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinExposeResponse) r1     // Catch: java.lang.Exception -> L6b
            int r0 = r1.statusCode     // Catch: java.lang.Exception -> L6b
            if (r0 != 0) goto L88
            goto L87
        L6b:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "exposeBulletinItemList() - error = "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            goto L88
        L87:
            r9 = 1
        L88:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C622900Obw.LJLZ(java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // X.C0OKS
    public final boolean LLLJIL(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        try {
            ((Keva) this.LL.LLILLJJLI.getValue()).storeString(C786410Ut5.j4("text_draft_%s", Arrays.copyOf(new Object[]{str2}, 1)), str);
            ((Keva) this.LL.LLILLJJLI.getValue()).storeLong(C786410Ut5.j4("text_draft_create_time_%s", Arrays.copyOf(new Object[]{str2}, 1)), System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("storeTextDraft() - bulletinId = ");
            sbLIZ.append(str2);
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    @Override // X.C0OKS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJ(long r11, long r13, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCreateItemResponse> r15) {
        /*
            r10 = this;
            r5 = r11
            r7 = r13
            boolean r0 = r15 instanceof X.C622940Oc0
            if (r0 == 0) goto L27
            r9 = r15
            X.0Oc0 r9 = (X.C622940Oc0) r9
            int r2 = r9.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r9.LLILZIL = r2
        L14:
            java.lang.Object r4 = r9.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r9.LLILZIL
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2d
            long r7 = r9.LLILLJJLI
            long r5 = r9.LL
            goto L65
        L27:
            X.0Oc0 r9 = new X.0Oc0
            r9.<init>(r10, r15)
            goto L14
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L35:
            X.C155000ia.LIZIZ(r4)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            X.0Vh4 r0 = X.C036E.LIZ     // Catch: java.lang.Exception -> L47
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L47
            goto L4c
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
        L4c:
            if (r0 != 0) goto L54
            java.lang.String r0 = "withDrawItem() failed, network is unavailable"
            X.C0OPX.LJIIIIZZ(r0)
            return r3
        L54:
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r4 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L6b
            r9.LL = r5     // Catch: java.lang.Exception -> L6b
            r9.LLILLJJLI = r7     // Catch: java.lang.Exception -> L6b
            r9.LLILZIL = r1     // Catch: java.lang.Exception -> L6b
            java.lang.Object r4 = r4.fetchBulletinWithDrawItem(r5, r7, r9)     // Catch: java.lang.Exception -> L6b
            if (r4 != r2) goto L68
            return r2
        L65:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L6b
        L68:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCreateItemResponse r4 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCreateItemResponse) r4     // Catch: java.lang.Exception -> L6b
            return r4
        L6b:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "withDrawItem() failed, itemId = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", bulletinId = "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", error = "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C622900Obw.LJJIIJ(long, long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.C0OKS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJZL(long r6, java.lang.Long r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEventResponse> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C622950Oc1
            if (r0 == 0) goto L20
            r4 = r9
            X.0Oc1 r4 = (X.C622950Oc1) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3e
        L20:
            X.0Oc1 r4 = new X.0Oc1
            r4.<init>(r5, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r0 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L44
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L44
            java.lang.Object r3 = r0.LJIL(r6, r8, r4)     // Catch: java.lang.Exception -> L44
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L44
        L41:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEventResponse r3 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEventResponse) r3     // Catch: java.lang.Exception -> L44
            return r3
        L44:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fetchListEvents() - error = "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C622900Obw.LJZL(long, java.lang.Long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.C0OKS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r10, java.lang.String r12, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountMemberResponse> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof X.C622980Oc4
            if (r0 == 0) goto L20
            r8 = r13
            X.0Oc4 r8 = (X.C622980Oc4) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r3 = r8.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r8.LLILLL
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L26
            goto L42
        L20:
            X.0Oc4 r8 = new X.0Oc4
            r8.<init>(r9, r13)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r3 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L48
            r6 = 20
            r8.LLILLL = r0     // Catch: java.lang.Exception -> L48
            r7 = r12
            r4 = r10
            java.lang.Object r3 = r3.LJJJJIZL(r4, r6, r7, r8)     // Catch: java.lang.Exception -> L48
            if (r3 != r2) goto L45
            return r2
        L42:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L48
        L45:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountMemberResponse r3 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountMemberResponse) r3     // Catch: java.lang.Exception -> L48
            return r3
        L48:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getAccountMemberList() - error = "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C622900Obw.a(long, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // X.C0OKS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkAwemeIsShared(java.lang.String r8, long r9, X.InterfaceC1364105Vn<? super java.lang.Integer> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C622930Obz
            if (r0 == 0) goto L28
            r5 = r11
            X.0Obz r5 = (X.C622930Obz) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r6 = r5.LLILLL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r4 = 0
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 != r2) goto L2e
            long r9 = r5.LLILLJJLI
            java.lang.Object r8 = r5.LL
            java.lang.String r8 = (java.lang.String) r8
            goto L66
        L28:
            X.0Obz r5 = new X.0Obz
            r5.<init>(r7, r11)
            goto L12
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r6)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            X.0Vh4 r0 = X.C036E.LIZ     // Catch: java.lang.Exception -> L48
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L48
            goto L4d
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
        L4d:
            if (r0 != 0) goto L55
            java.lang.String r0 = "checkAwemeIsShared() failed, network is unavailable"
            X.C0OPX.LJIIIIZZ(r0)
            return r3
        L55:
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r0 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L83
            r5.LL = r8     // Catch: java.lang.Exception -> L83
            r5.LLILLJJLI = r9     // Catch: java.lang.Exception -> L83
            r5.LLILZIL = r2     // Catch: java.lang.Exception -> L83
            java.lang.Object r6 = r0.checkAwemeIsShared(r8, r9, r5)     // Catch: java.lang.Exception -> L83
            if (r6 != r1) goto L69
            return r1
        L66:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> L83
        L69:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAwemeIsShared r6 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAwemeIsShared) r6     // Catch: java.lang.Exception -> L83
            int r0 = r6.status_code     // Catch: java.lang.Exception -> L83
            if (r0 != 0) goto Lae
            java.lang.Boolean r1 = r6.isShared()     // Catch: java.lang.Exception -> L83
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L83
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L7e
            r4 = 1
        L7e:
            java.lang.Integer r3 = X.C2286608xc.LJ(r4)     // Catch: java.lang.Exception -> L83
            return r3
        L83:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "checkAwemeIsShared() failed, aid = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", bulletinId = "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", error = "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C622900Obw.checkAwemeIsShared(java.lang.String, long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @Override // X.C0OKS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLIIIIL(java.lang.Long r14, java.lang.String r15, java.lang.String r16, X.InterfaceC1364105Vn r17) {
        /*
            r13 = this;
            r3 = r17
            r8 = r16
            r9 = r15
            boolean r0 = r3 instanceof X.C622920Oby
            if (r0 == 0) goto L2a
            r12 = r3
            X.0Oby r12 = (X.C622920Oby) r12
            int r2 = r12.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r12.LLILZ = r2
        L17:
            java.lang.Object r4 = r12.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r12.LLILZ
            r5 = 0
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 != r1) goto L30
            java.lang.Object r9 = r12.LL
            java.lang.String r9 = (java.lang.String) r9
            goto L5b
        L2a:
            X.0Oby r12 = new X.0Oby
            r12.<init>(r13, r3)
            goto L17
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r6 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L9a
            if (r8 != 0) goto L43
            java.lang.String r8 = ""
        L43:
            X.0ONX r0 = r13.LL     // Catch: java.lang.Exception -> L9a
            X.01GW r0 = r0.LL     // Catch: java.lang.Exception -> L9a
            java.lang.Object r11 = r0.getValue()     // Catch: java.lang.Exception -> L9a
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Exception -> L9a
            r12.LL = r9     // Catch: java.lang.Exception -> L9a
            r12.LLILZ = r1     // Catch: java.lang.Exception -> L9a
            r7 = 20
            r10 = r14
            java.lang.Object r4 = r6.LJJIFFI(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L9a
            if (r4 != r2) goto L5e
            return r2
        L5b:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L9a
        L5e:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse r4 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse) r4     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = "/tiktok/bulletin/item/list/"
            java.lang.String r2 = "response"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L9a
            java.lang.String r0 = " channelID: "
            r1.append(r0)     // Catch: java.lang.Exception -> L9a
            r1.append(r9)     // Catch: java.lang.Exception -> L9a
            java.lang.String r0 = "， statusCode: "
            r1.append(r0)     // Catch: java.lang.Exception -> L9a
            int r0 = r4.statusCode     // Catch: java.lang.Exception -> L9a
            r1.append(r0)     // Catch: java.lang.Exception -> L9a
            java.lang.String r0 = ", logID: "
            r1.append(r0)     // Catch: java.lang.Exception -> L9a
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r4.logPb     // Catch: java.lang.Exception -> L9a
            if (r0 == 0) goto L97
            java.lang.String r0 = r0.getImprId()     // Catch: java.lang.Exception -> L9a
        L87:
            r1.append(r0)     // Catch: java.lang.Exception -> L9a
            r0 = 32
            r1.append(r0)     // Catch: java.lang.Exception -> L9a
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L9a
            X.C0OPX.LJIILIIL(r3, r2, r0)     // Catch: java.lang.Exception -> L9a
            goto L99
        L97:
            r0 = r5
            goto L87
        L99:
            return r4
        L9a:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getBulletinListResponse() error:"
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C622900Obw.LLLIIIIL(java.lang.Long, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.C0OKS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZI(long r13, long r15, int r17, java.lang.Long r18, java.lang.String r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            r12 = this;
            r3 = r20
            boolean r0 = r3 instanceof X.C622960Oc2
            if (r0 == 0) goto L22
            r11 = r3
            X.0Oc2 r11 = (X.C622960Oc2) r11
            int r2 = r11.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r11.LLILLL = r2
        L14:
            java.lang.Object r3 = r11.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r11.LLILLL
            r0 = 1
            if (r1 == 0) goto L34
            if (r1 != r0) goto L2c
            goto L28
        L22:
            X.0Oc2 r11 = new X.0Oc2
            r11.<init>(r12, r3)
            goto L14
        L28:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L4c
            goto L67
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r3 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L4c
            r11.LLILLL = r0     // Catch: java.lang.Exception -> L4c
            r10 = r19
            r8 = r17
            r6 = r15
            r9 = r18
            r4 = r13
            java.lang.Object r0 = r3.reportBulletinMsgAction(r4, r6, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L4c
            if (r0 != r2) goto L67
            return r2
        L4c:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "reportBulletinItemAction() - error = "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
        L67:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C622900Obw.LJJJJZI(long, long, int, java.lang.Long, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.C0OKS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pollVote(int r16, long r17, long r19, long r21, long r23, int r25, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.base.api.BaseResponse> r26) {
        /*
            r15 = this;
            r3 = r26
            boolean r0 = r3 instanceof X.C622990Oc5
            if (r0 == 0) goto L22
            r14 = r3
            X.0Oc5 r14 = (X.C622990Oc5) r14
            int r2 = r14.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r14.LLILLL = r2
        L14:
            java.lang.Object r3 = r14.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r14.LLILLL
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 != r0) goto L28
            goto L4c
        L22:
            X.0Oc5 r14 = new X.0Oc5
            r14.<init>(r15, r3)
            goto L14
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r3 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L52
            r14.LLILLL = r0     // Catch: java.lang.Exception -> L52
            r13 = r25
            r11 = r23
            r7 = r19
            r5 = r17
            r9 = r21
            r4 = r16
            java.lang.Object r3 = r3.pollVote(r4, r5, r7, r9, r11, r13, r14)     // Catch: java.lang.Exception -> L52
            if (r3 != r2) goto L4f
            return r2
        L4c:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L52
        L4f:
            com.ss.android.ugc.aweme.base.api.BaseResponse r3 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r3     // Catch: java.lang.Exception -> L52
            return r3
        L52:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "pollVote() - error = "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C622900Obw.pollVote(int, long, long, long, long, int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9 A[Catch: Exception -> 0x012d, TryCatch #1 {Exception -> 0x012d, blocks: (B:27:0x00d3, B:29:0x00d9, B:31:0x00e1), top: B:53:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1 A[Catch: Exception -> 0x012d, TRY_LEAVE, TryCatch #1 {Exception -> 0x012d, blocks: (B:27:0x00d3, B:29:0x00d9, B:31:0x00e1), top: B:53:0x00d3 }] */
    @Override // X.C0OKS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(int r30, long r31, long r33, long r35, java.lang.Long r37, int r38, java.lang.String r39, X.InterfaceC1364105Vn<? super X.C0OZ9> r40) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C622900Obw.LJIILJJIL(int, long, long, long, java.lang.Long, int, java.lang.String, X.05Vn):java.lang.Object");
    }
}
