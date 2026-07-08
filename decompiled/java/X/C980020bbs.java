package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bbs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C980020bbs {
    public final List<C1672250tcN> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C980020bbs) && Intrinsics.LJFF(this.LIZ, ((C980020bbs) obj).LIZ);
    }

    public C980020bbs(List<C1672250tcN> list) {
        this.LIZ = list;
    }
}
