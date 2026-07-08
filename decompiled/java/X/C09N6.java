package X;

import android.content.Context;
import android.database.Cursor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09N6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09N6 {
    public static String LIZ(Context context, String str) throws Throwable {
        if (u.LJJIIJZLJL(str, "/", false)) {
            return str;
        }
        String string = null;
        Cursor cursorLJJJ = C2204961BRm.LJJJ(C786410Ut5.N3(context).getContentResolver(), UriProtector.parse(str), null, null, null, null, new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKretw+PPS40X4tGJn5j3TBmK2S4X9Nu", null));
        if (cursorLJJJ == null) {
            return null;
        }
        if (cursorLJJJ.moveToFirst()) {
            try {
                string = cursorLJJJ.getString(cursorLJJJ.getColumnIndexOrThrow("_data"));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        cursorLJJJ.close();
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList LIZIZ(android.content.Context r14, java.util.List r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09N6.LIZIZ(android.content.Context, java.util.List):java.util.ArrayList");
    }
}
