package X;

import android.accounts.NetworkErrorException;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX INFO: renamed from: X.0ybc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863980ybc {
    public static final C1863980ybc LIZ = new C1863980ybc();
    public static Function1<? super String, String> LIZIZ = AFwS274S0000000_30.get$arr$(349);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.net.TakoImageUploadAuthConfig> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof X.C1864340ycC
            if (r0 == 0) goto L20
            r3 = r14
            X.0ycC r3 = (X.C1864340ycC) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L40
        L20:
            X.0ycC r3 = new X.0ycC
            r3.<init>(r13, r14)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            X.01GW r0 = X.C1503800pEg.LIZ     // Catch: java.lang.Exception -> L56
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r0 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L56
            if (r0 == 0) goto L47
            r3.LLILLL = r1     // Catch: java.lang.Exception -> L56
            java.lang.Object r4 = r0.fetchImageUploadAuthConfig(r3)     // Catch: java.lang.Exception -> L56
            if (r4 != r2) goto L43
            return r2
        L40:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L56
        L43:
            com.ss.android.ugc.aweme.tako.ccl.net.TakoImageUploadAuthConfig r4 = (com.ss.android.ugc.aweme.tako.ccl.net.TakoImageUploadAuthConfig) r4     // Catch: java.lang.Exception -> L56
            if (r4 != 0) goto L68
        L47:
            com.ss.android.ugc.aweme.tako.ccl.net.TakoImageUploadAuthConfig r4 = new com.ss.android.ugc.aweme.tako.ccl.net.TakoImageUploadAuthConfig     // Catch: java.lang.Exception -> L56
            java.lang.String r5 = ""
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L56
            return r4
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoImageUploadAuthConfig r4 = new com.ss.android.ugc.aweme.tako.ccl.net.TakoImageUploadAuthConfig
            java.lang.String r5 = ""
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJIIIIZZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.InterfaceC1364105Vn<? super java.lang.Long> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1864260yc4
            if (r0 == 0) goto L22
            r4 = r6
            X.0yc4 r4 = (X.C1864260yc4) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            X.0ybc r0 = r4.LL
            goto L47
        L22:
            X.0yc4 r4 = new X.0yc4
            r4.<init>(r5, r6)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r0 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L44
            r4.LL = r5     // Catch: java.lang.Exception -> L52
            r4.LLILZ = r1     // Catch: java.lang.Exception -> L52
            java.lang.Object r3 = r0.inboxCursor(r4)     // Catch: java.lang.Exception -> L52
            if (r3 != r2) goto L42
            return r2
        L42:
            r0 = r5
            goto L4a
        L44:
            r3 = 0
            r0 = r5
            goto L4c
        L47:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L52
        L4a:
            com.ss.android.ugc.aweme.tako.ccl.net.GetUserInboxIndexResponse r3 = (com.ss.android.ugc.aweme.tako.ccl.net.GetUserInboxIndexResponse) r3     // Catch: java.lang.Exception -> L52
        L4c:
            LJJIIZI(r0, r3)     // Catch: java.lang.Exception -> L52
            long r0 = r3.inboxIndex     // Catch: java.lang.Exception -> L52
            goto L58
        L52:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = -1
        L58:
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJIIL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJLI(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.model.api.TakoTopTitleConfigResponse> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1864280yc6
            if (r0 == 0) goto L23
            r5 = r7
            X.0yc6 r5 = (X.C1864280yc6) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L31
            if (r0 != r2) goto L29
            X.0ybc r0 = r5.LL
            goto L48
        L23:
            X.0yc6 r5 = new X.0yc6
            r5.<init>(r6, r7)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r0 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L45
            r5.LL = r6     // Catch: java.lang.Exception -> L51
            r5.LLILZ = r2     // Catch: java.lang.Exception -> L51
            java.lang.Object r4 = r0.getTopTitleConfig(r5)     // Catch: java.lang.Exception -> L51
            if (r4 != r3) goto L43
            return r3
        L43:
            r0 = r6
            goto L4b
        L45:
            r0 = r6
            r4 = r1
            goto L4d
        L48:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L51
        L4b:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoTopTitleConfigResponse r4 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoTopTitleConfigResponse) r4     // Catch: java.lang.Exception -> L51
        L4d:
            LJJIIZI(r0, r4)     // Catch: java.lang.Exception -> L51
            return r4
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJIJJLI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C1864300yc8
            if (r0 == 0) goto L24
            r9 = r11
            X.0yc8 r9 = (X.C1864300yc8) r9
            int r2 = r9.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r9.LLILZ = r2
        L12:
            java.lang.Object r1 = r9.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILZ
            r8 = 0
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L32
            if (r0 != r5) goto L2a
            X.0ybc r0 = r9.LL
            goto L4b
        L24:
            X.0yc8 r9 = new X.0yc8
            r9.<init>(r10, r11)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r4 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L54
            if (r4 == 0) goto L48
            r9.LL = r10     // Catch: java.lang.Exception -> L54
            r9.LLILZ = r5     // Catch: java.lang.Exception -> L54
            r6 = 0
            java.lang.Object r1 = r4.botSetting(r5, r6, r8, r9)     // Catch: java.lang.Exception -> L54
            if (r1 != r3) goto L46
            return r3
        L46:
            r0 = r10
            goto L4e
        L48:
            r0 = r10
            r1 = r2
            goto L50
        L4b:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L54
        L4e:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse r1 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse) r1     // Catch: java.lang.Exception -> L54
        L50:
            LJJIIZI(r0, r1)     // Catch: java.lang.Exception -> L54
            return r1
        L54:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse r1 = new com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse
            r0 = 3
            r1.<init>(r2, r8, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJJIIZ(X.05Vn):java.lang.Object");
    }

    public static void LJJIIZI(C1863980ybc c1863980ybc, TakoBaseResponse takoBaseResponse) throws NetworkErrorException {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("message remote status code ");
        if (takoBaseResponse != null) {
            numValueOf = Integer.valueOf(takoBaseResponse.statusCode);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1863980ybc.getClass();
        if (takoBaseResponse != null && takoBaseResponse.statusCode == 0) {
        } else {
            throw new NetworkErrorException(strLIZIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.net.TakoBotCenterResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1864220yc0
            if (r0 == 0) goto L22
            r4 = r7
            X.0yc0 r4 = (X.C1864220yc0) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            X.0ybc r0 = r4.LL
            goto L47
        L22:
            X.0yc0 r4 = new X.0yc0
            r4.<init>(r5, r7)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r0 = X.C1503800pEg.LJ     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L44
            r4.LL = r5     // Catch: java.lang.Exception -> L50
            r4.LLILZ = r1     // Catch: java.lang.Exception -> L50
            java.lang.Object r3 = r0.botCenter(r6, r4)     // Catch: java.lang.Exception -> L50
            if (r3 != r2) goto L42
            return r2
        L42:
            r0 = r5
            goto L4a
        L44:
            r3 = 0
            r0 = r5
            goto L4c
        L47:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L50
        L4a:
            com.ss.android.ugc.aweme.tako.ccl.net.TakoBotCenterResponse r3 = (com.ss.android.ugc.aweme.tako.ccl.net.TakoBotCenterResponse) r3     // Catch: java.lang.Exception -> L50
        L4c:
            LJJIIZI(r0, r3)     // Catch: java.lang.Exception -> L50
            return r3
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoBotCenterResponse r3 = new com.ss.android.ugc.aweme.tako.ccl.net.TakoBotCenterResponse
            r2 = 0
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            r0 = 0
            r3.<init>(r1, r2, r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LIZLLL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(boolean r12, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C1864230yc1
            if (r0 == 0) goto L24
            r10 = r13
            X.0yc1 r10 = (X.C1864230yc1) r10
            int r2 = r10.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r10.LLILZ = r2
        L12:
            java.lang.Object r1 = r10.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r3 = r10.LLILZ
            r6 = 0
            r0 = 1
            r2 = 0
            if (r3 == 0) goto L32
            if (r3 != r0) goto L2a
            X.0ybc r0 = r10.LL
            goto L50
        L24:
            X.0yc1 r10 = new X.0yc1
            r10.<init>(r11, r13)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r5 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L59
            if (r5 == 0) goto L4d
            if (r12 == 0) goto L3d
            r9 = 1
            goto L3e
        L3d:
            r9 = 0
        L3e:
            r10.LL = r11     // Catch: java.lang.Exception -> L59
            r10.LLILZ = r0     // Catch: java.lang.Exception -> L59
            r7 = 0
            java.lang.Object r1 = r5.botSetting(r6, r7, r9, r10)     // Catch: java.lang.Exception -> L59
            if (r1 != r4) goto L4b
            return r4
        L4b:
            r0 = r11
            goto L53
        L4d:
            r0 = r11
            r1 = r2
            goto L55
        L50:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L59
        L53:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse r1 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse) r1     // Catch: java.lang.Exception -> L59
        L55:
            LJJIIZI(r0, r1)     // Catch: java.lang.Exception -> L59
            return r1
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse r1 = new com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse
            r0 = 3
            r1.<init>(r2, r6, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJFF(boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.net.TakoUserOtherResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1864270yc5
            if (r0 == 0) goto L23
            r5 = r8
            X.0yc5 r5 = (X.C1864270yc5) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L31
            if (r0 != r2) goto L29
            X.0ybc r0 = r5.LL
            goto L48
        L23:
            X.0yc5 r5 = new X.0yc5
            r5.<init>(r6, r8)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r0 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L45
            r5.LL = r6     // Catch: java.lang.Exception -> L51
            r5.LLILZ = r2     // Catch: java.lang.Exception -> L51
            java.lang.Object r4 = r0.fetchUserOther(r7, r1, r1, r5)     // Catch: java.lang.Exception -> L51
            if (r4 != r3) goto L43
            return r3
        L43:
            r0 = r6
            goto L4b
        L45:
            r0 = r6
            r4 = r1
            goto L4d
        L48:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L51
        L4b:
            com.ss.android.ugc.aweme.tako.ccl.net.TakoUserOtherResponse r4 = (com.ss.android.ugc.aweme.tako.ccl.net.TakoUserOtherResponse) r4     // Catch: java.lang.Exception -> L51
        L4d:
            LJJIIZI(r0, r4)     // Catch: java.lang.Exception -> L51
            return r4
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoUserOtherResponse r4 = new com.ss.android.ugc.aweme.tako.ccl.net.TakoUserOtherResponse
            r4.<init>(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJIILLIIL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(java.lang.Integer r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAdditonalPanelListResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1864110ybp
            if (r0 == 0) goto L23
            r5 = r8
            X.0ybp r5 = (X.C1864110ybp) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L31
            if (r0 != r2) goto L29
            X.0ybc r0 = r5.LL
            goto L48
        L23:
            X.0ybp r5 = new X.0ybp
            r5.<init>(r6, r8)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r0 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L45
            r5.LL = r6     // Catch: java.lang.Exception -> L51
            r5.LLILZ = r2     // Catch: java.lang.Exception -> L51
            java.lang.Object r4 = r0.getAdditionalPanelList(r7, r5)     // Catch: java.lang.Exception -> L51
            if (r4 != r3) goto L43
            return r3
        L43:
            r0 = r6
            goto L4b
        L45:
            r0 = r6
            r4 = r1
            goto L4d
        L48:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L51
        L4b:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAdditonalPanelListResponse r4 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAdditonalPanelListResponse) r4     // Catch: java.lang.Exception -> L51
        L4d:
            LJJIIZI(r0, r4)     // Catch: java.lang.Exception -> L51
            return r4
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJIIZILJ(java.lang.Integer, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(java.lang.Integer r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNewActionBarListResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1864120ybq
            if (r0 == 0) goto L23
            r5 = r8
            X.0ybq r5 = (X.C1864120ybq) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L31
            if (r0 != r2) goto L29
            X.0ybc r0 = r5.LL
            goto L48
        L23:
            X.0ybq r5 = new X.0ybq
            r5.<init>(r6, r8)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r0 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L45
            r5.LL = r6     // Catch: java.lang.Exception -> L51
            r5.LLILZ = r2     // Catch: java.lang.Exception -> L51
            java.lang.Object r4 = r0.getNewActionBarList(r7, r5)     // Catch: java.lang.Exception -> L51
            if (r4 != r3) goto L43
            return r3
        L43:
            r0 = r6
            goto L4b
        L45:
            r0 = r6
            r4 = r1
            goto L4d
        L48:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L51
        L4b:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNewActionBarListResponse r4 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNewActionBarListResponse) r4     // Catch: java.lang.Exception -> L51
        L4d:
            LJJIIZI(r0, r4)     // Catch: java.lang.Exception -> L51
            return r4
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJIJ(java.lang.Integer, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(70:0|2|(2:4|(1:6)(1:56))(0)|7|(1:(1:(76:11|12|(4:14|(4:16|(1:18)(1:37)|(1:20)|(1:22))|23|(4:25|(1:27)(1:36)|(1:29)|(1:31)))|32|(1:34)|35|348|57|(1:59)|60|(1:62)(1:63)|(1:68)(1:67)|(3:70|(4:73|(3:352|75|361)(3:351|76|(3:355|78|360)(3:353|79|(3:356|81|359)(3:354|82|358)))|357|71)|350)|83|(3:85|(3:88|(6:364|100|(1:102)(1:104)|103|369|368)(4:367|92|(5:366|94|(1:96)(1:98)|97|371)(3:365|99|370)|368)|86)|362)|105|106|(9:108|109|(1:113)(1:112)|114|115|(1:119)(1:118)|120|(1:122)(1:135)|123)|124|(1:134)(1:128)|129|(4:131|(2:133|136)(1:137)|(1:139)|(1:141))(2:142|(4:144|(1:146)(1:147)|(1:149)|(1:151)))|152|(1:154)(51:160|(1:167)(3:162|(1:164)(1:165)|(0))|187|(1:189)|190|(1:192)(1:294)|(1:194)(1:293)|(1:196)(3:286|(1:288)(1:291)|(1:290)(1:292))|197|(1:199)(1:285)|(1:201)|202|(1:204)(1:284)|(1:206)|(3:208|(1:210)(1:283)|(1:212))|213|(1:(1:274)(2:275|(2:277|(1:281))(1:282)))(1:217)|(1:219)(2:262|(2:264|(1:271)(1:270))(1:272))|(1:221)(1:261)|222|(1:224)(2:253|(2:255|(1:259))(1:260))|(1:226)(1:252)|227|(2:229|(2:231|(1:233)))(1:(1:250)(1:251))|(1:235)(1:248)|236|(4:238|(4:241|(1:382)(5:380|243|(1:245)(1:247)|246|383)|381|239)|379|295)(1:296)|297|(1:299)|300|(1:302)(1:345)|303|(1:305)(1:344)|(1:307)(1:343)|308|(1:310)(1:342)|(1:312)(1:341)|313|(1:315)|316|(1:340)|320|(1:322)(1:339)|323|(1:325)(1:338)|326|(1:328)(1:337)|(1:330)(1:336)|(1:332)(1:335)|333|334)|155|(3:157|(2:159|168)|(3:170|(5:173|(1:175)(1:176)|(1:376)(4:372|178|(1:180)(1:181)|(3:374|183|378)(1:377))|375|171)|373))|184|187|(0)|190|(0)(0)|(0)(0)|(0)(0)|197|(0)(0)|(0)|202|(0)(0)|(0)|(0)|213|(2:215|(0)(0))(0)|(0)(0)|(0)(0)|222|(0)(0)|(0)(0)|227|(0)(0)|(0)(0)|236|(0)(0)|297|(0)|300|(0)(0)|303|(0)(0)|(0)(0)|308|(0)(0)|(0)(0)|313|(0)|316|(2:318|340)(0)|320|(0)(0)|323|(0)(0)|326|(0)(0)|(0)(0)|(0)(0)|333|334)(2:346|347))(1:41))(2:38|(1:40))|42|(4:45|(2:49|385)(1:386)|50|43)|384|51|(2:53|(1:55))|12|(0)|32|(0)|35|348|57|(0)|60|(0)(0)|(10:65|68|(0)|83|(0)|105|106|(0)|124|(9:126|134|129|(0)(0)|152|(0)(0)|155|(0)|184)(0))(0)|187|(0)|190|(0)(0)|(0)(0)|(0)(0)|197|(0)(0)|(0)|202|(0)(0)|(0)|(0)|213|(0)(0)|(0)(0)|(0)(0)|222|(0)(0)|(0)(0)|227|(0)(0)|(0)(0)|236|(0)(0)|297|(0)|300|(0)(0)|303|(0)(0)|(0)(0)|308|(0)(0)|(0)(0)|313|(0)|316|(0)(0)|320|(0)(0)|323|(0)(0)|326|(0)(0)|(0)(0)|(0)(0)|333|334) */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0594, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0595, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x041c A[Catch: Exception -> 0x0594, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0594, blocks: (B:57:0x030f, B:59:0x034d, B:60:0x0352, B:62:0x0356, B:65:0x035d, B:70:0x036a, B:71:0x0372, B:73:0x0378, B:75:0x0386, B:76:0x038c, B:78:0x0390, B:79:0x0396, B:81:0x039a, B:82:0x03a0, B:83:0x03a8, B:85:0x03b2, B:86:0x03bc, B:88:0x03c2, B:90:0x03d0, B:92:0x03d8, B:94:0x03e0, B:96:0x03ea, B:97:0x03ee, B:99:0x03f5, B:100:0x0401, B:102:0x040b, B:103:0x040f, B:105:0x0416, B:108:0x041c, B:114:0x042c, B:120:0x043f, B:122:0x0446, B:123:0x044c, B:119:0x0439, B:113:0x0426, B:124:0x044f, B:126:0x046c, B:128:0x047e, B:129:0x0486, B:131:0x04b5, B:141:0x04d5, B:152:0x050f, B:154:0x0515, B:155:0x051a, B:157:0x0528, B:170:0x0555, B:171:0x055d, B:173:0x0563, B:178:0x0580, B:183:0x058b, B:184:0x058f, B:160:0x0531, B:162:0x053c, B:167:0x054b, B:142:0x04e3, B:144:0x04e9, B:151:0x0502), top: B:348:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04b5 A[Catch: Exception -> 0x0594, TryCatch #0 {Exception -> 0x0594, blocks: (B:57:0x030f, B:59:0x034d, B:60:0x0352, B:62:0x0356, B:65:0x035d, B:70:0x036a, B:71:0x0372, B:73:0x0378, B:75:0x0386, B:76:0x038c, B:78:0x0390, B:79:0x0396, B:81:0x039a, B:82:0x03a0, B:83:0x03a8, B:85:0x03b2, B:86:0x03bc, B:88:0x03c2, B:90:0x03d0, B:92:0x03d8, B:94:0x03e0, B:96:0x03ea, B:97:0x03ee, B:99:0x03f5, B:100:0x0401, B:102:0x040b, B:103:0x040f, B:105:0x0416, B:108:0x041c, B:114:0x042c, B:120:0x043f, B:122:0x0446, B:123:0x044c, B:119:0x0439, B:113:0x0426, B:124:0x044f, B:126:0x046c, B:128:0x047e, B:129:0x0486, B:131:0x04b5, B:141:0x04d5, B:152:0x050f, B:154:0x0515, B:155:0x051a, B:157:0x0528, B:170:0x0555, B:171:0x055d, B:173:0x0563, B:178:0x0580, B:183:0x058b, B:184:0x058f, B:160:0x0531, B:162:0x053c, B:167:0x054b, B:142:0x04e3, B:144:0x04e9, B:151:0x0502), top: B:348:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04e3 A[Catch: Exception -> 0x0594, TryCatch #0 {Exception -> 0x0594, blocks: (B:57:0x030f, B:59:0x034d, B:60:0x0352, B:62:0x0356, B:65:0x035d, B:70:0x036a, B:71:0x0372, B:73:0x0378, B:75:0x0386, B:76:0x038c, B:78:0x0390, B:79:0x0396, B:81:0x039a, B:82:0x03a0, B:83:0x03a8, B:85:0x03b2, B:86:0x03bc, B:88:0x03c2, B:90:0x03d0, B:92:0x03d8, B:94:0x03e0, B:96:0x03ea, B:97:0x03ee, B:99:0x03f5, B:100:0x0401, B:102:0x040b, B:103:0x040f, B:105:0x0416, B:108:0x041c, B:114:0x042c, B:120:0x043f, B:122:0x0446, B:123:0x044c, B:119:0x0439, B:113:0x0426, B:124:0x044f, B:126:0x046c, B:128:0x047e, B:129:0x0486, B:131:0x04b5, B:141:0x04d5, B:152:0x050f, B:154:0x0515, B:155:0x051a, B:157:0x0528, B:170:0x0555, B:171:0x055d, B:173:0x0563, B:178:0x0580, B:183:0x058b, B:184:0x058f, B:160:0x0531, B:162:0x053c, B:167:0x054b, B:142:0x04e3, B:144:0x04e9, B:151:0x0502), top: B:348:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0515 A[Catch: Exception -> 0x0594, TryCatch #0 {Exception -> 0x0594, blocks: (B:57:0x030f, B:59:0x034d, B:60:0x0352, B:62:0x0356, B:65:0x035d, B:70:0x036a, B:71:0x0372, B:73:0x0378, B:75:0x0386, B:76:0x038c, B:78:0x0390, B:79:0x0396, B:81:0x039a, B:82:0x03a0, B:83:0x03a8, B:85:0x03b2, B:86:0x03bc, B:88:0x03c2, B:90:0x03d0, B:92:0x03d8, B:94:0x03e0, B:96:0x03ea, B:97:0x03ee, B:99:0x03f5, B:100:0x0401, B:102:0x040b, B:103:0x040f, B:105:0x0416, B:108:0x041c, B:114:0x042c, B:120:0x043f, B:122:0x0446, B:123:0x044c, B:119:0x0439, B:113:0x0426, B:124:0x044f, B:126:0x046c, B:128:0x047e, B:129:0x0486, B:131:0x04b5, B:141:0x04d5, B:152:0x050f, B:154:0x0515, B:155:0x051a, B:157:0x0528, B:170:0x0555, B:171:0x055d, B:173:0x0563, B:178:0x0580, B:183:0x058b, B:184:0x058f, B:160:0x0531, B:162:0x053c, B:167:0x054b, B:142:0x04e3, B:144:0x04e9, B:151:0x0502), top: B:348:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0528 A[Catch: Exception -> 0x0594, TryCatch #0 {Exception -> 0x0594, blocks: (B:57:0x030f, B:59:0x034d, B:60:0x0352, B:62:0x0356, B:65:0x035d, B:70:0x036a, B:71:0x0372, B:73:0x0378, B:75:0x0386, B:76:0x038c, B:78:0x0390, B:79:0x0396, B:81:0x039a, B:82:0x03a0, B:83:0x03a8, B:85:0x03b2, B:86:0x03bc, B:88:0x03c2, B:90:0x03d0, B:92:0x03d8, B:94:0x03e0, B:96:0x03ea, B:97:0x03ee, B:99:0x03f5, B:100:0x0401, B:102:0x040b, B:103:0x040f, B:105:0x0416, B:108:0x041c, B:114:0x042c, B:120:0x043f, B:122:0x0446, B:123:0x044c, B:119:0x0439, B:113:0x0426, B:124:0x044f, B:126:0x046c, B:128:0x047e, B:129:0x0486, B:131:0x04b5, B:141:0x04d5, B:152:0x050f, B:154:0x0515, B:155:0x051a, B:157:0x0528, B:170:0x0555, B:171:0x055d, B:173:0x0563, B:178:0x0580, B:183:0x058b, B:184:0x058f, B:160:0x0531, B:162:0x053c, B:167:0x054b, B:142:0x04e3, B:144:0x04e9, B:151:0x0502), top: B:348:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0531 A[Catch: Exception -> 0x0594, TryCatch #0 {Exception -> 0x0594, blocks: (B:57:0x030f, B:59:0x034d, B:60:0x0352, B:62:0x0356, B:65:0x035d, B:70:0x036a, B:71:0x0372, B:73:0x0378, B:75:0x0386, B:76:0x038c, B:78:0x0390, B:79:0x0396, B:81:0x039a, B:82:0x03a0, B:83:0x03a8, B:85:0x03b2, B:86:0x03bc, B:88:0x03c2, B:90:0x03d0, B:92:0x03d8, B:94:0x03e0, B:96:0x03ea, B:97:0x03ee, B:99:0x03f5, B:100:0x0401, B:102:0x040b, B:103:0x040f, B:105:0x0416, B:108:0x041c, B:114:0x042c, B:120:0x043f, B:122:0x0446, B:123:0x044c, B:119:0x0439, B:113:0x0426, B:124:0x044f, B:126:0x046c, B:128:0x047e, B:129:0x0486, B:131:0x04b5, B:141:0x04d5, B:152:0x050f, B:154:0x0515, B:155:0x051a, B:157:0x0528, B:170:0x0555, B:171:0x055d, B:173:0x0563, B:178:0x0580, B:183:0x058b, B:184:0x058f, B:160:0x0531, B:162:0x053c, B:167:0x054b, B:142:0x04e3, B:144:0x04e9, B:151:0x0502), top: B:348:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x054b A[Catch: Exception -> 0x0594, TryCatch #0 {Exception -> 0x0594, blocks: (B:57:0x030f, B:59:0x034d, B:60:0x0352, B:62:0x0356, B:65:0x035d, B:70:0x036a, B:71:0x0372, B:73:0x0378, B:75:0x0386, B:76:0x038c, B:78:0x0390, B:79:0x0396, B:81:0x039a, B:82:0x03a0, B:83:0x03a8, B:85:0x03b2, B:86:0x03bc, B:88:0x03c2, B:90:0x03d0, B:92:0x03d8, B:94:0x03e0, B:96:0x03ea, B:97:0x03ee, B:99:0x03f5, B:100:0x0401, B:102:0x040b, B:103:0x040f, B:105:0x0416, B:108:0x041c, B:114:0x042c, B:120:0x043f, B:122:0x0446, B:123:0x044c, B:119:0x0439, B:113:0x0426, B:124:0x044f, B:126:0x046c, B:128:0x047e, B:129:0x0486, B:131:0x04b5, B:141:0x04d5, B:152:0x050f, B:154:0x0515, B:155:0x051a, B:157:0x0528, B:170:0x0555, B:171:0x055d, B:173:0x0563, B:178:0x0580, B:183:0x058b, B:184:0x058f, B:160:0x0531, B:162:0x053c, B:167:0x054b, B:142:0x04e3, B:144:0x04e9, B:151:0x0502), top: B:348:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x034d A[Catch: Exception -> 0x0594, TryCatch #0 {Exception -> 0x0594, blocks: (B:57:0x030f, B:59:0x034d, B:60:0x0352, B:62:0x0356, B:65:0x035d, B:70:0x036a, B:71:0x0372, B:73:0x0378, B:75:0x0386, B:76:0x038c, B:78:0x0390, B:79:0x0396, B:81:0x039a, B:82:0x03a0, B:83:0x03a8, B:85:0x03b2, B:86:0x03bc, B:88:0x03c2, B:90:0x03d0, B:92:0x03d8, B:94:0x03e0, B:96:0x03ea, B:97:0x03ee, B:99:0x03f5, B:100:0x0401, B:102:0x040b, B:103:0x040f, B:105:0x0416, B:108:0x041c, B:114:0x042c, B:120:0x043f, B:122:0x0446, B:123:0x044c, B:119:0x0439, B:113:0x0426, B:124:0x044f, B:126:0x046c, B:128:0x047e, B:129:0x0486, B:131:0x04b5, B:141:0x04d5, B:152:0x050f, B:154:0x0515, B:155:0x051a, B:157:0x0528, B:170:0x0555, B:171:0x055d, B:173:0x0563, B:178:0x0580, B:183:0x058b, B:184:0x058f, B:160:0x0531, B:162:0x053c, B:167:0x054b, B:142:0x04e3, B:144:0x04e9, B:151:0x0502), top: B:348:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0356 A[Catch: Exception -> 0x0594, TryCatch #0 {Exception -> 0x0594, blocks: (B:57:0x030f, B:59:0x034d, B:60:0x0352, B:62:0x0356, B:65:0x035d, B:70:0x036a, B:71:0x0372, B:73:0x0378, B:75:0x0386, B:76:0x038c, B:78:0x0390, B:79:0x0396, B:81:0x039a, B:82:0x03a0, B:83:0x03a8, B:85:0x03b2, B:86:0x03bc, B:88:0x03c2, B:90:0x03d0, B:92:0x03d8, B:94:0x03e0, B:96:0x03ea, B:97:0x03ee, B:99:0x03f5, B:100:0x0401, B:102:0x040b, B:103:0x040f, B:105:0x0416, B:108:0x041c, B:114:0x042c, B:120:0x043f, B:122:0x0446, B:123:0x044c, B:119:0x0439, B:113:0x0426, B:124:0x044f, B:126:0x046c, B:128:0x047e, B:129:0x0486, B:131:0x04b5, B:141:0x04d5, B:152:0x050f, B:154:0x0515, B:155:0x051a, B:157:0x0528, B:170:0x0555, B:171:0x055d, B:173:0x0563, B:178:0x0580, B:183:0x058b, B:184:0x058f, B:160:0x0531, B:162:0x053c, B:167:0x054b, B:142:0x04e3, B:144:0x04e9, B:151:0x0502), top: B:348:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x036a A[Catch: Exception -> 0x0594, TryCatch #0 {Exception -> 0x0594, blocks: (B:57:0x030f, B:59:0x034d, B:60:0x0352, B:62:0x0356, B:65:0x035d, B:70:0x036a, B:71:0x0372, B:73:0x0378, B:75:0x0386, B:76:0x038c, B:78:0x0390, B:79:0x0396, B:81:0x039a, B:82:0x03a0, B:83:0x03a8, B:85:0x03b2, B:86:0x03bc, B:88:0x03c2, B:90:0x03d0, B:92:0x03d8, B:94:0x03e0, B:96:0x03ea, B:97:0x03ee, B:99:0x03f5, B:100:0x0401, B:102:0x040b, B:103:0x040f, B:105:0x0416, B:108:0x041c, B:114:0x042c, B:120:0x043f, B:122:0x0446, B:123:0x044c, B:119:0x0439, B:113:0x0426, B:124:0x044f, B:126:0x046c, B:128:0x047e, B:129:0x0486, B:131:0x04b5, B:141:0x04d5, B:152:0x050f, B:154:0x0515, B:155:0x051a, B:157:0x0528, B:170:0x0555, B:171:0x055d, B:173:0x0563, B:178:0x0580, B:183:0x058b, B:184:0x058f, B:160:0x0531, B:162:0x053c, B:167:0x054b, B:142:0x04e3, B:144:0x04e9, B:151:0x0502), top: B:348:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03b2 A[Catch: Exception -> 0x0594, TryCatch #0 {Exception -> 0x0594, blocks: (B:57:0x030f, B:59:0x034d, B:60:0x0352, B:62:0x0356, B:65:0x035d, B:70:0x036a, B:71:0x0372, B:73:0x0378, B:75:0x0386, B:76:0x038c, B:78:0x0390, B:79:0x0396, B:81:0x039a, B:82:0x03a0, B:83:0x03a8, B:85:0x03b2, B:86:0x03bc, B:88:0x03c2, B:90:0x03d0, B:92:0x03d8, B:94:0x03e0, B:96:0x03ea, B:97:0x03ee, B:99:0x03f5, B:100:0x0401, B:102:0x040b, B:103:0x040f, B:105:0x0416, B:108:0x041c, B:114:0x042c, B:120:0x043f, B:122:0x0446, B:123:0x044c, B:119:0x0439, B:113:0x0426, B:124:0x044f, B:126:0x046c, B:128:0x047e, B:129:0x0486, B:131:0x04b5, B:141:0x04d5, B:152:0x050f, B:154:0x0515, B:155:0x051a, B:157:0x0528, B:170:0x0555, B:171:0x055d, B:173:0x0563, B:178:0x0580, B:183:0x058b, B:184:0x058f, B:160:0x0531, B:162:0x053c, B:167:0x054b, B:142:0x04e3, B:144:0x04e9, B:151:0x0502), top: B:348:0x030f }] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v4, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [X.0qdv, X.0ybU, com.ss.android.ugc.aweme.tako.ccl.model.api.MessageExt, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoEditInfo, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoEnhancedItemInfo, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoQuestionnaire, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoReferenceInfo, java.lang.Boolean, java.lang.String, java.util.List, java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker, v2] */
    /* JADX WARN: Type inference failed for: r16v6, types: [com.ss.android.ugc.aweme.tako.ccl.model.api.BotMarketInfo, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotItem, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoClientExt, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoDisclaimerInfo, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLynx, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMemory, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMultiModalInfo, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNimbleConfig, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoProductInfo, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSearchInfo, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug, com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoGenCard, java.lang.Long, java.lang.String, java.util.List, java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r19v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v142, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v146, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v148 */
    /* JADX WARN: Type inference failed for: r1v149, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v152 */
    /* JADX WARN: Type inference failed for: r1v153 */
    /* JADX WARN: Type inference failed for: r1v162 */
    /* JADX WARN: Type inference failed for: r1v163, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r1v172 */
    /* JADX WARN: Type inference failed for: r1v173, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r1v191 */
    /* JADX WARN: Type inference failed for: r1v192 */
    /* JADX WARN: Type inference failed for: r1v193 */
    /* JADX WARN: Type inference failed for: r1v194 */
    /* JADX WARN: Type inference failed for: r1v195 */
    /* JADX WARN: Type inference failed for: r1v88, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v1, types: [com.ss.ugc.clientai.core.api.meta.ReturnCode] */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v83, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v96, types: [com.google.gson.k, com.google.gson.n] */
    /* JADX WARN: Type inference failed for: r2v97, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.UpSyncMessage>] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r75v1 */
    /* JADX WARN: Type inference failed for: r75v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r75v4 */
    /* JADX WARN: Type inference failed for: r75v5 */
    /* JADX WARN: Type inference failed for: r75v6 */
    /* JADX WARN: Type inference failed for: r75v7 */
    /* JADX WARN: Type inference failed for: r77v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r78v0 */
    /* JADX WARN: Type inference failed for: r78v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r78v3 */
    /* JADX WARN: Type inference failed for: r79v0 */
    /* JADX WARN: Type inference failed for: r79v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r79v3 */
    /* JADX WARN: Type inference failed for: r86v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r86v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r86v2 */
    /* JADX WARN: Type inference failed for: r87v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r87v1 */
    /* JADX WARN: Type inference failed for: r87v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r87v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r87v4 */
    /* JADX WARN: Type inference failed for: r87v5 */
    /* JADX WARN: Type inference failed for: r89v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r90v0 */
    /* JADX WARN: Type inference failed for: r90v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r90v3 */
    /* JADX WARN: Type inference failed for: r91v0, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJ(defpackage.r2 r114, X.InterfaceC1364105Vn<? super X.C1863900ybU> r115) {
        /*
            Method dump skipped, instruction units count: 2164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJIJJ(r2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIII(java.util.Map<java.lang.String, java.lang.String> r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1864140ybs
            if (r0 == 0) goto L22
            r4 = r7
            X.0ybs r4 = (X.C1864140ybs) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            X.0ybc r0 = r4.LL
            goto L4d
        L22:
            X.0ybs r4 = new X.0ybs
            r4.<init>(r5, r7)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            X.01GW r0 = X.C1503800pEg.LIZIZ     // Catch: java.lang.Exception -> L56
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L56
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r0 = (com.ss.android.ugc.aweme.tako.ccl.net.TakoApi) r0     // Catch: java.lang.Exception -> L56
            if (r0 == 0) goto L4a
            r4.LL = r5     // Catch: java.lang.Exception -> L56
            r4.LLILZ = r1     // Catch: java.lang.Exception -> L56
            java.lang.Object r3 = r0.searchLandingPage(r6, r4)     // Catch: java.lang.Exception -> L56
            if (r3 != r2) goto L48
            return r2
        L48:
            r0 = r5
            goto L50
        L4a:
            r3 = 0
            r0 = r5
            goto L52
        L4d:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L56
        L50:
            com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse r3 = (com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse) r3     // Catch: java.lang.Exception -> L56
        L52:
            LJJIIZI(r0, r3)     // Catch: java.lang.Exception -> L56
            return r3
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse r3 = new com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse
            r0 = 0
            r3.<init>(r0, r0, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJJIII(java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(int r11, long r12, X.InterfaceC1364105Vn r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof X.C1864310yc9
            if (r0 == 0) goto L23
            r9 = r14
            X.0yc9 r9 = (X.C1864310yc9) r9
            int r2 = r9.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r9.LLILZ = r2
        L12:
            java.lang.Object r4 = r9.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILZ
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L31
            if (r0 != r2) goto L29
            X.0ybc r0 = r9.LL
            goto L53
        L23:
            X.0yc9 r9 = new X.0yc9
            r9.<init>(r10, r14)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r4 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L5c
            if (r4 == 0) goto L50
            X.0CoI r0 = X.C324800CoI.LIZ     // Catch: java.lang.Exception -> L5c
            r0.getClass()     // Catch: java.lang.Exception -> L5c
            boolean r8 = X.C324800CoI.LIZ()     // Catch: java.lang.Exception -> L5c
            r9.LL = r10     // Catch: java.lang.Exception -> L5c
            r9.LLILZ = r2     // Catch: java.lang.Exception -> L5c
            r5 = r12
            r7 = r11
            java.lang.Object r4 = r4.fetchConversation(r5, r7, r8, r9)     // Catch: java.lang.Exception -> L5c
            if (r4 != r3) goto L4e
            return r3
        L4e:
            r0 = r10
            goto L56
        L50:
            r0 = r10
            r4 = r1
            goto L58
        L53:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L5c
        L56:
            com.ss.android.ugc.aweme.tako.ccl.net.FetchConversationResponse r4 = (com.ss.android.ugc.aweme.tako.ccl.net.FetchConversationResponse) r4     // Catch: java.lang.Exception -> L5c
        L58:
            LJJIIZI(r0, r4)     // Catch: java.lang.Exception -> L5c
            return r4
        L5c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.FetchConversationResponse r4 = new com.ss.android.ugc.aweme.tako.ccl.net.FetchConversationResponse
            r4.<init>(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJI(int, long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(long r7, java.util.List<java.lang.String> r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.net.TakoLemon8AwemeResponse> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C1864250yc3
            if (r0 == 0) goto L23
            r5 = r10
            X.0yc3 r5 = (X.C1864250yc3) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L31
            if (r0 != r2) goto L29
            X.0ybc r0 = r5.LL
            goto L47
        L23:
            X.0yc3 r5 = new X.0yc3
            r5.<init>(r6, r10)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r0 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L45
            r5.LL = r6     // Catch: java.lang.Exception -> L51
            r5.LLILZ = r2     // Catch: java.lang.Exception -> L51
            java.lang.Object r4 = r0.fetchLemon8Awemes(r7, r9, r5)     // Catch: java.lang.Exception -> L51
            if (r4 != r3) goto L43
            return r3
        L43:
            r0 = r6
            goto L4a
        L45:
            r0 = r6
            goto L4d
        L47:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L51
        L4a:
            r1 = r4
            com.ss.android.ugc.aweme.tako.ccl.net.TakoLemon8AwemeResponse r1 = (com.ss.android.ugc.aweme.tako.ccl.net.TakoLemon8AwemeResponse) r1     // Catch: java.lang.Exception -> L51
        L4d:
            LJJIIZI(r0, r1)     // Catch: java.lang.Exception -> L51
            return r1
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoLemon8AwemeResponse r1 = new com.ss.android.ugc.aweme.tako.ccl.net.TakoLemon8AwemeResponse
            java.util.Map r0 = X.C2097608Jq.LJ()
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJIIIZ(long, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(java.lang.Integer r7, java.lang.String r8, X.InterfaceC1364105Vn r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C1864150ybt
            if (r0 == 0) goto L23
            r5 = r9
            X.0ybt r5 = (X.C1864150ybt) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L31
            if (r0 != r2) goto L29
            X.0ybc r0 = r5.LL
            goto L48
        L23:
            X.0ybt r5 = new X.0ybt
            r5.<init>(r6, r9)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r0 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L45
            r5.LL = r6     // Catch: java.lang.Exception -> L51
            r5.LLILZ = r2     // Catch: java.lang.Exception -> L51
            java.lang.Object r4 = r0.fetchTemplatesSquare(r8, r7, r5)     // Catch: java.lang.Exception -> L51
            if (r4 != r3) goto L43
            return r3
        L43:
            r0 = r6
            goto L4b
        L45:
            r0 = r6
            r4 = r1
            goto L4d
        L48:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L51
        L4b:
            com.ss.android.ugc.aweme.tako.ccl.net.TemplateTabsResponse r4 = (com.ss.android.ugc.aweme.tako.ccl.net.TemplateTabsResponse) r4     // Catch: java.lang.Exception -> L51
        L4d:
            LJJIIZI(r0, r4)     // Catch: java.lang.Exception -> L51
            return r4
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJIILIIL(java.lang.Integer, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIL(int r12, java.lang.String r13, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.net.GetUserSettingSwitchStatusResponse> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C1864290yc7
            if (r0 == 0) goto L22
            r10 = r14
            X.0yc7 r10 = (X.C1864290yc7) r10
            int r2 = r10.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r10.LLILZ = r2
        L12:
            java.lang.Object r0 = r10.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r10.LLILZ
            r1 = 1
            if (r2 == 0) goto L30
            if (r2 != r1) goto L28
            X.0ybc r1 = r10.LL
            goto L4d
        L22:
            X.0yc7 r10 = new X.0yc7
            r10.<init>(r11, r14)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r4 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L56
            if (r4 == 0) goto L4a
            r10.LL = r11     // Catch: java.lang.Exception -> L56
            r10.LLILZ = r1     // Catch: java.lang.Exception -> L56
            r7 = 0
            java.lang.String r8 = ""
            r6 = r13
            r5 = r12
            r9 = r7
            java.lang.Object r0 = r4.userSetting(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L56
            if (r0 != r3) goto L48
            return r3
        L48:
            r1 = r11
            goto L50
        L4a:
            r0 = 0
            r1 = r11
            goto L52
        L4d:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Exception -> L56
        L50:
            com.ss.android.ugc.aweme.tako.ccl.net.GetUserSettingSwitchStatusResponse r0 = (com.ss.android.ugc.aweme.tako.ccl.net.GetUserSettingSwitchStatusResponse) r0     // Catch: java.lang.Exception -> L56
        L52:
            LJJIIZI(r1, r0)     // Catch: java.lang.Exception -> L56
            return r0
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.GetUserSettingSwitchStatusResponse r0 = new com.ss.android.ugc.aweme.tako.ccl.net.GetUserSettingSwitchStatusResponse
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJIL(int, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJI(int r6, java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1864370ycF
            if (r0 == 0) goto L20
            r4 = r8
            X.0ycF r4 = (X.C1864370ycF) r4
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
            goto L40
        L20:
            X.0ycF r4 = new X.0ycF
            r4.<init>(r5, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.01GW r0 = X.C1503800pEg.LIZ     // Catch: java.lang.Exception -> L51
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r0 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L51
            if (r0 == 0) goto L47
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L51
            java.lang.Object r3 = r0.postQuestionnaireShow(r6, r7, r4)     // Catch: java.lang.Exception -> L51
            if (r3 != r2) goto L43
            return r2
        L40:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L51
        L43:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse r3 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse) r3     // Catch: java.lang.Exception -> L51
            if (r3 != 0) goto L5e
        L47:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse r3 = new com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse     // Catch: java.lang.Exception -> L51
            r2 = 0
            r1 = 0
            java.lang.String r0 = ""
            r3.<init>(r2, r1, r0)     // Catch: java.lang.Exception -> L51
            return r3
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse r3 = new com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse
            r2 = 0
            r1 = 0
            java.lang.String r0 = ""
            r3.<init>(r2, r1, r0)
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJJI(int, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJ(int r12, java.lang.String r13, X.InterfaceC1364105Vn r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C1864330ycB
            if (r0 == 0) goto L22
            r10 = r14
            X.0ycB r10 = (X.C1864330ycB) r10
            int r2 = r10.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r10.LLILZ = r2
        L12:
            java.lang.Object r0 = r10.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r10.LLILZ
            r1 = 1
            if (r2 == 0) goto L30
            if (r2 != r1) goto L28
            X.0ybc r1 = r10.LL
            goto L4e
        L22:
            X.0ycB r10 = new X.0ycB
            r10.<init>(r11, r14)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r4 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L57
            if (r4 == 0) goto L4b
            r10.LL = r11     // Catch: java.lang.Exception -> L57
            r10.LLILZ = r1     // Catch: java.lang.Exception -> L57
            r5 = 8
            r7 = 0
            java.lang.String r8 = ""
            r6 = r13
            r9 = r12
            java.lang.Object r0 = r4.userSetting(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L57
            if (r0 != r3) goto L49
            return r3
        L49:
            r1 = r11
            goto L51
        L4b:
            r0 = 0
            r1 = r11
            goto L53
        L4e:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Exception -> L57
        L51:
            com.ss.android.ugc.aweme.tako.ccl.net.GetUserSettingSwitchStatusResponse r0 = (com.ss.android.ugc.aweme.tako.ccl.net.GetUserSettingSwitchStatusResponse) r0     // Catch: java.lang.Exception -> L57
        L53:
            LJJIIZI(r1, r0)     // Catch: java.lang.Exception -> L57
            return r0
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.GetUserSettingSwitchStatusResponse r0 = new com.ss.android.ugc.aweme.tako.ccl.net.GetUserSettingSwitchStatusResponse
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJJIIJ(int, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage> r10, java.lang.String r11, java.lang.String r12, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.net.BatchUpdateMessageResponse> r13) {
        /*
            r9 = this;
            r5 = r11
            boolean r0 = r13 instanceof X.C1864210ybz
            if (r0 == 0) goto L24
            r8 = r13
            X.0ybz r8 = (X.C1864210ybz) r8
            int r2 = r8.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r8.LLILZ = r2
        L13:
            java.lang.Object r3 = r8.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r1 = 1
            r7 = 0
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            X.0ybc r0 = r8.LL
            goto L59
        L24:
            X.0ybz r8 = new X.0ybz
            r8.<init>(r9, r13)
            goto L13
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r3 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L62
            if (r3 == 0) goto L56
            com.google.gson.Gson r0 = X.C597040NbK.LIZ()     // Catch: java.lang.Exception -> L62
            java.lang.String r4 = r0.LJIILL(r10)     // Catch: java.lang.Exception -> L62
            java.lang.String r6 = ""
            if (r5 != 0) goto L46
            r5 = r6
        L46:
            if (r12 == 0) goto L49
            r6 = r12
        L49:
            r8.LL = r9     // Catch: java.lang.Exception -> L62
            r8.LLILZ = r1     // Catch: java.lang.Exception -> L62
            java.lang.Object r3 = r3.batchUpdateMessage(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L62
            if (r3 != r2) goto L54
            return r2
        L54:
            r0 = r9
            goto L5c
        L56:
            r0 = r9
            r3 = r7
            goto L5e
        L59:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L62
        L5c:
            com.ss.android.ugc.aweme.tako.ccl.net.BatchUpdateMessageResponse r3 = (com.ss.android.ugc.aweme.tako.ccl.net.BatchUpdateMessageResponse) r3     // Catch: java.lang.Exception -> L62
        L5e:
            LJJIIZI(r0, r3)     // Catch: java.lang.Exception -> L62
            return r3
        L62:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.BatchUpdateMessageResponse r3 = new com.ss.android.ugc.aweme.tako.ccl.net.BatchUpdateMessageResponse
            r3.<init>(r7, r1, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LIZIZ(java.util.List, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r12, java.lang.String r13, java.lang.String r14, X.InterfaceC1364105Vn r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof X.C1864180ybw
            if (r0 == 0) goto L22
            r4 = r15
            X.0ybw r4 = (X.C1864180ybw) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            X.0ybc r0 = r4.LL
            goto L4c
        L22:
            X.0ybw r4 = new X.0ybw
            r4.<init>(r11, r15)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r1 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L55
            if (r1 == 0) goto L49
            com.ss.android.ugc.aweme.tako.ccl.net.AudioAuthRequest r0 = new com.ss.android.ugc.aweme.tako.ccl.net.AudioAuthRequest     // Catch: java.lang.Exception -> L55
            r0.<init>(r13, r14, r12)     // Catch: java.lang.Exception -> L55
            r4.LL = r11     // Catch: java.lang.Exception -> L55
            r4.LLILZ = r2     // Catch: java.lang.Exception -> L55
            java.lang.Object r1 = r1.fetchAudioAuthInfo(r0, r4)     // Catch: java.lang.Exception -> L55
            if (r1 != r3) goto L47
            return r3
        L47:
            r0 = r11
            goto L4f
        L49:
            r1 = 0
            r0 = r11
            goto L51
        L4c:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L55
        L4f:
            com.ss.android.ugc.aweme.tako.ccl.net.AudioAuthResponse r1 = (com.ss.android.ugc.aweme.tako.ccl.net.AudioAuthResponse) r1     // Catch: java.lang.Exception -> L55
        L51:
            LJJIIZI(r0, r1)     // Catch: java.lang.Exception -> L55
            return r1
        L55:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.AudioAuthResponse r1 = new com.ss.android.ugc.aweme.tako.ccl.net.AudioAuthResponse
            r10 = 0
            java.lang.String r2 = ""
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LIZJ(int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(int r12, long r13, boolean r15, X.InterfaceC1364105Vn r16) {
        /*
            r11 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C1864240yc2
            if (r0 == 0) goto L26
            r10 = r3
            X.0yc2 r10 = (X.C1864240yc2) r10
            int r2 = r10.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r10.LLILZ = r2
        L14:
            java.lang.Object r5 = r10.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r3 = r10.LLILZ
            r2 = 0
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L34
            if (r3 != r0) goto L2c
            X.0ybc r0 = r10.LL
            goto L52
        L26:
            X.0yc2 r10 = new X.0yc2
            r10.<init>(r11, r3)
            goto L14
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r5)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r5 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L5b
            if (r5 == 0) goto L4f
            if (r15 == 0) goto L3f
            r9 = 1
            goto L40
        L3f:
            r9 = 0
        L40:
            r10.LL = r11     // Catch: java.lang.Exception -> L5b
            r10.LLILZ = r0     // Catch: java.lang.Exception -> L5b
            r7 = r13
            r6 = r12
            java.lang.Object r5 = r5.botSetting(r6, r7, r9, r10)     // Catch: java.lang.Exception -> L5b
            if (r5 != r4) goto L4d
            return r4
        L4d:
            r0 = r11
            goto L55
        L4f:
            r0 = r11
            r5 = r1
            goto L57
        L52:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> L5b
        L55:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse r5 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse) r5     // Catch: java.lang.Exception -> L5b
        L57:
            LJJIIZI(r0, r5)     // Catch: java.lang.Exception -> L5b
            return r5
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse r5 = new com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse
            r0 = 3
            r5.<init>(r1, r2, r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJ(int, long, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(long r16, X.C1863380yae r18, int r19, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.net.GetIncrementalMsgResponse> r20) {
        /*
            r15 = this;
            r2 = r18
            r0 = 202471(0x316e7, float:2.83722E-40)
            boolean r5 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            r4 = r20
            boolean r0 = r4 instanceof X.C1864100ybo
            if (r0 == 0) goto L3b
            r14 = r4
            X.0ybo r14 = (X.C1864100ybo) r14
            int r3 = r14.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L3b
            int r3 = r3 - r1
            r14.LLILZIL = r3
        L1d:
            java.lang.Object r6 = r14.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r14.LLILZIL
            r7 = 0
            r0 = 1
            r3 = 2
            if (r1 == 0) goto L4b
            if (r1 == r0) goto L41
            if (r1 == r3) goto L92
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r5 == 0) goto L3a
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L3a:
            throw r1
        L3b:
            X.0ybo r14 = new X.0ybo
            r14.<init>(r15, r4)
            goto L1d
        L41:
            X.0ybc r0 = r14.LLILLJJLI
            java.lang.Object r2 = r14.LL
            X.0yae r2 = (X.C1863380yae) r2
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> L79
            goto L6f
        L4b:
            X.C155000ia.LIZIZ(r6)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r8 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L77
            if (r8 == 0) goto L6c
            r14.LL = r2     // Catch: java.lang.Exception -> L75
            r14.LLILLJJLI = r15     // Catch: java.lang.Exception -> L75
            r14.LLILZIL = r0     // Catch: java.lang.Exception -> L75
            r11 = 50
            r9 = r16
            r13 = r19
            java.lang.Object r6 = r8.inboxPull(r9, r11, r13, r14)     // Catch: java.lang.Exception -> L75
            if (r6 != r4) goto L6a
            if (r5 == 0) goto L69
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L69:
            return r4
        L6a:
            r0 = r15
            goto L6f
        L6c:
            r0 = r15
            r6 = r7
            goto L71
        L6f:
            com.ss.android.ugc.aweme.tako.ccl.net.GetIncrementalMsgResponse r6 = (com.ss.android.ugc.aweme.tako.ccl.net.GetIncrementalMsgResponse) r6     // Catch: java.lang.Exception -> L75
        L71:
            LJJIIZI(r0, r6)     // Catch: java.lang.Exception -> L75
            goto La1
        L75:
            r0 = move-exception
            goto L7a
        L77:
            r0 = move-exception
            goto L7a
        L79:
            r0 = move-exception
        L7a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0yag r1 = X.C1863400yag.LIZ
            r14.LL = r0
            r14.LLILLJJLI = r7
            r14.LLILZIL = r3
            r0 = 6
            java.lang.Object r0 = X.C1863400yag.LIZLLL(r1, r2, r7, r14, r0)
            if (r0 != r4) goto L95
            if (r5 == 0) goto L91
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L91:
            return r4
        L92:
            X.C155000ia.LIZIZ(r6)
        L95:
            com.ss.android.ugc.aweme.tako.ccl.net.GetIncrementalMsgResponse r6 = new com.ss.android.ugc.aweme.tako.ccl.net.GetIncrementalMsgResponse
            r8 = 0
            r10 = 0
            r12 = 15
            r11 = r10
            r13 = r7
            r6.<init>(r7, r8, r10, r11, r12, r13)
        La1:
            if (r5 == 0) goto La6
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        La6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJIIJ(long, X.0yae, int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.lang.String r11, long r12, int r14, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.net.FetchSubConversationListResponse> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof X.C1864170ybv
            if (r0 == 0) goto L22
            r8 = r15
            X.0ybv r8 = (X.C1864170ybv) r8
            int r2 = r8.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r8.LLILZ = r2
        L12:
            java.lang.Object r3 = r8.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r8.LLILZ
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 != r0) goto L28
            X.0ybc r0 = r8.LL
            goto L4a
        L22:
            X.0ybv r8 = new X.0ybv
            r8.<init>(r10, r15)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r3 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L53
            if (r3 == 0) goto L47
            r8.LL = r10     // Catch: java.lang.Exception -> L53
            r8.LLILZ = r0     // Catch: java.lang.Exception -> L53
            r7 = r14
            r5 = r12
            r4 = r11
            java.lang.Object r3 = r3.fetchSubConversationList(r4, r5, r7, r8)     // Catch: java.lang.Exception -> L53
            if (r3 != r2) goto L45
            return r2
        L45:
            r0 = r10
            goto L4d
        L47:
            r3 = 0
            r0 = r10
            goto L4f
        L4a:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L53
        L4d:
            com.ss.android.ugc.aweme.tako.ccl.net.FetchSubConversationListResponse r3 = (com.ss.android.ugc.aweme.tako.ccl.net.FetchSubConversationListResponse) r3     // Catch: java.lang.Exception -> L53
        L4f:
            LJJIIZI(r0, r3)     // Catch: java.lang.Exception -> L53
            return r3
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.FetchSubConversationListResponse r3 = new com.ss.android.ugc.aweme.tako.ccl.net.FetchSubConversationListResponse
            r4 = 0
            r5 = 0
            r8 = 15
            r6 = r5
            r7 = r5
            r9 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0 = -1
            r3.statusCode = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJIIJJI(java.lang.String, long, int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(java.lang.String r6, java.lang.String r7, int r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.net.TakoOnBoardingResponse> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C1864360ycE
            if (r0 == 0) goto L20
            r4 = r9
            X.0ycE r4 = (X.C1864360ycE) r4
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
            goto L40
        L20:
            X.0ycE r4 = new X.0ycE
            r4.<init>(r5, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.01GW r0 = X.C1503800pEg.LIZ     // Catch: java.lang.Exception -> L4f
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r0 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L4f
            if (r0 == 0) goto L47
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L4f
            java.lang.Object r3 = r0.getOnboardingClickData(r6, r7, r8, r4)     // Catch: java.lang.Exception -> L4f
            if (r3 != r2) goto L43
            return r2
        L40:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L4f
        L43:
            com.ss.android.ugc.aweme.tako.ccl.net.TakoOnBoardingResponse r3 = (com.ss.android.ugc.aweme.tako.ccl.net.TakoOnBoardingResponse) r3     // Catch: java.lang.Exception -> L4f
            if (r3 != 0) goto L5a
        L47:
            com.ss.android.ugc.aweme.tako.ccl.net.TakoOnBoardingResponse r3 = new com.ss.android.ugc.aweme.tako.ccl.net.TakoOnBoardingResponse     // Catch: java.lang.Exception -> L4f
            r1 = 0
            r0 = 0
            r3.<init>(r0, r1, r1, r1)     // Catch: java.lang.Exception -> L4f
            return r3
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoOnBoardingResponse r3 = new com.ss.android.ugc.aweme.tako.ccl.net.TakoOnBoardingResponse
            r1 = 0
            r0 = 0
            r3.<init>(r0, r1, r1, r1)
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJIJI(java.lang.String, java.lang.String, int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[Catch: Exception -> 0x00a9, TryCatch #0 {Exception -> 0x00a9, blocks: (B:26:0x0062, B:27:0x0065, B:28:0x0067, B:30:0x006e, B:31:0x0072, B:33:0x0078, B:35:0x0084, B:37:0x0088, B:38:0x0099, B:40:0x00a5, B:17:0x0041, B:19:0x0045), top: B:47:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5 A[Catch: Exception -> 0x00a9, TryCatch #0 {Exception -> 0x00a9, blocks: (B:26:0x0062, B:27:0x0065, B:28:0x0067, B:30:0x006e, B:31:0x0072, B:33:0x0078, B:35:0x0084, B:37:0x0088, B:38:0x0099, B:40:0x00a5, B:17:0x0041, B:19:0x0045), top: B:47:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(long r14, int r16, java.lang.String r17, java.lang.String r18, X.InterfaceC1364105Vn r19) throws java.lang.Exception {
        /*
            r13 = this;
            r0 = 202469(0x316e5, float:2.8372E-40)
            boolean r4 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            r3 = r19
            boolean r0 = r3 instanceof X.C1864320ycA
            if (r0 == 0) goto L35
            r12 = r3
            X.0ycA r12 = (X.C1864320ycA) r12
            int r2 = r12.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r12.LLILZ = r2
        L1b:
            java.lang.Object r3 = r12.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r12.LLILZ
            r0 = 1
            if (r1 == 0) goto L3e
            if (r1 == r0) goto L3b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r4 == 0) goto L34
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L34:
            throw r1
        L35:
            X.0ycA r12 = new X.0ycA
            r12.<init>(r13, r3)
            goto L1b
        L3b:
            X.0ybc r0 = r12.LL
            goto L62
        L3e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r5 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> La9
            if (r5 == 0) goto L5f
            r12.LL = r13     // Catch: java.lang.Exception -> La9
            r12.LLILZ = r0     // Catch: java.lang.Exception -> La9
            r11 = 2
            r7 = r18
            r6 = r17
            r8 = r16
            r9 = r14
            java.lang.Object r3 = r5.loadMoreMsgByConversation(r6, r7, r8, r9, r11, r12)     // Catch: java.lang.Exception -> La9
            if (r3 != r2) goto L5d
            if (r4 == 0) goto L5c
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L5c:
            return r2
        L5d:
            r0 = r13
            goto L65
        L5f:
            r3 = 0
            r0 = r13
            goto L67
        L62:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> La9
        L65:
            com.ss.android.ugc.aweme.tako.ccl.net.LoadMoreMsgByConversationResponse r3 = (com.ss.android.ugc.aweme.tako.ccl.net.LoadMoreMsgByConversationResponse) r3     // Catch: java.lang.Exception -> La9
        L67:
            LJJIIZI(r0, r3)     // Catch: java.lang.Exception -> La9
            java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.Message> r0 = r3.messages     // Catch: java.lang.Exception -> La9
            if (r0 == 0) goto La3
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> La9
        L72:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> La9
            if (r0 == 0) goto La3
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> La9
            com.ss.android.ugc.aweme.tako.ccl.model.api.Message r1 = (com.ss.android.ugc.aweme.tako.ccl.model.api.Message) r1     // Catch: java.lang.Exception -> La9
            boolean r0 = X.C07IB.LIZ()     // Catch: java.lang.Exception -> La9
            if (r0 != 0) goto L99
            boolean r0 = r1.isMultiAnswer     // Catch: java.lang.Exception -> La9
            if (r0 == 0) goto L99
            java.lang.String r0 = r1.msgContent     // Catch: java.lang.Exception -> La9
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r0 = X.C1860390yVp.LJI(r0)     // Catch: java.lang.Exception -> La9
            r1.LJIJ = r0     // Catch: java.lang.Exception -> La9
            java.lang.String r0 = r1.multiMsgContent     // Catch: java.lang.Exception -> La9
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r0 = X.C1860390yVp.LJI(r0)     // Catch: java.lang.Exception -> La9
            r1.LJIJI = r0     // Catch: java.lang.Exception -> La9
            goto L72
        L99:
            java.lang.String r0 = r1.msgContent     // Catch: java.lang.Exception -> La9
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r0 = X.C1860390yVp.LJI(r0)     // Catch: java.lang.Exception -> La9
            r1.LJIIJ(r0)     // Catch: java.lang.Exception -> La9
            goto L72
        La3:
            if (r4 == 0) goto La8
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()     // Catch: java.lang.Exception -> La9
        La8:
            return r3
        La9:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r4 == 0) goto Lb2
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        Lb2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJII(long, int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJZLJL(int r12, int r13, java.lang.String r14, java.lang.String r15, X.InterfaceC1364105Vn r16) {
        /*
            r11 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C1864190ybx
            if (r0 == 0) goto L24
            r10 = r3
            X.0ybx r10 = (X.C1864190ybx) r10
            int r2 = r10.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r10.LLILZ = r2
        L14:
            java.lang.Object r0 = r10.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r10.LLILZ
            r1 = 1
            if (r2 == 0) goto L32
            if (r2 != r1) goto L2a
            X.0ybc r1 = r10.LL
            goto L4e
        L24:
            X.0ybx r10 = new X.0ybx
            r10.<init>(r11, r3)
            goto L14
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r4 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L57
            if (r4 == 0) goto L4b
            r10.LL = r11     // Catch: java.lang.Exception -> L57
            r10.LLILZ = r1     // Catch: java.lang.Exception -> L57
            r9 = 0
            r8 = r15
            r6 = r14
            r7 = r13
            r5 = r12
            java.lang.Object r0 = r4.userSetting(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L57
            if (r0 != r3) goto L49
            return r3
        L49:
            r1 = r11
            goto L51
        L4b:
            r0 = 0
            r1 = r11
            goto L53
        L4e:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Exception -> L57
        L51:
            com.ss.android.ugc.aweme.tako.ccl.net.GetUserSettingSwitchStatusResponse r0 = (com.ss.android.ugc.aweme.tako.ccl.net.GetUserSettingSwitchStatusResponse) r0     // Catch: java.lang.Exception -> L57
        L53:
            LJJIIZI(r1, r0)     // Catch: java.lang.Exception -> L57
            goto L5b
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJJIIJZLJL(int, int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.util.List r15, X.InterfaceC1364105Vn r16, boolean r17) {
        /*
            r11 = this;
            r6 = r12
            r3 = r16
            r9 = r17
            boolean r0 = r3 instanceof X.C1864160ybu
            if (r0 == 0) goto L2a
            r10 = r3
            X.0ybu r10 = (X.C1864160ybu) r10
            int r2 = r10.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r10.LLILZIL = r2
        L17:
            java.lang.Object r4 = r10.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LLILZIL
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3c
            if (r0 != r1) goto L34
            boolean r9 = r10.LL
            X.0ybc r0 = r10.LLILLJJLI
            goto L30
        L2a:
            X.0ybu r10 = new X.0ybu
            r10.<init>(r11, r3)
            goto L17
        L30:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L70
            goto L66
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3c:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r4 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L6e
            if (r4 == 0) goto L63
            com.google.gson.Gson r0 = X.C597040NbK.LIZ()     // Catch: java.lang.Exception -> L6e
            java.lang.String r5 = r0.LJIILL(r15)     // Catch: java.lang.Exception -> L6e
            java.lang.String r7 = ""
            if (r6 != 0) goto L50
            r6 = r7
        L50:
            if (r13 == 0) goto L53
            r7 = r13
        L53:
            r10.LLILLJJLI = r11     // Catch: java.lang.Exception -> L6e
            r10.LL = r9     // Catch: java.lang.Exception -> L6c
            r10.LLILZIL = r1     // Catch: java.lang.Exception -> L6c
            r8 = r14
            java.lang.Object r4 = r4.batchDelete(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L6c
            if (r4 != r3) goto L61
            return r3
        L61:
            r0 = r11
            goto L66
        L63:
            r0 = r11
            r4 = r2
            goto L68
        L66:
            com.ss.android.ugc.aweme.tako.ccl.net.BatchDeleteResponse r4 = (com.ss.android.ugc.aweme.tako.ccl.net.BatchDeleteResponse) r4     // Catch: java.lang.Exception -> L6c
        L68:
            LJJIIZI(r0, r4)     // Catch: java.lang.Exception -> L6c
            return r4
        L6c:
            r0 = move-exception
            goto L71
        L6e:
            r0 = move-exception
            goto L71
        L70:
            r0 = move-exception
        L71:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r9 == 0) goto L7c
            com.ss.android.ugc.aweme.tako.ccl.net.BatchDeleteResponse r4 = new com.ss.android.ugc.aweme.tako.ccl.net.BatchDeleteResponse
            r4.<init>(r2, r1, r1, r2)
            return r4
        L7c:
            com.ss.android.ugc.aweme.tako.ccl.net.BatchDeleteResponse r4 = new com.ss.android.ugc.aweme.tako.ccl.net.BatchDeleteResponse
            r1 = 3
            r0 = 0
            r4.<init>(r2, r0, r1, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LIZ(java.lang.String, java.lang.String, java.lang.String, java.util.List, X.05Vn, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIFFI(int r11, java.lang.String r12, int r13, java.lang.String r14, java.lang.String r15, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse> r16) {
        /*
            r10 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C1864380ycG
            if (r0 == 0) goto L22
            r9 = r3
            X.0ycG r9 = (X.C1864380ycG) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r9.LLILLL = r2
        L14:
            java.lang.Object r3 = r9.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            goto L47
        L22:
            X.0ycG r9 = new X.0ycG
            r9.<init>(r10, r3)
            goto L14
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            X.01GW r0 = X.C1503800pEg.LIZ     // Catch: java.lang.Exception -> L58
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r3 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L58
            if (r3 == 0) goto L4e
            r9.LLILLL = r1     // Catch: java.lang.Exception -> L58
            r8 = r15
            r7 = r14
            r6 = r13
            r5 = r12
            r4 = r11
            java.lang.Object r3 = r3.postQuestionnaireSubmit(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L58
            if (r3 != r2) goto L4a
            return r2
        L47:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L58
        L4a:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse r3 = (com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse) r3     // Catch: java.lang.Exception -> L58
            if (r3 != 0) goto L65
        L4e:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse r3 = new com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse     // Catch: java.lang.Exception -> L58
            r2 = 0
            r1 = 0
            java.lang.String r0 = ""
            r3.<init>(r2, r1, r0)     // Catch: java.lang.Exception -> L58
            return r3
        L58:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse r3 = new com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse
            r2 = 0
            r1 = 0
            java.lang.String r0 = ""
            r3.<init>(r2, r1, r0)
        L65:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJJIFFI(int, java.lang.String, int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJII(java.lang.String r14, long r15, java.lang.Long r17, java.lang.Integer r18, java.lang.String r19, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.net.TakoAwemeRecallResponse> r20) {
        /*
            r13 = this;
            r3 = r20
            boolean r0 = r3 instanceof X.C1864090ybn
            if (r0 == 0) goto L25
            r12 = r3
            X.0ybn r12 = (X.C1864090ybn) r12
            int r2 = r12.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r12.LLILZ = r2
        L14:
            java.lang.Object r4 = r12.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r12.LLILZ
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L33
            if (r1 != r0) goto L2b
            X.0ybc r0 = r12.LL
            goto L54
        L25:
            X.0ybn r12 = new X.0ybn
            r12.<init>(r13, r3)
            goto L14
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r4 = X.C1503800pEg.LJ     // Catch: java.lang.Exception -> L5d
            if (r4 == 0) goto L51
            r12.LL = r13     // Catch: java.lang.Exception -> L5d
            r12.LLILZ = r0     // Catch: java.lang.Exception -> L5d
            r10 = 10
            r9 = r18
            r8 = r17
            r6 = r15
            r11 = r19
            r5 = r14
            java.lang.Object r4 = r4.recallAwemeList(r5, r6, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L5d
            if (r4 != r3) goto L4f
            return r3
        L4f:
            r0 = r13
            goto L57
        L51:
            r0 = r13
            r4 = r2
            goto L59
        L54:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L5d
        L57:
            com.ss.android.ugc.aweme.tako.ccl.net.TakoAwemeRecallResponse r4 = (com.ss.android.ugc.aweme.tako.ccl.net.TakoAwemeRecallResponse) r4     // Catch: java.lang.Exception -> L5d
        L59:
            LJJIIZI(r0, r4)     // Catch: java.lang.Exception -> L5d
            return r4
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoAwemeRecallResponse r4 = new com.ss.android.ugc.aweme.tako.ccl.net.TakoAwemeRecallResponse
            r1 = 0
            r0 = 3
            r4.<init>(r2, r1, r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJJII(java.lang.String, long, java.lang.Long, java.lang.Integer, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(long r13, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.net.TakoUserFeatureResponse> r20) {
        /*
            r12 = this;
            r3 = r20
            boolean r0 = r3 instanceof X.C1864350ycD
            if (r0 == 0) goto L22
            r11 = r3
            X.0ycD r11 = (X.C1864350ycD) r11
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
            if (r1 == 0) goto L30
            if (r1 != r0) goto L28
            goto L4a
        L22:
            X.0ycD r11 = new X.0ycD
            r11.<init>(r12, r3)
            goto L14
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r3 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L5e
            if (r3 == 0) goto L51
            r11.LLILLL = r0     // Catch: java.lang.Exception -> L5e
            r10 = r19
            r8 = r17
            r7 = r16
            r6 = r15
            r9 = r18
            r4 = r13
            java.lang.Object r3 = r3.fetchUserFeature(r4, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L5e
            if (r3 != r2) goto L4d
            return r2
        L4a:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L5e
        L4d:
            com.ss.android.ugc.aweme.tako.ccl.net.TakoUserFeatureResponse r3 = (com.ss.android.ugc.aweme.tako.ccl.net.TakoUserFeatureResponse) r3     // Catch: java.lang.Exception -> L5e
            if (r3 != 0) goto L6e
        L51:
            com.ss.android.ugc.aweme.tako.ccl.net.TakoUserFeatureResponse r3 = new com.ss.android.ugc.aweme.tako.ccl.net.TakoUserFeatureResponse     // Catch: java.lang.Exception -> L5e
            r4 = 0
            java.lang.String r6 = ""
            r5 = 0
            r7 = r6
            r8 = r6
            r9 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L5e
            return r3
        L5e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoUserFeatureResponse r3 = new com.ss.android.ugc.aweme.tako.ccl.net.TakoUserFeatureResponse
            r4 = 0
            java.lang.String r6 = ""
            r5 = 0
            r7 = r6
            r8 = r6
            r9 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJIILL(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJ(java.lang.String r14, java.lang.String r15, long r16, java.lang.String r18, java.lang.String r19, java.lang.Boolean r20, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tako.ccl.net.TakoMessageReadResponse> r21) {
        /*
            r13 = this;
            r0 = 202249(0x31609, float:2.83411E-40)
            boolean r3 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            r4 = r21
            boolean r0 = r4 instanceof X.C1864130ybr
            if (r0 == 0) goto L35
            r12 = r4
            X.0ybr r12 = (X.C1864130ybr) r12
            int r2 = r12.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r12.LLILZ = r2
        L1b:
            java.lang.Object r4 = r12.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r12.LLILZ
            r0 = 1
            if (r1 == 0) goto L3e
            if (r1 == r0) goto L3b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r3 == 0) goto L34
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L34:
            throw r1
        L35:
            X.0ybr r12 = new X.0ybr
            r12.<init>(r13, r4)
            goto L1b
        L3b:
            X.0ybc r0 = r12.LL
            goto L64
        L3e:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoApi r4 = X.C1503800pEg.LIZLLL     // Catch: java.lang.Exception -> L6d
            if (r4 == 0) goto L61
            r12.LL = r13     // Catch: java.lang.Exception -> L6d
            r12.LLILZ = r0     // Catch: java.lang.Exception -> L6d
            r11 = r20
            r9 = r18
            r7 = r16
            r6 = r15
            r10 = r19
            r5 = r14
            java.lang.Object r4 = r4.messageRead(r5, r6, r7, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L6d
            if (r4 != r2) goto L5f
            if (r3 == 0) goto L5e
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L5e:
            return r2
        L5f:
            r0 = r13
            goto L67
        L61:
            r4 = 0
            r0 = r13
            goto L69
        L64:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L6d
        L67:
            com.ss.android.ugc.aweme.tako.ccl.net.TakoMessageReadResponse r4 = (com.ss.android.ugc.aweme.tako.ccl.net.TakoMessageReadResponse) r4     // Catch: java.lang.Exception -> L6d
        L69:
            LJJIIZI(r0, r4)     // Catch: java.lang.Exception -> L6d
            goto L7c
        L6d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.tako.ccl.net.TakoMessageReadResponse r4 = new com.ss.android.ugc.aweme.tako.ccl.net.TakoMessageReadResponse
            r6 = 0
            java.lang.String r5 = ""
            r7 = 0
            r9 = r5
            r4.<init>(r5, r6, r7, r9)
        L7c:
            if (r3 == 0) goto L81
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L81:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1863980ybc.LJJ(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.Boolean, X.05Vn):java.lang.Object");
    }
}
