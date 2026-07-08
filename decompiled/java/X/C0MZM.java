package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.draft.DraftMigrateState;
import com.ss.android.ugc.aweme.services.draft.model.MigrateResult;
import lth.o;

/* JADX INFO: renamed from: X.0MZM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MZM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(ContentResolver contentResolver, MigrateResult migrateResult) throws Throwable {
        Object c098200Yq;
        try {
            c098200Yq = o.LIZIZ.LJIILL(migrateResult);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("uid", migrateResult.uid);
        contentValues.put("result", (String) c098200Yq);
        contentValues.put("isSuccess", Boolean.valueOf(migrateResult.isSuccess()));
        contentValues.put("successCount", Integer.valueOf(migrateResult.successCount));
        contentValues.put("failedCount", Integer.valueOf(migrateResult.failedCount));
        contentValues.put("errorCode", Integer.valueOf(migrateResult.errorCode));
        contentValues.put("errorMsg", migrateResult.errorMsg);
        C2204961BRm.LJJJI(contentResolver, UriProtector.parse("content://com.zhiliaoapp.musically.draftprovider/all_completed"), contentValues, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkjb1xjMDJbziwSj8JOcgeWu8Hlt9UR9CW9RP1TrTZa3maRDvESyqfN8V", null));
    }

    public static int LIZIZ(ContentResolver contentResolver, String str, int i, int i2, int i3, long j, DraftMigrateState draftMigrateState, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("index", Integer.valueOf(i));
        contentValues.put("total_count", Integer.valueOf(i2));
        contentValues.put("from", str2);
        contentValues.put("isAigc", Integer.valueOf(i3));
        contentValues.put("freeSpace", Long.valueOf(j));
        contentValues.put(str, draftMigrateState.name());
        return C2204961BRm.LJJJI(contentResolver, UriProtector.parse("content://com.zhiliaoapp.musically.draftprovider/finish"), contentValues, str, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkjb1xjMDJbziwSj8JOcgeWu8Hlt9UR9CW9RP1TrTZa3maRDvESyqfN8V", null));
    }
}
