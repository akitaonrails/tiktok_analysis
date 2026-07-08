package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342190DbF<T> extends C0DVK<T> {
    public final Throwable LIZIZ;
    public final T LIZJ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C13LE.LIZ(this.LIZIZ.getClass()), this.LIZIZ.getMessage(), C13LQ.LJJIFFI(this.LIZIZ.getStackTrace())});
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fail(error=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C342190DbF(Throwable th) {
        this(null, th);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C342190DbF)) {
            return false;
        }
        Throwable th = ((C342190DbF) obj).LIZIZ;
        if (this.LIZIZ.getClass() != th.getClass() || !Intrinsics.LJFF(this.LIZIZ.getMessage(), th.getMessage()) || !Intrinsics.LJFF(C13LQ.LJJIFFI(this.LIZIZ.getStackTrace()), C13LQ.LJJIFFI(th.getStackTrace()))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C342190DbF(Object obj, Throwable th) {
        super(obj);
        this.LIZIZ = th;
        this.LIZJ = obj;
    }
}
