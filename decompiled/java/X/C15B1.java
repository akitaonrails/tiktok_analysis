package X;

import java.util.List;

/* JADX INFO: renamed from: X.15B1, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15B1 {
    public final List<C15AK<?>> LIZ;
    public final boolean LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C15B1(List<? extends C15AK<?>> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }
}
