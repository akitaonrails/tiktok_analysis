package X;

import java.util.List;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0nJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429980nJc<T> {
    public final EnumC1429920nJW LIZ;
    public final T LIZIZ;
    public final List<C07YC> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataNode ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(": data: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extra: ");
        List<C07YC> list = this.LIZJ;
        sbLIZ.append(list != null ? C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(288), 31) : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1429980nJc(EnumC1429920nJW enumC1429920nJW, T t, List<? extends C07YC> list) {
        this.LIZ = enumC1429920nJW;
        this.LIZIZ = t;
        this.LIZJ = list;
    }
}
