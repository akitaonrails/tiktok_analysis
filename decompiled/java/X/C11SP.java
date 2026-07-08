package X;

/* JADX INFO: renamed from: X.11SP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11SP {
    public static void LIZ(Throwable th) throws Throwable {
        if (!(th instanceof VirtualMachineError) && !(th instanceof ThreadDeath) && !(th instanceof LinkageError)) {
        } else {
            throw th;
        }
    }
}
