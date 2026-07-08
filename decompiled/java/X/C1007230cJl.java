package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService$getCampus$remoteFlow$1$1$1", f = "LoadableAutoBackupCampusService.kt", l = {100, 119}, m = "invokeSuspend")
public final class C1007230cJl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LoadableAutoBackupCampusService LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC332260D0u<C338000DMw> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007230cJl(LoadableAutoBackupCampusService loadableAutoBackupCampusService, String str, InterfaceC332260D0u<C338000DMw> interfaceC332260D0u, InterfaceC1364105Vn<? super C1007230cJl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = loadableAutoBackupCampusService;
        this.LLILLL = str;
        this.LLILZ = interfaceC332260D0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007230cJl(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "LoadableAutoBackupCampusService@ea34.getCampus$remoteFlow$1$1$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LL
            java.lang.String r2 = "LoadableAutoBackupCampusService"
            r4 = 2
            r7 = 1
            if (r0 == 0) goto L27
            if (r0 == r7) goto L3d
            if (r0 != r4) goto L8e
            X.C155000ia.LIZIZ(r10)
        L18:
            com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService r0 = r9.LLILLJJLI
            java.util.Set<java.lang.String> r1 = r0.LJI
            java.lang.String r0 = r9.LLILLL
            r1.add(r0)
        L21:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L27:
            X.C155000ia.LIZIZ(r10)
            com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService r0 = r9.LLILLJJLI     // Catch: java.io.IOException -> L9a X.C0XIR -> Lb1
            X.01GW r0 = r0.LIZLLL     // Catch: java.io.IOException -> L9a X.C0XIR -> Lb1
            java.lang.Object r0 = r0.getValue()     // Catch: java.io.IOException -> L9a X.C0XIR -> Lb1
            com.ss.android.ugc.ur.school.api.UserCampusInfoAPI r0 = (com.ss.android.ugc.ur.school.api.UserCampusInfoAPI) r0     // Catch: java.io.IOException -> L9a X.C0XIR -> Lb1
            r9.LL = r7     // Catch: java.io.IOException -> L9a X.C0XIR -> Lb1
            java.lang.Object r10 = r0.getUserCampusInfo(r9)     // Catch: java.io.IOException -> L9a X.C0XIR -> Lb1
            if (r10 != r3) goto L40
            goto L96
        L3d:
            X.C155000ia.LIZIZ(r10)     // Catch: java.io.IOException -> L9a X.C0XIR -> Lb1
        L40:
            com.ss.android.ugc.ur.school.api.UserSchoolInfoResponse r10 = (com.ss.android.ugc.ur.school.api.UserSchoolInfoResponse) r10     // Catch: java.io.IOException -> L9a X.C0XIR -> Lb1
            java.lang.String r1 = r10.schoolId
            java.lang.String r0 = r10.schoolName
            if (r1 == 0) goto L8c
            if (r0 == 0) goto L8c
            X.0DMw r2 = new X.0DMw
            X.0DHZ r6 = new X.0DHZ
            r6.<init>(r0, r1)
            java.lang.Integer r5 = r10.graduateYear
            java.lang.Boolean r1 = r10.enableSchoolGroup
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L8a
            X.06uk r0 = X.C1759206uk.LIZ
            boolean r0 = X.C1759206uk.LIZ()
            if (r0 == 0) goto L8a
        L67:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r2.<init>(r6, r5, r0)
        L6e:
            com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService r0 = r9.LLILLJJLI
            java.util.Set<java.lang.String> r1 = r0.LJI
            java.lang.String r0 = r9.LLILLL
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L21
            if (r2 == 0) goto L21
            X.0D0u<X.0DMw> r0 = r9.LLILZ
            r9.LL = r4
            java.lang.Object r0 = r0.emit(r2, r9)
            if (r0 != r3) goto L18
            X.C1C7U.LIZIZ(r8)
            return r3
        L8a:
            r7 = 0
            goto L67
        L8c:
            r2 = 0
            goto L6e
        L8e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L96:
            X.C1C7U.LIZIZ(r8)
            return r3
        L9a:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService r0 = r9.LLILLJJLI
            X.01GW r0 = r0.LIZIZ
            java.lang.Object r0 = r0.getValue()
            X.0zpH r0 = (X.C1910890zpH) r0
            r0.LIZLLL(r2, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        Lb1:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            com.ss.android.ugc.profile.business.ur.school.datasource.LoadableAutoBackupCampusService r0 = r9.LLILLJJLI
            X.01GW r0 = r0.LIZIZ
            java.lang.Object r0 = r0.getValue()
            X.0zpH r0 = (X.C1910890zpH) r0
            r0.LIZLLL(r2, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1007230cJl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
