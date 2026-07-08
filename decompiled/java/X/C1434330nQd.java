package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0nQd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434330nQd extends RuntimeException {
    public static final C1434340nQe Companion = new C1434340nQe();
    public static final Integer[] USER_NETWORK_BAD_CODES = {-5, -110, 120000};
    public final C1431630nMH LL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1434330nQd() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1434330nQd(C1431630nMH c1431630nMH) {
        this(c1431630nMH, null, 2, 0 == true ? 1 : 0);
    }

    public static final boolean isUserNetworkBad(int i) {
        Companion.getClass();
        return C1434340nQe.LIZ(i);
    }

    public final long getErrorCode() {
        C1431630nMH c1431630nMH = this.LL;
        if (c1431630nMH != null) {
            return c1431630nMH.LJFF;
        }
        return 0L;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadException(mInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1434330nQd(C1431630nMH c1431630nMH, Throwable th) {
        super(th);
        this.LL = c1431630nMH;
    }

    public /* synthetic */ C1434330nQd(C1431630nMH c1431630nMH, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c1431630nMH, (i & 2) != 0 ? null : th);
    }
}
