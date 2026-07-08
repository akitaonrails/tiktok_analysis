package X;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0MKB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MKB extends RuntimeException {
    public static final int $stable = 8;
    public final List<String> LL;

    public final List<String> getSourcePaths() {
        return this.LL;
    }

    public C0MKB(String str, Throwable th, List<String> list) {
        super(str, th);
        this.LL = list;
    }

    public C0MKB(String str, Throwable th, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
