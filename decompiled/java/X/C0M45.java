package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftShowInfo;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0M45, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M45 {
    public static final C0M45 LIZ = new C0M45();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(570));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(569));
    public static final List<DraftViewInfo> LIZLLL = new ArrayList();

    public static void LJ() {
        for (DraftViewInfo draftViewInfo : (ArrayList) LIZLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update local_draft set draft_view_info = '");
            sbLIZ.append(GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), draftViewInfo));
            sbLIZ.append("' where video_path = '");
            sbLIZ.append(draftViewInfo.creationId);
            sbLIZ.append('\'');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            try {
                LIZ.getClass();
                ((SQLiteDatabase) LIZIZ.getValue()).execSQL(strLIZIZ);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        ((ArrayList) LIZLLL).clear();
    }

    public static void LIZLLL() {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_fake_draft_operation_response", true) == 4 && C625790Ogb.LIZ()) {
            C0CHQ.LIZ().isDebugConfigOpen();
        }
    }

    public static DraftViewInfo LIZ(Cursor cursor) {
        DraftViewInfo draftViewInfo = new DraftViewInfo();
        String string = cursor.getString(cursor.getColumnIndex("draft_view_info"));
        if (string != null) {
            try {
                if (string.length() != 0) {
                    DraftViewInfo draftViewInfo2 = (DraftViewInfo) C0CHQ.LIZ().getGson().LJII(string, DraftViewInfo.class);
                    try {
                        DraftShowInfo draftShowInfo = draftViewInfo2.draftShowInfo;
                        if (draftShowInfo.saveTime == 0) {
                            draftShowInfo.saveTime = cursor.getLong(cursor.getColumnIndex("save_time"));
                        }
                        int columnIndex = cursor.getColumnIndex("published_time");
                        if (columnIndex >= 0) {
                            draftViewInfo2.LIZ = cursor.getLong(columnIndex);
                        }
                        return draftViewInfo2;
                    } catch (Exception e) {
                        e = e;
                        draftViewInfo = draftViewInfo2;
                        TryCatchGuardChecker.doCheck(e);
                        C201955140j.LJI("DraftDatabaseHelper", e);
                        return draftViewInfo;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        DraftViewInfo draftViewInfoLIZ = C562270M3l.LIZ(C0MZJ.LIZ(cursor));
        ((ArrayList) LIZLLL).add(draftViewInfoLIZ);
        return draftViewInfoLIZ;
    }

    public static DraftViewInfo LIZJ(Cursor cursor) {
        C0M4A.LIZIZ(cursor);
        DraftViewInfo draftViewInfo = (DraftViewInfo) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), cursor.getString(cursor.getColumnIndex("draft_view_info")), DraftViewInfo.class);
        int columnIndex = cursor.getColumnIndex("published_time");
        if (columnIndex >= 0 && draftViewInfo != null) {
            draftViewInfo.LIZ = cursor.getLong(columnIndex);
        }
        return draftViewInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0M4N r15, X.EnumC562220M3g r16, X.C562260M3k r17, X.C0M0Z r18, X.EnumC562200M3e r19, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo>> r20) {
        /*
            r14 = this;
            r3 = r20
            boolean r0 = r3 instanceof X.C0M48
            if (r0 == 0) goto L59
            r4 = r3
            X.0M48 r4 = (X.C0M48) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L14:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L5f
            X.013C r12 = r4.LLILLJJLI
            java.lang.Object r11 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L28:
            boolean r0 = r12.element
            if (r0 != 0) goto L2d
            r11 = 0
        L2d:
            return r11
        L2e:
            X.C155000ia.LIZIZ(r3)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            X.013C r12 = new X.013C
            r12.<init>()
            X.1DFB r0 = X.C0PEM.LIZJ
            X.0M44 r5 = new X.0M44
            r13 = 0
            r6 = r19
            r10 = r18
            r9 = r17
            r8 = r16
            r7 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r4.LL = r11
            r4.LLILLJJLI = r12
            r4.LLILZIL = r1
            java.lang.Object r0 = X.C23250099c.LJI(r4, r0, r5)
            if (r0 != r2) goto L28
            return r2
        L59:
            X.0M48 r4 = new X.0M48
            r4.<init>(r14, r3)
            goto L14
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M45.LIZIZ(X.0M4N, X.0M3g, X.0M3k, X.0M0Z, X.0M3e, X.05Vn):java.lang.Object");
    }
}
