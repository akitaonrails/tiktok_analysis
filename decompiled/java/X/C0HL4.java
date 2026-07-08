package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HL4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HL4 {
    public final C439610HLr LIZ;
    public final List<C439610HLr> LIZIZ;

    public C0HL4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HL4)) {
            return false;
        }
        C0HL4 c0hl4 = (C0HL4) obj;
        return Intrinsics.LJFF(this.LIZ, c0hl4.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0hl4.LIZIZ);
    }

    public /* synthetic */ C0HL4(int i) {
        this(null, new ArrayList());
    }

    public C0HL4(C439610HLr c439610HLr, List<C439610HLr> list) {
        this.LIZ = c439610HLr;
        this.LIZIZ = list;
    }
}
