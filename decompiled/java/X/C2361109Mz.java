package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09Mz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2361109Mz {
    public static final C2361109Mz LIZ = new C2361109Mz();
    public static final Uri LIZIZ = MediaStore.Files.getContentUri("external");
    public static final String[] LIZJ = {"_id", "_data", "date_added"};
    public static final String LIZLLL = "media_type = 1";

    public static Integer LIZ(Cursor cursor, String str) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(cursor.getColumnIndexOrThrow(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Integer) c098200Yq;
    }

    public static Cursor LIZIZ(Context context, boolean z) {
        ContentResolver contentResolver = C786410Ut5.N3(context).getContentResolver();
        if (!z) {
            return C2204961BRm.LJJJ(contentResolver, LIZIZ, LIZJ, LIZLLL, null, "date_added DESC", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWlfov1KYs+ikD0YTxYM+7QK4XRYh60eluAQ==", null));
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("android:query-arg-sql-selection", LIZLLL, bundle);
            bundle.putStringArray("android:query-arg-sort-columns", new String[]{"date_added"});
            bundle.putInt("android:query-arg-sort-direction", 1);
            bundle.putInt("android:query-arg-limit", 1);
            return C2204961BRm.LJJIL(contentResolver, LIZIZ, LIZJ, bundle, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWlfov1KYs+ikD0YTxYM+7QK4XRYh60eluAQ==", null));
        }
        return C2204961BRm.LJJJ(contentResolver, LIZIZ, LIZJ, LIZLLL, null, "date_added DESC LIMIT 1", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWlfov1KYs+ikD0YTxYM+7QK4XRYh60eluAQ==", null));
    }
}
