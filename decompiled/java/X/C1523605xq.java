package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05xq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1523605xq {
    public final List<String> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1523605xq) && Intrinsics.LJFF(this.LIZ, ((C1523605xq) obj).LIZ);
    }

    public C1523605xq(List<String> list) {
        this.LIZ = list;
    }
}
