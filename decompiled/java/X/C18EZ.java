package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import java.lang.Thread;
import org.json.JSONException;

/* JADX INFO: renamed from: X.18EZ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EZ implements Thread.UncaughtExceptionHandler {
    public static Thread.UncaughtExceptionHandler LIZ;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) throws JSONException {
        Object objLIZ;
        PageInfo pageInfoCurrent;
        C18CK.LIZJ("UncaughtExceptionHandler", new C21255818Ge(thread), true);
        if (C18CS.LIZ.LIZLLL().LJII() == 1 && (objLIZ = C18CJ.LIZ()) != null) {
            C21248618Dk.LIZ.getClass();
            PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(objLIZ);
            if (pageInfoStackLJIIIZ != null && (pageInfoCurrent = pageInfoStackLJIIIZ.current()) != null) {
                C18DA c18da = C18DA.LIZ;
                PageInfo pageInfoCopy = pageInfoCurrent.copy();
                c18da.getClass();
                C18DA.LJFF(pageInfoCopy, "crash", true);
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = LIZ;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
