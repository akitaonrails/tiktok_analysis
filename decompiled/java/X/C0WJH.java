package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.draft.DraftMigrateState;
import com.ss.android.ugc.aweme.services.draft.IDraftMigrateStateService;
import com.ss.android.ugc.aweme.services.draft.model.MigrateDraftQueryResult;
import com.ss.android.ugc.aweme.services.draft.model.MigrateDraftStateInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WJH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WJH {
    public static final C0WJH LIZ = new C0WJH();

    public static boolean LIZ(MigrateDraftQueryResult migrateDraftQueryResult) {
        return Intrinsics.LJFF(migrateDraftQueryResult.getFrom(), "queryFromCache");
    }

    public static void LIZLLL(MigrateDraftQueryResult migrateDraftQueryResult) {
        Object objName;
        long jLongValue;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            Iterator<MigrateDraftStateInfo> it2 = migrateDraftQueryResult.getMigrateDraftStateInfoList().iterator();
            while (true) {
                int iIntValue = 0;
                objName = null;
                if (!it2.hasNext()) {
                    break;
                }
                MigrateDraftStateInfo next = it2.next();
                String str = next.creationId;
                if (str != null && str.length() != 0) {
                    DraftMigrateState draftMigrateState = next.migrateDraftState;
                    if (draftMigrateState != null) {
                        objName = draftMigrateState.name();
                    }
                    linkedHashMap.put(str, String.valueOf(objName));
                    Long l = next.freeSpace;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    linkedHashMap2.put(str, Long.valueOf(jLongValue));
                    Integer numIsAigc = next.isAigc();
                    if (numIsAigc != null) {
                        iIntValue = numIsAigc.intValue();
                    }
                    linkedHashMap3.put(str, Integer.valueOf(iIntValue));
                }
            }
            IDraftMigrateStateService iDraftMigrateStateService = (IDraftMigrateStateService) PluggableExtentionKt.pluggableSpi$default(IDraftMigrateStateService.class, false, false, false, 14, null);
            if (iDraftMigrateStateService != null) {
                IDraftMigrateStateService.DefaultImpls.updateDraftMigrateInfos$default(iDraftMigrateStateService, linkedHashMap, false, 2, null);
                iDraftMigrateStateService.updateDraftMigrateSize(linkedHashMap2);
                iDraftMigrateStateService.updateDraftMigrateAigcInfos(linkedHashMap3);
                objName = iDraftMigrateStateService;
            }
            C189200o6.m2constructorimpl(objName);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.content.ContentResolver r16, java.lang.String r17, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.services.draft.model.MigrateDraftQueryResult> r18) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WJH.LIZIZ(android.content.ContentResolver, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(android.content.ContentResolver r20, java.lang.String r21, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.services.draft.model.MigrateDraftQueryResult> r22) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WJH.LIZJ(android.content.ContentResolver, java.lang.String, X.05Vn):java.lang.Object");
    }
}
