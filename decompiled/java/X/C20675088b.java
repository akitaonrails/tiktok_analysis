package X;

/* JADX INFO: renamed from: X.088b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20675088b extends AbstractC20698088y {
    public static boolean LIZ;

    @Override // X.AnonymousClass0894
    public final String LIZIZ() {
        return "ActivityTrimMemoryExceptionPlugin";
    }

    @Override // X.AbstractC20698088y
    public final boolean LJFF() {
        return true;
    }

    @Override // X.AnonymousClass0897
    public final boolean LIZ(Thread thread, Throwable th) {
        if (th instanceof ArrayIndexOutOfBoundsException) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if ("android.app.ActivityThread".equals(stackTraceElement.getClassName()) && "handleTrimMemory".equals(stackTraceElement.getMethodName())) {
                    LIZ = true;
                    return true;
                }
            }
        }
        return false;
    }
}
