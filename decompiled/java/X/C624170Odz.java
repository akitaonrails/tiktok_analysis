package X;

import Y.AfS145S0200000_9;
import Y.AfS178S0100000_9;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.api.MultiApiManager;
import com.ss.android.ugc.aweme.inbox.workbench.api.WorkBenchApiManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxMissionTabInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS9S0501000_9;

/* JADX INFO: renamed from: X.0Odz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C624170Odz implements InterfaceC624050Odn {
    public static boolean LJLZ() {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC624050Odn
    public final C624120Odu LLLLLLLLLL() {
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("inbox_workbench_preload_enabled", true)) {
            return new C624120Odu(EnumC623590Od3.LOADING, null);
        }
        C624110Odt.LIZ.getClass();
        WorkBenchNoticeResponse workBenchNoticeResponse = C624110Odt.LIZ().LIZJ;
        if (workBenchNoticeResponse == null) {
            return new C624120Odu(EnumC623590Od3.LOADING, null);
        }
        List<InboxMissionTabInfo> missionTabInfo = workBenchNoticeResponse.getMissionTabInfo();
        int size = missionTabInfo != null ? missionTabInfo.size() : 0;
        List<MissionStruct> missionList = workBenchNoticeResponse.getMissionList();
        int size2 = missionList != null ? missionList.size() : 0;
        if (size == 0 || size2 == 0) {
            return new C624120Odu(EnumC623590Od3.LOADING, null);
        }
        C23250099c.LIZLLL(C624110Odt.LIZJ, null, null, new C624030Odl(null), 3);
        return new C624120Odu(EnumC623590Od3.SUCCESS, workBenchNoticeResponse);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // X.InterfaceC624050Odn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLJI(X.InterfaceC1364105Vn<? super X.C624120Odu> r18) {
        /*
            r17 = this;
            r4 = r18
            boolean r0 = r4 instanceof X.C624210Oe3
            if (r0 == 0) goto L23
            r3 = r4
            X.0Oe3 r3 = (X.C624210Oe3) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r3.LLILLL = r2
        L14:
            java.lang.Object r4 = r3.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r8 = 0
            r5 = 1
            if (r0 == 0) goto L33
            if (r0 != r5) goto L2b
            goto L67
        L23:
            X.0Oe3 r3 = new X.0Oe3
            r0 = r17
            r3.<init>(r0, r4)
            goto L14
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r4)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            boolean r0 = LJLZ()
            if (r0 != 0) goto L4c
            X.0Odu r1 = new X.0Odu
            X.0Od3 r0 = X.EnumC623590Od3.ERROR
            r1.<init>(r0, r8)
            return r1
        L4c:
            com.ss.android.ugc.aweme.inbox.workbench.api.WorkBenchApiManager$Api r6 = com.ss.android.ugc.aweme.inbox.workbench.api.WorkBenchApiManager.LIZ()     // Catch: java.lang.Exception -> La5
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> La5
            r3.LLILLL = r5     // Catch: java.lang.Exception -> La5
            r7 = 0
            r9 = 20
            r10 = r8
            r11 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r3
            java.lang.Object r4 = r6.fetchNoticeBrandPartnership(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> La5
            if (r4 != r1) goto L6a
            return r1
        L67:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> La5
        L6a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse r4 = (com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse) r4     // Catch: java.lang.Exception -> La5
            java.util.List r0 = r4.getMissionTabInfo()     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto La2
            int r3 = r0.size()     // Catch: java.lang.Exception -> La5
        L76:
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Exception -> La5
            r0.getClass()     // Catch: java.lang.Exception -> La5
            java.lang.String r0 = "inbox_workbench_preload_enabled"
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r5)     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto L95
            X.0Odt r0 = X.C624110Odt.LIZ     // Catch: java.lang.Exception -> La5
            r0.getClass()     // Catch: java.lang.Exception -> La5
            X.054G r2 = X.C624110Odt.LIZJ     // Catch: java.lang.Exception -> La5
            X.0Odk r1 = new X.0Odk     // Catch: java.lang.Exception -> La5
            r1.<init>(r4, r5, r8)     // Catch: java.lang.Exception -> La5
            r0 = 3
            X.C23250099c.LIZLLL(r2, r8, r8, r1, r0)     // Catch: java.lang.Exception -> La5
        L95:
            X.0Odu r1 = new X.0Odu     // Catch: java.lang.Exception -> La5
            if (r3 != 0) goto L9f
            X.0Od3 r0 = X.EnumC623590Od3.EMPTY_RESULT     // Catch: java.lang.Exception -> La5
        L9b:
            r1.<init>(r0, r4)     // Catch: java.lang.Exception -> La5
            goto La4
        L9f:
            X.0Od3 r0 = X.EnumC623590Od3.SUCCESS     // Catch: java.lang.Exception -> La5
            goto L9b
        La2:
            r3 = 0
            goto L76
        La4:
            return r1
        La5:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0Odu r1 = new X.0Odu
            X.0Od3 r0 = X.EnumC623590Od3.ERROR
            r1.<init>(r0, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624170Odz.LLJI(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC624050Odn
    public final InterfaceC420801kM LJJLIIJ(int i, int i2, Function0<Unit> function0, Function0<Unit> function02) {
        return MultiApiManager.LIZ().updateInboxEntrance(i, i2, 0, 0, null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS178S0100000_9((AwS9S0501000_9) function0, 8), new AfS178S0100000_9((AwS553S0100000_9) function02, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // X.InterfaceC624050Odn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLJZ(long r16, java.lang.String r18, java.util.List r19, X.InterfaceC1364105Vn r20) {
        /*
            r15 = this;
            r3 = r20
            boolean r0 = r3 instanceof X.C624200Oe2
            if (r0 == 0) goto L23
            r14 = r3
            X.0Oe2 r14 = (X.C624200Oe2) r14
            int r2 = r14.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r14.LLILLL = r2
        L14:
            java.lang.Object r2 = r14.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r14.LLILLL
            r6 = 0
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            goto L68
        L23:
            X.0Oe2 r14 = new X.0Oe2
            r14.<init>(r15, r3)
            goto L14
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r2)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            boolean r0 = LJLZ()
            if (r0 != 0) goto L4a
            X.0Odu r1 = new X.0Odu
            X.0Od3 r0 = X.EnumC623590Od3.ERROR
            r1.<init>(r0, r6)
            return r1
        L4a:
            com.ss.android.ugc.aweme.inbox.workbench.api.WorkBenchApiManager$Api r4 = com.ss.android.ugc.aweme.inbox.workbench.api.WorkBenchApiManager.LIZ()     // Catch: java.lang.Exception -> L75
            java.lang.Long r9 = X.C2286608xc.LJFF(r16)     // Catch: java.lang.Exception -> L75
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L75
            r14.LLILLL = r1     // Catch: java.lang.Exception -> L75
            r5 = 0
            r7 = 20
            r12 = r19
            r8 = r18
            r11 = r6
            r13 = r6
            java.lang.Object r2 = r4.fetchNoticeBrandPartnership(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> L75
            if (r2 != r3) goto L6b
            return r3
        L68:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L75
        L6b:
            com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse r2 = (com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse) r2     // Catch: java.lang.Exception -> L75
            X.0Odu r1 = new X.0Odu     // Catch: java.lang.Exception -> L75
            X.0Od3 r0 = X.EnumC623590Od3.SUCCESS     // Catch: java.lang.Exception -> L75
            r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L75
            return r1
        L75:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0Odu r1 = new X.0Odu
            X.0Od3 r0 = X.EnumC623590Od3.ERROR
            r1.<init>(r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624170Odz.LLJZ(long, java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC624050Odn
    public final C11JF A(int i, int i2, Function0 function0, Function0 function02, boolean z) {
        return (C11JF) WorkBenchApiManager.LIZ().postNoticeMissionSettingsUpdate(i, i2, z).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS145S0200000_9(function0, function02, 1), new C516201zk(function02, 20));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // X.InterfaceC624050Odn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLIFFJFJJ(long r16, int r18, java.lang.String r19, java.lang.String r20, X.InterfaceC1364105Vn r21) {
        /*
            r15 = this;
            r3 = r21
            boolean r0 = r3 instanceof X.C624220Oe4
            if (r0 == 0) goto L23
            r14 = r3
            X.0Oe4 r14 = (X.C624220Oe4) r14
            int r2 = r14.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r14.LLILLL = r2
        L14:
            java.lang.Object r2 = r14.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r14.LLILLL
            r6 = 0
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            goto L69
        L23:
            X.0Oe4 r14 = new X.0Oe4
            r14.<init>(r15, r3)
            goto L14
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r2)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            boolean r0 = LJLZ()
            if (r0 != 0) goto L4a
            X.0Odu r1 = new X.0Odu
            X.0Od3 r0 = X.EnumC623590Od3.ERROR
            r1.<init>(r0, r6)
            return r1
        L4a:
            com.ss.android.ugc.aweme.inbox.workbench.api.WorkBenchApiManager$Api r4 = com.ss.android.ugc.aweme.inbox.workbench.api.WorkBenchApiManager.LIZ()     // Catch: java.lang.Exception -> L76
            java.lang.Long r9 = X.C2286608xc.LJFF(r16)     // Catch: java.lang.Exception -> L76
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L76
            r14.LLILLL = r1     // Catch: java.lang.Exception -> L76
            r7 = 20
            r13 = r20
            r8 = r19
            r5 = r18
            r11 = r6
            r12 = r6
            java.lang.Object r2 = r4.fetchNoticeBrandPartnership(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> L76
            if (r2 != r3) goto L6c
            return r3
        L69:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L76
        L6c:
            com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse r2 = (com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse) r2     // Catch: java.lang.Exception -> L76
            X.0Odu r1 = new X.0Odu     // Catch: java.lang.Exception -> L76
            X.0Od3 r0 = X.EnumC623590Od3.SUCCESS     // Catch: java.lang.Exception -> L76
            r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L76
            return r1
        L76:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0Odu r1 = new X.0Odu
            X.0Od3 r0 = X.EnumC623590Od3.ERROR
            r1.<init>(r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624170Odz.LLIFFJFJJ(long, int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // X.InterfaceC624050Odn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLIZLLLIL(long r16, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, X.InterfaceC1364105Vn r22) {
        /*
            r15 = this;
            r3 = r22
            boolean r0 = r3 instanceof X.C624230Oe5
            if (r0 == 0) goto L23
            r14 = r3
            X.0Oe5 r14 = (X.C624230Oe5) r14
            int r2 = r14.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r14.LLILLL = r2
        L14:
            java.lang.Object r2 = r14.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r14.LLILLL
            r10 = 0
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            goto L67
        L23:
            X.0Oe5 r14 = new X.0Oe5
            r14.<init>(r15, r3)
            goto L14
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r2)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            boolean r0 = LJLZ()
            if (r0 != 0) goto L4a
            X.0Odu r1 = new X.0Odu
            X.0Od3 r0 = X.EnumC623590Od3.ERROR
            r1.<init>(r0, r10)
            return r1
        L4a:
            com.ss.android.ugc.aweme.inbox.workbench.api.WorkBenchApiManager$Api r4 = com.ss.android.ugc.aweme.inbox.workbench.api.WorkBenchApiManager.LIZ()     // Catch: java.lang.Exception -> L74
            java.lang.Long r9 = X.C2286608xc.LJFF(r16)     // Catch: java.lang.Exception -> L74
            r14.LLILLL = r1     // Catch: java.lang.Exception -> L74
            r7 = 20
            r13 = r21
            r8 = r20
            r6 = r19
            r5 = r18
            r11 = r10
            r12 = r10
            java.lang.Object r2 = r4.fetchNoticeBrandPartnership(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> L74
            if (r2 != r3) goto L6a
            return r3
        L67:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L74
        L6a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse r2 = (com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeResponse) r2     // Catch: java.lang.Exception -> L74
            X.0Odu r1 = new X.0Odu     // Catch: java.lang.Exception -> L74
            X.0Od3 r0 = X.EnumC623590Od3.SUCCESS     // Catch: java.lang.Exception -> L74
            r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L74
            return r1
        L74:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0Odu r1 = new X.0Odu
            X.0Od3 r0 = X.EnumC623590Od3.ERROR
            r1.<init>(r0, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624170Odz.LLIZLLLIL(long, int, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
