package X;

import android.content.ContentResolver;
import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.12jA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19835412jA {
    public static final String LIZ(ContentResolver contentResolver, String str) throws Throwable {
        Cursor cursorLJJJ = C2204961BRm.LJJJ(contentResolver, C19823412hE.LIZ, null, null, new String[]{str}, null, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz1cEJOnFpNPfGz/D+qAVxNrfF00hvBxNO0", new String[]{"016a9"}));
        try {
            if (cursorLJJJ != null) {
                if (cursorLJJJ.moveToFirst()) {
                    String string = cursorLJJJ.getString(1);
                    cursorLJJJ.close();
                    return string;
                }
                cursorLJJJ.close();
                return null;
            }
            throw new C19836112jH("Failed to connect to GservicesProvider");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (cursorLJJJ != null) {
                try {
                    cursorLJJJ.close();
                    throw th;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static final Map LIZIZ(ContentResolver contentResolver, String[] strArr, C19835512jB c19835512jB) throws Throwable {
        Cursor cursorLJJJ = C2204961BRm.LJJJ(contentResolver, C19823412hE.LIZIZ, null, null, strArr, null, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz1cEJOnFpNPfGz/D+qAVxNrfF00hvBxNO0", new String[]{"016a9"}));
        try {
            if (cursorLJJJ != null) {
                HashMap map = new HashMap(cursorLJJJ.getCount(), 1.0f);
                while (cursorLJJJ.moveToNext()) {
                    map.put(cursorLJJJ.getString(0), cursorLJJJ.getString(1));
                }
                cursorLJJJ.close();
                return map;
            }
            throw new C19836112jH("Failed to connect to GservicesProvider");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (cursorLJJJ != null) {
                try {
                    cursorLJJJ.close();
                    throw th;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }
}
