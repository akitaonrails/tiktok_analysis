package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563600M8o {
    public final List<C563580M8m> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C563600M8o) && Intrinsics.LJFF(this.LIZ, ((C563600M8o) obj).LIZ);
    }

    public C563600M8o(List<C563580M8m> list) {
        this.LIZ = list;
    }
}
