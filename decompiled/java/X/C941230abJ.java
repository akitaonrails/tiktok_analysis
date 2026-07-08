package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0abJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941230abJ {
    public final List<C941240abK> LIZ;

    public C941230abJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C941230abJ) && Intrinsics.LJFF(this.LIZ, ((C941230abJ) obj).LIZ);
    }

    public /* synthetic */ C941230abJ(int i) {
        this(new ArrayList());
    }

    public C941230abJ(List<C941240abK> list) {
        this.LIZ = list;
    }
}
