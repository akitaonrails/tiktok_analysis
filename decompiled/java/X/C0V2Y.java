package X;

import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0V2Y, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V2Y {
    public final String LIZ;

    public C0V2Y(StackTraceElement[] stackTraceElementArr) {
        System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append("  at ");
            sb.append(stackTraceElement.getClassName());
            sb.append(e3.d);
            sb.append(stackTraceElement.getMethodName());
            sb.append(e3.h);
            sb.append(stackTraceElement.getFileName());
            sb.append(":");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(")\n");
        }
        this.LIZ = sb.toString();
    }
}
