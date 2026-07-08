package X;

import java.util.ArrayList;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0V2W, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V2W {
    public final StackTraceElement[] LIZ;

    public C0V2W(StackTraceElement[] stackTraceElementArr) {
        this.LIZ = stackTraceElementArr;
    }

    public static List<String> LIZ(C0V2W[] c0v2wArr) {
        StackTraceElement[] stackTraceElementArr;
        String string;
        ArrayList arrayList = new ArrayList();
        if (c0v2wArr != null && c0v2wArr.length > 0) {
            for (C0V2W c0v2w : c0v2wArr) {
                if (c0v2w != null && (stackTraceElementArr = c0v2w.LIZ) != null && stackTraceElementArr.length > 0) {
                    if (stackTraceElementArr.length <= 0) {
                        string = "";
                    } else {
                        StringBuilder sb = new StringBuilder(stackTraceElementArr.length * 30);
                        for (int i = 0; i < stackTraceElementArr.length && i <= 40; i++) {
                            if (i == 0) {
                                "getThreadStackTrace".equals(stackTraceElementArr[0].getMethodName());
                            } else if (i == 1) {
                                if ("getStackTrace".equals(stackTraceElementArr[1].getMethodName())) {
                                }
                            } else if (i > 3) {
                                sb.append("\tat ");
                                sb.append(stackTraceElementArr[i].getClassName());
                                sb.append(e3.d);
                                sb.append(stackTraceElementArr[i].getMethodName());
                                sb.append(e3.h);
                                sb.append(stackTraceElementArr[i].getFileName());
                                sb.append(":");
                                sb.append(stackTraceElementArr[i].getLineNumber());
                                sb.append(")\n");
                            }
                        }
                        string = sb.toString();
                    }
                    arrayList.add(string);
                }
            }
        }
        return arrayList;
    }
}
