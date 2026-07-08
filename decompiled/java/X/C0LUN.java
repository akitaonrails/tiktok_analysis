package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0LUN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0LUN extends C0LU8 {
    public final String LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public final int getErrorCode() {
        return this.LLILLJJLI;
    }

    public final String getErrorMsg() {
        return this.LLILLL;
    }

    public final String getErrorSource() {
        return this.LLILZ;
    }

    public final String getFailReasonMsg() {
        return this.LLILZIL;
    }

    public final String getStep() {
        return this.LL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0LUN(String str, int i, String str2, String str3, String str4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Task failed at step ");
        sbLIZ.append(str);
        sbLIZ.append(" errorCode=");
        sbLIZ.append(i);
        sbLIZ.append(" msg=");
        sbLIZ.append(str2);
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        final DefaultConstructorMarker defaultConstructorMarker = null;
        new Exception(strLIZIZ, defaultConstructorMarker) { // from class: X.0LU8
        };
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }
}
