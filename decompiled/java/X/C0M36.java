package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.draft.DraftMigrateState;

/* JADX INFO: renamed from: X.0M36, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C0M36 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[DraftMigrateState.values().length];
        try {
            iArr[DraftMigrateState.MIGRATED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[DraftMigrateState.MIGRATING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[DraftMigrateState.NOT_MIGRATE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
