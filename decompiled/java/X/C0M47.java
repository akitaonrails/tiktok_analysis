package X;

import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M47, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.db.DraftViewInfoHelper$queryDraftViewInfo$2", f = "DraftViewInfoHelper.kt", l = {}, m = "invokeSuspend")
public final class C0M47 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DraftViewInfo>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M47(String str, InterfaceC1364105Vn<? super C0M47> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M47(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r7 = "DraftViewInfoHelper@1079.queryDraftViewInfo$2"
            X.C1C7U.LIZ(r7)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r9)
            r3 = 0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            java.lang.String r0 = "select draft_view_info from local_draft where video_path = '"
            r1.append(r0)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            java.lang.String r0 = r8.LL     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            r1.append(r0)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            r0 = 39
            r1.append(r0)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            java.lang.String r6 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            X.0C64 r5 = X.C0C64.LJIILLIIL()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            java.lang.String r4 = "studio_size_of_cursor_window"
            r2 = 31744(0x7c00, float:4.4483E-41)
            r1 = -1
            r0 = 1
            int r0 = r5.LJIJ(r2, r1, r4, r0)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            if (r0 <= 0) goto L3c
            r0 = 361(0x169, float:5.06E-43)
            kotlin.jvm.internal.AFwS239S0000000_8 r0 = kotlin.jvm.internal.AFwS239S0000000_8.get$arr$(r0)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            X.C0M4A.LJII(r6, r0)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
        L3c:
            X.0M45 r0 = X.C0M45.LIZ     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            r0.getClass()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            X.01GW r0 = X.C0M45.LIZJ     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            android.database.sqlite.SQLiteDatabase r0 = (android.database.sqlite.SQLiteDatabase) r0     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            android.database.Cursor r2 = r0.rawQuery(r6, r3)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L65
            if (r2 == 0) goto L74
            int r0 = X.C0M4A.LIZ(r2)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L78
            if (r0 <= 0) goto L71
            com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo r0 = X.C0M45.LIZJ(r2)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L78
            r2.close()
            X.C1C7U.LIZIZ(r7)
            return r0
        L60:
            r1 = move-exception
            goto L67
        L62:
            r0 = move-exception
            r2 = r3
            goto L79
        L65:
            r1 = move-exception
            r2 = r3
        L67:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = "DraftDatabaseHelper"
            X.C201955140j.LJI(r0, r1)     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L74
        L71:
            r2.close()
        L74:
            X.C1C7U.LIZIZ(r7)
            return r3
        L78:
            r0 = move-exception
        L79:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7d
            goto L7f
        L7d:
            r0 = move-exception
            goto L79
        L7f:
            if (r2 == 0) goto L84
            r2.close()
        L84:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M47.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DraftViewInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
