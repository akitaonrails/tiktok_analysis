package X;

import android.text.format.DateFormat;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.ss.android.ugc.aweme.draft.model.DraftDBDeleteException;
import com.ss.android.ugc.aweme.draft.model.DraftDBDeleteResult;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.ss.android.ugc.aweme.draft.model.DraftDeleteResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileCheckResults;
import com.ss.android.ugc.aweme.draft.model.DraftFileDeleteException;
import com.ss.android.ugc.aweme.draft.model.DraftFileDeleteResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResults;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResults;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftSavePreProcessResults;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0MYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570280MYg {
    public static String LIZ(long j) {
        if (j <= 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(j);
        return DateFormat.format("yyyy-MM-dd hh:mm:ss a", calendar).toString();
    }

    public static final DraftDeleteResult LIZIZ(AwemeDraft awemeDraft) {
        String strLIZ = awemeDraft.LIZ();
        int iLIZ = C0MZ1.LIZ(awemeDraft);
        String strLIZ2 = LIZ(awemeDraft.lastEditTime);
        long j = awemeDraft.LJJJJIZL.saveDraftAppVersion;
        CreativeModel creativeModel = awemeDraft.LIZ;
        return new DraftDeleteResult(strLIZ, iLIZ, strLIZ2, j, 0L, "", new DraftFileDeleteResult(0L, new DraftFileDeleteException(0, null)), new DraftDBDeleteResult(0L, new DraftDBDeleteException(0, null)), null, creativeModel.draftInfoModel.draftAwemeType, 0, 0, creativeModel.aiLivePhotoModel);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:17:0x003c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final long LJ(android.net.Uri r13) {
        /*
            java.lang.String r1 = "_size"
            r2 = 0
            java.lang.String[] r8 = new java.lang.String[]{r1}     // Catch: java.lang.Exception -> L44
            android.app.Application r0 = X.C0CHQ.LIZ     // Catch: java.lang.Exception -> L44
            android.content.ContentResolver r6 = r0.getContentResolver()     // Catch: java.lang.Exception -> L44
            r9 = 0
            X.0WZX r12 = new X.0WZX     // Catch: java.lang.Exception -> L44
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO66Ypnakj/vVGLZLtarb1zdkJme8v2+iMw="
            r5 = 0
            r12.<init>(r0, r9)     // Catch: java.lang.Exception -> L44
            r7 = r13
            r10 = r9
            r11 = r9
            android.database.Cursor r4 = X.C2204961BRm.LJJJ(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L44
            if (r4 == 0) goto L5d
            int r1 = r4.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L34
            if (r1 < 0) goto L30
            boolean r0 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L30
            long r2 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L34
        L30:
            X.C2107108Nh.LIZ(r4, r9)     // Catch: java.lang.Exception -> L44
            return r2
        L34:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L3c
            throw r1     // Catch: java.lang.Throwable -> L39
        L39:
            r0 = move-exception
            r5 = r1
            goto L3d
        L3c:
            r0 = move-exception
        L3d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3c
            X.C2107108Nh.LIZ(r4, r5)     // Catch: java.lang.Exception -> L46
            throw r0     // Catch: java.lang.Exception -> L46
        L44:
            r0 = move-exception
            goto L47
        L46:
            r0 = move-exception
        L47:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "saveDraft -> "
            r1.<init>(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.C201955140j.LIZ(r0)
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C570280MYg.LJ(android.net.Uri):long");
    }

    public static final long LJFF(String str) {
        if (C2471909mP.LJJIIZI(str)) {
            return LJ(UriProtector.parse(str)) / ((long) 1024);
        }
        if (new C0VSJ(str).exists()) {
            return new C0VSJ(str).length() / ((long) 1024);
        }
        return 0L;
    }

    public static final void LJII(DraftSaveResult draftSaveResult) {
        if (!C0CHQ.LIZ().getAccountService().LIZ()) {
            C0CHQ.LIZ().LJI().LIZJ().LJ(draftSaveResult);
            C0CHQ.LIZ().LJI().LIZJ().LIZ(draftSaveResult);
            if (!draftSaveResult.isSuc()) {
                C0CHQ.LIZ().LJI().LIZJ().LJII(draftSaveResult);
            }
        }
    }

    public static final void LJI(DraftRestoreResult draftRestoreResult, String str) {
        if (!C0CHQ.LIZ().getAccountService().LIZ()) {
            C0CHQ.LIZ().LJI().LIZJ().LJIIJ(draftRestoreResult);
            C0CHQ.LIZ().LJI().LIZJ().LJIILJJIL(draftRestoreResult);
            C0CHQ.LIZ().LJI().LIZJ().LJIIIIZZ(draftRestoreResult, str);
        }
    }

    public static DraftRestoreResult LIZJ(AwemeDraft awemeDraft, String str, String str2, int i) {
        String str3 = str;
        String str4 = "";
        if ((i & 2) != 0) {
            str3 = "";
        }
        if ((i & 4) == 0) {
            str4 = str2;
        }
        return new DraftRestoreResult(awemeDraft.LIZ(), C0MZ1.LIZ(awemeDraft), LIZ(awemeDraft.lastEditTime), awemeDraft.LJJJJIZL.saveDraftAppVersion, 1, str3, new DraftCheckResult(0L, new DraftFileCheckResults(null, null, 3, null), null, 0), new DraftFileRestoreResults(0L, null, null, 7, null), awemeDraft.LJJJI, null, awemeDraft.LIZ.draftInfoModel.draftAwemeType, awemeDraft.LIZIZ().getVersion(), awemeDraft.lastEditTime, str4, false, awemeDraft.LIZ);
    }

    public static DraftSaveResult LIZLLL(AwemeDraft awemeDraft, Throwable th, String str, int i) {
        boolean z;
        EditorProModel editorProModel;
        List<String> pipResourcePaths;
        String str2 = str;
        Throwable th2 = th;
        if ((i & 1) != 0) {
            th2 = null;
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        String strLIZ = awemeDraft.LIZ();
        int iLIZ = C0MZ1.LIZ(awemeDraft);
        int i2 = awemeDraft.LIZJ;
        String strLIZ2 = LIZ(awemeDraft.lastEditTime);
        long updateVersionCode = C0CHQ.LIZ().getUpdateVersionCode();
        if (!awemeDraft.LJJJI && !awemeDraft.LJJJJI) {
            z = false;
        } else {
            z = true;
        }
        DraftInfoModel draftInfoModel = awemeDraft.LIZ.draftInfoModel;
        String str3 = draftInfoModel.saveDraftScene;
        int i3 = draftInfoModel.draftAwemeType;
        int version = awemeDraft.LIZIZ().getVersion();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = C0MZ9.LIZLLL(awemeDraft).iterator();
        while (it2.hasNext()) {
            long jLJFF = LJFF(it2.next());
            if (jLJFF > 0) {
                arrayList.add(Long.valueOf(jLJFF));
            }
        }
        CreativeFlowData creativeFlowData = awemeDraft.LJJJJIZL.creativeFlowData;
        if (creativeFlowData != null && (editorProModel = creativeFlowData.getEditorProModel()) != null && (pipResourcePaths = editorProModel.getPipResourcePaths()) != null) {
            Iterator it3 = new ArrayList(C13LP.LLIIII(pipResourcePaths)).iterator();
            while (it3.hasNext()) {
                long jLJFF2 = LJFF((String) it3.next());
                if (jLJFF2 > 0) {
                    arrayList.add(Long.valueOf(jLJFF2));
                }
            }
        }
        CreativeModel creativeModel = awemeDraft.LIZ;
        return new DraftSaveResult(strLIZ, iLIZ, i2, strLIZ2, updateVersionCode, 1, str2, new DraftSavePreProcessResults(0L, null, null, 7, null), new DraftCheckResult(0L, new DraftFileCheckResults(null, null, 3, null), null, 0), new DraftFileSaveResults(0L, null, null, 7, null), new DraftDBSaveResult(0L, new DraftDBSaveException(0, null)), z, th2, str3, i3, version, arrayList, "", creativeModel.aiLivePhotoModel, "", "", null, null, null, null, null, null, creativeModel);
    }
}
