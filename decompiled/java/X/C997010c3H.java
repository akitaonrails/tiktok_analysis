package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c3H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997010c3H extends AbstractC996990c3F {
    public final String LIZIZ;

    public C997010c3H() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C997010c3H) && Intrinsics.LJFF(this.LIZIZ, ((C997010c3H) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataLoadFail(failedDetailReasonCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C997010c3H(String str) {
        super("data_load_fail");
        this.LIZIZ = str;
    }

    public /* synthetic */ C997010c3H(int i) {
        this("");
    }
}
