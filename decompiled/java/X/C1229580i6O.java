package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i6O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229580i6O {
    public final List<InterfaceC1891350zJl> LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1229580i6O)) {
            return false;
        }
        C1229580i6O c1229580i6O = (C1229580i6O) obj;
        return Intrinsics.LJFF(this.LIZ, c1229580i6O.LIZ) && this.LIZIZ == c1229580i6O.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1229580i6O.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1229580i6O(List<? extends InterfaceC1891350zJl> list, boolean z, String str) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = str;
    }

    public static C1229580i6O LIZ(C1229580i6O c1229580i6O, List list, int i) {
        boolean z;
        String str;
        if ((i & 1) != 0) {
            list = c1229580i6O.LIZ;
        }
        if ((i & 2) != 0) {
            z = c1229580i6O.LIZIZ;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            str = c1229580i6O.LIZJ;
        } else {
            str = null;
        }
        c1229580i6O.getClass();
        return new C1229580i6O(list, z, str);
    }
}
