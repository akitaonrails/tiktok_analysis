package X;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08pz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2239308pz extends CancellationException {
    public final transient C09AE job;

    /* JADX INFO: renamed from: createCopy, reason: merged with bridge method [inline-methods] */
    public C2239308pz m11createCopy() {
        return null;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        int iHashCode = ((getMessage().hashCode() * 31) + this.job.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        sbLIZ.append("; job=");
        sbLIZ.append(this.job);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C2239308pz) {
                C2239308pz c2239308pz = (C2239308pz) obj;
                if (Intrinsics.LJFF(c2239308pz.getMessage(), getMessage()) && Intrinsics.LJFF(c2239308pz.job, this.job) && Intrinsics.LJFF(c2239308pz.getCause(), getCause())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public C2239308pz(String str, Throwable th, C09AE c09ae) {
        super(str);
        this.job = c09ae;
        if (th != null) {
            initCause(th);
        }
    }
}
