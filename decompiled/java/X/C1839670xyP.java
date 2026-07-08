package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;

/* JADX INFO: renamed from: X.0xyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839670xyP {
    public static C1839660xyO LIZ(ExceptionResult exceptionResult) {
        int errorCode = exceptionResult.getErrorCode();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(exceptionResult.getLogId());
        sbLIZ.append(' ');
        sbLIZ.append(exceptionResult.getMsg());
        return new C1839660xyO(errorCode, C2188811AlT.LIZIZ(sbLIZ));
    }
}
