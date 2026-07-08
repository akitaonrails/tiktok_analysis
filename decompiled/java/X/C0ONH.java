package X;

import Y.AfS145S0200000_9;
import Y.AfS178S0100000_9;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.api.MultiApiManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardUpdateInfo;
import com.ss.android.ugc.aweme.notification.api.BulletinEventReportRequest;
import com.ss.android.ugc.aweme.notification.api.EventExtra;
import com.ss.android.ugc.aweme.notification.api.EventInfo;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS135S0201000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0ONH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ONH implements C0OIU {
    public final /* synthetic */ C0ONJ LL;

    @Override // X.C0OIU
    public final BulletinBoardUpdateInfo LLLLLLL() {
        try {
            return new BulletinBoardUpdateInfo(C0ONJ.LIZ().getString("BulletinBoardCreateName", null), C0ONJ.LIZ().getString("BulletinBoardCreateAvatar", null), null, C0ONJ.LIZ().getString("BulletinBoardCreateDescription", null), Boolean.valueOf(C0ONJ.LIZ().getBoolean("BulletinBoardCreateShowOnProfile", true)), Boolean.valueOf(C0ONJ.LIZ().getBoolean("BulletinBoardEnableReply", false)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getBulletinBoardCreateDataLocal() error: ");
            sbLIZ.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static boolean LJLZ() {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public C0ONH(C0ONJ c0onj) {
        this.LL = c0onj;
    }

    @Override // X.C0OIU
    public final void LLIILZL(BulletinBoardUpdateInfo bulletinBoardUpdateInfo) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0ONI(bulletinBoardUpdateInfo, this.LL, null), 2);
    }

    @Override // X.C0OIU
    public final BulletinBoardInfo LLZZJLIL(long j) {
        try {
            this.LL.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinBoardProfileDataRepository");
            sbLIZ.append(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid());
            String string = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).getString(C786410Ut5.j4("BulletinProfileData%s", Arrays.copyOf(new Object[]{String.valueOf(j)}, 1)), null);
            if (C123100dR.LIZ(string)) {
                return (BulletinBoardInfo) JsonParseUtils.LIZLLL(BulletinBoardInfo.class, string);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getLastProfileData() error: ");
            sbLIZ2.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return null;
    }

    @Override // X.C0OIU
    public final void n(BulletinBoardInfo bulletinBoardInfo) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C605730NpL(bulletinBoardInfo, this.LL, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // X.C0OIU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0(long r21, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse> r23) {
        /*
            r20 = this;
            r3 = r23
            boolean r0 = r3 instanceof X.C0ONQ
            r5 = r20
            if (r0 == 0) goto L25
            r4 = r3
            X.0ONQ r4 = (X.C0ONQ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r4.LLILLL = r2
        L16:
            java.lang.Object r0 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILLL
            r9 = 0
            r1 = 1
            if (r2 == 0) goto L37
            if (r2 != r1) goto L2f
            goto L2b
        L25:
            X.0ONQ r4 = new X.0ONQ
            r4.<init>(r5, r3)
            goto L16
        L2b:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Exception -> L79
            return r0
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            X.C155000ia.LIZIZ(r0)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            boolean r0 = LJLZ()
            if (r0 != 0) goto L4e
            java.lang.String r0 = "closeBulletin() network is unavailable"
            X.C0OPX.LJIIIIZZ(r0)
            return r9
        L4e:
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r6 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L79
            java.lang.Integer r14 = X.C2286608xc.LJ(r1)     // Catch: java.lang.Exception -> L79
            X.0ONJ r0 = r5.LL     // Catch: java.lang.Exception -> L79
            X.01GW r0 = r0.LLILLJJLI     // Catch: java.lang.Exception -> L79
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L79
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L79
            r7 = r21
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r0
            r19 = r4
            java.lang.Object r0 = r6.fetchBulletinEditAccount(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L79
            if (r0 != r3) goto L78
            return r3
        L78:
            return r0
        L79:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "closeBulletin() error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ONH.A0(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // X.C0OIU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLF(java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountCheckResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0ONP
            if (r0 == 0) goto L21
            r5 = r8
            X.0ONP r5 = (X.C0ONP) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L27
            goto L5d
        L21:
            X.0ONP r5 = new X.0ONP
            r5.<init>(r6, r8)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            boolean r0 = LJLZ()
            if (r0 != 0) goto L46
            java.lang.String r0 = "bulletinAccountCheck() network is unavailable"
            X.C0OPX.LJIIIIZZ(r0)
            return r3
        L46:
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r1 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L63
            X.0ONJ r0 = r6.LL     // Catch: java.lang.Exception -> L63
            X.01GW r0 = r0.LLILLJJLI     // Catch: java.lang.Exception -> L63
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L63
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L63
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L63
            java.lang.Object r1 = r1.LJJIIJZLJL(r7, r0, r5)     // Catch: java.lang.Exception -> L63
            if (r1 != r4) goto L60
            return r4
        L5d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L63
        L60:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountCheckResponse r1 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountCheckResponse) r1     // Catch: java.lang.Exception -> L63
            return r1
        L63:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "bulletinAccountCheck() error: "
            r1.append(r0)
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto L85
            java.lang.String r0 = r0.getMessage()
        L7a:
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            return r3
        L85:
            r0 = r3
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ONH.LLF(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.C0OIU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLIIII(boolean r6, X.InterfaceC1364105Vn<? super X.AbstractC1623806Xk<kotlin.Unit>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C0ONT
            if (r0 == 0) goto L20
            r4 = r7
            X.0ONT r4 = (X.C0ONT) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L43
        L20:
            X.0ONT r4 = new X.0ONT
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r1 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L5f
            if (r6 == 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L5f
            java.lang.Object r1 = r1.updateAutoShareLiveEventToBulletin(r0, r4)     // Catch: java.lang.Exception -> L5f
            if (r1 != r3) goto L46
            return r3
        L43:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L5f
        L46:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1     // Catch: java.lang.Exception -> L5f
            int r0 = r1.status_code     // Catch: java.lang.Exception -> L5f
            if (r0 != 0) goto L54
            X.06Xi r1 = new X.06Xi     // Catch: java.lang.Exception -> L5f
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Exception -> L5f
            r1.<init>(r0)     // Catch: java.lang.Exception -> L5f
            return r1
        L54:
            X.01vg r1 = new X.01vg     // Catch: java.lang.Exception -> L5f
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch: java.lang.Exception -> L5f
            r0.<init>()     // Catch: java.lang.Exception -> L5f
            r1.<init>(r0)     // Catch: java.lang.Exception -> L5f
            return r1
        L5f:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "setAutoShareLiveRoomToBulletinBoard() error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            X.01vg r1 = new X.01vg
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ONH.LLIIII(boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    @Override // X.C0OIU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLJIJIL(java.lang.String r11, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingList> r12) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ONH.LLJIJIL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // X.C0OIU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLJJJIL(long r12, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCloseResponse> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C0ONR
            if (r0 == 0) goto L21
            r10 = r14
            X.0ONR r10 = (X.C0ONR) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r1 = r10.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L27
            goto L73
        L21:
            X.0ONR r10 = new X.0ONR
            r10.<init>(r11, r14)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            boolean r0 = LJLZ()
            if (r0 != 0) goto L46
            java.lang.String r0 = "deleteBulletin() network is unavailable"
            X.C0OPX.LJIIIIZZ(r0)
            return r3
        L46:
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r5 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L79
            int r6 = X.C844470XAv.LJIIJ     // Catch: java.lang.Exception -> L79
            java.lang.String r7 = java.lang.String.valueOf(r12)     // Catch: java.lang.Exception -> L79
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L79
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = X.C0CQT.LIZJ     // Catch: java.lang.Exception -> L79
            r1.append(r0)     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = "/passport/collab/delete/confirm/"
            r1.append(r0)     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L79
            java.lang.String r9 = com.ss.android.account.token.TTTokenUtils.LIZ(r0)     // Catch: java.lang.Exception -> L79
            r10.LLILLL = r2     // Catch: java.lang.Exception -> L79
            java.lang.Object r1 = r5.fetchBulletinClose(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L79
            if (r1 != r4) goto L76
            return r4
        L73:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L79
        L76:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCloseResponse r1 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCloseResponse) r1     // Catch: java.lang.Exception -> L79
            return r1
        L79:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "deleteBulletin() error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ONH.LLJJJIL(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.C0OIU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLFF(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardUpdateInfo r12, X.InterfaceC1364105Vn<? super X.AbstractC1623806Xk<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C0ONK
            if (r0 == 0) goto L20
            r10 = r13
            X.0ONK r10 = (X.C0ONK) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r3 = r10.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L79
        L20:
            X.0ONK r10 = new X.0ONK
            r10.<init>(r11, r13)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            boolean r0 = LJLZ()
            if (r0 != 0) goto L51
            java.lang.String r0 = "createBulletin() network is unavailable"
            X.C0OPX.LJIIIIZZ(r0)
            X.01vg r2 = new X.01vg
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r0 = "NetworkUnAvailable"
            r1.<init>(r0)
            r2.<init>(r1)
            return r2
        L51:
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r3 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L93
            java.lang.String r4 = r12.name     // Catch: java.lang.Exception -> L93
            if (r4 != 0) goto L5b
            java.lang.String r4 = ""
        L5b:
            java.lang.String r5 = r12.avatarUrl     // Catch: java.lang.Exception -> L93
            java.lang.String r6 = r12.description     // Catch: java.lang.Exception -> L93
            java.lang.Boolean r7 = r12.showOnProfile     // Catch: java.lang.Exception -> L93
            r0 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L93
            X.0ONJ r0 = r11.LL     // Catch: java.lang.Exception -> L93
            X.01GW r0 = r0.LLILLJJLI     // Catch: java.lang.Exception -> L93
            java.lang.Object r9 = r0.getValue()     // Catch: java.lang.Exception -> L93
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L93
            r10.LLILLL = r1     // Catch: java.lang.Exception -> L93
            java.lang.Object r3 = r3.fetchBulletinCreateAccount(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L93
            if (r3 != r2) goto L7c
            return r2
        L79:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L93
        L7c:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse r3 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse) r3     // Catch: java.lang.Exception -> L93
            if (r3 == 0) goto L86
            X.06Xi r2 = new X.06Xi     // Catch: java.lang.Exception -> L93
            r2.<init>(r3)     // Catch: java.lang.Exception -> L93
            return r2
        L86:
            X.01vg r2 = new X.01vg     // Catch: java.lang.Exception -> L93
            java.lang.Throwable r1 = new java.lang.Throwable     // Catch: java.lang.Exception -> L93
            java.lang.String r0 = "response empty"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L93
            r2.<init>(r1)     // Catch: java.lang.Exception -> L93
            return r2
        L93:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "createBulletinBoard() error: "
            r1.append(r0)
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto Lba
            java.lang.String r0 = r0.getMessage()
        Laa:
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            X.01vg r0 = new X.01vg
            r0.<init>(r2)
            return r0
        Lba:
            r0 = 0
            goto Laa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ONH.LLLFF(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardUpdateInfo, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.C0OIU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLLIILL(boolean r6, X.InterfaceC1364105Vn<? super X.AbstractC1623806Xk<kotlin.Unit>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C0ONU
            if (r0 == 0) goto L20
            r4 = r7
            X.0ONU r4 = (X.C0ONU) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L58
        L20:
            X.0ONU r4 = new X.0ONU
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.0ONY r0 = com.ss.android.ugc.aweme.notification.api.NoticeLiveApi.LIZ     // Catch: java.lang.Exception -> L74
            r0.getClass()     // Catch: java.lang.Exception -> L74
            boolean r0 = X.C2222691Bz1.LJIIIIZZ()     // Catch: java.lang.Exception -> L74
            if (r0 == 0) goto L49
            java.lang.String r1 = "https://webcast.tiktokv.com"
        L3e:
            java.lang.Class<com.ss.android.ugc.aweme.notification.api.NoticeLiveApi> r0 = com.ss.android.ugc.aweme.notification.api.NoticeLiveApi.class
            java.lang.Object r1 = X.C09S2.LIZJ(r0, r1)     // Catch: java.lang.Exception -> L74
            com.ss.android.ugc.aweme.notification.api.NoticeLiveApi r1 = (com.ss.android.ugc.aweme.notification.api.NoticeLiveApi) r1     // Catch: java.lang.Exception -> L74
            if (r6 == 0) goto L4e
            goto L4c
        L49:
            java.lang.String r1 = "https://webcast-va.tiktokv.com"
            goto L3e
        L4c:
            r0 = 1
            goto L4f
        L4e:
            r0 = 0
        L4f:
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L74
            java.lang.Object r1 = r1.updateAutoShareLiveRoomToBulletin(r2, r0, r4)     // Catch: java.lang.Exception -> L74
            if (r1 != r3) goto L5b
            return r3
        L58:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L74
        L5b:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1     // Catch: java.lang.Exception -> L74
            int r0 = r1.status_code     // Catch: java.lang.Exception -> L74
            if (r0 != 0) goto L69
            X.06Xi r1 = new X.06Xi     // Catch: java.lang.Exception -> L74
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Exception -> L74
            r1.<init>(r0)     // Catch: java.lang.Exception -> L74
            return r1
        L69:
            X.01vg r1 = new X.01vg     // Catch: java.lang.Exception -> L74
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch: java.lang.Exception -> L74
            r0.<init>()     // Catch: java.lang.Exception -> L74
            r1.<init>(r0)     // Catch: java.lang.Exception -> L74
            return r1
        L74:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "setAutoShareLiveRoomToBulletinBoard() error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            X.01vg r1 = new X.01vg
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ONH.LLLLIILL(boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // X.C0OIU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLLLLJ(long r21, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse> r23) {
        /*
            r20 = this;
            r3 = r23
            boolean r0 = r3 instanceof X.C0ONS
            r5 = r20
            if (r0 == 0) goto L25
            r4 = r3
            X.0ONS r4 = (X.C0ONS) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r4.LLILLL = r2
        L16:
            java.lang.Object r0 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILLL
            r9 = 0
            r1 = 1
            if (r2 == 0) goto L37
            if (r2 != r1) goto L2f
            goto L2b
        L25:
            X.0ONS r4 = new X.0ONS
            r4.<init>(r5, r3)
            goto L16
        L2b:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Exception -> L7a
            return r0
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            X.C155000ia.LIZIZ(r0)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            boolean r0 = LJLZ()
            if (r0 != 0) goto L4e
            java.lang.String r0 = "reopenBulletin() network is unavailable"
            X.C0OPX.LJIIIIZZ(r0)
            return r9
        L4e:
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r6 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L7a
            r0 = 2
            java.lang.Integer r14 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> L7a
            X.0ONJ r0 = r5.LL     // Catch: java.lang.Exception -> L7a
            X.01GW r0 = r0.LLILLJJLI     // Catch: java.lang.Exception -> L7a
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L7a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L7a
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L7a
            r7 = r21
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r0
            r19 = r4
            java.lang.Object r0 = r6.fetchBulletinEditAccount(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L7a
            if (r0 != r3) goto L79
            return r3
        L79:
            return r0
        L7a:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "reopenBulletin() error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ONH.LLLLLLJ(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // X.C0OIU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r7, X.InterfaceC1364105Vn<? super X.AbstractC1623806Xk<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridResourceResponse>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C0ONM
            if (r0 == 0) goto L22
            r5 = r9
            X.0ONM r5 = (X.C0ONM) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            long r7 = r5.LL
            goto L4c
        L22:
            X.0ONM r5 = new X.0ONM
            r5.<init>(r6, r9)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r1 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L90
            X.0ONJ r0 = r6.LL     // Catch: java.lang.Exception -> L90
            X.01GW r0 = r0.LLILLL     // Catch: java.lang.Exception -> L90
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L90
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L90
            r5.LL = r7     // Catch: java.lang.Exception -> L90
            r5.LLILZ = r2     // Catch: java.lang.Exception -> L90
            java.lang.Object r4 = r1.LJJIL(r7, r0, r5)     // Catch: java.lang.Exception -> L90
            if (r4 != r3) goto L4f
            return r3
        L4c:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L90
        L4f:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridResourceResponse r4 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridResourceResponse) r4     // Catch: java.lang.Exception -> L90
            int r0 = r4.status_code     // Catch: java.lang.Exception -> L90
            if (r0 != 0) goto L66
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L90
            java.util.List r0 = r4.getPostScriptCfgs()     // Catch: java.lang.Exception -> L90
            X.C0OO1.LIZJ(r1, r0)     // Catch: java.lang.Exception -> L90
            X.06Xi r1 = new X.06Xi     // Catch: java.lang.Exception -> L90
            r1.<init>(r4)     // Catch: java.lang.Exception -> L90
            return r1
        L66:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L90
            java.lang.String r0 = "getBulletinAccountResource() status_code: "
            r1.append(r0)     // Catch: java.lang.Exception -> L90
            int r0 = r4.status_code     // Catch: java.lang.Exception -> L90
            r1.append(r0)     // Catch: java.lang.Exception -> L90
            java.lang.String r0 = ",response error: "
            r1.append(r0)     // Catch: java.lang.Exception -> L90
            java.lang.String r0 = r4.status_msg     // Catch: java.lang.Exception -> L90
            r1.append(r0)     // Catch: java.lang.Exception -> L90
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L90
            X.C0OPX.LJIIJ(r0)     // Catch: java.lang.Exception -> L90
            X.01vg r1 = new X.01vg     // Catch: java.lang.Exception -> L90
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch: java.lang.Exception -> L90
            r0.<init>()     // Catch: java.lang.Exception -> L90
            r1.<init>(r0)     // Catch: java.lang.Exception -> L90
            return r1
        L90:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getBulletinAccountResource() error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIJ(r0)
            X.01vg r1 = new X.01vg
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ONH.i(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.C0OIU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJLJL(java.lang.String r7, java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSetting> r8, X.InterfaceC1364105Vn<? super X.AbstractC1623806Xk<kotlin.Unit>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C0ONV
            if (r0 == 0) goto L20
            r5 = r9
            X.0ONV r5 = (X.C0ONV) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L47
        L20:
            X.0ONV r5 = new X.0ONV
            r5.<init>(r6, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r2 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L63
            com.ss.android.ugc.aweme.notification.api.BulletinUpdateSettingsInfoRequest r1 = new com.ss.android.ugc.aweme.notification.api.BulletinUpdateSettingsInfoRequest     // Catch: java.lang.Exception -> L63
            java.util.List r0 = java.util.Collections.singletonList(r7)     // Catch: java.lang.Exception -> L63
            r1.<init>(r0, r8)     // Catch: java.lang.Exception -> L63
            r5.LLILLL = r3     // Catch: java.lang.Exception -> L63
            java.lang.Object r1 = r2.LJJIIZ(r1, r5)     // Catch: java.lang.Exception -> L63
            if (r1 != r4) goto L4a
            return r4
        L47:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L63
        L4a:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1     // Catch: java.lang.Exception -> L63
            int r0 = r1.status_code     // Catch: java.lang.Exception -> L63
            if (r0 != 0) goto L58
            X.06Xi r1 = new X.06Xi     // Catch: java.lang.Exception -> L63
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Exception -> L63
            r1.<init>(r0)     // Catch: java.lang.Exception -> L63
            return r1
        L58:
            X.01vg r1 = new X.01vg     // Catch: java.lang.Exception -> L63
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch: java.lang.Exception -> L63
            r0.<init>()     // Catch: java.lang.Exception -> L63
            r1.<init>(r0)     // Catch: java.lang.Exception -> L63
            return r1
        L63:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "updateBulletinSettingsInfo() error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            X.01vg r1 = new X.01vg
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ONH.LJLJL(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // X.C0OIU
    public final C11JF LLLLIIIILLL(int i, AwS135S0201000_9 awS135S0201000_9, AwS553S0100000_9 awS553S0100000_9) {
        return (C11JF) NotificationApi.LIZ().LJJJIL("show_channel_on_profile", i).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS145S0200000_9(awS135S0201000_9, awS553S0100000_9, 9), new C516101zj(i, awS553S0100000_9, 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    @Override // X.C0OIU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJLLLLLLLZ(long r16, int r18, java.lang.String r19, java.lang.String r20, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse> r21) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ONH.LJJLIIIJLLLLLLLZ(long, int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.C0OIU
    public final Object LLILIL(String str, C0OM6 c0om6, C0ONE c0one, List<EventExtra> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C0ONF c0onf = C0ONF.LIZ;
        ArrayList arrayList = new ArrayList();
        BulletinEventReportRequest bulletinEventReportRequest = new BulletinEventReportRequest(arrayList);
        arrayList.add(new EventInfo(C2286608xc.LJ(c0om6.getValue()), C2286608xc.LJ(c0one.getValue()), str, String.valueOf(System.currentTimeMillis()), list));
        Object objLIZ = c0onf.LIZ(bulletinEventReportRequest, interfaceC1364105Vn);
        if (objLIZ != C099R.LJFF()) {
            objLIZ = Unit.LIZ;
        }
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    @Override // X.C0OIU
    public final C11JF LLJ(final int i, final String str, final int i2, C0OIY c0oiy, final AwS553S0100000_9 awS553S0100000_9) {
        return (C11JF) MultiApiManager.LIZ().updateInboxEntrance(i, i2, 0, 0, str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS178S0100000_9(c0oiy, 66), new C09JN() { // from class: X.01nw
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("BulletinBoardProfileRepository@428d._operator$1$performActionRequest$2");
                awS553S0100000_9.invoke();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("entrance action failed, entranceID {");
                sbLIZ.append(i);
                sbLIZ.append("}, actionType {");
                sbLIZ.append(i2);
                sbLIZ.append("}, entranceKey {");
                sbLIZ.append(str);
                sbLIZ.append("} error msg: ");
                sbLIZ.append(((Throwable) obj).getMessage());
                C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("BulletinBoardProfileRepository@428d._operator$1$performActionRequest$2");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // X.C0OIU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIL(long r21, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardUpdateInfo r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse> r27) {
        /*
            r20 = this;
            r3 = r27
            boolean r0 = r3 instanceof X.C0ONL
            r5 = r20
            if (r0 == 0) goto L25
            r4 = r3
            X.0ONL r4 = (X.C0ONL) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r4.LLILLL = r2
        L16:
            java.lang.Object r0 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILLL
            r1 = 1
            r13 = 0
            if (r2 == 0) goto L37
            if (r2 != r1) goto L2f
            goto L2b
        L25:
            X.0ONL r4 = new X.0ONL
            r4.<init>(r5, r3)
            goto L16
        L2b:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Exception -> L7d
            return r0
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            X.C155000ia.LIZIZ(r0)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            boolean r0 = LJLZ()
            if (r0 != 0) goto L4e
            java.lang.String r0 = "editBulletin() network is unavailable"
            X.C0OPX.LJIIIIZZ(r0)
            return r13
        L4e:
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r6 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L7d
            r0 = r23
            java.lang.String r9 = r0.name     // Catch: java.lang.Exception -> L7d
            java.lang.String r10 = r0.avatarUrl     // Catch: java.lang.Exception -> L7d
            java.lang.String r11 = r0.avatarUri     // Catch: java.lang.Exception -> L7d
            java.lang.String r12 = r0.description     // Catch: java.lang.Exception -> L7d
            X.0ONJ r0 = r5.LL     // Catch: java.lang.Exception -> L7d
            X.01GW r0 = r0.LLILLJJLI     // Catch: java.lang.Exception -> L7d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L7d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L7d
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L7d
            r17 = r26
            r15 = r24
            r7 = r21
            r16 = r25
            r14 = r13
            r19 = r4
            r18 = r0
            java.lang.Object r0 = r6.fetchBulletinEditAccount(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L7d
            if (r0 != r3) goto L7c
            return r3
        L7c:
            return r0
        L7d:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "createBulletinBoard() error: "
            r1.append(r0)
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto L9f
            java.lang.String r0 = r0.getMessage()
        L94:
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJIIIIZZ(r0)
            return r13
        L9f:
            r0 = r13
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ONH.LJJIL(long, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardUpdateInfo, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
